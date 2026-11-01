package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.Config;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes6.dex */
public final class B0 implements InterfaceC3172s4 {
    @Override // com.inmobi.media.InterfaceC3172s4
    public final void a(Config config) {
        A0 a10;
        ck.p.j(config, "config");
        if ((config instanceof AdConfig) && (a10 = E0.f22557b) != null) {
            AdConfig adConfig = (AdConfig) config;
            ck.p.j(adConfig, "adConfig");
            if (a10.f22329a.get()) {
                if (adConfig.getAdQuality().getEnabled()) {
                    return;
                }
                a10.f22329a.set(false);
                nk.l0 l0Var = E0.f22561f;
                if (l0Var != null) {
                    kotlinx.coroutines.d.c(l0Var, new CancellationException("Shutdown"));
                }
                E0.f22561f = null;
                return;
            }
            if (!adConfig.getAdQuality().getEnabled() || a10.f22329a.get()) {
                return;
            }
            C2924i4 c2924i4 = Y3.f23815a;
            ck.p.j(AdConfig.class, "clazz");
            if (((AdConfig) Y3.f23815a.a(AdConfig.class)).getAdQuality().getEnabled()) {
                a10.a();
            }
        }
    }
}
