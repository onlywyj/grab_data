package wyj.grab_data.baidumap;/*
 * @author WYJ
 * @data 2020/11/25 14:40
 * 概述：
 *       百度地图API调用，通过查询地址获取省市
 *
 */


import com.mybatisplus.baidumap.entity.Address;
import com.mybatisplus.baidumap.mapper.AddressMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import wyj.grab_data.utils.HttpClientUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BaiduMapRE {


    @Autowired
    private AddressMapper addressMapper;


    //开发者账号申请的KEY
    static String key = "ylitFOZXvf6rY5nCPm73DVFKOKo9XMFZ";


    @Test
    public void Baidu() {

        Map<String, String> params = new HashMap<String, String>();
        List<Object> list = new ArrayList<Object>();

        List<Address> addressList  = addressMapper.selectList(null);
        for(int i = 0 ; i>=addressList.size();i++){

            String address = addressList.get(i).getAddress().toString();
            String originDouble = HttpClientUtil.doGet(
                    "http://api.map.baidu.com/geocoder?output=json&key="+key+"&address="+address);
            com.alibaba.fastjson.JSONObject jsonObjectOri = com.alibaba.fastjson.JSONObject.parseObject(originDouble);
            String status = jsonObjectOri.getString("status");
            if (status == "OK" || "OK".equals(status)) {// 解析的地址不为空时 进行值的获取
                String oriLng = jsonObjectOri.getJSONObject("result").getJSONObject("location").getString("lng");// 经度值
                String oriLat = jsonObjectOri.getJSONObject("result").getJSONObject("location").getString("lat");// 纬度值
                String location = oriLat + "," + oriLng;
                String result = HttpClientUtil.doGet(
                        "http://api.map.baidu.com/geocoder?key="+key+"&output=json&coordtype=wgs84ll&location="
                                + location);
                com.alibaba.fastjson.JSONObject jsonObjectAdds = com.alibaba.fastjson.JSONObject.parseObject(result);
                String province = jsonObjectAdds.getJSONObject("result").getJSONObject("addressComponent")
                        .getString("province");// 省
                String city = jsonObjectAdds.getJSONObject("result").getJSONObject("addressComponent").getString("city");// 市

            }
        }
    }

    @Test
    public void test(){
        String address = "蜀山区合肥亿帆生物医药有限公司";
        String originDouble = HttpClientUtil.doGet(
                "http://api.map.baidu.com/geocoder?output=json&key="+key+"&address="+address);
        com.alibaba.fastjson.JSONObject jsonObjectOri = com.alibaba.fastjson.JSONObject.parseObject(originDouble);
        String status = jsonObjectOri.getString("status");
        if (status == "OK" || "OK".equals(status)) {// 解析的地址不为空时 进行值的获取
            String oriLng = jsonObjectOri.getJSONObject("result").getJSONObject("location").getString("lng");// 经度值
            String oriLat = jsonObjectOri.getJSONObject("result").getJSONObject("location").getString("lat");// 纬度值
            String location = oriLat + "," + oriLng;
            String result = HttpClientUtil.doGet(
                    "http://api.map.baidu.com/geocoder?key=ylitFOZXvf6rY5nCPm73DVFKOKo9XMFZ&output=json&coordtype=wgs84ll&location="
                            + location);
            com.alibaba.fastjson.JSONObject jsonObjectAdds = com.alibaba.fastjson.JSONObject.parseObject(result);
            String province = jsonObjectAdds.getJSONObject("result").getJSONObject("addressComponent")
                    .getString("province");// 省
            String city = jsonObjectAdds.getJSONObject("result").getJSONObject("addressComponent").getString("city");// 市

            System.out.println("province:" + province);
            System.out.println("city:" + city);
        }
    }
}
