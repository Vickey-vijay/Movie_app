package com.safedk.android.analytics.brandsafety;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes7.dex */
public class RedirectDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f43724a = Long.valueOf(System.currentTimeMillis());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f43725b = Long.valueOf(SystemClock.elapsedRealtime());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f43726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public BrandSafetyUtils.AdType f43727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RedirectType f43728e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f43729f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f43730g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f43731h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RedirectDetails f43732i;

    public enum RedirectType {
        REDIRECT,
        EXPAND
    }

    public RedirectDetails(String sdkPackageName, BrandSafetyUtils.AdType adType, RedirectType type, String viewAddress, String requestedUrl, String originatedMethod, RedirectDetails previousRedirectDetails) {
        this.f43726c = sdkPackageName;
        this.f43727d = adType;
        this.f43728e = type;
        this.f43729f = viewAddress;
        this.f43730g = requestedUrl;
        this.f43731h = originatedMethod;
        this.f43732i = previousRedirectDetails;
    }

    public String toString() {
        return "RedirectDetails{ " + this.f43725b + ", " + this.f43726c + ", " + this.f43727d + ", " + this.f43728e + ", " + this.f43729f + ", " + this.f43730g + ", " + this.f43731h + " }";
    }
}
