package com.bytedance.sdk.openadsdk.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes10.dex */
@SuppressLint({"ViewConstructor"})
public final class rn extends View {
    private final ouw ouw;
    private View vt;

    public interface ouw {
        View ouw(Context context);
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void setVisibility(int i10) {
        ouw ouwVar;
        View view = this.vt;
        if (view != null) {
            view.setVisibility(i10);
            return;
        }
        super.setVisibility(i10);
        if ((i10 == 0 || i10 == 4) && this.vt == null && (ouwVar = this.ouw) != null) {
            this.vt = ouwVar.ouw(getContext());
            ViewParent parent = getParent();
            View view2 = this.vt;
            ViewGroup viewGroup = (ViewGroup) parent;
            int iIndexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(view2, iIndexOfChild, layoutParams);
            } else {
                viewGroup.addView(view2, iIndexOfChild);
            }
        }
    }

    public rn(Context context, ouw ouwVar) {
        super(context);
        this.ouw = ouwVar;
        setVisibility(8);
        setWillNotDraw(true);
    }
}
