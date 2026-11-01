package com.unity3d.services.core.request.metrics;

import bk.p;
import ck.s;
import com.safedk.android.utils.i;
import com.unity3d.ads.core.domain.HttpClientProvider;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.RequestType;
import com.unity3d.services.core.properties.InitializationStatusReader;
import ek.b;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lk.a0;
import mj.r;
import nk.i0;
import nk.j;
import nk.l0;
import org.json.JSONObject;
import rj.c;
import sj.a;
import tj.d;

/* JADX INFO: compiled from: MetricSender.kt */
/* JADX INFO: loaded from: classes4.dex */
public class MetricSender extends MetricSenderBase implements IServiceComponent {
    private final MetricCommonTags commonTags;
    private final ISDKDispatchers dispatchers;
    private final HttpClientProvider httpClientProvider;
    private final Logger logger;
    private final String metricEndPoint;
    private final String metricSampleRate;
    private final l0 scope;
    private final String sessionToken;

    /* JADX INFO: renamed from: com.unity3d.services.core.request.metrics.MetricSender$sendMetrics$1, reason: invalid class name */
    /* JADX INFO: compiled from: MetricSender.kt */
    @d(c = "com.unity3d.services.core.request.metrics.MetricSender$sendMetrics$1", f = "MetricSender.kt", l = {66, 66}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<l0, c<? super r>, Object> {
        public final /* synthetic */ List<Metric> $metrics;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<Metric> list, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$metrics = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            return MetricSender.this.new AnonymousClass1(this.$metrics, cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, c<? super r> cVar) {
            return ((AnonymousClass1) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x00bd  */
        /* JADX WARN: Code duplicated, block: B:26:0x00c2  */
        /* JADX WARN: Code duplicated, block: B:27:0x00eb  */
        /* JADX WARN: Instruction removed from duplicated block: B:26:0x00c2, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:27:0x00eb, please report this as an issue */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            HttpRequest httpRequest;
            Object objInvoke;
            Object objExecute$default;
            HttpResponse httpResponse;
            Object objF = a.f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    httpRequest = (HttpRequest) this.L$0;
                    kotlin.c.b(obj);
                    objInvoke = obj;
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.b(obj);
                    objExecute$default = obj;
                }
                httpResponse = (HttpResponse) objExecute$default;
                if (httpResponse.getStatusCode() / 100 == 2) {
                    MetricSender.this.logger.debug("Metric " + this.$metrics + " sent to " + MetricSender.this.getMetricEndPoint());
                } else {
                    Logger.DefaultImpls.trace$default(MetricSender.this.logger, "Metric " + this.$metrics + " failed to send with response code: " + httpResponse.getStatusCode(), null, 2, null);
                }
                return r.f64562a;
            }
            kotlin.c.b(obj);
            String string = new JSONObject(new MetricsContainer(MetricSender.this.metricSampleRate, MetricSender.this.commonTags, this.$metrics, MetricSender.this.sessionToken).toMap()).toString();
            ck.p.i(string, "JSONObject(container.toMap()).toString()");
            String metricEndPoint = MetricSender.this.getMetricEndPoint();
            if (metricEndPoint == null) {
                metricEndPoint = "";
            }
            httpRequest = new HttpRequest(metricEndPoint, null, RequestType.POST, string, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131058, null);
            HttpClientProvider httpClientProvider = MetricSender.this.httpClientProvider;
            this.L$0 = httpRequest;
            this.label = 1;
            objInvoke = httpClientProvider.invoke(this);
            if (objInvoke == objF) {
                return objF;
            }
            HttpRequest httpRequest2 = httpRequest;
            this.L$0 = null;
            this.label = 2;
            objExecute$default = HttpClient.DefaultImpls.execute$default((HttpClient) objInvoke, httpRequest2, false, this, 2, null);
            if (objExecute$default == objF) {
                return objF;
            }
            httpResponse = (HttpResponse) objExecute$default;
            if (httpResponse.getStatusCode() / 100 == 2) {
                MetricSender.this.logger.debug("Metric " + this.$metrics + " sent to " + MetricSender.this.getMetricEndPoint());
            } else {
                Logger.DefaultImpls.trace$default(MetricSender.this.logger, "Metric " + this.$metrics + " failed to send with response code: " + httpResponse.getStatusCode(), null, 2, null);
            }
            return r.f64562a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetricSender(Configuration configuration, InitializationStatusReader initializationStatusReader, Logger logger) {
        super(initializationStatusReader);
        ck.p.j(configuration, i.f44984c);
        ck.p.j(initializationStatusReader, "initializationStatusReader");
        ck.p.j(logger, "logger");
        this.logger = logger;
        MetricCommonTags metricCommonTags = new MetricCommonTags();
        metricCommonTags.updateWithConfig(configuration);
        this.commonTags = metricCommonTags;
        this.metricSampleRate = String.valueOf(b.b(configuration.getMetricSampleRate()));
        this.sessionToken = configuration.getSessionToken();
        ISDKDispatchers iSDKDispatchers = (ISDKDispatchers) getServiceProvider().getRegistry().getService("", s.b(ISDKDispatchers.class));
        this.dispatchers = iSDKDispatchers;
        this.httpClientProvider = (HttpClientProvider) getServiceProvider().getRegistry().getService("", s.b(HttpClientProvider.class));
        this.scope = kotlinx.coroutines.d.a(iSDKDispatchers.getIo());
        this.metricEndPoint = configuration.getMetricsUrl();
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public String getMetricEndPoint() {
        return this.metricEndPoint;
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendEvent(String str, String str2, Map<String, String> map) {
        ck.p.j(str, "event");
        ck.p.j(map, "tags");
        if (!(str.length() == 0)) {
            sendMetrics(nj.r.e(new Metric(str, str2, map)));
            return;
        }
        Logger.DefaultImpls.trace$default(this.logger, "Metric event not sent due to being null or empty: " + str, null, 2, null);
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendMetric(Metric metric) {
        ck.p.j(metric, "metric");
        sendMetrics(nj.r.e(metric));
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendMetrics(List<Metric> list) {
        ck.p.j(list, "metrics");
        if (list.isEmpty()) {
            Logger.DefaultImpls.trace$default(this.logger, "Metrics event not send due to being empty", null, 2, null);
            return;
        }
        String metricEndPoint = getMetricEndPoint();
        if (!(metricEndPoint == null || a0.n0(metricEndPoint))) {
            j.d(this.scope, new MetricSender$sendMetrics$$inlined$CoroutineExceptionHandler$1(i0.F8, this, list), null, new AnonymousClass1(list, null), 2, null);
            return;
        }
        Logger.DefaultImpls.trace$default(this.logger, "Metrics: " + list + " was not sent to null or empty endpoint: " + getMetricEndPoint(), null, 2, null);
    }

    public final void shutdown() {
        this.commonTags.shutdown();
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }
}
