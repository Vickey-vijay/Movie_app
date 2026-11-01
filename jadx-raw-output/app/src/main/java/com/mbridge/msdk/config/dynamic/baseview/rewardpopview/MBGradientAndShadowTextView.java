package com.mbridge.msdk.config.dynamic.baseview.rewardpopview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.mbridge.msdk.dycreator.baseview.rewardpopview.AcquireRewardPopViewConst;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes4.dex */
public class MBGradientAndShadowTextView extends TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f33789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f33790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f33791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f33792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private LinearGradient f33793e;
    public float mShadowDx;
    public float mShadowDy;
    public float mShadowRadius;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f33794a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f33795b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f33796c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f33797d = 40;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f33798e = 3.0f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f33799f = 1.5f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f33800g = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context) {
        super(context);
        this.f33789a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f33790b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f33791c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f33792d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
        a();
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44969o, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    private void a() {
        setTextSize(this.f33792d);
        setTypeface(Typeface.defaultFromStyle(3));
        this.f33793e = new LinearGradient(0.0f, 0.0f, 0.0f, getTextSize(), this.f33789a, this.f33790b, Shader.TileMode.CLAMP);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        getPaint().setShader(null);
        getPaint().setShadowLayer(3.0f, 1.5f, 1.8f, this.f33791c);
        super.onDraw(canvas);
        getPaint().clearShadowLayer();
        getPaint().setShader(this.f33793e);
        super.onDraw(canvas);
    }

    public MBGradientAndShadowTextView(Context context, a aVar) {
        super(context);
        this.f33789a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f33790b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f33791c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f33792d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
        if (aVar != null) {
            this.f33789a = aVar.f33794a;
            this.f33790b = aVar.f33795b;
            this.f33791c = aVar.f33796c;
            this.f33792d = aVar.f33797d;
            this.mShadowRadius = aVar.f33798e;
            this.mShadowDx = aVar.f33799f;
            this.mShadowDy = aVar.f33800g;
        }
        a();
    }

    public MBGradientAndShadowTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33789a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f33790b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f33791c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f33792d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f33789a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f33790b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f33791c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f33792d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    @RequiresApi(api = 21)
    public MBGradientAndShadowTextView(Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f33789a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f33790b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f33791c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f33792d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }
}
