package com.unity3d.services.core.request.metrics;

import ck.p;
import com.unity3d.services.core.properties.InitializationStatusReader;
import com.unity3d.services.core.properties.SdkProperties;
import kotlin.collections.a;
import mj.h;
import nj.l0;

/* JADX INFO: compiled from: MetricSenderBase.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class MetricSenderBase implements SDKMetricsSender {
    private final InitializationStatusReader _initStatusReader;

    public MetricSenderBase(InitializationStatusReader initializationStatusReader) {
        p.j(initializationStatusReader, "_initStatusReader");
        this._initStatusReader = initializationStatusReader;
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendMetricWithInitState(Metric metric) {
        p.j(metric, "metric");
        sendMetric(Metric.copy$default(metric, null, null, a.q(metric.getTags(), l0.g(h.a("state", this._initStatusReader.getInitializationStateString(SdkProperties.getCurrentInitializationState())))), 3, null));
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendEvent(String str) {
        SDKMetricsSender.DefaultImpls.sendEvent(this, str);
    }
}
