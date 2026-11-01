package com.unity3d.ads.adplayer;

import bk.p;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import nk.l0;
import qk.u;
import tj.d;

/* JADX INFO: compiled from: AndroidEmbeddableWebViewAdPlayer.kt */
/* JADX INFO: loaded from: classes4.dex */
@d(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$3$1", f = "AndroidEmbeddableWebViewAdPlayer.kt", l = {97, 98}, m = "invokeSuspend")
public final class AndroidEmbeddableWebViewAdPlayer$show$3$1 extends SuspendLambda implements p<l0, rj.c<? super r>, Object> {
    public final /* synthetic */ ShowOptions $showOptions;
    public int label;
    public final /* synthetic */ AndroidEmbeddableWebViewAdPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidEmbeddableWebViewAdPlayer$show$3$1(AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer, ShowOptions showOptions, rj.c<? super AndroidEmbeddableWebViewAdPlayer$show$3$1> cVar) {
        super(2, cVar);
        this.this$0 = androidEmbeddableWebViewAdPlayer;
        this.$showOptions = showOptions;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c<r> create(Object obj, rj.c<?> cVar) {
        return new AndroidEmbeddableWebViewAdPlayer$show$3$1(this.this$0, this.$showOptions, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo1invoke(l0 l0Var, rj.c<? super r> cVar) {
        return ((AndroidEmbeddableWebViewAdPlayer$show$3$1) create(l0Var, cVar)).invokeSuspend(r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            } else {
                kotlin.c.b(obj);
            }
            throw new KotlinNothingValueException();
        }
        kotlin.c.b(obj);
        WebViewAdPlayer webViewAdPlayer = this.this$0.webViewAdPlayer;
        Map<String, Object> unityAdsShowOptions = ((AndroidShowOptions) this.$showOptions).getUnityAdsShowOptions();
        this.label = 1;
        if (webViewAdPlayer.requestShow(unityAdsShowOptions, this) == objF) {
            return objF;
        }
        u<Boolean> appActive = this.this$0.lifecycleDataSource.getAppActive();
        final AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer = this.this$0;
        qk.d<? super Boolean> dVar = new qk.d() { // from class: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$3$1.1
            @Override // qk.d
            public /* bridge */ /* synthetic */ Object emit(Object obj2, rj.c cVar) {
                return emit(((Boolean) obj2).booleanValue(), (rj.c<? super r>) cVar);
            }

            public final Object emit(boolean z10, rj.c<? super r> cVar) throws Throwable {
                Object objSendFocusChange = androidEmbeddableWebViewAdPlayer.webViewAdPlayer.sendFocusChange(z10, cVar);
                return objSendFocusChange == sj.a.f() ? objSendFocusChange : r.f64562a;
            }
        };
        this.label = 2;
        if (appActive.collect(dVar, this) == objF) {
            return objF;
        }
        throw new KotlinNothingValueException();
    }
}
