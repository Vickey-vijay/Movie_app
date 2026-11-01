package io.appmetrica.analytics.impl;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class D4 extends Gf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4 f55130a;

    @Override // io.appmetrica.analytics.impl.Gf
    public final X8 a(int i10) {
        ArrayList arrayList = new ArrayList();
        int iOrdinal = EnumC4112cb.a(i10).ordinal();
        if (iOrdinal == 12) {
            arrayList.add(this.f55130a.f55074a);
        } else if (iOrdinal == 14) {
            arrayList.add(this.f55130a.f55075b);
        } else if (iOrdinal == 34) {
            arrayList.add(this.f55130a.f55076c);
        }
        return new W8(arrayList);
    }

    public D4(C4661y4 c4661y4) {
        this.f55130a = new C4(c4661y4);
    }
}
