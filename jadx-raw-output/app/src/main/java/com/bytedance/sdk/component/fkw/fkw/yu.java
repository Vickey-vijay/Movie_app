package com.bytedance.sdk.component.fkw.fkw;

/* JADX INFO: loaded from: classes11.dex */
public final class yu extends ouw {
    @Override // com.bytedance.sdk.component.fkw.fkw.bly
    public final String ouw() {
        return "cache_policy";
    }

    @Override // com.bytedance.sdk.component.fkw.fkw.bly
    public final void ouw(com.bytedance.sdk.component.fkw.lh.lh lhVar) {
        com.bytedance.sdk.component.fkw.vt vtVar = lhVar.f11683tc;
        if (vtVar != null) {
            if (vtVar.fkw()) {
                lhVar.ouw(new tlj());
                return;
            } else if (vtVar.ra()) {
                lhVar.ouw(new le());
                return;
            }
        }
        lhVar.ouw(new cf());
    }
}
