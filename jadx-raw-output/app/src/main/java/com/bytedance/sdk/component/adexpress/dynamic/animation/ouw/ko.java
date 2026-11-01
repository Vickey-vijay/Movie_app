package com.bytedance.sdk.component.adexpress.dynamic.animation.ouw;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class ko extends yu {
    public ko(View view, com.bytedance.sdk.component.adexpress.dynamic.yu.ouw ouwVar) {
        super(view, ouwVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.ouw.yu
    public final List<ObjectAnimator> ouw() {
        float f10;
        float fOuw = com.bytedance.sdk.component.adexpress.yu.ra.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), this.vt.mwh);
        float fOuw2 = com.bytedance.sdk.component.adexpress.yu.ra.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), this.vt.f11463jg);
        float f11 = 0.0f;
        if ("reverse".equals(this.vt.pno)) {
            f10 = fOuw2;
            fOuw2 = 0.0f;
            f11 = fOuw;
            fOuw = 0.0f;
        } else {
            f10 = 0.0f;
        }
        if (com.bytedance.sdk.component.adexpress.yu.vt.ouw(this.yu.getContext())) {
            fOuw = -fOuw;
            f11 = -f11;
        }
        this.yu.setTranslationX(fOuw);
        this.yu.setTranslationY(fOuw2);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.yu, "translationX", fOuw, f11).setDuration((int) (this.vt.vt * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.yu, "translationY", fOuw2, f10).setDuration((int) (this.vt.vt * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(ouw(duration));
        arrayList.add(ouw(duration2));
        return arrayList;
    }
}
