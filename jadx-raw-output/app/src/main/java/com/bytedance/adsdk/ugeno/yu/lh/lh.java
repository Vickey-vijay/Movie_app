package com.bytedance.adsdk.ugeno.yu.lh;

import com.bytedance.adsdk.ugeno.yu.le;

/* JADX INFO: loaded from: classes10.dex */
public final class lh extends com.bytedance.adsdk.ugeno.yu.vt.ouw {
    @Override // com.bytedance.adsdk.ugeno.yu.vt.ouw
    public final void ouw() {
        com.bytedance.adsdk.ugeno.vt.lh lhVarVt;
        com.bytedance.adsdk.ugeno.vt.lh lhVar = this.f11058lh;
        if (lhVar == null || (lhVarVt = com.bytedance.adsdk.ugeno.vt.lh.vt(lhVar)) == null) {
            return;
        }
        com.bytedance.adsdk.ugeno.vt.lh lhVarLe = lhVarVt.le("SwiperView");
        if (lhVarLe instanceof com.bytedance.adsdk.ugeno.vt) {
            com.bytedance.adsdk.ugeno.vt vtVar = (com.bytedance.adsdk.ugeno.vt) lhVarLe;
            ((com.bytedance.adsdk.ugeno.le.vt) vtVar.fkw).cf(((com.bytedance.adsdk.ugeno.le.vt) vtVar.fkw).getCurrentItem() - 1);
        }
    }

    public lh(com.bytedance.adsdk.ugeno.vt.lh lhVar, String str, le.ouw ouwVar) {
        super(lhVar, str, ouwVar);
    }
}
