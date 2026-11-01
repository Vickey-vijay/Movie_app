package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.impl.C4293jc;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.jc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4293jc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f57014a = 5;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4151e f57015b;

    public final void a(final AnrListener anrListener) {
        C4151e c4151e = this.f57015b;
        c4151e.f56619a.add(new InterfaceC4100c() { // from class: af.i0
            @Override // io.appmetrica.analytics.impl.InterfaceC4100c
            public final void onAppNotResponding() {
                C4293jc.b(anrListener);
            }
        });
    }

    public C4293jc(InterfaceC4204g0 interfaceC4204g0) {
        this.f57015b = new C4151e(new Eb(interfaceC4204g0));
    }

    public static final void b(AnrListener anrListener) {
        anrListener.onAppNotResponding();
    }
}
