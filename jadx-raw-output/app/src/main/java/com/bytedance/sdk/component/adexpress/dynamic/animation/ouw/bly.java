package com.bytedance.sdk.component.adexpress.dynamic.animation.ouw;

import android.animation.ObjectAnimator;
import android.view.View;
import androidx.constraintlayout.motion.widget.Key;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class bly extends yu {
    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.ouw.yu
    public final List<ObjectAnimator> ouw() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.yu, Key.ROTATION, 0.0f, 360.0f).setDuration((int) (this.vt.vt * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(ouw(duration));
        return arrayList;
    }

    public bly(View view, com.bytedance.sdk.component.adexpress.dynamic.yu.ouw ouwVar) {
        super(view, ouwVar);
    }
}
