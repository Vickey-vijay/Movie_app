package com.inmobi.media;

import com.inmobi.media.C3260vh;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.Config;
import com.inmobi.media.core.config.models.CrashConfig;
import com.inmobi.media.core.config.models.RootConfig;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.inmobi.media.core.config.models.TelemetryConfig;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.inmobi.media.vh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3260vh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2719a4 f25575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mj.g f25576b;

    public static final Bh a() {
        return new Bh((C3227u9) He.f22811b.getValue());
    }

    public C3260vh(C2719a4 c2719a4) {
        ck.p.j(c2719a4, "configDao");
        this.f25575a = c2719a4;
        this.f25576b = kotlin.b.a(new bk.a() { // from class: b7.qb
            @Override // bk.a
            public final Object invoke() {
                return C3260vh.a();
            }
        });
    }

    public static final ArrayList a(C3260vh c3260vh) {
        C3023m4 c3023m4;
        C3023m4 c3023m5;
        C3023m4 c3023m6;
        C3023m4 c3023m7;
        C3023m4 c3023m8;
        ArrayList arrayList = new ArrayList();
        C2924i4 c2924i4 = Y3.f23815a;
        ck.p.j(RootConfig.class, "clazz");
        C2924i4 c2924i5 = Y3.f23815a;
        RootConfig rootConfig = (RootConfig) c2924i5.a(RootConfig.class);
        if (a(rootConfig, RootConfig.class)) {
            ck.p.j(RootConfig.class, "clazz");
            RootConfig rootConfig2 = (RootConfig) c2924i5.a(RootConfig.class);
            if (ck.p.e(RootConfig.class, RootConfig.class)) {
                c3023m8 = new C3023m4(rootConfig2.getUrlForType("root"), rootConfig2);
            } else {
                ck.p.j(RootConfig.class, "clazz");
                Config configA = c2924i5.a(RootConfig.class);
                c3023m8 = new C3023m4(rootConfig2.getUrlForType(configA.getType()), configA);
            }
            arrayList.add(c3023m8);
            return arrayList;
        }
        if (a(rootConfig, AdConfig.class)) {
            ck.p.j(RootConfig.class, "clazz");
            RootConfig rootConfig3 = (RootConfig) c2924i5.a(RootConfig.class);
            if (ck.p.e(AdConfig.class, RootConfig.class)) {
                c3023m7 = new C3023m4(rootConfig3.getUrlForType("root"), rootConfig3);
            } else {
                ck.p.j(AdConfig.class, "clazz");
                Config configA2 = c2924i5.a(AdConfig.class);
                c3023m7 = new C3023m4(rootConfig3.getUrlForType(configA2.getType()), configA2);
            }
            arrayList.add(c3023m7);
        }
        if (a(rootConfig, TelemetryConfig.class)) {
            ck.p.j(RootConfig.class, "clazz");
            RootConfig rootConfig4 = (RootConfig) c2924i5.a(RootConfig.class);
            if (ck.p.e(TelemetryConfig.class, RootConfig.class)) {
                c3023m6 = new C3023m4(rootConfig4.getUrlForType("root"), rootConfig4);
            } else {
                ck.p.j(TelemetryConfig.class, "clazz");
                Config configA3 = c2924i5.a(TelemetryConfig.class);
                c3023m6 = new C3023m4(rootConfig4.getUrlForType(configA3.getType()), configA3);
            }
            arrayList.add(c3023m6);
        }
        if (a(rootConfig, SignalsConfig.class)) {
            ck.p.j(RootConfig.class, "clazz");
            RootConfig rootConfig5 = (RootConfig) c2924i5.a(RootConfig.class);
            if (ck.p.e(SignalsConfig.class, RootConfig.class)) {
                c3023m5 = new C3023m4(rootConfig5.getUrlForType("root"), rootConfig5);
            } else {
                ck.p.j(SignalsConfig.class, "clazz");
                Config configA4 = c2924i5.a(SignalsConfig.class);
                c3023m5 = new C3023m4(rootConfig5.getUrlForType(configA4.getType()), configA4);
            }
            arrayList.add(c3023m5);
        }
        if (a(rootConfig, CrashConfig.class)) {
            ck.p.j(RootConfig.class, "clazz");
            RootConfig rootConfig6 = (RootConfig) c2924i5.a(RootConfig.class);
            if (ck.p.e(CrashConfig.class, RootConfig.class)) {
                c3023m4 = new C3023m4(rootConfig6.getUrlForType("root"), rootConfig6);
            } else {
                ck.p.j(CrashConfig.class, "clazz");
                Config configA5 = c2924i5.a(CrashConfig.class);
                c3023m4 = new C3023m4(rootConfig6.getUrlForType(configA5.getType()), configA5);
            }
            arrayList.add(c3023m4);
        }
        return arrayList;
    }

    public static boolean a(RootConfig rootConfig, Class cls) {
        C2924i4 c2924i4 = Y3.f23815a;
        ck.p.j(cls, "clazz");
        Config configA = Y3.f23815a.a(cls);
        return configA == null || System.currentTimeMillis() - configA.getLastUpdateTimeStamp() > rootConfig.getExpiryInMillisForType(AbstractC3197t4.a(cls));
    }
}
