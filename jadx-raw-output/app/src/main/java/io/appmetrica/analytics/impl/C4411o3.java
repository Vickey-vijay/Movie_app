package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.o3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4411o3 implements InterfaceC4125co {
    @Override // io.appmetrica.analytics.impl.InterfaceC4125co, bk.p
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<C4510s3> mo1invoke(List<C4510s3> list, C4510s3 c4510s3) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                T7 t10 = ((C4510s3) it.next()).f57646b;
                T7 t11 = c4510s3.f57646b;
                if (t10 == t11) {
                    if (t11 != T7.f55911c) {
                        return null;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (((C4510s3) obj).f57646b != T7.f55911c) {
                            arrayList.add(obj);
                        }
                    }
                    return nj.b0.z0(arrayList, c4510s3);
                }
            }
        }
        return nj.b0.z0(list, c4510s3);
    }
}
