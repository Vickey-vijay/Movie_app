package com.bytedance.sdk.openadsdk.core.settings;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.applovin.impl.pc;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.ksc;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.component.utils.ryl;
import com.bytedance.sdk.component.utils.vm;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.jg;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.ironsource.C3605n2;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.safedk.android.internal.partials.PangleVideoBridge;
import com.vungle.ads.internal.signals.SignalManager;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class cf implements bly.ouw {
    private static String jae;
    public volatile boolean bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public int f13054cf;
    private final Runnable ex;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public final fkw.vt<ConcurrentHashMap<String, Integer>> f13055jg;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public final fkw.vt<Map<String, Integer>> f13056ko;
    private final fkw.vt<Set<String>> ksc;
    public final pno pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public final com.bytedance.sdk.openadsdk.core.settings.ouw f13057ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    public fkw.vt<JSONObject> f13058rn;
    public final BroadcastReceiver ryl;

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    private final Set<String> f13059tc;
    public int tlj;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    private Set<String> f13060vm;
    private boolean vpp;
    public fkw.vt<com.bytedance.sdk.openadsdk.yu.ouw.cf> zih;
    private final AtomicBoolean zin;
    public static final String ouw = pc.a("_", new CharSequence[]{"bus_con_collect", uoy.pd()});
    public static final String vt = pc.a("_", new CharSequence[]{"bus_con", uoy.pd(), uoy.uq(), "timeout"});

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public static final String f13052lh = pc.a("_", new CharSequence[]{"bus_con", uoy.pd(), uoy.uq(), "alpha"});
    public static final String yu = uoy.jqy();

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    private static final com.bytedance.sdk.component.pno.pno f13053th = new com.bytedance.sdk.component.pno.pno("TemplateReInitTask") { // from class: com.bytedance.sdk.openadsdk.core.settings.cf.1
        @Override // java.lang.Runnable
        public final void run() {
            com.bytedance.sdk.component.adexpress.ouw.vt.yu yuVarVt = com.bytedance.sdk.component.adexpress.ouw.vt.yu.vt();
            yuVarVt.f11582lh.set(true);
            yuVarVt.vt = false;
            yuVarVt.ouw.set(false);
            com.bytedance.sdk.component.adexpress.ouw.vt.yu.vt().f11582lh.set(false);
            com.bytedance.sdk.component.adexpress.ouw.vt.vt.vt();
            com.bytedance.sdk.component.adexpress.ouw.vt.yu.vt().lh();
        }
    };
    public static String fkw = "";

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public static String f13051le = "IABTCF_TCString";
    private static boolean qbp = false;
    private static final ConcurrentLinkedQueue<tlj.ouw> jqy = new ConcurrentLinkedQueue<>();
    public static final ConcurrentHashMap<String, Integer> mwh = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.settings.cf$9, reason: invalid class name */
    public class AnonymousClass9 extends BroadcastReceiver {
        private final Runnable vt = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.cf.9.1
            @Override // java.lang.Runnable
            public final void run() {
                bs.vt(new com.bytedance.sdk.component.pno.pno("LoadLocalData") { // from class: com.bytedance.sdk.openadsdk.core.settings.cf.9.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            cf.this.lh();
                        } catch (Exception unused) {
                        }
                    }
                });
            }
        };

        public AnonymousClass9() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, final Intent intent) {
            if (intent == null) {
                return;
            }
            bs.vt(new com.bytedance.sdk.component.pno.pno("setting_receiver") { // from class: com.bytedance.sdk.openadsdk.core.settings.cf.9.2
                @Override // java.lang.Runnable
                public final void run() {
                    String action = intent.getAction();
                    if ("_tryFetRemoDat".equals(action)) {
                        cf.this.ouw(intent.getIntExtra("_source", 0), intent.getBooleanExtra("_force", false));
                    } else if ("_dataChanged".equals(action)) {
                        com.bytedance.sdk.component.utils.bly.ouw().removeCallbacks(AnonymousClass9.this.vt);
                        com.bytedance.sdk.component.utils.bly.ouw().postDelayed(AnonymousClass9.this.vt, 10000L);
                    }
                }
            });
        }
    }

    public static final class ouw {
        public static final cf ouw = new cf(0);
    }

    public /* synthetic */ cf(byte b10) {
        this();
    }

    public static /* synthetic */ boolean cj() {
        qbp = true;
        return true;
    }

    @Nullable
    private static SharedPreferences lh(Context context) {
        try {
            return PreferenceManager.getDefaultSharedPreferences(context);
        } catch (Exception unused) {
            return null;
        }
    }

    public final boolean bly() {
        return this.pno.ouw("ad_revenue_enable", true);
    }

    public final boolean cf() {
        return this.pno.ouw("bus_con_url_check", 1) != 0;
    }

    @Nullable
    public final JSONObject fkw() {
        return (JSONObject) this.pno.ouw("digest", null, fkw.ouw);
    }

    public final boolean jg() {
        return this.pno.ouw("landingpage_new_style", -1) == 1;
    }

    public final int ko() {
        int iOuw = this.pno.ouw("fetch_tpl_timeout_ctrl", 3000);
        if (iOuw <= 0) {
            return 3000;
        }
        return iOuw;
    }

    public final String le() {
        return this.pno.ouw("ab_test_version", "");
    }

    public final String mwh() {
        return this.pno.ouw("ab_test_param", "");
    }

    public final String[] pd() {
        try {
            Set<String> set = this.f13060vm;
            if (set == null || set.size() == 0) {
                JSONArray jSONArray = new JSONArray(this.pno.ouw("gecko_hosts", (String) null));
                if (jSONArray.length() != 0) {
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        this.f13060vm.add(jSONArray.getString(i10));
                    }
                }
                Set<String> setOuw = pno.ouw(this.f13060vm);
                this.f13060vm = setOuw;
                if (setOuw != null) {
                    if (setOuw.size() == 0) {
                    }
                }
                return null;
            }
            return (String[]) this.f13060vm.toArray(new String[0]);
        } catch (Throwable unused) {
        }
    }

    public final boolean pno() {
        return this.pno.ouw("support_gzip", false);
    }

    public final int qbp() {
        return this.pno.ouw("ivrv_downward", 0);
    }

    public final boolean ra() {
        return this.pno.ouw("allow_blind_mode_request_ad", false);
    }

    public final void rn() {
        String strKn = kn();
        if (TextUtils.isEmpty(strKn)) {
            return;
        }
        if (strKn.equals("zh-Hant")) {
            ryl.ouw(zih.ouw(), "zh", "tw");
        } else {
            ryl.ouw(zih.ouw(), strKn, null);
        }
        try {
            TTAdDislikeToast.onResourceUpdated();
        } catch (Throwable th2) {
            qbp.lh("TTAD.SdkSettings", th2.getMessage());
        }
    }

    public final int ryl() {
        return this.pno.ouw("loadedCallbackOpportunity", 0);
    }

    public final String th() {
        return this.pno.ouw("policy_url", "");
    }

    public final String tlj() {
        return this.pno.ouw("bus_con_express_host", "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/");
    }

    public final String vm() {
        return this.pno.ouw("settings_url", "");
    }

    public final boolean vpp() {
        int iOuw = this.pno.ouw("privacy_ad_enable", Integer.MAX_VALUE);
        if (iOuw == 1) {
            return true;
        }
        if (iOuw == 0) {
            return false;
        }
        int iTc = uoy.tc();
        return iTc == 1 || iTc == 2 || iTc == 3;
    }

    public final int yu() {
        return this.pno.ouw("max_tpl_cnts", 100);
    }

    public final String zih() {
        return this.pno.ouw("ads_url", "");
    }

    public final String zin() {
        return this.pno.ouw("dc", "TX");
    }

    private cf() {
        this.f13060vm = Collections.synchronizedSet(new HashSet());
        this.f13057ra = new com.bytedance.sdk.openadsdk.core.settings.ouw();
        this.pno = new pno(new tlj.ouw() { // from class: com.bytedance.sdk.openadsdk.core.settings.cf.5
            @Override // com.bytedance.sdk.openadsdk.core.settings.tlj.ouw
            public final void ouw() {
                tlj.ouw[] ouwVarArr;
                cf.cj();
                if (cf.jqy != null && cf.jqy.size() != 0 && (ouwVarArr = (tlj.ouw[]) cf.jqy.toArray()) != null) {
                    for (tlj.ouw ouwVar : ouwVarArr) {
                        ouwVar.ouw();
                    }
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.settings.tlj.ouw
            public final void vt() {
                if (cf.jqy != null && !cf.jqy.isEmpty()) {
                    Iterator it = cf.jqy.iterator();
                    while (it.hasNext()) {
                        ((tlj.ouw) it.next()).vt();
                    }
                }
            }
        });
        this.zin = new AtomicBoolean(false);
        this.bly = false;
        this.tlj = 5000;
        this.f13054cf = 10;
        AnonymousClass9 anonymousClass9 = new AnonymousClass9();
        this.ryl = anonymousClass9;
        this.ex = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.cf.10
            @Override // java.lang.Runnable
            public final void run() {
                ko.vt("TTAD.SdkSettings", "auto fetch task active, try fetch remote data");
                cf.this.ouw(2, false);
                cf.this.uoy();
            }
        };
        this.f13055jg = new fkw.vt<ConcurrentHashMap<String, Integer>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.cf.11
            private static ConcurrentHashMap<String, Integer> vt(String str) {
                if (TextUtils.isEmpty(str)) {
                    return cf.mwh;
                }
                ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();
                try {
                    JSONObject jSONObjectJsonObjectInit = PangleVideoBridge.jsonObjectInit(str);
                    Iterator<String> itKeys = jSONObjectJsonObjectInit.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        int iOptInt = jSONObjectJsonObjectInit.optInt(next, 100);
                        if (!TextUtils.isEmpty(next) && iOptInt >= 0 && iOptInt <= 100) {
                            concurrentHashMap.put(next, Integer.valueOf(iOptInt));
                        }
                    }
                } catch (JSONException e10) {
                    Log.i("TTAD.SdkSettings", e10.getMessage());
                }
                return concurrentHashMap;
            }

            @Override // com.bytedance.sdk.openadsdk.core.settings.fkw.vt
            public final /* synthetic */ ConcurrentHashMap<String, Integer> ouw(String str) {
                return vt(str);
            }
        };
        this.f13056ko = new fkw.vt<Map<String, Integer>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.cf.12
            private static Map<String, Integer> vt(String str) {
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                try {
                    JSONObject jSONObjectJsonObjectInit = PangleVideoBridge.jsonObjectInit(str);
                    HashMap map = new HashMap(jSONObjectJsonObjectInit.length());
                    Iterator<String> itKeys = jSONObjectJsonObjectInit.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        if (!TextUtils.isEmpty(next)) {
                            int iOptInt = jSONObjectJsonObjectInit.optInt(next, 100);
                            if (iOptInt >= 0 && iOptInt <= 100) {
                                map.put(next, Integer.valueOf(iOptInt));
                            } else {
                                map.put(next, 100);
                            }
                        }
                    }
                    return map;
                } catch (Exception e10) {
                    qbp.yu("get applog rate from sp failed:" + e10.getMessage(), new Object[0]);
                    return null;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.settings.fkw.vt
            public final /* synthetic */ Map<String, Integer> ouw(String str) {
                return vt(str);
            }
        };
        this.f13059tc = new HashSet();
        this.ksc = new fkw.vt<Set<String>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.cf.2
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.bytedance.sdk.openadsdk.core.settings.fkw.vt
            /* JADX INFO: renamed from: vt, reason: merged with bridge method [inline-methods] */
            public Set<String> ouw(String str) {
                HashSet hashSet = new HashSet();
                if (!TextUtils.isEmpty(str)) {
                    try {
                        JSONObject jSONObjectJsonObjectInit = PangleVideoBridge.jsonObjectInit(str);
                        int iOptInt = jSONObjectJsonObjectInit.optInt("applog_count");
                        if (iOptInt >= 2 && iOptInt <= 100) {
                            cf.this.f13054cf = iOptInt;
                        }
                        int iOptInt2 = jSONObjectJsonObjectInit.optInt("applog_interval");
                        if (iOptInt2 >= 100 && iOptInt2 <= 30000) {
                            cf.this.tlj = iOptInt2;
                        }
                        JSONArray jSONArray = jSONObjectJsonObjectInit.getJSONArray("core_label_arr");
                        if (jSONArray != null) {
                            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                                String string = jSONArray.getString(i10);
                                if (!TextUtils.isEmpty(string)) {
                                    hashSet.add(string);
                                }
                            }
                        }
                    } catch (JSONException e10) {
                        Log.i("TTAD.SdkSettings", e10.getMessage());
                    }
                }
                return hashSet.size() == 0 ? new HashSet(Arrays.asList("click", C3605n2.f30216v, "insight_log", "mrc_show")) : hashSet;
            }
        };
        this.f13058rn = new fkw.vt<JSONObject>() { // from class: com.bytedance.sdk.openadsdk.core.settings.cf.3
            @Override // com.bytedance.sdk.openadsdk.core.settings.fkw.vt
            public final /* synthetic */ JSONObject ouw(String str) {
                return vt(str);
            }

            private static JSONObject vt(String str) {
                JSONObject jSONObjectJsonObjectInit;
                try {
                    jSONObjectJsonObjectInit = PangleVideoBridge.jsonObjectInit(str);
                } catch (Throwable th2) {
                    qbp.lh("TTAD.SdkSettings", th2.getMessage());
                    jSONObjectJsonObjectInit = null;
                }
                if (jSONObjectJsonObjectInit == null) {
                    return new JSONObject();
                }
                return jSONObjectJsonObjectInit;
            }
        };
        this.zih = new fkw.vt<com.bytedance.sdk.openadsdk.yu.ouw.cf>() { // from class: com.bytedance.sdk.openadsdk.core.settings.cf.4
            @Override // com.bytedance.sdk.openadsdk.core.settings.fkw.vt
            public final /* synthetic */ com.bytedance.sdk.openadsdk.yu.ouw.cf ouw(String str) {
                return vt(str);
            }

            private static com.bytedance.sdk.openadsdk.yu.ouw.cf.ouw ouw(JSONObject jSONObject) {
                if (jSONObject != null) {
                    return new com.bytedance.sdk.openadsdk.yu.ouw.cf.ouw(jSONObject.optInt("retry_times", -1), jSONObject.optInt("time_interval", -1));
                }
                return null;
            }

            private static com.bytedance.sdk.openadsdk.yu.ouw.cf vt(String str) {
                com.bytedance.sdk.openadsdk.yu.ouw.cf cfVar = new com.bytedance.sdk.openadsdk.yu.ouw.cf();
                try {
                    JSONObject jSONObjectJsonObjectInit = PangleVideoBridge.jsonObjectInit(str);
                    cfVar.yu = jSONObjectJsonObjectInit.optInt("enable_strategy", 0) == 1;
                    cfVar.vt = ouw(jSONObjectJsonObjectInit.optJSONObject("default"));
                    JSONObject jSONObjectOptJSONObject = jSONObjectJsonObjectInit.optJSONObject("adid_configs");
                    if (jSONObjectOptJSONObject != null) {
                        Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            com.bytedance.sdk.openadsdk.yu.ouw.cf.ouw ouwVarOuw = ouw(jSONObjectOptJSONObject.getJSONObject(next));
                            if (!TextUtils.isEmpty(next) && ouwVarOuw != null) {
                                cfVar.f13569lh.put(next, ouwVarOuw);
                            }
                        }
                    }
                } catch (Exception unused) {
                }
                return cfVar;
            }
        };
        try {
            Context contextOuw = zih.ouw();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("_dataChanged");
            if (Build.VERSION.SDK_INT >= 33) {
                contextOuw.registerReceiver(anonymousClass9, intentFilter, 4);
            } else {
                contextOuw.registerReceiver(anonymousClass9, intentFilter);
            }
        } catch (Exception e10) {
            qbp.ouw("TTAD.SdkSettings", "", e10);
        }
    }

    public static int bly(String str) {
        return lh.ouw(String.valueOf(str)).pno;
    }

    public static boolean cf(String str) {
        return lh.ouw(str).vpp == 0;
    }

    public static boolean fkw(String str) {
        return lh.ouw(str).f13078ra == 1;
    }

    public static boolean hun() {
        return qbp;
    }

    public static int jg(String str) {
        return lh.ouw(str).qbp;
    }

    private String kn() {
        return this.pno.ouw("force_language", "");
    }

    public static boolean ko(String str) {
        return lh.ouw(str).zin;
    }

    public static boolean le(String str) {
        return str == null || lh.ouw(str).f13072jg == 1;
    }

    public static boolean pno(String str) {
        try {
            return lh.ouw(str).jqy != null;
        } catch (Exception unused) {
            return false;
        }
    }

    @NonNull
    public static vt qbp(String str) {
        return lh.ouw(str);
    }

    public static int ra(String str) {
        return lh.ouw(str).f13071cf;
    }

    public static boolean ryl(String str) {
        if (str == null) {
            return true;
        }
        zih.ouw();
        return DeviceUtils.le() == 0 || lh.ouw(str).mwh == 1;
    }

    public static boolean th(String str) {
        zih.yu();
        return lh.ouw(str).f13073ko == 1;
    }

    public static boolean tlj(String str) {
        return bly(str) != 1;
    }

    public static String ub() {
        if (jae == null) {
            com.bytedance.sdk.openadsdk.core.lh.ouw();
            String strVt = com.bytedance.sdk.openadsdk.core.lh.vt("settings_host_from_meta", "");
            jae = strVt;
            if (strVt == null) {
                jae = "";
            }
        }
        return jae;
    }

    private long ucs() {
        long jOuw = this.pno.ouw("req_inter_min", 600000L);
        if (jOuw < 0 || jOuw > SignalManager.TWENTY_FOUR_HOURS_MILLIS) {
            return 600000L;
        }
        return jOuw;
    }

    public static int vm(String str) {
        return lh.ouw(str).jae;
    }

    private static void vt(int i10, boolean z10) {
        Context contextOuw = zih.ouw();
        if (contextOuw != null) {
            try {
                Intent intent = new Intent();
                intent.setPackage(contextOuw.getPackageName());
                intent.setAction("_tryFetRemoDat");
                intent.putExtra("_force", z10);
                intent.putExtra("_source", i10);
                contextOuw.sendBroadcast(intent);
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean yu(String str) {
        int i10 = lh.ouw(str).fkw;
        if (i10 != 1) {
            return i10 == 2 && ksc.ouw(zih.ouw(), 60000L) != 0;
        }
        return vm.ouw(zih.ouw());
    }

    public static int zih(String str) {
        return lh.ouw(str).ksc;
    }

    public final JSONObject bs() {
        return (JSONObject) this.pno.ouw("video_cache_config", null, fkw.ouw);
    }

    public final int cd() {
        int iOuw = this.pno.ouw("perf_con_webview_cache_count", 0);
        if (iOuw < 0) {
            return 0;
        }
        return iOuw;
    }

    public final boolean ex() {
        return this.pno.ouw("privacy_debug_unlock", 1) != 0;
    }

    public final Set<String> ey() {
        return (Set) this.pno.ouw("perf_con_applog_send", this.f13059tc, this.ksc);
    }

    public final long fak() {
        return this.pno.ouw("last_req_time", 0L);
    }

    public final com.bytedance.sdk.openadsdk.yu.ouw.cf fqk() {
        return (com.bytedance.sdk.openadsdk.yu.ouw.cf) this.pno.ouw("perf_con_track_url_strategy", com.bytedance.sdk.openadsdk.yu.ouw.cf.ouw, this.zih);
    }

    public final int fvf() {
        return this.pno.ouw("blank_detect_rate", 30);
    }

    public final boolean jae() {
        return this.pno.ouw("global_rate") == 1.0f;
    }

    public final boolean jqy() {
        boolean z10 = this.pno.ouw("bus_con_sec_type", Integer.MAX_VALUE) != 0;
        ko.vt("TTAD.SdkSettings", "secSdk type: ", Boolean.valueOf(z10));
        return z10;
    }

    public final boolean jvy() {
        return this.pno.ouw("perf_con_is_new_net_thread", 0) == 1;
    }

    public final boolean ksc() {
        return this.bly;
    }

    @WorkerThread
    public final synchronized void lh() {
        ko.vt("TTAD.SdkSettings", "loadLocalData: ");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z10 = !this.bly;
        this.f13057ra.ouw(this.bly);
        this.pno.ouw(this.bly);
        lh.ouw();
        this.bly = true;
        ko.ouw("TTAD.SdkSettings", "loadLocalData: finished, used", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime), "ms");
        if (z10) {
            jg.vt().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.cf.6
                @Override // java.lang.Runnable
                public final void run() {
                    if (bly.ouw()) {
                        cf.this.ouw(1, false);
                        cf.this.uoy();
                    } else {
                        com.bytedance.sdk.openadsdk.multipro.aidl.ouw.ouw();
                        com.bytedance.sdk.openadsdk.multipro.aidl.ouw.vt();
                    }
                }
            }, 1000L);
        }
    }

    public final String lso() {
        return this.pno.ouw("target_region", "");
    }

    public final JSONObject mwh(String str) {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObjectJsonObjectInit = PangleVideoBridge.jsonObjectInit(this.pno.ouw("core_settings", ""));
            try {
                jSONObjectJsonObjectInit.put("ad_slot_setting", lh.ouw(str).fvf);
                return jSONObjectJsonObjectInit;
            } catch (JSONException e10) {
                e = e10;
                jSONObject = jSONObjectJsonObjectInit;
                qbp.yu("TTAD.SdkSettings", "getCoreSettingJsonObj", e.getMessage());
                return jSONObject;
            }
        } catch (JSONException e11) {
            e = e11;
        }
    }

    public final boolean od() {
        return this.pno.ouw("read_video_from_cache", 1) == 1;
    }

    public final int rrs() {
        return this.pno.ouw("perf_con_thread_stack_size", 0);
    }

    public final boolean tc() {
        return this.pno.ouw("privacy_app_reg", true);
    }

    public final int uq() {
        int iOuw = this.pno.ouw("perf_con_webview_cache_count_v3", 0);
        if (iOuw < 0) {
            return 0;
        }
        return iOuw;
    }

    public final Set<String> ux() {
        return (Set) this.pno.ouw("privacy_fields_allowed", Collections.emptySet(), fkw.vt);
    }

    public final boolean zin(@NonNull String str) {
        Set set = (Set) this.pno.ouw("privacy_fields_allowed", Collections.emptySet(), fkw.vt);
        if (!set.isEmpty()) {
            return set.contains(str);
        }
        int iTc = uoy.tc();
        if (iTc != 1) {
            if (iTc != 2 && iTc != 3) {
                return false;
            }
            if (!"mcc".equals(str) && !"mnc".equals(str)) {
                return false;
            }
        }
        return true;
    }

    public static void ouw() {
        Context contextOuw;
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh() && (contextOuw = zih.ouw()) != null) {
            try {
                Intent intent = new Intent();
                intent.setPackage(contextOuw.getPackageName());
                intent.setAction("_dataChanged");
                contextOuw.sendBroadcast(intent);
            } catch (Throwable th2) {
                qbp.ouw("TTAD.SdkSettings", "", th2);
            }
        }
    }

    public static void vpp(String str) {
        if (str == null) {
            str = "";
        }
        String strUb = ub();
        if (strUb == null || !strUb.equals(str)) {
            com.bytedance.sdk.openadsdk.core.lh.ouw();
            com.bytedance.sdk.openadsdk.core.lh.ouw("settings_host_from_meta", str);
            jae = str;
            ouw.ouw.ouw(8, true);
        }
    }

    public final boolean osn() {
        if (!com.bytedance.sdk.component.adexpress.yu.vt.ouw(zih.ouw())) {
            return false;
        }
        return this.pno.ouw("support_rtl", false);
    }

    public final void uoy() {
        if (!bly.ouw()) {
            return;
        }
        jg.vt().removeCallbacks(this.ex);
        jg.vt().postDelayed(this.ex, ucs());
    }

    public static int rn(String str) {
        return lh.ouw(str).f13080tc;
    }

    public static String vt(Context context) {
        SharedPreferences sharedPreferencesLh;
        return (context == null || (sharedPreferencesLh = lh(context)) == null) ? "" : sharedPreferencesLh.getString(f13051le, "");
    }

    public static int ouw(Context context) {
        SharedPreferences sharedPreferencesLh;
        if (context == null || (sharedPreferencesLh = lh(context)) == null) {
            return -2;
        }
        if ((sharedPreferencesLh.getInt("IABTCF_CmpSdkID", Integer.MIN_VALUE) == Integer.MIN_VALUE && sharedPreferencesLh.getInt("IABTCF_CmpSdkVersion", Integer.MIN_VALUE) == Integer.MIN_VALUE) ? false : true) {
            return sharedPreferencesLh.getInt("IABTCF_gdprApplies", -1);
        }
        return -2;
    }

    public static cf vt() {
        return ouw.ouw;
    }

    public static boolean lh(String str) {
        return lh.ouw(str).f13076od;
    }

    public static int vt(int i10) {
        return lh.ouw(String.valueOf(i10)).vt;
    }

    public static int ouw(String str) {
        if (str == null) {
            return 0;
        }
        zih.yu();
        return lh.ouw(str).f13081th;
    }

    public static boolean vt(String str) {
        return lh.ouw(str).f13075lh == 1;
    }

    public static void ouw(JSONObject jSONObject, fkw.ouw ouwVar) {
        if (jSONObject.has("is_gdpr_user")) {
            int iOptInt = jSONObject.optInt("is_gdpr_user", -1);
            ouwVar.ouw("isGdprUser", (iOptInt == -1 || iOptInt == 1 || iOptInt == 0) ? iOptInt : -1);
        }
    }

    public final int ouw(String str, int i10) {
        Integer num;
        Map map = (Map) this.pno.ouw("perf_con_stats_rate", mwh, this.f13055jg);
        return (map == null || (num = (Integer) map.get(str)) == null || num.intValue() < 0 || num.intValue() > 100) ? i10 : num.intValue();
    }

    public static int ouw(int i10) {
        return lh.ouw(String.valueOf(i10)).f13077pd;
    }

    public final void ouw(@TTSdkSettings.FETCH_REQUEST_SOURCE int i10, boolean z10) {
        if (!jg.fkw() && i10 != 1 && i10 != 2) {
            if (z10) {
                this.vpp = true;
                return;
            }
            return;
        }
        try {
            if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.bly.ouw().yu())) {
                return;
            }
            if (this.vpp) {
                this.vpp = false;
                if (!z10) {
                    z10 = true;
                }
            }
            long jFak = fak();
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jUcs = ucs();
            long j10 = jCurrentTimeMillis - jFak;
            if (z10 || j10 >= jUcs) {
                if (!bly.ouw()) {
                    vt(i10, z10);
                } else if (this.zin.compareAndSet(false, true)) {
                    bs.vt((com.bytedance.sdk.component.pno.pno) new bly(this, this.pno, this.f13057ra));
                    jg.vt().removeCallbacks(this.ex);
                }
            }
        } catch (Throwable th2) {
            ko.ouw("TTAD.SdkSettings", "load sdk settings error: ", th2);
            ApmHelper.reportCustomError("settings request error", "settings", th2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.bly.ouw
    public final void ouw(boolean z10) {
        this.zin.set(false);
        uoy();
        if (z10) {
            HashMap map = new HashMap();
            Set<String> setUx = ux();
            if (setUx != null && !setUx.isEmpty()) {
                map.put(PglSSConfig.CUSTOMINFO_KEY_ALLOWED_FIELDS, setUx);
            }
            String strQbp = uoy.qbp();
            if (!TextUtils.isEmpty(strQbp)) {
                map.put(PglSSConfig.CUSTOMINFO_KEY_TRANSFER_HOST, strQbp);
            }
            map.put(PglSSConfig.CUSTOMINFO_KEY_TARGET_IDC, lso());
            com.bytedance.sdk.openadsdk.core.tlj.vt unused = com.bytedance.sdk.openadsdk.core.tlj.vt.ouw.ouw;
            com.bytedance.sdk.openadsdk.core.tlj.vt.ouw(map);
            ouw();
        }
    }

    public static void ouw(tlj.ouw ouwVar) {
        ConcurrentLinkedQueue<tlj.ouw> concurrentLinkedQueue = jqy;
        if (concurrentLinkedQueue.contains(ouwVar)) {
            return;
        }
        concurrentLinkedQueue.add(ouwVar);
    }
}
