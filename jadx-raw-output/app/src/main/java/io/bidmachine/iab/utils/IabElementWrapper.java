package io.bidmachine.iab.utils;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes.dex */
public abstract class IabElementWrapper<T extends View> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View.OnClickListener f59382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f59383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IabElementStyle f59384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f59385d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Runnable f59386e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Animator.AnimatorListener f59387f = new b();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IabElementWrapper.this.f59385d = false;
            IabElementWrapper iabElementWrapper = IabElementWrapper.this;
            View view = iabElementWrapper.f59383b;
            if (view == null || iabElementWrapper.f59384c == null) {
                return;
            }
            view.animate().alpha(0.0f).setDuration(400L).setListener(IabElementWrapper.this.f59387f).withLayer();
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            animator.removeAllListeners();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            View view = IabElementWrapper.this.f59383b;
            if (view != null) {
                view.setClickable(view.getAlpha() != 0.0f);
            }
        }
    }

    public IabElementWrapper(@Nullable View.OnClickListener onClickListener) {
        this.f59382a = onClickListener;
    }

    public void a(Context context, View view, IabElementStyle iabElementStyle) {
    }

    public void attach(@NonNull Context context, @NonNull ViewGroup viewGroup, @Nullable IabElementStyle iabElementStyle) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        IabElementStyle iabElementStyle2;
        IabElementStyle iabElementStyleCopyWith = c(context, iabElementStyle).copyWith(iabElementStyle);
        if (!iabElementStyleCopyWith.isVisible().booleanValue()) {
            detach();
            return;
        }
        if (viewGroup instanceof FrameLayout) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a(context, iabElementStyleCopyWith));
            iabElementStyleCopyWith.applyAlignment(layoutParams);
            marginLayoutParams = layoutParams;
        } else {
            if (!(viewGroup instanceof RelativeLayout)) {
                throw new IllegalArgumentException("Parent should be instance of FrameLayout or RelativeLayout");
            }
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(a(context, iabElementStyleCopyWith));
            iabElementStyleCopyWith.applyRelativeAlignment(layoutParams2);
            marginLayoutParams = layoutParams2;
        }
        iabElementStyleCopyWith.applyMargin(context, marginLayoutParams);
        View view = this.f59383b;
        if (view == null || (iabElementStyle2 = this.f59384c) == null || a(view, iabElementStyle2, iabElementStyleCopyWith)) {
            Utils.removeFromParent(this.f59383b);
            View viewB = b(context, iabElementStyleCopyWith);
            this.f59383b = viewB;
            viewGroup.addView(viewB, marginLayoutParams);
        } else {
            this.f59383b.setLayoutParams(marginLayoutParams);
            this.f59383b.setVisibility(0);
        }
        this.f59383b.setAlpha(iabElementStyleCopyWith.getOpacity().floatValue());
        iabElementStyleCopyWith.applyPadding(context, this.f59383b);
        this.f59383b.setOnClickListener(this.f59382a);
        this.f59384c = iabElementStyleCopyWith;
        a(this.f59383b, iabElementStyleCopyWith);
        a(context, this.f59383b, iabElementStyleCopyWith);
    }

    public abstract View b(Context context, IabElementStyle iabElementStyle);

    public void bringToFront() {
        View view = this.f59383b;
        if (view != null) {
            view.bringToFront();
        }
    }

    public abstract IabElementStyle c(Context context, IabElementStyle iabElementStyle);

    public void cancelHide() {
        this.f59385d = false;
        View view = this.f59383b;
        if (view == null || this.f59384c == null) {
            return;
        }
        view.animate().cancel();
        this.f59383b.removeCallbacks(this.f59386e);
        this.f59383b.setClickable(true);
        this.f59383b.setAlpha(this.f59384c.getOpacity().floatValue());
    }

    public void detach() {
        if (this.f59383b != null) {
            cancelHide();
            Utils.removeFromParent(this.f59383b);
            this.f59383b = null;
            this.f59384c = null;
        }
    }

    @Nullable
    @VisibleForTesting
    public T getCachedView() {
        return (T) this.f59383b;
    }

    public void invalidate() {
        View view;
        if (!isAttached() || (view = this.f59383b) == null || this.f59384c == null) {
            return;
        }
        a(view.getContext(), this.f59383b, this.f59384c);
    }

    public boolean isAttached() {
        return this.f59383b != null;
    }

    public void setVisibility(int i10) {
        View view = this.f59383b;
        if (view != null) {
            view.setVisibility(i10);
        }
    }

    public void toggleHide() {
        IabElementStyle iabElementStyle;
        Float hideAfter;
        if (this.f59385d || this.f59383b == null || (iabElementStyle = this.f59384c) == null || (hideAfter = iabElementStyle.getHideAfter()) == null || hideAfter.floatValue() == 0.0f) {
            return;
        }
        this.f59385d = true;
        this.f59383b.postDelayed(this.f59386e, (long) (hideAfter.floatValue() * 1000.0f));
    }

    public void toggleShow() {
        if (this.f59383b == null || this.f59384c == null) {
            return;
        }
        cancelHide();
        toggleHide();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(View view, IabElementStyle iabElementStyle) {
        if (view instanceof IabElement) {
            ((IabElement) view).setStyle(iabElementStyle);
        }
    }

    public ViewGroup.MarginLayoutParams a(Context context, IabElementStyle iabElementStyle) {
        return new ViewGroup.MarginLayoutParams(iabElementStyle.getWidth(context).intValue(), iabElementStyle.getHeight(context).intValue());
    }

    public boolean a(View view, IabElementStyle iabElementStyle, IabElementStyle iabElementStyle2) {
        return !TextUtils.equals(iabElementStyle.getStyle(), iabElementStyle2.getStyle());
    }
}
