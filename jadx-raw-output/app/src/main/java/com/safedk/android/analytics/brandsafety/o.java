package com.safedk.android.analytics.brandsafety;

import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;

/* JADX INFO: loaded from: classes7.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    CreativeInfo f44545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f44546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f44547c;

    public o(CreativeInfo creativeInfo, String str, String str2) {
        this.f44545a = creativeInfo;
        this.f44546b = str;
        this.f44547c = System.currentTimeMillis() + ";" + str2;
    }

    public String toString() {
        return "what?: " + this.f44545a.toString() + " how? " + this.f44546b + " when?: " + this.f44547c;
    }
}
