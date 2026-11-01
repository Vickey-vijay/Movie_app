package com.mbridge.msdk.config.dynamic.baseview.rewardpopview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.mbridge.msdk.config.dynamic.baseview.ComponentRelativeLayout;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes10.dex */
public class MBAcquireRewardPopView extends ComponentRelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f33769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f33770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f33771d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f33772e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f33773f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f33774g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f33775h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final View.OnClickListener f33776i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Runnable f33777j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Runnable f33778k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private View.OnTouchListener f33779l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final View.OnClickListener f33780m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final View.OnClickListener f33781n;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBAcquireRewardPopView.g(MBAcquireRewardPopView.this);
            throw null;
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
            mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.f33777j);
            if (TextUtils.isEmpty((String) view.getTag())) {
                return;
            }
            MBAcquireRewardPopView.g(MBAcquireRewardPopView.this);
            throw null;
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MBAcquireRewardPopView.this.f33773f <= 0) {
                MBAcquireRewardPopView.g(MBAcquireRewardPopView.this);
                throw null;
            }
            MBAcquireRewardPopView.j(MBAcquireRewardPopView.this);
            MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
            mBAcquireRewardPopView.postDelayed(mBAcquireRewardPopView.f33777j, 1000L);
        }
    }

    public class d implements Runnable {

        public class a implements Animation.AnimationListener {
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            public a() {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                MBAcquireRewardPopView.this.f33774g = false;
                MBAcquireRewardPopView.this.setVisibility(8);
                MBAcquireRewardPopView.this.removeAllViews();
            }
        }

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(300L);
            alphaAnimation.setAnimationListener(new a());
            MBAcquireRewardPopView.this.startAnimation(alphaAnimation);
        }
    }

    public class e implements View.OnTouchListener {
        public e() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action == 2) {
                        MBAcquireRewardPopView.this.f33771d = motionEvent.getX();
                        MBAcquireRewardPopView.this.f33772e = motionEvent.getY();
                    }
                } else {
                    if (MBAcquireRewardPopView.this.f33771d > MBAcquireRewardPopView.this.f33769b) {
                        if (Math.abs(MBAcquireRewardPopView.this.f33771d - MBAcquireRewardPopView.this.f33769b) > 50.0f && Math.abs(MBAcquireRewardPopView.this.f33772e - MBAcquireRewardPopView.this.f33770c) < 100.0f) {
                            if (MBAcquireRewardPopView.this.f33775h) {
                                return false;
                            }
                            MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                            mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.f33777j);
                            MBAcquireRewardPopView.this.f33775h = true;
                            View rightAnswerView = MBAcquireRewardPopView.this.getRightAnswerView();
                            View childAt = MBAcquireRewardPopView.this.getChildAt(0);
                            if (childAt != null) {
                                MBAcquireRewardPopView.this.a(childAt, rightAnswerView);
                            }
                            MBAcquireRewardPopView.g(MBAcquireRewardPopView.this);
                            throw null;
                        }
                        MBAcquireRewardPopView.g(MBAcquireRewardPopView.this);
                        throw null;
                    }
                    MBAcquireRewardPopView.g(MBAcquireRewardPopView.this);
                    throw null;
                }
            } else {
                MBAcquireRewardPopView.this.f33769b = motionEvent.getX();
                MBAcquireRewardPopView.this.f33770c = motionEvent.getY();
            }
            return false;
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBAcquireRewardPopView.g(MBAcquireRewardPopView.this);
            throw null;
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentRelativeLayout, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44969o, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentRelativeLayout, android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void onTimeLessThanReduce(int i10) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View getRightAnswerView() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        new MBGradientAndShadowTextView.a();
        throw null;
    }

    private View getWrongAnswerView() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        new MBGradientAndShadowTextView.a();
        throw null;
    }

    public static /* synthetic */ int j(MBAcquireRewardPopView mBAcquireRewardPopView) {
        int i10 = mBAcquireRewardPopView.f33773f;
        mBAcquireRewardPopView.f33773f = i10 - 1;
        return i10;
    }

    public void init(com.mbridge.msdk.config.dynamic.baseview.rewardpopview.a aVar) {
        q0.b("MBAcquireRewardPopView", "Must generate parameters.");
    }

    public void onPause() {
        if (!this.f33774g || this.f33773f <= 0) {
            return;
        }
        removeCallbacks(this.f33777j);
    }

    public void onResume() {
        if (!this.f33774g || this.f33773f <= 0) {
            return;
        }
        post(this.f33777j);
    }

    public void onStop() {
        if (!this.f33774g || this.f33773f <= 0) {
            return;
        }
        removeCallbacks(this.f33777j);
    }

    public MBAcquireRewardPopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33768a = "MBAcquireRewardPopView";
        this.f33769b = 0.0f;
        this.f33770c = 0.0f;
        this.f33771d = 0.0f;
        this.f33772e = 0.0f;
        this.f33776i = new b();
        this.f33777j = new c();
        this.f33778k = new d();
        this.f33779l = new e();
        this.f33780m = new f();
        this.f33781n = new a();
    }

    public static /* synthetic */ com.mbridge.msdk.config.dynamic.baseview.rewardpopview.a g(MBAcquireRewardPopView mBAcquireRewardPopView) {
        mBAcquireRewardPopView.getClass();
        return null;
    }

    private View getSlidePopView() {
        int iA = v0.a(getContext(), 290.0f);
        LinearLayout linearLayout = new LinearLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iA, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        new MBGradientAndShadowTextView.a();
        throw null;
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentRelativeLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f33777j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view, View view2) {
        removeView(view);
        addView(view2);
    }
}
