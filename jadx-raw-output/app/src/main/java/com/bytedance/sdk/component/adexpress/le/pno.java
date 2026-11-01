package com.bytedance.sdk.component.adexpress.le;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.cd;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes3.dex */
public final class pno extends vpp {
    private int fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private AnimatorSet f11522le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private ImageView f11523lh;
    private TextView ouw;
    private ImageView vt;
    private ImageView yu;

    @Override // com.bytedance.sdk.component.adexpress.le.vpp, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.bytedance.sdk.component.adexpress.le.vpp, android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.le.vpp
    public final void ouw() {
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, "alphaColor", 0, 60);
        objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
        objectAnimatorOfInt.setDuration(2000L);
        objectAnimatorOfInt.setRepeatCount(-1);
        objectAnimatorOfInt.start();
    }

    @Override // com.bytedance.sdk.component.adexpress.le.vpp
    public final void ouw(Context context) {
    }

    public pno(Context context) {
        super(context);
        this.f11522le = new AnimatorSet();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setGravity(81);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, cd.ouw(context, 100.0f)));
        linearLayout2.setGravity(17);
        linearLayout2.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(context);
        imageView.setId(2097610751);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(cd.ouw(context, 19.0f), cd.ouw(context, 15.0f));
        layoutParams.gravity = 1;
        imageView.setLayoutParams(layoutParams);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageDrawable(com.bytedance.sdk.component.utils.vpp.lh(context, "tt_white_slide_up"));
        ImageView imageView2 = new ImageView(context);
        imageView2.setId(2097610750);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(cd.ouw(context, 19.0f), cd.ouw(context, 15.0f));
        layoutParams2.gravity = 1;
        layoutParams2.topMargin = cd.ouw(context, 7.0f);
        imageView2.setLayoutParams(layoutParams2);
        imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView2.setImageDrawable(com.bytedance.sdk.component.utils.vpp.lh(context, "tt_white_slide_up"));
        ImageView imageView3 = new ImageView(context);
        imageView3.setId(2097610749);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(cd.ouw(context, 19.0f), cd.ouw(context, 15.0f));
        layoutParams3.gravity = 1;
        layoutParams3.topMargin = cd.ouw(context, 14.0f);
        imageView3.setLayoutParams(layoutParams3);
        imageView3.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView3.setImageDrawable(com.bytedance.sdk.component.utils.vpp.lh(context, "tt_white_slide_up"));
        frameLayout.addView(imageView);
        frameLayout.addView(imageView2);
        frameLayout.addView(imageView3);
        linearLayout2.addView(frameLayout);
        View view = new View(context);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
        linearLayout2.addView(view);
        TextView textView = new TextView(context);
        textView.setId(2097610748);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.setMargins(0, 0, 0, cd.ouw(context, 5.0f));
        textView.setLayoutParams(layoutParams4);
        textView.setGravity(1);
        textView.setTextColor(-1);
        textView.setTextSize(1, 14.0f);
        linearLayout2.addView(textView);
        linearLayout.addView(linearLayout2);
        addView(linearLayout);
        this.vt = (ImageView) findViewById(2097610751);
        this.f11523lh = (ImageView) findViewById(2097610750);
        this.yu = (ImageView) findViewById(2097610749);
        this.ouw = (TextView) findViewById(2097610748);
    }

    public final float getAlphaColor() {
        return this.fkw;
    }

    public final void setAlphaColor(int i10) {
        if (i10 < 0 || i10 > 60) {
            return;
        }
        int i11 = i10 + 195;
        this.yu.setColorFilter(Color.rgb(i11, i11, i11), PorterDuff.Mode.SRC_IN);
        int i12 = ((i10 + 20) % 60) + 195;
        this.f11523lh.setColorFilter(Color.rgb(i12, i12, i12), PorterDuff.Mode.SRC_IN);
        int i13 = ((i10 + 40) % 60) + 195;
        this.vt.setColorFilter(Color.rgb(i13, i13, i13), PorterDuff.Mode.SRC_IN);
    }

    public final void setButtonText(String str) {
        if (this.ouw == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.ouw.setText(str);
    }

    @Override // com.bytedance.sdk.component.adexpress.le.vpp
    public final void vt() {
        this.f11522le.cancel();
    }
}
