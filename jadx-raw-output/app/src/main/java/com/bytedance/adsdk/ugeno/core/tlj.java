package com.bytedance.adsdk.ugeno.core;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class tlj {
    public Paint fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public String f10831le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public int f10832lh;
    public AnimatorSet ouw = new AnimatorSet();

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private ouw f10833ra;
    public View vt;
    public int yu;

    public final void ouw() {
        ArrayList arrayList = new ArrayList();
        List<ouw.C0068ouw> list = this.f10833ra.f10812lh;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (ouw.C0068ouw c0068ouw : list) {
            if (c0068ouw != null) {
                ObjectAnimator objectAnimator = new ObjectAnimator();
                objectAnimator.setDuration(c0068ouw.ouw);
                if (TextUtils.equals(c0068ouw.fkw, "translateX")) {
                    objectAnimator.setPropertyName("translationX");
                } else if (TextUtils.equals(c0068ouw.fkw, "translateY")) {
                    objectAnimator.setPropertyName("translationY");
                } else {
                    objectAnimator.setPropertyName(c0068ouw.fkw);
                }
                objectAnimator.setStartDelay(c0068ouw.yu);
                objectAnimator.setTarget(this.vt);
                if (TextUtils.equals(c0068ouw.fkw, "backgroundColor")) {
                    objectAnimator.setIntValues((int) c0068ouw.f10813le, (int) c0068ouw.f10815ra);
                    Log.d("UGenAnimation", "playAnimation: from = " + c0068ouw.f10813le + "; to=" + c0068ouw.f10815ra);
                } else {
                    objectAnimator.setFloatValues(c0068ouw.f10813le, c0068ouw.f10815ra);
                }
                int i10 = (int) this.f10833ra.vt;
                if (i10 != 0) {
                    objectAnimator.setRepeatCount(i10);
                } else {
                    objectAnimator.setRepeatCount((int) c0068ouw.vt);
                }
                if (TextUtils.equals(c0068ouw.fkw, "backgroundColor")) {
                    objectAnimator.setEvaluator(new ArgbEvaluator());
                }
                String str = this.f10833ra.f10811le;
                if (TextUtils.isEmpty(str)) {
                    str = c0068ouw.f10814lh;
                }
                if (TextUtils.equals(str, "reverse")) {
                    objectAnimator.setRepeatMode(2);
                } else {
                    objectAnimator.setRepeatMode(1);
                }
                float[] fArr = c0068ouw.pno;
                if (fArr != null && fArr.length > 0) {
                    objectAnimator.setFloatValues(fArr);
                }
                if (TextUtils.equals(c0068ouw.fkw, "rotationX")) {
                    this.vt.post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.core.tlj.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            View view = tlj.this.vt;
                            view.setPivotX(view.getWidth() / 2.0f);
                            View view2 = tlj.this.vt;
                            view2.setPivotY(view2.getHeight());
                        }
                    });
                }
                if (TextUtils.equals(c0068ouw.fkw, "ripple")) {
                    this.f10831le = c0068ouw.tlj;
                }
                String str2 = c0068ouw.bly;
                str2.hashCode();
                switch (str2) {
                    case "accelerate":
                        objectAnimator.setInterpolator(new AccelerateInterpolator());
                        break;
                    case "decelerate":
                        objectAnimator.setInterpolator(new DecelerateInterpolator());
                        break;
                    case "linear":
                    case "standard":
                        objectAnimator.setInterpolator(new LinearInterpolator());
                        break;
                    case "accelerateDecelerate":
                        objectAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
                        break;
                }
                arrayList.add(objectAnimator);
            }
        }
        long j10 = this.f10833ra.yu;
        if (j10 != 0) {
            this.ouw.setDuration(j10);
        }
        this.ouw.setStartDelay(this.f10833ra.fkw);
        if (TextUtils.equals(this.f10833ra.ouw, "sequentially")) {
            this.ouw.playSequentially(arrayList);
        } else {
            this.ouw.playTogether(arrayList);
        }
        this.ouw.start();
    }

    public tlj(View view, ouw ouwVar) {
        this.vt = view;
        this.f10833ra = ouwVar;
        Paint paint = new Paint();
        this.fkw = paint;
        paint.setAntiAlias(true);
    }
}
