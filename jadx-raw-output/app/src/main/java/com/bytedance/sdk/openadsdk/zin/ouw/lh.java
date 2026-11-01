package com.bytedance.sdk.openadsdk.zin.ouw;

import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import android.webkit.WebResourceResponse;
import androidx.annotation.Nullable;
import androidx.multidex.MultiDexExtractor;
import com.bytedance.sdk.component.pno.pno;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.component.utils.rn;
import com.bytedance.sdk.component.utils.uq;
import com.bytedance.sdk.openadsdk.core.jg;
import com.bytedance.sdk.openadsdk.core.settings.ra;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.bs;
import java.io.File;
import java.io.FileInputStream;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public class lh {
    private static volatile lh ouw;
    private final Set<String> fkw = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private String f13607lh;
    private String vt;
    private String yu;

    private static String lh(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int iIndexOf = str.indexOf("?");
        if (iIndexOf != -1) {
            str = str.substring(0, iIndexOf);
        }
        int iLastIndexOf = str.lastIndexOf(".");
        if (iLastIndexOf == -1) {
            return "";
        }
        return "." + str.substring(iLastIndexOf + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vt() {
        bs.ouw(new pno("pag_plb_res_check") { // from class: com.bytedance.sdk.openadsdk.zin.ouw.lh.2
            @Override // java.lang.Runnable
            public final void run() {
                com.bytedance.sdk.openadsdk.zin.vt.ouw ouwVarOuw = com.bytedance.sdk.openadsdk.zin.vt.ouw.ouw(com.bytedance.sdk.openadsdk.multipro.yu.yu.vt("pag_plb_config", "model", ""));
                if (ouwVarOuw != null) {
                    lh.this.ouw(ouwVarOuw, null, 0);
                }
            }
        });
    }

    private String fkw() {
        if (TextUtils.isEmpty(this.yu)) {
            String str = lh() + File.separator + "pregames";
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            this.yu = str;
        }
        return this.yu;
    }

    private String yu() {
        if (TextUtils.isEmpty(this.f13607lh)) {
            String str = lh() + File.separator + "common";
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            this.f13607lh = str;
        }
        return this.f13607lh;
    }

    public final WebResourceResponse vt(String str) {
        if (!ra.ouw()) {
            return null;
        }
        String strOuw = rn.ouw(str);
        if (TextUtils.isEmpty(strOuw)) {
            return null;
        }
        File file = new File(yu(), strOuw + lh(str));
        if (file.exists()) {
            try {
                String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str));
                if (TextUtils.isEmpty(mimeTypeFromExtension)) {
                    return null;
                }
                return new WebResourceResponse(mimeTypeFromExtension, "UTF-8", new FileInputStream(file));
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        return null;
    }

    public static lh ouw() {
        if (ouw == null) {
            synchronized (lh.class) {
                if (ouw == null) {
                    ouw = new lh();
                }
            }
        }
        return ouw;
    }

    private String lh() {
        if (TextUtils.isEmpty(this.vt)) {
            try {
                File file = new File(zih.ouw().getCacheDir(), "playable");
                if (!file.exists()) {
                    file.mkdirs();
                }
                this.vt = file.getAbsolutePath();
            } catch (Throwable th2) {
                qbp.lh("PlayableResManager", "init root path error: ".concat(String.valueOf(th2)));
            }
        }
        return this.vt;
    }

    public final void ouw(Map<String, String> map) {
        File[] fileArrListFiles;
        if (ra.ouw()) {
            ko.vt("PlayableResManager", "initLocalPlayableRes");
            String strFkw = fkw();
            if (!TextUtils.isEmpty(strFkw)) {
                File file = new File(strFkw);
                if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                    for (File file2 : fileArrListFiles) {
                        if (file2 != null) {
                            try {
                                File fileOuw = com.bytedance.sdk.openadsdk.core.mwh.lh.ouw.ouw(file2);
                                if (fileOuw != null && fileOuw.exists()) {
                                    map.put(file2.getName(), fileOuw.getAbsolutePath());
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    }
                }
            }
            int iOuw = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("plb_res_delay_fetch_time", 0);
            if (iOuw <= 0) {
                vt();
            } else {
                jg.vt().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.zin.ouw.lh.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        lh.this.vt();
                    }
                }, iOuw);
            }
        }
    }

    public final void ouw(final String str) {
        bs.ouw(new pno("pag_plb_update_config") { // from class: com.bytedance.sdk.openadsdk.zin.ouw.lh.4
            @Override // java.lang.Runnable
            public final void run() {
                com.bytedance.sdk.component.ra.vt.vt vtVarVt = com.bytedance.sdk.openadsdk.th.vt.ouw().ouw.vt();
                try {
                    vtVarVt.ouw(com.bytedance.sdk.openadsdk.bly.lh.ouw(str));
                    com.bytedance.sdk.component.ra.vt vtVarOuw = vtVarVt.ouw();
                    if (vtVarOuw == null || !vtVarOuw.pno) {
                        return;
                    }
                    String str2 = vtVarOuw.yu;
                    com.bytedance.sdk.openadsdk.zin.vt.ouw ouwVarOuw = com.bytedance.sdk.openadsdk.zin.vt.ouw.ouw(str2);
                    com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("pag_plb_config", "last_update_time", Long.valueOf(System.currentTimeMillis()));
                    if (ouwVarOuw != null) {
                        com.bytedance.sdk.openadsdk.zin.vt.ouw ouwVarOuw2 = com.bytedance.sdk.openadsdk.zin.vt.ouw.ouw(com.bytedance.sdk.openadsdk.multipro.yu.yu.vt("pag_plb_config", "model", ""));
                        if (ouwVarOuw2 == null || !ouwVarOuw.ouw.equals(ouwVarOuw2.ouw)) {
                            com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("pag_plb_config", "model", str2);
                            lh.this.ouw(ouwVarOuw, ouwVarOuw2, 1);
                        }
                    }
                } catch (Exception e10) {
                    qbp.lh("PlayableResManager", e10.getMessage());
                }
            }
        });
    }

    private void ouw(@Nullable List<com.bytedance.sdk.openadsdk.zin.vt.ouw.C0163ouw> list, @Nullable List<com.bytedance.sdk.openadsdk.zin.vt.ouw.C0163ouw> list2, int i10, int i11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        String strYu = i10 == 1 ? yu() : fkw();
        for (com.bytedance.sdk.openadsdk.zin.vt.ouw.C0163ouw c0163ouw : list) {
            String str = c0163ouw.ouw;
            String strOuw = rn.ouw(str);
            if (!TextUtils.isEmpty(strOuw)) {
                if (i10 == 1) {
                    strOuw = strOuw + lh(str);
                }
                String str2 = strOuw;
                File file = new File(strYu, str2);
                boolean zExists = file.exists();
                if (i11 == 1) {
                    if (zExists && list2 != null && list2.contains(c0163ouw)) {
                        ko.ouw("PlayableResManager", "file exists, no need to download: tp= ", Integer.valueOf(i10), ", url=", str);
                        com.bytedance.sdk.openadsdk.core.mwh.lh.ouw.lh(file);
                    } else {
                        ouw(str, strYu, str2, i10, file, zExists);
                    }
                } else if (zExists) {
                    ko.ouw("PlayableResManager", "file exists, no need to download: tp= ", Integer.valueOf(i10), ", url=", str);
                } else {
                    ouw(str, strYu, str2, i10, file, zExists);
                }
            }
        }
    }

    private void ouw(final String str, final String str2, final String str3, final int i10, final File file, final boolean z10) {
        String strConcat;
        File file2;
        if (this.fkw.contains(str)) {
            ko.ouw("PlayableResManager", "Downloading, no repeat downloading, url: ", str);
            return;
        }
        if (i10 == 2) {
            strConcat = str3 + MultiDexExtractor.EXTRACTED_SUFFIX;
        } else {
            strConcat = z10 ? "tmp".concat(String.valueOf(str3)) : str3;
        }
        this.fkw.add(str);
        com.bytedance.sdk.component.ra.vt.ouw ouwVarLh = com.bytedance.sdk.openadsdk.th.vt.ouw().ouw.lh();
        ouwVarLh.ouw(str);
        ouwVarLh.ouw(str2, strConcat);
        final com.bytedance.sdk.component.ra.vt vtVarOuw = ouwVarLh.ouw();
        this.fkw.remove(str);
        if (vtVarOuw != null && vtVarOuw.pno && (file2 = vtVarOuw.f11909ra) != null && file2.exists()) {
            if (i10 == 2) {
                ko.lh("PlayableResManager", "onResponse: Playable zip download success");
                bs.vt(new pno("downloadZip") { // from class: com.bytedance.sdk.openadsdk.zin.ouw.lh.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            if (z10) {
                                file.delete();
                            }
                            String str4 = str2 + File.separator + str3;
                            uq.ouw(vtVarOuw.f11909ra.getAbsolutePath(), str4, (String) null);
                            File file3 = new File(str4);
                            File fileOuw = com.bytedance.sdk.openadsdk.core.mwh.lh.ouw.ouw(file3);
                            if (fileOuw != null && fileOuw.exists()) {
                                com.bytedance.sdk.openadsdk.core.mwh.lh.ouw.ouw().vt.put(file3.getName(), fileOuw.getAbsolutePath());
                            }
                            com.bytedance.sdk.openadsdk.core.mwh.lh.ouw.vt(file3);
                        } catch (Throwable th2) {
                            qbp.yu("PlayableResManager", "unzip error: ", th2, "tp=", Integer.valueOf(i10), ", url=", str);
                        }
                        try {
                            vtVarOuw.f11909ra.delete();
                        } catch (Throwable unused) {
                        }
                    }
                });
                return;
            }
            ko.lh("PlayableResManager", "onResponse: Playable res download success");
            if (z10) {
                file.delete();
                vtVarOuw.f11909ra.renameTo(file);
                return;
            }
            return;
        }
        File file3 = new File(str2 + File.separator + str3 + ".tmp");
        if (file3.exists()) {
            try {
                file3.delete();
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        ko.vt("PlayableResManager", "really download error");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void ouw(com.bytedance.sdk.openadsdk.zin.vt.ouw ouwVar, @Nullable com.bytedance.sdk.openadsdk.zin.vt.ouw ouwVar2, int i10) {
        List<com.bytedance.sdk.openadsdk.zin.vt.ouw.C0163ouw> list = null;
        ouw(ouwVar.vt, ouwVar2 == null ? null : ouwVar2.vt, 1, i10);
        List<com.bytedance.sdk.openadsdk.zin.vt.ouw.C0163ouw> list2 = ouwVar.f13663lh;
        if (ouwVar2 != null) {
            list = ouwVar2.f13663lh;
        }
        ouw(list2, list, 2, i10);
    }
}
