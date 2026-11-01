package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.source.s;
import com.fyber.inneractive.sdk.player.exoplayer2.source.t;
import com.fyber.inneractive.sdk.player.exoplayer2.source.u;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.b0;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.d0;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.y;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public final class j implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f16581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f16582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.source.f f16583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.k f16584d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public t f16585e;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.u
    public final void a(t tVar) {
        if (this.f16584d != null) {
            throw new IllegalStateException();
        }
        Uri uri = this.f16581a;
        b bVar = this.f16582b;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.k kVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.k(uri, bVar, this.f16583c, this);
        this.f16584d = kVar;
        this.f16585e = tVar;
        d0 d0Var = new d0(bVar.f16522a.a(), uri, kVar.f16691b);
        b0 b0Var = kVar.f16697h;
        b0Var.getClass();
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            throw new IllegalStateException();
        }
        y yVar = new y(b0Var, looperMyLooper, d0Var, kVar, 3, SystemClock.elapsedRealtime());
        if (b0Var.f17655b != null) {
            throw new IllegalStateException();
        }
        b0Var.f17655b = yVar;
        yVar.f17806e = null;
        b0Var.f17654a.execute(yVar);
    }

    public j(Uri uri, com.fyber.inneractive.sdk.player.exoplayer2.upstream.g gVar, Handler handler, com.fyber.inneractive.sdk.player.controller.b0 b0Var) {
        b bVar = new b(gVar);
        this.f16581a = uri;
        this.f16582b = bVar;
        this.f16583c = new com.fyber.inneractive.sdk.player.exoplayer2.source.f(handler, b0Var);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.u
    public final void b() {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.k kVar = this.f16584d;
        if (kVar != null) {
            kVar.f16697h.a(null);
            Iterator it = kVar.f16693d.values().iterator();
            while (it.hasNext()) {
                ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h) it.next()).f16680b.a(null);
            }
            kVar.f16694e.removeCallbacksAndMessages(null);
            kVar.f16693d.clear();
            this.f16584d = null;
        }
        this.f16585e = null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.u
    public final void a() throws IOException {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.k kVar = this.f16584d;
        kVar.f16697h.b();
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar = kVar.f16700k;
        if (aVar != null) {
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h hVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h) kVar.f16693d.get(aVar);
            hVar.f16680b.b();
            IOException iOException = hVar.f16688j;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.u
    public final s a(int i10, com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar, long j10) {
        if (i10 == 0) {
            return new i(this.f16584d, this.f16582b, this.f16583c, bVar, j10);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.u
    public final void a(s sVar) {
        i iVar = (i) sVar;
        iVar.f16565a.f16696g.remove(iVar);
        iVar.f16572h.removeCallbacksAndMessages(null);
        n[] nVarArr = iVar.f16578n;
        if (nVarArr != null) {
            for (n nVar : nVarArr) {
                int size = nVar.f16598j.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) nVar.f16598j.valueAt(i10)).b();
                }
                nVar.f16595g.a(null);
                nVar.f16601m.removeCallbacksAndMessages(null);
                nVar.f16607s = true;
            }
        }
    }
}
