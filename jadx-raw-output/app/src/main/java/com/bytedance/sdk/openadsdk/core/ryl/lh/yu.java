package com.bytedance.sdk.openadsdk.core.ryl.lh;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.component.pno.pno;
import com.bytedance.sdk.component.utils.ra;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.fkw;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.zih;
import io.bidmachine.unified.UnifiedMediationParams;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class yu {
    public static final List<String> ouw = Arrays.asList("video/mp4", "video/3gpp");
    private static final ConcurrentHashMap<String, Boolean> vt = new ConcurrentHashMap<>();

    /* JADX INFO: Access modifiers changed from: private */
    public static void vt(vpp vppVar, File file, fkw.ouw ouwVar, long j10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        com.bytedance.sdk.openadsdk.core.ryl.ouw.ouw.yu yuVar = new com.bytedance.sdk.openadsdk.core.ryl.ouw.ouw.yu(zih.ouw(), 0, 0);
        com.bytedance.sdk.openadsdk.core.ryl.ouw ouwVarOuw = yuVar.ouw((String) null, file, new ArrayList());
        if (ouwVarOuw != null) {
            com.bytedance.sdk.openadsdk.core.model.yu yuVar2 = ouwVarOuw.ouw;
            ouwVar.f12755lh = yuVar2.ouw;
            ouwVar.yu = yuVar2.vt;
        }
        ouw(vppVar, ouwVar.ouw, true, j10);
        vt(vppVar, "vast_url", ouwVarOuw, jElapsedRealtime, yuVar.f13022le);
        vt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ouw(vpp vppVar, final String str, final boolean z10, final long j10) {
        com.bytedance.sdk.openadsdk.yu.lh.ouw(System.currentTimeMillis(), vppVar, vppVar.vt(), "track_url_request_result", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.core.ryl.lh.yu.3
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject lh() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", str);
                    jSONObject.put("duration", j10);
                    jSONObject.put("success", z10);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void ouw(final vpp vppVar, final String str, final com.bytedance.sdk.openadsdk.core.ryl.ouw ouwVar, final long j10, final com.bytedance.sdk.openadsdk.core.ryl.ouw.vt.ouw ouwVar2) {
        com.bytedance.sdk.openadsdk.yu.lh.ouw(new pno("vast_parser2") { // from class: com.bytedance.sdk.openadsdk.core.ryl.lh.yu.5
            @Override // java.lang.Runnable
            public final void run() {
                com.bytedance.sdk.openadsdk.core.ryl.vt vtVar;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("duration", SystemClock.elapsedRealtime() - j10);
                    com.bytedance.sdk.openadsdk.core.ryl.ouw ouwVar3 = ouwVar;
                    String str2 = "load_vast_fail";
                    if (ouwVar3 == null) {
                        com.bytedance.sdk.openadsdk.core.ryl.ouw.vt.ouw ouwVar4 = ouwVar2;
                        if (ouwVar4 != null) {
                            jSONObject.put("error_code", ouwVar4.ouw);
                        }
                    } else if (TextUtils.isEmpty(ouwVar3.ouw()) || TextUtils.isEmpty(ouwVar.f13012le) || ouwVar.pno <= 0.0d) {
                        jSONObject.put("error_code", -3);
                    } else {
                        str2 = "load_vast_success";
                    }
                    com.bytedance.sdk.openadsdk.yu.lh.vt(vppVar, str, str2, jSONObject);
                    com.bytedance.sdk.openadsdk.core.ryl.ouw ouwVar5 = ouwVar;
                    if (ouwVar5 == null || (vtVar = ouwVar5.vt) == null || !TextUtils.isEmpty(vtVar.le())) {
                        return;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("error_code", 1000);
                        jSONObject2.put(UnifiedMediationParams.KEY_DESCRIPTION, "1000:Image url is null");
                    } catch (Throwable unused) {
                    }
                    com.bytedance.sdk.openadsdk.yu.lh.vt(vppVar, str, "load_vast_icon_fail", jSONObject2);
                    ouwVar.ouw((com.bytedance.sdk.openadsdk.core.ryl.vt) null);
                } catch (Exception unused2) {
                }
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0070  */
    public static double ouw(int i10, double d10, int i11, int i12, int i13, @Nullable String str) {
        double dAbs = (d10 > 0.0d ? Math.abs(d10 - (i12 > 0 ? ((double) i11) / ((double) i12) : 0.0d)) : 0.0d) + (i10 > 0 ? Math.abs((i10 - i11) / i10) : 0.0d);
        byte b10 = 0;
        int iMax = Math.max(i13, 0);
        double dMin = (700 > iMax || iMax > 1500) ? Math.min(Math.abs(700 - iMax) / 700.0f, Math.abs(1500 - iMax) / 1500.0f) : 0.0d;
        if (str == null) {
            str = "";
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -1664118616) {
            if (iHashCode != 1331848029 || !str.equals("video/mp4")) {
                b10 = -1;
            }
        } else if (str.equals("video/3gpp")) {
            b10 = 1;
        } else {
            b10 = -1;
        }
        return (b10 != 0 ? 1.0d : 1.5d) * (1.0d / ((dAbs + 1.0d) + dMin));
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000a  */
    public static void ouw(final vpp vppVar) {
        boolean z10;
        fkw fkwVar;
        ArrayList<fkw.ouw> arrayList;
        if (vppVar == null) {
            return;
        }
        if (vppVar.ra()) {
            z10 = false;
        } else {
            int iUoy = vppVar.uoy();
            int i10 = vppVar.ucs;
            if ((iUoy == 3 || iUoy == 7 || iUoy == 8) && (i10 == 5 || i10 == 15 || i10 == 50)) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        if (!z10 || (fkwVar = vppVar.ryl) == null || (arrayList = fkwVar.ouw) == null || arrayList.isEmpty()) {
            return;
        }
        for (final fkw.ouw ouwVar : arrayList) {
            String str = ouwVar.vt;
            if (!TextUtils.isEmpty(str)) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                com.bytedance.sdk.openadsdk.core.ryl.ouw.ouw.yu yuVar = new com.bytedance.sdk.openadsdk.core.ryl.ouw.ouw.yu(zih.ouw(), 0, 0);
                com.bytedance.sdk.openadsdk.core.ryl.ouw ouwVarOuw = yuVar.ouw(str, (File) null, new ArrayList());
                if (ouwVarOuw != null) {
                    com.bytedance.sdk.openadsdk.core.model.yu yuVar2 = ouwVarOuw.ouw;
                    ouwVar.f12755lh = yuVar2.ouw;
                    ouwVar.yu = yuVar2.vt;
                }
                vt(vppVar, "vast_content", ouwVarOuw, jElapsedRealtime, yuVar.f13022le);
            }
            String str2 = ouwVar.ouw;
            if (!TextUtils.isEmpty(str2)) {
                final String str3 = str2 + vppVar.ux();
                ConcurrentHashMap<String, Boolean> concurrentHashMap = vt;
                if (!concurrentHashMap.containsKey(str3)) {
                    String strOuw = com.bytedance.sdk.component.utils.fkw.ouw(str3);
                    File fileOuw = strOuw != null ? ra.ouw(zih.ouw(), com.bytedance.sdk.openadsdk.multipro.vt.lh(), new File(CacheDirFactory.getRootDir()).getName() + "/vast/", strOuw) : null;
                    if (fileOuw != null) {
                        if (fileOuw.exists() && fileOuw.length() > 0) {
                            vt(vppVar, fileOuw, ouwVar, 0L);
                        } else {
                            concurrentHashMap.put(str3, Boolean.TRUE);
                            final long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                            com.bytedance.sdk.component.ra.vt.ouw ouwVarLh = com.bytedance.sdk.openadsdk.th.vt.ouw().ouw.lh();
                            ouwVarLh.ouw(str2);
                            ouwVarLh.ouw(fileOuw.getParent(), fileOuw.getName());
                            ouwVarLh.vt(str2);
                            ouwVarLh.ouw(new com.bytedance.sdk.component.ra.ouw.ouw() { // from class: com.bytedance.sdk.openadsdk.core.ryl.lh.yu.1
                                @Override // com.bytedance.sdk.component.ra.ouw.ouw
                                public final void ouw(com.bytedance.sdk.component.ra.vt.lh lhVar, IOException iOException) {
                                    yu.ouw(vppVar, ouwVar.ouw, false, SystemClock.elapsedRealtime() - jElapsedRealtime2);
                                    yu.vt.remove(str3);
                                }

                                @Override // com.bytedance.sdk.component.ra.ouw.ouw
                                public final void ouw(com.bytedance.sdk.component.ra.vt.lh lhVar, com.bytedance.sdk.component.ra.vt vtVar) {
                                    File file;
                                    if (vtVar.pno && (file = vtVar.f11909ra) != null && file.exists()) {
                                        yu.vt(vppVar, vtVar.f11909ra, ouwVar, SystemClock.elapsedRealtime() - jElapsedRealtime2);
                                    } else {
                                        yu.ouw(vppVar, ouwVar.ouw, false, SystemClock.elapsedRealtime() - jElapsedRealtime2);
                                    }
                                    yu.vt.remove(str3);
                                }
                            });
                        }
                    }
                }
            }
        }
    }

    private static void vt() {
        File[] fileArrListFiles = ra.ouw(zih.ouw(), com.bytedance.sdk.openadsdk.multipro.vt.lh(), new File(CacheDirFactory.getRootDir()).getName() + "/vast/").listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length <= 5) {
            return;
        }
        Arrays.sort(fileArrListFiles, new Comparator<File>() { // from class: com.bytedance.sdk.openadsdk.core.ryl.lh.yu.2
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(File file, File file2) {
                File file3 = file;
                File file4 = file2;
                if (file3.lastModified() < file4.lastModified()) {
                    return -1;
                }
                return file3.lastModified() > file4.lastModified() ? 1 : 0;
            }
        });
        int length = fileArrListFiles.length - 5;
        for (int i10 = 0; i10 < fileArrListFiles.length && i10 < length; i10++) {
            File file = fileArrListFiles[i10];
            if (file.exists()) {
                file.delete();
            }
        }
    }

    private static void vt(final vpp vppVar, final String str, final com.bytedance.sdk.openadsdk.core.ryl.ouw ouwVar, final long j10, final com.bytedance.sdk.openadsdk.core.ryl.ouw.vt.ouw ouwVar2) {
        com.bytedance.sdk.openadsdk.yu.lh.ouw(new pno("vast_parser1") { // from class: com.bytedance.sdk.openadsdk.core.ryl.lh.yu.4
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("duration", SystemClock.elapsedRealtime() - j10);
                    jSONObject.put(TypedValues.TransitionType.S_FROM, str);
                    if (ouwVar != null) {
                        vpp vppVar2 = vppVar;
                        com.bytedance.sdk.openadsdk.yu.lh.vt(vppVar2, vppVar2.vt(), "track_load_vast_success", jSONObject);
                        return;
                    }
                    com.bytedance.sdk.openadsdk.core.ryl.ouw.vt.ouw ouwVar3 = ouwVar2;
                    if (ouwVar3 != null) {
                        jSONObject.put("error_code", ouwVar3.ouw);
                    }
                    vpp vppVar3 = vppVar;
                    com.bytedance.sdk.openadsdk.yu.lh.vt(vppVar3, vppVar3.vt(), "track_load_vast_fail", jSONObject);
                } catch (Exception unused) {
                }
            }
        });
    }

    public static void ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar) {
        List<vpp> list = ouwVar.yu;
        if (list != null) {
            Iterator<vpp> it = list.iterator();
            while (it.hasNext()) {
                ouw(it.next());
            }
        }
    }
}
