package com.bytedance.sdk.component.adexpress.dynamic.animation.ouw;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fak;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes4.dex */
public abstract class yu implements fak {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public Set<ScheduledFuture<?>> f11355lh = new HashSet();
    public List<ObjectAnimator> ouw = ouw();
    public com.bytedance.sdk.component.adexpress.dynamic.yu.ouw vt;
    public View yu;

    public class ouw implements Runnable {
        public ObjectAnimator ouw;
        public ScheduledFuture<?> vt;

        public ouw(ObjectAnimator objectAnimator) {
            this.ouw = objectAnimator;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f11574lh != null) {
                com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f11574lh.lh().post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.ouw.yu.ouw.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ouw.this.ouw.resume();
                    }
                });
                ScheduledFuture<?> scheduledFuture = this.vt;
                if (scheduledFuture != null) {
                    yu.this.f11355lh.remove(scheduledFuture);
                }
            }
        }
    }

    public abstract List<ObjectAnimator> ouw();

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fak
    public final void a_() {
        List<ObjectAnimator> list = this.ouw;
        if (list == null) {
            return;
        }
        for (ObjectAnimator objectAnimator : list) {
            objectAnimator.cancel();
            objectAnimator.removeAllUpdateListeners();
        }
        Iterator<ScheduledFuture<?>> it = this.f11355lh.iterator();
        while (it.hasNext()) {
            it.next().cancel(true);
        }
    }

    public final ObjectAnimator ouw(final ObjectAnimator objectAnimator) {
        objectAnimator.setStartDelay((long) (this.vt.f11465le * 1000.0d));
        int i10 = this.vt.f11467ra;
        if (i10 > 0) {
            objectAnimator.setRepeatCount(i10 - 1);
        } else {
            objectAnimator.setRepeatCount(-1);
        }
        if (!"normal".equals(this.vt.pno)) {
            if ("alternate".equals(this.vt.pno) || "alternate-reverse".equals(this.vt.pno)) {
                objectAnimator.setRepeatMode(2);
            } else {
                objectAnimator.setRepeatMode(1);
            }
        }
        if ("ease-in-out".equals(this.vt.fkw)) {
            objectAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        } else if ("ease-in".equals(this.vt.pno)) {
            objectAnimator.setInterpolator(new AccelerateInterpolator());
        } else if ("ease-out".equals(this.vt.pno)) {
            objectAnimator.setInterpolator(new DecelerateInterpolator());
        } else {
            objectAnimator.setInterpolator(new LinearInterpolator());
        }
        objectAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.ouw.yu.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (valueAnimator.getCurrentPlayTime() > 0) {
                    yu.this.yu.setVisibility(0);
                    if (yu.this.yu.getParent() instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le) {
                        ((View) yu.this.yu.getParent()).setVisibility(0);
                    }
                    objectAnimator.removeAllUpdateListeners();
                }
            }
        });
        return objectAnimator;
    }

    public yu(View view, com.bytedance.sdk.component.adexpress.dynamic.yu.ouw ouwVar) {
        this.yu = view;
        this.vt = ouwVar;
    }
}
