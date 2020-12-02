package com.mybatisplus.baidumap.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author WYJ
 * @since 2020-12-01
 */
@TableName("baidumap_address")
public class Address implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 待处理地址
     */
    private String address;

    /**
     * 查询的结果
     */
    private String result;

    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 可扩展字段1
     */
    private String exp1;

    /**
     * 可扩展字段2
     */
    private String exp2;

    /**
     * 可扩展字段3
     */
    private String exp3;

    /**
     * 状态码 0 正常，1 异常 
     */
    private Integer status;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public String getExp1() {
        return exp1;
    }

    public void setExp1(String exp1) {
        this.exp1 = exp1;
    }
    public String getExp2() {
        return exp2;
    }

    public void setExp2(String exp2) {
        this.exp2 = exp2;
    }
    public String getExp3() {
        return exp3;
    }

    public void setExp3(String exp3) {
        this.exp3 = exp3;
    }
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Address{" +
            "address=" + address +
            ", result=" + result +
            ", province=" + province +
            ", city=" + city +
            ", exp1=" + exp1 +
            ", exp2=" + exp2 +
            ", exp3=" + exp3 +
            ", status=" + status +
        "}";
    }
}
