package com.mbridge.msdk.video.dynview.error;

/* JADX INFO: compiled from: EnumError.java */
/* JADX INFO: loaded from: classes10.dex */
public enum a {
    NOT_FOUND_VIEWOPTION(-1, "ViewOption is null"),
    NOT_FOUND_CONTEXT(-2, "Context is null"),
    NOT_FOUND_LAYOUTNAME(-3, "layout xml name is null"),
    CAMPAIGNEX_IS_NULL(-4, "Campaign size only one"),
    VIEW_CREATE_ERROR(-5, "view create error"),
    NOT_FOUND_ROOTVIEW(-6, "rootview is null");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f38624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f38625b;

    public int d() {
        return this.f38624a;
    }

    public String g() {
        return this.f38625b;
    }

    a(int i10, String str) {
        this.f38624a = i10;
        this.f38625b = str;
    }
}
