package wyj.grab_data.yf_531;
/*
 * @author WYJ
 * @data 2020/12/2 12:27
 * 概述：
 *       XXXXXX
 *
 */

import com.mybatisplus.excel.ExcelData;
import com.mybatisplus.xsbb531.entity.Hcdb_result;
import com.mybatisplus.xsbb531.entity.Xslxbb_cg;
import com.mybatisplus.xsbb531.mapper.Hcdb_resultMapper;
import com.mybatisplus.xsbb531.mapper.Wl_531Mapper;
import com.mybatisplus.xsbb531.mapper.Xsbb_531Mapper;
import com.mybatisplus.xsbb531.mapper.Xslxbb_cgMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import wyj.grab_data.utils.ExportExcelUtils;

import javax.swing.filechooser.FileSystemView;
import java.io.File;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DataOperate531 {

    @Autowired
    Xsbb_531Mapper xsbb_531Mapper;
    @Autowired
    Xslxbb_cgMapper xslxbb_cgMapper;
    @Autowired
    Wl_531Mapper wl_531Mapper;
    @Autowired
    Hcdb_resultMapper hcdb_resultMapper;

//    @Test
//    public void initialize(){
//
//        //客户
//        List<String> khList = new ArrayList<>();
//        khList.add("合肥亿帆生物医药有限公司");
//        khList.add("四川信和医药有限公司");
//        khList.add("四川凯京制药有限公司");
//        khList.add("四川德峰药业有限公司");
//        khList.add("天长亿帆制药有限公司");
//        khList.add("宿州亿帆药业有限公司");
//        khList.add("辽宁亿帆药业有限公司");

//        khList.add("'合肥亿帆生物医药有限公司',");
//        khList.add("'四川信和医药有限公司',");
//        khList.add("'四川凯京制药有限公司',");
//        khList.add("'四川德峰药业有限公司',");
//        khList.add("'天长亿帆制药有限公司',");
//        khList.add("'宿州亿帆药业有限公司',");
//        khList.add("'辽宁亿帆药业有限公司'");
//
//        //物料
//        List<String> wlList = new ArrayList<>();
//
//        //生产厂家
//        List<String> sccjList = new ArrayList<>();
//
//    }

    @Test
    public void operate(){
        //客户
        List<String> khList = new ArrayList<>();
        khList.add("合肥亿帆生物医药有限公司");
        khList.add("四川凯京制药有限公司");
        khList.add("四川信和医药有限公司");
        khList.add("四川德峰药业有限公司");
        khList.add("宿州亿帆药业有限公司");
        khList.add("天长亿帆制药有限公司");
        khList.add("辽宁亿帆药业有限公司");

        //物料
        List<String> allwlname = wl_531Mapper.selectAllwlname();

        //生产厂家
        List<String> sccjList = xsbb_531Mapper.selectAllsccj();



        //结果入库
        for(int k = 0; k<khList.size();k++){
            //531
            int counts = xsbb_531Mapper.counts(khList.get(k));
            List<Map<Object,Object>> xsbb_531s = xsbb_531Mapper.querySfslAndJshj(khList.get(k));

            //销售流向
            int count = xslxbb_cgMapper.counts(khList.get(k),khList,allwlname,sccjList);
            List<Map<Object,Object>> xslxbb_cgss = xslxbb_cgMapper.querySlAndZkhsje(khList.get(k),khList,allwlname,sccjList);

            Hcdb_result hcdb_result = new Hcdb_result();
            hcdb_result.set自增主键(k+1);
            hcdb_result.set销售组织531(khList.get(k));
            hcdb_result.set销售组织销售流向(khList.get(k));
            hcdb_result.set销售组织差值(khList.get(k));

            if(counts == 0){
                hcdb_result.set数量531("0.00");
                hcdb_result.set金额531("0.00");
                hcdb_result.set数量销售流向("0.00");
                hcdb_result.set金额销售流向("0.00");
                hcdb_result.set数量差值("0.00");
                hcdb_result.set金额差值("0.00");
            } else {
                BigDecimal bd1 = new BigDecimal((Double) xsbb_531s.get(0).get("SUM(`实发主数量`)")).setScale(2, BigDecimal.ROUND_HALF_UP);
                BigDecimal bd2 = new BigDecimal((Double) xslxbb_cgss.get(0).get("SUM(`数量`)")).setScale(2, BigDecimal.ROUND_HALF_UP);
                BigDecimal sl_cz = BigDecimal.valueOf(bd1.subtract(bd2).doubleValue()).setScale(2, BigDecimal.ROUND_HALF_UP);

                hcdb_result.set数量531(bd1.toPlainString());
                hcdb_result.set数量销售流向(bd2.toPlainString());
                hcdb_result.set数量差值(sl_cz.toPlainString());

                BigDecimal bd3 = new BigDecimal((Double) xsbb_531s.get(0).get("SUM(`价税合计`)")).setScale(2, BigDecimal.ROUND_HALF_UP);
                BigDecimal bd4 = new BigDecimal((Double) xslxbb_cgss.get(0).get("SUM(`折扣后含税金额`)")).setScale(2, BigDecimal.ROUND_HALF_UP);
                BigDecimal je_cz = BigDecimal.valueOf(bd3.subtract(bd4).doubleValue()).setScale(2, BigDecimal.ROUND_HALF_UP);

                hcdb_result.set金额531(bd3.toPlainString());
                hcdb_result.set金额销售流向(bd4.toPlainString());
                hcdb_result.set金额差值(je_cz.toPlainString());

            }

            hcdb_resultMapper.updateResult(hcdb_result);

        }


        //531销售报表处理结果集
        System.out.println("********************************************************************************************");
        System.out.println("531销售报表");
        for(int j = 0;j<khList.size();j++){
            int counts = xsbb_531Mapper.counts(khList.get(j));
            List<Map<Object,Object>> xsbb_531s = xsbb_531Mapper.querySfslAndJshj(khList.get(j));
            if(counts == 0){
                System.out.println(khList.get(j)+"(0): 实发主数量:0.0   价税合计:0.00");
            }else {
                System.out.println(khList.get(j)+"("+counts+")"+": 数量: "+xsbb_531s.get(0).get("SUM(`实发主数量`)")+"  价税合计: "+new BigDecimal(xsbb_531s.get(0).get("SUM(`价税合计`)").toString()).setScale(2, BigDecimal.ROUND_HALF_UP).toPlainString());
            }
        }
        //销售流向报表--采购处理结果集
        System.out.println("********************************************************************************************");
        System.out.println("销售流向报表--采购");
        for (int i =0;i<khList.size();i++){
            List<Xslxbb_cg> xslxbb_cgs = xslxbb_cgMapper.queryBykhOrwlOrsccj(khList.get(i),khList,allwlname,sccjList);
            List<Map<Object,Object>> xslxbb_cgss = xslxbb_cgMapper.querySlAndZkhsje(khList.get(i),khList,allwlname,sccjList);

            if(xslxbb_cgs.size()==0){
                System.out.println(khList.get(i)+"(0): 数量: 0.0  折扣后含税金额: 0.00");
            }else {
                System.out.println(khList.get(i)+"("+xslxbb_cgs.size()+")"+": 数量: "+xslxbb_cgss.get(0).get("SUM(`数量`)")+"  折扣后含税金额: "+new BigDecimal(xslxbb_cgss.get(0).get("SUM(`折扣后含税金额`)").toString()).setScale(2, BigDecimal.ROUND_HALF_UP));
            }
        }
        System.out.println("********************************************************************************************");

        /*
        List<Xslxbb_cg> xslxbb_cgs_0 = xslxbb_cgMapper.queryBykhOrwlOrsccj(khList.get(0),khList,allwlname,sccjList);
        List<Map<Object,Object>> xslxbb_cgss_0 = xslxbb_cgMapper.querySlAndZkhsje(khList.get(0),khList,allwlname,sccjList);
        System.out.println("销售流向报表--采购");
        System.out.println(khList.get(0)+": 数量: "+xslxbb_cgss_0.get(0).get("SUM(`数量`)")+"  折扣后含税金额: "+new BigDecimal(xslxbb_cgss_0.get(0).get("SUM(`折扣后含税金额`)").toString()).setScale(2, BigDecimal.ROUND_HALF_UP).toPlainString());

        List<Xslxbb_cg> xslxbb_cgs_1 = xslxbb_cgMapper.queryBykhOrwlOrsccj(khList.get(1),khList,allwlname,sccjList);
        List<Map<Object,Object>> xslxbb_cgss_1 = xslxbb_cgMapper.querySlAndZkhsje(khList.get(1),khList,allwlname,sccjList);
        System.out.println(khList.get(1)+": 数量: "+xslxbb_cgss_1.get(0).get("SUM(`数量`)")+"  折扣后含税金额: "+new BigDecimal(xslxbb_cgss_1.get(0).get("SUM(`折扣后含税金额`)").toString()).setScale(2, BigDecimal.ROUND_HALF_UP).toPlainString());

        List<Xslxbb_cg> xslxbb_cgs_2 = xslxbb_cgMapper.queryBykhOrwlOrsccj(khList.get(2),khList,allwlname,sccjList);
        List<Map<Object,Object>> xslxbb_cgss_2 = xslxbb_cgMapper.querySlAndZkhsje(khList.get(2),khList,allwlname,sccjList);
        System.out.println(khList.get(2)+": 数量: "+xslxbb_cgss_2.get(0).get("SUM(`数量`)")+"  折扣后含税金额: "+new BigDecimal(xslxbb_cgss_2.get(0).get("SUM(`折扣后含税金额`)").toString()).setScale(2, BigDecimal.ROUND_HALF_UP).toPlainString());


        List<Xslxbb_cg> xslxbb_cgs_3 = xslxbb_cgMapper.queryBykhOrwlOrsccj(khList.get(3),khList,allwlname,sccjList);
        List<Map<Object,Object>> xslxbb_cgss_3 = xslxbb_cgMapper.querySlAndZkhsje(khList.get(3),khList,allwlname,sccjList);
        System.out.println(khList.get(3)+": 数量: "+xslxbb_cgss_3.get(0).get("SUM(`数量`)")+"  折扣后含税金额: "+new BigDecimal(xslxbb_cgss_3.get(0).get("SUM(`折扣后含税金额`)").toString()).setScale(2, BigDecimal.ROUND_HALF_UP).toPlainString());

        List<Xslxbb_cg> xslxbb_cgs_4 = xslxbb_cgMapper.queryBykhOrwlOrsccj(khList.get(4),khList,allwlname,sccjList);
        List<Map<Object,Object>> xslxbb_cgss_4 = xslxbb_cgMapper.querySlAndZkhsje(khList.get(4),khList,allwlname,sccjList);
        System.out.println(khList.get(4)+": 数量: "+xslxbb_cgss_4.get(0).get("SUM(`数量`)")+"  折扣后含税金额: "+new BigDecimal(xslxbb_cgss_4.get(0).get("SUM(`折扣后含税金额`)").toString()).setScale(2, BigDecimal.ROUND_HALF_UP).toPlainString());

        List<Xslxbb_cg> xslxbb_cgs_5 = xslxbb_cgMapper.queryBykhOrwlOrsccj(khList.get(5),khList,allwlname,sccjList);
        List<Map<Object,Object>> xslxbb_cgss_5 = xslxbb_cgMapper.querySlAndZkhsje(khList.get(5),khList,allwlname,sccjList);
        System.out.println(khList.get(5)+": 数量: "+xslxbb_cgss_1.get(0).get("SUM(`数量`)")+"  折扣后含税金额: "+new BigDecimal(xslxbb_cgss_5.get(0).get("SUM(`折扣后含税金额`)").toString()).setScale(2, BigDecimal.ROUND_HALF_UP).toPlainString());

        List<Xslxbb_cg> xslxbb_cgs_6 = xslxbb_cgMapper.queryBykhOrwlOrsccj(khList.get(6),khList,allwlname,sccjList);
        List<Map<Object,Object>> xslxbb_cgss_6 = xslxbb_cgMapper.querySlAndZkhsje(khList.get(6),khList,allwlname,sccjList);
        System.out.println(khList.get(6)+": 数量: "+xslxbb_cgss_6.get(0).get("SUM(`数量`)")+"  折扣后含税金额: "+new BigDecimal(xslxbb_cgss_6.get(0).get("SUM(`折扣后含税金额`)").toString()).setScale(2, BigDecimal.ROUND_HALF_UP).toPlainString());
        */

        /*
        String kh = "";
        String khNew = "";
        for(int i = 0 ;i<khList.size();i++){
            kh = khList.get(i).toString();
            khNew =khNew + kh;
        }


        String tymc = "";
        String tymcNew = "";
        //物料
        List<String> allwlname = wl_531Mapper.selectAllwlname();

        for(int j = 0;j<allwlname.size();j++){
            tymc ="'" + allwlname.get(j).toString() + "',";
            tymcNew = tymcNew + tymc;
        }
        tymcNew = tymcNew.substring(0,tymcNew.length()-1);

        String sccj = "";
        String sccjNew = "";
        //生产厂家
        List<String> sccjList = xsbb_531Mapper.selectAllsccj();

        for(int k = 0;k<sccjList.size();k++){
            sccj ="'" + sccjList.get(k).toString() + "',";
            sccjNew = sccjNew + sccj;
        }
        sccjNew = sccjNew.substring(0,sccjNew.length()-1);

        List<Xslxbb_cg> xslxbb_cgs = xslxbb_cgMapper.queryBykhOrwlOrsccj(khNew,tymcNew,sccjNew);
        */
    }


    @Test
    public void exportExcel() throws Exception {
        //获取当前用户桌面路径
        FileSystemView fsv = FileSystemView.getFileSystemView();
        File desktop =fsv.getHomeDirectory();

        //获取当前系统时间
        Date date=new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String path = desktop.toString()+"/核查对比文件-"+sdf.format(new Date())+".xlsx";

        ExcelData data = new ExcelData();
        data.setName("核对文件");
        List<String> titles = new ArrayList<String>();
        titles.add("销售组织");
        titles.add("数量(531销售报表)");
        titles.add("金额(531销售报表)");
        titles.add("数量(销售流向报表)");
        titles.add("金额(销售流向报表)");
        titles.add("数量(差值)");
        titles.add("金额(差值)");
        data.setTitles(titles);

        List<List<Object>> rows = new ArrayList<List<Object>>();

        ArrayList<Hcdb_result> test = (ArrayList<Hcdb_result>) hcdb_resultMapper.selectList(null);

        for(Hcdb_result midd :test) {
            List<Object> row = new ArrayList<Object>();
            row.add(midd.get销售组织531());
            row.add(midd.get数量531());
            row.add(midd.get金额531());
            row.add(midd.get数量销售流向());
            row.add(midd.get金额销售流向());
            row.add(midd.get数量差值());
            row.add(midd.get金额差值());
            rows.add(row);
        }
        data.setRows(rows);

        ExportExcelUtils.generateExcel(data,path);
    }


}
