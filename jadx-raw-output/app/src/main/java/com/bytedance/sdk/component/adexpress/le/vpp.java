package com.bytedance.sdk.component.adexpress.le;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.cd;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes5.dex */
public class vpp extends RelativeLayout {
    private AnimatorSet bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private int f11544cf;
    private TextView fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private AnimatorSet f11545le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private ImageView f11546lh;
    private ImageView ouw;
    private AnimatorSet pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private AnimatorSet f11547ra;
    private String tlj;
    private ImageView vt;
    private TextView yu;

    public vpp(Context context) {
        super(context);
        this.f11545le = new AnimatorSet();
        this.f11547ra = new AnimatorSet();
        this.pno = new AnimatorSet();
        this.bly = new AnimatorSet();
        this.f11544cf = 100;
        ouw(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
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

    public AnimatorSet getSlideUpAnimatorSet() {
        return this.f11545le;
    }

    public void ouw(Context context) {
        int i10;
        Context contextOuw = context == null ? com.bytedance.sdk.component.adexpress.yu.ouw() : context;
        if (CampaignEx.CLICKMODE_ON.equals(this.tlj)) {
            RelativeLayout relativeLayout = new RelativeLayout(contextOuw);
            relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            relativeLayout.setClipChildren(false);
            relativeLayout.setClipToPadding(false);
            relativeLayout.setGravity(16);
            RelativeLayout relativeLayout2 = new RelativeLayout(contextOuw);
            relativeLayout2.setId(2097610729);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -1);
            layoutParams.addRule(13);
            layoutParams.setMargins(0, 0, 0, 0);
            relativeLayout2.setLayoutParams(layoutParams);
            relativeLayout2.setClipChildren(false);
            relativeLayout2.setClipToPadding(false);
            relativeLayout2.setPadding(cd.ouw(contextOuw, 60.0f), 0, 0, 0);
            relativeLayout.addView(relativeLayout2);
            ImageView imageView = new ImageView(contextOuw);
            imageView.setId(2097610735);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(cd.ouw(contextOuw, 80.0f), cd.ouw(contextOuw, 80.0f));
            layoutParams2.addRule(9);
            layoutParams2.addRule(12);
            layoutParams2.setMargins(0, 0, 0, -cd.ouw(contextOuw, 40.0f));
            imageView.setLayoutParams(layoutParams2);
            imageView.setAlpha(0);
            imageView.setBackground(com.bytedance.sdk.component.utils.vpp.lh(contextOuw, "tt_splash_slide_up_circle"));
            relativeLayout2.addView(imageView);
            View imageView2 = new ImageView(contextOuw);
            imageView2.setId(2097610733);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(cd.ouw(contextOuw, 16.0f), 0);
            layoutParams3.addRule(9);
            layoutParams3.addRule(12);
            layoutParams3.setMargins(cd.ouw(contextOuw, 36.0f), 0, 0, 0);
            imageView2.setLayoutParams(layoutParams3);
            imageView2.setBackground(com.bytedance.sdk.component.utils.vpp.lh(contextOuw, "tt_splash_slide_up_bg"));
            relativeLayout2.addView(imageView2);
            ImageView imageView3 = new ImageView(contextOuw);
            imageView3.setId(2097610734);
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(cd.ouw(contextOuw, 160.0f), cd.ouw(contextOuw, 120.0f));
            layoutParams4.addRule(12);
            layoutParams4.setMargins(cd.ouw(contextOuw, 35.0f), 0, 0, -cd.ouw(contextOuw, 40.0f));
            imageView3.setLayoutParams(layoutParams4);
            imageView3.setAlpha(0);
            imageView3.setBackground(com.bytedance.sdk.component.utils.vpp.lh(contextOuw, "tt_splash_slide_up_finger"));
            relativeLayout2.addView(imageView3);
            TextView textView = new TextView(contextOuw);
            textView.setId(2097610730);
            RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, cd.ouw(contextOuw, 20.0f));
            layoutParams5.addRule(12);
            layoutParams5.setMargins(0, 0, 0, -cd.ouw(contextOuw, 95.0f));
            textView.setLayoutParams(layoutParams5);
            textView.setGravity(1);
            textView.setShadowLayer(4.0f, 3.0f, 3.0f, Color.parseColor("#99000000"));
            textView.setTextColor(-1);
            textView.setTextSize(1, 14.0f);
            relativeLayout.addView(textView);
            addView(relativeLayout);
            this.f11544cf = (int) (((double) this.f11544cf) * 1.25d);
            i10 = 2097610734;
        } else {
            RelativeLayout relativeLayout3 = new RelativeLayout(contextOuw);
            relativeLayout3.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            relativeLayout3.setGravity(16);
            relativeLayout3.setClipChildren(false);
            View imageView4 = new ImageView(contextOuw);
            imageView4.setId(2097610735);
            RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(cd.ouw(contextOuw, 36.0f), cd.ouw(contextOuw, 36.0f));
            layoutParams6.addRule(14);
            layoutParams6.addRule(8, 2097610732);
            layoutParams6.setMargins(0, 0, 0, cd.ouw(contextOuw, -24.0f));
            imageView4.setLayoutParams(layoutParams6);
            imageView4.setBackground(com.bytedance.sdk.component.utils.vpp.lh(contextOuw, "tt_splash_slide_up_circle"));
            imageView4.setAlpha(0.0f);
            View imageView5 = new ImageView(contextOuw);
            imageView5.setId(2097610734);
            RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(cd.ouw(contextOuw, 67.0f), cd.ouw(contextOuw, 51.0f));
            layoutParams7.addRule(14);
            layoutParams7.addRule(1, 2097610732);
            layoutParams7.addRule(8, 2097610732);
            layoutParams7.setMargins(cd.ouw(contextOuw, -7.0f), 0, 0, cd.ouw(contextOuw, -20.0f));
            imageView5.setLayoutParams(layoutParams7);
            imageView5.setBackground(com.bytedance.sdk.component.utils.vpp.lh(contextOuw, "tt_splash_slide_up_finger"));
            imageView5.setAlpha(0.0f);
            View imageView6 = new ImageView(contextOuw);
            imageView6.setId(2097610733);
            RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(cd.ouw(contextOuw, 10.0f), 0);
            layoutParams8.addRule(14);
            layoutParams8.addRule(8, 2097610732);
            imageView6.setLayoutParams(layoutParams8);
            imageView6.setBackground(com.bytedance.sdk.component.utils.vpp.lh(contextOuw, "tt_splash_slide_up_bg"));
            View imageView7 = new ImageView(contextOuw);
            imageView7.setId(2097610732);
            RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(cd.ouw(contextOuw, 14.0f), cd.ouw(contextOuw, 100.0f));
            layoutParams9.addRule(14);
            imageView7.setLayoutParams(layoutParams9);
            imageView7.setBackground(com.bytedance.sdk.component.utils.vpp.lh(contextOuw, "tt_splash_slide_up_arrow"));
            TextView textView2 = new TextView(contextOuw);
            textView2.setId(2097610731);
            RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams10.addRule(3, 2097610732);
            textView2.setLayoutParams(layoutParams10);
            textView2.setTextColor(-1);
            textView2.setText("wipe up");
            textView2.setTextSize(2, 18.0f);
            textView2.setShadowLayer(cd.ouw(contextOuw, 4.0f), cd.ouw(contextOuw, 3.0f), cd.ouw(contextOuw, 3.0f), Color.parseColor("#99000000"));
            textView2.setGravity(1);
            TextView textView3 = new TextView(contextOuw);
            textView3.setId(2097610730);
            RelativeLayout.LayoutParams layoutParams11 = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams11.addRule(3, 2097610731);
            textView3.setLayoutParams(layoutParams11);
            textView3.setTextColor(-1);
            textView3.setTextSize(2, 14.0f);
            textView3.setShadowLayer(cd.ouw(contextOuw, 4.0f), cd.ouw(contextOuw, 3.0f), cd.ouw(contextOuw, 3.0f), Color.parseColor("#99000000"));
            textView3.setGravity(1);
            relativeLayout3.addView(imageView4);
            relativeLayout3.addView(imageView5);
            relativeLayout3.addView(imageView6);
            relativeLayout3.addView(imageView7);
            relativeLayout3.addView(textView2);
            relativeLayout3.addView(textView3);
            addView(relativeLayout3);
            i10 = 2097610734;
        }
        this.ouw = (ImageView) findViewById(i10);
        this.vt = (ImageView) findViewById(2097610735);
        this.yu = (TextView) findViewById(2097610730);
        this.f11546lh = (ImageView) findViewById(2097610733);
        this.fkw = (TextView) findViewById(2097610731);
    }

