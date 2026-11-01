package com.unity3d.services.core.domain.task;

import ck.p;
import ck.s;
import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.domain.task.BaseParams;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import kotlin.jvm.internal.Ref$ObjectRef;
import mj.r;
import rj.c;
import sj.a;

/* JADX INFO: compiled from: MetricTask.kt */
/* JADX INFO: loaded from: classes4.dex */
public abstract class MetricTask<P extends BaseParams, R> implements BaseTask<P, R> {
    private long duration;
    private String taskStatus = "unknown";

    private final int getStatePrefixLength() {
        return 15;
    }

    public String getMetricName() {
        return null;
    }

    @Override // com.unity3d.services.core.domain.task.BaseTask
    /* JADX INFO: renamed from: invoke-gIAlu-s */
    public Object mo3177invokegIAlus(P p10, c<? super Result<? extends R>> cVar) {
        return m3194invokegIAlus$suspendImpl(this, p10, cVar);
    }

    private final Metric getMetric() {
        return new Metric(getMetricName(), Long.valueOf(this.duration), getMetricTagsForState());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: invoke-gIAlu-s$suspendImpl, reason: not valid java name */
    public static /* synthetic */ Object m3194invokegIAlus$suspendImpl(MetricTask<? super P, R> metricTask, P p10, c<? super Result<? extends R>> cVar) throws Throwable {
        MetricTask$invoke$1 metricTask$invoke$1;
        long jNanoTime;
        MetricTask<? super P, R> metricTask2;
        Ref$ObjectRef ref$ObjectRef;
        TimeUnit timeUnit;
        T tM3466unboximpl;
        Ref$ObjectRef ref$ObjectRef2;
        if (cVar instanceof MetricTask$invoke$1) {
            metricTask$invoke$1 = (MetricTask$invoke$1) cVar;
            int i10 = metricTask$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                metricTask$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                metricTask$invoke$1 = new MetricTask$invoke$1(metricTask, cVar);
            }
        } else {
            metricTask$invoke$1 = new MetricTask$invoke$1(metricTask, cVar);
        }
        Object obj = metricTask$invoke$1.result;
        Object objF = a.f();
        int i11 = metricTask$invoke$1.label;
        if (i11 == 0) {
            kotlin.c.b(obj);
            Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            jNanoTime = System.nanoTime();
            metricTask$invoke$1.L$0 = metricTask;
            metricTask$invoke$1.L$1 = ref$ObjectRef3;
            metricTask$invoke$1.L$2 = ref$ObjectRef3;
            metricTask$invoke$1.L$3 = metricTask;
            metricTask$invoke$1.L$4 = timeUnit2;
            metricTask$invoke$1.J$0 = jNanoTime;
            metricTask$invoke$1.label = 1;
            Object objM3178invokegIAlus = BaseTask.DefaultImpls.m3178invokegIAlus(metricTask, p10, metricTask$invoke$1);
            if (objM3178invokegIAlus == objF) {
                return objF;
            }
            metricTask2 = metricTask;
            ref$ObjectRef = ref$ObjectRef3;
            timeUnit = timeUnit2;
            tM3466unboximpl = objM3178invokegIAlus;
            ref$ObjectRef2 = ref$ObjectRef;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j10 = metricTask$invoke$1.J$0;
            timeUnit = (TimeUnit) metricTask$invoke$1.L$4;
            MetricTask<? super P, R> metricTask3 = (MetricTask) metricTask$invoke$1.L$3;
            ref$ObjectRef = (Ref$ObjectRef) metricTask$invoke$1.L$2;
            Ref$ObjectRef ref$ObjectRef4 = (Ref$ObjectRef) metricTask$invoke$1.L$1;
            metricTask2 = (MetricTask) metricTask$invoke$1.L$0;
            kotlin.c.b(obj);
            metricTask = metricTask3;
            ref$ObjectRef2 = ref$ObjectRef4;
            jNanoTime = j10;
            tM3466unboximpl = ((Result) obj).m3466unboximpl();
        }
        ref$ObjectRef.element = tM3466unboximpl;
        r rVar = r.f64562a;
        ((MetricTask) metricTask).duration = timeUnit.toMillis(System.nanoTime() - jNanoTime);
        metricTask2.captureMetric(ref$ObjectRef2.element);
        return ref$ObjectRef2.element;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final String getMetricNameForInitializeTask(String str) {
        p.j(str, "name");
        return "native_" + str + "_task_" + this.taskStatus + "_time";
    }

    public final String getTaskStatus() {
        return this.taskStatus;
    }

    public final void setDuration(long j10) {
        this.duration = j10;
    }

    public final void setTaskStatus(String str) {
        p.j(str, "<set-?>");
        this.taskStatus = str;
    }

    private final void captureMetric(Object obj) {
        String str;
        if (Result.m3464isSuccessimpl(obj)) {
            str = "success";
        } else {
            str = "failure";
        }
        this.taskStatus = str;
        sendMetric();
    }

    private final Map<String, String> getMetricTagsForState() {
        Map<String, String> retryTags = InitializeEventsMetricSender.getInstance().getRetryTags();
        p.i(retryTags, "getInstance().retryTags");
        return retryTags;
    }

    private final SDKMetricsSender getSDKMetrics() {
        return (SDKMetricsSender) getServiceProvider().getRegistry().getService("", s.b(SDKMetricsSender.class));
    }

    private final void sendMetric() {
        boolean z10;
        String metricName = getMetricName();
        if (metricName != null && metricName.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            return;
        }
        getSDKMetrics().sendMetric(getMetric());
    }

    public final String getMetricNameForTask(Object obj) {
        boolean z10;
        p.j(obj, "task");
        String simpleName = obj.getClass().getSimpleName();
        p.i(simpleName, "className");
        if (simpleName.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return null;
        }
        p.i(simpleName, "className");
        String strSubstring = simpleName.substring(getStatePrefixLength());
        p.i(strSubstring, "this as java.lang.String).substring(startIndex)");
        String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
        p.i(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        StringBuilder sb2 = new StringBuilder(7 + lowerCase.length() + 6);
        sb2.append("native_");
        sb2.append(lowerCase);
        sb2.append("_state");
        return sb2.toString();
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    public IServiceProvider getServiceProvider() {
        return BaseTask.DefaultImpls.getServiceProvider(this);
    }
}
