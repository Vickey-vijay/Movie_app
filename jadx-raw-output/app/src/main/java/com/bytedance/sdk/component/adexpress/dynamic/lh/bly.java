package com.bytedance.sdk.component.adexpress.dynamic.lh;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.le.ksc;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes8.dex */
public final class bly extends FrameLayout implements pno {
    private int bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.yu.tlj f11386cf;
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.yu.ra f11387le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public String f11388lh;
    public View ouw;
    private View.OnTouchListener pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.le.vm f11389ra;
    private com.bytedance.sdk.component.adexpress.vt.mwh ryl;
    private boolean tlj;
    public ra vt;
    private Context yu;

    public bly(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw fkwVar, com.bytedance.sdk.component.adexpress.dynamic.yu.ra raVar) {
        super(context);
        this.yu = context;
        this.fkw = fkwVar;
        this.f11387le = raVar;
        lh();
    }

    private void lh() {
        setBackgroundColor(0);
        setClipChildren(false);
        setClipToPadding(false);
        com.bytedance.sdk.component.adexpress.dynamic.yu.ra raVar = this.f11387le;
        com.bytedance.sdk.component.adexpress.dynamic.yu.le leVar = raVar.yu;
        this.f11388lh = leVar.f11454tc;
        this.bly = leVar.f11432an;
        this.tlj = leVar.f11444lh;
        ra raVarOuw = tlj.ouw(this.yu, this.fkw, raVar, this.f11386cf, this.ryl);
        this.vt = raVarOuw;
        if (raVarOuw != null) {
            this.ouw = raVarOuw.lh();
            if (this.f11387le.yu.smu) {
                setBackgroundColor(Color.parseColor("#50000000"));
            }
            if (TextUtils.equals(this.f11388lh, "6")) {
                com.bytedance.sdk.component.adexpress.dynamic.yu.le leVar2 = this.f11387le.yu;
                if (!leVar2.qbp || TextUtils.isEmpty(leVar2.f11455th)) {
                    this.f11389ra = new com.bytedance.sdk.component.adexpress.le.vm(this.yu, Color.parseColor("#99000000"));
                } else {
                    this.f11389ra = new com.bytedance.sdk.component.adexpress.le.vm(this.yu, com.bytedance.sdk.component.adexpress.dynamic.yu.ra.ouw(this.f11387le.yu.f11455th));
                }
                FrameLayout frameLayout = new FrameLayout(this.yu);
                frameLayout.addView(this.f11389ra, new FrameLayout.LayoutParams(-1, -1));
                frameLayout.setClipChildren(true);
                addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
                post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.lh.bly.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.bytedance.sdk.component.adexpress.le.vm vmVar = bly.this.f11389ra;
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, vmVar.yu);
                        vmVar.ouw = valueAnimatorOfFloat;
                        valueAnimatorOfFloat.setDuration(vmVar.f11542lh);
                        vmVar.ouw.setInterpolator(new LinearInterpolator());
                        vmVar.ouw.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.le.vm.1
                            public AnonymousClass1() {
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                vm.this.bly = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                vm.this.invalidate();
                            }
                        });
                        vmVar.ouw.start();
                    }
                });
            }
            if (ouw(this.f11388lh) && com.bytedance.sdk.component.adexpress.yu.vt()) {
                int color = Color.parseColor("#99000000");
                com.bytedance.sdk.component.adexpress.dynamic.yu.le leVar3 = this.f11387le.yu;
                if (leVar3.qbp && !TextUtils.isEmpty(leVar3.f11455th)) {
                    try {
                        color = com.bytedance.sdk.component.adexpress.dynamic.yu.ra.ouw(this.f11387le.yu.f11455th);
                    } catch (Exception unused) {
                    }
                }
                View view = new View(this.yu);
                view.setBackgroundColor(color);
                addView(view, new FrameLayout.LayoutParams(-1, -1));
            }
            addView(this.vt.lh());
            ouw(this.vt.lh());
            setVisibility(0);
        }
    }

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

    /* JADX INFO: Access modifiers changed from: private */
    public void fkw() {
        if (this.pno != null) {
            setOnClickListener((View.OnClickListener) this.fkw.getDynamicClickListener());
            performClick();
            if (this.f11387le.yu.qld) {
                return;
            }
            setVisibility(8);
        }
    }

    private static boolean ouw(String str) {
        return TextUtils.equals(str, "24") || TextUtils.equals(str, "23") || TextUtils.equals(str, "25") || TextUtils.equals(str, "22") || TextUtils.equals(str, "1");
    }

    private boolean yu() {
        return (this.f11387le.yu.f11444lh || TextUtils.equals("9", this.f11388lh) || TextUtils.equals("16", this.f11388lh) || TextUtils.equals("17", this.f11388lh) || TextUtils.equals("18", this.f11388lh) || TextUtils.equals("20", this.f11388lh) || TextUtils.equals("29", this.f11388lh) || TextUtils.equals("10", this.f11388lh)) ? false : true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.pno instanceof com.bytedance.sdk.component.adexpress.dynamic.lh.ouw.lh) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh.pno
    public final void vt() {
        if (yu()) {
            setOnClickListener((View.OnClickListener) this.fkw.getDynamicClickListener());
            performClick();
            if (this.f11387le.yu.qld) {
                return;
            }
            setVisibility(8);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            ra raVar = this.vt;
            if (raVar != null) {
                raVar.vt();
            }
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.ko.yu(e10.getMessage());
        }
    }

    public bly(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw fkwVar, com.bytedance.sdk.component.adexpress.dynamic.yu.ra raVar, com.bytedance.sdk.component.adexpress.dynamic.yu.tlj tljVar, com.bytedance.sdk.component.adexpress.vt.mwh mwhVar) {
        super(context);
        this.yu = context;
        this.fkw = fkwVar;
        this.f11387le = raVar;
        this.f11386cf = tljVar;
        this.ryl = mwhVar;
        lh();
    }

    private void ouw(ViewGroup viewGroup) {
        if (this.ouw == null) {
            return;
        }
        String str = this.f11388lh;
        str.hashCode();
        switch (str) {
            case "0":
                this.pno = new com.bytedance.sdk.component.adexpress.dynamic.lh.ouw.fkw(this, this.bly);
                setBackgroundColor(Color.parseColor("#80000000"));
                break;
            case "1":
            case "6":
                com.bytedance.sdk.component.adexpress.dynamic.yu.le leVar = this.f11387le.yu;
                if (!leVar.qbp || TextUtils.isEmpty(leVar.f11455th)) {
                    setBackgroundColor(Color.parseColor("#80000000"));
                }
                this.pno = new com.bytedance.sdk.component.adexpress.dynamic.lh.ouw.le(this);
                break;
            case "2":
            case "7":
                setBackgroundColor(Color.parseColor("#80000000"));
                this.pno = new com.bytedance.sdk.component.adexpress.dynamic.lh.ouw.vt(this, this);
                break;
            case "5":
                com.bytedance.sdk.component.adexpress.dynamic.yu.le leVar2 = this.f11387le.yu;
                if (leVar2.qbp && !TextUtils.isEmpty(leVar2.f11455th)) {
                    setBackgroundColor(com.bytedance.sdk.component.adexpress.dynamic.yu.ra.ouw(this.f11387le.yu.f11455th));
                } else {
                    setBackgroundColor(Color.parseColor("#80000000"));
                }
                this.pno = new com.bytedance.sdk.component.adexpress.dynamic.lh.ouw.lh(this);
                this.ouw.setTag(2);
                break;
            case "8":
            case "11":
                this.fkw.setClipChildren(false);
                this.fkw.setClipChildren(false);
                ViewGroup viewGroup2 = (ViewGroup) this.fkw.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.setClipChildren(false);
                    viewGroup2.setClipToPadding(false);
                }
                this.pno = new com.bytedance.sdk.component.adexpress.dynamic.lh.ouw.le(this);
                break;
            case "9":
            case "17":
                this.ouw.setTag(2);
                break;
            case "10":
                this.pno = new com.bytedance.sdk.component.adexpress.dynamic.lh.ouw.yu(this, this.bly, this.tlj);
                break;
            case "12":
                this.pno = new com.bytedance.sdk.component.adexpress.dynamic.lh.ouw.lh(this);
                this.ouw.setTag(2);
                break;
            case "13":
            case "24":
                if (this.f11388lh.equals("24") && com.bytedance.sdk.component.adexpress.yu.vt()) {
                    this.fkw.setClipChildren(false);
                    this.pno = new com.bytedance.sdk.component.adexpress.dynamic.lh.ouw.le(this);
                    break;
                } else {
                    this.pno = new com.bytedance.sdk.component.adexpress.dynamic.lh.ouw.fkw(this, this.bly);
                    break;
                }
                break;
            case "14":
                this.pno = new com.bytedance.sdk.component.adexpress.dynamic.lh.ouw.vt(this, this);
                break;
            case "16":
                View view = this.ouw;
                if (view != null && (view instanceof com.bytedance.sdk.component.adexpress.le.th) && ((com.bytedance.sdk.component.adexpress.le.th) view).getShakeLayout() != null) {
                    ((com.bytedance.sdk.component.adexpress.le.th) this.ouw).getShakeLayout().setTag(2);
                }
                this.ouw.setTag(2);
                break;
            case "18":
                View view2 = this.ouw;
                if (view2 != null && (view2 instanceof ksc) && ((ksc) view2).getWriggleLayout() != null) {
                    ((ksc) this.ouw).getWriggleLayout().setTag(2);
                }
                this.ouw.setTag(2);
                break;
            case "20":
                this.pno = new com.bytedance.sdk.component.adexpress.dynamic.lh.ouw.ouw(this, this.bly, viewGroup);
                break;
            case "22":
                if (com.bytedance.sdk.component.adexpress.yu.vt()) {
                    this.pno = new com.bytedance.sdk.component.adexpress.dynamic.lh.ouw.pno(this, this.tlj);
                    break;
                } else {
                    this.pno = new com.bytedance.sdk.component.adexpress.dynamic.lh.ouw.ra(this, this.bly, viewGroup);
                    break;
                }
                break;
            case "23":
                if (com.bytedance.sdk.component.adexpress.yu.vt()) {
                    this.pno = new com.bytedance.sdk.component.adexpress.dynamic.lh.ouw.le(this);
                    break;
                }
                break;
            case "25":
                if (com.bytedance.sdk.component.adexpress.yu.vt()) {
                    this.pno = new com.bytedance.sdk.component.adexpress.dynamic.lh.ouw.pno(this, this.tlj);
                    break;
                }
                break;
            case "29":
                View view3 = this.ouw;
                if (view3 != null && (view3 instanceof com.bytedance.sdk.component.adexpress.le.le) && ((com.bytedance.sdk.component.adexpress.le.le) view3).getShakeView() != null) {
                    ((com.bytedance.sdk.component.adexpress.le.le) this.ouw).getShakeView().setTag(2);
                }
                this.pno = new com.bytedance.sdk.component.adexpress.dynamic.lh.ouw.fkw(this, this.bly);
                break;
        }
        View.OnTouchListener onTouchListener = this.pno;
        if (onTouchListener != null) {
            setOnTouchListener(onTouchListener);
        }
        if (yu()) {
            this.ouw.setTag(2);
            setOnClickListener((View.OnClickListener) this.fkw.getDynamicClickListener());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh.pno
    public final void ouw() {
        if (TextUtils.equals(this.f11388lh, "6")) {
            com.bytedance.sdk.component.adexpress.le.vm vmVar = this.f11389ra;
            if (vmVar != null) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(vmVar.yu, 0.0f);
                vmVar.vt = valueAnimatorOfFloat;
                valueAnimatorOfFloat.setDuration(vmVar.f11542lh);
                vmVar.vt.setInterpolator(new LinearInterpolator());
                vmVar.vt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.le.vm.2
                    public AnonymousClass2() {
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        vm.this.bly = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        vm.this.invalidate();
                    }
                });
                Animator.AnimatorListener animatorListener = vmVar.fkw;
                if (animatorListener != null) {
                    vmVar.vt.addListener(animatorListener);
                }
                vmVar.vt.start();
                postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.lh.bly.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        bly.this.fkw();
                    }
                }, 300L);
                return;
            }
            return;
        }
        if (TextUtils.equals(this.f11388lh, "20")) {
            postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.lh.bly.3
                @Override // java.lang.Runnable
                public final void run() {
                    bly.this.fkw();
                }
            }, 400L);
        } else {
            fkw();
        }
    }
}
