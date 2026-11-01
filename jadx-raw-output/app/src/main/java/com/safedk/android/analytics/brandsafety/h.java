package com.safedk.android.analytics.brandsafety;

import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: classes7.dex */
public class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f44419d = "ClickUrlCandidate";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f44420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f44421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f44422c;

    public h(long j10, String str, String str2) {
        this.f44420a = 0L;
        Logger.d(f44419d, "click URL candidate, current time: " + j10 + ", click URL: " + str + ", view address: " + str2);
        this.f44420a = j10;
        this.f44421b = str;
        this.f44422c = str2;
    }

    public h(long j10, String str) {
        this.f44420a = 0L;
        Logger.d(f44419d, "click url candidate, currentTime=" + j10 + ", clickUrl=" + str);
        this.f44420a = j10;
        this.f44421b = str;
    }
}
