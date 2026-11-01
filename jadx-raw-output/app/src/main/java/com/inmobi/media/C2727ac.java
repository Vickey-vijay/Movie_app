package com.inmobi.media;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.ac, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2727ac implements Zb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Zb f23972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f23973b;

    public C2727ac(Zb zb2) {
        ck.p.j(zb2, "mediaChangeReceiver");
        this.f23972a = zb2;
        this.f23973b = new AtomicBoolean(false);
    }

    @Override // com.inmobi.media.Zb
    public final void a() {
        if (this.f23973b.getAndSet(false)) {
            this.f23972a.a();
        }
    }

    @Override // com.inmobi.media.Zb
    public final void b() {
        if (this.f23973b.getAndSet(true)) {
            return;
        }
        this.f23972a.b();
    }
}
