package com.bytedance.sdk.openadsdk.tlj;

import android.content.Context;
import android.util.Log;
import com.bytedance.sdk.component.fkw.ko;
import com.bytedance.sdk.component.fkw.qbp;
import com.bytedance.sdk.component.fkw.zin;
import com.bytedance.sdk.component.utils.tlj;
import com.bytedance.sdk.component.vt.ouw.cf;
import com.bytedance.sdk.component.vt.ouw.jg;
import com.bytedance.sdk.component.vt.ouw.le;
import com.bytedance.sdk.component.vt.ouw.mwh;
import com.bytedance.sdk.component.vt.ouw.ryl;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.fvf;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes5.dex */
public final class yu {

    public static final class ouw {
        private static int fkw;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        private static int f13366lh;
        public static boolean ouw;
        private static final ko vt;
        private static int yu;

        /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.tlj.yu$ouw$ouw, reason: collision with other inner class name */
        public static class C0152ouw implements com.bytedance.sdk.component.fkw.yu {
            private C0152ouw() {
            }

            public /* synthetic */ C0152ouw(byte b10) {
                this();
            }

            private static com.bytedance.sdk.component.fkw.vt.lh vt(com.bytedance.sdk.component.fkw.fkw fkwVar) {
                com.bytedance.sdk.component.fkw.vt.yu yuVar;
                cf cfVar = com.bytedance.sdk.openadsdk.th.vt.ouw().ouw.vt;
                jg jgVar = null;
                HashMap map = null;
                ryl rylVarOuw = new ryl.ouw().ouw(fkwVar.ouw()).ouw("GET", (mwh) null).ouw();
                if (fkwVar.lh()) {
                    yuVar = new com.bytedance.sdk.component.fkw.vt.yu();
                } else {
                    yuVar = null;
                }
                if (yuVar != null) {
                    yuVar.ouw = System.currentTimeMillis();
                }
                try {
                    jg jgVarVt = cfVar.ouw(rylVarOuw).vt();
                    if (yuVar != null) {
                        try {
                            yuVar.vt = System.currentTimeMillis();
                        } catch (Throwable th2) {
                            th = th2;
                            jgVar = jgVarVt;
                            try {
                                com.bytedance.sdk.component.utils.ko.yu("ImageLoaderWrapper", th.getMessage());
                                if (yuVar != null) {
                                    yuVar.f11726lh = System.currentTimeMillis();
                                }
                                com.bytedance.sdk.component.fkw.vt.lh lhVar = new com.bytedance.sdk.component.fkw.vt.lh(98765, th, "net failed");
                                lhVar.vt = yuVar;
                                return lhVar;
                            } finally {
                                tlj.ouw(jgVar);
                            }
                        }
                    }
                    if (fkwVar.vt()) {
                        le leVarFkw = jgVarVt.fkw();
                        map = new HashMap();
                        int length = leVarFkw.ouw.length / 2;
                        for (int i10 = 0; i10 < length; i10++) {
                            String strOuw = leVarFkw.ouw(i10);
                            String strVt = leVarFkw.vt(i10);
                            if (strOuw != null) {
                                map.put(strOuw, strVt);
                            }
                        }
                    }
                    com.bytedance.sdk.component.fkw.vt.lh lhVar2 = new com.bytedance.sdk.component.fkw.vt.lh(jgVarVt.ouw(), jgVarVt.yu().yu(), "", map);
                    tlj.ouw(jgVarVt);
                    return lhVar2;
                } catch (Throwable th3) {
                    th = th3;
                }
            }

