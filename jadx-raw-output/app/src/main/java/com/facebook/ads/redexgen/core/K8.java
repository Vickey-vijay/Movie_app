package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class K8 implements Comparable<K8> {
    public final int A00;
    public final C1364Jz A01;

    public K8(int i10, C1364Jz c1364Jz) {
        this.A00 = i10;
        this.A01 = c1364Jz;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(K8 k10) {
        return Integer.compare(this.A00, k10.A00);
    }
}
