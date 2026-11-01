package com.bytedance.sdk.component.fkw.fkw;

/* JADX INFO: loaded from: classes11.dex */
public final class ryl extends ouw {
    @Override // com.bytedance.sdk.component.fkw.fkw.bly
    public final String ouw() {
        return "raw_cache";
    }

    @Override // com.bytedance.sdk.component.fkw.fkw.bly
    public final void ouw(com.bytedance.sdk.component.fkw.lh.lh lhVar) {
        byte[] bArrOuw = lhVar.jqy.ouw(lhVar.f11683tc).ouw(lhVar.f11678lh);
        if (bArrOuw == null) {
            lhVar.ouw(new le());
        } else {
            lhVar.ouw(new vt(bArrOuw, null));
        }
    }
}
