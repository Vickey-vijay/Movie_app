package com.bytedance.sdk.component.adexpress.dynamic.animation.ouw;

import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fak;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class vt implements fak {
    public List<yu> ouw = new ArrayList();

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fak
    public final void a_() {
        Iterator<yu> it = this.ouw.iterator();
        while (it.hasNext()) {
            try {
                it.next().a_();
            } catch (Exception unused) {
            }
        }
    }

    public vt(View view, List<com.bytedance.sdk.component.adexpress.dynamic.yu.ouw> list) {
        for (com.bytedance.sdk.component.adexpress.dynamic.yu.ouw ouwVar : list) {
            lh.ouw();
            yu yuVarOuw = lh.ouw(view, ouwVar);
            if (yuVarOuw != null) {
                this.ouw.add(yuVarOuw);
            }
        }
    }
}
