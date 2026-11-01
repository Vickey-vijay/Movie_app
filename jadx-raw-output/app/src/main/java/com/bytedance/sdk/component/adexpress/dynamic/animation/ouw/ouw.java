package com.bytedance.sdk.component.adexpress.dynamic.animation.ouw;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class ouw extends yu {
    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.ouw.yu
    public final List<ObjectAnimator> ouw() {
        com.bytedance.sdk.component.adexpress.dynamic.yu.ouw ouwVar = this.vt;
        float f10 = ouwVar.zih / 100.0f;
        float f11 = ouwVar.f11470vm / 100.0f;
        if ("reverse".equals(ouwVar.pno) && this.vt.f11465le <= 0.0d) {
            f11 = f10;
            f10 = f11;
        }
        this.yu.setAlpha(f10);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.yu, "alpha", f10, f11).setDuration((int) (this.vt.vt * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(ouw(duration));
        return arrayList;
    }

    public ouw(View view, com.bytedance.sdk.component.adexpress.dynamic.yu.ouw ouwVar) {
        super(view, ouwVar);
    }
}
