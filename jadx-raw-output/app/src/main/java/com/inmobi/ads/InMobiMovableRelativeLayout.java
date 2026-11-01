package com.inmobi.ads;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import ck.p;
import com.inmobi.media.C3152r9;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class InMobiMovableRelativeLayout extends RelativeLayout {
    public static final C3152r9 Companion = new C3152r9();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference f22304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewGroup.LayoutParams f22305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f22306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f22307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f22308e;

    public InMobiMovableRelativeLayout(Context context) {
        super(context);
        this.f22304a = new WeakReference(null);
        this.f22306c = true;
        setBackgroundColor(Color.parseColor("#00000000"));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44963i, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    private final void setParentView(ViewGroup viewGroup) {
        this.f22304a = new WeakReference(viewGroup);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ViewGroup viewGroup;
        p.j(motionEvent, "ev");
        if (this.f22306c) {
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f22307d = rawX;
                this.f22308e = rawY;
            } else if (action == 2 && (viewGroup = (ViewGroup) this.f22304a.get()) != null) {
                float f10 = rawX - this.f22307d;
                float f11 = rawY - this.f22308e;
                int left = (int) (getLeft() + f10);
                int top2 = (int) (getTop() + f11);
                int paddingLeft = viewGroup.getPaddingLeft();
                int paddingTop = viewGroup.getPaddingTop();
                int width = viewGroup.getWidth() - viewGroup.getPaddingRight();
                int height = viewGroup.getHeight() - viewGroup.getPaddingBottom();
                int iMax = Math.max(paddingLeft, Math.min(left, width - getWidth()));
                int iMax2 = Math.max(paddingTop, Math.min(top2, height - getHeight()));
                layout(iMax, iMax2, getWidth() + iMax, getHeight() + iMax2);
                this.f22307d = rawX;
                this.f22308e = rawY;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void resetPosition() {
        setLayoutParams(this.f22305b);
    }

    public final void setIsMovable(boolean z10) {
        this.f22306c = z10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        p.h(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        setParentView((ViewGroup) parent);
        if (this.f22305b == null) {
            this.f22305b = getLayoutParams();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setParentView(null);
    }

    public InMobiMovableRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22304a = new WeakReference(null);
        this.f22306c = true;
        setBackgroundColor(Color.parseColor("#00000000"));
    }

    public InMobiMovableRelativeLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f22304a = new WeakReference(null);
        this.f22306c = true;
        setBackgroundColor(Color.parseColor("#00000000"));
    }
}
