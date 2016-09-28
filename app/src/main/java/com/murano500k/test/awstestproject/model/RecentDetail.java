
package com.murano500k.test.awstestproject.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RecentDetail {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("unit_number")
    @Expose
    private String unitNumber;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("bedroom")
    @Expose
    private Integer bedroom;
    @SerializedName("bath_full")
    @Expose
    private Integer bathFull;
    @SerializedName("living_area")
    @Expose
    private String livingArea;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("percent")
    @Expose
    private String percent;
    @SerializedName("status")
    @Expose
    private Integer status;

    /**
     * 
     * @return
     *     The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    public RecentDetail withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The unitNumber
     */
    public String getUnitNumber() {
        return unitNumber;
    }

    /**
     * 
     * @param unitNumber
     *     The unit_number
     */
    public void setUnitNumber(String unitNumber) {
        this.unitNumber = unitNumber;
    }

    public RecentDetail withUnitNumber(String unitNumber) {
        this.unitNumber = unitNumber;
        return this;
    }

    /**
     * 
     * @return
     *     The date
     */
    public String getDate() {
        return date;
    }

    /**
     * 
     * @param date
     *     The date
     */
    public void setDate(String date) {
        this.date = date;
    }

    public RecentDetail withDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * 
     * @return
     *     The bedroom
     */
    public Integer getBedroom() {
        return bedroom;
    }

    /**
     * 
     * @param bedroom
     *     The bedroom
     */
    public void setBedroom(Integer bedroom) {
        this.bedroom = bedroom;
    }

    public RecentDetail withBedroom(Integer bedroom) {
        this.bedroom = bedroom;
        return this;
    }

    /**
     * 
     * @return
     *     The bathFull
     */
    public Integer getBathFull() {
        return bathFull;
    }

    /**
     * 
     * @param bathFull
     *     The bath_full
     */
    public void setBathFull(Integer bathFull) {
        this.bathFull = bathFull;
    }

    public RecentDetail withBathFull(Integer bathFull) {
        this.bathFull = bathFull;
        return this;
    }

    /**
     * 
     * @return
     *     The livingArea
     */
    public String getLivingArea() {
        return livingArea;
    }

    /**
     * 
     * @param livingArea
     *     The living_area
     */
    public void setLivingArea(String livingArea) {
        this.livingArea = livingArea;
    }

    public RecentDetail withLivingArea(String livingArea) {
        this.livingArea = livingArea;
        return this;
    }

    /**
     * 
     * @return
     *     The price
     */
    public String getPrice() {
        return price;
    }

    /**
     * 
     * @param price
     *     The price
     */
    public void setPrice(String price) {
        this.price = price;
    }

    public RecentDetail withPrice(String price) {
        this.price = price;
        return this;
    }

    /**
     * 
     * @return
     *     The percent
     */
    public String getPercent() {
        return percent;
    }

    /**
     * 
     * @param percent
     *     The percent
     */
    public void setPercent(String percent) {
        this.percent = percent;
    }

    public RecentDetail withPercent(String percent) {
        this.percent = percent;
        return this;
    }

    /**
     * 
     * @return
     *     The status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    public RecentDetail withStatus(Integer status) {
        this.status = status;
        return this;
    }

}
