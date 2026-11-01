package com.unity3d.ads.adplayer;

import bk.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import nk.l0;
import qk.k;
import tj.d;

/* JADX INFO: compiled from: FullScreenWebViewDisplay.kt */
/* JADX INFO: loaded from: classes.dex */
@d(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3$2$1", f = "FullScreenWebViewDisplay.kt", l = {111}, m = "invokeSuspend")
public final class FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3$2$1 extends SuspendLambda implements p<l0, rj.c<? super r>, Object> {
    public final /* synthetic */ Throwable $it;
    public int label;
    public final /* synthetic */ FullScreenWebViewDisplay this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3$2$1(FullScreenWebViewDisplay fullScreenWebViewDisplay, Throwable th2, rj.c<? super FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3$2$1> cVar) {
        super(2, cVar);
        this.this$0 = fullScreenWebViewDisplay;
        this.$it = th2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c<r> create(Object obj, rj.c<?> cVar) {
        return new FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3$2$1(this.this$0, this.$it, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo1invoke(l0 l0Var, rj.c<? super r> cVar) {
        return ((FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3$2$1) create(l0Var, cVar)).invokeSuspend(r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            k<DisplayMessage> displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
            String str = this.this$0.opportunityId;
            String message = this.$it.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            DisplayMessage.DisplayError displayError = new DisplayMessage.DisplayError(str, message);
            this.label = 1;
            if (displayMessages.emit(displayError, this) == objF) {
                return objF;
            }
        }
        return r.f64562a;
    }
}
