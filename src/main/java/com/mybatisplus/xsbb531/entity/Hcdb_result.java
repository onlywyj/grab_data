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
 * @since 2020-12-03
 */
public class Hcdb_result implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "自增主键", type = IdType.AUTO)
    private Integer 自增主键;

    private String 销售组织531;

    private String 数量531;

    private String 金额531;

    private String 销售组织销售流向;

    private String 数量销售流向;

    private String 金额销售流向;

    private String 销售组织差值;

    private String 数量差值;

    private String 金额差值;

    private Integer 条数531;

    private Integer 条数销售流向;

    public Integer get自增主键() {
        return 自增主键;
    }

    public void set自增主键(Integer 自增主键) {
        this.自增主键 = 自增主键;
    }
    public String get销售组织531() {
        return 销售组织531;
    }

    public void set销售组织531(String 销售组织531) {
        this.销售组织531 = 销售组织531;
    }
    public String get数量531() {
        return 数量531;
    }

    public void set数量531(String 数量531) {
        this.数量531 = 数量531;
    }
    public String get金额531() {
        return 金额531;
    }

    public void set金额531(String 金额531) {
        this.金额531 = 金额531;
    }
    public String get销售组织销售流向() {
        return 销售组织销售流向;
    }

    public void set销售组织销售流向(String 销售组织销售流向) {
        this.销售组织销售流向 = 销售组织销售流向;
    }
    public String get数量销售流向() {
        return 数量销售流向;
    }

    public void set数量销售流向(String 数量销售流向) {
        this.数量销售流向 = 数量销售流向;
    }
    public String get金额销售流向() {
        return 金额销售流向;
    }

    public void set金额销售流向(String 金额销售流向) {
        this.金额销售流向 = 金额销售流向;
    }
    public String get销售组织差值() {
        return 销售组织差值;
    }

    public void set销售组织差值(String 销售组织差值) {
        this.销售组织差值 = 销售组织差值;
    }
    public String get数量差值() {
        return 数量差值;
    }

    public void set数量差值(String 数量差值) {
        this.数量差值 = 数量差值;
    }
    public String get金额差值() {
        return 金额差值;
    }

    public void set金额差值(String 金额差值) {
        this.金额差值 = 金额差值;
    }

    public Integer get条数531() { return 条数531; }

    public void set条数531(Integer 条数531) { this.条数531 = 条数531; }

    public Integer get条数销售流向() { return 条数销售流向; }

    public void set条数销售流向(Integer 条数销售流向) { this.条数销售流向 = 条数销售流向; }

    @Override
    public String toString() {
        return "Hcdb_result{" +
                "自增主键=" + 自增主键 +
                ", 销售组织531='" + 销售组织531 + '\'' +
                ", 数量531='" + 数量531 + '\'' +
                ", 金额531='" + 金额531 + '\'' +
                ", 销售组织销售流向='" + 销售组织销售流向 + '\'' +
                ", 数量销售流向='" + 数量销售流向 + '\'' +
                ", 金额销售流向='" + 金额销售流向 + '\'' +
                ", 销售组织差值='" + 销售组织差值 + '\'' +
                ", 数量差值='" + 数量差值 + '\'' +
                ", 金额差值='" + 金额差值 + '\'' +
                ", 条数531=" + 条数531 +
                ", 条数销售流向=" + 条数销售流向 +
                '}';
    }
}
