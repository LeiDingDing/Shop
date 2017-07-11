/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.netshop.pojo;

/**
 *
 * @author Administrator
 */
public class Category {
    private int cid;
    private String ctype;
    private boolean chot;
    private int aid;

    /**
     * @return the cid
     */
    public int getCid() {
        return cid;
    }

    /**
     * @param cid the cid to set
     */
    public void setCid(int cid) {
        this.cid = cid;
    }

    /**
     * @return the ctype
     */
    public String getCtype() {
        return ctype;
    }

    /**
     * @param ctype the ctype to set
     */
    public void setCtype(String ctype) {
        this.ctype = ctype;
    }

    /**
     * @return the chot
     */
    public boolean isChot() {
        return chot;
    }

    /**
     * @param chot the chot to set
     */
    public void setChot(boolean chot) {
        this.chot = chot;
    }

    /**
     * @return the aid
     */
    public int getAid() {
        return aid;
    }

    /**
     * @param aid the aid to set
     */
    public void setAid(int aid) {
        this.aid = aid;
    }
}
