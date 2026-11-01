package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;

/* JADX INFO: loaded from: classes5.dex */
public final class d0 implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f17725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f17726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f17727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e f17728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f17729e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile long f17730f;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final void b() {
        this.f17729e = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final boolean a() {
        return this.f17729e;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final void load() {
        j jVar = new j(this.f17726b, this.f17725a);
        try {
            jVar.f17741a.a(jVar.f17742b);
            jVar.f17744d = true;
            this.f17728d = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.g) this.f17727c).a(this.f17726b.a(), jVar);
        } finally {
            this.f17730f = jVar.f17746f;
            com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(jVar);
        }
    }

    public d0(h hVar, Uri uri, c0 c0Var) {
        this.f17726b = hVar;
        this.f17725a = new k(uri, 0L, 0L, -1L, null, 1);
        this.f17727c = c0Var;
    }
}
