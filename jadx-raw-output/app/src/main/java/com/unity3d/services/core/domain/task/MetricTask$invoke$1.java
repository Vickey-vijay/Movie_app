package com.unity3d.services.core.domain.task;

import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import rj.c;
import sj.a;
import tj.d;

/* JADX INFO: compiled from: MetricTask.kt */
/* JADX INFO: loaded from: classes4.dex */
@d(c = "com.unity3d.services.core.domain.task.MetricTask", f = "MetricTask.kt", l = {24}, m = "invoke-gIAlu-s$suspendImpl")
public final class MetricTask$invoke$1 extends ContinuationImpl {
    public long J$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MetricTask<P, R> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MetricTask$invoke$1(MetricTask<? super P, R> metricTask, c<? super MetricTask$invoke$1> cVar) {
        super(cVar);
        this.this$0 = metricTask;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM3194invokegIAlus$suspendImpl = MetricTask.m3194invokegIAlus$suspendImpl(this.this$0, null, this);
        return objM3194invokegIAlus$suspendImpl == a.f() ? objM3194invokegIAlus$suspendImpl : Result.m3457boximpl(objM3194invokegIAlus$suspendImpl);
    }
}
