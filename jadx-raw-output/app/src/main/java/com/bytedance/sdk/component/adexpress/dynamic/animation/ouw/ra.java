package com.bytedance.sdk.component.adexpress.dynamic.animation.ouw;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ra extends yu {
    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.ouw.yu
    @SuppressLint({"ObjectAnimatorBinding"})
    public final List<ObjectAnimator> ouw() {
        this.yu.setTag(2097610709, Integer.valueOf(this.vt.tlj));
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.yu, "marqueeValue", 0.0f, 1.0f).setDuration((int) (this.vt.vt * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(ouw(duration));
        return arrayList;
    }

    public ra(View view, com.bytedance.sdk.component.adexpress.dynamic.yu.ouw ouwVar) {
        super(view, ouwVar);
    }
}
