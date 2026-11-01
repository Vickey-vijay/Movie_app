package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.o;
import com.fyber.inneractive.sdk.player.exoplayer2.r;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.b0;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.d0;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.x;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.b f16690a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.j f16695f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.source.f f16698i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f16699j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a f16700k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public d f16701l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f16702m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16692c = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f16696g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b0 f16697h = new b0("HlsPlaylistTracker:MasterPlaylist");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f16691b = new g();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IdentityHashMap f16693d = new IdentityHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f16694e = new Handler();

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final void a(z zVar, long j10, long j11, boolean z10) {
        d0 d0Var = (d0) zVar;
        com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar = this.f16698i;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = d0Var.f17725a;
        long j12 = d0Var.f17730f;
        if (fVar.f17560b != null) {
            fVar.f17559a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.c(fVar, kVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j10, j11, j12));
        }
    }

    public k(Uri uri, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.b bVar, com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.j jVar) {
        this.f16690a = bVar;
        this.f16698i = fVar;
        this.f16695f = jVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final void a(z zVar, long j10, long j11) {
        b bVar;
        d0 d0Var = (d0) zVar;
        e eVar = d0Var.f17728d;
        boolean z10 = eVar instanceof d;
        if (z10) {
            List listSingletonList = Collections.singletonList(new a(eVar.f16653a, new o("0", "application/x-mpegURL", null, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, null, null)));
            List listEmptyList = Collections.emptyList();
            bVar = new b(null, listSingletonList, listEmptyList, listEmptyList, null, null);
        } else {
            bVar = (b) eVar;
        }
        this.f16699j = bVar;
        this.f16700k = (a) bVar.f16625b.get(0);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(bVar.f16625b);
        arrayList.addAll(bVar.f16626c);
        arrayList.addAll(bVar.f16627d);
        int size = arrayList.size();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = (a) arrayList.get(i10);
            this.f16693d.put(aVar, new h(this, aVar, jElapsedRealtime));
        }
        h hVar = (h) this.f16693d.get(this.f16700k);
        if (z10) {
            hVar.a((d) eVar);
        } else {
            hVar.b();
        }
        com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar = this.f16698i;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = d0Var.f17725a;
        long j12 = d0Var.f17730f;
        if (fVar.f17560b != null) {
            fVar.f17559a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.b(fVar, kVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j10, j11, j12));
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final int a(z zVar, long j10, long j11, IOException iOException) {
        boolean z10;
        d0 d0Var = (d0) zVar;
        boolean z11 = iOException instanceof r;
        com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar = this.f16698i;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = d0Var.f17725a;
        long j12 = d0Var.f17730f;
        if (fVar.f17560b != null) {
            z10 = z11;
            fVar.f17559a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.d(fVar, kVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j10, j11, j12, iOException, z10));
        } else {
            z10 = z11;
        }
        return z10 ? 3 : 0;
    }

    public final d a(a aVar) {
        d dVar;
        h hVar = (h) this.f16693d.get(aVar);
        hVar.getClass();
        hVar.f16685g = SystemClock.elapsedRealtime();
        d dVar2 = hVar.f16682d;
        if (dVar2 != null && this.f16699j.f16625b.contains(aVar) && (((dVar = this.f16701l) == null || !dVar.f16647j) && ((h) this.f16693d.get(this.f16700k)).f16685g - SystemClock.elapsedRealtime() > 15000)) {
            this.f16700k = aVar;
            ((h) this.f16693d.get(aVar)).b();
        }
        return dVar2;
    }
}
