package com.inmobi.media;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public final class Jd implements InterfaceC3326y8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Nm f22925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f22926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f22927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f22928d;

    @Override // com.inmobi.media.InterfaceC3326y8
    public final void a() {
    }

    public Jd(Nm nm2) {
        ck.p.j(nm2, "videoMRC50Model");
        this.f22925a = nm2;
        this.f22926b = new AtomicBoolean(false);
    }

    @Override // com.inmobi.media.InterfaceC3326y8
    public final qk.c b() {
        return qk.e.h(new Id(this, null));
    }
}
