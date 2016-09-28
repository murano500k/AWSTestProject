
package com.murano500k.test.awstestproject.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Building {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("rent")
    @Expose
    private String rent;
    @SerializedName("sale")
    @Expose
    private String sale;
    @SerializedName("coordinate")
    @Expose
    private Coordinate coordinate;
    @SerializedName("min_rent")
    @Expose
    private String minRent;
    @SerializedName("min_sale")
    @Expose
    private String minSale;

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

    public Building withId(Integer id) {
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

    public Building withTitle(String title) {
        this.title = title;
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

    public Building withImage(String image) {
        this.image = image;
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

    public Building withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * 
     * @return
     *     The rent
     */
    public String getRent() {
        return rent;
    }

    /**
     * 
     * @param rent
     *     The rent
     */
    public void setRent(String rent) {
        this.rent = rent;
    }

    public Building withRent(String rent) {
        this.rent = rent;
        return this;
    }

    /**
     * 
     * @return
     *     The sale
     */
    public String getSale() {
        return sale;
    }

    /**
     * 
     * @param sale
     *     The sale
     */
    public void setSale(String sale) {
        this.sale = sale;
    }

    public Building withSale(String sale) {
        this.sale = sale;
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

    public Building withCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
        return this;
    }

    /**
     * 
     * @return
     *     The minRent
     */
    public String getMinRent() {
        return minRent;
    }

    /**
     * 
     * @param minRent
     *     The min_rent
     */
    public void setMinRent(String minRent) {
        this.minRent = minRent;
    }

    public Building withMinRent(String minRent) {
        this.minRent = minRent;
        return this;
    }

    /**
     * 
     * @return
     *     The minSale
     */
    public String getMinSale() {
        return minSale;
    }

    /**
     * 
     * @param minSale
     *     The min_sale
     */
    public void setMinSale(String minSale) {
        this.minSale = minSale;
    }

    public Building withMinSale(String minSale) {
        this.minSale = minSale;
        return this;
    }

}
