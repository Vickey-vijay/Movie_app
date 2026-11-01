package com.fyber.inneractive.sdk.player.exoplayer2.source.chunk;

import com.fyber.inneractive.sdk.player.exoplayer2.o;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.h;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.k;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.z;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f17542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f17544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f17546e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f17547f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f17548g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f17549h;

    public abstract long c();

    public a(int i10, int i11, long j10, long j11, o oVar, h hVar, k kVar, Object obj) {
        hVar.getClass();
        this.f17549h = hVar;
        this.f17542a = kVar;
        this.f17543b = i10;
        this.f17544c = oVar;
        this.f17545d = i11;
        this.f17546e = obj;
        this.f17547f = j10;
        this.f17548g = j11;
    }
}
