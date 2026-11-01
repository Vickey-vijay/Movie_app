package com.unity3d.ads.core.domain.events;

import ck.p;
import com.google.protobuf.ByteString;
import com.ironsource.C3426d4;
import com.unity3d.ads.core.domain.GetSharedDataTimestamps;
import gatewayprotocol.v1.DiagnosticEventKt;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Map;
import qk.l;
import qk.v;

/* JADX INFO: compiled from: GetDiagnosticEventRequest.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class GetDiagnosticEventRequest {
    private final GetSharedDataTimestamps getSharedDataTimestamps;
    private final l<Integer> uniqueId;

    public GetDiagnosticEventRequest(GetSharedDataTimestamps getSharedDataTimestamps) {
        p.j(getSharedDataTimestamps, "getSharedDataTimestamps");
        this.getSharedDataTimestamps = getSharedDataTimestamps;
        this.uniqueId = v.a(-1);
    }

    public final DiagnosticEventRequestOuterClass.DiagnosticEvent invoke(String str, Map<String, String> map, Map<String, Integer> map2, Double d10, Boolean bool, ByteString byteString, String str2, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, Integer num) {
        Integer value;
        Integer numValueOf;
        p.j(str, C3426d4.i.f28547j0);
        DiagnosticEventKt.Dsl.Companion companion = DiagnosticEventKt.Dsl.Companion;
        DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder builderNewBuilder = DiagnosticEventRequestOuterClass.DiagnosticEvent.newBuilder();
        p.i(builderNewBuilder, "newBuilder()");
        DiagnosticEventKt.Dsl dsl_create = companion._create(builderNewBuilder);
        l<Integer> lVar = this.uniqueId;
        do {
            value = lVar.getValue();
            numValueOf = Integer.valueOf(value.intValue() + 1);
        } while (!lVar.a(value, numValueOf));
        dsl_create.setEventId(numValueOf.intValue());
        dsl_create.setEventType(DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_CUSTOM);
        dsl_create.setTimestamps(this.getSharedDataTimestamps.invoke());
        dsl_create.setCustomEventType(str);
        if (map != null) {
            dsl_create.putAllStringTags(dsl_create.getStringTagsMap(), map);
        }
        if (map2 != null) {
            dsl_create.putAllIntTags(dsl_create.getIntTagsMap(), map2);
        }
        if (d10 != null) {
            dsl_create.setTimeValue(d10.doubleValue());
        }
        if (bool != null) {
            dsl_create.setIsHeaderBidding(bool.booleanValue());
        }
        if (byteString != null) {
            dsl_create.setImpressionOpportunityId(byteString);
        }
        if (str2 != null) {
            dsl_create.setPlacementId(str2);
        }
        if (diagnosticAdType != null) {
            dsl_create.setAdType(diagnosticAdType);
        }
        if (num != null) {
            dsl_create.setHeaderBiddingTokenNumber(num.intValue());
        }
        return dsl_create._build();
    }
}
