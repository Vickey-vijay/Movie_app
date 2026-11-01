package com.bytedance.sdk.component.fkw.yu.lh;

import android.text.TextUtils;
import com.bytedance.sdk.component.fkw.ko;
import com.bytedance.sdk.component.fkw.tlj;
import com.bytedance.sdk.component.fkw.vm;
import com.bytedance.sdk.component.utils.rn;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class vt implements ko {
    public volatile le ouw;

    @Override // com.bytedance.sdk.component.fkw.ko
    public final tlj ouw(String str) {
        lh.vt vtVar = new lh.vt(this.ouw);
        vtVar.yu = str;
        return vtVar;
    }

    @Override // com.bytedance.sdk.component.fkw.ko
    public final InputStream ouw(String str, String str2) {
        byte[] bArrOuw;
        if (this.ouw != null) {
            if (TextUtils.isEmpty(str2)) {
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                str2 = rn.ouw(str);
            }
            vm vmVar = this.ouw.f11734lh;
            if (vmVar != null && (bArrOuw = vmVar.ouw(str2)) != null) {
                return new ByteArrayInputStream(bArrOuw);
            }
            Collection<com.bytedance.sdk.component.fkw.lh> collectionOuw = this.ouw.ouw();
            if (collectionOuw != null) {
                Iterator<com.bytedance.sdk.component.fkw.lh> it = collectionOuw.iterator();
                while (it.hasNext()) {
                    InputStream inputStreamOuw = it.next().ouw(str2);
                    if (inputStreamOuw != null) {
                        return inputStreamOuw;
                    }
                }
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.fkw.ko
    public final boolean ouw(String str, String str2, String str3) {
        if (this.ouw == null || TextUtils.isEmpty(str3)) {
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            str2 = rn.ouw(str);
        }
        com.bytedance.sdk.component.fkw.lh lhVarLh = this.ouw.lh(com.bytedance.sdk.component.fkw.yu.lh.ouw.vt.ouw(new File(str3)));
        if (lhVarLh != null) {
            return lhVarLh.vt(str2);
        }
        return false;
    }
}
