package com.bytedance.sdk.component.adexpress.dynamic.animation.ouw;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class cf extends yu {
    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.ouw.yu
    public final List<ObjectAnimator> ouw() {
        float f10;
        com.bytedance.sdk.component.adexpress.dynamic.yu.ouw ouwVar = this.vt;
        float f11 = (float) ouwVar.f11466lh;
        float f12 = (float) ouwVar.yu;
        String str = ouwVar.pno;
        float f13 = 1.0f;
        if ("reverse".equals(str) || "alternate-reverse".equals(str)) {
            f10 = 1.0f;
        } else {
            f10 = f12;
            f12 = 1.0f;
            f13 = f11;
            f11 = 1.0f;
        }
        this.yu.setTag(2097610710, this.vt.f11468rn);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.yu, "scaleX", f11, f13).setDuration((int) (this.vt.vt * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.yu, "scaleY", f12, f10).setDuration((int) (this.vt.vt * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(ouw(duration));
        arrayList.add(ouw(duration2));
        return arrayList;
    }

    public cf(View view, com.bytedance.sdk.component.adexpress.dynamic.yu.ouw ouwVar) {
        super(view, ouwVar);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
            if (viewGroup2 != null && (viewGroup2 instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw)) {
                viewGroup2.setClipChildren(false);
                viewGroup2.setClipToPadding(false);
                ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
                if (viewGroup3 != null && (viewGroup3 instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw)) {
                    viewGroup3.setClipChildren(false);
                    viewGroup3.setClipToPadding(false);
                }
            }
        }
    }
}
