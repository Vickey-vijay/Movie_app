package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.controller.b0;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f17534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f17535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f17536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f17537d;

    public b(f fVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar, int i10, int i11, com.fyber.inneractive.sdk.player.exoplayer2.o oVar, int i12, Object obj, long j10, long j11, long j12, long j13, long j14) {
        this.f17537d = fVar;
        this.f17534a = obj;
        this.f17535b = j10;
        this.f17536c = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b0 b0Var = this.f17537d.f17560b;
        com.fyber.inneractive.sdk.player.exoplayer2.b.a(this.f17535b);
        f.a(this.f17537d, this.f17536c);
        IAlog.a("%s AdaptiveMediaSourceEventListener onLoadCompleted called.", b0Var.a());
    }
}
