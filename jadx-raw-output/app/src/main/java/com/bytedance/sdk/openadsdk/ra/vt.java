package com.bytedance.sdk.openadsdk.ra;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.GeckoHubImp;
import com.bykv.vk.openvk.preload.geckox.IThreadPoolCallback;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.ryl;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.rn.lh;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.uoy;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class vt {
    private static final String[] ouw = {"gecko16-normal-useast5.tiktokv.us"};

    public interface ouw {
        void ouw();
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ra.vt$vt, reason: collision with other inner class name */
    public static class C0148vt {
        private static final vt ouw = new vt(0);
    }

    public /* synthetic */ vt(byte b10) {
        this();
    }

    public static ILoader vt() {
        try {
            return GeckoHubImp.inst(zih.ouw()).getGeckoResLoader();
        } catch (Throwable th2) {
            qbp.ouw("GeckoHub", "getGeckoResLoader error", th2);
            return null;
        }
    }

    private vt() {
        try {
            GeckoHubImp.inst(zih.ouw());
        } catch (Throwable th2) {
            qbp.ouw("GeckoHub", "GeckoHubImp init error", th2);
        }
    }

    public static void lh() {
        try {
            GeckoHubImp.setThreadPoolExecutorCallback(new IThreadPoolCallback() { // from class: com.bytedance.sdk.openadsdk.ra.vt.2
                @Override // com.bykv.vk.openvk.preload.geckox.IThreadPoolCallback
                public final ExecutorService getThreadPool() {
                    return bs.fkw();
                }
            });
        } catch (Throwable th2) {
            qbp.ouw("GeckoHub", "setThreadPoolExecutor error", th2);
        }
    }

    public static vt ouw() {
        return C0148vt.ouw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void vt(Map<String, vpp> map, JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (jSONObject == null) {
                jSONObject2.put("success", false);
                jSONObject2.put(NotificationCompat.CATEGORY_MESSAGE, str);
                jSONObject2.put("code", 1);
                jSONObject = jSONObject2;
            }
            Iterator<vpp> it = map.values().iterator();
            while (it.hasNext()) {
                lh.ouw(it.next(), jSONObject);
            }
        } catch (Throwable th2) {
            qbp.ouw("GeckoHub", "upLoadStateEvent error", th2);
        }
    }

    private static String yu() {
        int length;
        String[] strArrPd = zih.yu().pd();
        StringBuilder sb2 = new StringBuilder("GeckoLog:get gecko hosts from settings ");
        if (strArrPd == null) {
            length = 0;
        } else {
            length = strArrPd.length;
        }
        sb2.append(length);
        ko.vt("GeckoHub", sb2.toString());
        if (strArrPd == null) {
            strArrPd = ouw;
        }
        String str = strArrPd[new SecureRandom().nextInt(strArrPd.length)];
        if (TextUtils.isEmpty(str)) {
            SecureRandom secureRandom = new SecureRandom();
            String[] strArr = ouw;
            str = strArr[secureRandom.nextInt(strArr.length)];
        }
        ko.vt("GeckoHub", "GeckoLog:random host ".concat(String.valueOf(str)));
        return str;
    }

    public final void ouw(Map<String, vpp> map) {
        ouw(map, (ouw) null, false);
    }

    public final void ouw(final Map<String, vpp> map, final ouw ouwVar, boolean z10) {
        try {
            String strOuw = ryl.ouw(zih.ouw());
            if (TextUtils.isEmpty(strOuw)) {
                ko.vt("GeckoHub", "no did so don't preload");
                return;
            }
            for (vpp vppVar : map.values()) {
                if (vppVar != null) {
                    if (z10) {
                        ko.lh("LPPreRenderManager", "from pre render, begin downloadGecko");
                        lh.vt(vppVar);
                    } else if (vppVar.ucs()) {
                        ko.lh("LPPreRenderManager", "open pre render, give gecko ability to preRenderModel");
                        map.remove(vppVar.f12856ki);
                    } else {
                        ko.lh("LPPreRenderManager", "not open pre render, downloadGecko as usual");
                        lh.vt(vppVar);
                    }
                }
            }
            if (map.isEmpty()) {
                return;
            }
            GeckoHubImp.setRandomHost(yu());
            GeckoHubImp.inst(zih.ouw()).preload(strOuw, new IStatisticMonitor() { // from class: com.bytedance.sdk.openadsdk.ra.vt.1
                @Override // com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor
                public final void upload(String str, final JSONObject jSONObject) {
                    String strOuw2;
                    if (!"geckosdk_update_stats".equals(str)) {
                        if ("download_gecko_end".equals(str)) {
                            ko.vt("LPPreRenderManager", "gecko download finish", jSONObject);
                            ouw ouwVar2 = ouwVar;
                            if (ouwVar2 != null) {
                                ouwVar2.ouw();
                            }
                            vt.vt(map, jSONObject, "");
                            return;
                        }
                        return;
                    }
                    vpp vppVar2 = (vpp) map.get(jSONObject.optString("channel"));
                    if (vppVar2 == null || (strOuw2 = uoy.ouw(vppVar2)) == null) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.yu.lh.ouw(System.currentTimeMillis(), vppVar2, strOuw2 + "_landingpage", str, new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.yu.lh.ouw.1
                        public final /* synthetic */ JSONObject ouw;

                        public AnonymousClass1() {
                            jSONObject = jSONObject;
                        }

                        @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                        public final JSONObject lh() {
                            return jSONObject;
                        }
                    });
                }
            }, map.keySet(), new com.bytedance.sdk.openadsdk.ra.ouw());
        } catch (Throwable th2) {
            vt(map, null, th2.toString());
            qbp.ouw("GeckoHub", "releaseGeckoResLoader error", th2);
        }
    }

    public static void ouw(ILoader iLoader) {
        if (iLoader != null) {
            try {
                GeckoHubImp.inst(zih.ouw()).releaseGeckoResLoader(iLoader);
            } catch (Throwable th2) {
                qbp.ouw("GeckoHub", "releaseGeckoResLoader error", th2);
            }
        }
    }

    public static WebResourceResponseModel ouw(ILoader iLoader, String str, String str2) {
        if (iLoader == null) {
            return null;
        }
        try {
            return GeckoHubImp.inst(zih.ouw()).findResAndMsg(iLoader, str, str2);
        } catch (Throwable th2) {
            qbp.ouw("GeckoHub", "findRes error", th2);
            return null;
        }
    }

    public static int ouw(ILoader iLoader, String str) {
        try {
            return GeckoHubImp.inst(zih.ouw()).getResCount(iLoader, str);
        } catch (Throwable th2) {
            qbp.ouw("GeckoHub", "getResCount error", th2);
            return 0;
        }
    }
}
