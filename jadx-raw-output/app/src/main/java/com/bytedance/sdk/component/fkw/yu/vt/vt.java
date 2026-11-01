package com.bytedance.sdk.component.fkw.yu.vt;

import android.text.TextUtils;
import com.bytedance.sdk.component.fkw.th;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.rn;

/* JADX INFO: loaded from: classes2.dex */
public final class vt implements le {
    @Override // com.bytedance.sdk.component.fkw.yu.vt.le
    public final String ouw() {
        return "generate_key";
    }

    @Override // com.bytedance.sdk.component.fkw.yu.vt.le
    public final boolean ouw(com.bytedance.sdk.component.fkw.yu.lh.lh lhVar, th thVar, com.bytedance.sdk.component.fkw.yu.lh.ouw ouwVar) {
        String strOuw = lhVar.vt;
        if (TextUtils.isEmpty(strOuw)) {
            strOuw = rn.ouw(lhVar.ouw);
            lhVar.ouw(strOuw);
            lhVar.f11741lh = strOuw;
        }
        ko.vt("PagImageRequest", "step 1 generate  key is " + strOuw + " url is " + lhVar.ouw);
        return true;
    }
}
