package com.yk.e.object;

/* JADX INFO: loaded from: classes5.dex */
public class ErrMsgParams {
    private String apiUrl = "";
    private String reqData = "";
    private String repData = "";
    private String platform = "";
    private long apiCostTime = 0;

    public long getApiCostTime() {
        return this.apiCostTime;
    }

    public String getApiUrl() {
        return this.apiUrl;
    }

    public String getPlatform() {
        return this.platform;
    }

    public String getRepData() {
        return this.repData;
    }

    public String getReqData() {
        return this.reqData;
    }

    public void setApiCostTime(long j10) {
        this.apiCostTime = j10;
    }

    public void setApiUrl(String str) {
        this.apiUrl = str;
    }

    public void setPlatform(String str) {
        this.platform = str;
    }

    public void setRepData(String str) {
        this.repData = str;
    }

    public void setReqData(String str) {
        this.reqData = str;
    }

    public String toString() {
        return "ErrMsgParams{apiUrl='" + this.apiUrl + "', reqData='" + this.reqData + "', repData='" + this.repData + "', platform='" + this.platform + "', apiCostTime=" + this.apiCostTime + '}';
    }
}
