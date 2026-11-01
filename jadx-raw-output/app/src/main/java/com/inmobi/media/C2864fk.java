package com.inmobi.media;

import android.os.Build;
import com.inmobi.media.C2864fk;
import com.inmobi.media.I2;
import com.inmobi.media.core.config.models.TelemetryConfig;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.fk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C2864fk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TelemetryConfig f24382a;

    public static final mj.r a(C2864fk c2864fk, I2 i10) {
        ck.p.j(i10, "it");
        switch (i10.f22839a) {
            case 150:
                Map map = i10.f22841c;
                Object obj = map != null ? map.get("data") : null;
                c2864fk.a("CrashEventOccurred", obj instanceof T4 ? (T4) obj : null);
                break;
            case 151:
                Map map2 = i10.f22841c;
                Object obj2 = map2 != null ? map2.get("data") : null;
                Wn wn2 = obj2 instanceof Wn ? (Wn) obj2 : null;
                c2864fk.getClass();
                if (wn2 != null && AbstractC2940il.a(wn2)) {
                    C3298x5.f25687a.getClass();
                    if (!C3298x5.r()) {
                        c2864fk.a("MainThreadBlockedEvent", wn2);
                    }
                }
                break;
            case 152:
                Map map3 = i10.f22841c;
                Object obj3 = map3 != null ? map3.get("data") : null;
                c2864fk.a(obj3 instanceof C3344z1 ? (C3344z1) obj3 : null);
                break;
        }
        return mj.r.f64562a;
    }

    public C2864fk(TelemetryConfig telemetryConfig) {
        ck.p.j(telemetryConfig, "telemetryConfig");
        this.f24382a = telemetryConfig;
        ((C3305xc) Ji.f22955e.getValue()).a(new int[]{150, 152}, new bk.l() { // from class: b7.y6
            @Override // bk.l
            public final Object invoke(Object obj) {
                return C2864fk.a(this.f5262b, (I2) obj);
            }
        });
    }

    public final void a(C3344z1 c3344z1) {
        if (Build.VERSION.SDK_INT < 30 || c3344z1 == null || c3344z1.f25820g != 6) {
            return;
        }
        a("ANREvent", c3344z1);
    }

    public final void a(String str, Q9 q10) {
        if (this.f24382a.getPriorityEventsList().contains(str) && q10 != null && AbstractC2940il.a(q10)) {
            Wj.b(str, new LinkedHashMap(), EnumC2735ak.SDK);
        }
    }
}
