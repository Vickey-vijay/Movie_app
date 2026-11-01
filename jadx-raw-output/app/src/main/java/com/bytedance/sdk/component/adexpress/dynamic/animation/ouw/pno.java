package com.bytedance.sdk.component.adexpress.dynamic.animation.ouw;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class pno extends yu {
    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.ouw.yu
    @SuppressLint({"ObjectAnimatorBinding"})
    public final List<ObjectAnimator> ouw() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.yu, "rippleValue", 0.0f, 1.0f).setDuration((int) (this.vt.vt * 1000.0d));
        ((ViewGroup) this.yu.getParent()).setClipChildren(false);
        ((ViewGroup) this.yu.getParent().getParent()).setClipChildren(false);
        ((ViewGroup) this.yu.getParent().getParent().getParent()).setClipChildren(false);
        this.yu.setTag(2097610712, this.vt.f11464ko);
        ArrayList arrayList = new ArrayList();
        arrayList.add(ouw(duration));
        return arrayList;
    }

    public pno(View view, com.bytedance.sdk.component.adexpress.dynamic.yu.ouw ouwVar) {
        super(view, ouwVar);
    }
}
