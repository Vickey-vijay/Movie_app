package com.vungle.ads;

import ck.p;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;

/* JADX INFO: compiled from: Metrics.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\u0007\u001a\u00020\u0004H\u0016R$\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\u0007\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/vungle/ads/SingleValueMetric;", "Lcom/vungle/ads/Metric;", "Lmj/r;", "markTime", "", ImpressionLog.f43636l, "addValue", "getValue", "value", "Ljava/lang/Long;", "()Ljava/lang/Long;", "setValue", "(Ljava/lang/Long;)V", "Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;", "metricType", "<init>", "(Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public class SingleValueMetric extends Metric {
    private Long value;

    public final Long getValue() {
        return this.value;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleValueMetric(Sdk.SDKMetric.SDKMetricType sDKMetricType) {
        super(sDKMetricType);
        p.j(sDKMetricType, "metricType");
    }

    public final void addValue(long j10) {
        Long l10 = this.value;
        this.value = Long.valueOf((l10 != null ? l10.longValue() : 0L) + j10);
    }

    @Override // com.vungle.ads.Metric
    public long getValue() {
        Long l10 = this.value;
        if (l10 != null) {
            return l10.longValue();
        }
        return 0L;
    }

    public final void setValue(Long l10) {
        this.value = l10;
    }

    public final void markTime() {
        this.value = Long.valueOf(System.currentTimeMillis());
    }
}
