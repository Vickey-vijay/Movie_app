package com.unity3d.services.core.domain.task;

import bk.p;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.extensions.TaskExtensionsKt;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.RequestType;
import com.unity3d.services.core.properties.SdkProperties;
import java.io.File;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import nk.h;
import nk.h0;
import nk.l0;
import rj.c;
import sj.a;
import tj.d;

/* JADX INFO: compiled from: InitializeStateLoadWeb.kt */
/* JADX INFO: loaded from: classes7.dex */
@d(c = "com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2", f = "InitializeStateLoadWeb.kt", l = {46, 64, 71}, m = "invokeSuspend")
public final class InitializeStateLoadWeb$doWork$2 extends SuspendLambda implements p<l0, c<? super Result<? extends InitializeStateLoadWeb.LoadWebResult>>, Object> {
    public final /* synthetic */ InitializeStateLoadWeb.Params $params;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public final /* synthetic */ InitializeStateLoadWeb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateLoadWeb$doWork$2(InitializeStateLoadWeb.Params params, InitializeStateLoadWeb initializeStateLoadWeb, c<? super InitializeStateLoadWeb$doWork$2> cVar) {
        super(2, cVar);
        this.$params = params;
        this.this$0 = initializeStateLoadWeb;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<r> create(Object obj, c<?> cVar) {
        InitializeStateLoadWeb$doWork$2 initializeStateLoadWeb$doWork$2 = new InitializeStateLoadWeb$doWork$2(this.$params, this.this$0, cVar);
        initializeStateLoadWeb$doWork$2.L$0 = obj;
        return initializeStateLoadWeb$doWork$2;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo1invoke(l0 l0Var, c<? super Result<? extends InitializeStateLoadWeb.LoadWebResult>> cVar) {
        return invoke2(l0Var, (c<? super Result<InitializeStateLoadWeb.LoadWebResult>>) cVar);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(l0 l0Var, c<? super Result<InitializeStateLoadWeb.LoadWebResult>> cVar) {
        return ((InitializeStateLoadWeb$doWork$2) create(l0Var, cVar)).invokeSuspend(r.f64562a);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0167 A[Catch: all -> 0x01ed, CancellationException -> 0x0216, TryCatch #6 {CancellationException -> 0x0216, all -> 0x01ed, blocks: (B:8:0x0018, B:51:0x0186, B:55:0x01a9, B:57:0x01b3, B:60:0x01be, B:61:0x01d0, B:63:0x01d3, B:64:0x01df, B:46:0x0161, B:48:0x0167, B:52:0x0189, B:53:0x019b, B:45:0x0157, B:38:0x0129, B:54:0x019c, B:37:0x011f, B:23:0x006f, B:13:0x0037, B:43:0x014e, B:40:0x012f), top: B:80:0x000c, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0185 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:52:0x0189 A[Catch: all -> 0x01ed, CancellationException -> 0x0216, TryCatch #6 {CancellationException -> 0x0216, all -> 0x01ed, blocks: (B:8:0x0018, B:51:0x0186, B:55:0x01a9, B:57:0x01b3, B:60:0x01be, B:61:0x01d0, B:63:0x01d3, B:64:0x01df, B:46:0x0161, B:48:0x0167, B:52:0x0189, B:53:0x019b, B:45:0x0157, B:38:0x0129, B:54:0x019c, B:37:0x011f, B:23:0x006f, B:13:0x0037, B:43:0x014e, B:40:0x012f), top: B:80:0x000c, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x01d3 A[Catch: all -> 0x01ed, CancellationException -> 0x0216, TryCatch #6 {CancellationException -> 0x0216, all -> 0x01ed, blocks: (B:8:0x0018, B:51:0x0186, B:55:0x01a9, B:57:0x01b3, B:60:0x01be, B:61:0x01d0, B:63:0x01d3, B:64:0x01df, B:46:0x0161, B:48:0x0167, B:52:0x0189, B:53:0x019b, B:45:0x0157, B:38:0x0129, B:54:0x019c, B:37:0x011f, B:23:0x006f, B:13:0x0037, B:43:0x014e, B:40:0x012f), top: B:80:0x000c, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:71:0x0203  */
    /* JADX WARN: Code duplicated, block: B:73:0x0209  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.unity3d.services.core.network.model.HttpRequest] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM3458constructorimpl;
        Object objM3458constructorimpl2;
        ?? r10;
        Object objG;
        Throwable thM3461exceptionOrNullimpl;
        InitializeStateLoadWeb.Params params;
        String string;
        String webViewHash;
        HttpRequest httpRequest;
        HttpRequest httpRequest2;
        InitializeStateLoadWeb initializeStateLoadWeb;
        Object objWithRetry;
        Object objM3458constructorimpl3;
        HttpRequest httpRequest3;
        Object objMo3177invokegIAlus;
        Object objF = a.f();
        int i10 = this.label;
        ?? r11 = 1;
        try {
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        httpRequest2 = (HttpRequest) this.L$3;
                        initializeStateLoadWeb = (InitializeStateLoadWeb) this.L$2;
                        params = (InitializeStateLoadWeb.Params) this.L$1;
                        try {
                            kotlin.c.b(obj);
                            objWithRetry = obj;
                            httpRequest2 = httpRequest2;
                        } catch (Throwable th2) {
                            th = th2;
                            Result.a aVar = Result.Companion;
                            objM3458constructorimpl3 = Result.m3458constructorimpl(kotlin.c.a(th));
                            httpRequest3 = httpRequest2;
                        }
                    } else if (i10 == 2) {
                        HttpRequest httpRequest4 = (HttpRequest) this.L$2;
                        initializeStateLoadWeb = (InitializeStateLoadWeb) this.L$1;
                        params = (InitializeStateLoadWeb.Params) this.L$0;
                        kotlin.c.b(obj);
                        objMo3177invokegIAlus = ((Result) obj).m3466unboximpl();
                        r11 = httpRequest4;
                        r11 = httpRequest3;
                        objM3458constructorimpl2 = Result.m3458constructorimpl(Result.m3457boximpl(objMo3177invokegIAlus));
                        r10 = r11;
                        if (Result.m3464isSuccessimpl(objM3458constructorimpl2)) {
                            throw new InitializationException(ErrorState.NetworkWebviewRequest, new Exception("No connected events within the timeout!"), params.getConfig());
                        }
                        h0 io2 = initializeStateLoadWeb.dispatchers.getIo();
                        InitializeStateLoadWeb$doWork$2$1$webViewData$1 initializeStateLoadWeb$doWork$2$1$webViewData$1 = new InitializeStateLoadWeb$doWork$2$1$webViewData$1(initializeStateLoadWeb, r10, null);
                        this.L$0 = params;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 3;
                        objG = h.g(io2, initializeStateLoadWeb$doWork$2$1$webViewData$1, this);
                        if (objG == objF) {
                            return objF;
                        }
                    } else {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        InitializeStateLoadWeb.Params params2 = (InitializeStateLoadWeb.Params) this.L$0;
                        kotlin.c.b(obj);
                        params = params2;
                        objG = obj;
                    }
                    string = (String) objG;
                    webViewHash = params.getConfig().getWebViewHash();
                    if (webViewHash != null && !ck.p.e(Utilities.Sha256(string), webViewHash)) {
                        throw new InitializationException(ErrorState.InvalidHash, new Exception("Invalid webViewHash"), params.getConfig());
                    }
                    if (webViewHash != null) {
                        Utilities.writeFile(new File(SdkProperties.getLocalWebViewFile()), string);
                    }
                    objM3458constructorimpl = Result.m3458constructorimpl(new InitializeStateLoadWeb.LoadWebResult(params.getConfig(), string));
                    if (Result.m3464isSuccessimpl(objM3458constructorimpl)) {
                        objM3458constructorimpl = Result.m3458constructorimpl(objM3458constructorimpl);
                    } else {
                        thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objM3458constructorimpl);
                        if (thM3461exceptionOrNullimpl != null) {
                            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(thM3461exceptionOrNullimpl));
                        }
                    }
                    return Result.m3457boximpl(objM3458constructorimpl);
                }
                kotlin.c.b(obj);
                l0 l0Var = (l0) this.L$0;
                InitializeStateLoadWeb.Params params3 = this.$params;
                InitializeStateLoadWeb initializeStateLoadWeb2 = this.this$0;
                Result.a aVar2 = Result.Companion;
                DeviceLog.info("Unity Ads init: loading webapp from " + params3.getConfig().getWebViewUrl());
                String webViewUrl = params3.getConfig().getWebViewUrl();
                ck.p.i(webViewUrl, "params.config.webViewUrl");
                HttpRequest httpRequest5 = new HttpRequest(webViewUrl, null, RequestType.GET, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131066, null);
                try {
                    int maxRetries = params3.getConfig().getMaxRetries();
                    double retryScalingFactor = params3.getConfig().getRetryScalingFactor();
                    long retryDelay = params3.getConfig().getRetryDelay();
                    InitializationException initializationException = new InitializationException(ErrorState.NetworkWebviewRequest, new Exception(), params3.getConfig());
                    InitializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1 initializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1 = new InitializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1(initializeStateLoadWeb2, httpRequest5, null);
                    this.L$0 = l0Var;
                    this.L$1 = params3;
                    this.L$2 = initializeStateLoadWeb2;
                    this.L$3 = httpRequest5;
                    this.label = 1;
                    httpRequest = httpRequest5;
                    try {
                        objWithRetry = TaskExtensionsKt.withRetry(retryDelay, maxRetries, retryScalingFactor, initializationException, initializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1, this);
                        if (objWithRetry == objF) {
                            return objF;
                        }
                        httpRequest2 = httpRequest;
                        params = params3;
                        initializeStateLoadWeb = initializeStateLoadWeb2;
                    } catch (Throwable th3) {
                        th = th3;
                        httpRequest2 = httpRequest;
                        params = params3;
                        initializeStateLoadWeb = initializeStateLoadWeb2;
                        Result.a aVar3 = Result.Companion;
                        objM3458constructorimpl3 = Result.m3458constructorimpl(kotlin.c.a(th));
                        httpRequest3 = httpRequest2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    httpRequest = httpRequest5;
                }
                objM3458constructorimpl3 = Result.m3458constructorimpl((HttpResponse) objWithRetry);
                httpRequest3 = httpRequest2;
                if (Result.m3463isFailureimpl(objM3458constructorimpl3)) {
                    InitializeStateNetworkError initializeStateNetworkError = initializeStateLoadWeb.initializeStateNetworkError;
                    InitializeStateNetworkError.Params params4 = new InitializeStateNetworkError.Params(params.getConfig());
                    this.L$0 = params;
                    this.L$1 = initializeStateLoadWeb;
                    this.L$2 = httpRequest3;
                    this.L$3 = null;
                    this.label = 2;
                    objMo3177invokegIAlus = initializeStateNetworkError.mo3177invokegIAlus(params4, this);
                    if (objMo3177invokegIAlus == objF) {
                        r11 = httpRequest3;
                        return objF;
                    }
                    r11 = httpRequest3;
                    objM3458constructorimpl2 = Result.m3458constructorimpl(Result.m3457boximpl(objMo3177invokegIAlus));
                    r10 = r11;
                    if (Result.m3464isSuccessimpl(objM3458constructorimpl2)) {
                        throw new InitializationException(ErrorState.NetworkWebviewRequest, new Exception("No connected events within the timeout!"), params.getConfig());
                    }
                    h0 io3 = initializeStateLoadWeb.dispatchers.getIo();
                    InitializeStateLoadWeb$doWork$2$1$webViewData$1 initializeStateLoadWeb$doWork$2$1$webViewData$2 = new InitializeStateLoadWeb$doWork$2$1$webViewData$1(initializeStateLoadWeb, r10, null);
                    this.L$0 = params;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 3;
                    objG = h.g(io3, initializeStateLoadWeb$doWork$2$1$webViewData$2, this);
                    if (objG == objF) {
                        return objF;
                    }
                    string = (String) objG;
                } else {
                    kotlin.c.b(objM3458constructorimpl3);
                    string = ((HttpResponse) objM3458constructorimpl3).getBody().toString();
                }
            } catch (Throwable th5) {
                Result.a aVar4 = Result.Companion;
                objM3458constructorimpl2 = Result.m3458constructorimpl(kotlin.c.a(th5));
                r10 = r11;
            }
            webViewHash = params.getConfig().getWebViewHash();
            if (webViewHash != null) {
                throw new InitializationException(ErrorState.InvalidHash, new Exception("Invalid webViewHash"), params.getConfig());
            }
            if (webViewHash != null) {
                Utilities.writeFile(new File(SdkProperties.getLocalWebViewFile()), string);
            }
            objM3458constructorimpl = Result.m3458constructorimpl(new InitializeStateLoadWeb.LoadWebResult(params.getConfig(), string));
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable th6) {
            Result.a aVar5 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th6));
        }
        if (Result.m3464isSuccessimpl(objM3458constructorimpl)) {
            objM3458constructorimpl = Result.m3458constructorimpl(objM3458constructorimpl);
        } else {
            thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objM3458constructorimpl);
            if (thM3461exceptionOrNullimpl != null) {
                objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(thM3461exceptionOrNullimpl));
            }
        }
        return Result.m3457boximpl(objM3458constructorimpl);
    }
}
