package com.applovin.impl.adview;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: loaded from: classes6.dex */
public class g extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f6966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f6967b;

    public void a(e.a aVar) {
        if (aVar == null || aVar == this.f6966a.getStyle()) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.f6966a.getLayoutParams();
        removeView(this.f6966a);
        e eVarA = e.a(aVar, getContext());
        this.f6966a = eVarA;
        addView(eVarA);
        this.f6966a.setLayoutParams(layoutParams);
        this.f6966a.a(this.f6967b);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f44955a, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public g(e.a aVar, Activity activity) {
        super(activity);
        setBackgroundColor(0);
        e eVarA = e.a(aVar, activity);
        this.f6966a = eVarA;
        addView(eVarA);
    }

    public void a(int i10, int i11, int i12, int i13) {
        this.f6967b = i10;
        int i14 = i11 + i10 + i12;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i14;
            layoutParams.width = i14;
        } else {
            setLayoutParams(new FrameLayout.LayoutParams(i14, i14));
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i10, i10, i13);
        layoutParams2.setMargins(i12, i12, i12, 0);
        this.f6966a.setLayoutParams(layoutParams2);
        this.f6966a.a(i10);
    }
}
