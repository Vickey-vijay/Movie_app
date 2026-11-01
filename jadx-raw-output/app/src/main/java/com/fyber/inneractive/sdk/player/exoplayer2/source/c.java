package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.controller.b0;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f17538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f17539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f17540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f17541d;

    public c(f fVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar, int i10, int i11, com.fyber.inneractive.sdk.player.exoplayer2.o oVar, int i12, Object obj, long j10, long j11, long j12, long j13, long j14) {
        this.f17541d = fVar;
        this.f17538a = obj;
        this.f17539b = j10;
        this.f17540c = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b0 b0Var = this.f17541d.f17560b;
        com.fyber.inneractive.sdk.player.exoplayer2.b.a(this.f17539b);
        f.a(this.f17541d, this.f17540c);
        IAlog.a("%s AdaptiveMediaSourceEventListener onLoadCanceled called.", b0Var.a());
    }
}
