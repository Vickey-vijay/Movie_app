package io.appmetrica.analytics.impl;

import java.util.LinkedList;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.m9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4367m9 extends Gf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4400nh f57268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4450ph f57269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4092bh f57270c;

    @Override // io.appmetrica.analytics.impl.Gf
    public final X8 a(int i10) {
        LinkedList linkedList = new LinkedList();
        int iOrdinal = EnumC4112cb.a(i10).ordinal();
        if (iOrdinal == 1) {
            linkedList.add(this.f57268a);
        } else if (iOrdinal == 3) {
            linkedList.add(this.f57270c);
        } else if (iOrdinal == 27) {
            linkedList.add(this.f57269b);
            linkedList.add(this.f57268a);
        }
        return new W8(linkedList);
    }

    public C4367m9(Y4 y10) {
        this.f57268a = new C4400nh(y10);
        this.f57269b = new C4450ph(y10);
        this.f57270c = new C4092bh(y10);
    }
}
