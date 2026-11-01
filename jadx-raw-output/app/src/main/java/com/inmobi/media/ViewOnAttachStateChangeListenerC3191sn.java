package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.inmobi.media.sn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class ViewOnAttachStateChangeListenerC3191sn implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pk.n f25355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f25356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f25357c;

    public ViewOnAttachStateChangeListenerC3191sn(pk.n nVar, View view, ViewGroup viewGroup) {
        this.f25355a = nVar;
        this.f25356b = view;
        this.f25357c = viewGroup;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        ck.p.j(view, "v");
        this.f25355a.n(Boolean.valueOf(AbstractC3266vn.a(this.f25356b, this.f25357c)));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ck.p.j(view, "v");
        this.f25355a.n(Boolean.FALSE);
    }
}
