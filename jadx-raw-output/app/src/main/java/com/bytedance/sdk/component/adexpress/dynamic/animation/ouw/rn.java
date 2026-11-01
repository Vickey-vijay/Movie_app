package com.bytedance.sdk.component.adexpress.dynamic.animation.ouw;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class rn extends yu {
    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.ouw.yu
    public final List<ObjectAnimator> ouw() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.yu, "translationX", 0.0f, com.bytedance.sdk.component.adexpress.yu.ra.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), 20.0f), 0.0f, -com.bytedance.sdk.component.adexpress.yu.ra.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), 20.0f), 0.0f).setDuration((int) (this.vt.vt * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(ouw(duration));
        return arrayList;
    }

    public rn(View view, com.bytedance.sdk.component.adexpress.dynamic.yu.ouw ouwVar) {
        super(view, ouwVar);
    }
}
