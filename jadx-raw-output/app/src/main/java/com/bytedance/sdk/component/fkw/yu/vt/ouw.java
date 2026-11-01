package com.bytedance.sdk.component.fkw.yu.vt;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.fkw.th;
import com.bytedance.sdk.component.utils.ko;

/* JADX INFO: loaded from: classes5.dex */
public final class ouw<T> implements le {
    @Override // com.bytedance.sdk.component.fkw.yu.vt.le
    public final String ouw() {
        return "bitmap_cache";
    }

    @Override // com.bytedance.sdk.component.fkw.yu.vt.le
    public final boolean ouw(com.bytedance.sdk.component.fkw.yu.lh.lh lhVar, th thVar, com.bytedance.sdk.component.fkw.yu.lh.ouw ouwVar) {
        Bitmap bitmapOuw;
        String str = lhVar.vt;
        ko.vt("PagImageRequest", "step 3 look  bitmap cache image key is " + str + " url is " + lhVar.ouw);
        com.bytedance.sdk.component.fkw.vt vtVar = lhVar.zin;
        com.bytedance.sdk.component.fkw.yu.lh.le leVar = lhVar.qbp;
        if (vtVar != null && leVar != null && vtVar.fkw()) {
            int i10 = lhVar.tlj;
            if ((i10 == 1 || i10 == 2) && (bitmapOuw = leVar.ouw(vtVar).ouw(str)) != null) {
                ko.vt("PagImageRequest", "step 3-1 hit bitmap cache image key is " + str + " url is " + lhVar.ouw);
                ouwVar.ouw(new com.bytedance.sdk.component.fkw.yu.lh.yu().ouw(lhVar, bitmapOuw, null, false));
                return false;
            }
        }
        return true;
    }
}
