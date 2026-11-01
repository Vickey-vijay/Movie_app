package com.inmobi.media;

import java.util.BitSet;

/* JADX INFO: loaded from: classes7.dex */
public abstract class I6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D2 f22847a;

    public I6(String str) {
        ck.p.j(str, "b64feature");
        D2 d10 = new D2();
        this.f22847a = d10;
        d10.a(str);
    }

    public final boolean a(boolean z10) {
        BitSet bitSet = this.f22847a.f22492a;
        return bitSet != null ? bitSet.get(0) : z10;
    }
}
