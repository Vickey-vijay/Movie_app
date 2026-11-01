package com.unity3d.ads.adplayer;

import androidx.lifecycle.LifecycleOwnerKt;
import bk.p;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import nk.j;
import nk.l;
import nk.l0;
import qk.k;
import tj.d;

/* JADX INFO: compiled from: FullScreenWebViewDisplay.kt */
/* JADX INFO: loaded from: classes.dex */
@d(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1", f = "FullScreenWebViewDisplay.kt", l = {}, m = "invokeSuspend")
public final class FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1 extends SuspendLambda implements p<qk.d<? super DisplayMessage>, rj.c<? super r>, Object> {
    public final /* synthetic */ l<r> $continuation;
    public int label;
    public final /* synthetic */ FullScreenWebViewDisplay this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1(FullScreenWebViewDisplay fullScreenWebViewDisplay, l<? super r> lVar, rj.c<? super FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1> cVar) {
        super(2, cVar);
        this.this$0 = fullScreenWebViewDisplay;
        this.$continuation = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c<r> create(Object obj, rj.c<?> cVar) {
        return new FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1(this.this$0, this.$continuation, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo1invoke(qk.d<? super DisplayMessage> dVar, rj.c<? super r> cVar) {
        return ((FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1) create(dVar, cVar)).invokeSuspend(r.f64562a);
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: FullScreenWebViewDisplay.kt */
    @d(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1$1", f = "FullScreenWebViewDisplay.kt", l = {94}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<l0, rj.c<? super r>, Object> {
        public final /* synthetic */ l<r> $continuation;
        private /* synthetic */ Object L$0;
        public int label;
        public final /* synthetic */ FullScreenWebViewDisplay this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(FullScreenWebViewDisplay fullScreenWebViewDisplay, l<? super r> lVar, rj.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.this$0 = fullScreenWebViewDisplay;
            this.$continuation = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final rj.c<r> create(Object obj, rj.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$continuation, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, rj.c<? super r> cVar) {
            return ((AnonymousClass1) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            l0 l0Var;
            Object objF = sj.a.f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    l0Var = (l0) this.L$0;
                    kotlin.c.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.c.b(obj);
                l0 l0Var2 = (l0) this.L$0;
                k<DisplayMessage> displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                DisplayMessage.WebViewInstanceRequest webViewInstanceRequest = new DisplayMessage.WebViewInstanceRequest(this.this$0.opportunityId);
                this.L$0 = l0Var2;
                this.label = 1;
                if (displayMessages.emit(webViewInstanceRequest, this) == objF) {
                    return objF;
                }
                l0Var = l0Var2;
            }
            kotlinx.coroutines.d.f(l0Var);
            l<r> lVar = this.$continuation;
            Result.a aVar = Result.Companion;
            r rVar = r.f64562a;
            lVar.resumeWith(Result.m3458constructorimpl(rVar));
            return rVar;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        if (this.label == 0) {
            kotlin.c.b(obj);
            j.d(LifecycleOwnerKt.getLifecycleScope(this.this$0), this.this$0.getDispatchers().getDefault(), null, new AnonymousClass1(this.this$0, this.$continuation, null), 2, null);
            return r.f64562a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
