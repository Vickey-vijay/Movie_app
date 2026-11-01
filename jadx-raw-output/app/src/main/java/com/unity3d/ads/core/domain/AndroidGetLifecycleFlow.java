package com.unity3d.ads.core.domain;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.widget.ActivityChooserModel;
import bk.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.ProduceKt;
import me.goldze.mvvmhabit.base.ContainerActivity;
import mj.r;
import nk.j;
import pk.n;
import qk.e;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: AndroidGetLifecycleFlow.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class AndroidGetLifecycleFlow {
    private final Context applicationContext;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidGetLifecycleFlow.kt */
    @d(c = "com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2", f = "AndroidGetLifecycleFlow.kt", l = {64}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<n<? super LifecycleEvent>, c<? super r>, Object> {
        private /* synthetic */ Object L$0;
        public int label;

        public AnonymousClass2(c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            AnonymousClass2 anonymousClass2 = AndroidGetLifecycleFlow.this.new AnonymousClass2(cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(n<? super LifecycleEvent> nVar, c<? super r> cVar) {
            return ((AnonymousClass2) create(nVar, cVar)).invokeSuspend(r.f64562a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [android.app.Application$ActivityLifecycleCallbacks, com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2$listener$1] */
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
                final n nVar = (n) this.L$0;
                final ?? r10 = new Application.ActivityLifecycleCallbacks() { // from class: com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2$listener$1
                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityCreated(Activity activity, Bundle bundle) {
                        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
                        n<LifecycleEvent> nVar2 = nVar;
                        j.d(nVar2, null, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityCreated$1(nVar2, activity, bundle, null), 3, null);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityDestroyed(Activity activity) {
                        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
                        n<LifecycleEvent> nVar2 = nVar;
                        j.d(nVar2, null, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityDestroyed$1(nVar2, activity, null), 3, null);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityPaused(Activity activity) {
                        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
                        n<LifecycleEvent> nVar2 = nVar;
                        j.d(nVar2, null, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityPaused$1(nVar2, activity, null), 3, null);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityResumed(Activity activity) {
                        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
                        n<LifecycleEvent> nVar2 = nVar;
                        j.d(nVar2, null, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityResumed$1(nVar2, activity, null), 3, null);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
                        ck.p.j(bundle, ContainerActivity.BUNDLE);
                        n<LifecycleEvent> nVar2 = nVar;
                        j.d(nVar2, null, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivitySaveInstanceState$1(nVar2, activity, bundle, null), 3, null);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityStarted(Activity activity) {
                        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
                        n<LifecycleEvent> nVar2 = nVar;
                        j.d(nVar2, null, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityStarted$1(nVar2, activity, null), 3, null);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityStopped(Activity activity) {
                        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
                        n<LifecycleEvent> nVar2 = nVar;
                        j.d(nVar2, null, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityStopped$1(nVar2, activity, null), 3, null);
                    }
                };
                ((Application) AndroidGetLifecycleFlow.this.applicationContext).registerActivityLifecycleCallbacks(r10);
                final AndroidGetLifecycleFlow androidGetLifecycleFlow = AndroidGetLifecycleFlow.this;
                bk.a<r> aVar = new bk.a<r>() { // from class: com.unity3d.ads.core.domain.AndroidGetLifecycleFlow.invoke.2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // bk.a
                    public /* bridge */ /* synthetic */ r invoke() {
                        invoke2();
                        return r.f64562a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        ((Application) androidGetLifecycleFlow.applicationContext).unregisterActivityLifecycleCallbacks(r10);
                    }
                };
                this.label = 1;
                if (ProduceKt.b(nVar, aVar, this) == objF) {
                    return objF;
                }
            }
            return r.f64562a;
        }
    }

    public AndroidGetLifecycleFlow(Context context) {
        ck.p.j(context, "applicationContext");
        this.applicationContext = context;
    }

    public final qk.c<LifecycleEvent> invoke() {
        if (this.applicationContext instanceof Application) {
            return e.h(new AnonymousClass2(null));
        }
        throw new IllegalArgumentException("Application context is required".toString());
    }
}
