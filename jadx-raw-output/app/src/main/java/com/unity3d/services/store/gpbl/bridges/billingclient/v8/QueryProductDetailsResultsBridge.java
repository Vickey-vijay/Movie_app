package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import ck.i;
import ck.p;
import com.unity3d.services.core.reflection.GenericBridge;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mj.h;
import nj.l0;
import nj.s;
import nj.t;

/* JADX INFO: compiled from: QueryProductDetailsResultsBridge.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class QueryProductDetailsResultsBridge extends GenericBridge {
    public static final Companion Companion = new Companion(null);
    private static final String GET_PRODUCT_DETAILS_LIST_METHOD = "getProductDetailsList";
    private final Object productDetailsResult;

    /* JADX INFO: compiled from: QueryProductDetailsResultsBridge.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    public String getClassName() {
        return "com.android.billingclient.api.QueryProductDetailsResult";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryProductDetailsResultsBridge(Object obj) {
        super(l0.g(h.a(GET_PRODUCT_DETAILS_LIST_METHOD, new Class[0])));
        p.j(obj, "productDetailsResult");
        this.productDetailsResult = obj;
    }

    public final List<ProductDetailsBridge> getProductDetailsList() {
        List list = (List) callNonVoidMethod(GET_PRODUCT_DETAILS_LIST_METHOD, this.productDetailsResult, new Object[0]);
        if (list == null) {
            return s.k();
        }
        ArrayList arrayList = new ArrayList(t.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new ProductDetailsBridge(it.next()));
        }
        return arrayList;
    }
}
