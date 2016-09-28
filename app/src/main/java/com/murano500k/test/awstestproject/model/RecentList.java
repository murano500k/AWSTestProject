
package com.murano500k.test.awstestproject.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RecentList {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("unit_number")
    @Expose
    private String unitNumber;
    @SerializedName("building_title")
    @Expose
    private String buildingTitle;
    @SerializedName("building_id")
    @Expose
    private Integer buildingId;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("date_year")
    @Expose
    private String dateYear;
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

    public RecentList withId(Integer id) {
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

    public RecentList withUnitNumber(String unitNumber) {
        this.unitNumber = unitNumber;
        return this;
    }

    /**
     * 
     * @return
     *     The buildingTitle
     */
    public String getBuildingTitle() {
        return buildingTitle;
    }

    /**
     * 
     * @param buildingTitle
     *     The building_title
     */
    public void setBuildingTitle(String buildingTitle) {
        this.buildingTitle = buildingTitle;
    }

    public RecentList withBuildingTitle(String buildingTitle) {
        this.buildingTitle = buildingTitle;
        return this;
    }

    /**
     * 
     * @return
     *     The buildingId
     */
    public Integer getBuildingId() {
        return buildingId;
    }

    /**
     * 
     * @param buildingId
     *     The building_id
     */
    public void setBuildingId(Integer buildingId) {
        this.buildingId = buildingId;
    }

    public RecentList withBuildingId(Integer buildingId) {
        this.buildingId = buildingId;
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

    public RecentList withDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * 
     * @return
     *     The dateYear
     */
    public String getDateYear() {
        return dateYear;
    }

    /**
     * 
     * @param dateYear
     *     The date_year
     */
    public void setDateYear(String dateYear) {
        this.dateYear = dateYear;
    }

    public RecentList withDateYear(String dateYear) {
        this.dateYear = dateYear;
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

    public RecentList withBedroom(Integer bedroom) {
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

    public RecentList withBathFull(Integer bathFull) {
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

    public RecentList withLivingArea(String livingArea) {
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

    public RecentList withPrice(String price) {
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

    public RecentList withPercent(String percent) {
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

    public RecentList withStatus(Integer status) {
        this.status = status;
        return this;
    }

}
