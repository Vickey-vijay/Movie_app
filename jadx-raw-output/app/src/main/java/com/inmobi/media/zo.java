package com.inmobi.media;

import android.view.View;

/* JADX INFO: loaded from: classes10.dex */
public final class zo implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pk.n f25877a;

    public zo(pk.n nVar) {
        this.f25877a = nVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        ck.p.j(view, "v");
        this.f25877a.n(Boolean.TRUE);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ck.p.j(view, "v");
        this.f25877a.n(Boolean.FALSE);
    }
}
