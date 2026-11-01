package com.fyber.inneractive.sdk.player.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import com.fyber.inneractive.sdk.player.controller.b0;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements u, t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f17609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.g f17610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.k f17611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f17613e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b0 f17614f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.v f17615g = new com.fyber.inneractive.sdk.player.exoplayer2.v();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public t f17616h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f17617i;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.u
    public final void a() {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.u
    public final void a(t tVar) {
        this.f17616h = tVar;
        tVar.a(new x(-9223372036854775807L, -9223372036854775807L, 0L, 0L, false, false), null);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.u
    public final void b() {
        this.f17616h = null;
    }

    public q(Uri uri, com.fyber.inneractive.sdk.player.exoplayer2.upstream.g gVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.c cVar, int i10, Handler handler, b0 b0Var) {
        this.f17609a = uri;
        this.f17610b = gVar;
        this.f17611c = cVar;
        this.f17612d = i10;
        this.f17613e = handler;
        this.f17614f = b0Var;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.u
    public final s a(int i10, com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar, long j10) {
        if (i10 == 0) {
            return new p(this.f17609a, this.f17610b.a(), this.f17611c.a(), this.f17612d, this.f17613e, this.f17614f, this, bVar);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.u
    public final void a(s sVar) {
        p pVar = (p) sVar;
        pVar.f17591i.a(new k(pVar, pVar.f17592j));
        pVar.f17596n.removeCallbacksAndMessages(null);
        pVar.G = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.t
    public final void a(x xVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.g gVar) {
        boolean z10 = xVar.a(0, this.f17615g, false).f17884d != -9223372036854775807L;
        if (!this.f17617i || z10) {
            this.f17617i = z10;
            this.f17616h.a(xVar, null);
        }
    }
}
