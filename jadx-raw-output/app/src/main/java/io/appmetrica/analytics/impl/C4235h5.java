package io.appmetrica.analytics.impl;

import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.h5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4235h5 implements Co {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f56876a;

    @Override // io.appmetrica.analytics.impl.Co
    public final String a() {
        Iterator it = this.f56876a.iterator();
        while (it.hasNext()) {
            String strA = ((Co) ((Pair) it.next()).getSecond()).a();
            if (strA != null && strA.length() > 0) {
                return strA;
            }
        }
        return null;
    }

    public C4235h5(List<? extends Pair<String, ? extends Co>> list) {
        this.f56876a = list;
    }

    @Override // io.appmetrica.analytics.impl.Co
    public final void a(String str) {
        Iterator it = this.f56876a.iterator();
        while (it.hasNext()) {
            ((Co) ((Pair) it.next()).getSecond()).a(str);
        }
    }
}
