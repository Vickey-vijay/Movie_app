package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import com.inmobi.media.core.config.models.CrashConfig;

/* JADX INFO: loaded from: classes6.dex */
public final class O9 implements InterfaceC3172s4 {
    @Override // com.inmobi.media.InterfaceC3172s4
    public final void a(Config config) {
        ck.p.j(config, "config");
        if (config instanceof CrashConfig) {
            La la2 = P9.f23324d;
            CrashConfig crashConfig = (CrashConfig) config;
            la2.getClass();
            ck.p.j(crashConfig, "crashConfig");
            la2.f23067a = crashConfig;
            R9 r10 = la2.f23069c;
            r10.getClass();
            ck.p.j(crashConfig, "config");
            r10.f23441a.f22747a = crashConfig.getCrashConfig().getSamplingPercent();
            r10.f23442b.f22747a = crashConfig.getCatchConfig().getSamplingPercent();
            r10.f23443c.f22747a = crashConfig.getANRConfig().getWatchdog().getSamplingPercent();
            r10.f23444d.f22747a = crashConfig.getANRConfig().getAppExitReason().getSamplingPercent();
            C3000l6 c3000l6 = la2.f23068b;
            if (c3000l6 != null) {
                C2773c6 eventConfig = crashConfig.getEventConfig();
                ck.p.j(eventConfig, "eventConfig");
                c3000l6.f24748j = eventConfig;
            }
            C3223u5 c3223u5 = P9.f23323c;
            if (c3223u5 != null) {
                ck.p.j(crashConfig, "crashConfig");
                c3223u5.f25429a = crashConfig;
            }
        }
    }
}
