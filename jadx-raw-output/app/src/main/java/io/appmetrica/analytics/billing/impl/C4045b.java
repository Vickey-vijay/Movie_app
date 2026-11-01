package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.billing.impl.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4045b implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f54433a;

    /* JADX WARN: Multi-variable type inference failed */
    public C4045b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final d fromModel(C4044a c4044a) {
        d dVar = new d();
        List list = c4044a.f54431a;
        ArrayList arrayList = new ArrayList(nj.t.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f54433a.fromModel((BillingInfo) it.next()));
        }
        Object[] array = arrayList.toArray(new c[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        dVar.f54444a = (c[]) array;
        dVar.f54445b = c4044a.f54432b;
        return dVar;
    }

    public C4045b(i iVar) {
        this.f54433a = iVar;
    }

    public /* synthetic */ C4045b(i iVar, int i10, ck.i iVar2) {
        this((i10 & 1) != 0 ? new i() : iVar);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4044a toModel(d dVar) {
        c[] cVarArr = dVar.f54444a;
        ArrayList arrayList = new ArrayList(cVarArr.length);
        for (c cVar : cVarArr) {
            arrayList.add(this.f54433a.toModel(cVar));
        }
        return new C4044a(arrayList, dVar.f54445b);
    }
}
