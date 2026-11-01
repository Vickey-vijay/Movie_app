package yads;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes11.dex */
public final class hk implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f78257a;

    public hk(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f78257a = onGlobalLayoutListener;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(this.f78257a);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getViewTreeObserver().removeOnGlobalLayoutListener(this.f78257a);
    }
}
