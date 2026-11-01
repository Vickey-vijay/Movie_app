package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.domain.task.BaseParams;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import rj.c;
import sj.a;
import tj.d;

/* JADX INFO: compiled from: BaseTask.kt */
/* JADX INFO: loaded from: classes9.dex */
@d(c = "com.unity3d.services.core.domain.task.BaseTask$DefaultImpls", f = "BaseTask.kt", l = {11}, m = "invoke-gIAlu-s")
public final class BaseTask$invoke$1<P extends BaseParams, R> extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;

    public BaseTask$invoke$1(c<? super BaseTask$invoke$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM3178invokegIAlus = BaseTask.DefaultImpls.m3178invokegIAlus(null, null, this);
        return objM3178invokegIAlus == a.f() ? objM3178invokegIAlus : Result.m3457boximpl(objM3178invokegIAlus);
    }
}
