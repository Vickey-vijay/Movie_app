package com.unity3d.ads.core.domain.events;

import ck.p;
import com.unity3d.ads.core.domain.GetByteStringId;
import com.unity3d.ads.core.extensions.TimestampExtensionsKt;
import com.unity3d.ads.core.extensions.TransactionStateExtensionsKt;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import gatewayprotocol.v1.TransactionDataKt;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import org.json.JSONException;

/* JADX INFO: compiled from: AndroidGetTransactionData.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class AndroidGetTransactionData implements GetTransactionData {
    private final GetByteStringId getByteStringId;

    public AndroidGetTransactionData(GetByteStringId getByteStringId) {
        p.j(getByteStringId, "getByteStringId");
        this.getByteStringId = getByteStringId;
    }

    @Override // com.unity3d.ads.core.domain.events.GetTransactionData
    public TransactionEventRequestOuterClass.TransactionData invoke(PurchaseBridge purchaseBridge, String str) throws JSONException {
        p.j(purchaseBridge, "purchaseDetail");
        p.j(str, "productDetailJson");
        TransactionDataKt.Dsl.Companion companion = TransactionDataKt.Dsl.Companion;
        TransactionEventRequestOuterClass.TransactionData.Builder builderNewBuilder = TransactionEventRequestOuterClass.TransactionData.newBuilder();
        p.i(builderNewBuilder, "newBuilder()");
        TransactionDataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setProductId(purchaseBridge.getOriginalJson().get(InAppPurchaseMetaData.KEY_PRODUCT_ID).toString());
        dsl_create.setEventId(this.getByteStringId.invoke());
        Object obj = purchaseBridge.getOriginalJson().get("purchaseTime");
        p.h(obj, "null cannot be cast to non-null type kotlin.Long");
        dsl_create.setTimestamp(TimestampExtensionsKt.fromMillis(((Long) obj).longValue()));
        dsl_create.setTransactionId(purchaseBridge.getOriginalJson().get("orderId").toString());
        dsl_create.setProduct(str);
        String string = purchaseBridge.getOriginalJson().toString();
        p.i(string, "purchaseDetail.originalJson.toString()");
        dsl_create.setTransaction(string);
        String signature = purchaseBridge.getSignature();
        p.i(signature, "purchaseDetail.signature");
        dsl_create.setSignature(signature);
        Object obj2 = purchaseBridge.getOriginalJson().get("purchaseState");
        p.h(obj2, "null cannot be cast to non-null type kotlin.Int");
        dsl_create.setTransactionState(TransactionStateExtensionsKt.fromPurchaseState(((Integer) obj2).intValue()));
        return dsl_create._build();
    }
}
