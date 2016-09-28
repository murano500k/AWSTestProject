
package com.murano500k.test.awstestproject.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Data {

    @SerializedName("buildings")
    @Expose
    private List<Building> buildings = new ArrayList<Building>();
    @SerializedName("recent")
    @Expose
    private List<RecentList> recentList = new ArrayList<RecentList>();

    /**
     * 
     * @return
     *     The buildings
     */
    public List<Building> getBuildings() {
        return buildings;
    }

    /**
     * 
     * @param buildings
     *     The buildings
     */
    public void setBuildings(List<Building> buildings) {
        this.buildings = buildings;
    }

    public Data withBuildings(List<Building> buildings) {
        this.buildings = buildings;
        return this;
    }

    /**
     * 
     * @return
     *     The recent
     */
    public List<RecentList> getRecentList() {
        return recentList;
    }

    /**
     * 
     * @param recentList
     *     The recent
     */
    public void setRecentList(List<RecentList> recentList) {
        this.recentList = recentList;
    }

    public Data withRecent(List<RecentList> recentList) {
        this.recentList = recentList;
        return this;
    }

}
