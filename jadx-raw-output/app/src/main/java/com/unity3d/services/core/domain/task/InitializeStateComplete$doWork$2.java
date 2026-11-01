package com.unity3d.services.core.domain.task;

import androidx.datastore.core.DataStore;
import bk.p;
import com.unity3d.services.core.configuration.IModuleConfiguration;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import nk.l0;
import rj.c;
import sj.a;
import tj.d;

/* JADX INFO: compiled from: InitializeStateComplete.kt */
/* JADX INFO: loaded from: classes6.dex */
@d(c = "com.unity3d.services.core.domain.task.InitializeStateComplete$doWork$2", f = "InitializeStateComplete.kt", l = {26}, m = "invokeSuspend")
public final class InitializeStateComplete$doWork$2 extends SuspendLambda implements p<l0, c<? super Result<? extends r>>, Object> {
    public final /* synthetic */ InitializeStateComplete.Params $params;
    public int label;
    public final /* synthetic */ InitializeStateComplete this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateComplete$doWork$2(InitializeStateComplete.Params params, InitializeStateComplete initializeStateComplete, c<? super InitializeStateComplete$doWork$2> cVar) {
        super(2, cVar);
        this.$params = params;
        this.this$0 = initializeStateComplete;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<r> create(Object obj, c<?> cVar) {
        return new InitializeStateComplete$doWork$2(this.$params, this.this$0, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo1invoke(l0 l0Var, c<? super Result<? extends r>> cVar) {
        return invoke2(l0Var, (c<? super Result<r>>) cVar);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(l0 l0Var, c<? super Result<r>> cVar) {
        return ((InitializeStateComplete$doWork$2) create(l0Var, cVar)).invokeSuspend(r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM3458constructorimpl;
        Object objF = a.f();
        int i10 = this.label;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    kotlin.c.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.c.b(obj);
                InitializeStateComplete.Params params = this.$params;
                InitializeStateComplete initializeStateComplete = this.this$0;
                Result.a aVar = Result.Companion;
                Class[] moduleConfigurationList = params.getConfig().getModuleConfigurationList();
                ck.p.i(moduleConfigurationList, "params.config.moduleConfigurationList");
                for (Class cls : moduleConfigurationList) {
                    IModuleConfiguration moduleConfiguration = params.getConfig().getModuleConfiguration(cls);
                    if (moduleConfiguration != null) {
                        tj.a.a(moduleConfiguration.initCompleteState(params.getConfig()));
                    }
                }
                DataStore dataStore = initializeStateComplete.dataStore;
                InitializeStateComplete$doWork$2$1$1 initializeStateComplete$doWork$2$1$1 = new InitializeStateComplete$doWork$2$1$1(null);
                this.label = 1;
                if (dataStore.updateData(initializeStateComplete$doWork$2$1$1, this) == objF) {
                    return objF;
                }
            }
            objM3458constructorimpl = Result.m3458constructorimpl(r.f64562a);
        } catch (CancellationException e10) {
            throw e10;
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
