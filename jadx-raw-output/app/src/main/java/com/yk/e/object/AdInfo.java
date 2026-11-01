package com.yk.e.object;

/* JADX INFO: loaded from: classes8.dex */
public class AdInfo {
    public String I1I;
    public double IL1Iii;
    public String ILil;

    public AdInfo() {
        this.IL1Iii = 0.0d;
        this.ILil = "";
        this.I1I = "";
    }

    public String getNetworkName() {
        return this.I1I;
    }

    public double getRevenue() {
        return this.IL1Iii;
    }

    public String getRevenuePrecision() {
        return this.ILil;
    }

    public void setNetworkName(String str) {
        this.I1I = str;
    }

    public void setRevenue(double d10) {
        this.IL1Iii = d10;
    }

    public void setRevenuePrecision(String str) {
        this.ILil = str;
    }

    public String toString() {
        return "AdInfo{revenue=" + this.IL1Iii + ", revenuePrecision='" + this.ILil + "', networkName='" + this.I1I + "'}";
    }

    public AdInfo(double d10, String str, String str2) {
        this.IL1Iii = d10;
        this.ILil = str;
        this.I1I = str2;
    }
}
