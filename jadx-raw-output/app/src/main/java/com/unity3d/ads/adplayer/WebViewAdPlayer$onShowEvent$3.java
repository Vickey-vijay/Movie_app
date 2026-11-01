package com.unity3d.ads.adplayer;

import bk.q;
import com.unity3d.ads.adplayer.model.ShowStatus;
import com.unity3d.ads.core.data.model.ShowEvent;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import tj.d;

/* JADX INFO: compiled from: WebViewAdPlayer.kt */
/* JADX INFO: loaded from: classes.dex */
@d(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$onShowEvent$3", f = "WebViewAdPlayer.kt", l = {}, m = "invokeSuspend")
public final class WebViewAdPlayer$onShowEvent$3 extends SuspendLambda implements q<ShowEvent, Boolean, rj.c<? super ShowEvent>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ boolean Z$0;
    public int label;

    public WebViewAdPlayer$onShowEvent$3(rj.c<? super WebViewAdPlayer$onShowEvent$3> cVar) {
        super(3, cVar);
    }

    public final Object invoke(ShowEvent showEvent, boolean z10, rj.c<? super ShowEvent> cVar) {
        WebViewAdPlayer$onShowEvent$3 webViewAdPlayer$onShowEvent$3 = new WebViewAdPlayer$onShowEvent$3(cVar);
        webViewAdPlayer$onShowEvent$3.L$0 = showEvent;
        webViewAdPlayer$onShowEvent$3.Z$0 = z10;
        return webViewAdPlayer$onShowEvent$3.invokeSuspend(r.f64562a);
    }

    @Override // bk.q
    public /* bridge */ /* synthetic */ Object invoke(ShowEvent showEvent, Boolean bool, rj.c<? super ShowEvent> cVar) {
        return invoke(showEvent, bool.booleanValue(), cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        if (this.label == 0) {
            kotlin.c.b(obj);
            ShowEvent showEvent = (ShowEvent) this.L$0;
            if (this.Z$0) {
                return new ShowEvent.Completed(ShowStatus.COMPLETED, null, null, 6, null);
            }
            return showEvent;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
