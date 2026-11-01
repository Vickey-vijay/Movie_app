package com.unity3d.ads.adplayer;

import androidx.lifecycle.LifecycleOwnerKt;
import bk.p;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import nk.j;
import tj.d;

/* JADX INFO: compiled from: FullScreenWebViewDisplay.kt */
/* JADX INFO: loaded from: classes.dex */
@d(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3", f = "FullScreenWebViewDisplay.kt", l = {}, m = "invokeSuspend")
public final class FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3 extends SuspendLambda implements p<DisplayMessage, rj.c<? super r>, Object> {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ FullScreenWebViewDisplay this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3(FullScreenWebViewDisplay fullScreenWebViewDisplay, rj.c<? super FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3> cVar) {
        super(2, cVar);
        this.this$0 = fullScreenWebViewDisplay;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c<r> create(Object obj, rj.c<?> cVar) {
        FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3 fullScreenWebViewDisplay$listenToAdPlayerEvents$2$3 = new FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3(this.this$0, cVar);
        fullScreenWebViewDisplay$listenToAdPlayerEvents$2$3.L$0 = obj;
        return fullScreenWebViewDisplay$listenToAdPlayerEvents$2$3;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo1invoke(DisplayMessage displayMessage, rj.c<? super r> cVar) {
        return ((FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3) create(displayMessage, cVar)).invokeSuspend(r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM3458constructorimpl;
        sj.a.f();
        if (this.label == 0) {
            kotlin.c.b(obj);
            DisplayMessage displayMessage = (DisplayMessage) this.L$0;
            FullScreenWebViewDisplay fullScreenWebViewDisplay = this.this$0;
            try {
                Result.a aVar = Result.Companion;
                if (displayMessage instanceof DisplayMessage.DisplayFinishRequest) {
                    fullScreenWebViewDisplay.finish();
                } else if (displayMessage instanceof DisplayMessage.WebViewInstanceResponse) {
                    fullScreenWebViewDisplay.loadWebView(((DisplayMessage.WebViewInstanceResponse) displayMessage).getWebView());
                } else if (displayMessage instanceof DisplayMessage.SetOrientation) {
                    fullScreenWebViewDisplay.setRequestedOrientation(((DisplayMessage.SetOrientation) displayMessage).getOrientation());
                } else if (displayMessage instanceof DisplayMessage.OpenUrl) {
                    fullScreenWebViewDisplay.openUrl(displayMessage.getOpportunityId(), ((DisplayMessage.OpenUrl) displayMessage).getIntent(), ((DisplayMessage.OpenUrl) displayMessage).getUseActivityForResult());
                }
                objM3458constructorimpl = Result.m3458constructorimpl(r.f64562a);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
            }
            FullScreenWebViewDisplay fullScreenWebViewDisplay2 = this.this$0;
            Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objM3458constructorimpl);
            if (thM3461exceptionOrNullimpl != null) {
                j.d(LifecycleOwnerKt.getLifecycleScope(fullScreenWebViewDisplay2), fullScreenWebViewDisplay2.getDispatchers().getDefault(), null, new FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3$2$1(fullScreenWebViewDisplay2, thM3461exceptionOrNullimpl, null), 2, null);
            }
            return r.f64562a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
