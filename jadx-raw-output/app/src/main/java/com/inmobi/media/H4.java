package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.Config;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.ironsource.C3426d4;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class H4 implements InterfaceC3172s4 {
    @Override // com.inmobi.media.InterfaceC3172s4
    public final void a(Config config) {
        ck.p.j(config, "config");
        synchronized (this) {
            K4 k10 = K4.f22996a;
            ck.p.i("K4", "access$getTAG$p(...)");
            K4 k11 = K4.f22996a;
            C2924i4 c2924i4 = Y3.f23815a;
            ck.p.j(SignalsConfig.class, "clazz");
            C2924i4 c2924i5 = Y3.f23815a;
            K4.f23000e = X5.a(((SignalsConfig) c2924i5.a(SignalsConfig.class)).getAK());
            Context context = Ji.f22951a;
            if (context != null) {
                ck.p.i("K4", "TAG");
                ConcurrentHashMap concurrentHashMap = Ea.f22576b;
                Ea eaA = Da.a(context, "c_data_store");
                Context context2 = Ji.f22951a;
                int i10 = 1;
                if (context2 != null) {
                    Ea eaA2 = Da.a(context2, "c_data_store");
                    ck.p.j("akv", C3426d4.i.W);
                    i10 = eaA2.f22577a.getInt("akv", 1);
                }
                ck.p.j(SignalsConfig.class, "clazz");
                if (((SignalsConfig) c2924i5.a(SignalsConfig.class)).getAKV() != i10) {
                    ck.p.i("K4", "TAG");
                    ck.p.j(SignalsConfig.class, "clazz");
                    eaA.a("akv", ((SignalsConfig) c2924i5.a(SignalsConfig.class)).getAKV(), false);
                    k11.f();
                }
            }
            mj.r rVar = mj.r.f64562a;
        }
    }
}
