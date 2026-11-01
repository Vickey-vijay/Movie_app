package com.vungle.ads;

import ck.p;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;

/* JADX INFO: compiled from: Metrics.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/vungle/ads/OneShotSingleValueMetric;", "Lcom/vungle/ads/SingleValueMetric;", "", "isLogged", "Lmj/r;", "markLogged", "alreadyLogged", "Z", "Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;", "metricType", "<init>", "(Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class OneShotSingleValueMetric extends SingleValueMetric {
    private boolean alreadyLogged;

    public final void markLogged() {
        this.alreadyLogged = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneShotSingleValueMetric(Sdk.SDKMetric.SDKMetricType sDKMetricType) {
        super(sDKMetricType);
        p.j(sDKMetricType, "metricType");
    }

    /* JADX INFO: renamed from: isLogged, reason: from getter */
    public final boolean getAlreadyLogged() {
        return this.alreadyLogged;
    }
}
