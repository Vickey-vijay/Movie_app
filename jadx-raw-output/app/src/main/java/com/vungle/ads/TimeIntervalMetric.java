package com.vungle.ads;

import ck.p;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;

/* JADX INFO: compiled from: Metrics.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\r"}, d2 = {"Lcom/vungle/ads/TimeIntervalMetric;", "Lcom/vungle/ads/DualValueMetric;", "", "calculateIntervalDuration", "getCurrentTime", "Lmj/r;", "markStart", "markEnd", "getValue", "Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;", "metricType", "<init>", "(Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public class TimeIntervalMetric extends DualValueMetric {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType sDKMetricType) {
        super(sDKMetricType);
        p.j(sDKMetricType, "metricType");
    }

    private final long calculateIntervalDuration() {
        long jLongValue;
        long currentTime = getCurrentTime();
        Long valueSecond = getValueSecond();
        if (valueSecond != null) {
            jLongValue = valueSecond.longValue();
        } else {
            jLongValue = currentTime;
        }
        Long valueFirst = getValueFirst();
        if (valueFirst != null) {
            currentTime = valueFirst.longValue();
        }
        return (jLongValue - currentTime) / ((long) 1000000);
    }

    private final long getCurrentTime() {
        return System.nanoTime();
    }

    @Override // com.vungle.ads.Metric
    public long getValue() {
        return calculateIntervalDuration();
    }

    public void markEnd() {
        setValueSecond(Long.valueOf(getCurrentTime()));
    }

    public void markStart() {
        setValueFirst(Long.valueOf(getCurrentTime()));
    }
}
