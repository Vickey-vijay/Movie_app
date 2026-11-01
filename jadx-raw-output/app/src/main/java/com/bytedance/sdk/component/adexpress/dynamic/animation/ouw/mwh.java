package com.bytedance.sdk.component.adexpress.dynamic.animation.ouw;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class mwh extends yu {
    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.ouw.yu
    public final List<ObjectAnimator> ouw() {
        View view = this.yu;
        if ((view instanceof ImageView) && (view.getParent() instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.cf)) {
            View view2 = (View) this.yu.getParent();
            this.yu = view2;
            ((ViewGroup) view2).setClipChildren(true);
            ((ViewGroup) this.yu.getParent()).setClipChildren(true);
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.yu, "stretchValue", 0.0f, 1.0f).setDuration((int) (this.vt.vt * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(ouw(duration));
        return arrayList;
    }

    public mwh(View view, com.bytedance.sdk.component.adexpress.dynamic.yu.ouw ouwVar) {
        super(view, ouwVar);
    }
}
