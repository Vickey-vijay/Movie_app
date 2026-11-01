package yads;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes10.dex */
public final class jl3 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver.OnPreDrawListener f79090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f79091b;

    public jl3(View view, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        this.f79090a = onPreDrawListener;
        this.f79091b = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f79090a.onPreDraw();
        this.f79091b.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}
