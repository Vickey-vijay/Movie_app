package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.controller.b0;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f17556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f17557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f17558c;

    public e(f fVar, int i10, com.fyber.inneractive.sdk.player.exoplayer2.o oVar, int i11, Object obj, long j10) {
        this.f17558c = fVar;
        this.f17556a = obj;
        this.f17557b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b0 b0Var = this.f17558c.f17560b;
        com.fyber.inneractive.sdk.player.exoplayer2.b.a(this.f17557b);
        IAlog.a("%s AdaptiveMediaSourceEventListener onDownstreamFormatChanged called.", b0Var.a());
    }
}
