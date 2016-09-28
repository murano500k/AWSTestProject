
package com.murano500k.test.awstestproject.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponceDetail {

    @SerializedName("data")
    @Expose
    private DetailContent detailContent;
    @SerializedName("status")
    @Expose
    private String status;

    /**
     * 
     * @return
     *     The data
     */
    public DetailContent getDetailContent() {
        return detailContent;
    }

    /**
     * 
     * @param detailContent
     *     The data
     */
    public void setDetailContent(DetailContent detailContent) {
        this.detailContent = detailContent;
    }

    public ResponceDetail withData(DetailContent detailContent) {
        this.detailContent = detailContent;
        return this;
    }

    /**
     * 
     * @return
     *     The status
     */
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    public ResponceDetail withStatus(String status) {
        this.status = status;
        return this;
    }

}
