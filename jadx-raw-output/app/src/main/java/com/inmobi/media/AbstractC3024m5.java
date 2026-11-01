package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.Config;
import com.inmobi.media.core.config.models.CrashConfig;
import com.inmobi.media.core.config.models.RootConfig;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.inmobi.media.core.config.models.TelemetryConfig;

/* JADX INFO: renamed from: com.inmobi.media.m5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC3024m5 {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Config a(String str) {
        ck.p.j(str, "configType");
        switch (str.hashCode()) {
            case -60641721:
                if (str.equals("crashReporting")) {
                    return new CrashConfig();
                }
                break;
            case 96432:
                if (str.equals(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS)) {
                    return new AdConfig();
                }
                break;
            case 3506402:
                if (str.equals("root")) {
                    return new RootConfig();
                }
                break;
            case 780346297:
                if (str.equals("telemetry")) {
                    return new TelemetryConfig();
                }
                break;
            case 2088265419:
                if (str.equals("signals")) {
                    return new SignalsConfig();
                }
                break;
        }
        throw new IllegalArgumentException("Type: " + str);
    }
}
