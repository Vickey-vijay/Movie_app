package com.mbridge.msdk.dycreator.error;

/* JADX INFO: compiled from: FixedError.java */
/* JADX INFO: loaded from: classes9.dex */
public enum b {
    NOT_FOUND_VIEWOPTION(-101, "ViewOption is null"),
    NOT_FOUND_CONTEXT(-102, "context is null"),
    FILE_CREATE_VIEW_FILE(-103, "file create view is null"),
    CAMPAIGNEX_IS_NULL(-104, "Campaign size only one"),
    NOT_FOUND_CAMPAIGN(-105, "campaign is null"),
    NOT_FOUND_DYNAMIC_FILE(-106, "dynamic file is not exits"),
    BIND_DATA_FILE_OR_DIR(-107, "data file or file dir is not exits "),
    NOT_FOUND_DYNAMIC_OPTION(-108, "dynamic_option is not exits");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f34446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f34447b;

    public int d() {
        return this.f34446a;
    }

    public String g() {
        return this.f34447b;
    }

    b(int i10, String str) {
        this.f34446a = i10;
        this.f34447b = str;
    }
}
