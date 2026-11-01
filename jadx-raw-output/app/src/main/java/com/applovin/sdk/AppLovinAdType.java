package com.applovin.sdk;

import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class AppLovinAdType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f10399a;
    public static final AppLovinAdType REGULAR = new AppLovinAdType("REGULAR");
    public static final AppLovinAdType APP_OPEN = new AppLovinAdType(BrandSafetyUtils.f43549l);
    public static final AppLovinAdType INCENTIVIZED = new AppLovinAdType("VIDEOA");
    public static final AppLovinAdType NATIVE = new AppLovinAdType("NATIVE");

    public static AppLovinAdType fromString(String str) {
        if ("REGULAR".equalsIgnoreCase(str)) {
            return REGULAR;
        }
        if (BrandSafetyUtils.f43549l.equalsIgnoreCase(str)) {
            return APP_OPEN;
        }
        if ("VIDEOA".equalsIgnoreCase(str)) {
            return INCENTIVIZED;
        }
        if ("NATIVE".equalsIgnoreCase(str)) {
            return NATIVE;
        }
        throw new IllegalArgumentException("Unknown Ad Type: " + str);
    }

    public String getLabel() {
        return this.f10399a.toUpperCase(Locale.ENGLISH);
    }

    private AppLovinAdType(String str) {
        this.f10399a = str;
    }

    public String toString() {
        return getLabel();
    }
}
