package com.grooveguang.bean;

import java.util.Date;

public class MallProductVersion {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mall_product_version.id
     *
     * @mbg.generated Tue Sep 12 20:59:26 CST 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mall_product_version.shp_id
     *
     * @mbg.generated Tue Sep 12 20:59:26 CST 2017
     */
    private Integer shpId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mall_product_version.shp_bb
     *
     * @mbg.generated Tue Sep 12 20:59:26 CST 2017
     */
    private String shpBb;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mall_product_version.shfqy
     *
     * @mbg.generated Tue Sep 12 20:59:26 CST 2017
     */
    private Integer shfqy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mall_product_version.chjshj
     *
     * @mbg.generated Tue Sep 12 20:59:26 CST 2017
     */
    private Date chjshj;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mall_product_version.id
     *
     * @return the value of t_mall_product_version.id
     *
     * @mbg.generated Tue Sep 12 20:59:26 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mall_product_version.id
     *
     * @param id the value for t_mall_product_version.id
     *
     * @mbg.generated Tue Sep 12 20:59:26 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mall_product_version.shp_id
     *
     * @return the value of t_mall_product_version.shp_id
     *
     * @mbg.generated Tue Sep 12 20:59:26 CST 2017
     */
    public Integer getShpId() {
        return shpId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mall_product_version.shp_id
     *
     * @param shpId the value for t_mall_product_version.shp_id
     *
     * @mbg.generated Tue Sep 12 20:59:26 CST 2017
     */
    public void setShpId(Integer shpId) {
        this.shpId = shpId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mall_product_version.shp_bb
     *
     * @return the value of t_mall_product_version.shp_bb
     *
     * @mbg.generated Tue Sep 12 20:59:26 CST 2017
     */
    public String getShpBb() {
        return shpBb;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mall_product_version.shp_bb
     *
     * @param shpBb the value for t_mall_product_version.shp_bb
     *
     * @mbg.generated Tue Sep 12 20:59:26 CST 2017
     */
    public void setShpBb(String shpBb) {
        this.shpBb = shpBb == null ? null : shpBb.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mall_product_version.shfqy
     *
     * @return the value of t_mall_product_version.shfqy
     *
     * @mbg.generated Tue Sep 12 20:59:26 CST 2017
     */
    public Integer getShfqy() {
        return shfqy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mall_product_version.shfqy
     *
     * @param shfqy the value for t_mall_product_version.shfqy
     *
     * @mbg.generated Tue Sep 12 20:59:26 CST 2017
     */
    public void setShfqy(Integer shfqy) {
        this.shfqy = shfqy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mall_product_version.chjshj
     *
     * @return the value of t_mall_product_version.chjshj
     *
     * @mbg.generated Tue Sep 12 20:59:26 CST 2017
     */
    public Date getChjshj() {
        return chjshj;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mall_product_version.chjshj
     *
     * @param chjshj the value for t_mall_product_version.chjshj
     *
     * @mbg.generated Tue Sep 12 20:59:26 CST 2017
     */
    public void setChjshj(Date chjshj) {
        this.chjshj = chjshj;
    }
}