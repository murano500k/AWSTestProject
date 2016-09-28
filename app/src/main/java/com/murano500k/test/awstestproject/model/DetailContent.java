
package com.murano500k.test.awstestproject.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


public class DetailContent {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("coordinate")
    @Expose
    private Coordinate coordinate;
    @SerializedName("recent")
    @Expose
    private List<RecentDetail> recentDetail = new ArrayList<RecentDetail>();
    @SerializedName("images")
    @Expose
    private List<Image> images = new ArrayList<Image>();
    @SerializedName("plans")
    @Expose
    private List<Plan> plans = new ArrayList<Plan>();
    @SerializedName("managers")
    @Expose
    private List<Manager> managers = new ArrayList<Manager>();
    @SerializedName("features")
    @Expose
    private List<Object> features = new ArrayList<Object>();
    @SerializedName("amenities")
    @Expose
    private List<Object> amenities = new ArrayList<Object>();

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

    public DetailContent withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    public DetailContent withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 
     * @return
     *     The address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 
     * @param address
     *     The address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    public DetailContent withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * 
     * @return
     *     The image
     */
    public String getImage() {
        return image;
    }

    /**
     * 
     * @param image
     *     The image
     */
    public void setImage(String image) {
        this.image = image;
    }

    public DetailContent withImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * 
     * @return
     *     The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public DetailContent withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 
     * @return
     *     The coordinate
     */
    public Coordinate getCoordinate() {
        return coordinate;
    }

    /**
     * 
     * @param coordinate
     *     The coordinate
     */
    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public DetailContent withCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
        return this;
    }

    /**
     * 
     * @return
     *     The recent
     */
    public List<RecentDetail> getRecentDetail() {
        return recentDetail;
    }

    /**
     * 
     * @param recentDetail
     *     The recent
     */
    public void setRecentDetail(List<RecentDetail> recentDetail) {
        this.recentDetail = recentDetail;
    }

    public DetailContent withRecent(List<RecentDetail> recentDetail) {
        this.recentDetail = recentDetail;
        return this;
    }

    /**
     * 
     * @return
     *     The images
     */
    public List<Image> getImages() {
        return images;
    }

    /**
     * 
     * @param images
     *     The images
     */
    public void setImages(List<Image> images) {
        this.images = images;
    }

    public DetailContent withImages(List<Image> images) {
        this.images = images;
        return this;
    }

    /**
     * 
     * @return
     *     The plans
     */
    public List<Plan> getPlans() {
        return plans;
    }

    /**
     * 
     * @param plans
     *     The plans
     */
    public void setPlans(List<Plan> plans) {
        this.plans = plans;
    }

    public DetailContent withPlans(List<Plan> plans) {
        this.plans = plans;
        return this;
    }

    /**
     * 
     * @return
     *     The managers
     */
    public List<Manager> getManagers() {
        return managers;
    }

    /**
     * 
     * @param managers
     *     The managers
     */
    public void setManagers(List<Manager> managers) {
        this.managers = managers;
    }

    public DetailContent withManagers(List<Manager> managers) {
        this.managers = managers;
        return this;
    }

    /**
     * 
     * @return
     *     The features
     */
    public List<Object> getFeatures() {
        return features;
    }

    /**
     * 
     * @param features
     *     The features
     */
    public void setFeatures(List<Object> features) {
        this.features = features;
    }

    public DetailContent withFeatures(List<Object> features) {
        this.features = features;
        return this;
    }

    /**
     * 
     * @return
     *     The amenities
     */
    public List<Object> getAmenities() {
        return amenities;
    }

    /**
     * 
     * @param amenities
     *     The amenities
     */
    public void setAmenities(List<Object> amenities) {
        this.amenities = amenities;
    }

    public DetailContent withAmenities(List<Object> amenities) {
        this.amenities = amenities;
        return this;
    }

}
