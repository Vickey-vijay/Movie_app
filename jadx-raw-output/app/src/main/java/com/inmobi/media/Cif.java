package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import okhttp3.Dispatcher;

/* JADX INFO: renamed from: com.inmobi.media.if, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class Cif {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3227u9 f24557a;

    public Cif(AdConfig.PingsV2Config pingsV2Config) {
        ck.p.j(pingsV2Config, "pingsConfig");
        Dispatcher dispatcher = new Dispatcher();
        dispatcher.setMaxRequests(pingsV2Config.getMaxBatchSize().getHigh());
        mj.r rVar = mj.r.f64562a;
        this.f24557a = C3177s9.a(null, dispatcher, null, new C3114pk(pingsV2Config.getConnectTimeout(), pingsV2Config.getReadTimeout(), pingsV2Config.getCallTimeout()), 5);
    }
}
