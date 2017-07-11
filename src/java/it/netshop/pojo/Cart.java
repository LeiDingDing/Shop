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
public class Cart {
    private int gid;
    private String gname;
    private Float gprice;
    private int gnum;
    private String ulogin;
    private String gpic;
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
     * @return the gnum
     */
    public int getGnum() {
        return gnum;
    }

    /**
     * @param gnum the gnum to set
     */
    public void setGnum(int gnum) {
        this.gnum = gnum;
    }

    /**
     * @return the ulogin
     */
    public String getUlogin() {
        return ulogin;
    }

    /**
     * @param ulogin the ulogin to set
     */
    public void setUlogin(String ulogin) {
        this.ulogin = ulogin;
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
}
