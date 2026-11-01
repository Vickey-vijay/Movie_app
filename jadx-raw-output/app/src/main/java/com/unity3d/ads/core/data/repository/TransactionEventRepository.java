package com.unity3d.ads.core.data.repository;

import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import qk.p;

/* JADX INFO: compiled from: TransactionEventRepository.kt */
/* JADX INFO: loaded from: classes7.dex */
public interface TransactionEventRepository {
    void addTransactionEvent(TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest);

    p<TransactionEventRequestOuterClass.TransactionEventRequest> getTransactionEvents();
}
