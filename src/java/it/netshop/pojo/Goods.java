/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.netshop.pojo;

import java.util.Date;



/**
 *
 * @author Administrator
 */
public class Goods {
    private int gid;
    private String gname;
    private Float gprice;
    private String gpic;
    private String gremark;
    private String gxremark;
    private Date gdate;
    private boolean giscommend;
    private boolean gisopen;
    private int cid;

    /**
     * @return the gid
     */
    public int getGid() {
        return gid;
    }

    /**
     * @param gid the gid to set
     */
    public void setGid(int gid) {
        this.gid = gid;
    }

    /**
     * @return the gname
     */
    public String getGname() {
        return gname;
    }

    /**
     * @param gname the gname to set
     */
    public void setGname(String gname) {
        this.gname = gname;
    }

    /**
     * @return the gprice
     */
    public Float getGprice() {
        return gprice;
    }

    /**
     * @param gprice the gprice to set
     */
    public void setGprice(Float gprice) {
        this.gprice = gprice;
    }

    /**
     * @return the gpic
     */
    public String getGpic() {
        return gpic;
    }

    /**
     * @param gpic the gpic to set
     */
    public void setGpic(String gpic) {
        this.gpic = gpic;
    }

    /**
     * @return the gremark
     */
    public String getGremark() {
        return gremark;
    }

    /**
     * @param gremark the gremark to set
     */
    public void setGremark(String gremark) {
        this.gremark = gremark;
    }

    /**
     * @return the gxremark
     */
    public String getGxremark() {
        return gxremark;
    }

    /**
     * @param gxremark the gxremark to set
     */
    public void setGxremark(String gxremark) {
        this.gxremark = gxremark;
    }

    /**
     * @return the gdate
     */
    public Date getGdate() {
        return gdate;
    }

    /**
     * @param gdate the gdate to set
     */
    public void setGdate(Date gdate) {
        this.gdate = gdate;
    }

    /**
     * @return the giscommend
     */
    public boolean isGiscommend() {
        return giscommend;
    }

    /**
     * @param giscommend the giscommend to set
     */
    public void setGiscommend(boolean giscommend) {
        this.giscommend = giscommend;
    }

    /**
     * @return the gisopen
     */
    public boolean isGisopen() {
        return gisopen;
    }

    /**
     * @param gisopen the gisopen to set
     */
    public void setGisopen(boolean gisopen) {
        this.gisopen = gisopen;
    }

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
}
