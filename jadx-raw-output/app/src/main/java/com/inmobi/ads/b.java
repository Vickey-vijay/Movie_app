package com.inmobi.ads;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import ck.p;
import com.inmobi.media.C3219u1;
import com.inmobi.media.C3244v1;

/* JADX INFO: loaded from: classes11.dex */
public abstract class b {
    public static final Animation a(InMobiBanner.AnimationType animationType, float f10, float f11) {
        p.j(animationType, "animationType");
        int i10 = a.f22311a[animationType.ordinal()];
        if (i10 == 1) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.5f);
            alphaAnimation.setDuration(1000L);
            alphaAnimation.setFillAfter(false);
            alphaAnimation.setInterpolator(new DecelerateInterpolator());
            return alphaAnimation;
        }
        if (i10 == 2) {
            C3219u1 c3219u1 = new C3219u1(f10 / 2.0f, f11 / 2.0f);
            c3219u1.setDuration(500L);
            c3219u1.setFillAfter(false);
            c3219u1.setInterpolator(new AccelerateInterpolator());
            return c3219u1;
        }
        if (i10 != 3) {
            return null;
        }
        C3244v1 c3244v1 = new C3244v1(f10 / 2.0f, f11 / 2.0f);
        c3244v1.setDuration(500L);
        c3244v1.setFillAfter(false);
        c3244v1.setInterpolator(new AccelerateInterpolator());
        return c3244v1;
    }
}
