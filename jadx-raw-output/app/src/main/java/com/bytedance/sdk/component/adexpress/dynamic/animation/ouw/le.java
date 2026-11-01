package com.bytedance.sdk.component.adexpress.dynamic.animation.ouw;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class le extends yu {
    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.ouw.yu
    public final List<ObjectAnimator> ouw() {
        float f10 = this.yu.getLayoutParams().width;
        this.yu.setTranslationX(f10);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.yu, "translationX", f10, 0.0f).setDuration((int) (this.vt.vt * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.yu, "alpha", 0.0f, 1.0f).setDuration((int) (this.vt.vt * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(ouw(duration));
        arrayList.add(ouw(duration2));
        return arrayList;
    }

    public le(View view, com.bytedance.sdk.component.adexpress.dynamic.yu.ouw ouwVar) {
        super(view, ouwVar);
    }
}
