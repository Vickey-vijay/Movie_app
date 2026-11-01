package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import ck.i;
import ck.p;
import com.unity3d.services.core.reflection.GenericBridge;
import kotlin.collections.a;
import mj.h;

/* JADX INFO: compiled from: PendingPurchasesParamsBuilderBridge.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class PendingPurchasesParamsBuilderBridge extends GenericBridge {
    private static final String BUILD_METHOD = "build";
    public static final Companion Companion = new Companion(null);
    private static final String ENABLE_ONE_TIME_PRODUCT_METHOD = "enableOneTimeProducts";
    private final Object builderInstance;

    /* JADX INFO: compiled from: PendingPurchasesParamsBuilderBridge.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    public String getClassName() {
        return "com.android.billingclient.api.PendingPurchasesParams$Builder";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PendingPurchasesParamsBuilderBridge(Object obj) {
        super(a.l(h.a(ENABLE_ONE_TIME_PRODUCT_METHOD, new Class[0]), h.a("build", new Class[0])));
        p.j(obj, "builderInstance");
        this.builderInstance = obj;
    }

    public final PendingPurchasesParamsBridge build() {
        return new PendingPurchasesParamsBridge(callNonVoidMethod("build", this.builderInstance, new Object[0]));
    }

    public final PendingPurchasesParamsBuilderBridge enableOneTimeProducts() {
        callVoidMethod(ENABLE_ONE_TIME_PRODUCT_METHOD, this.builderInstance, new Object[0]);
        return this;
    }
}
