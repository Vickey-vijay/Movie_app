package com.mbridge.msdk.mbbid.out;

/* JADX INFO: loaded from: classes2.dex */
public class AdvancedNativeBidRequestParams extends CommonBidRequestParams {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f35788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f35789e;

    public AdvancedNativeBidRequestParams(String str, String str2, int i10, int i11) {
        super(str, str2);
        this.f35788d = i11;
        this.f35789e = i10;
    }

    public int getHeight() {
        return this.f35788d;
    }

    public int getWidth() {
        return this.f35789e;
    }

    public void setHeight(int i10) {
        this.f35788d = i10;
    }

    public void setWidth(int i10) {
        this.f35789e = i10;
    }

    public AdvancedNativeBidRequestParams(String str, String str2, String str3, int i10, int i11) {
        super(str, str2, str3);
        this.f35788d = i11;
        this.f35789e = i10;
    }
}
