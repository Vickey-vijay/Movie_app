package com.bytedance.sdk.component.vt.ouw.ouw.ouw;

import android.text.TextUtils;
import com.bytedance.sdk.component.vt.ouw.cf;
import com.bytedance.sdk.component.vt.ouw.ryl;

/* JADX INFO: loaded from: classes11.dex */
public final class yu extends cf {
    public ouw bly;
    public le pno;

    @Override // com.bytedance.sdk.component.vt.ouw.cf
    public final com.bytedance.sdk.component.vt.ouw.yu ouw() {
        return this.pno;
    }

    @Override // com.bytedance.sdk.component.vt.ouw.cf
    public final com.bytedance.sdk.component.vt.ouw.vt ouw(ryl rylVar) {
        rylVar.ouw = this;
        if (rylVar.vt() == null) {
            return null;
        }
        rylVar.vt().ouw();
        if (TextUtils.isEmpty(rylVar.vt().ouw().toString())) {
            return null;
        }
        if (ouw.ouw != null && ouw.ouw.vt()) {
            if (((ouw.ouw == null || ouw.ouw.ouw() == null) ? false : true) && !"setting".equals(rylVar.le())) {
                vt vtVar = new vt(rylVar, this.bly);
                this.bly.vt.add(vtVar);
                return vtVar;
            }
        }
        vt vtVar2 = new vt(rylVar, this.pno);
        this.pno.vt.add(vtVar2);
        return vtVar2;
    }

    public yu(cf.ouw ouwVar) {
        super(ouwVar);
        le leVar = new le();
        this.pno = leVar;
        this.bly = new ouw(leVar.ouw);
    }
}
