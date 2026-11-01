package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import ck.i;
import ck.p;
import com.ironsource.C3426d4;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.services.core.reflection.GenericBridge;
import kotlin.collections.a;
import mj.h;

/* JADX INFO: compiled from: ProductBuilderBridge.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class ProductBuilderBridge extends GenericBridge {
    private static final String BUILD_METHOD = "build";
    public static final Companion Companion = new Companion(null);
    private static final String SET_PRODUCT_ID_METHOD = "setProductId";
    private static final String SET_PRODUCT_TYPE_METHOD = "setProductType";
    private Object builderInstance;

    /* JADX INFO: compiled from: ProductBuilderBridge.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    public String getClassName() {
        return "com.android.billingclient.api.QueryProductDetailsParams$Product$Builder";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductBuilderBridge(Object obj) {
        super(a.m(h.a(SET_PRODUCT_ID_METHOD, new Class[]{String.class}), h.a(SET_PRODUCT_TYPE_METHOD, new Class[]{String.class}), h.a("build", new Class[0])));
        p.j(obj, "builderInstance");
        this.builderInstance = obj;
    }

    public final ProductBridge build() {
        return new ProductBridge(callNonVoidMethod("build", this.builderInstance, new Object[0]));
    }

    public final ProductBuilderBridge setProductId(String str) {
        p.j(str, InAppPurchaseMetaData.KEY_PRODUCT_ID);
        Object objCallNonVoidMethod = callNonVoidMethod(SET_PRODUCT_ID_METHOD, this.builderInstance, str);
        p.i(objCallNonVoidMethod, "callNonVoidMethod(SET_PR…ilderInstance, productId)");
        this.builderInstance = objCallNonVoidMethod;
        return this;
    }

    public final ProductBuilderBridge setProductType(String str) {
        p.j(str, C3426d4.i.f28552m);
        Object objCallNonVoidMethod = callNonVoidMethod(SET_PRODUCT_TYPE_METHOD, this.builderInstance, str);
        p.i(objCallNonVoidMethod, "callNonVoidMethod(SET_PR…derInstance, productType)");
        this.builderInstance = objCallNonVoidMethod;
        return this;
    }
}
