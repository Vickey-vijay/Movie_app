package com.facebook.ads.redexgen.core;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.pf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2687pf {
    public final InterfaceC2692pk A00;
    public final String A01;
    public final Collection<C2701pu> A02;
    public final Collection<C2701pu> A03;
    public final List<Rect> A04;

    public C2687pf(String str, InterfaceC2692pk interfaceC2692pk, List<Rect> rects, Collection<C2701pu> collection, Collection<C2701pu> collection2) {
        this.A01 = str;
        this.A00 = interfaceC2692pk;
        this.A04 = new ArrayList(rects);
        this.A02 = collection;
        this.A03 = collection2;
    }
}
