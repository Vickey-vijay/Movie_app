package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.CrashConfig;
import com.inmobi.media.core.config.models.RootConfig;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.inmobi.media.core.config.models.TelemetryConfig;

/* JADX INFO: renamed from: com.inmobi.media.t4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC3197t4 {
    public static final String a(Class cls) {
        ck.p.j(cls, "clazz");
        if (ck.p.e(cls, RootConfig.class)) {
            return "root";
        }
        if (ck.p.e(cls, AdConfig.class)) {
            return com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS;
        }
        if (ck.p.e(cls, TelemetryConfig.class)) {
            return "telemetry";
        }
        if (ck.p.e(cls, SignalsConfig.class)) {
            return "signals";
        }
        if (ck.p.e(cls, CrashConfig.class)) {
            return "crashReporting";
        }
        throw new IllegalArgumentException("Type: " + cls);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class a(String str) {
        ck.p.j(str, "configType");
        switch (str.hashCode()) {
            case -60641721:
                if (str.equals("crashReporting")) {
                    return CrashConfig.class;
                }
                break;
            case 96432:
                if (str.equals(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS)) {
                    return AdConfig.class;
                }
                break;
            case 3506402:
                if (str.equals("root")) {
                    return RootConfig.class;
                }
                break;
            case 780346297:
                if (str.equals("telemetry")) {
                    return TelemetryConfig.class;
                }
                break;
            case 2088265419:
                if (str.equals("signals")) {
                    return SignalsConfig.class;
                }
                break;
        }
        throw new IllegalArgumentException("Type: " + str);
    }
}
