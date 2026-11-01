package com.inmobi.media;

import com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.mc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC3031mc {
    /* JADX WARN: Code duplicated, block: B:24:0x0066  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:74:0x014f  */
    public static C3056nc a(TimeoutConfigurations.MediationConfig mediationConfig, String str, String str2, String str3) {
        TimeoutConfigurations.AdNonABConfig banner;
        TimeoutConfigurations.AdPreloadConfig banner2;
        TimeoutConfigurations.AdABConfig banner3;
        ck.p.j(mediationConfig, "mediationConfig");
        ck.p.j(str, "placementType");
        ck.p.j(str2, "adTypes");
        if (str.equals("AB")) {
            TimeoutConfigurations.ABConfig aBConfig = mediationConfig.getABConfig();
            int iHashCode = str2.hashCode();
            if (iHashCode != -1396342996) {
                if (iHashCode != -1052618729) {
                    if (iHashCode != 104431) {
                        if (iHashCode == 93166550 && str2.equals("audio")) {
                            banner3 = aBConfig.getAudio();
                        } else {
                            banner3 = aBConfig.getBanner();
                        }
                    } else if (str2.equals(ImpressionLog.f43647w)) {
                        banner3 = aBConfig.getInterstitial();
                    } else {
                        banner3 = aBConfig.getBanner();
                    }
                } else if (str2.equals("native")) {
                    banner3 = aBConfig.getNative();
                } else {
                    banner3 = aBConfig.getBanner();
                }
            } else if (str2.equals("banner")) {
                banner3 = aBConfig.getBanner();
            } else {
                banner3 = aBConfig.getBanner();
            }
            return new C3056nc(a(str3, banner3.getRetryInterval()), a(str3, banner3.getMaxRetries()), a(str3, banner3.getLoadTimeout()), (Integer) null, 24);
        }
        if (str.equals("Preload")) {
            TimeoutConfigurations.PreloadConfig preloadConfig = mediationConfig.getPreloadConfig();
            int iHashCode2 = str2.hashCode();
            if (iHashCode2 != -1396342996) {
                if (iHashCode2 != -1052618729) {
                    if (iHashCode2 != 104431) {
                        if (iHashCode2 == 93166550 && str2.equals("audio")) {
                            banner2 = preloadConfig.getAudio();
                        } else {
                            banner2 = preloadConfig.getBanner();
                        }
                    } else if (str2.equals(ImpressionLog.f43647w)) {
                        banner2 = preloadConfig.getInterstitial();
                    } else {
                        banner2 = preloadConfig.getBanner();
                    }
                } else if (str2.equals("native")) {
                    banner2 = preloadConfig.getNative();
                } else {
                    banner2 = preloadConfig.getBanner();
                }
            } else if (str2.equals("banner")) {
                banner2 = preloadConfig.getBanner();
            } else {
                banner2 = preloadConfig.getBanner();
            }
            return new C3056nc(a(str3, banner2.getRetryInterval()), a(str3, banner2.getMaxRetries()), a(str3, banner2.getLoadTimeout()), Integer.valueOf(a(str3, banner2.getMuttTimeout())), Integer.valueOf(a(str3, banner2.getPreloadTimeout())));
        }
        TimeoutConfigurations.NonABConfig nonABConfig = mediationConfig.getNonABConfig();
        int iHashCode3 = str2.hashCode();
        if (iHashCode3 != -1396342996) {
            if (iHashCode3 != -1052618729) {
                if (iHashCode3 != 104431) {
                    if (iHashCode3 == 93166550 && str2.equals("audio")) {
                        banner = nonABConfig.getAudio();
                    } else {
                        banner = nonABConfig.getBanner();
                    }
                } else if (str2.equals(ImpressionLog.f43647w)) {
                    banner = nonABConfig.getInterstitial();
                } else {
                    banner = nonABConfig.getBanner();
                }
            } else if (str2.equals("native")) {
                banner = nonABConfig.getNative();
            } else {
                banner = nonABConfig.getBanner();
            }
        } else if (str2.equals("banner")) {
            banner = nonABConfig.getBanner();
        } else {
            banner = nonABConfig.getBanner();
        }
        return new C3056nc(a(str3, banner.getRetryInterval()), a(str3, banner.getMaxRetries()), a(str3, banner.getLoadTimeout()), Integer.valueOf(a(str3, banner.getMuttTimeout())), 16);
    }

    public static int a(String str, JSONObject jSONObject) {
        if (str != null && jSONObject.has(str)) {
            return jSONObject.getInt(str);
        }
        return jSONObject.optInt("default", 0);
    }
}
