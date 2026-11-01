package com.unity3d.ads.core.data.datasource;

import com.ironsource.C3399bd;

/* JADX INFO: compiled from: AndroidKnownStore.kt */
/* JADX INFO: loaded from: classes10.dex */
public enum AndroidKnownStore {
    GOOGLE("com.android.vending"),
    GOOGLE_MARKET(C3399bd.f28255a),
    AMAZON("com.amazon.venezia"),
    SAMSUNG("com.sec.android.app.samsungapps"),
    XIAOMI("com.xiaomi.market"),
    HUAWEI("com.huawei.appmarket"),
    OPPO("com.oppo.market"),
    VIVO("com.bbk.appstore"),
    UNKNOWN("unknown");

    private final String packageName;

    public final String getPackageName() {
        return this.packageName;
    }

    AndroidKnownStore(String str) {
        this.packageName = str;
    }
}
