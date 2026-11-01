package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class E0 implements Comparable<E0> {
    public final boolean A00;
    public final boolean A01;

    public E0(C2654or c2654or, int i10) {
        this.A00 = (c2654or.A0H & 1) != 0;
        this.A01 = AnonymousClass92.A0S(i10, false);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(E0 e10) {
        return AbstractC2485m4.A01().A09(this.A01, e10.A01).A09(this.A00, e10.A00).A05();
    }
}
