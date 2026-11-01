package com.unity3d.ads.core.domain;

import ck.p;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.datasource.LifecycleDataSource;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: AndroidSendDiagnosticEvent.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class AndroidSendDiagnosticEvent implements SendDiagnosticEvent {
    private final DiagnosticEventRepository diagnosticEventRepository;
    private final GetDiagnosticEventRequest getDiagnosticEventRequest;
    private final LifecycleDataSource lifecycleDataSource;

    @Override // com.unity3d.ads.core.domain.SendDiagnosticEvent
    public void invoke(String str, Double d10, Map<String, String> map, Map<String, Integer> map2, AdObject adObject, Integer num) {
        Map<String, String> linkedHashMap;
        p.j(str, "event");
        Boolean boolValueOf = adObject != null ? Boolean.valueOf(adObject.isHeaderBidding()) : null;
        ByteString opportunityId = adObject != null ? adObject.getOpportunityId() : null;
        String placementId = adObject != null ? adObject.getPlacementId() : null;
        DiagnosticEventRequestOuterClass.DiagnosticAdType adType = adObject != null ? adObject.getAdType() : null;
        if (map == null || (linkedHashMap = kotlin.collections.a.B(map)) == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        Map<String, String> map3 = linkedHashMap;
        if (adObject != null && adObject.isScarAd()) {
            map3.put("scar", "true");
        }
        if (adObject != null && adObject.isOfferwallAd()) {
            map3.put("offerwall", "true");
        }
        map3.put("app_active", String.valueOf(this.lifecycleDataSource.appIsForeground()));
        this.diagnosticEventRepository.addDiagnosticEvent(this.getDiagnosticEventRequest.invoke(str, map3, map2, d10, boolValueOf, opportunityId, placementId, adType, num));
    }

    public AndroidSendDiagnosticEvent(DiagnosticEventRepository diagnosticEventRepository, GetDiagnosticEventRequest getDiagnosticEventRequest, LifecycleDataSource lifecycleDataSource) {
        p.j(diagnosticEventRepository, "diagnosticEventRepository");
        p.j(getDiagnosticEventRequest, "getDiagnosticEventRequest");
        p.j(lifecycleDataSource, "lifecycleDataSource");
        this.diagnosticEventRepository = diagnosticEventRepository;
        this.getDiagnosticEventRequest = getDiagnosticEventRequest;
        this.lifecycleDataSource = lifecycleDataSource;
    }
}
