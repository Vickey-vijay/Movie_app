package com.mbridge.msdk.dycreator.baseview.rewardpopview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.view.GravityCompat;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes7.dex */
public class MBAcquireRewardPopView extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f34233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AcquireRewardPopViewParameters f34234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AnimationSet f34235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f34236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f34237e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f34238f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f34239g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f34240h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f34241i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f34242j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private TextView f34243k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final View.OnClickListener f34244l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Runnable f34245m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Runnable f34246n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private View.OnTouchListener f34247o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final View.OnClickListener f34248p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final View.OnClickListener f34249q;

    public MBAcquireRewardPopView(Context context) {
        super(context);
        this.f34233a = "MBAcquireRewardPopView";
        this.f34236d = 0.0f;
        this.f34237e = 0.0f;
        this.f34238f = 0.0f;
        this.f34239g = 0.0f;
        this.f34244l = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.f34245m);
                String str = (String) view.getTag();
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                boolean zContains = MBAcquireRewardPopView.this.f34234b.rightAnswerList.contains(str);
                View rightAnswerView = zContains ? MBAcquireRewardPopView.this.getRightAnswerView() : MBAcquireRewardPopView.this.getWrongAnswerView();
                View childAt = MBAcquireRewardPopView.this.getChildAt(0);
                if (childAt != null) {
                    MBAcquireRewardPopView.this.a(childAt, rightAnswerView);
                }
                if (MBAcquireRewardPopView.this.f34234b.behaviourListener != null) {
                    if (zContains) {
                        MBAcquireRewardPopView.this.f34234b.behaviourListener.onReceivedSuccess(MBAcquireRewardPopView.this.f34234b.reduceTime);
                    } else {
                        MBAcquireRewardPopView.this.f34234b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_CLICK_WRONG_ANSWER);
                    }
                }
                MBAcquireRewardPopView mBAcquireRewardPopView2 = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView2.postDelayed(mBAcquireRewardPopView2.f34246n, 2000L);
            }
        };
        this.f34245m = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.6
            @Override // java.lang.Runnable
            public void run() {
                if (MBAcquireRewardPopView.this.f34240h > 0) {
                    MBAcquireRewardPopView.n(MBAcquireRewardPopView.this);
                    MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                    mBAcquireRewardPopView.postDelayed(mBAcquireRewardPopView.f34245m, 1000L);
                } else {
                    if (MBAcquireRewardPopView.this.f34234b.behaviourListener != null) {
                        MBAcquireRewardPopView.this.f34234b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_AUTO_DISMISS);
                    }
                    MBAcquireRewardPopView.this.f34241i = false;
                    MBAcquireRewardPopView.this.setVisibility(8);
                    MBAcquireRewardPopView.this.removeAllViews();
                }
            }
        };
        this.f34246n = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.7
            @Override // java.lang.Runnable
            public void run() {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(300L);
                alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.7.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        MBAcquireRewardPopView.this.f34241i = false;
                        MBAcquireRewardPopView.this.setVisibility(8);
                        MBAcquireRewardPopView.this.removeAllViews();
                    }
                });
                MBAcquireRewardPopView.this.startAnimation(alphaAnimation);
            }
        };
        this.f34247o = new View.OnTouchListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.8
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1) {
                        if (action == 2) {
                            MBAcquireRewardPopView.this.f34238f = motionEvent.getX();
                            MBAcquireRewardPopView.this.f34239g = motionEvent.getY();
                        }
                    } else if (MBAcquireRewardPopView.this.f34238f > MBAcquireRewardPopView.this.f34236d && Math.abs(MBAcquireRewardPopView.this.f34238f - MBAcquireRewardPopView.this.f34236d) > 50.0f && Math.abs(MBAcquireRewardPopView.this.f34239g - MBAcquireRewardPopView.this.f34237e) < 100.0f) {
                        if (MBAcquireRewardPopView.this.f34242j) {
                            return false;
                        }
                        MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                        mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.f34245m);
                        MBAcquireRewardPopView.this.f34242j = true;
                        View rightAnswerView = MBAcquireRewardPopView.this.getRightAnswerView();
                        View childAt = MBAcquireRewardPopView.this.getChildAt(0);
                        if (childAt != null) {
                            MBAcquireRewardPopView.this.a(childAt, rightAnswerView);
                        }
                        if (MBAcquireRewardPopView.this.f34234b.behaviourListener != null) {
                            MBAcquireRewardPopView.this.f34234b.behaviourListener.onReceivedSuccess(MBAcquireRewardPopView.this.f34234b.reduceTime);
                        }
                        MBAcquireRewardPopView mBAcquireRewardPopView2 = MBAcquireRewardPopView.this;
                        mBAcquireRewardPopView2.postDelayed(mBAcquireRewardPopView2.f34246n, 2000L);
                    } else {
                        MBAcquireRewardPopView.this.f34234b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.f34236d, MBAcquireRewardPopView.this.f34237e);
                    }
                } else {
                    MBAcquireRewardPopView.this.f34236d = motionEvent.getX();
                    MBAcquireRewardPopView.this.f34237e = motionEvent.getY();
                }
                return false;
            }
        };
        this.f34248p = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MBAcquireRewardPopView.this.f34234b.behaviourListener != null) {
                    MBAcquireRewardPopView.this.f34234b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.f34236d, MBAcquireRewardPopView.this.f34237e);
                }
            }
        };
        this.f34249q = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MBAcquireRewardPopView.this.f34234b.behaviourListener != null) {
                    MBAcquireRewardPopView.this.f34234b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_CLICK_CLOSE);
                }
                MBAcquireRewardPopView.this.f34241i = false;
                MBAcquireRewardPopView.this.setVisibility(8);
                MBAcquireRewardPopView.this.removeAllViews();
            }
        };
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

    /* JADX INFO: Access modifiers changed from: private */
    public View getRightAnswerView() {
        String str;
        LinearLayout linearLayout = new LinearLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        MBGradientAndShadowTextView.GradientAndShadowParameters gradientAndShadowParameters = new MBGradientAndShadowTextView.GradientAndShadowParameters();
        AcquireRewardPopViewParameters acquireRewardPopViewParameters = this.f34234b;
        gradientAndShadowParameters.gradientStartColor = acquireRewardPopViewParameters.successTitleGradientStartColor;
        gradientAndShadowParameters.gradientEndColor = acquireRewardPopViewParameters.successTitleGradientEndColor;
        gradientAndShadowParameters.shadowColor = acquireRewardPopViewParameters.successTitleShadowColor;
        MBGradientAndShadowTextView mBGradientAndShadowTextView = new MBGradientAndShadowTextView(getContext(), gradientAndShadowParameters);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(0, 0, 0, v0.a(getContext(), 12.0f));
        layoutParams2.gravity = 1;
        mBGradientAndShadowTextView.setLayoutParams(layoutParams2);
        AcquireRewardPopViewParameters acquireRewardPopViewParameters2 = this.f34234b;
        int i10 = acquireRewardPopViewParameters2.viewType;
        if (i10 == 1) {
            str = acquireRewardPopViewParameters2.successTitle;
        } else {
            str = i10 == 2 ? acquireRewardPopViewParameters2.slideSuccessTitle : "";
        }
        mBGradientAndShadowTextView.setGravity(17);
        mBGradientAndShadowTextView.setText(String.format(" %s ", str));
        linearLayout.addView(mBGradientAndShadowTextView);
        GradientDrawable gradientDrawableA = a(new int[]{AcquireRewardPopViewConst.DEFAULT_COLOR_00FDB258, AcquireRewardPopViewConst.DEFAULT_COLOR_FFE39E4A, AcquireRewardPopViewConst.DEFAULT_COLOR_FFE39E4A, AcquireRewardPopViewConst.DEFAULT_COLOR_00F3A850}, GradientDrawable.Orientation.LEFT_RIGHT);
        TextView textView = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        textView.setLayoutParams(layoutParams3);
        textView.setTextSize(12.0f);
        textView.setGravity(17);
        textView.setTextColor(this.f34234b.successTipTextColor);
        AcquireRewardPopViewParameters acquireRewardPopViewParameters3 = this.f34234b;
        textView.setText(String.format(acquireRewardPopViewParameters3.successTip, Integer.valueOf(acquireRewardPopViewParameters3.reduceTime)));
        int iA = v0.a(getContext(), 6.0f);
        int iA2 = v0.a(getContext(), 32.0f);
        textView.setPadding(iA2, iA, iA2, iA);
        textView.setBackground(gradientDrawableA);
        linearLayout.addView(textView);
        return linearLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View getWrongAnswerView() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        MBGradientAndShadowTextView.GradientAndShadowParameters gradientAndShadowParameters = new MBGradientAndShadowTextView.GradientAndShadowParameters();
        AcquireRewardPopViewParameters acquireRewardPopViewParameters = this.f34234b;
        gradientAndShadowParameters.gradientStartColor = acquireRewardPopViewParameters.failTitleGradientStartColor;
        gradientAndShadowParameters.gradientEndColor = acquireRewardPopViewParameters.failTitleGradientEndColor;
        gradientAndShadowParameters.shadowColor = acquireRewardPopViewParameters.failTitleShadowColor;
        MBGradientAndShadowTextView mBGradientAndShadowTextView = new MBGradientAndShadowTextView(getContext(), gradientAndShadowParameters);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(0, 0, 0, v0.a(getContext(), 12.0f));
        layoutParams2.gravity = 1;
        mBGradientAndShadowTextView.setGravity(17);
        mBGradientAndShadowTextView.setLayoutParams(layoutParams2);
        mBGradientAndShadowTextView.setText(String.format(" %s ", this.f34234b.failTitle));
        linearLayout.addView(mBGradientAndShadowTextView);
        GradientDrawable gradientDrawableA = a(new int[]{AcquireRewardPopViewConst.DEFAULT_COLOR_00B09A80, AcquireRewardPopViewConst.DEFAULT_COLOR_FFB09A80, AcquireRewardPopViewConst.DEFAULT_COLOR_FFB09A80, AcquireRewardPopViewConst.DEFAULT_COLOR_00B09A80}, GradientDrawable.Orientation.LEFT_RIGHT);
        TextView textView = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        textView.setLayoutParams(layoutParams3);
        textView.setTextSize(12.0f);
        textView.setGravity(17);
        textView.setTextColor(this.f34234b.failTipTextColor);
        textView.setText(String.format(this.f34234b.failTip, ""));
        int iA = v0.a(getContext(), 6.0f);
        int iA2 = v0.a(getContext(), 32.0f);
        textView.setPadding(iA2, iA, iA2, iA);
        textView.setBackground(gradientDrawableA);
        linearLayout.addView(textView);
        return linearLayout;
    }

    public static /* synthetic */ int n(MBAcquireRewardPopView mBAcquireRewardPopView) {
        int i10 = mBAcquireRewardPopView.f34240h;
        mBAcquireRewardPopView.f34240h = i10 - 1;
        return i10;
    }

    public void init(AcquireRewardPopViewParameters acquireRewardPopViewParameters) {
        if (acquireRewardPopViewParameters == null) {
            q0.b("MBAcquireRewardPopView", "Must generate parameters.");
            return;
        }
        this.f34234b = acquireRewardPopViewParameters;
        View slidePopView = null;
        if (acquireRewardPopViewParameters.viewType == 1) {
            slidePopView = a(a());
            if (this.f34234b.canClickMaskArea) {
                setOnClickListener(this.f34248p);
            }
        }
        if (this.f34234b.viewType == 2) {
            slidePopView = getSlidePopView();
        }
        if (slidePopView != null) {
            setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            setBackgroundColor(this.f34234b.containerBackgroundColor);
            addView(slidePopView);
            int i10 = this.f34234b.autoDismissTime;
            if (i10 > 0) {
                this.f34240h = i10;
                post(this.f34245m);
                this.f34241i = true;
            }
        }
    }

    public void onPause() {
        if (!this.f34241i || this.f34240h <= 0) {
            return;
        }
        removeCallbacks(this.f34245m);
    }

    public void onResume() {
        if (!this.f34241i || this.f34240h <= 0) {
            return;
        }
        post(this.f34245m);
    }

    public void onStop() {
        if (!this.f34241i || this.f34240h <= 0) {
            return;
        }
        removeCallbacks(this.f34245m);
    }

    public void onTimeLessThanReduce(int i10) {
        AcquireRewardPopViewParameters acquireRewardPopViewParameters = this.f34234b;
        acquireRewardPopViewParameters.reduceTime = i10;
        TextView textView = this.f34243k;
        if (textView != null) {
            textView.setText(String.format(acquireRewardPopViewParameters.tips, Integer.valueOf(i10)));
        }
    }

    private View getSlidePopView() {
        int iA = v0.a(getContext(), 290.0f);
        LinearLayout linearLayout = new LinearLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iA, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        MBGradientAndShadowTextView.GradientAndShadowParameters gradientAndShadowParameters = new MBGradientAndShadowTextView.GradientAndShadowParameters();
        AcquireRewardPopViewParameters acquireRewardPopViewParameters = this.f34234b;
        gradientAndShadowParameters.gradientStartColor = acquireRewardPopViewParameters.successTitleGradientStartColor;
        gradientAndShadowParameters.gradientEndColor = acquireRewardPopViewParameters.successTitleGradientEndColor;
        gradientAndShadowParameters.shadowColor = acquireRewardPopViewParameters.successTitleShadowColor;
        gradientAndShadowParameters.textSize = 30;
        MBGradientAndShadowTextView mBGradientAndShadowTextView = new MBGradientAndShadowTextView(getContext(), gradientAndShadowParameters);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(0, 0, 0, v0.a(getContext(), 12.0f));
        layoutParams2.gravity = 1;
        mBGradientAndShadowTextView.setLayoutParams(layoutParams2);
        mBGradientAndShadowTextView.setText(String.format(" %s ", this.f34234b.slideTitle));
        mBGradientAndShadowTextView.setGravity(17);
        linearLayout.addView(mBGradientAndShadowTextView);
        GradientDrawable gradientDrawableA = a(new int[]{AcquireRewardPopViewConst.DEFAULT_COLOR_00FDB258, AcquireRewardPopViewConst.DEFAULT_COLOR_FFE39E4A, AcquireRewardPopViewConst.DEFAULT_COLOR_FFE39E4A, AcquireRewardPopViewConst.DEFAULT_COLOR_00F3A850}, GradientDrawable.Orientation.LEFT_RIGHT);
        this.f34243k = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        layoutParams3.setMargins(0, 0, 0, v0.a(getContext(), 25.0f));
        this.f34243k.setLayoutParams(layoutParams3);
        this.f34243k.setTextSize(12.0f);
        this.f34243k.setGravity(17);
        this.f34243k.setTextColor(this.f34234b.successTipTextColor);
        TextView textView = this.f34243k;
        AcquireRewardPopViewParameters acquireRewardPopViewParameters2 = this.f34234b;
        textView.setText(String.format(acquireRewardPopViewParameters2.slideTip, Integer.valueOf(acquireRewardPopViewParameters2.reduceTime)));
        int iA2 = v0.a(getContext(), 6.0f);
        int iA3 = v0.a(getContext(), 32.0f);
        this.f34243k.setPadding(iA3, iA2, iA3, iA2);
        this.f34243k.setBackground(gradientDrawableA);
        linearLayout.addView(this.f34243k);
        View imageView = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 1;
        imageView.setLayoutParams(layoutParams4);
        imageView.setBackgroundResource(getResources().getIdentifier("mbridge_slide_rightarrow", "drawable", c.n().i()));
        linearLayout.addView(imageView);
        View imageView2 = new ImageView(getContext());
        imageView2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        imageView2.setBackgroundResource(getResources().getIdentifier("mbridge_slide_hand", "drawable", c.n().i()));
        linearLayout.addView(imageView2);
        imageView2.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                MBAcquireRewardPopView.this.a(view);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                if (MBAcquireRewardPopView.this.f34235c != null) {
                    MBAcquireRewardPopView.this.f34235c.cancel();
                }
            }
        });
        linearLayout.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.2
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                MBAcquireRewardPopView.this.setLongClickable(true);
                MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView.setOnTouchListener(mBAcquireRewardPopView.f34247o);
            }
        });
        return linearLayout;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f34245m);
    }

    private View a(ArrayList<String> arrayList) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v0.a(getContext(), 290.0f), -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        linearLayout.setClickable(true);
        AcquireRewardPopViewParameters acquireRewardPopViewParameters = this.f34234b;
        linearLayout.setBackground(a(acquireRewardPopViewParameters.viewBackLayerTopColor, acquireRewardPopViewParameters.viewBackLayerBottomColor, acquireRewardPopViewParameters.viewForegroundTopColor, acquireRewardPopViewParameters.viewForegroundBottomColor));
        ImageView imageView = new ImageView(getContext());
        int iA = v0.a(getContext(), 20.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iA, iA);
        layoutParams2.gravity = GravityCompat.END;
        layoutParams2.setMargins(0, 13, 13, 0);
        imageView.setLayoutParams(layoutParams2);
        imageView.setImageResource(getResources().getIdentifier("mbridge_reward_popview_close", "drawable", c.n().i()));
        imageView.setOnClickListener(this.f34249q);
        linearLayout.addView(imageView);
        TextView textView = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        int iA2 = v0.a(getContext(), 18.0f);
        layoutParams3.setMargins(iA2, 5, iA2, v0.a(getContext(), 12.0f));
        textView.setLayoutParams(layoutParams3);
        textView.setText(this.f34234b.title);
        textView.setTextColor(this.f34234b.titleTextColor);
        textView.setTextSize(18.0f);
        textView.setGravity(17);
        linearLayout.addView(textView);
        if (arrayList != null && arrayList.size() > 1) {
            int iA3 = v0.a(getContext(), 8.0f);
            int iA4 = v0.a(getContext(), 24.0f);
            int iA5 = v0.a(getContext(), 30.0f);
            int iA6 = v0.a(getContext(), 12.0f);
            int iA7 = v0.a(getContext(), 40.0f);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                boolean zContains = this.f34234b.rightAnswerList.contains(arrayList.get(i10));
                TextView textView2 = new TextView(getContext());
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams4.gravity = 1;
                layoutParams4.setMargins(iA5, iA6, iA5, 0);
                textView2.setPadding(iA4, iA3, iA4, iA3);
                textView2.setLayoutParams(layoutParams4);
                textView2.setText(arrayList.get(i10));
                textView2.setSingleLine(true);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                textView2.setTag(arrayList.get(i10));
                textView2.setTextSize(17.0f);
                textView2.setGravity(17);
                textView2.setTextColor(zContains ? this.f34234b.buttonTextLightColor : this.f34234b.buttonTextDarkColor);
                textView2.setBackground(a(zContains ? this.f34234b.buttonBackgroundLightColor : this.f34234b.buttonBackgroundDarkColor, iA7));
                textView2.setOnClickListener(this.f34244l);
                linearLayout.addView(textView2);
            }
        }
        this.f34243k = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        int iA8 = v0.a(getContext(), 16.0f);
        int iA9 = v0.a(getContext(), 18.0f);
        layoutParams5.setMargins(iA9, iA8, iA9, iA8);
        layoutParams5.gravity = 1;
        this.f34243k.setLayoutParams(layoutParams5);
        TextView textView3 = this.f34243k;
        AcquireRewardPopViewParameters acquireRewardPopViewParameters2 = this.f34234b;
        textView3.setText(String.format(acquireRewardPopViewParameters2.tips, Integer.valueOf(acquireRewardPopViewParameters2.reduceTime)));
        this.f34243k.setTextColor(this.f34234b.tipTextColor);
        this.f34243k.setGravity(17);
        this.f34243k.setTextSize(12.0f);
        linearLayout.addView(this.f34243k);
        return linearLayout;
    }

    public MBAcquireRewardPopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34233a = "MBAcquireRewardPopView";
        this.f34236d = 0.0f;
        this.f34237e = 0.0f;
        this.f34238f = 0.0f;
        this.f34239g = 0.0f;
        this.f34244l = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.f34245m);
                String str = (String) view.getTag();
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                boolean zContains = MBAcquireRewardPopView.this.f34234b.rightAnswerList.contains(str);
                View rightAnswerView = zContains ? MBAcquireRewardPopView.this.getRightAnswerView() : MBAcquireRewardPopView.this.getWrongAnswerView();
                View childAt = MBAcquireRewardPopView.this.getChildAt(0);
                if (childAt != null) {
                    MBAcquireRewardPopView.this.a(childAt, rightAnswerView);
                }
                if (MBAcquireRewardPopView.this.f34234b.behaviourListener != null) {
                    if (zContains) {
                        MBAcquireRewardPopView.this.f34234b.behaviourListener.onReceivedSuccess(MBAcquireRewardPopView.this.f34234b.reduceTime);
                    } else {
                        MBAcquireRewardPopView.this.f34234b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_CLICK_WRONG_ANSWER);
                    }
                }
                MBAcquireRewardPopView mBAcquireRewardPopView2 = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView2.postDelayed(mBAcquireRewardPopView2.f34246n, 2000L);
            }
        };
        this.f34245m = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.6
            @Override // java.lang.Runnable
            public void run() {
                if (MBAcquireRewardPopView.this.f34240h > 0) {
                    MBAcquireRewardPopView.n(MBAcquireRewardPopView.this);
                    MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                    mBAcquireRewardPopView.postDelayed(mBAcquireRewardPopView.f34245m, 1000L);
                } else {
                    if (MBAcquireRewardPopView.this.f34234b.behaviourListener != null) {
                        MBAcquireRewardPopView.this.f34234b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_AUTO_DISMISS);
                    }
                    MBAcquireRewardPopView.this.f34241i = false;
                    MBAcquireRewardPopView.this.setVisibility(8);
                    MBAcquireRewardPopView.this.removeAllViews();
                }
            }
        };
        this.f34246n = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.7
            @Override // java.lang.Runnable
            public void run() {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(300L);
                alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.7.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        MBAcquireRewardPopView.this.f34241i = false;
                        MBAcquireRewardPopView.this.setVisibility(8);
                        MBAcquireRewardPopView.this.removeAllViews();
                    }
                });
                MBAcquireRewardPopView.this.startAnimation(alphaAnimation);
            }
        };
        this.f34247o = new View.OnTouchListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.8
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1) {
                        if (action == 2) {
                            MBAcquireRewardPopView.this.f34238f = motionEvent.getX();
                            MBAcquireRewardPopView.this.f34239g = motionEvent.getY();
                        }
                    } else if (MBAcquireRewardPopView.this.f34238f > MBAcquireRewardPopView.this.f34236d && Math.abs(MBAcquireRewardPopView.this.f34238f - MBAcquireRewardPopView.this.f34236d) > 50.0f && Math.abs(MBAcquireRewardPopView.this.f34239g - MBAcquireRewardPopView.this.f34237e) < 100.0f) {
                        if (MBAcquireRewardPopView.this.f34242j) {
                            return false;
                        }
                        MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                        mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.f34245m);
                        MBAcquireRewardPopView.this.f34242j = true;
                        View rightAnswerView = MBAcquireRewardPopView.this.getRightAnswerView();
                        View childAt = MBAcquireRewardPopView.this.getChildAt(0);
                        if (childAt != null) {
                            MBAcquireRewardPopView.this.a(childAt, rightAnswerView);
                        }
                        if (MBAcquireRewardPopView.this.f34234b.behaviourListener != null) {
                            MBAcquireRewardPopView.this.f34234b.behaviourListener.onReceivedSuccess(MBAcquireRewardPopView.this.f34234b.reduceTime);
                        }
                        MBAcquireRewardPopView mBAcquireRewardPopView2 = MBAcquireRewardPopView.this;
                        mBAcquireRewardPopView2.postDelayed(mBAcquireRewardPopView2.f34246n, 2000L);
                    } else {
                        MBAcquireRewardPopView.this.f34234b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.f34236d, MBAcquireRewardPopView.this.f34237e);
                    }
                } else {
                    MBAcquireRewardPopView.this.f34236d = motionEvent.getX();
                    MBAcquireRewardPopView.this.f34237e = motionEvent.getY();
                }
                return false;
            }
        };
        this.f34248p = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MBAcquireRewardPopView.this.f34234b.behaviourListener != null) {
                    MBAcquireRewardPopView.this.f34234b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.f34236d, MBAcquireRewardPopView.this.f34237e);
                }
            }
        };
        this.f34249q = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MBAcquireRewardPopView.this.f34234b.behaviourListener != null) {
                    MBAcquireRewardPopView.this.f34234b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_CLICK_CLOSE);
                }
                MBAcquireRewardPopView.this.f34241i = false;
                MBAcquireRewardPopView.this.setVisibility(8);
                MBAcquireRewardPopView.this.removeAllViews();
            }
        };
    }

    public MBAcquireRewardPopView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f34233a = "MBAcquireRewardPopView";
        this.f34236d = 0.0f;
        this.f34237e = 0.0f;
        this.f34238f = 0.0f;
        this.f34239g = 0.0f;
        this.f34244l = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.f34245m);
                String str = (String) view.getTag();
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                boolean zContains = MBAcquireRewardPopView.this.f34234b.rightAnswerList.contains(str);
                View rightAnswerView = zContains ? MBAcquireRewardPopView.this.getRightAnswerView() : MBAcquireRewardPopView.this.getWrongAnswerView();
                View childAt = MBAcquireRewardPopView.this.getChildAt(0);
                if (childAt != null) {
                    MBAcquireRewardPopView.this.a(childAt, rightAnswerView);
                }
                if (MBAcquireRewardPopView.this.f34234b.behaviourListener != null) {
                    if (zContains) {
                        MBAcquireRewardPopView.this.f34234b.behaviourListener.onReceivedSuccess(MBAcquireRewardPopView.this.f34234b.reduceTime);
                    } else {
                        MBAcquireRewardPopView.this.f34234b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_CLICK_WRONG_ANSWER);
                    }
                }
                MBAcquireRewardPopView mBAcquireRewardPopView2 = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView2.postDelayed(mBAcquireRewardPopView2.f34246n, 2000L);
            }
        };
        this.f34245m = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.6
            @Override // java.lang.Runnable
            public void run() {
                if (MBAcquireRewardPopView.this.f34240h > 0) {
                    MBAcquireRewardPopView.n(MBAcquireRewardPopView.this);
                    MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                    mBAcquireRewardPopView.postDelayed(mBAcquireRewardPopView.f34245m, 1000L);
                } else {
                    if (MBAcquireRewardPopView.this.f34234b.behaviourListener != null) {
                        MBAcquireRewardPopView.this.f34234b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_AUTO_DISMISS);
                    }
                    MBAcquireRewardPopView.this.f34241i = false;
                    MBAcquireRewardPopView.this.setVisibility(8);
                    MBAcquireRewardPopView.this.removeAllViews();
                }
            }
        };
        this.f34246n = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.7
            @Override // java.lang.Runnable
            public void run() {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(300L);
                alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.7.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        MBAcquireRewardPopView.this.f34241i = false;
                        MBAcquireRewardPopView.this.setVisibility(8);
                        MBAcquireRewardPopView.this.removeAllViews();
                    }
                });
                MBAcquireRewardPopView.this.startAnimation(alphaAnimation);
            }
        };
        this.f34247o = new View.OnTouchListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.8
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1) {
                        if (action == 2) {
                            MBAcquireRewardPopView.this.f34238f = motionEvent.getX();
                            MBAcquireRewardPopView.this.f34239g = motionEvent.getY();
                        }
                    } else if (MBAcquireRewardPopView.this.f34238f > MBAcquireRewardPopView.this.f34236d && Math.abs(MBAcquireRewardPopView.this.f34238f - MBAcquireRewardPopView.this.f34236d) > 50.0f && Math.abs(MBAcquireRewardPopView.this.f34239g - MBAcquireRewardPopView.this.f34237e) < 100.0f) {
                        if (MBAcquireRewardPopView.this.f34242j) {
                            return false;
                        }
                        MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                        mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.f34245m);
                        MBAcquireRewardPopView.this.f34242j = true;
                        View rightAnswerView = MBAcquireRewardPopView.this.getRightAnswerView();
                        View childAt = MBAcquireRewardPopView.this.getChildAt(0);
                        if (childAt != null) {
                            MBAcquireRewardPopView.this.a(childAt, rightAnswerView);
                        }
                        if (MBAcquireRewardPopView.this.f34234b.behaviourListener != null) {
                            MBAcquireRewardPopView.this.f34234b.behaviourListener.onReceivedSuccess(MBAcquireRewardPopView.this.f34234b.reduceTime);
                        }
                        MBAcquireRewardPopView mBAcquireRewardPopView2 = MBAcquireRewardPopView.this;
                        mBAcquireRewardPopView2.postDelayed(mBAcquireRewardPopView2.f34246n, 2000L);
                    } else {
                        MBAcquireRewardPopView.this.f34234b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.f34236d, MBAcquireRewardPopView.this.f34237e);
                    }
                } else {
                    MBAcquireRewardPopView.this.f34236d = motionEvent.getX();
                    MBAcquireRewardPopView.this.f34237e = motionEvent.getY();
                }
                return false;
            }
        };
        this.f34248p = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MBAcquireRewardPopView.this.f34234b.behaviourListener != null) {
                    MBAcquireRewardPopView.this.f34234b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.f34236d, MBAcquireRewardPopView.this.f34237e);
                }
            }
        };
        this.f34249q = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MBAcquireRewardPopView.this.f34234b.behaviourListener != null) {
                    MBAcquireRewardPopView.this.f34234b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_CLICK_CLOSE);
                }
                MBAcquireRewardPopView.this.f34241i = false;
                MBAcquireRewardPopView.this.setVisibility(8);
                MBAcquireRewardPopView.this.removeAllViews();
            }
        };
    }

    @RequiresApi(api = 21)
    public MBAcquireRewardPopView(Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f34233a = "MBAcquireRewardPopView";
        this.f34236d = 0.0f;
        this.f34237e = 0.0f;
        this.f34238f = 0.0f;
        this.f34239g = 0.0f;
        this.f34244l = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.f34245m);
                String str = (String) view.getTag();
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                boolean zContains = MBAcquireRewardPopView.this.f34234b.rightAnswerList.contains(str);
                View rightAnswerView = zContains ? MBAcquireRewardPopView.this.getRightAnswerView() : MBAcquireRewardPopView.this.getWrongAnswerView();
                View childAt = MBAcquireRewardPopView.this.getChildAt(0);
                if (childAt != null) {
                    MBAcquireRewardPopView.this.a(childAt, rightAnswerView);
                }
                if (MBAcquireRewardPopView.this.f34234b.behaviourListener != null) {
                    if (zContains) {
                        MBAcquireRewardPopView.this.f34234b.behaviourListener.onReceivedSuccess(MBAcquireRewardPopView.this.f34234b.reduceTime);
                    } else {
                        MBAcquireRewardPopView.this.f34234b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_CLICK_WRONG_ANSWER);
                    }
                }
                MBAcquireRewardPopView mBAcquireRewardPopView2 = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView2.postDelayed(mBAcquireRewardPopView2.f34246n, 2000L);
            }
        };
        this.f34245m = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.6
            @Override // java.lang.Runnable
            public void run() {
                if (MBAcquireRewardPopView.this.f34240h > 0) {
                    MBAcquireRewardPopView.n(MBAcquireRewardPopView.this);
                    MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                    mBAcquireRewardPopView.postDelayed(mBAcquireRewardPopView.f34245m, 1000L);
                } else {
                    if (MBAcquireRewardPopView.this.f34234b.behaviourListener != null) {
                        MBAcquireRewardPopView.this.f34234b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_AUTO_DISMISS);
                    }
                    MBAcquireRewardPopView.this.f34241i = false;
                    MBAcquireRewardPopView.this.setVisibility(8);
                    MBAcquireRewardPopView.this.removeAllViews();
                }
            }
        };
        this.f34246n = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.7
            @Override // java.lang.Runnable
            public void run() {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(300L);
                alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.7.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        MBAcquireRewardPopView.this.f34241i = false;
                        MBAcquireRewardPopView.this.setVisibility(8);
                        MBAcquireRewardPopView.this.removeAllViews();
                    }
                });
                MBAcquireRewardPopView.this.startAnimation(alphaAnimation);
            }
        };
        this.f34247o = new View.OnTouchListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.8
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1) {
                        if (action == 2) {
                            MBAcquireRewardPopView.this.f34238f = motionEvent.getX();
                            MBAcquireRewardPopView.this.f34239g = motionEvent.getY();
                        }
                    } else if (MBAcquireRewardPopView.this.f34238f > MBAcquireRewardPopView.this.f34236d && Math.abs(MBAcquireRewardPopView.this.f34238f - MBAcquireRewardPopView.this.f34236d) > 50.0f && Math.abs(MBAcquireRewardPopView.this.f34239g - MBAcquireRewardPopView.this.f34237e) < 100.0f) {
                        if (MBAcquireRewardPopView.this.f34242j) {
                            return false;
                        }
                        MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                        mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.f34245m);
                        MBAcquireRewardPopView.this.f34242j = true;
                        View rightAnswerView = MBAcquireRewardPopView.this.getRightAnswerView();
                        View childAt = MBAcquireRewardPopView.this.getChildAt(0);
                        if (childAt != null) {
                            MBAcquireRewardPopView.this.a(childAt, rightAnswerView);
                        }
                        if (MBAcquireRewardPopView.this.f34234b.behaviourListener != null) {
                            MBAcquireRewardPopView.this.f34234b.behaviourListener.onReceivedSuccess(MBAcquireRewardPopView.this.f34234b.reduceTime);
                        }
                        MBAcquireRewardPopView mBAcquireRewardPopView2 = MBAcquireRewardPopView.this;
                        mBAcquireRewardPopView2.postDelayed(mBAcquireRewardPopView2.f34246n, 2000L);
                    } else {
                        MBAcquireRewardPopView.this.f34234b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.f34236d, MBAcquireRewardPopView.this.f34237e);
                    }
                } else {
                    MBAcquireRewardPopView.this.f34236d = motionEvent.getX();
                    MBAcquireRewardPopView.this.f34237e = motionEvent.getY();
                }
                return false;
            }
        };
        this.f34248p = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MBAcquireRewardPopView.this.f34234b.behaviourListener != null) {
                    MBAcquireRewardPopView.this.f34234b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.f34236d, MBAcquireRewardPopView.this.f34237e);
                }
            }
        };
        this.f34249q = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MBAcquireRewardPopView.this.f34234b.behaviourListener != null) {
                    MBAcquireRewardPopView.this.f34234b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_CLICK_CLOSE);
                }
                MBAcquireRewardPopView.this.f34241i = false;
                MBAcquireRewardPopView.this.setVisibility(8);
                MBAcquireRewardPopView.this.removeAllViews();
            }
        };
    }

    private LayerDrawable a(int i10, int i11, int i12, int i13) {
        GradientDrawable gradientDrawableA = a(new int[]{i10, i11}, GradientDrawable.Orientation.TOP_BOTTOM);
        gradientDrawableA.setCornerRadius(v0.a(getContext(), 12.0f));
        GradientDrawable gradientDrawableA2 = a(new int[]{i12, i13}, GradientDrawable.Orientation.TOP_BOTTOM);
        gradientDrawableA2.setCornerRadius(v0.a(getContext(), 12.0f));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawableA, gradientDrawableA2});
        layerDrawable.setLayerInset(1, 5, 5, 5, 5);
        return layerDrawable;
    }

    private GradientDrawable a(int i10, int i11) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i10);
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(i11);
        return gradientDrawable;
    }

    private GradientDrawable a(int[] iArr, GradientDrawable.Orientation orientation) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(iArr);
        gradientDrawable.setGradientType(0);
        gradientDrawable.setOrientation(orientation);
        gradientDrawable.setShape(0);
        return gradientDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final View view) {
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 0.0f, 2, 0.8f, 1, 0.0f, 1, 0.0f);
        translateAnimation.setDuration(1000L);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(1000L);
        AnimationSet animationSet = new AnimationSet(true);
        this.f34235c = animationSet;
        animationSet.addAnimation(translateAnimation);
        this.f34235c.addAnimation(alphaAnimation);
        final AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setDuration(1000L);
        alphaAnimation2.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.3
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                view.startAnimation(MBAcquireRewardPopView.this.f34235c);
            }
        });
        this.f34235c.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.4
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                view.startAnimation(alphaAnimation2);
            }
        });
        view.startAnimation(this.f34235c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view, View view2) {
        removeView(view);
        addView(view2);
    }

    private ArrayList<String> a() {
        ArrayList<String> arrayList = new ArrayList<>();
        AcquireRewardPopViewParameters acquireRewardPopViewParameters = this.f34234b;
        if (acquireRewardPopViewParameters != null) {
            List<String> list = acquireRewardPopViewParameters.rightAnswerList;
            if (list != null) {
                arrayList.addAll(list);
            }
            if (this.f34234b.wrongAnswerList != null) {
                int iNextInt = new Random().nextInt(this.f34234b.wrongAnswerList.size());
                if (iNextInt > this.f34234b.wrongAnswerList.size() - 1) {
                    iNextInt = 0;
                }
                arrayList.add(this.f34234b.wrongAnswerList.get(iNextInt));
            }
        }
        return arrayList;
    }
}
