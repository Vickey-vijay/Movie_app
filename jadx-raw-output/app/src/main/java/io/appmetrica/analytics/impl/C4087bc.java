package io.appmetrica.analytics.impl;

import android.content.Context;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.bc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4087bc implements InterfaceC4234h4 {
    @Override // io.appmetrica.analytics.impl.InterfaceC4234h4
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C4586v4 a(Context context, C4157e5 c4157e5, Q3 q10, C4462q4 c4462q4) {
        C4661y4 c4661y4;
        C4611w4 c4611w4 = new C4611w4(q10.f55769b);
        C4686z4 c4686z4 = new C4686z4();
        synchronized (c4157e5) {
            c4661y4 = (C4661y4) c4157e5.a(c4611w4, c4462q4, c4686z4, c4157e5.f56637b);
        }
        return new C4586v4(context, c4661y4, c4462q4);
    }
}
