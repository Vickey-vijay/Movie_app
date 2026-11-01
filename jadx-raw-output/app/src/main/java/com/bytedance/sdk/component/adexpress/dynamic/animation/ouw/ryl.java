package com.bytedance.sdk.component.adexpress.dynamic.animation.ouw;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ryl extends yu {
    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.ouw.yu
    @SuppressLint({"ObjectAnimatorBinding"})
    public final List<ObjectAnimator> ouw() {
        int i10;
        int i11;
        this.yu.setTag(2097610711, Integer.valueOf(this.vt.f11462cf));
        View view = this.yu;
        if (view == null || !com.bytedance.sdk.component.adexpress.yu.vt.ouw(view.getContext())) {
            i10 = 1;
            i11 = 0;
        } else {
            i11 = 1;
            i10 = 0;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.yu, "shineValue", i11, i10).setDuration((int) (this.vt.vt * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(ouw(duration));
        return arrayList;
    }

    public ryl(View view, com.bytedance.sdk.component.adexpress.dynamic.yu.ouw ouwVar) {
        super(view, ouwVar);
    }
}
