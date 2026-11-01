package com.mbridge.msdk.video.dynview.widget;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.mbridge.msdk.video.dynview.moffer.b;
import com.mbridge.msdk.video.dynview.moffer.d;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes2.dex */
public class MBridgeRelativeLayout extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f38748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f38749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AnimatorSet f38750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f38751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f38752e;

    public MBridgeRelativeLayout(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44969o, this, me2);
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

    public MBridgeRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setAnimatorSet(AnimatorSet animatorSet) {
        this.f38750c = animatorSet;
    }

    public void setMoreOfferCacheReportCallBack(b bVar) {
        this.f38752e = bVar;
    }

    public void setMoreOfferShowFailedCallBack(d dVar) {
        this.f38748a = dVar;
    }

    public MBridgeRelativeLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AnimatorSet animatorSet = this.f38750c;
        if (animatorSet != null) {
            try {
                animatorSet.start();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        d dVar;
        super.onDetachedFromWindow();
        if (!this.f38749b && (dVar = this.f38748a) != null) {
            this.f38749b = true;
            dVar.a();
        }
        AnimatorSet animatorSet = this.f38750c;
        if (animatorSet != null) {
            try {
                animatorSet.cancel();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i10) {
        b bVar;
        super.onVisibilityChanged(view, i10);
        if ((view instanceof MBridgeRelativeLayout) && i10 == 0 && (bVar = this.f38752e) != null && !this.f38751d) {
            this.f38751d = true;
            bVar.a();
        }
    }
}
