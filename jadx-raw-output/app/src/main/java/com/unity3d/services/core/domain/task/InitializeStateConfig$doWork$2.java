package com.unity3d.services.core.domain.task;

import bk.p;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.request.NetworkIOException;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import nk.l0;
import rj.c;
import sj.a;
import tj.d;

/* JADX INFO: compiled from: InitializeStateConfig.kt */
/* JADX INFO: loaded from: classes7.dex */
@d(c = "com.unity3d.services.core.domain.task.InitializeStateConfig$doWork$2", f = "InitializeStateConfig.kt", l = {32}, m = "invokeSuspend")
public final class InitializeStateConfig$doWork$2 extends SuspendLambda implements p<l0, c<? super Result<? extends Configuration>>, Object> {
    public final /* synthetic */ InitializeStateConfig.Params $params;
    public Object L$0;
    public int label;
    public final /* synthetic */ InitializeStateConfig this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateConfig$doWork$2(InitializeStateConfig.Params params, InitializeStateConfig initializeStateConfig, c<? super InitializeStateConfig$doWork$2> cVar) {
        super(2, cVar);
        this.$params = params;
        this.this$0 = initializeStateConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<r> create(Object obj, c<?> cVar) {
        return new InitializeStateConfig$doWork$2(this.$params, this.this$0, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo1invoke(l0 l0Var, c<? super Result<? extends Configuration>> cVar) {
        return ((InitializeStateConfig$doWork$2) create(l0Var, cVar)).invokeSuspend(r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM3458constructorimpl;
        Configuration configuration;
        Object objMo3177invokegIAlus;
        Object objF = a.f();
        int i10 = this.label;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    configuration = (Configuration) this.L$0;
                    try {
                        kotlin.c.b(obj);
                        objMo3177invokegIAlus = ((Result) obj).m3466unboximpl();
                    } catch (NetworkIOException e10) {
                        e = e10;
                        throw new InitializationException(ErrorState.NetworkConfigRequest, e, configuration);
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.c.b(obj);
                InitializeStateConfig.Params params = this.$params;
                InitializeStateConfig initializeStateConfig = this.this$0;
                Result.a aVar = Result.Companion;
                DeviceLog.info("Unity Ads init: load configuration from " + SdkProperties.getConfigUrl());
                Configuration configuration2 = new Configuration(SdkProperties.getConfigUrl(), params.getConfig().getExperimentsReader());
                try {
                    InitializeStateConfigWithLoader initializeStateConfigWithLoader = initializeStateConfig.initializeStateConfigWithLoader;
                    InitializeStateConfigWithLoader.Params params2 = new InitializeStateConfigWithLoader.Params(configuration2);
                    this.L$0 = configuration2;
                    this.label = 1;
                    objMo3177invokegIAlus = initializeStateConfigWithLoader.mo3177invokegIAlus((BaseParams) params2, (c<? super Result<? extends Configuration>>) this);
                    if (objMo3177invokegIAlus == objF) {
                        return objF;
                    }
                    configuration = configuration2;
                } catch (NetworkIOException e11) {
                    e = e11;
                    configuration = configuration2;
                    throw new InitializationException(ErrorState.NetworkConfigRequest, e, configuration);
                }
            }
            kotlin.c.b(objMo3177invokegIAlus);
            objM3458constructorimpl = Result.m3458constructorimpl((Configuration) objMo3177invokegIAlus);
        } catch (CancellationException e12) {
            throw e12;
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
        }
        if (Result.m3464isSuccessimpl(objM3458constructorimpl)) {
            objM3458constructorimpl = Result.m3458constructorimpl(objM3458constructorimpl);
        } else {
            Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objM3458constructorimpl);
            if (thM3461exceptionOrNullimpl != null) {
                objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(thM3461exceptionOrNullimpl));
            }
        }
        return Result.m3457boximpl(objM3458constructorimpl);
    }
}
