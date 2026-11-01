package com.mbridge.msdk.config.dynamic.baseview.cusview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.config.dynamic.baseview.ComponentRelativeLayout;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class BaitClickView extends ComponentRelativeLayout {
    public static final int ANIMATION_TYPE_DOUBLE_CLICK = 4;
    public static final int ANIMATION_TYPE_FAST_SCALE = 1;
    public static final int ANIMATION_TYPE_ROTATE = 5;
    public static final int ANIMATION_TYPE_SLOW_SCALE = 2;
    public static final int ANIMATION_TYPE_SLOW_SCALE_WITH_PAUSE = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f33678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f33679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TextView f33680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f33681d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f33682e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f33683f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f33684g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f33685h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f33686i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Animation f33687j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Animation f33688k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Animation f33689l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Animation f33690m;

    public class a implements com.mbridge.msdk.foundation.same.image.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f33691a;

        public a(int i10) {
            this.f33691a = i10;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            BaitClickView.this.f33679b.setImageResource(this.f33691a);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            if (!bitmap.isRecycled()) {
                BaitClickView.this.f33679b.setImageBitmap(bitmap);
            }
        }
    }

    public class b implements com.mbridge.msdk.foundation.same.image.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f33693a;

        public b(int i10) {
            this.f33693a = i10;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            BaitClickView.this.f33678a.setImageResource(this.f33693a);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            if (!bitmap.isRecycled()) {
                BaitClickView.this.f33678a.setImageBitmap(bitmap);
            }
        }
    }

    public class c implements Animation.AnimationListener {
        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        public c() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (BaitClickView.this.f33679b != null) {
                BaitClickView.this.f33679b.setVisibility(4);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            if (BaitClickView.this.f33679b != null) {
                BaitClickView.this.f33679b.setVisibility(0);
            }
        }
    }

    public class d implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AnimationSet f33696a;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (BaitClickView.this.f33679b != null) {
                    BaitClickView.this.f33679b.startAnimation(d.this.f33696a);
                }
            }
        }

        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (BaitClickView.this.f33678a != null) {
                    BaitClickView.this.f33678a.startAnimation(BaitClickView.this.f33687j);
                }
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        public d(AnimationSet animationSet) {
            this.f33696a = animationSet;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            BaitClickView.this.postDelayed(new b(), 1000L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            BaitClickView.this.postDelayed(new a(), 550L);
        }
    }

    public class e implements Animation.AnimationListener {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (BaitClickView.this.f33678a != null) {
                    BaitClickView.this.f33678a.startAnimation(BaitClickView.this.f33687j);
                }
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }

        public e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            BaitClickView.this.postDelayed(new a(), 1000L);
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentRelativeLayout, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44969o, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    public void init(int i10) {
        this.f33684g = i10;
        init();
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentRelativeLayout, android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    private void a() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
        this.f33687j = scaleAnimation;
        scaleAnimation.setDuration(200L);
        this.f33687j.setRepeatCount(1);
        this.f33687j.setAnimationListener(new e());
        ImageView imageView = this.f33678a;
        if (imageView != null) {
            imageView.startAnimation(this.f33687j);
        }
    }

    private void b() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.f33687j = scaleAnimation;
        scaleAnimation.setDuration(200L);
        this.f33687j.setRepeatCount(-1);
        this.f33687j.setRepeatMode(2);
        ImageView imageView = this.f33678a;
        if (imageView != null) {
            imageView.startAnimation(this.f33687j);
        }
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.0f, 1.2f, 0.0f, 1.2f, 1, 0.5f, 1, 0.5f);
        this.f33688k = scaleAnimation2;
        scaleAnimation2.setDuration(400L);
        this.f33688k.setRepeatCount(-1);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.3f);
        this.f33689l = alphaAnimation;
        alphaAnimation.setDuration(400L);
        this.f33689l.setRepeatCount(-1);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.f33688k);
        animationSet.addAnimation(this.f33689l);
        ImageView imageView2 = this.f33679b;
        if (imageView2 != null) {
            imageView2.startAnimation(animationSet);
        }
    }

    private void c() {
        RotateAnimation rotateAnimation = new RotateAnimation(-10.0f, 30.0f, 1, 0.5f, 1, 0.5f);
        this.f33690m = rotateAnimation;
        rotateAnimation.setDuration(300L);
        this.f33690m.setRepeatMode(2);
        this.f33690m.setRepeatCount(-1);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.2f, 0.0f, 1.2f, 1, 0.5f, 1, 0.5f);
        this.f33688k = scaleAnimation;
        scaleAnimation.setDuration(600L);
        this.f33688k.setRepeatCount(-1);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        this.f33689l = alphaAnimation;
        alphaAnimation.setDuration(600L);
        this.f33689l.setRepeatCount(-1);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.f33688k);
        animationSet.addAnimation(this.f33689l);
        ImageView imageView = this.f33678a;
        if (imageView != null) {
            imageView.startAnimation(this.f33690m);
        }
        ImageView imageView2 = this.f33679b;
        if (imageView2 != null) {
            imageView2.startAnimation(animationSet);
        }
    }

    private void d() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.f33687j = scaleAnimation;
        scaleAnimation.setDuration(500L);
        this.f33687j.setRepeatCount(-1);
        this.f33687j.setRepeatMode(2);
        ImageView imageView = this.f33678a;
        if (imageView != null) {
            imageView.startAnimation(this.f33687j);
        }
    }

    private void e() {
        ImageView imageView = this.f33679b;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.f33687j = scaleAnimation;
        scaleAnimation.setDuration(500L);
        this.f33687j.setRepeatCount(1);
        this.f33687j.setRepeatMode(2);
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.0f, 1.5f, 0.0f, 1.5f, 1, 0.5f, 1, 0.5f);
        this.f33688k = scaleAnimation2;
        scaleAnimation2.setDuration(1000L);
        this.f33688k.setRepeatCount(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        this.f33689l = alphaAnimation;
        alphaAnimation.setDuration(1000L);
        this.f33689l.setRepeatCount(0);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.f33688k);
        animationSet.addAnimation(this.f33689l);
        this.f33688k.setAnimationListener(new c());
        this.f33687j.setAnimationListener(new d(animationSet));
        ImageView imageView2 = this.f33678a;
        if (imageView2 != null) {
            imageView2.startAnimation(this.f33687j);
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentRelativeLayout, com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void setXmlData(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        try {
            String strValueOf = String.valueOf(map.get("clickable"));
            if (!TextUtils.isEmpty(strValueOf) && strValueOf.equals("true")) {
                setViewClickListener();
            }
            Object obj = map.get("radius");
            if (obj instanceof String) {
                this.f33686i = Integer.parseInt(obj.toString());
            }
            init();
        } catch (Exception e10) {
            q0.b("BaitClickView", e10.getMessage());
        }
    }

    public void startAnimation() {
        int i10 = this.f33684g;
        if (i10 == 2) {
            this.f33679b.setVisibility(4);
            d();
            return;
        }
        if (i10 == 3) {
            e();
            return;
        }
        if (i10 == 4) {
            this.f33679b.setVisibility(4);
            a();
        } else if (i10 != 5) {
            b();
        } else {
            c();
        }
    }

    public BaitClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33681d = "";
        this.f33682e = "";
        this.f33683f = "Click now for details";
        this.f33684g = 1;
        this.f33685h = 1342177280;
        this.f33686i = 0;
    }

    private void getDefaultClickText() {
        String str;
        try {
            if (getContext().getResources().getConfiguration().locale.getLanguage().contains("zh")) {
                str = "点击查看详情";
            } else {
                str = "Click now for details";
            }
            this.f33683f = str;
        } catch (Throwable th2) {
            q0.b("BaitClickView", th2.getMessage());
        }
    }

    public void init(int i10, int i11) {
        this.f33685h = i10;
        this.f33684g = i11;
        init();
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentRelativeLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearAnimation();
        Animation animation = this.f33687j;
        if (animation != null) {
            animation.cancel();
        }
        Animation animation2 = this.f33688k;
        if (animation2 != null) {
            animation2.cancel();
        }
        Animation animation3 = this.f33689l;
        if (animation3 != null) {
            animation3.cancel();
        }
        Animation animation4 = this.f33690m;
        if (animation4 != null) {
            animation4.cancel();
        }
    }

    public void init(int i10, int i11, String str, String str2, String str3) {
        this.f33685h = i10;
        this.f33684g = i11;
        this.f33681d = str;
        this.f33682e = str2;
        this.f33683f = str3;
        init();
    }

    public void init() {
        try {
            if (this.f33686i == 0) {
                setBackgroundColor(this.f33685h);
            } else {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(this.f33685h);
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(v0.a(getContext(), this.f33686i));
                setBackground(gradientDrawable);
            }
            getDefaultClickText();
            RelativeLayout relativeLayout = new RelativeLayout(getContext());
            relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
            int iA = v0.a(getContext(), 55.0f);
            int iA2 = v0.a(getContext(), 33.0f);
            this.f33679b = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iA, iA);
            layoutParams.setMargins(iA2, iA2, 0, 0);
            this.f33679b.setLayoutParams(layoutParams);
            int iA3 = i0.a(getContext(), "mbridge_icon_click_circle", "drawable");
            if (TextUtils.isEmpty(this.f33682e)) {
                this.f33679b.setImageResource(iA3);
            } else {
                com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(this.f33681d, new a(iA3));
            }
            int iA4 = v0.a(getContext(), 108.0f);
            int iA5 = v0.a(getContext(), 35.0f);
            int iA6 = v0.a(getContext(), 43.0f);
            this.f33678a = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iA4, iA4);
            layoutParams2.setMargins(iA5, iA6, 0, 0);
            this.f33678a.setLayoutParams(layoutParams2);
            int iA7 = i0.a(getContext(), "mbridge_icon_click_hand", "drawable");
            if (TextUtils.isEmpty(this.f33681d)) {
                this.f33678a.setImageResource(iA7);
            } else {
                com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(this.f33681d, new b(iA7));
            }
            relativeLayout.addView(this.f33679b);
            relativeLayout.addView(this.f33678a);
            LinearLayout linearLayout = new LinearLayout(getContext());
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.addRule(13);
            linearLayout.setLayoutParams(layoutParams3);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            linearLayout.addView(relativeLayout);
            this.f33680c = new TextView(getContext());
            this.f33680c.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
            this.f33680c.setText(this.f33683f);
            this.f33680c.setTextColor(-1);
            this.f33680c.setGravity(14);
            linearLayout.addView(this.f33680c);
            addView(linearLayout);
        } catch (Throwable th2) {
            q0.b("BaitClickView", th2.getMessage());
        }
    }
}
