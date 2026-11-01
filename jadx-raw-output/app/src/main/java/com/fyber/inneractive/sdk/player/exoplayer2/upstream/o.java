package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.content.Context;

/* JADX INFO: loaded from: classes9.dex */
public final class o implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f17769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f17770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f17771c;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public final h a() {
        return new n(this.f17769a, this.f17770b, this.f17771c.a());
    }

    public o(Context context, m mVar, q qVar) {
        this.f17769a = context.getApplicationContext();
        this.f17770b = mVar;
        this.f17771c = qVar;
    }
}
