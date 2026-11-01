package com.bytedance.sdk.component.fkw.fkw;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.fkw.zih;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class tlj extends ouw {
    @Override // com.bytedance.sdk.component.fkw.fkw.bly
    public final String ouw() {
        return "memory_cache";
    }

    @Override // com.bytedance.sdk.component.fkw.fkw.bly
    public final void ouw(com.bytedance.sdk.component.fkw.lh.lh lhVar) {
        Collection<zih> collectionValues;
        Bitmap bitmapOuw;
        int i10 = lhVar.tlj;
        if ((i10 == 2 || i10 == 1) && (collectionValues = lhVar.jqy.f11671lh.values()) != null) {
            Iterator<zih> it = collectionValues.iterator();
            bitmapOuw = null;
            while (it.hasNext() && (bitmapOuw = it.next().ouw(lhVar.vt)) == null) {
            }
        } else {
            bitmapOuw = null;
        }
        if (bitmapOuw == null) {
            lhVar.ouw(new ryl());
        } else {
            lhVar.ouw(new mwh(bitmapOuw, null, false));
        }
    }
}
