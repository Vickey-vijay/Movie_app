package com.bytedance.adsdk.vt.yu;

import android.content.Context;
import com.bytedance.adsdk.vt.mwh;
import com.ironsource.G5;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes2.dex */
public class pno {
    public final ra ouw;
    private final le vt;

    public final mwh<com.bytedance.adsdk.vt.ra> ouw(Context context, String str, String str2) {
        mwh<com.bytedance.adsdk.vt.ra> mwhVarOuw;
        lh lhVar;
        ra raVar;
        ra raVar2;
        ra raVar3;
        com.bytedance.adsdk.vt.le.yu.ouw("Fetching ".concat(String.valueOf(str)));
        yu yuVar = null;
        try {
            try {
                yu yuVarOuw = this.vt.ouw(str);
                try {
                    if (!yuVarOuw.ouw()) {
                        mwh<com.bytedance.adsdk.vt.ra> mwhVar = new mwh<>(new IllegalArgumentException(yuVarOuw.yu()));
                        try {
                            yuVarOuw.close();
                        } catch (IOException e10) {
                            com.bytedance.adsdk.vt.le.yu.ouw("LottieFetchResult close failed ", e10);
                        }
                        return mwhVar;
                    }
                    InputStream inputStreamVt = yuVarOuw.vt();
                    String strLh = yuVarOuw.lh();
                    if (strLh == null) {
                        strLh = G5.L;
                    }
                    if (strLh.contains("application/zip") || strLh.contains("application/x-zip") || strLh.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
                        com.bytedance.adsdk.vt.le.yu.ouw("Handling zip response.");
                        lh lhVar2 = lh.ZIP;
                        mwhVarOuw = (str2 == null || (raVar = this.ouw) == null) ? com.bytedance.adsdk.vt.pno.ouw(context, new ZipInputStream(inputStreamVt), (String) null) : com.bytedance.adsdk.vt.pno.ouw(context, new ZipInputStream(new FileInputStream(raVar.ouw(str, inputStreamVt, lhVar2))), str);
                        lhVar = lhVar2;
                    } else {
                        com.bytedance.adsdk.vt.le.yu.ouw("Received json response.");
                        lhVar = lh.JSON;
                        mwhVarOuw = (str2 == null || (raVar3 = this.ouw) == null) ? com.bytedance.adsdk.vt.pno.vt(inputStreamVt, (String) null) : com.bytedance.adsdk.vt.pno.vt(new FileInputStream(raVar3.ouw(str, inputStreamVt, lhVar).getAbsolutePath()), str);
                    }
                    if (str2 != null && mwhVarOuw.ouw != null && (raVar2 = this.ouw) != null) {
                        File file = new File(raVar2.ouw(), ra.ouw(str, lhVar, true));
                        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
                        boolean zRenameTo = file.renameTo(file2);
                        com.bytedance.adsdk.vt.le.yu.ouw("Copying temp file to real file (" + file2 + ")");
                        if (!zRenameTo) {
                            com.bytedance.adsdk.vt.le.yu.vt("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
                        }
                    }
                    StringBuilder sb2 = new StringBuilder("Completed fetch from network. Success: ");
                    sb2.append(mwhVarOuw.ouw != null);
                    com.bytedance.adsdk.vt.le.yu.ouw(sb2.toString());
                    try {
                        yuVarOuw.close();
                    } catch (IOException e11) {
                        com.bytedance.adsdk.vt.le.yu.ouw("LottieFetchResult close failed ", e11);
                    }
                    return mwhVarOuw;
                } catch (Exception e12) {
                    e = e12;
                    yuVar = yuVarOuw;
                    mwh<com.bytedance.adsdk.vt.ra> mwhVar2 = new mwh<>(e);
                    if (yuVar != null) {
                        try {
                            yuVar.close();
                        } catch (IOException e13) {
                            com.bytedance.adsdk.vt.le.yu.ouw("LottieFetchResult close failed ", e13);
                        }
                    }
                    return mwhVar2;
                } catch (Throwable th2) {
                    th = th2;
                    yuVar = yuVarOuw;
                    if (yuVar != null) {
                        try {
                            yuVar.close();
                        } catch (IOException e14) {
                            com.bytedance.adsdk.vt.le.yu.ouw("LottieFetchResult close failed ", e14);
                        }
                    }
                    throw th;
                }
            } catch (Exception e15) {
                e = e15;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public pno(ra raVar, le leVar) {
        this.ouw = raVar;
        this.vt = leVar;
    }
}
