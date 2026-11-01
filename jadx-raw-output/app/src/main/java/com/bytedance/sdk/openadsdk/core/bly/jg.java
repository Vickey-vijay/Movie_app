package com.bytedance.sdk.openadsdk.core.bly;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.pd;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.osn;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes9.dex */
public final class jg {
    public static void ouw(final com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        bs.vt(new com.bytedance.sdk.component.pno.pno("preloadStaticRes") { // from class: com.bytedance.sdk.openadsdk.core.bly.jg.1
            @Override // java.lang.Runnable
            public final void run() {
                pd pdVar;
                pd.ouw ouwVar;
                com.bytedance.sdk.openadsdk.core.model.vpp vppVar2 = vppVar;
                if (vppVar2 == null || (pdVar = vppVar2.lht) == null || (ouwVar = pdVar.f12796le) == null) {
                    return;
                }
                String strTlj = com.bytedance.sdk.openadsdk.core.settings.cf.vt().tlj();
                JSONArray jSONArray = ouwVar.ouw;
                com.bytedance.sdk.openadsdk.core.model.vpp vppVar3 = vppVar;
                if (jSONArray != null && jSONArray.length() > 0) {
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        String strOptString = jSONArray.optString(i10);
                        if (!TextUtils.isEmpty(strOptString)) {
                            String strOuw = com.bytedance.sdk.openadsdk.core.cf.lh.ouw(strOptString, strTlj);
                            String strOuw2 = com.bytedance.sdk.component.utils.fkw.ouw(strOuw);
                            InputStream inputStreamOuw = com.bytedance.sdk.openadsdk.tlj.yu.ouw.vt.ouw(strOuw, strOuw2);
                            if (inputStreamOuw != null) {
                                com.bytedance.sdk.component.utils.ko.lh("ExpressStaticResPreload", "preloadImage: hit cache url=".concat(String.valueOf(strOuw)));
                                try {
                                    inputStreamOuw.close();
                                } catch (IOException e10) {
                                    com.bytedance.sdk.component.utils.ko.lh("ExpressStaticResPreload", "preloadImage: close stream error", e10);
                                }
                            } else {
                                com.bytedance.sdk.openadsdk.tlj.yu.ouw.ouw(com.bytedance.sdk.openadsdk.tlj.yu.ouw.vt.ouw(strOuw).fkw(osn.le(com.bytedance.sdk.openadsdk.core.zih.ouw())).yu(osn.yu(com.bytedance.sdk.openadsdk.core.zih.ouw()))).lh(1).ouw(strOuw2).ouw(new com.bytedance.sdk.openadsdk.tlj.vt(vppVar3, strOuw, new com.bytedance.sdk.component.fkw.rn() { // from class: com.bytedance.sdk.openadsdk.core.bly.jg.2
                                    @Override // com.bytedance.sdk.component.fkw.rn
                                    public final void ouw(com.bytedance.sdk.component.fkw.cf cfVar) {
                                        com.bytedance.sdk.component.utils.ko.lh("ExpressStaticResPreload", "loadImgAndReport: success url=" + cfVar.ouw());
                                    }

                                    @Override // com.bytedance.sdk.component.fkw.rn
                                    public final void ouw(int i11, String str, @Nullable Throwable th2) {
                                        com.bytedance.sdk.component.utils.ko.lh("ExpressStaticResPreload", "loadImgAndReport: fail code=" + i11 + "; msg=" + str);
                                    }
                                }));
                            }
                        }
                    }
                }
                JSONArray jSONArray2 = ouwVar.vt;
                if (jSONArray2 != null && jSONArray2.length() > 0) {
                    for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                        String strOptString2 = jSONArray2.optString(i11);
                        if (!TextUtils.isEmpty(strOptString2)) {
                            String strOuw3 = com.bytedance.sdk.openadsdk.core.cf.lh.ouw(strOptString2, strTlj);
                            File fileVt = jg.vt(strOuw3);
                            if (fileVt != null && fileVt.exists() && fileVt.length() > 0) {
                                break;
                            } else {
                                jg.ouw(strOuw3);
                            }
                        }
                    }
                }
                JSONArray jSONArray3 = ouwVar.f12798lh;
                if (jSONArray3 == null || jSONArray3.length() <= 0) {
                    return;
                }
                for (int i12 = 0; i12 < jSONArray3.length(); i12++) {
                    String strOptString3 = jSONArray3.optString(i12);
                    if (!TextUtils.isEmpty(strOptString3)) {
                        String strOuw4 = com.bytedance.sdk.openadsdk.core.cf.lh.ouw(strOptString3, strTlj);
                        File fileVt2 = jg.vt(strOuw4);
                        if (fileVt2 != null && fileVt2.exists() && fileVt2.length() > 0) {
                            return;
                        } else {
                            jg.ouw(strOuw4);
                        }
                    }
                }
            }
        });
    }

    public static File vt(String str) {
        String str2;
        String strOuw = com.bytedance.sdk.component.utils.fkw.ouw(str);
        if (strOuw == null) {
            return null;
        }
        String name = new File(CacheDirFactory.getRootDir()).getName();
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            str2 = name + "/express_static_res/";
        } else {
            str2 = name + "/express_static_res/";
        }
        com.bytedance.sdk.component.utils.ko.ouw("ExpressStaticResPreload", "cachePath is:", str2, ", fileName is:", strOuw);
        return com.bytedance.sdk.component.utils.ra.ouw(com.bytedance.sdk.openadsdk.core.zih.ouw(), com.bytedance.sdk.openadsdk.multipro.vt.lh(), str2, strOuw);
    }

    public static void ouw(String str) {
        File file;
        File fileVt = vt(str);
        if (fileVt == null) {
            return;
        }
        File file2 = new File(fileVt + ".tmp");
        com.bytedance.sdk.component.ra.vt.ouw ouwVarLh = com.bytedance.sdk.openadsdk.th.vt.ouw().ouw.lh();
        ouwVarLh.f11911ra = 8;
        ouwVarLh.f11910le = "preloadStaticRes";
        ouwVarLh.ouw(str);
        ouwVarLh.ouw(fileVt.getParent(), fileVt.getName());
        com.bytedance.sdk.component.ra.vt vtVarOuw = ouwVarLh.ouw();
        if (vtVarOuw != null && vtVarOuw.pno && (file = vtVarOuw.f11909ra) != null && file.exists()) {
            com.bytedance.sdk.component.utils.qbp.ouw("ExpressStaticResPreload", "downloadFile: success url=".concat(String.valueOf(str)));
            return;
        }
        com.bytedance.sdk.component.utils.ko.vt("ExpressStaticResPreload", "really download error");
        if (fileVt.exists()) {
            try {
                fileVt.delete();
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.qbp.lh("ExpressStaticResPreload", th2.getMessage());
            }
        }
        if (file2.exists()) {
            try {
                file2.delete();
            } catch (Throwable th3) {
                com.bytedance.sdk.component.utils.qbp.lh("ExpressStaticResPreload", th3.getMessage());
            }
        }
    }

    public static InputStream lh(String str) {
        File fileVt = vt(str);
        if (fileVt != null && fileVt.exists() && fileVt.length() > 0) {
            try {
                return new FileInputStream(fileVt);
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.qbp.lh("ExpressStaticResPreload", th2.getMessage());
            }
        }
        return null;
    }

    public static boolean vt(com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        pd pdVar;
        return (vppVar == null || (pdVar = vppVar.lht) == null || pdVar.f12796le == null) ? false : true;
    }
}
