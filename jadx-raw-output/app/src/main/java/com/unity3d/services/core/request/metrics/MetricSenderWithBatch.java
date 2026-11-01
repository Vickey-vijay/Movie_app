package com.unity3d.services.core.request.metrics;

import android.text.TextUtils;
import bk.a;
import ck.p;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.properties.InitializationStatusReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.b;
import mj.g;
import nj.r;
import nj.s;

/* JADX INFO: compiled from: MetricSenderWithBatch.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class MetricSenderWithBatch extends MetricSenderBase {
    private final g _logger$delegate;
    private SDKMetricsSender _original;
    private final LinkedBlockingQueue<Metric> _queue;

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public synchronized void sendMetrics(List<Metric> list) {
        p.j(list, "metrics");
        this._queue.addAll(list);
        if (!TextUtils.isEmpty(this._original.getMetricEndPoint()) && this._queue.size() > 0) {
            ArrayList arrayList = new ArrayList();
            this._queue.drainTo(arrayList);
            this._original.sendMetrics(arrayList);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetricSenderWithBatch(SDKMetricsSender sDKMetricsSender, InitializationStatusReader initializationStatusReader) {
        super(initializationStatusReader);
        p.j(sDKMetricsSender, "_original");
        p.j(initializationStatusReader, "initializationStatusReader");
        this._original = sDKMetricsSender;
        this._queue = new LinkedBlockingQueue<>();
        this._logger$delegate = b.a(new a<Logger>() { // from class: com.unity3d.services.core.request.metrics.MetricSenderWithBatch$_logger$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final Logger invoke() {
                return (Logger) Utilities.getService(Logger.class);
            }
        });
    }

    private final Logger get_logger() {
        Object value = this._logger$delegate.getValue();
        p.i(value, "<get-_logger>(...)");
        return (Logger) value;
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public String getMetricEndPoint() {
        return this._original.getMetricEndPoint();
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendEvent(String str, String str2, Map<String, String> map) {
        p.j(str, "event");
        p.j(map, "tags");
        if (!(str.length() == 0)) {
            sendMetrics(r.e(new Metric(str, str2, map)));
            return;
        }
        get_logger().debug("Metric event not sent due to being empty: " + str);
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendMetric(Metric metric) {
        p.j(metric, "metric");
        sendMetrics(r.e(metric));
    }

    public final void updateOriginal(SDKMetricsSender sDKMetricsSender) {
        p.j(sDKMetricsSender, "metrics");
        this._original = sDKMetricsSender;
    }

    public final void sendQueueIfNeeded() {
        sendMetrics(s.k());
    }
}
