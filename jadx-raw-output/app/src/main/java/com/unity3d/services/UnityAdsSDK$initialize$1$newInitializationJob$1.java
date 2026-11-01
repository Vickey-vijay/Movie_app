package com.unity3d.services;

import bk.p;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.domain.InitializeBoldSDK;
import com.unity3d.services.core.domain.task.EmptyParams;
import com.unity3d.services.core.domain.task.InitializeSDK;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.properties.Session;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.g;
import mj.r;
import nk.l0;
import rj.c;
import sj.a;
import tj.d;

/* JADX INFO: compiled from: UnityAdsSDK.kt */
/* JADX INFO: loaded from: classes4.dex */
@d(c = "com.unity3d.services.UnityAdsSDK$initialize$1$newInitializationJob$1", f = "UnityAdsSDK.kt", l = {101, 107}, m = "invokeSuspend")
public final class UnityAdsSDK$initialize$1$newInitializationJob$1 extends SuspendLambda implements p<l0, c<? super r>, Object> {
    public final /* synthetic */ g<AlternativeFlowReader> $alternativeFlowReader$delegate;
    public final /* synthetic */ String $gameId;
    public final /* synthetic */ l0 $initScope;
    public final /* synthetic */ g<InitializeBoldSDK> $initializeBoldSDK$delegate;
    public final /* synthetic */ g<InitializeSDK> $initializeSDK$delegate;
    public final /* synthetic */ String $source;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UnityAdsSDK$initialize$1$newInitializationJob$1(String str, String str2, l0 l0Var, g<? extends AlternativeFlowReader> gVar, g<? extends InitializeBoldSDK> gVar2, g<InitializeSDK> gVar3, c<? super UnityAdsSDK$initialize$1$newInitializationJob$1> cVar) {
        super(2, cVar);
        this.$source = str;
        this.$gameId = str2;
        this.$initScope = l0Var;
        this.$alternativeFlowReader$delegate = gVar;
        this.$initializeBoldSDK$delegate = gVar2;
        this.$initializeSDK$delegate = gVar3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<r> create(Object obj, c<?> cVar) {
        return new UnityAdsSDK$initialize$1$newInitializationJob$1(this.$source, this.$gameId, this.$initScope, this.$alternativeFlowReader$delegate, this.$initializeBoldSDK$delegate, this.$initializeSDK$delegate, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo1invoke(l0 l0Var, c<? super r> cVar) {
        return ((UnityAdsSDK$initialize$1$newInitializationJob$1) create(l0Var, cVar)).invokeSuspend(r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        Object objF = a.f();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    kotlin.c.b(obj);
                    ((Result) obj).m3466unboximpl();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.c.b(obj);
            }
        } else {
            kotlin.c.b(obj);
            if (UnityAdsSDK.initialize$lambda$4$lambda$1(this.$alternativeFlowReader$delegate).invoke()) {
                InitializeBoldSDK initializeBoldSDKInitialize$lambda$4$lambda$3 = UnityAdsSDK.initialize$lambda$4$lambda$3(this.$initializeBoldSDK$delegate);
                String str2 = this.$source;
                this.label = 1;
                if (initializeBoldSDKInitialize$lambda$4$lambda$3.invoke(str2, this) == objF) {
                    return objF;
                }
            } else {
                if (SdkProperties.isTestMode()) {
                    str = "test mode";
                } else {
                    str = "production mode";
                }
                DeviceLog.info("Initializing Unity Services " + SdkProperties.getVersionName() + " (" + SdkProperties.getVersionCode() + ") with game id " + this.$gameId + " in " + str + ", session " + Session.Default.getId());
                InitializeSDK initializeSDKInitialize$lambda$4$lambda$2 = UnityAdsSDK.initialize$lambda$4$lambda$2(this.$initializeSDK$delegate);
                EmptyParams emptyParams = EmptyParams.INSTANCE;
                this.label = 2;
                if (initializeSDKInitialize$lambda$4$lambda$2.mo3177invokegIAlus(emptyParams, this) == objF) {
                    return objF;
                }
            }
        }
        kotlinx.coroutines.d.d(this.$initScope, null, 1, null);
        return r.f64562a;
    }
}
