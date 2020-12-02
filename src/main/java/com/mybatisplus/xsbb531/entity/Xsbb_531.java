package com.mybatisplus.xsbb531.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author WYJ
 * @since 2020-12-02
 */
public class Xsbb_531 implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "自增主键", type = IdType.AUTO)
    private Integer 自增主键;

    private String 集团;

    private String 销售组织;

    private String 订单号;

    private String 订单日期;

    private String 订单客户编号;

    private String 订单客户;

    private String 省份;

    private String 非主导;

    private String 部门;

    private String 业务员;

    private String 仓库;

    private String 物料名称;

    private String 物料编码;

    private String 规格;

    private String 生产厂家;

    private String 批准文号;

    private String 剂型;

    private String 型号;

    private String TYPE;

    private String 产品批号;

    private String 批次号;

    private String 金税发票号;

    private String 发票代码;

    private String 付款方式;

    private Double 实发数量;

    private Double 实发主数量;

    private Double 单价;

    private Double 折扣额;

    private Double 金额;

    private Double 主含税单价;

    private Double 含税单价;

    private Double 价税合计;

    public Integer get自增主键() {
        return 自增主键;
    }

    public void set自增主键(Integer 自增主键) {
        this.自增主键 = 自增主键;
    }
    public String get集团() {
        return 集团;
    }

    public void set集团(String 集团) {
        this.集团 = 集团;
    }
    public String get销售组织() {
        return 销售组织;
    }

    public void set销售组织(String 销售组织) {
        this.销售组织 = 销售组织;
    }
    public String get订单号() {
        return 订单号;
    }

    public void set订单号(String 订单号) {
        this.订单号 = 订单号;
    }
    public String get订单日期() {
        return 订单日期;
    }

    public void set订单日期(String 订单日期) {
        this.订单日期 = 订单日期;
    }
    public String get订单客户编号() {
        return 订单客户编号;
    }

    public void set订单客户编号(String 订单客户编号) {
        this.订单客户编号 = 订单客户编号;
    }
    public String get订单客户() {
        return 订单客户;
    }

    public void set订单客户(String 订单客户) {
        this.订单客户 = 订单客户;
    }
    public String get省份() {
        return 省份;
    }

    public void set省份(String 省份) {
        this.省份 = 省份;
    }
    public String get非主导() {
        return 非主导;
    }

    public void set非主导(String 非主导) {
        this.非主导 = 非主导;
    }
    public String get部门() {
        return 部门;
    }

    public void set部门(String 部门) {
        this.部门 = 部门;
    }
    public String get业务员() {
        return 业务员;
    }

    public void set业务员(String 业务员) {
        this.业务员 = 业务员;
    }
    public String get仓库() {
        return 仓库;
    }

    public void set仓库(String 仓库) {
        this.仓库 = 仓库;
    }
    public String get物料名称() {
        return 物料名称;
    }

    public void set物料名称(String 物料名称) {
        this.物料名称 = 物料名称;
    }
    public String get物料编码() {
        return 物料编码;
    }

    public void set物料编码(String 物料编码) {
        this.物料编码 = 物料编码;
    }
    public String get规格() {
        return 规格;
    }

    public void set规格(String 规格) {
        this.规格 = 规格;
    }
    public String get生产厂家() {
        return 生产厂家;
    }

    public void set生产厂家(String 生产厂家) {
        this.生产厂家 = 生产厂家;
    }
    public String get批准文号() {
        return 批准文号;
    }

    public void set批准文号(String 批准文号) {
        this.批准文号 = 批准文号;
    }
    public String get剂型() {
        return 剂型;
    }

    public void set剂型(String 剂型) {
        this.剂型 = 剂型;
    }
    public String get型号() {
        return 型号;
    }

    public void set型号(String 型号) {
        this.型号 = 型号;
    }
    public String getTYPE() {
        return TYPE;
    }

    public void setTYPE(String TYPE) {
        this.TYPE = TYPE;
    }
    public String get产品批号() {
        return 产品批号;
    }

    public void set产品批号(String 产品批号) {
        this.产品批号 = 产品批号;
    }
    public String get批次号() {
        return 批次号;
    }

    public void set批次号(String 批次号) {
        this.批次号 = 批次号;
    }
    public String get金税发票号() {
        return 金税发票号;
    }

    public void set金税发票号(String 金税发票号) {
        this.金税发票号 = 金税发票号;
    }
    public String get发票代码() {
        return 发票代码;
    }

    public void set发票代码(String 发票代码) {
        this.发票代码 = 发票代码;
    }
    public String get付款方式() {
        return 付款方式;
    }

    public void set付款方式(String 付款方式) {
        this.付款方式 = 付款方式;
    }
    public Double get实发数量() {
        return 实发数量;
    }

    public void set实发数量(Double 实发数量) {
        this.实发数量 = 实发数量;
    }
    public Double get实发主数量() {
        return 实发主数量;
    }

    public void set实发主数量(Double 实发主数量) {
        this.实发主数量 = 实发主数量;
    }
    public Double get单价() {
        return 单价;
    }

    public void set单价(Double 单价) {
        this.单价 = 单价;
    }
    public Double get折扣额() {
        return 折扣额;
    }

    public void set折扣额(Double 折扣额) {
        this.折扣额 = 折扣额;
    }
    public Double get金额() {
        return 金额;
    }

    public void set金额(Double 金额) {
        this.金额 = 金额;
    }
    public Double get主含税单价() {
        return 主含税单价;
    }

    public void set主含税单价(Double 主含税单价) {
        this.主含税单价 = 主含税单价;
    }
    public Double get含税单价() {
        return 含税单价;
    }

    public void set含税单价(Double 含税单价) {
        this.含税单价 = 含税单价;
    }
    public Double get价税合计() {
        return 价税合计;
    }

    public void set价税合计(Double 价税合计) {
        this.价税合计 = 价税合计;
    }

    @Override
    public String toString() {
        return "Xsbb_531{" +
            "自增主键=" + 自增主键 +
            ", 集团=" + 集团 +
            ", 销售组织=" + 销售组织 +
            ", 订单号=" + 订单号 +
            ", 订单日期=" + 订单日期 +
            ", 订单客户编号=" + 订单客户编号 +
            ", 订单客户=" + 订单客户 +
            ", 省份=" + 省份 +
            ", 非主导=" + 非主导 +
            ", 部门=" + 部门 +
            ", 业务员=" + 业务员 +
            ", 仓库=" + 仓库 +
            ", 物料名称=" + 物料名称 +
            ", 物料编码=" + 物料编码 +
            ", 规格=" + 规格 +
            ", 生产厂家=" + 生产厂家 +
            ", 批准文号=" + 批准文号 +
            ", 剂型=" + 剂型 +
            ", 型号=" + 型号 +
            ", TYPE=" + TYPE +
            ", 产品批号=" + 产品批号 +
            ", 批次号=" + 批次号 +
            ", 金税发票号=" + 金税发票号 +
            ", 发票代码=" + 发票代码 +
            ", 付款方式=" + 付款方式 +
            ", 实发数量=" + 实发数量 +
            ", 实发主数量=" + 实发主数量 +
            ", 单价=" + 单价 +
            ", 折扣额=" + 折扣额 +
            ", 金额=" + 金额 +
            ", 主含税单价=" + 主含税单价 +
            ", 含税单价=" + 含税单价 +
            ", 价税合计=" + 价税合计 +
        "}";
    }
}
