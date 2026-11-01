package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;

/* JADX INFO: loaded from: classes8.dex */
public abstract class H {
    public static final int a(String str, String str2, AdConfig adConfig) {
        if (ck.p.e("video", str)) {
            return ck.p.e("native", str2) ? adConfig.getNative().getViewabilityConfig().getImpressionConfig().getMinPercentageViewed() : adConfig.getViewability().getVideoImpressionMinPercentageViewed();
        }
        if (ck.p.e("audio", str)) {
            return ck.p.e("audio", str2) ? adConfig.getViewability().getAudioImpressionMinPercentageViewed() : adConfig.getViewability().getWebImpressionMinPercentageViewed();
        }
        return ck.p.e("native", str2) ? adConfig.getNative().getViewabilityConfig().getImpressionConfig().getMinPercentageViewed() : adConfig.getViewability().getWebImpressionMinPercentageViewed();
    }

    public static final int b(String str, String str2, AdConfig adConfig) {
        if (ck.p.e("video", str)) {
            return ck.p.e("native", str2) ? adConfig.getNative().getViewabilityConfig().getImpressionConfig().getVideoMinTimeViewed() : adConfig.getViewability().getVideoImpressionMinTimeViewed();
        }
        if (ck.p.e("audio", str)) {
            return ck.p.e("audio", str2) ? adConfig.getViewability().getAudioImpressionMinTimeViewed() : adConfig.getViewability().getWebImpressionMinTimeViewed();
        }
        return ck.p.e("native", str2) ? adConfig.getNative().getViewabilityConfig().getImpressionConfig().getMinTimeViewed() : adConfig.getViewability().getWebImpressionMinTimeViewed();
    }

    public static final int a(String str) {
        if (lk.x.R(str, "track_", false, 2, null)) {
            str = str.substring(6);
            ck.p.i(str, "substring(...)");
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
