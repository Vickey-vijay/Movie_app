package com.bytedance.sdk.component.adexpress.le;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.cd;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes9.dex */
public final class cf extends FrameLayout {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final ImageView f11499lh;
    public final RotateAnimation ouw;
    private final TextView vt;
    private final ryl yu;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
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

    public cf(@NonNull Context context) {
        super(context);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        RelativeLayout relativeLayout2 = new RelativeLayout(context);
        relativeLayout2.setId(2097610746);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(cd.ouw(context, 247.0f), cd.ouw(context, 56.0f));
        layoutParams.addRule(14);
        relativeLayout2.setLayoutParams(layoutParams);
        relativeLayout2.setBackground(com.bytedance.sdk.component.utils.vpp.lh(context, "tt_splash_unlock_btn_bg"));
        ImageView imageView = new ImageView(context);
        imageView.setId(2097610745);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(cd.ouw(context, 48.0f), cd.ouw(context, 48.0f));
        layoutParams2.addRule(20);
        layoutParams2.addRule(15);
        layoutParams2.setMargins(cd.ouw(context, 4.0f), 0, 0, 0);
        imageView.setLayoutParams(layoutParams2);
        imageView.setImageDrawable(com.bytedance.sdk.component.utils.vpp.lh(context, "tt_splash_unlock_image_go"));
        View rylVar = new ryl(context);
        rylVar.setId(2097610744);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, cd.ouw(context, 24.0f));
        layoutParams3.addRule(15);
        layoutParams3.setMargins(cd.ouw(context, 12.0f), 0, cd.ouw(context, 12.0f), 0);
        layoutParams3.addRule(16, 2097610743);
        layoutParams3.addRule(17, 2097610745);
        rylVar.setLayoutParams(layoutParams3);
        ImageView imageView2 = new ImageView(context);
        imageView2.setId(2097610743);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(cd.ouw(context, 48.0f), cd.ouw(context, 48.0f));
        layoutParams4.addRule(21);
        layoutParams4.addRule(15);
        layoutParams4.setMarginStart(cd.ouw(context, 2.0f));
        layoutParams4.setMarginEnd(cd.ouw(context, 4.0f));
        imageView2.setLayoutParams(layoutParams4);
        imageView2.setImageDrawable(com.bytedance.sdk.component.utils.vpp.lh(context, "tt_splash_unlock_icon_empty"));
        relativeLayout2.addView(imageView);
        relativeLayout2.addView(rylVar);
        relativeLayout2.addView(imageView2);
        TextView textView = new TextView(context);
        textView.setId(2097610742);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(3, 2097610746);
        layoutParams5.addRule(14);
        layoutParams5.setMargins(0, cd.ouw(context, 12.0f), 0, 0);
        textView.setLayoutParams(layoutParams5);
        textView.setTextColor(-1);
        textView.setShadowLayer(cd.ouw(context, 3.0f), cd.ouw(context, 3.0f), cd.ouw(context, 3.0f), Color.parseColor("#99000000"));
        relativeLayout.addView(relativeLayout2);
        relativeLayout.addView(textView);
        addView(relativeLayout);
        this.vt = (TextView) findViewById(2097610742);
        this.f11499lh = (ImageView) findViewById(2097610745);
        this.yu = (ryl) findViewById(2097610744);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 30.0f, 1, 0.65f, 1, 0.9f);
        this.ouw = rotateAnimation;
        rotateAnimation.setDuration(300L);
        rotateAnimation.setRepeatMode(2);
        rotateAnimation.setRepeatCount(1);
        rotateAnimation.setInterpolator(new LinearInterpolator());
    }

    public final Runnable getHaloAnimation() {
        return new Runnable() { // from class: com.bytedance.sdk.component.adexpress.le.cf.1
            @Override // java.lang.Runnable
            public final void run() {
                cf.this.f11499lh.startAnimation(cf.this.ouw);
                cf.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.le.cf.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        cf.this.yu.ouw();
                    }
                }, 100L);
                cf.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.le.cf.1.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        cf.this.yu.ouw();
                    }
                }, 300L);
                cf cfVar = cf.this;
                cfVar.postDelayed(cfVar.getHaloAnimation(), 1200L);
            }
        };
    }

    public final void setText(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "Slide or click to jump to the details page or third-party application";
        }
        TextView textView = this.vt;
        if (textView != null) {
            textView.setText(str);
        }
    }
}
