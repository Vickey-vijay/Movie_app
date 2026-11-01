package com.unity3d.services.core.domain.task;

import bk.p;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.webview.WebViewApp;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import nk.l0;
import rj.c;
import sj.a;
import tj.d;

/* JADX INFO: compiled from: InitializeStateCreate.kt */
/* JADX INFO: loaded from: classes10.dex */
@d(c = "com.unity3d.services.core.domain.task.InitializeStateCreate$doWork$2", f = "InitializeStateCreate.kt", l = {}, m = "invokeSuspend")
public final class InitializeStateCreate$doWork$2 extends SuspendLambda implements p<l0, c<? super Result<? extends Configuration>>, Object> {
    public final /* synthetic */ InitializeStateCreate.Params $params;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateCreate$doWork$2(InitializeStateCreate.Params params, c<? super InitializeStateCreate$doWork$2> cVar) {
        super(2, cVar);
        this.$params = params;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<r> create(Object obj, c<?> cVar) {
        return new InitializeStateCreate$doWork$2(this.$params, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo1invoke(l0 l0Var, c<? super Result<? extends Configuration>> cVar) {
        return ((InitializeStateCreate$doWork$2) create(l0Var, cVar)).invokeSuspend(r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM3458constructorimpl;
        a.f();
        if (this.label == 0) {
            kotlin.c.b(obj);
            InitializeStateCreate.Params params = this.$params;
            try {
                Result.a aVar = Result.Companion;
                DeviceLog.debug("Unity Ads init: creating webapp");
                Configuration config = params.getConfig();
                config.setWebViewData(params.getWebViewData());
                try {
                    ErrorState errorStateCreate = WebViewApp.create(config, false);
                    if (errorStateCreate == null) {
                        objM3458constructorimpl = Result.m3458constructorimpl(config);
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
                    String webAppFailureMessage = "Unity Ads WebApp creation failed";
                    if (WebViewApp.getCurrentApp().getWebAppFailureMessage() != null) {
                        webAppFailureMessage = WebViewApp.getCurrentApp().getWebAppFailureMessage();
                    }
                    DeviceLog.error(webAppFailureMessage);
                    throw new InitializationException(errorStateCreate, new Exception(webAppFailureMessage), config);
                } catch (IllegalThreadStateException e10) {
                    DeviceLog.exception("Illegal Thread", e10);
                    throw new InitializationException(ErrorState.CreateWebApp, e10, config);
                }
            } catch (CancellationException e11) {
                throw e11;
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
