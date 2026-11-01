package com.bytedance.sdk.component.fkw.fkw;

import android.text.TextUtils;
import com.bytedance.sdk.component.fkw.bly;
import com.bytedance.sdk.component.utils.rn;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class lh extends ouw {
    @Override // com.bytedance.sdk.component.fkw.fkw.bly
    public final String ouw() {
        return "generate_key";
    }

    @Override // com.bytedance.sdk.component.fkw.fkw.bly
    public final void ouw(com.bytedance.sdk.component.fkw.lh.lh lhVar) {
        if (TextUtils.isEmpty(lhVar.vt)) {
            com.bytedance.sdk.component.fkw.lh.le leVar = lhVar.jqy;
            if (leVar.f11670le == null) {
                com.bytedance.sdk.component.fkw.ryl rylVarOuw = leVar.vt.ouw();
                if (rylVarOuw == null) {
                    rylVarOuw = new com.bytedance.sdk.component.fkw.ryl() { // from class: com.bytedance.sdk.component.fkw.ouw.vt.1
                        private WeakHashMap<String, String> ouw = new WeakHashMap<>();

                        @Override // com.bytedance.sdk.component.fkw.ryl
                        public final String ouw(bly blyVar) {
                            return ouw(blyVar.ouw() + "#width=" + blyVar.vt() + "#height=" + blyVar.lh() + "#scaletype=" + blyVar.yu() + "#bitmapConfig=" + blyVar.fkw());
                        }

                        @Override // com.bytedance.sdk.component.fkw.ryl
                        public final String vt(bly blyVar) {
                            return ouw(blyVar.ouw());
                        }

                        private String ouw(String str) {
                            String str2 = this.ouw.get(str);
                            if (str2 != null) {
                                return str2;
                            }
                            String strOuw = rn.ouw(str);
                            this.ouw.put(str, strOuw);
                            return strOuw;
                        }
                    };
                }
                leVar.f11670le = rylVarOuw;
            }
            com.bytedance.sdk.component.fkw.ryl rylVar = leVar.f11670le;
            lhVar.ouw(rylVar.ouw(lhVar));
            lhVar.f11678lh = rylVar.vt(lhVar);
        }
        lhVar.ouw(new ra());
    }
}