            @Override // com.bytedance.sdk.component.fkw.yu
            public final /* synthetic */ com.bytedance.sdk.component.fkw.le ouw(com.bytedance.sdk.component.fkw.fkw fkwVar) {
                return vt(fkwVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static com.bytedance.sdk.component.fkw.tlj ouw(com.bytedance.sdk.component.fkw.tlj tljVar) {
            return fvf.ouw() ? tljVar.ouw(new fkw()) : tljVar;
        }

        static {
            boolean z10;
            ko koVar;
            Context contextOuw = zih.ouw();
            byte b10 = 0;
            if (com.bytedance.sdk.openadsdk.vpp.ouw.ouw("image_config", "use_new_img", 1) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            ouw = z10;
            f13366lh = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("image_config", "bitmap_cache_count", 10);
            yu = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("image_config", "data_cache_count", 15);
            int iOuw = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("image_config", "disk_cache_count", 30);
            fkw = iOuw;
            if (ouw) {
                com.bytedance.sdk.component.fkw.yu.lh.ouw.vt vtVar = new com.bytedance.sdk.component.fkw.yu.lh.ouw.vt(f13366lh, yu, iOuw, new File(CacheDirFactory.getImageCacheDir("image_p")));
                com.bytedance.sdk.component.fkw.yu.lh.fkw.ouw ouwVar = new com.bytedance.sdk.component.fkw.yu.lh.fkw.ouw();
                ouwVar.f11732ra = vtVar;
                ouwVar.tlj = com.bytedance.sdk.openadsdk.multipro.vt.lh();
                ouwVar.pno = new qbp() { // from class: com.bytedance.sdk.openadsdk.tlj.yu.ouw.2
                    @Override // com.bytedance.sdk.component.fkw.qbp
                    public final ExecutorService ouw() {
                        return bs.vt();
                    }

                    @Override // com.bytedance.sdk.component.fkw.qbp
                    public final ExecutorService vt() {
                        return bs.lh();
                    }
                };
                ouwVar.bly = new zin() { // from class: com.bytedance.sdk.openadsdk.tlj.yu.ouw.1
                    @Override // com.bytedance.sdk.component.fkw.zin
                    public final void ouw(String str) {
                        com.bytedance.sdk.openadsdk.rn.lh.ouw(str, true);
                    }
                };
                ouwVar.f11731lh = new C0152ouw(b10);
                com.bytedance.sdk.component.fkw.yu.lh.fkw fkwVar = new com.bytedance.sdk.component.fkw.yu.lh.fkw(ouwVar, b10);
                com.bytedance.sdk.component.fkw.yu.lh.vt vtVar2 = new com.bytedance.sdk.component.fkw.yu.lh.vt();
                if (vtVar2.ouw != null) {
                    Log.w("ImageLoader", "already init!");
                }
                vtVar2.ouw = new com.bytedance.sdk.component.fkw.yu.lh.le(contextOuw, fkwVar);
                koVar = vtVar2;
            } else {
                com.bytedance.sdk.component.fkw.lh.ouw.ouw ouwVar2 = new com.bytedance.sdk.component.fkw.lh.ouw.ouw(Math.max(Math.min(Long.valueOf(Runtime.getRuntime().maxMemory()).intValue() / 16, 83886080), 10485760), 41943040L, new File(CacheDirFactory.getImageCacheDir("image")));
                com.bytedance.sdk.component.fkw.lh.fkw.ouw ouwVar3 = new com.bytedance.sdk.component.fkw.lh.fkw.ouw();
                ouwVar3.f11669ra = ouwVar2;
                ouwVar3.tlj = com.bytedance.sdk.openadsdk.multipro.vt.lh();
                ouwVar3.pno = new qbp() { // from class: com.bytedance.sdk.openadsdk.tlj.yu.ouw.4
                    @Override // com.bytedance.sdk.component.fkw.qbp
                    public final ExecutorService vt() {
                        return null;
                    }

                    @Override // com.bytedance.sdk.component.fkw.qbp
                    public final ExecutorService ouw() {
                        return bs.vt();
                    }
                };
                ouwVar3.bly = new zin() { // from class: com.bytedance.sdk.openadsdk.tlj.yu.ouw.3
                    @Override // com.bytedance.sdk.component.fkw.zin
                    public final void ouw(String str) {
                        com.bytedance.sdk.openadsdk.rn.lh.ouw(str, false);
                    }
                };
                ouwVar3.f11668lh = new C0152ouw(b10);
                com.bytedance.sdk.component.fkw.lh.fkw fkwVar2 = new com.bytedance.sdk.component.fkw.lh.fkw(ouwVar3, b10);
                com.bytedance.sdk.component.fkw.lh.vt vtVar3 = new com.bytedance.sdk.component.fkw.lh.vt();
                if (vtVar3.ouw != null) {
                    Log.w("ImageLoader", "already init!");
                }
                vtVar3.ouw = new com.bytedance.sdk.component.fkw.lh.le(contextOuw, fkwVar2);
                koVar = vtVar3;
            }
            vt = koVar;
            ouw = true;
            f13366lh = 10;
            yu = 15;
            fkw = 30;
        }
    }
}
