package com.unity3d.ads.adplayer;

import bk.p;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import nk.l0;
import tj.d;

/* JADX INFO: compiled from: AndroidWebViewContainer.kt */
/* JADX INFO: loaded from: classes4.dex */
@d(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$applySafeAreaInsets$1$1", f = "AndroidWebViewContainer.kt", l = {}, m = "invokeSuspend")
public final class AndroidWebViewContainer$applySafeAreaInsets$1$1 extends SuspendLambda implements p<l0, rj.c<? super r>, Object> {
    public final /* synthetic */ String $js;
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AndroidWebViewContainer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidWebViewContainer$applySafeAreaInsets$1$1(AndroidWebViewContainer androidWebViewContainer, String str, rj.c<? super AndroidWebViewContainer$applySafeAreaInsets$1$1> cVar) {
        super(2, cVar);
        this.this$0 = androidWebViewContainer;
        this.$js = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c<r> create(Object obj, rj.c<?> cVar) {
        AndroidWebViewContainer$applySafeAreaInsets$1$1 androidWebViewContainer$applySafeAreaInsets$1$1 = new AndroidWebViewContainer$applySafeAreaInsets$1$1(this.this$0, this.$js, cVar);
        androidWebViewContainer$applySafeAreaInsets$1$1.L$0 = obj;
        return androidWebViewContainer$applySafeAreaInsets$1$1;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo1invoke(l0 l0Var, rj.c<? super r> cVar) {
        return ((AndroidWebViewContainer$applySafeAreaInsets$1$1) create(l0Var, cVar)).invokeSuspend(r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        if (this.label == 0) {
            kotlin.c.b(obj);
            AndroidWebViewContainer androidWebViewContainer = this.this$0;
            String str = this.$js;
            try {
                Result.a aVar = Result.Companion;
                androidWebViewContainer.getWebView().evaluateJavascript(str, null);
                Result.m3458constructorimpl(r.f64562a);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                Result.m3458constructorimpl(kotlin.c.a(th2));
            }
            return r.f64562a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
