package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import com.inmobi.media.core.config.models.TelemetryConfig;

/* JADX INFO: loaded from: classes7.dex */
public final class Vj implements InterfaceC3172s4 {
    @Override // com.inmobi.media.InterfaceC3172s4
    public final void a(Config config) {
        ck.p.j(config, "config");
        if (config instanceof TelemetryConfig) {
            TelemetryConfig telemetryConfigB = Wj.b();
            Wj.f23759g = new C2964jk(new Yj(telemetryConfigB.getEnabled(), telemetryConfigB.getAssetConfig().isImageEnabled(), telemetryConfigB.getAssetConfig().isGifEnabled(), telemetryConfigB.getAssetConfig().isVideoEnabled(), telemetryConfigB.isGeneralEventsDisabled(), telemetryConfigB.getPriorityEventsList(), telemetryConfigB.getSamplingFactor()), nj.b0.O0(Wj.f23755c));
            C2864fk c2864fk = Wj.f23761i;
            if (c2864fk != null) {
                TelemetryConfig telemetryConfigB2 = Wj.b();
                ck.p.j(telemetryConfigB2, "telemetryConfig");
                c2864fk.f24382a = telemetryConfigB2;
            }
        }
    }
}
