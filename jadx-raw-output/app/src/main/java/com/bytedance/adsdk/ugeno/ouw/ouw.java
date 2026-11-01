package com.bytedance.adsdk.ugeno.ouw;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class ouw extends AnimatorListenerAdapter {
    private com.bytedance.adsdk.ugeno.ouw.ouw.ouw bly;
    private lh fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private Context f10910le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public vt f10911lh;
    public ValueAnimator ouw;
    private int pno = 1;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private int f10912ra;
    public String vt;
    private com.bytedance.adsdk.ugeno.vt.lh yu;

    public final void ouw() {
        ValueAnimator valueAnimator = this.ouw;
        if (valueAnimator == null || this.pno == 0 || this.f10912ra == Integer.MIN_VALUE) {
            return;
        }
        valueAnimator.start();
    }

    public final void vt() {
        ValueAnimator valueAnimator = this.ouw;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    /* JADX WARN: Code duplicated, block: B:67:0x010f  */
    /* JADX WARN: Code duplicated, block: B:97:0x018f  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final ValueAnimator lh() {
        byte b10;
        TimeInterpolator accelerateInterpolator;
        com.bytedance.adsdk.ugeno.ouw.ouw.ouw fkwVar;
        com.bytedance.adsdk.ugeno.ouw.vt.ouw lhVar;
        lh lhVar2 = this.fkw;
        if (lhVar2 == null || this.yu == null) {
            return null;
        }
        Map<String, TreeMap<Float, String>> map = lhVar2.ouw;
        ArrayList arrayList = new ArrayList();
        byte b11 = -1;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, TreeMap<Float, String>> entry : map.entrySet()) {
                if (entry != null) {
                    String key = entry.getKey();
                    String str = fkw.ouw(key).zih;
                    str.hashCode();
                    switch (str) {
                        case "int":
                            lhVar = new com.bytedance.adsdk.ugeno.ouw.vt.lh(this.f10910le, this.yu, key, entry.getValue());
                            break;
                        case "float":
                            lhVar = new com.bytedance.adsdk.ugeno.ouw.vt.vt(this.f10910le, this.yu, key, entry.getValue());
                            break;
                        case "point":
                            lhVar = new com.bytedance.adsdk.ugeno.ouw.vt.yu(this.f10910le, this.yu, key, entry.getValue());
                            break;
                        default:
                            lhVar = null;
                            break;
                    }
                    if (lhVar != null) {
                        arrayList.addAll(lhVar.lh());
                    }
                }
            }
        }
        JSONObject jSONObject = this.fkw.tlj;
        if (jSONObject != null) {
            com.bytedance.adsdk.ugeno.vt.lh lhVar3 = this.yu;
            if (lhVar3 != null) {
                String strOptString = jSONObject.optString("type");
                strOptString.hashCode();
                switch (strOptString) {
                    case "stretch":
                        fkwVar = new com.bytedance.adsdk.ugeno.ouw.ouw.fkw(lhVar3, jSONObject);
                        break;
                    case "ripple":
                        fkwVar = new com.bytedance.adsdk.ugeno.ouw.ouw.vt(lhVar3, jSONObject);
                        break;
                    case "rub_in":
                        fkwVar = new com.bytedance.adsdk.ugeno.ouw.ouw.lh(lhVar3, jSONObject);
                        break;
                    case "shine":
                        fkwVar = new com.bytedance.adsdk.ugeno.ouw.ouw.yu(lhVar3, jSONObject);
                        break;
                    default:
                        fkwVar = null;
                        break;
                }
            } else {
                fkwVar = null;
            }
            this.bly = fkwVar;
            if (fkwVar != null) {
                arrayList.addAll(fkwVar.vt());
            }
        }
        final T t10 = this.yu.fkw;
        if (t10 == 0) {
            return null;
        }
        final lh.ouw ouwVar = this.fkw.f10907le;
        if (ouwVar != null) {
            t10.post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.ouw.ouw.1
                @Override // java.lang.Runnable
                public final void run() {
                    int width = t10.getWidth();
                    int height = t10.getHeight();
                    t10.setPivotX(yu.ouw(ouwVar.ouw, width));
                    t10.setPivotY(yu.ouw(ouwVar.vt, height));
                }
            });
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(t10, (PropertyValuesHolder[]) arrayList.toArray(new PropertyValuesHolder[0]));
        lh lhVar4 = this.fkw;
        int i10 = lhVar4.f10908lh;
        this.f10912ra = i10 < 0 ? -1 : i10 == 0 ? Integer.MIN_VALUE : i10 - 1;
        objectAnimatorOfPropertyValuesHolder.setDuration(lhVar4.vt);
        int i11 = this.f10912ra;
        if (i11 != Integer.MIN_VALUE) {
            objectAnimatorOfPropertyValuesHolder.setRepeatCount(i11);
        }
        lh lhVar5 = this.fkw;
        this.pno = lhVar5.bly;
        this.vt = lhVar5.pno;
        objectAnimatorOfPropertyValuesHolder.setStartDelay(lhVar5.fkw);
        String str2 = this.fkw.yu;
        int iHashCode = str2.hashCode();
        if (iHashCode != -1408024454) {
            if (iHashCode == -1039745817 && str2.equals("normal")) {
                b10 = 1;
            } else {
                b10 = -1;
            }
        } else if (str2.equals("alternate")) {
            b10 = 0;
        } else {
            b10 = -1;
        }
        objectAnimatorOfPropertyValuesHolder.setRepeatMode(b10 != 0 ? 1 : 2);
        String str3 = this.fkw.f10909ra;
        switch (str3.hashCode()) {
            case -1965072618:
                if (str3.equals("ease_in")) {
                    b11 = 0;
                }
                break;
            case -1102672091:
                if (str3.equals("linear")) {
                    b11 = 3;
                }
                break;
            case -787702915:
                if (str3.equals("ease_out")) {
                    b11 = 2;
                }
                break;
            case 1065009829:
                if (str3.equals("ease_in_out")) {
                    b11 = 1;
                }
                break;
        }
        if (b11 == 0) {
            accelerateInterpolator = new AccelerateInterpolator();
        } else if (b11 != 1) {
            accelerateInterpolator = b11 != 2 ? new LinearInterpolator() : new DecelerateInterpolator();
        } else {
            accelerateInterpolator = new AccelerateDecelerateInterpolator();
        }
        objectAnimatorOfPropertyValuesHolder.setInterpolator(accelerateInterpolator);
        objectAnimatorOfPropertyValuesHolder.addListener(this);
        this.ouw = objectAnimatorOfPropertyValuesHolder;
        return objectAnimatorOfPropertyValuesHolder;
    }

    public ouw(Context context, com.bytedance.adsdk.ugeno.vt.lh lhVar, lh lhVar2) {
        this.yu = lhVar;
        this.fkw = lhVar2;
        this.f10910le = context;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        vt vtVar = this.f10911lh;
        if (vtVar != null) {
            vtVar.vt();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        vt vtVar = this.f10911lh;
        if (vtVar != null) {
            vtVar.ouw();
        }
    }

    public final void vt(Canvas canvas) {
        com.bytedance.adsdk.ugeno.ouw.ouw.ouw ouwVar = this.bly;
        if (ouwVar != null) {
            ouwVar.vt(canvas);
        }
    }

    public final void ouw(Canvas canvas) {
        com.bytedance.adsdk.ugeno.ouw.ouw.ouw ouwVar = this.bly;
        if (ouwVar != null) {
            ouwVar.ouw(canvas);
        }
    }

    public final void ouw(int i10, int i11) {
        com.bytedance.adsdk.ugeno.ouw.ouw.ouw ouwVar = this.bly;
        if (ouwVar != null) {
            ouwVar.ouw(i10, i11);
        }
    }
}
