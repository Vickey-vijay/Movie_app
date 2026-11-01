package com.iab.omid.library.bytedance2.adsession;

/* JADX INFO: loaded from: classes10.dex */
public enum DeviceCategory {
    CTV("ctv"),
    MOBILE("mobile"),
    OTHER("other");

    private final String deviceCategory;

    DeviceCategory(String str) {
        this.deviceCategory = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.deviceCategory;
    }
}
