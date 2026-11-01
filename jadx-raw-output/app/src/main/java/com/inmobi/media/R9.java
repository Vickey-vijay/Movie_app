package com.inmobi.media;

import com.inmobi.media.core.config.models.CrashConfig;

/* JADX INFO: loaded from: classes7.dex */
public final class R9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gi f23441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Gi f23442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Gi f23443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Gi f23444d;

    public R9(CrashConfig crashConfig) {
        ck.p.j(crashConfig, "config");
        this.f23441a = new Gi(crashConfig.getCrashConfig().getSamplingPercent());
        this.f23442b = new Gi(crashConfig.getCatchConfig().getSamplingPercent());
        this.f23443c = new Gi(crashConfig.getANRConfig().getWatchdog().getSamplingPercent());
        this.f23444d = new Gi(crashConfig.getANRConfig().getAppExitReason().getSamplingPercent());
    }
}
