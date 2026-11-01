package com.bytedance.sdk.component.adexpress.le;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class th extends LinearLayout {
    private int bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private int f11534cf;
    private TextView fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private TextView f11535le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private ImageView f11536lh;
    private TextView ouw;
    private LinearLayout pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private ouw f11537ra;
    private JSONObject ryl;
    private int tlj;
    private TextView vt;
    private com.bytedance.sdk.component.utils.ex yu;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.le.th$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {
        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (th.this.f11536lh != null) {
                final RotateAnimation rotateAnimation = new RotateAnimation(-14.0f, 14.0f, 1, 0.9f, 1, 0.9f);
                rotateAnimation.setInterpolator(new vt((byte) 0));
                rotateAnimation.setDuration(1000L);
                rotateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.bytedance.sdk.component.adexpress.le.th.1.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationStart(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationEnd(Animation animation) {
                        th.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.le.th.1.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                th.this.f11536lh.startAnimation(rotateAnimation);
                            }
                        }, 250L);
                    }
                });
                th.this.f11536lh.startAnimation(rotateAnimation);
            }
        }
    }

    public interface ouw {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
    }

    public static class vt implements Interpolator {
        private vt() {
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f10) {
            if (f10 <= 0.25f) {
                return (f10 * (-2.0f)) + 0.5f;
            }
            if (f10 <= 0.5f) {
                return (f10 * 4.0f) - 1.0f;
            }
            return f10 <= 0.75f ? (f10 * (-4.0f)) + 3.0f : (f10 * 2.0f) - 1.5f;
        }

        public /* synthetic */ vt(byte b10) {
            this();
        }
    }

    public LinearLayout getShakeLayout() {
        return this.pno;
    }

    public void ouw(View view) {
        addView(view);
        this.pno = (LinearLayout) findViewById(2097610727);
        this.f11536lh = (ImageView) findViewById(2097610725);
        this.ouw = (TextView) findViewById(2097610724);
        this.vt = (TextView) findViewById(2097610726);
        this.fkw = (TextView) findViewById(2097610723);
        this.f11535le = (TextView) findViewById(2097610728);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor("#57000000"));
        this.pno.setBackground(gradientDrawable);
    }

    public void setOnShakeViewListener(ouw ouwVar) {
        this.f11537ra = ouwVar;
    }

    public th(@NonNull Context context, View view, int i10, int i11, int i12, JSONObject jSONObject) {
        super(context);
        this.bly = i10;
        this.tlj = i11;
        this.f11534cf = i12;
        this.ryl = jSONObject;
        ouw(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            if (this.yu == null) {
                getContext().getApplicationContext();
                this.yu = new com.bytedance.sdk.component.utils.ex();
            }
            new Object() { // from class: com.bytedance.sdk.component.adexpress.le.th.2
            };
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setShakeText(String str) {
        if (TextUtils.isEmpty(str)) {
            this.fkw.setVisibility(8);
            this.f11535le.setVisibility(8);
        } else {
            this.fkw.setText(str);
        }
    }
}
