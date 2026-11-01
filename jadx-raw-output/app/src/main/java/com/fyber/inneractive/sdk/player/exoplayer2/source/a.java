package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.controller.b0;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f17530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f17531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f17532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f17533d;

    public a(f fVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar, int i10, int i11, com.fyber.inneractive.sdk.player.exoplayer2.o oVar, int i12, Object obj, long j10, long j11, long j12) {
        this.f17533d = fVar;
        this.f17530a = obj;
        this.f17531b = j10;
        this.f17532c = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b0 b0Var = this.f17533d.f17560b;
        com.fyber.inneractive.sdk.player.exoplayer2.b.a(this.f17531b);
        f.a(this.f17533d, this.f17532c);
        IAlog.a("%s AdaptiveMediaSourceEventListener onLoadStarted called.", b0Var.a());
    }
}
