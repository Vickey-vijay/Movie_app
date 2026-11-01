package com.applovin.sdk;

import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.internal.d;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public class AppLovinAdSize {
    public static final int SPAN = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f10396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f10397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f10398c;
    public static final AppLovinAdSize BANNER = new AppLovinAdSize(-1, 50, "BANNER");
    public static final AppLovinAdSize LEADER = new AppLovinAdSize(-1, 90, BrandSafetyUtils.f43551n);
    public static final AppLovinAdSize MREC = new AppLovinAdSize(d.f44769a, 250, BrandSafetyUtils.f43552o);
    public static final AppLovinAdSize INTERSTITIAL = new AppLovinAdSize(-1, -1, BrandSafetyUtils.f43547j);
    public static final AppLovinAdSize NATIVE = new AppLovinAdSize(-1, -1, "NATIVE");

    public static AppLovinAdSize fromString(String str) {
        if ("BANNER".equalsIgnoreCase(str)) {
            return BANNER;
        }
        if (BrandSafetyUtils.f43552o.equalsIgnoreCase(str)) {
            return MREC;
        }
        if (BrandSafetyUtils.f43551n.equalsIgnoreCase(str)) {
            return LEADER;
        }
        if ("INTERSTITIAL".equalsIgnoreCase(str) || BrandSafetyUtils.f43547j.equalsIgnoreCase(str)) {
            return INTERSTITIAL;
        }
        if ("NATIVE".equalsIgnoreCase(str)) {
            return NATIVE;
        }
        throw new IllegalArgumentException("Unknown Ad Size: " + str);
    }

    public int getHeight() {
        return this.f10398c;
    }

    public String getLabel() {
        return this.f10396a.toUpperCase(Locale.ENGLISH);
    }

    public int getWidth() {
        return this.f10397b;
    }

    private AppLovinAdSize(int i10, int i11, String str) {
        this.f10397b = i10;
        this.f10398c = i11;
        this.f10396a = str;
    }

    public String toString() {
        return getLabel();
    }
}
