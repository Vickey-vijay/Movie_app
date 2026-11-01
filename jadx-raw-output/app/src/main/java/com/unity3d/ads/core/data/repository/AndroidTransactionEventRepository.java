package com.unity3d.ads.core.data.repository;

import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import kotlinx.coroutines.channels.BufferOverflow;
import qk.e;
import qk.k;
import qk.p;
import qk.q;

/* JADX INFO: compiled from: AndroidTransactionEventRepository.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class AndroidTransactionEventRepository implements TransactionEventRepository {
    private final k<TransactionEventRequestOuterClass.TransactionEventRequest> _transactionEvents;
    private final p<TransactionEventRequestOuterClass.TransactionEventRequest> transactionEvents;

    @Override // com.unity3d.ads.core.data.repository.TransactionEventRepository
    public p<TransactionEventRequestOuterClass.TransactionEventRequest> getTransactionEvents() {
        return this.transactionEvents;
    }

    public AndroidTransactionEventRepository() {
        k<TransactionEventRequestOuterClass.TransactionEventRequest> kVarA = q.a(10, 10, BufferOverflow.DROP_OLDEST);
        this._transactionEvents = kVarA;
        this.transactionEvents = e.a(kVarA);
    }

    @Override // com.unity3d.ads.core.data.repository.TransactionEventRepository
    public void addTransactionEvent(TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest) {
        ck.p.j(transactionEventRequest, "transactionEventRequest");
        this._transactionEvents.h(transactionEventRequest);
    }
}
