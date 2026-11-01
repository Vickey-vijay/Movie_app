package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.P9;
import com.inmobi.media.core.config.models.CrashConfig;
import com.ironsource.C3426d4;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class P9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mj.g f23321a = kotlin.b.a(new bk.a() { // from class: b7.v3
        @Override // bk.a
        public final Object invoke() {
            return P9.b();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final O9 f23322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C3223u5 f23323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final La f23324d;

    public static CrashConfig a() {
        C2924i4 c2924i4 = Y3.f23815a;
        ck.p.j(CrashConfig.class, "clazz");
        return (CrashConfig) Y3.f23815a.a(CrashConfig.class);
    }

    static {
        long jCurrentTimeMillis = System.currentTimeMillis();
        f23322b = new O9();
        f23324d = new La(a());
        Context context = Ji.f22951a;
        if (context != null) {
            f23323c = new C3223u5(context, a(), (C3305xc) Ji.f22955e.getValue());
        }
        if (a().getCrashConfig().getReportSessionInfo()) {
            V4 v10 = V4.f23674d;
            ck.p.j(v10, "type");
            Ea eaA = S9.a();
            if (eaA != null) {
                eaA.a(v10.f23779a, jCurrentTimeMillis, true);
            }
            Ea eaA2 = S9.a();
            if (eaA2 != null) {
                ConcurrentHashMap concurrentHashMap = Ea.f22576b;
                eaA2.a("s-cnt", 0, false);
            }
        }
        if (AbstractC2910hf.f24507a.getCrashConfig().getReportOOMInfo()) {
            for (X4 x10 : nj.s.n(W4.f23724d, U4.f23614d)) {
                ck.p.j(x10, "type");
                Ea eaA3 = S9.a();
                if (eaA3 != null) {
                    eaA3.a(x10.f23779a, jCurrentTimeMillis, true);
                }
            }
        }
    }

    public static final N9 b() {
        return new N9(AbstractC2904h9.b());
    }

    public static void c() {
        Ea eaA;
        if (a().getCrashConfig().getReportSessionInfo() && (eaA = S9.a()) != null) {
            ck.p.j("s-cnt", C3426d4.i.W);
            eaA.a("s-cnt", eaA.f22577a.getInt("s-cnt", 0) + 1, false);
        }
        C3223u5 c3223u5 = f23323c;
        if (c3223u5 != null) {
            Iterator it = c3223u5.f25431c.iterator();
            while (it.hasNext()) {
                ((AbstractC3198t5) it.next()).a();
            }
        }
        La la2 = f23324d;
        la2.getClass();
        AbstractC2940il.a(new Ia(la2, null));
        ((C3305xc) Ji.f22955e.getValue()).a(new int[]{2, 1, 152, 150, 151}, la2.f23070d);
        C2924i4 c2924i4 = Y3.f23815a;
        Y3.a("crashReporting", f23322b);
    }

    public static void a(L2 l10) {
        ck.p.j(l10, "event");
        La la2 = f23324d;
        la2.getClass();
        ck.p.j(l10, "incident");
        if (la2.f23067a.getCatchConfig().getEnabled() && la2.f23069c.f23442b.a()) {
            AbstractC2940il.a(new Ha(la2, l10, null));
        }
    }

    public static void a(JSONObject jSONObject, boolean z10, long j10) throws JSONException {
        ck.p.j(jSONObject, "payload");
        if (a().getCrashConfig().getReportSessionInfo() && z10) {
            V4 v10 = V4.f23674d;
            ck.p.j(v10, com.ironsource.Z7.f27994n);
            Ea eaA = S9.a();
            long j11 = 0;
            if (eaA != null) {
                String str = v10.f23779a;
                ck.p.j(str, C3426d4.i.W);
                long j12 = eaA.f22577a.getLong(str, 0L);
                String str2 = v10.f23780b;
                if (j12 == 0) {
                    eaA.a(str2, j10, true);
                } else {
                    eaA.a(str2, j10 - j12, true);
                }
            }
            ck.p.j(v10, com.ironsource.Z7.f27994n);
            Ea eaA2 = S9.a();
            if (eaA2 != null) {
                String str3 = v10.f23780b;
                ck.p.j(str3, C3426d4.i.W);
                j11 = eaA2.f22577a.getLong(str3, 0L);
            }
            jSONObject.put("crashFreeSessionLength", j11);
            Ea eaA3 = S9.a();
            int i10 = 0;
            if (eaA3 != null) {
                ck.p.j("s-cnt", C3426d4.i.W);
                i10 = eaA3.f22577a.getInt("s-cnt", 0);
            }
            jSONObject.put("crashFreeSessionCount", i10);
        }
    }
}
