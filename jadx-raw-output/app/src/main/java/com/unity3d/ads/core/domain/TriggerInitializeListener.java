package com.unity3d.ads.core.domain;

import bk.p;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.core.properties.SdkProperties;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import nk.h0;
import nk.j;
import nk.l0;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: TriggerInitializeListener.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class TriggerInitializeListener {
    private final h0 coroutineDispatcher;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.TriggerInitializeListener$error$1, reason: invalid class name */
    /* JADX INFO: compiled from: TriggerInitializeListener.kt */
    @d(c = "com.unity3d.ads.core.domain.TriggerInitializeListener$error$1", f = "TriggerInitializeListener.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<l0, c<? super r>, Object> {
        public final /* synthetic */ String $errorMsg;
        public final /* synthetic */ UnityAds.UnityAdsInitializationError $unityAdsInitializationError;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$unityAdsInitializationError = unityAdsInitializationError;
            this.$errorMsg = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(this.$unityAdsInitializationError, this.$errorMsg, cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, c<? super r> cVar) {
            return ((AnonymousClass1) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            sj.a.f();
            if (this.label == 0) {
                kotlin.c.b(obj);
                SdkProperties.notifyInitializationFailed(this.$unityAdsInitializationError, this.$errorMsg);
                return r.f64562a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.TriggerInitializeListener$success$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TriggerInitializeListener.kt */
    @d(c = "com.unity3d.ads.core.domain.TriggerInitializeListener$success$1", f = "TriggerInitializeListener.kt", l = {}, m = "invokeSuspend")
    public static final class C38911 extends SuspendLambda implements p<l0, c<? super r>, Object> {
        public int label;

        public C38911(c<? super C38911> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            return new C38911(cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, c<? super r> cVar) {
            return ((C38911) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            sj.a.f();
            if (this.label == 0) {
                kotlin.c.b(obj);
                SdkProperties.notifyInitializationComplete();
                return r.f64562a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public TriggerInitializeListener(h0 h0Var) {
        ck.p.j(h0Var, "coroutineDispatcher");
        this.coroutineDispatcher = h0Var;
    }

    public final void success() {
        j.d(kotlinx.coroutines.d.a(this.coroutineDispatcher), null, null, new C38911(null), 3, null);
    }

    public final void error(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
        ck.p.j(unityAdsInitializationError, "unityAdsInitializationError");
        ck.p.j(str, "errorMsg");
        j.d(kotlinx.coroutines.d.a(this.coroutineDispatcher), null, null, new AnonymousClass1(unityAdsInitializationError, str, null), 3, null);
    }
}
