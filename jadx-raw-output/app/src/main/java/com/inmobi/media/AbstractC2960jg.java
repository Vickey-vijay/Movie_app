package com.inmobi.media;

import com.inmobi.media.core.config.models.TelemetryConfig;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.jg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC2960jg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Gi f24614a;

    static {
        C2924i4 c2924i4 = Y3.f23815a;
        ck.p.j(TelemetryConfig.class, "clazz");
        f24614a = new Gi(((double) 1) - ((TelemetryConfig) Y3.f23815a.a(TelemetryConfig.class)).getPingSamplingFactor());
    }

    public static void a(String str, Map map) {
        ck.p.j(str, "eventType");
        ck.p.j(map, "keyValueMap");
        if (ck.p.e(str, "PingDBMaxLimitReached")) {
            Wj wj2 = Wj.f23753a;
            Wj.b(str, map, EnumC2735ak.SDK);
            return;
        }
        if (f24614a.a()) {
            double d10 = 1;
            C2924i4 c2924i4 = Y3.f23815a;
            ck.p.j(TelemetryConfig.class, "clazz");
            C2924i4 c2924i5 = Y3.f23815a;
            double pingSamplingFactor = d10 - ((TelemetryConfig) c2924i5.a(TelemetryConfig.class)).getPingSamplingFactor();
            ck.p.j(TelemetryConfig.class, "clazz");
            map.put("samplingRate", Integer.valueOf((int) ((d10 - ((TelemetryConfig) c2924i5.a(TelemetryConfig.class)).getSamplingFactor()) * pingSamplingFactor * ((double) 100))));
            Wj wj3 = Wj.f23753a;
            Wj.b(str, map, EnumC2735ak.SDK);
        }
    }
}
