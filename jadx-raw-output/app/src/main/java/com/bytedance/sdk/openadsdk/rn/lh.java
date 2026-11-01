package com.bytedance.sdk.openadsdk.rn;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.pno.pno;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.ryl;
import com.bytedance.sdk.openadsdk.core.settings.cf;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.rn.ouw.yu;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.ironsource.C3426d4;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.File;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class lh {
    private static volatile lh ouw;

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

    public static void vt(final vpp vppVar) {
        if (uoy.ouw(vppVar) == null || TextUtils.isEmpty(vppVar.f12856ki)) {
            return;
        }
        ouw("download_gecko_start", false, new vt() { // from class: com.bytedance.sdk.openadsdk.rn.lh.15
            @Override // com.bytedance.sdk.openadsdk.rn.vt
            @Nullable
            public final com.bytedance.sdk.openadsdk.rn.ouw.lh ouw() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", vppVar.osn);
                jSONObject.put("channel_name", vppVar.f12856ki);
                yu yuVar = new yu();
                yuVar.ouw = "download_gecko_start";
                yuVar.yu = vppVar.lna;
                yuVar.bly = jSONObject.toString();
                return yuVar;
            }
        });
    }

    public static void lh() {
        ouw("disk_log", false, new vt() { // from class: com.bytedance.sdk.openadsdk.rn.lh.9
            @Override // com.bytedance.sdk.openadsdk.rn.vt
            public final com.bytedance.sdk.openadsdk.rn.ouw.lh ouw() throws Exception {
                JSONObject jSONObject = new JSONObject();
                File file = new File(CacheDirFactory.getRootDir());
                long j10 = 0;
                if (file.exists() && file.isDirectory()) {
                    for (File file2 : file.listFiles()) {
                        long jOuw = lh.ouw(file2);
                        j10 += jOuw;
                        jSONObject.put(file2.getName(), jOuw);
                    }
                }
                if (j10 < 524288000) {
                    return null;
                }
                yu yuVar = new yu();
                yuVar.ouw = "disk_log";
                yuVar.bly = jSONObject.toString();
                return yuVar;
            }
        });
    }

    private lh() {
    }

    public static void vt() {
        bs.lh(new pno("showFailLog") { // from class: com.bytedance.sdk.openadsdk.rn.lh.5
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    lh.ouw().ouw("show_fail_log", new JSONObject());
                } catch (Throwable th2) {
                    qbp.lh("StatsLogManager", th2.getMessage());
                }
            }
        });
    }

    public final void vt(final yu yuVar) {
        yuVar.ouw = "show_backup_endcard";
        zih.fkw().ouw(new vt() { // from class: com.bytedance.sdk.openadsdk.rn.lh.18
            @Override // com.bytedance.sdk.openadsdk.rn.vt
            public final com.bytedance.sdk.openadsdk.rn.ouw.lh ouw() throws Exception {
                return yuVar;
            }
        });
    }

    public static void ouw(final vpp vppVar) {
        if (vppVar == null) {
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        ouw("bidding_receive", false, new vt() { // from class: com.bytedance.sdk.openadsdk.rn.lh.1
            @Override // com.bytedance.sdk.openadsdk.rn.vt
            @Nullable
            public final com.bytedance.sdk.openadsdk.rn.ouw.lh ouw() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("reveice_ts", jCurrentTimeMillis);
                vpp vppVar2 = vppVar;
                if (vppVar2.lna == 3) {
                    jSONObject.put("is_icon_only", vppVar2.ra() ? 1 : 0);
                }
                yu yuVar = new yu();
                yuVar.ouw = "bidding_receive";
                yuVar.bly = jSONObject.toString();
                return yuVar;
            }
        });
    }

    public static void ouw(vpp vppVar, final long j10) {
        if (vppVar == null) {
            return;
        }
        ouw("bidding_load", false, new vt() { // from class: com.bytedance.sdk.openadsdk.rn.lh.10
            @Override // com.bytedance.sdk.openadsdk.rn.vt
            @Nullable
            public final com.bytedance.sdk.openadsdk.rn.ouw.lh ouw() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", j10);
                yu yuVar = new yu();
                yuVar.ouw = "bidding_load";
                yuVar.bly = jSONObject.toString();
                return yuVar;
            }
        });
    }

    public static void ouw(final String str, final com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw ouwVar) {
        if (ouwVar == null) {
            return;
        }
        ouw(str, false, new vt() { // from class: com.bytedance.sdk.openadsdk.rn.lh.14
            @Override // com.bytedance.sdk.openadsdk.rn.vt
            @Nullable
            public final com.bytedance.sdk.openadsdk.rn.ouw.lh ouw() throws Exception {
                JSONObject jSONObjectOuw = ouwVar.ouw();
                if (jSONObjectOuw == null) {
                    jSONObjectOuw = new JSONObject();
                }
                com.bytedance.sdk.openadsdk.yu.fkw.vt.lh lhVar = ouwVar.f13484lh;
                if (lhVar != null) {
                    lhVar.ouw(jSONObjectOuw);
                }
                int i10 = ouwVar.ouw.lna;
                yu yuVar = new yu();
                yuVar.ouw = str;
                yuVar.yu = i10;
                yuVar.bly = jSONObjectOuw.toString();
                return yuVar;
            }
        });
    }

    public static void ouw(final vpp vppVar, final JSONObject jSONObject) {
        if (uoy.ouw(vppVar) == null || TextUtils.isEmpty(vppVar.f12856ki)) {
            return;
        }
        ouw("download_gecko_end", false, new vt() { // from class: com.bytedance.sdk.openadsdk.rn.lh.16
            @Override // com.bytedance.sdk.openadsdk.rn.vt
            @Nullable
            public final com.bytedance.sdk.openadsdk.rn.ouw.lh ouw() throws Exception {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("url", vppVar.osn);
                jSONObject2.put("channel_name", vppVar.f12856ki);
                jSONObject2.put("data", jSONObject);
                yu yuVar = new yu();
                yuVar.ouw = "download_gecko_end";
                yuVar.yu = vppVar.lna;
                yuVar.bly = jSONObject2.toString();
                return yuVar;
            }
        });
    }

    public final void ouw(final String str, final JSONObject jSONObject) {
        ouw(str, false, new vt() { // from class: com.bytedance.sdk.openadsdk.rn.lh.6
            @Override // com.bytedance.sdk.openadsdk.rn.vt
            public final com.bytedance.sdk.openadsdk.rn.ouw.lh ouw() throws Exception {
                yu yuVar = new yu();
                yuVar.ouw = str;
                yuVar.bly = jSONObject.toString();
                return yuVar;
            }
        });
    }

    public final void ouw(final JSONObject jSONObject) {
        if (jSONObject == null) {
            qbp.ouw("adRevenuePangle", "You must pass adRevenue json to pangle");
            return;
        }
        Object objOpt = jSONObject.opt("device_ad_mediation_platform");
        if ((objOpt instanceof String) && !TextUtils.isEmpty((String) objOpt)) {
            qbp.ouw("adRevenuePangle", "pangle", "You successfully passed the parameters to pangle. The parameters are:", jSONObject);
            ouw("ad_revenue", true, new vt() { // from class: com.bytedance.sdk.openadsdk.rn.lh.8
                @Override // com.bytedance.sdk.openadsdk.rn.vt
                public final com.bytedance.sdk.openadsdk.rn.ouw.lh ouw() throws Exception {
                    try {
                        jSONObject.put("event", 272);
                        jSONObject.put(CommonUrlParts.UUID, ryl.lh(zih.ouw()));
                        String strOuw = "";
                        try {
                            if (ryl.ouw(zih.ouw()) != null) {
                                strOuw = ryl.ouw(zih.ouw());
                            }
                        } catch (Throwable th2) {
                            ko.vt("StatsLogManager", th2.getMessage());
                        }
                        jSONObject.put("device_id", strOuw);
                        jSONObject.put("platform", "android");
                        jSONObject.put("partner", "PangleSDK");
                    } catch (Throwable th3) {
                        ko.vt("StatsLogManager", th3.getMessage());
                    }
                    yu yuVar = new yu();
                    yuVar.ouw = "ad_revenue";
                    yuVar.bly = jSONObject.toString();
                    return yuVar;
                }
            });
        } else {
            qbp.ouw("adRevenuePangle", "You must pass device_ad_mediation_platform to pangle");
        }
    }

    public static long ouw(File file) {
        if (file.isFile()) {
            return file.length();
        }
        long jOuw = 0;
        for (File file2 : file.listFiles()) {
            jOuw += ouw(file2);
        }
        return jOuw;
    }

    public static void ouw(String str, boolean z10, vt vtVar) {
        ouw(str, z10, 100, vtVar);
    }

    public static void ouw(String str, boolean z10, int i10, vt vtVar) {
        int iOuw = cf.vt().ouw(str, i10);
        ko.vt("StatsLogManager", "type=", str, "  ", Integer.valueOf(iOuw));
        if (TextUtils.isEmpty(str) || iOuw == 0 || vtVar == null) {
            return;
        }
        boolean z11 = iOuw == 100;
        if (!z11) {
            z11 = ((int) ((Math.random() * 100.0d) + 1.0d)) <= iOuw;
        }
        if (z11) {
            zih.fkw().ouw(vtVar, z10);
        }
    }

    public static void ouw(long j10, long j11, final String str, final int i10) {
        if (j10 == 0) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        final long j12 = jElapsedRealtime - j10;
        final long j13 = jElapsedRealtime - j11;
        final long j14 = j11 - j10;
        ouw("ad_show_cost_time", false, new vt() { // from class: com.bytedance.sdk.openadsdk.rn.lh.11
            @Override // com.bytedance.sdk.openadsdk.rn.vt
            public final com.bytedance.sdk.openadsdk.rn.ouw.lh ouw() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", j12);
                jSONObject.put("renderDuration", j13);
                jSONObject.put("showToRenderDuration", j14);
                jSONObject.put("tag", str);
                jSONObject.put("renderType", i10);
                yu yuVar = new yu();
                yuVar.ouw = "ad_show_cost_time";
                yuVar.bly = jSONObject.toString();
                return yuVar;
            }
        });
    }

    public static void ouw(int i10, String str) {
        ouw(i10, str, 0, (String) null);
    }

    public static void ouw(final int i10, final String str, final int i11, final String str2) {
        ouw("ipv6_req", false, new vt<com.bytedance.sdk.openadsdk.rn.ouw.lh>() { // from class: com.bytedance.sdk.openadsdk.rn.lh.12
            @Override // com.bytedance.sdk.openadsdk.rn.vt
            @Nullable
            public final com.bytedance.sdk.openadsdk.rn.ouw.lh ouw() throws Exception {
                String str3;
                JSONObject jSONObject = new JSONObject();
                int i12 = i10;
                if (i12 == 1) {
                    str3 = "success";
                } else if (i12 == -1) {
                    jSONObject.put("error_code", i11);
                    jSONObject.put("error_msg", str2);
                    str3 = C3426d4.g.f28496e;
                } else {
                    str3 = "start";
                }
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("url", str);
                }
                jSONObject.put("status", str3);
                yu yuVar = new yu();
                yuVar.ouw = "ipv6_req";
                yuVar.bly = jSONObject.toString();
                return yuVar;
            }
        });
    }

    public static void ouw(final String str, final boolean z10) {
        ouw("img_error_param", false, new vt() { // from class: com.bytedance.sdk.openadsdk.rn.lh.13
            @Override // com.bytedance.sdk.openadsdk.rn.vt
            @Nullable
            public final com.bytedance.sdk.openadsdk.rn.ouw.lh ouw() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("is_new", z10 ? 1 : 0);
                    jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, str);
                } catch (Throwable unused) {
                }
                yu yuVar = new yu();
                yuVar.ouw = "img_error_param";
                yuVar.bly = jSONObject.toString();
                return yuVar;
            }
        });
    }

    public final void ouw(final yu yuVar) {
        yuVar.ouw = "express_ad_render";
        zih.fkw().ouw(new vt() { // from class: com.bytedance.sdk.openadsdk.rn.lh.17
            @Override // com.bytedance.sdk.openadsdk.rn.vt
            public final com.bytedance.sdk.openadsdk.rn.ouw.lh ouw() throws Exception {
                return yuVar;
            }
        });
    }
}
