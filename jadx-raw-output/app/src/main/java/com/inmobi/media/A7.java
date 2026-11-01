package com.inmobi.media;

import android.view.View;
import com.mbridge.msdk.MBridgeConstans;

/* JADX INFO: loaded from: classes5.dex */
public final class A7 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f22347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N7 f22348b;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ck.p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
    }

    public A7(View view, N7 n10) {
        this.f22347a = view;
        this.f22348b = n10;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        ck.p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        this.f22347a.removeOnAttachStateChangeListener(this);
        InterfaceC3028m9 interfaceC3028m9 = this.f22348b.f23197b;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).a("HtmlMediaPlayer", "inflate: MediaPlayerLayout is attached to window");
        }
        this.f22348b.a(C3127q8.f25156a);
    }
}
