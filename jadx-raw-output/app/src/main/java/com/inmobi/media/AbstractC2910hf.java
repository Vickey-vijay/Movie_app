package com.inmobi.media;

import android.os.Debug;
import com.inmobi.media.core.config.models.CrashConfig;
import com.ironsource.C3426d4;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.hf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC2910hf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CrashConfig f24507a;

    static {
        C2924i4 c2924i4 = Y3.f23815a;
        ck.p.j(CrashConfig.class, "clazz");
        f24507a = (CrashConfig) Y3.f23815a.a(CrashConfig.class);
        System.currentTimeMillis();
    }

    public static void a(JSONObject jSONObject, boolean z10, boolean z11, long j10) {
        int i10;
        int i11;
        long j11;
        long j12;
        long[] jArr;
        ck.p.j(jSONObject, "payload");
        if (f24507a.getCrashConfig().getReportOOMInfo() && z10) {
            X4 x10 = z11 ? W4.f23724d : U4.f23614d;
            ck.p.j(x10, "type");
            Ea eaA = S9.a();
            if (eaA != null) {
                String str = x10.f23781c;
                ck.p.j(str, C3426d4.i.W);
                eaA.a(x10.f23781c, eaA.f22577a.getInt(str, 0) + 1, true);
            }
            ck.p.j(x10, com.ironsource.Z7.f27994n);
            Ea eaA2 = S9.a();
            if (eaA2 != null) {
                String str2 = x10.f23779a;
                ck.p.j(str2, C3426d4.i.W);
                long j13 = eaA2.f22577a.getLong(str2, 0L);
                String str3 = x10.f23780b;
                if (j13 == 0) {
                    eaA2.a(str3, j10, true);
                } else {
                    eaA2.a(str3, j10 - j13, true);
                }
            }
            if (z11) {
                W4 w10 = W4.f23724d;
                ck.p.j(w10, "type");
                Ea eaA3 = S9.a();
                if (eaA3 != null) {
                    String str4 = w10.f23781c;
                    ck.p.j(str4, C3426d4.i.W);
                    i10 = eaA3.f22577a.getInt(str4, 0);
                } else {
                    i10 = 0;
                }
                U4 u10 = U4.f23614d;
                ck.p.j(u10, "type");
                Ea eaA4 = S9.a();
                if (eaA4 != null) {
                    String str5 = u10.f23781c;
                    ck.p.j(str5, C3426d4.i.W);
                    i11 = eaA4.f22577a.getInt(str5, 0);
                } else {
                    i11 = 0;
                }
                int i12 = i10 + i11;
                float f10 = i12 > 0 ? (i10 * 100.0f) / i12 : 0.0f;
                jSONObject.put("inmobiOOMCount", i10);
                jSONObject.put("appOOMCount", i11);
                ck.p.j(u10, com.ironsource.Z7.f27994n);
                Ea eaA5 = S9.a();
                if (eaA5 != null) {
                    String str6 = u10.f23780b;
                    ck.p.j(str6, C3426d4.i.W);
                    j11 = eaA5.f22577a.getLong(str6, 0L);
                } else {
                    j11 = 0;
                }
                jSONObject.put("appOomCrashInterval", j11);
                ck.p.j(w10, com.ironsource.Z7.f27994n);
                Ea eaA6 = S9.a();
                if (eaA6 != null) {
                    String str7 = w10.f23780b;
                    ck.p.j(str7, C3426d4.i.W);
                    j12 = eaA6.f22577a.getLong(str7, 0L);
                } else {
                    j12 = 0;
                }
                jSONObject.put("inmOOMCrashInterval", j12);
                jSONObject.put("oomRatioInMobiToApp", Float.valueOf(f10));
                C3298x5.f25687a.getClass();
                if (C3298x5.w()) {
                    long jLongValue = 0;
                    long jLongValue2 = 0;
                    for (Map.Entry<String, String> entry : Debug.getRuntimeStats().entrySet()) {
                        String key = entry.getKey();
                        String value = entry.getValue();
                        if (ck.p.e(key, "art.gc.blocking-gc-count")) {
                            ck.p.g(value);
                            Long lT = lk.w.t(value);
                            jLongValue = lT != null ? lT.longValue() : 0L;
                        } else if (ck.p.e(key, "art.gc.gc-count")) {
                            ck.p.g(value);
                            Long lT2 = lk.w.t(value);
                            jLongValue2 = lT2 != null ? lT2.longValue() : 0L;
                        }
                    }
                    jArr = new long[]{jLongValue, jLongValue2};
                } else {
                    jArr = null;
                }
                if (jArr != null) {
                    jSONObject.put("blockingGcCount", jArr[0]);
                    jSONObject.put("gcCount", jArr[1]);
                }
            }
        }
    }
}
