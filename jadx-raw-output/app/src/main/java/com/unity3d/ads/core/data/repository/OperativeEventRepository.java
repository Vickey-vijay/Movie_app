package com.unity3d.ads.core.data.repository;

import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import kotlinx.coroutines.channels.BufferOverflow;
import qk.e;
import qk.k;
import qk.p;
import qk.q;

/* JADX INFO: compiled from: OperativeEventRepository.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class OperativeEventRepository {
    private final k<OperativeEventRequestOuterClass.OperativeEventRequest> _operativeEvents;
    private final p<OperativeEventRequestOuterClass.OperativeEventRequest> operativeEvents;

    public final void addOperativeEvent(OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest) {
        ck.p.j(operativeEventRequest, "operativeEventRequest");
        this._operativeEvents.h(operativeEventRequest);
    }

    public final p<OperativeEventRequestOuterClass.OperativeEventRequest> getOperativeEvents() {
        return this.operativeEvents;
    }

    public OperativeEventRepository() {
        k<OperativeEventRequestOuterClass.OperativeEventRequest> kVarA = q.a(10, 10, BufferOverflow.DROP_OLDEST);
        this._operativeEvents = kVarA;
        this.operativeEvents = e.a(kVarA);
    }
}
