package com.monetization.ads.exo.source.dash;

import yads.u13;
import yads.x13;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements u13 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f42915a;

    public a(i iVar) {
        this.f42915a = iVar;
    }

    public final void a() {
        long j10;
        i iVar = this.f42915a;
        synchronized (x13.f84421b) {
            j10 = x13.f84422c ? x13.f84423d : -9223372036854775807L;
        }
        iVar.L = j10;
        iVar.a(true);
    }
}
