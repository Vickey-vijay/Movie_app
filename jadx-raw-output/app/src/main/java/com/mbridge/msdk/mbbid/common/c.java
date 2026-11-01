package com.mbridge.msdk.mbbid.common;

/* JADX INFO: compiled from: BidRequestParams.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f35770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f35771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f35772c;

    public c(String str, String str2) {
        this.f35770a = str;
        this.f35771b = str2;
    }

    public String getmFloorPrice() {
        return this.f35772c;
    }

    public String getmPlacementId() {
        return this.f35770a;
    }

    public String getmUnitId() {
        return this.f35771b;
    }

    public void setmFloorPrice(String str) {
        this.f35772c = str;
    }

    public void setmPlacementId(String str) {
        this.f35770a = str;
    }

    public void setmUnitId(String str) {
        this.f35771b = str;
    }

    public c(String str, String str2, String str3) {
        this.f35770a = str;
        this.f35771b = str2;
        this.f35772c = str3;
    }
}
