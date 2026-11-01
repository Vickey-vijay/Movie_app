package com.bytedance.sdk.component.fkw.yu.vt;

import com.bytedance.sdk.component.fkw.th;
import com.bytedance.sdk.component.fkw.vm;
import com.bytedance.sdk.component.utils.ko;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class lh implements le {
    private static void ouw(com.bytedance.sdk.component.fkw.vt vtVar, com.bytedance.sdk.component.fkw.yu.lh.le leVar, String str, byte[] bArr) {
        if (vtVar == null || !vtVar.le()) {
            return;
        }
        leVar.vt(vtVar).ouw(str, bArr);
    }

    @Override // com.bytedance.sdk.component.fkw.yu.vt.le
    public final String ouw() {
        return "data_intercept";
    }

    @Override // com.bytedance.sdk.component.fkw.yu.vt.le
    public final boolean ouw(com.bytedance.sdk.component.fkw.yu.lh.lh lhVar, th thVar, com.bytedance.sdk.component.fkw.yu.lh.ouw ouwVar) {
        byte[] bArrOuw;
        byte[] bArrOuw2;
        com.bytedance.sdk.component.fkw.vt vtVar = lhVar.zin;
        com.bytedance.sdk.component.fkw.yu.lh.le leVar = lhVar.qbp;
        if (vtVar == null || leVar == null) {
            bArrOuw = null;
        } else {
            if (vtVar.le()) {
                if (thVar != null) {
                    thVar.ouw("data_cache", lhVar);
                }
                vm vmVarVt = leVar.vt(vtVar);
                bArrOuw = vmVarVt != null ? vmVarVt.ouw(lhVar.f11741lh) : null;
                if (thVar != null) {
                    thVar.ouw("data_cache");
                }
                Object[] objArr = new Object[6];
                objArr[0] = "step 4-1 Read memory-level data key is";
                objArr[1] = lhVar.f11741lh;
                objArr[2] = "url is ";
                objArr[3] = lhVar.ouw;
                objArr[4] = "imageData is null  ";
                objArr[5] = Boolean.valueOf(bArrOuw == null);
                ko.ouw("PagImageRequest", objArr);
            } else {
                bArrOuw = null;
            }
            if (vtVar.ra() && bArrOuw == null) {
                if (thVar != null) {
                    thVar.ouw("disk_cache", lhVar);
                }
                String str = lhVar.f11741lh;
                leVar.lh(vtVar);
                Collection<com.bytedance.sdk.component.fkw.lh> collectionOuw = leVar.ouw();
                if (collectionOuw == null) {
                    bArrOuw2 = null;
                    break;
                }
                Iterator<com.bytedance.sdk.component.fkw.lh> it = collectionOuw.iterator();
                do {
                    if (!it.hasNext()) {
                        bArrOuw2 = null;
                        break;
                    }
                    bArrOuw2 = it.next().ouw(str);
                } while (bArrOuw2 == null);
                if (bArrOuw2 != null) {
                    ouw(lhVar.zin, leVar, lhVar.f11741lh, bArrOuw2);
                }
                if (thVar != null) {
                    thVar.ouw("disk_cache");
                }
                Object[] objArr2 = new Object[6];
                objArr2[0] = "step 4-2 Read disk cache key is ";
                objArr2[1] = lhVar.f11741lh;
                objArr2[2] = "url is ";
                objArr2[3] = lhVar.ouw;
                objArr2[4] = "imageData is null  ";
                objArr2[5] = Boolean.valueOf(bArrOuw2 == null);
                ko.ouw("PagImageRequest", objArr2);
                bArrOuw = bArrOuw2;
            }
        }
        if (leVar != null && bArrOuw == null) {
            if (thVar != null) {
                thVar.ouw("net_request", lhVar);
            }
            byte[] bArrOuw3 = ouw(leVar, lhVar, ouwVar);
            Object[] objArr3 = new Object[6];
            objArr3[0] = "step 4-3 net request cache key is  ";
            objArr3[1] = lhVar.f11741lh;
            objArr3[2] = "url is ";
            objArr3[3] = lhVar.ouw;
            objArr3[4] = " imageData is null ";
            objArr3[5] = Boolean.valueOf(bArrOuw3 == null);
            ko.ouw("PagImageRequest", objArr3);
            if (thVar != null) {
                thVar.ouw("net_request");
            }
            bArrOuw = bArrOuw3;
        }
        if (bArrOuw == null) {
            Object[] objArr4 = new Object[6];
            objArr4[0] = "step 4-4 net fail cache key is  ";
            objArr4[1] = lhVar.f11741lh;
            objArr4[2] = "url is ";
            objArr4[3] = lhVar.ouw;
            objArr4[4] = " imageData is null ";
            objArr4[5] = Boolean.valueOf(bArrOuw == null);
            ko.ouw("PagImageRequest", objArr4);
            return false;
        }
        lhVar.f11745tc = bArrOuw;
        return true;
    }

    private byte[] ouw(final com.bytedance.sdk.component.fkw.yu.lh.le leVar, com.bytedance.sdk.component.fkw.yu.lh.lh lhVar, com.bytedance.sdk.component.fkw.yu.lh.ouw ouwVar) {
        if (leVar.yu == null) {
            com.bytedance.sdk.component.fkw.yu yuVarYu = leVar.vt.yu();
            if (yuVarYu == null) {
                yuVarYu = new com.bytedance.sdk.component.fkw.vt.ouw();
            }
            leVar.yu = yuVarYu;
        }
        com.bytedance.sdk.component.fkw.yu yuVar = leVar.yu;
        lhVar.zih = false;
        try {
            com.bytedance.sdk.component.fkw.le leVarOuw = yuVar.ouw(new com.bytedance.sdk.component.fkw.vt.vt(lhVar.ouw, false, false, lhVar.ex));
            if (leVarOuw == null) {
                ouwVar.ouw(1004, "call is empty", new Exception("call is empty"));
                return null;
            }
            int iVt = leVarOuw.vt();
            if (iVt == 200) {
                final byte[] bArr = (byte[]) leVarOuw.lh();
                if (bArr == null) {
                    ouwVar.ouw(iVt, leVarOuw.yu(), new Exception("net data is empty"));
                    return null;
                }
                ouw(lhVar.zin, leVar, lhVar.f11741lh, bArr);
                final com.bytedance.sdk.component.fkw.vt vtVar = lhVar.zin;
                final String str = lhVar.f11741lh;
                if (vtVar != null && vtVar.ra()) {
                    leVar.vt().submit(new Runnable() { // from class: com.bytedance.sdk.component.fkw.yu.vt.lh.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            leVar.lh(vtVar).ouw(str, bArr);
                        }
                    });
                }
                return bArr;
            }
            Object objLh = leVarOuw.lh();
            ouwVar.ouw(iVt, leVarOuw.yu(), objLh instanceof Throwable ? (Throwable) objLh : null);
            return null;
        } catch (Throwable th2) {
            ouwVar.ouw(1004, "net request failed!", th2);
            return null;
        }
    }
}
