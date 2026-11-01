package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.controller.b0;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f17551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f17552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f17553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ IOException f17554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f17555e;

    public d(f fVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar, int i10, int i11, com.fyber.inneractive.sdk.player.exoplayer2.o oVar, int i12, Object obj, long j10, long j11, long j12, long j13, long j14, IOException iOException, boolean z10) {
        this.f17555e = fVar;
        this.f17551a = obj;
        this.f17552b = j10;
        this.f17553c = j11;
        this.f17554d = iOException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b0 b0Var = this.f17555e.f17560b;
        com.fyber.inneractive.sdk.player.exoplayer2.b.a(this.f17552b);
        f.a(this.f17555e, this.f17553c);
        IAlog.a("%s AdaptiveMediaSourceEventListener onLoadError called. with exception %s", b0Var.a(), this.f17554d);
    }
}
