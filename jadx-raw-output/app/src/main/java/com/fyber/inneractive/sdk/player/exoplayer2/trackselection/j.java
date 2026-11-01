package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

import com.fyber.inneractive.sdk.player.exoplayer2.source.z;
import com.fyber.inneractive.sdk.player.exoplayer2.t;

/* JADX INFO: loaded from: classes10.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f17648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f17649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f17650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t[] f17651d;

    public final boolean a(j jVar, int i10) {
        return jVar != null && com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(this.f17649b.f17646b[i10], jVar.f17649b.f17646b[i10]) && com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(this.f17651d[i10], jVar.f17651d[i10]);
    }

    public j(z zVar, h hVar, f fVar, t[] tVarArr) {
        this.f17648a = zVar;
        this.f17649b = hVar;
        this.f17650c = fVar;
        this.f17651d = tVarArr;
    }
}
