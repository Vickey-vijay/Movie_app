package com.inmobi.media;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class N8 extends fk.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O8 f23222a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N8(Df df2, O8 o10) {
        super(df2);
        this.f23222a = o10;
    }

    @Override // fk.b
    public final void afterChange(jk.k kVar, Object obj, Object obj2) {
        ck.p.j(kVar, "property");
        Df df2 = (Df) obj2;
        if (Ef.a((Df) obj) == Ef.a(df2)) {
            return;
        }
        Iterator it = this.f23222a.f23278b.iterator();
        while (it.hasNext()) {
            ((Gf) it.next()).a(df2);
        }
    }
}
