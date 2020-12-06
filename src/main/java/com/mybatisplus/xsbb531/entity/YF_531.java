package com.mybatisplus.xsbb531.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author WYJ
 * @since 2020-12-04
 */
public class YF_531 implements Serializable {

    private static final long serialVersionUID = 1L;

    private String CODE;

    private String TYPE;

    private String NAME;

    private String GG;

    private String CS;

    public String getCODE() {
        return CODE;
    }

    public void setCODE(String CODE) {
        this.CODE = CODE;
    }
    public String getTYPE() {
        return TYPE;
    }

    public void setTYPE(String TYPE) {
        this.TYPE = TYPE;
    }
    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }
    public String getGG() {
        return GG;
    }

    public void setGG(String GG) {
        this.GG = GG;
    }
    public String getCS() {
        return CS;
    }

    public void setCS(String CS) {
        this.CS = CS;
    }

    @Override
    public String toString() {
        return "YF_531{" +
            "CODE=" + CODE +
            ", TYPE=" + TYPE +
            ", NAME=" + NAME +
            ", GG=" + GG +
            ", CS=" + CS +
        "}";
    }
}