    public void setGuideText(String str) {
        TextView textView = this.yu;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setSlideText(String str) {
        if (this.fkw != null) {
            if (TextUtils.isEmpty(str)) {
                this.fkw.setText("");
            } else {
                this.fkw.setText(str);
            }
        }
    }

    public void vt() {
        try {
            AnimatorSet animatorSet = this.f11545le;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.pno;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            AnimatorSet animatorSet3 = this.f11547ra;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            AnimatorSet animatorSet4 = this.bly;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
            }
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.ko.yu(e10.getMessage());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        vt();
    }

    public vpp(Context context, String str) {
        super(context);
        this.f11545le = new AnimatorSet();
        this.f11547ra = new AnimatorSet();
        this.pno = new AnimatorSet();
        this.bly = new AnimatorSet();
        this.f11544cf = 100;
        setClipChildren(false);
        this.tlj = str;
        ouw(context);
    }

    public void ouw() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.ouw, "alpha", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.ouw, "alpha", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.ouw, "translationY", 0.0f, com.bytedance.sdk.component.adexpress.yu.ra.ouw(getContext(), -this.f11544cf));
        objectAnimatorOfFloat3.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(getContext(), this.f11544cf));
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.le.vpp.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (vpp.this.f11546lh != null) {
                    Integer num = (Integer) valueAnimator.getAnimatedValue();
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) vpp.this.f11546lh.getLayoutParams();
                    layoutParams.height = num.intValue();
                    vpp.this.f11546lh.setLayoutParams(layoutParams);
                }
            }
        });
        valueAnimatorOfInt.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.f11546lh, "alpha", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.f11546lh, "alpha", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.vt, "alpha", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.vt, "alpha", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(this.vt, "scaleX", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(this.vt, "scaleY", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat10 = ObjectAnimator.ofFloat(this.vt, "translationY", 0.0f, com.bytedance.sdk.component.adexpress.yu.ra.ouw(getContext(), -this.f11544cf));
        objectAnimatorOfFloat10.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        this.f11547ra.setDuration(50L);
        this.bly.setDuration(1500L);
        this.pno.setDuration(50L);
        this.f11547ra.playTogether(objectAnimatorOfFloat2, objectAnimatorOfFloat7, objectAnimatorOfFloat5);
        this.pno.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat6, objectAnimatorOfFloat8, objectAnimatorOfFloat9, objectAnimatorOfFloat4);
        this.bly.playTogether(objectAnimatorOfFloat3, valueAnimatorOfInt, objectAnimatorOfFloat10);
        this.f11545le.playSequentially(this.pno, this.bly, this.f11547ra);
        this.f11545le.start();
        this.f11545le.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.component.adexpress.le.vpp.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                vpp.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.le.vpp.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        vpp.this.f11545le.start();
                    }
                }, 200L);
            }
        });
    }
}
