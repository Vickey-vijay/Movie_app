package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class Xm implements InterfaceC4202fo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f56189a;

    @Override // io.appmetrica.analytics.impl.InterfaceC4202fo
    public final void a(C4176eo c4176eo) {
        Iterator it = this.f56189a.iterator();
        while (it.hasNext()) {
            ((Zm) it.next()).a(c4176eo);
        }
    }

    public Xm(String str, List<String> list, int i10, Mn mn2, to toVar, K2 k10) {
        List listI0 = nj.b0.I0(nj.b0.O0(nj.b0.T0(list)), i10);
        ArrayList arrayList = new ArrayList(nj.t.v(listI0, 10));
        int i11 = 0;
        for (Object obj : listI0) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                nj.s.u();
            }
            arrayList.add(new Zm(str + '_' + i11, (String) obj, mn2, toVar, k10));
            i11 = i12;
        }
        this.f56189a = arrayList;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4202fo
    public final void a(PublicLogger publicLogger) {
        Iterator it = this.f56189a.iterator();
        while (it.hasNext()) {
            ((Zm) it.next()).f55026e = publicLogger;
        }
    }
}
