package com.unity3d.ads.adplayer;

import bk.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import nk.l0;
import tj.d;

/* JADX INFO: compiled from: AndroidEmbeddableWebViewAdPlayer.kt */
/* JADX INFO: loaded from: classes4.dex */
@d(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$3$2$1", f = "AndroidEmbeddableWebViewAdPlayer.kt", l = {106}, m = "invokeSuspend")
public final class AndroidEmbeddableWebViewAdPlayer$show$3$2$1 extends SuspendLambda implements p<l0, rj.c<? super r>, Object> {
    public int label;
    public final /* synthetic */ AndroidEmbeddableWebViewAdPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidEmbeddableWebViewAdPlayer$show$3$2$1(AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer, rj.c<? super AndroidEmbeddableWebViewAdPlayer$show$3$2$1> cVar) {
        super(2, cVar);
        this.this$0 = androidEmbeddableWebViewAdPlayer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c<r> create(Object obj, rj.c<?> cVar) {
        return new AndroidEmbeddableWebViewAdPlayer$show$3$2$1(this.this$0, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo1invoke(l0 l0Var, rj.c<? super r> cVar) {
        return ((AndroidEmbeddableWebViewAdPlayer$show$3$2$1) create(l0Var, cVar)).invokeSuspend(r.f64562a);
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
            AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer = this.this$0;
            this.label = 1;
            if (androidEmbeddableWebViewAdPlayer.destroy(this) == objF) {
                return objF;
            }
        }
        return r.f64562a;
    }
}
