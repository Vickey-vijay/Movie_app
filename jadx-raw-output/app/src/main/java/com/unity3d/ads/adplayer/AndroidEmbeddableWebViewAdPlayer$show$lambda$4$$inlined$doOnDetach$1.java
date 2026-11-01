package com.unity3d.ads.adplayer;

import android.view.View;
import ck.p;
import com.mbridge.msdk.MBridgeConstans;
import nk.j;

/* JADX INFO: compiled from: View.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class AndroidEmbeddableWebViewAdPlayer$show$lambda$4$$inlined$doOnDetach$1 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View $this_doOnDetach;
    public final /* synthetic */ AndroidEmbeddableWebViewAdPlayer this$0;

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
    }

    public AndroidEmbeddableWebViewAdPlayer$show$lambda$4$$inlined$doOnDetach$1(View view, AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer) {
        this.$this_doOnDetach = view;
        this.this$0 = androidEmbeddableWebViewAdPlayer;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        this.$this_doOnDetach.removeOnAttachStateChangeListener(this);
        j.d(this.this$0.webViewAdPlayer.getScope(), null, null, new AndroidEmbeddableWebViewAdPlayer$show$3$2$1(this.this$0, null), 3, null);
    }
}
