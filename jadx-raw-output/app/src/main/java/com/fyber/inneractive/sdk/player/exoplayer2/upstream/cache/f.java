package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import com.fyber.inneractive.sdk.player.exoplayer2.upstream.o;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.t;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements com.fyber.inneractive.sdk.player.exoplayer2.upstream.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f17685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.g f17686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.g f17687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f17688d;

    public f(l lVar, o oVar) {
        t tVar = new t();
        d dVar = new d(lVar);
        this.f17685a = lVar;
        this.f17686b = oVar;
        this.f17687c = tVar;
        this.f17688d = dVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.h a() {
        l lVar = this.f17685a;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVarA = this.f17686b.a();
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVarA2 = this.f17687c.a();
        d dVar = this.f17688d;
        return new e(lVar, hVarA, hVarA2, dVar != null ? new c(dVar.f17667a) : null);
    }
}
