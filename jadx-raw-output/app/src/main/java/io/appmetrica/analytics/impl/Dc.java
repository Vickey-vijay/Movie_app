package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* JADX INFO: loaded from: classes2.dex */
public final class Dc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ym f55133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ym f55134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4387n4 f55135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PublicLogger f55136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f55137e;

    public Dc(String str, PublicLogger publicLogger) {
        this(new C4387n4(30), new Ym(50, str.concat("map key"), publicLogger), new Ym(4000, str.concat("map value"), publicLogger), str, publicLogger);
    }

    public Dc(C4387n4 c4387n4, Ym ym2, Ym ym3, String str, PublicLogger publicLogger) {
        this.f55135c = c4387n4;
        this.f55133a = ym2;
        this.f55134b = ym3;
        this.f55137e = str;
        this.f55136d = publicLogger;
    }
}
