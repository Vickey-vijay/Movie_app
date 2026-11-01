package com.unity3d.ads.core.domain.events;

import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import java.util.List;
import rj.c;

/* JADX INFO: compiled from: GetTransactionRequest.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface GetTransactionRequest {
    Object invoke(List<TransactionEventRequestOuterClass.TransactionData> list, String str, TransactionEventRequestOuterClass.TransactionOrigin transactionOrigin, c<? super TransactionEventRequestOuterClass.TransactionEventRequest> cVar);
}
