package io.appmetrica.analytics.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class Dh implements InterfaceC4234h4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z4 f55142a;

    @Override // io.appmetrica.analytics.impl.InterfaceC4234h4
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Bg a(Context context, C4157e5 c4157e5, Q3 q10, C4462q4 c4462q4) {
        Cg cg2;
        R4 r10 = new R4(q10.f55769b, q10.f55768a);
        Dg dg2 = new Dg(this.f55142a);
        synchronized (c4157e5) {
            cg2 = (Cg) c4157e5.a(r10, c4462q4, dg2, c4157e5.f56636a);
        }
        return new Bg(context, cg2);
    }

    public Dh(Z4 z10) {
        this.f55142a = z10;
    }
}
