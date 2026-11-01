package com.unity3d.ads.core.domain;

import android.app.Activity;
import bk.p;
import java.lang.ref.WeakReference;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import nk.l0;
import pk.n;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: AndroidGetLifecycleFlow.kt */
/* JADX INFO: loaded from: classes4.dex */
@d(c = "com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityResumed$1", f = "AndroidGetLifecycleFlow.kt", l = {42}, m = "invokeSuspend")
public final class AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityResumed$1 extends SuspendLambda implements p<l0, c<? super r>, Object> {
    public final /* synthetic */ n<LifecycleEvent> $$this$channelFlow;
    public final /* synthetic */ Activity $activity;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityResumed$1(n<? super LifecycleEvent> nVar, Activity activity, c<? super AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityResumed$1> cVar) {
        super(2, cVar);
        this.$$this$channelFlow = nVar;
        this.$activity = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<r> create(Object obj, c<?> cVar) {
        return new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityResumed$1(this.$$this$channelFlow, this.$activity, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo1invoke(l0 l0Var, c<? super r> cVar) {
        return ((AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityResumed$1) create(l0Var, cVar)).invokeSuspend(r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            n<LifecycleEvent> nVar = this.$$this$channelFlow;
            LifecycleEvent.Resumed resumed = new LifecycleEvent.Resumed(new WeakReference(this.$activity));
            this.label = 1;
            if (nVar.u(resumed, this) == objF) {
                return objF;
            }
        }
        return r.f64562a;
    }
}
