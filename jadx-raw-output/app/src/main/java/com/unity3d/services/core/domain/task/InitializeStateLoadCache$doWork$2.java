package com.unity3d.services.core.domain.task;

import bk.p;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import java.nio.charset.Charset;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import nk.l0;
import rj.c;
import sj.a;
import tj.d;

/* JADX INFO: compiled from: InitializeStateLoadCache.kt */
/* JADX INFO: loaded from: classes8.dex */
@d(c = "com.unity3d.services.core.domain.task.InitializeStateLoadCache$doWork$2", f = "InitializeStateLoadCache.kt", l = {}, m = "invokeSuspend")
public final class InitializeStateLoadCache$doWork$2 extends SuspendLambda implements p<l0, c<? super Result<? extends InitializeStateLoadCache.LoadCacheResult>>, Object> {
    public final /* synthetic */ InitializeStateLoadCache.Params $params;
    public int label;
    public final /* synthetic */ InitializeStateLoadCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateLoadCache$doWork$2(InitializeStateLoadCache initializeStateLoadCache, InitializeStateLoadCache.Params params, c<? super InitializeStateLoadCache$doWork$2> cVar) {
        super(2, cVar);
        this.this$0 = initializeStateLoadCache;
        this.$params = params;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<r> create(Object obj, c<?> cVar) {
        return new InitializeStateLoadCache$doWork$2(this.this$0, this.$params, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo1invoke(l0 l0Var, c<? super Result<? extends InitializeStateLoadCache.LoadCacheResult>> cVar) {
        return invoke2(l0Var, (c<? super Result<InitializeStateLoadCache.LoadCacheResult>>) cVar);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(l0 l0Var, c<? super Result<InitializeStateLoadCache.LoadCacheResult>> cVar) {
        return ((InitializeStateLoadCache$doWork$2) create(l0Var, cVar)).invokeSuspend(r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM3458constructorimpl;
        boolean z10;
        InitializeStateLoadCache.LoadCacheResult loadCacheResult;
        a.f();
        if (this.label == 0) {
            kotlin.c.b(obj);
            InitializeStateLoadCache initializeStateLoadCache = this.this$0;
            InitializeStateLoadCache.Params params = this.$params;
            try {
                Result.a aVar = Result.Companion;
                DeviceLog.debug("Unity Ads init: check if webapp can be loaded from local cache");
                byte[] webViewData = initializeStateLoadCache.getWebViewData();
                boolean z11 = true;
                if (webViewData == null) {
                    loadCacheResult = new InitializeStateLoadCache.LoadCacheResult(true, null, 2, null);
                } else {
                    String strSha256 = Utilities.Sha256(webViewData);
                    Charset charsetForName = Charset.forName("UTF-8");
                    ck.p.i(charsetForName, "forName(\"UTF-8\")");
                    String str = new String(webViewData, charsetForName);
                    if (strSha256 != null && ck.p.e(strSha256, params.getConfig().getWebViewHash())) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (!z10) {
                        DeviceLog.info("Unity Ads init: webapp loaded from local cache");
                    }
                    if (!z10) {
                        z11 = false;
                    }
                    loadCacheResult = new InitializeStateLoadCache.LoadCacheResult(z11, str);
                }
                objM3458constructorimpl = Result.m3458constructorimpl(loadCacheResult);
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
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
