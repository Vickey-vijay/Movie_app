package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class fkw extends FrameLayout implements IAnimation, bs, fak {
    public int bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public Context f11362cf;
    public float fkw;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public DynamicRootView f11363jg;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public View f11364ko;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public float f11365le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public float f11366lh;
    public com.bytedance.sdk.component.adexpress.dynamic.yu.pno mwh;
    private float ouw;
    public int pno;
    private float qbp;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public int f11367ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    public boolean f11368rn;
    public com.bytedance.sdk.component.adexpress.dynamic.yu.ra ryl;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    private float f11369th;
    public int tlj;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    public com.bytedance.sdk.component.adexpress.dynamic.animation.view.lh f11370vm;
    private float vt;
    public float yu;
    public com.bytedance.sdk.component.adexpress.dynamic.animation.ouw.vt zih;
    private com.bytedance.sdk.component.utils.ex zin;
    private static final View.OnTouchListener vpp = new View.OnTouchListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw.2
        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    };
    private static final View.OnClickListener jqy = new View.OnClickListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw.3
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
        }
    };

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    public Drawable getBackgroundDrawable() {
        return ouw(false, "");
    }

    @Override // android.widget.FrameLayout, android.view.View
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

    /* JADX WARN: Code duplicated, block: B:13:0x001b  */
    public final void ouw(int i10) {
        boolean z10;
        com.bytedance.sdk.component.adexpress.dynamic.yu.ra raVar = this.ryl;
        if (raVar == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.dynamic.yu.fkw fkwVar = raVar.fkw;
        if (fkwVar != null) {
            if (i10 == 1) {
                raVar.yu = fkwVar.yu;
            } else {
                raVar.yu = fkwVar.f11431lh;
            }
            z10 = raVar.yu != null;
        }
        if (z10) {
            ra();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt != null && (getChildAt(i11) instanceof fkw)) {
                    ((fkw) childAt).ouw(i10);
                }
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fak
    public void a_() {
        com.bytedance.sdk.component.adexpress.dynamic.animation.ouw.vt vtVar = this.zih;
        if (vtVar != null) {
            vtVar.a_();
        }
    }

    public void fkw() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f11367ra, this.pno);
        layoutParams.topMargin = this.tlj;
        int i10 = this.bly;
        layoutParams.leftMargin = i10;
        layoutParams.setMarginStart(i10);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    public boolean getBeginInvisibleAndShow() {
        return this.f11368rn;
    }

    public int getClickArea() {
        return this.ryl.ryl();
    }

    public GradientDrawable getDrawable() {
        return new GradientDrawable();
    }

    public com.bytedance.sdk.component.adexpress.dynamic.le.ouw getDynamicClickListener() {
        return this.f11363jg.getDynamicClickListener();
    }

    public int getDynamicHeight() {
        return this.pno;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.yu.le getDynamicLayoutBrickValue() {
        com.bytedance.sdk.component.adexpress.dynamic.yu.fkw fkwVar;
        com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar = this.mwh;
        if (pnoVar == null || (fkwVar = pnoVar.bly) == null) {
            return null;
        }
        return fkwVar.f11431lh;
    }

    public int getDynamicWidth() {
        return this.f11367ra;
    }

    public String getImageObjectFit() {
        return this.ryl.yu.f11445ln;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getMarqueeValue() {
        return this.f11369th;
    }

    public Drawable getMutilBackgroundDrawable() {
        try {
            String strReplaceAll = this.ryl.yu.eot.replaceAll("/\\*.*\\*/", "");
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            boolean z10 = false;
            int i11 = 0;
            for (int i12 = 0; i12 < strReplaceAll.length(); i12++) {
                if (strReplaceAll.charAt(i12) == '(') {
                    i10++;
                    z10 = true;
                } else if (strReplaceAll.charAt(i12) == ')' && (i10 = i10 - 1) == 0 && z10) {
                    int i13 = i12 + 1;
                    arrayList.add(strReplaceAll.substring(i11, i13));
                    i11 = i13;
                    z10 = false;
                }
            }
            return new LayerDrawable(ouw(arrayList));
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getRippleValue() {
        return this.ouw;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getShineValue() {
        return this.vt;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getStretchValue() {
        return this.qbp;
    }

    public final boolean le() {
        com.bytedance.sdk.component.adexpress.dynamic.yu.fkw fkwVar;
        com.bytedance.sdk.component.adexpress.dynamic.yu.le leVar;
        com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar = this.mwh;
        return pnoVar == null || (fkwVar = pnoVar.bly) == null || (leVar = fkwVar.f11431lh) == null || leVar.njr == null;
    }

    public boolean lh() {
        View.OnTouchListener onTouchListener;
        View.OnClickListener onClickListener;
        View view = this.f11364ko;
        View view2 = view;
        if (view == null) {
            view2 = this;
        }
        if (yu()) {
            onTouchListener = (View.OnTouchListener) getDynamicClickListener();
            onClickListener = (View.OnClickListener) getDynamicClickListener();
        } else {
            onTouchListener = vpp;
            onClickListener = jqy;
        }
        if (onTouchListener != null && onClickListener != null) {
            view2.setOnTouchListener(onTouchListener);
            view2.setOnClickListener(onClickListener);
            int iOuw = com.bytedance.sdk.component.adexpress.dynamic.vt.ouw.ouw(this.ryl);
            if (iOuw == 2 || iOuw == 3) {
                view2.setOnClickListener(jqy);
            } else {
                view2.setOnClickListener(onClickListener);
            }
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", this.mwh.f11474le);
            jSONObject.put("height", this.mwh.f11476ra);
            if (com.bytedance.sdk.component.adexpress.yu.vt()) {
                view2.setTag(com.bytedance.sdk.component.adexpress.dynamic.ouw.qbp, this.ryl.yu.jae);
                view2.setTag(com.bytedance.sdk.component.adexpress.dynamic.ouw.zin, this.mwh.bly.ouw);
                view2.setTag(com.bytedance.sdk.component.adexpress.dynamic.ouw.vpp, this.mwh.ouw);
                view2.setTag(com.bytedance.sdk.component.adexpress.dynamic.ouw.jqy, jSONObject.toString());
            } else {
                view2.setTag(2097610717, this.ryl.yu.jae);
                view2.setTag(2097610715, this.mwh.bly.ouw);
                view2.setTag(2097610714, this.mwh.ouw);
                view2.setTag(2097610713, jSONObject.toString());
                int iOuw2 = com.bytedance.sdk.component.adexpress.dynamic.vt.ouw.ouw(this.ryl);
                if (iOuw2 == 1) {
                    com.bytedance.sdk.component.adexpress.dynamic.yu.le leVar = this.ryl.yu;
                    view2.setTag(2097610707, new Pair(leVar.baa, Long.valueOf(leVar.f11447nn)));
                    view2.setTag(2097610708, Integer.valueOf(iOuw2));
                }
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        ouw(view2);
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setMarqueeValue(float f10) {
        this.f11369th = f10;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setRippleValue(float f10) {
        this.ouw = f10;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setShineValue(float f10) {
        this.vt = f10;
        postInvalidate();
    }

    public void setShouldInvisible(boolean z10) {
        this.f11368rn = z10;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setStretchValue(float f10) {
        this.qbp = f10;
        this.f11370vm.ouw(this, f10);
    }

    public boolean yu() {
        com.bytedance.sdk.component.adexpress.dynamic.yu.ra raVar = this.ryl;
        return (raVar == null || raVar.ryl() == 0) ? false : true;
    }

    public fkw(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        boolean z10;
        super(context);
        this.f11362cf = context;
        this.f11363jg = dynamicRootView;
        this.mwh = pnoVar;
        float f10 = pnoVar.vt;
        this.f11366lh = f10;
        this.yu = pnoVar.f11475lh;
        this.fkw = pnoVar.f11474le;
        this.f11365le = pnoVar.f11476ra;
        this.bly = (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(context, f10);
        this.tlj = (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.f11362cf, this.yu);
        this.f11367ra = (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.f11362cf, this.fkw);
        this.pno = (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.f11362cf, this.f11365le);
        com.bytedance.sdk.component.adexpress.dynamic.yu.ra raVar = new com.bytedance.sdk.component.adexpress.dynamic.yu.ra(pnoVar.bly);
        this.ryl = raVar;
        int i10 = raVar.yu.f11438gh;
        if (i10 > 0) {
            this.f11367ra += i10 * 2;
            this.pno += i10 * 2;
            this.bly -= i10;
            this.tlj -= i10;
            List<com.bytedance.sdk.component.adexpress.dynamic.yu.pno> list = pnoVar.tlj;
            if (list != null) {
                for (com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar2 : list) {
                    pnoVar2.vt += com.bytedance.sdk.component.adexpress.yu.ra.vt(this.f11362cf, this.ryl.yu.f11438gh);
                    pnoVar2.f11475lh += com.bytedance.sdk.component.adexpress.yu.ra.vt(this.f11362cf, this.ryl.yu.f11438gh);
                    pnoVar2.yu = com.bytedance.sdk.component.adexpress.yu.ra.vt(this.f11362cf, this.ryl.yu.f11438gh);
                    pnoVar2.fkw = com.bytedance.sdk.component.adexpress.yu.ra.vt(this.f11362cf, this.ryl.yu.f11438gh);
                }
            }
        }
        if (this.ryl.yu.bly > 0.0d) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f11368rn = z10;
        this.f11370vm = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.lh();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!le()) {
            View view = this.f11364ko;
            if (view == null) {
                view = this;
            }
            this.zih = new com.bytedance.sdk.component.adexpress.dynamic.animation.ouw.vt(view, this.mwh.bly.f11431lh.njr);
            post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw.1
                @Override // java.lang.Runnable
                public final void run() {
                    com.bytedance.sdk.component.adexpress.dynamic.animation.ouw.vt vtVar = fkw.this.zih;
                    if (vtVar != null) {
                        for (com.bytedance.sdk.component.adexpress.dynamic.animation.ouw.yu yuVar : vtVar.ouw) {
                            try {
                                List<ObjectAnimator> list = yuVar.ouw;
                                if (list != null) {
                                    for (ObjectAnimator objectAnimator : list) {
                                        objectAnimator.start();
                                        if (yuVar.vt.bly > 0.0d) {
                                            objectAnimator.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.ouw.yu.1
                                                public final /* synthetic */ ObjectAnimator ouw;

                                                @Override // android.animation.Animator.AnimatorListener
                                                public final void onAnimationCancel(Animator animator) {
                                                }

                                                @Override // android.animation.Animator.AnimatorListener
                                                public final void onAnimationEnd(Animator animator) {
                                                }

                                                @Override // android.animation.Animator.AnimatorListener
                                                public final void onAnimationStart(Animator animator) {
                                                }

                                                public AnonymousClass1() {
                                                    objectAnimator = objectAnimator;
                                                }

                                                @Override // android.animation.Animator.AnimatorListener
                                                public final void onAnimationRepeat(Animator animator) {
                                                    objectAnimator.pause();
                                                    ouw ouwVar = yu.this.new ouw(objectAnimator);
                                                    ScheduledFuture<?> scheduledFutureOuw = com.bytedance.sdk.component.adexpress.yu.yu.ouw(ouwVar, (long) (yu.this.vt.bly * 1000.0d), TimeUnit.MILLISECONDS);
                                                    ouwVar.vt = scheduledFutureOuw;
                                                    yu.this.f11355lh.add(scheduledFutureOuw);
                                                }
                                            });
                                        }
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            });
        }
        if (isShown()) {
            int iOuw = com.bytedance.sdk.component.adexpress.dynamic.vt.ouw.ouw(this.ryl);
            if (iOuw == 2) {
                if (this.zin == null) {
                    getContext().getApplicationContext();
                    this.zin = new com.bytedance.sdk.component.utils.ex();
                }
                new Object() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw.4
                };
                this.f11363jg.getRenderRequest();
                return;
            }
            if (iOuw == 3) {
                if (this.zin == null) {
                    getContext().getApplicationContext();
                    this.zin = new com.bytedance.sdk.component.utils.ex();
                }
                new Object() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw.5
                };
                this.f11363jg.getRenderRequest();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        a_();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f11370vm.ouw(canvas, this, this);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        com.bytedance.sdk.component.adexpress.dynamic.animation.view.lh lhVar = this.f11370vm;
        View view = this.f11364ko;
        if (view == null) {
            view = this;
        }
        lhVar.ouw(view, i10, i11);
    }

    public final boolean vt() {
        ra();
        fkw();
        lh();
        return true;
    }

    public final void ouw(@NonNull View view) {
        com.bytedance.sdk.component.adexpress.dynamic.yu.le leVar;
        com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar = this.mwh;
        if (pnoVar == null || (leVar = pnoVar.bly.f11431lh) == null) {
            return;
        }
        view.setTag(2097610716, Boolean.valueOf(leVar.zjp));
    }

    public final Drawable ouw(boolean z10, String str) {
        String[] strArrSplit;
        int[] iArr;
        int iMwh;
        if (!TextUtils.isEmpty(this.ryl.yu.eot)) {
            try {
                String str2 = this.ryl.yu.eot;
                String strSubstring = str2.substring(str2.indexOf("(") + 1, str2.length() - 1);
                if (strSubstring.contains("rgba") && strSubstring.contains("%")) {
                    strArrSplit = new String[]{strSubstring.substring(0, strSubstring.indexOf(StringUtils.COMMA)).trim(), strSubstring.substring(strSubstring.indexOf(StringUtils.COMMA) + 1, strSubstring.indexOf("%") + 1).trim(), strSubstring.substring(strSubstring.indexOf("%") + 2).trim()};
                    iArr = new int[]{com.bytedance.sdk.component.adexpress.dynamic.yu.ra.ouw(strArrSplit[1]), com.bytedance.sdk.component.adexpress.dynamic.yu.ra.ouw(strArrSplit[2])};
                } else {
                    strArrSplit = strSubstring.split(", ");
                    iArr = new int[]{com.bytedance.sdk.component.adexpress.dynamic.yu.ra.ouw(strArrSplit[1].substring(0, 7)), com.bytedance.sdk.component.adexpress.dynamic.yu.ra.ouw(strArrSplit[2].substring(0, 7))};
                }
                try {
                    double d10 = Double.parseDouble(strSubstring.substring(strSubstring.indexOf("linear-gradient(") + 1, strSubstring.indexOf("deg")));
                    if (d10 > 225.0d && d10 < 315.0d) {
                        int i10 = iArr[1];
                        iArr[1] = iArr[0];
                        iArr[0] = i10;
                    }
                } catch (Exception unused) {
                }
                GradientDrawable gradientDrawableOuw = ouw(ouw(strArrSplit[0]), iArr);
                gradientDrawableOuw.setShape(0);
                gradientDrawableOuw.setCornerRadius(com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.f11362cf, this.ryl.yu.ouw));
                return gradientDrawableOuw;
            } catch (Exception unused2) {
                Drawable mutilBackgroundDrawable = getMutilBackgroundDrawable();
                if (mutilBackgroundDrawable != null) {
                    return mutilBackgroundDrawable;
                }
            }
        }
        GradientDrawable drawable = getDrawable();
        drawable.setShape(0);
        float fOuw = com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.f11362cf, this.ryl.yu.ouw);
        drawable.setCornerRadius(fOuw);
        if (fOuw < 1.0f) {
            float fOuw2 = com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.f11362cf, this.ryl.yu.lgp);
            float fOuw3 = com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.f11362cf, this.ryl.yu.zrz);
            float fOuw4 = com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.f11362cf, this.ryl.yu.wbf);
            float fOuw5 = com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.f11362cf, this.ryl.yu.eay);
            float[] fArr = new float[8];
            if (fOuw2 > 0.0f) {
                fArr[0] = fOuw2;
                fArr[1] = fOuw2;
            }
            if (fOuw3 > 0.0f) {
                fArr[2] = fOuw3;
                fArr[3] = fOuw3;
            }
            if (fOuw4 > 0.0f) {
                fArr[4] = fOuw4;
                fArr[5] = fOuw4;
            }
            if (fOuw5 > 0.0f) {
                fArr[6] = fOuw5;
                fArr[7] = fOuw5;
            }
            drawable.setCornerRadii(fArr);
        }
        if (z10) {
            iMwh = Color.parseColor(str);
        } else {
            iMwh = this.ryl.mwh();
        }
        drawable.setColor(iMwh);
        com.bytedance.sdk.component.adexpress.dynamic.yu.ra raVar = this.ryl;
        com.bytedance.sdk.component.adexpress.dynamic.yu.le leVar = raVar.yu;
        float f10 = leVar.vt;
        if (f10 > 0.0f) {
            drawable.setStroke((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.f11362cf, f10), this.ryl.cf());
            return drawable;
        }
        int i11 = leVar.f11438gh;
        if (i11 <= 0) {
            return drawable;
        }
        drawable.setStroke(i11, raVar.cf());
        drawable.setAlpha(50);
        if (!TextUtils.equals(this.mwh.bly.ouw, "video-vd")) {
            return drawable;
        }
        setLayerType(1, null);
        return new th((int) fOuw, this.ryl.yu.f11438gh);
    }

    public vt ouw(Bitmap bitmap) {
        return new ouw(bitmap, null);
    }

    private Drawable[] ouw(List<String> list) {
        Drawable[] drawableArr = new Drawable[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10);
            if (str.contains("linear-gradient")) {
                String[] strArrSplit = str.substring(str.indexOf("(") + 1, str.length() - 1).split(", ");
                int length = strArrSplit.length - 1;
                int[] iArr = new int[length];
                int i11 = 0;
                while (i11 < length) {
                    int i12 = i11 + 1;
                    iArr[i11] = com.bytedance.sdk.component.adexpress.dynamic.yu.ra.ouw(strArrSplit[i12].substring(0, 7));
                    i11 = i12;
                }
                GradientDrawable gradientDrawableOuw = ouw(ouw(strArrSplit[0]), iArr);
                gradientDrawableOuw.setShape(0);
                gradientDrawableOuw.setCornerRadius(com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.f11362cf, this.ryl.yu.ouw));
                drawableArr[(list.size() - 1) - i10] = gradientDrawableOuw;
            }
        }
        return drawableArr;
    }

    public GradientDrawable ouw(GradientDrawable.Orientation orientation, @ColorInt int[] iArr) {
        if (iArr.length == 0) {
            return new GradientDrawable();
        }
        if (iArr.length == 1) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(iArr[0]);
            return gradientDrawable;
        }
        return new GradientDrawable(orientation, iArr);
    }

    public static GradientDrawable.Orientation ouw(String str) {
        try {
            int i10 = (int) Float.parseFloat(str.substring(0, str.length() - 3));
            if (i10 <= 90) {
                return GradientDrawable.Orientation.LEFT_RIGHT;
            }
            if (i10 <= 180) {
                return GradientDrawable.Orientation.TOP_BOTTOM;
            }
            if (i10 <= 270) {
                return GradientDrawable.Orientation.RIGHT_LEFT;
            }
            return GradientDrawable.Orientation.BOTTOM_TOP;
        } catch (Exception unused) {
            return GradientDrawable.Orientation.LEFT_RIGHT;
        }
    }
}
