package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ra, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4492ra extends D2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC4567ua f57598b;

    public C4492ra(int i10) {
        this(i10, null);
    }

    public int b(@Nullable Object obj) {
        return 0;
    }

    public C4492ra(int i10, @Nullable InterfaceC4567ua interfaceC4567ua) {
        super(i10);
        this.f57598b = interfaceC4567ua;
    }

    @Override // io.appmetrica.analytics.impl.D2, io.appmetrica.analytics.impl.InterfaceC4567ua
    @NonNull
    public final Nn a(@Nullable List<Object> list) {
        int iB;
        int i10 = 0;
        if (list == null || (list.size() <= this.f55129a && this.f57598b == null)) {
            iB = 0;
        } else {
            ArrayList arrayList = new ArrayList();
            iB = 0;
            int i11 = 0;
            for (Object obj : list) {
                if (i11 < this.f55129a) {
                    InterfaceC4567ua interfaceC4567ua = this.f57598b;
                    if (interfaceC4567ua != null) {
                        Nn nnA = interfaceC4567ua.a(obj);
                        Object obj2 = nnA.f55658a;
                        iB += nnA.f55659b.getBytesTruncated();
                        mo.a(obj, nnA.f55658a);
                        obj = obj2;
                    }
                    arrayList.add(obj);
                } else {
                    i10++;
                    iB += b(obj);
                }
                i11++;
            }
            list = arrayList;
        }
        return new Nn(list, new C4412o4(i10, iB));
    }

    @Nullable
    @VisibleForTesting
    public final InterfaceC4567ua b() {
        return this.f57598b;
    }
}
