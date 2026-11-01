package com.unity3d.services.core.domain.task;

import bk.p;
import com.unity3d.services.core.connectivity.ConnectivityMonitor;
import com.unity3d.services.core.log.DeviceLog;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutKt;
import mj.r;
import nk.l0;
import rj.c;
import sj.a;
import tj.d;

/* JADX INFO: compiled from: InitializeStateNetworkError.kt */
/* JADX INFO: loaded from: classes7.dex */
@d(c = "com.unity3d.services.core.domain.task.InitializeStateNetworkError$doWork$2", f = "InitializeStateNetworkError.kt", l = {39}, m = "invokeSuspend")
public final class InitializeStateNetworkError$doWork$2 extends SuspendLambda implements p<l0, c<? super Result<? extends r>>, Object> {
    public final /* synthetic */ InitializeStateNetworkError.Params $params;
    public Object L$0;
    public int label;
    public final /* synthetic */ InitializeStateNetworkError this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateNetworkError$doWork$2(InitializeStateNetworkError initializeStateNetworkError, InitializeStateNetworkError.Params params, c<? super InitializeStateNetworkError$doWork$2> cVar) {
        super(2, cVar);
        this.this$0 = initializeStateNetworkError;
        this.$params = params;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<r> create(Object obj, c<?> cVar) {
        return new InitializeStateNetworkError$doWork$2(this.this$0, this.$params, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo1invoke(l0 l0Var, c<? super Result<? extends r>> cVar) {
        return invoke2(l0Var, (c<? super Result<r>>) cVar);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(l0 l0Var, c<? super Result<r>> cVar) {
        return ((InitializeStateNetworkError$doWork$2) create(l0Var, cVar)).invokeSuspend(r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM3458constructorimpl;
        InitializeStateNetworkError initializeStateNetworkError;
        Object objF = a.f();
        int i10 = this.label;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    initializeStateNetworkError = (InitializeStateNetworkError) this.L$0;
                    kotlin.c.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.c.b(obj);
                InitializeStateNetworkError initializeStateNetworkError2 = this.this$0;
                InitializeStateNetworkError.Params params = this.$params;
                Result.a aVar = Result.Companion;
                DeviceLog.error("Unity Ads init: network error, waiting for connection events");
                initializeStateNetworkError2.maximumConnectedEvents = params.getConfig().getMaximumConnectedEvents();
                initializeStateNetworkError2.connectedEventThreshold = params.getConfig().getConnectedEventThreshold();
                long networkErrorTimeout = params.getConfig().getNetworkErrorTimeout();
                InitializeStateNetworkError$doWork$2$1$success$1 initializeStateNetworkError$doWork$2$1$success$1 = new InitializeStateNetworkError$doWork$2$1$success$1(initializeStateNetworkError2, null);
                this.L$0 = initializeStateNetworkError2;
                this.label = 1;
                Object objD = TimeoutKt.d(networkErrorTimeout, initializeStateNetworkError$doWork$2$1$success$1, this);
                if (objD == objF) {
                    return objF;
                }
                initializeStateNetworkError = initializeStateNetworkError2;
                obj = objD;
            }
            if (((r) obj) != null) {
                objM3458constructorimpl = Result.m3458constructorimpl(r.f64562a);
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
            ConnectivityMonitor.removeListener(initializeStateNetworkError);
            throw new Exception("No connected events within the timeout!");
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
        }
    }
}
