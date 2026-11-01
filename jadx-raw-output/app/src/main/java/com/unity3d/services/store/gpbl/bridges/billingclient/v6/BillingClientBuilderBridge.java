package com.unity3d.services.store.gpbl.bridges.billingclient.v6;

import ck.i;
import com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClientBuilderBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBridgeCommon;
import com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBuilderBridgeCommon;
import kotlin.collections.a;
import mj.h;

/* JADX INFO: compiled from: BillingClientBuilderBridge.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class BillingClientBuilderBridge extends BillingClientBuilderBridgeCommon {
    public static final Companion Companion = new Companion(null);
    public static final String ENABLE_PENDING_PURCHASES_METHOD = "enablePendingPurchases";

    /* JADX INFO: compiled from: BillingClientBuilderBridge.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public BillingClientBuilderBridge(Object obj) {
        super(obj, a.l(h.a("enablePendingPurchases", new Class[0])));
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClientBuilderBridge
    public BillingClientBridgeCommon build() throws ClassNotFoundException {
        return new BillingClientBridge(callNonVoidMethod(BillingClientBuilderBridgeCommon.buildMethodName, this._billingClientBuilderInternalInstance, new Object[0]));
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClientBuilderBridge
    public IBillingClientBuilderBridge enablePendingPurchases() {
        this._billingClientBuilderInternalInstance = callNonVoidMethod("enablePendingPurchases", this._billingClientBuilderInternalInstance, new Object[0]);
        return this;
    }
}
