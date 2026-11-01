package com.unity3d.services.core.domain.task;

import bk.p;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.IModuleConfiguration;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.webview.WebView;
import com.unity3d.services.core.webview.WebViewApp;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutKt;
import mj.r;
import nk.l0;
import rj.c;
import sj.a;
import tj.d;

/* JADX INFO: compiled from: InitializeStateReset.kt */
/* JADX INFO: loaded from: classes4.dex */
@d(c = "com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2", f = "InitializeStateReset.kt", l = {41}, m = "invokeSuspend")
public final class InitializeStateReset$doWork$2 extends SuspendLambda implements p<l0, c<? super Result<? extends Configuration>>, Object> {
    public final /* synthetic */ InitializeStateReset.Params $params;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ InitializeStateReset this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateReset$doWork$2(InitializeStateReset.Params params, InitializeStateReset initializeStateReset, c<? super InitializeStateReset$doWork$2> cVar) {
        super(2, cVar);
        this.$params = params;
        this.this$0 = initializeStateReset;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<r> create(Object obj, c<?> cVar) {
        return new InitializeStateReset$doWork$2(this.$params, this.this$0, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo1invoke(l0 l0Var, c<? super Result<? extends Configuration>> cVar) {
        return ((InitializeStateReset$doWork$2) create(l0Var, cVar)).invokeSuspend(r.f64562a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007a A[Catch: all -> 0x00c6, CancellationException -> 0x00ef, TryCatch #2 {CancellationException -> 0x00ef, all -> 0x00c6, blocks: (B:6:0x0014, B:22:0x005d, B:27:0x006b, B:29:0x007a, B:31:0x0080, B:33:0x008e, B:34:0x0090, B:36:0x0093, B:38:0x009f, B:39:0x00aa, B:40:0x00ad, B:41:0x00b6, B:42:0x00bd, B:43:0x00be, B:44:0x00c5, B:25:0x0063, B:26:0x006a, B:11:0x0027, B:13:0x0034, B:15:0x0039, B:18:0x0041), top: B:57:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0080 A[Catch: all -> 0x00c6, CancellationException -> 0x00ef, TryCatch #2 {CancellationException -> 0x00ef, all -> 0x00c6, blocks: (B:6:0x0014, B:22:0x005d, B:27:0x006b, B:29:0x007a, B:31:0x0080, B:33:0x008e, B:34:0x0090, B:36:0x0093, B:38:0x009f, B:39:0x00aa, B:40:0x00ad, B:41:0x00b6, B:42:0x00bd, B:43:0x00be, B:44:0x00c5, B:25:0x0063, B:26:0x006a, B:11:0x0027, B:13:0x0034, B:15:0x0039, B:18:0x0041), top: B:57:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x008e A[Catch: all -> 0x00c6, CancellationException -> 0x00ef, TryCatch #2 {CancellationException -> 0x00ef, all -> 0x00c6, blocks: (B:6:0x0014, B:22:0x005d, B:27:0x006b, B:29:0x007a, B:31:0x0080, B:33:0x008e, B:34:0x0090, B:36:0x0093, B:38:0x009f, B:39:0x00aa, B:40:0x00ad, B:41:0x00b6, B:42:0x00bd, B:43:0x00be, B:44:0x00c5, B:25:0x0063, B:26:0x006a, B:11:0x0027, B:13:0x0034, B:15:0x0039, B:18:0x0041), top: B:57:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0093 A[Catch: all -> 0x00c6, CancellationException -> 0x00ef, TryCatch #2 {CancellationException -> 0x00ef, all -> 0x00c6, blocks: (B:6:0x0014, B:22:0x005d, B:27:0x006b, B:29:0x007a, B:31:0x0080, B:33:0x008e, B:34:0x0090, B:36:0x0093, B:38:0x009f, B:39:0x00aa, B:40:0x00ad, B:41:0x00b6, B:42:0x00bd, B:43:0x00be, B:44:0x00c5, B:25:0x0063, B:26:0x006a, B:11:0x0027, B:13:0x0034, B:15:0x0039, B:18:0x0041), top: B:57:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x009f A[Catch: all -> 0x00c6, CancellationException -> 0x00ef, TryCatch #2 {CancellationException -> 0x00ef, all -> 0x00c6, blocks: (B:6:0x0014, B:22:0x005d, B:27:0x006b, B:29:0x007a, B:31:0x0080, B:33:0x008e, B:34:0x0090, B:36:0x0093, B:38:0x009f, B:39:0x00aa, B:40:0x00ad, B:41:0x00b6, B:42:0x00bd, B:43:0x00be, B:44:0x00c5, B:25:0x0063, B:26:0x006a, B:11:0x0027, B:13:0x0034, B:15:0x0039, B:18:0x0041), top: B:57:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b6 A[Catch: all -> 0x00c6, CancellationException -> 0x00ef, TryCatch #2 {CancellationException -> 0x00ef, all -> 0x00c6, blocks: (B:6:0x0014, B:22:0x005d, B:27:0x006b, B:29:0x007a, B:31:0x0080, B:33:0x008e, B:34:0x0090, B:36:0x0093, B:38:0x009f, B:39:0x00aa, B:40:0x00ad, B:41:0x00b6, B:42:0x00bd, B:43:0x00be, B:44:0x00c5, B:25:0x0063, B:26:0x006a, B:11:0x0027, B:13:0x0034, B:15:0x0039, B:18:0x0041), top: B:57:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00be A[Catch: all -> 0x00c6, CancellationException -> 0x00ef, TryCatch #2 {CancellationException -> 0x00ef, all -> 0x00c6, blocks: (B:6:0x0014, B:22:0x005d, B:27:0x006b, B:29:0x007a, B:31:0x0080, B:33:0x008e, B:34:0x0090, B:36:0x0093, B:38:0x009f, B:39:0x00aa, B:40:0x00ad, B:41:0x00b6, B:42:0x00bd, B:43:0x00be, B:44:0x00c5, B:25:0x0063, B:26:0x006a, B:11:0x0027, B:13:0x0034, B:15:0x0039, B:18:0x0041), top: B:57:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00aa A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM3458constructorimpl;
        Throwable thM3461exceptionOrNullimpl;
        InitializeStateReset.Params params;
        InitializeStateReset initializeStateReset;
        WebView webView;
        InitializeStateReset initializeStateReset2;
        int i10;
        Class[] moduleConfigurationList;
        IModuleConfiguration moduleConfiguration;
        Object objF = a.f();
        int i11 = this.label;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    initializeStateReset2 = (InitializeStateReset) this.L$1;
                    params = (InitializeStateReset.Params) this.L$0;
                    kotlin.c.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.c.b(obj);
                params = this.$params;
                initializeStateReset = this.this$0;
                Result.a aVar = Result.Companion;
                DeviceLog.debug("Unity Ads init: starting init");
                WebViewApp currentApp = WebViewApp.getCurrentApp();
                if (currentApp != null) {
                    currentApp.resetWebViewAppInitialization();
                }
                if (currentApp != null) {
                    webView = currentApp.getWebView();
                } else {
                    webView = null;
                }
                if (webView != null) {
                    long webViewAppCreateTimeout = params.getConfig().getWebViewAppCreateTimeout();
                    InitializeStateReset$doWork$2$1$success$1 initializeStateReset$doWork$2$1$success$1 = new InitializeStateReset$doWork$2$1$success$1(initializeStateReset, currentApp, null);
                    this.L$0 = params;
                    this.L$1 = initializeStateReset;
                    this.label = 1;
                    Object objD = TimeoutKt.d(webViewAppCreateTimeout, initializeStateReset$doWork$2$1$success$1, this);
                    if (objD == objF) {
                        return objF;
                    }
                    initializeStateReset2 = initializeStateReset;
                    obj = objD;
                }
                initializeStateReset.unregisterLifecycleCallbacks();
                SdkProperties.setCacheDirectory(null);
                SdkProperties.setWebViewCacheDirectory(null);
                if (SdkProperties.getCacheDirectory() != null) {
                    if (SdkProperties.getWebViewCacheDirectory() != null) {
                        SdkProperties.setInitialized(false);
                        moduleConfigurationList = params.getConfig().getModuleConfigurationList();
                        if (moduleConfigurationList == null) {
                            moduleConfigurationList = new Class[0];
                        }
                        for (Class cls : moduleConfigurationList) {
                            moduleConfiguration = params.getConfig().getModuleConfiguration(cls);
                            if (moduleConfiguration != null) {
                                tj.a.a(moduleConfiguration.resetState(params.getConfig()));
                            }
                        }
                        objM3458constructorimpl = Result.m3458constructorimpl(params.getConfig());
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
                    throw new Exception("WebView cache directory is NULL");
                }
                throw new Exception("Cache directory is NULL");
            }
            if (((r) obj) != null) {
                initializeStateReset = initializeStateReset2;
                initializeStateReset.unregisterLifecycleCallbacks();
                SdkProperties.setCacheDirectory(null);
                SdkProperties.setWebViewCacheDirectory(null);
                if (SdkProperties.getCacheDirectory() != null) {
                    if (SdkProperties.getWebViewCacheDirectory() != null) {
                        SdkProperties.setInitialized(false);
                        moduleConfigurationList = params.getConfig().getModuleConfigurationList();
                        if (moduleConfigurationList == null) {
                            moduleConfigurationList = new Class[0];
                        }
                        while (i10 < r2) {
                            moduleConfiguration = params.getConfig().getModuleConfiguration(cls);
                            if (moduleConfiguration != null) {
                                tj.a.a(moduleConfiguration.resetState(params.getConfig()));
                            }
                        }
                        objM3458constructorimpl = Result.m3458constructorimpl(params.getConfig());
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
                    throw new Exception("WebView cache directory is NULL");
                }
                throw new Exception("Cache directory is NULL");
            }
            throw new Exception("Reset failed on opening ConditionVariable");
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
        }
    }
}
