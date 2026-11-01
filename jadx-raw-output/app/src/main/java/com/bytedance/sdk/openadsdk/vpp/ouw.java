package com.bytedance.sdk.openadsdk.vpp;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.ksc;
import com.bytedance.sdk.component.utils.pno;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.core.ex;
import com.bytedance.sdk.openadsdk.core.jg;
import com.bytedance.sdk.openadsdk.core.settings.bly;
import com.bytedance.sdk.openadsdk.core.settings.cf;
import com.bytedance.sdk.openadsdk.core.settings.ra;
import com.bytedance.sdk.openadsdk.core.tlj.vt;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.jqy.lh;
import com.bytedance.sdk.openadsdk.jqy.yu;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.bytedance.sdk.openadsdk.utils.zin;
import com.ironsource.mediationsdk.metadata.a;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.safedk.android.internal.partials.PangleVideoBridge;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class ouw {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private static volatile lh f13466lh;
    public static final ConcurrentHashMap<String, Object> ouw = new ConcurrentHashMap<>();
    public static String vt;

    public static lh ouw(final Context context, final String str) {
        if (f13466lh == null) {
            synchronized (ouw.class) {
                if (f13466lh == null) {
                    try {
                        lh lhVar = new lh(new yu() { // from class: com.bytedance.sdk.openadsdk.vpp.ouw.1
                            @Override // com.bytedance.sdk.openadsdk.jqy.yu
                            public final String lh() {
                                return "pag_adn_strategy_center";
                            }

                            @Override // com.bytedance.sdk.openadsdk.jqy.yu
                            public final ExecutorService ouw() {
                                return bs.fkw();
                            }

                            @Override // com.bytedance.sdk.openadsdk.jqy.yu
                            public final String fkw() {
                                String strOuw = uoy.ouw("/api/ad/union/sdk/strategies/adn", false, true);
                                ouw.vt = strOuw;
                                return strOuw;
                            }

                            @Override // com.bytedance.sdk.openadsdk.jqy.yu
                            public final JSONObject le() {
                                try {
                                    JSONObject jSONObjectOuw = bly.ouw(ksc.ouw(zih.ouw(), 0L));
                                    if (!jSONObjectOuw.has("app_id")) {
                                        if (!TextUtils.isEmpty(str)) {
                                            jSONObjectOuw.put("app_id", str);
                                        } else {
                                            if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.bly.ouw().yu())) {
                                                return null;
                                            }
                                            jSONObjectOuw.put("app_id", com.bytedance.sdk.openadsdk.core.bly.ouw().yu());
                                        }
                                    }
                                    return com.bytedance.sdk.component.utils.ouw.ouw(jSONObjectOuw);
                                } catch (Throwable th2) {
                                    qbp.lh("StrategyUtils", th2.getMessage());
                                    return null;
                                }
                            }

                            @Override // com.bytedance.sdk.openadsdk.jqy.yu
                            public final JSONObject ouw(JSONObject jSONObject) {
                                int iOptInt = jSONObject.optInt("cypher", -1);
                                if (iOptInt == -1 || iOptInt != 3) {
                                    return jSONObject;
                                }
                                String strVt = com.bytedance.sdk.component.utils.ouw.vt(jSONObject.optString("message"));
                                if (TextUtils.isEmpty(strVt)) {
                                    return jSONObject;
                                }
                                try {
                                    return PangleVideoBridge.jsonObjectInit(strVt);
                                } catch (Throwable unused) {
                                    return jSONObject;
                                }
                            }

                            @Override // com.bytedance.sdk.openadsdk.jqy.yu
                            public final Map<String, String> ra() {
                                HashMap map = new HashMap();
                                map.put("User-Agent", uoy.fkw());
                                String strVt = com.bytedance.sdk.openadsdk.multipro.yu.yu.vt("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, "");
                                if (!strVt.isEmpty()) {
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("ipv6", strVt);
                                    } catch (JSONException e10) {
                                        ko.ouw("StrategyUtils", "add ipv6 error", e10);
                                    }
                                    JSONObject jSONObjectEncryptType4 = PangleEncryptManager.encryptType4(jSONObject, new ex(PangleEncryptConstant.CryptDataScene.UNKNOWN));
                                    if (jSONObjectEncryptType4 != null) {
                                        map.put("transfer-param", jSONObjectEncryptType4.optString("message"));
                                        if (jSONObjectEncryptType4.optInt("cypher") == 4) {
                                            map.put("cypher", "4");
                                        } else {
                                            map.put("cypher", ExifInterface.GPS_MEASUREMENT_3D);
                                        }
                                    }
                                }
                                try {
                                    map.put("x-pangle-target-idc", cf.vt().lso());
                                } catch (Throwable th2) {
                                    ko.ouw("StrategyUtils", "add x-pangle-target-idc error", th2);
                                }
                                return map;
                            }

                            @Override // com.bytedance.sdk.openadsdk.jqy.yu
                            public final Context vt() {
                                Context context2 = context;
                                return context2 != null ? context2 : zih.ouw();
                            }

                            @Override // com.bytedance.sdk.openadsdk.jqy.yu
                            public final Handler yu() {
                                return jg.vt();
                            }

                            @Override // com.bytedance.sdk.openadsdk.jqy.yu
                            public final HandlerThread ouw(String str2, int i10) {
                                return pno.ouw(str2, i10);
                            }
                        });
                        f13466lh = lhVar;
                        lhVar.f13214lh = new com.bytedance.sdk.openadsdk.jqy.ouw() { // from class: com.bytedance.sdk.openadsdk.vpp.ouw.2
                            @Override // com.bytedance.sdk.openadsdk.jqy.ouw
                            public final void lh() {
                                com.bytedance.sdk.openadsdk.vm.lh.lh(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.vpp.ouw.2.3
                                    @Override // com.bytedance.sdk.openadsdk.vm.yu
                                    public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                                        com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                                        ouwVar.f13464lh = "strategy_fetch";
                                        return ouwVar;
                                    }
                                });
                                zin.ouw(ouw.vt);
                            }

                            @Override // com.bytedance.sdk.openadsdk.jqy.ouw
                            public final void ouw() {
                                com.bytedance.sdk.openadsdk.vm.lh.ouw(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.vpp.ouw.2.1
                                    @Override // com.bytedance.sdk.openadsdk.vm.yu
                                    public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                                        com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                                        ouwVar.f13464lh = "strategy_fetch";
                                        return ouwVar;
                                    }
                                });
                            }

                            @Override // com.bytedance.sdk.openadsdk.jqy.ouw
                            public final void vt() {
                                com.bytedance.sdk.openadsdk.vm.lh.vt(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.vpp.ouw.2.2
                                    @Override // com.bytedance.sdk.openadsdk.vm.yu
                                    public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                                        com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                                        ouwVar.f13464lh = "strategy_fetch";
                                        return ouwVar;
                                    }
                                });
                                com.bytedance.sdk.openadsdk.le.ouw.ouw().vt();
                                final com.bytedance.sdk.openadsdk.zin.ouw.lh lhVarOuw = com.bytedance.sdk.openadsdk.zin.ouw.lh.ouw();
                                if (ra.ouw()) {
                                    ko.vt("PlayableResManager", "updatePlayableResFromNet");
                                    long jCurrentTimeMillis = System.currentTimeMillis() - com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("pag_plb_config", "last_update_time", 0L);
                                    final String strOuw = ouw.ouw("plb_res", "");
                                    long jOuw = ouw.ouw("plb_res_fetch_interval", 3600000);
                                    if (jOuw <= 0 || jOuw > 259200000) {
                                        jOuw = 3600000;
                                    }
                                    if (jCurrentTimeMillis < jOuw || TextUtils.isEmpty(strOuw)) {
                                        ko.vt("PlayableResManager", "needn't update");
                                    } else {
                                        int iOuw = ouw.ouw("plb_res_delay_fetch_time", 0);
                                        if (iOuw <= 0) {
                                            lhVarOuw.ouw(strOuw);
                                        } else {
                                            jg.vt().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.zin.ouw.lh.3
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    lh.this.ouw(strOuw);
                                                }
                                            }, iOuw);
                                        }
                                    }
                                }
                                zin.vt();
                                HashMap map = new HashMap();
                                String strOuw2 = ouw.ouw(PglSSConfig.CUSTOMINFO_KEY_SEC_CONFIG_STR, "");
                                if (!TextUtils.isEmpty(strOuw2)) {
                                    map.put(PglSSConfig.CUSTOMINFO_KEY_SEC_CONFIG_STR, strOuw2);
                                }
                                vt unused = vt.ouw.ouw;
                                vt.ouw(map);
                            }
                        };
                    } catch (Throwable th2) {
                        ko.lh("StrategyUtils", th2.getMessage());
                    }
                }
            }
        }
        return f13466lh;
    }

    public static boolean bly() {
        return ouw("iv_rv_top_bar_listen_new", 0) == 1;
    }

    private static boolean cf() {
        return ouw("ad_load_and_render_opt", a.f29888j, 0) == 1;
    }

    public static boolean le() {
        return ouw("jsb_opt_enable", 0) == 1;
    }

    public static boolean pno() {
        return ouw("iv_rv_listen_new_arch", 0) == 1;
    }

    public static boolean ra() {
        return ouw("no_call_close", 0) == 1;
    }

    public static int fkw() {
        if (!cf()) {
            return 0;
        }
        return ouw("ad_load_and_render_opt", "webview_preload_cache_v3", 0);
    }

    public static boolean lh() {
        if (!cf() || ouw("ad_load_and_render_opt", "sync_barrier_switch_opt", 0) != 1) {
            return false;
        }
        return true;
    }

    private static lh tlj() {
        return ouw(zih.ouw(), com.bytedance.sdk.openadsdk.core.bly.ouw().yu());
    }

    public static boolean vt() {
        if (!cf() || ouw("ad_load_and_render_opt", "thread_switch_opt", 0) != 1) {
            return false;
        }
        return true;
    }

    public static int yu() {
        if (!cf()) {
            return 0;
        }
        return ouw("ad_load_and_render_opt", "webview_preload_cache", 0);
    }

    public static int ouw(String str, int i10) {
        com.bytedance.sdk.openadsdk.jqy.vt vtVar;
        lh lhVarTlj = tlj();
        return (lhVarTlj == null || (vtVar = lhVarTlj.ouw) == null) ? i10 : vtVar.ouw(str, i10);
    }

    public static boolean ouw(String str, boolean z10) {
        com.bytedance.sdk.openadsdk.jqy.vt vtVar;
        lh lhVarTlj = tlj();
        return (lhVarTlj == null || (vtVar = lhVarTlj.ouw) == null) ? z10 : vtVar.ouw(str, z10);
    }

    public static String ouw(String str, String str2) {
        lh lhVarTlj = tlj();
        return lhVarTlj != null ? lhVarTlj.ouw(str, str2) : str2;
    }

    public static int ouw(String str, String str2, int i10) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String str3 = str + "_" + str2;
            ConcurrentHashMap<String, Object> concurrentHashMap = ouw;
            Object obj = concurrentHashMap.get(str3);
            if (obj != null && (obj instanceof Integer)) {
                return ((Integer) obj).intValue();
            }
            try {
                String strOuw = tlj().ouw(str, "");
                if (TextUtils.isEmpty(strOuw)) {
                    return i10;
                }
                int iOptInt = PangleVideoBridge.jsonObjectInit(strOuw).optInt(str2, i10);
                concurrentHashMap.put(str3, Integer.valueOf(iOptInt));
                return iOptInt;
            } catch (Throwable th2) {
                qbp.lh("StrategyUtils", th2.getMessage());
            }
        }
        return i10;
    }

    public static String ouw(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String str4 = str + "_" + str2;
            ConcurrentHashMap<String, Object> concurrentHashMap = ouw;
            Object obj = concurrentHashMap.get(str4);
            if (obj != null && (obj instanceof String)) {
                return (String) obj;
            }
            try {
                String strOuw = tlj().ouw(str, "");
                if (TextUtils.isEmpty(strOuw)) {
                    return str3;
                }
                String strOptString = PangleVideoBridge.jsonObjectInit(strOuw).optString(str2, str3);
                concurrentHashMap.put(str4, strOptString);
                return strOptString;
            } catch (Throwable th2) {
                qbp.lh("StrategyUtils", th2.getMessage());
            }
        }
        return str3;
    }

    public static void ouw() {
        lh lhVarTlj = tlj();
        if (lhVarTlj != null) {
            lhVarTlj.ouw();
        }
    }
}
