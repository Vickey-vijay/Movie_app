package com.vungle.ads;

import ck.p;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;

/* JADX INFO: compiled from: Metrics.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\u0006\u0010\t\u001a\u00020\u0002J\u0006\u0010\n\u001a\u00020\u0006R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/vungle/ads/OneShotTimeIntervalMetric;", "Lcom/vungle/ads/TimeIntervalMetric;", "", "alreadyMetered$vungle_ads_release", "()Z", "alreadyMetered", "Lmj/r;", "markStart", "markEnd", "isLogged", "markLogged", "alreadyLogged", "Z", "Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;", "metricType", "<init>", "(Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class OneShotTimeIntervalMetric extends TimeIntervalMetric {
    private boolean alreadyLogged;

    public final void markLogged() {
        this.alreadyLogged = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneShotTimeIntervalMetric(Sdk.SDKMetric.SDKMetricType sDKMetricType) {
        super(sDKMetricType);
        p.j(sDKMetricType, "metricType");
    }

    /* JADX INFO: renamed from: isLogged, reason: from getter */
    public final boolean getAlreadyLogged() {
        return this.alreadyLogged;
    }

    public final boolean alreadyMetered$vungle_ads_release() {
        if (getValueFirst() != null && getValueSecond() != null) {
            return true;
        }
        return false;
    }

    @Override // com.vungle.ads.TimeIntervalMetric
    public void markEnd() {
        if (getValueSecond() == null) {
            super.markEnd();
        }
    }

    @Override // com.vungle.ads.TimeIntervalMetric
    public void markStart() {
        if (getValueFirst() == null) {
            super.markStart();
        }
    }
}
