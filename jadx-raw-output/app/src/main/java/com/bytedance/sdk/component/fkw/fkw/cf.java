package com.bytedance.sdk.component.fkw.fkw;

import com.bytedance.sdk.component.utils.ko;

/* JADX INFO: loaded from: classes6.dex */
public final class cf extends ouw {
    private static void ouw(int i10, String str, Throwable th2, com.bytedance.sdk.component.fkw.lh.lh lhVar) {
        lhVar.ouw(new pno(i10, str, th2));
    }

    @Override // com.bytedance.sdk.component.fkw.fkw.bly
    public final String ouw() {
        return "net_request";
    }

    @Override // com.bytedance.sdk.component.fkw.fkw.bly
    public final void ouw(final com.bytedance.sdk.component.fkw.lh.lh lhVar) {
        final com.bytedance.sdk.component.fkw.lh.le leVar = lhVar.jqy;
        if (leVar.fkw == null) {
            com.bytedance.sdk.component.fkw.yu yuVarYu = leVar.vt.yu();
            if (yuVarYu == null) {
                yuVarYu = new com.bytedance.sdk.component.fkw.vt.ouw();
            }
            leVar.fkw = yuVarYu;
        }
        com.bytedance.sdk.component.fkw.yu yuVar = leVar.fkw;
        lhVar.qbp = false;
        try {
            com.bytedance.sdk.component.fkw.le leVarOuw = yuVar.ouw(new com.bytedance.sdk.component.fkw.vt.vt(lhVar.ouw, lhVar.mwh, lhVar.f11675jg, lhVar.f11673cd));
            int iVt = leVarOuw.vt();
            lhVar.zin = leVarOuw.ouw();
            if (leVarOuw.vt() != 200) {
                ko.lh(String.valueOf(leVarOuw));
                Object objLh = leVarOuw.lh();
                ouw(iVt, leVarOuw.yu(), objLh instanceof Throwable ? (Throwable) objLh : null, lhVar);
                return;
            }
            final byte[] bArr = (byte[]) leVarOuw.lh();
            lhVar.ouw(new vt(bArr, leVarOuw));
            final String str = lhVar.f11678lh;
            final com.bytedance.sdk.component.fkw.vt vtVar = lhVar.f11683tc;
            if (vtVar.fkw()) {
                leVar.ouw(lhVar.f11683tc).ouw(str, bArr);
            }
            leVar.vt().submit(new Runnable() { // from class: com.bytedance.sdk.component.fkw.fkw.cf.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (vtVar.ra()) {
                        leVar.vt(lhVar.f11683tc).ouw(str, bArr);
                    }
                }
            });
        } catch (Throwable th2) {
            ouw(1004, "net request failed!", th2, lhVar);
        }
    }
}
