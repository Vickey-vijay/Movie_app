package com.unity3d.services.core.request.metrics;

import com.unity3d.ads.core.log.Logger;
import java.util.List;
import kotlin.coroutines.a;
import kotlin.coroutines.d;
import nk.i0;

/* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class MetricSender$sendMetrics$$inlined$CoroutineExceptionHandler$1 extends a implements i0 {
    public final /* synthetic */ List $metrics$inlined;
    public final /* synthetic */ MetricSender this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetricSender$sendMetrics$$inlined$CoroutineExceptionHandler$1(i0.b bVar, MetricSender metricSender, List list) {
        super(bVar);
        this.this$0 = metricSender;
        this.$metrics$inlined = list;
    }

    @Override // nk.i0
    public void handleException(d dVar, Throwable th2) {
        Logger.DefaultImpls.trace$default(this.this$0.logger, "Metric " + this.$metrics$inlined + " failed to send with error: " + th2, null, 2, null);
    }
}
