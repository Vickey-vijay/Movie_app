package com.unity3d.services.store.gpbl.bridges;

/* JADX INFO: loaded from: classes10.dex */
public class PurchaseHistoryRecordBridge extends CommonJsonResponseBridge {
    @Override // com.unity3d.services.core.reflection.GenericBridge
    public String getClassName() {
        return "com.android.billingclient.api.PurchaseHistoryRecord";
    }

    public PurchaseHistoryRecordBridge(Object obj) {
        super(obj);
    }
}
