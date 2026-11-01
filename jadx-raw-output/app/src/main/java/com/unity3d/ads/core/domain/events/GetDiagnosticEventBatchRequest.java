package com.unity3d.ads.core.domain.events;

import ck.p;
import gatewayprotocol.v1.DiagnosticEventRequestKt;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.List;

/* JADX INFO: compiled from: GetDiagnosticEventBatchRequest.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class GetDiagnosticEventBatchRequest {
    public final DiagnosticEventRequestOuterClass.DiagnosticEventRequest invoke(List<DiagnosticEventRequestOuterClass.DiagnosticEvent> list) {
        p.j(list, "diagnosticEvents");
        DiagnosticEventRequestKt.Dsl.Companion companion = DiagnosticEventRequestKt.Dsl.Companion;
        DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder builderNewBuilder = DiagnosticEventRequestOuterClass.DiagnosticEventRequest.newBuilder();
        p.i(builderNewBuilder, "newBuilder()");
        DiagnosticEventRequestKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.addAllBatch(dsl_create.getBatch(), list);
        return dsl_create._build();
    }
}
