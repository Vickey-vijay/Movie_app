package com.bytedance.sdk.openadsdk.pno;

import android.app.Application;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.content.pm.ShortcutManager;
import android.os.Build;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.webkit.WebView;
import com.bytedance.sdk.component.adexpress.ouw.vt.fkw;
import com.bytedance.sdk.component.pno.le;
import com.bytedance.sdk.component.pno.pno;
import com.bytedance.sdk.component.pno.tlj;
import com.bytedance.sdk.component.utils.jqy;
import com.bytedance.sdk.component.utils.od;
import com.bytedance.sdk.component.utils.tc;
import com.bytedance.sdk.component.utils.vpp;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.InitConfig;
import com.bytedance.sdk.openadsdk.api.bidding.PAGBiddingRequest;
import com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory;
import com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory;
import com.bytedance.sdk.openadsdk.api.factory.SDKTypeConfig;
import com.bytedance.sdk.openadsdk.api.init.PAGConfig;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.bytedance.sdk.openadsdk.core.bly;
import com.bytedance.sdk.openadsdk.core.jg;
import com.bytedance.sdk.openadsdk.core.ko;
import com.bytedance.sdk.openadsdk.core.mwh;
import com.bytedance.sdk.openadsdk.core.pd;
import com.bytedance.sdk.openadsdk.core.ryl;
import com.bytedance.sdk.openadsdk.core.settings.cf;
import com.bytedance.sdk.openadsdk.core.settings.yu;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.tc.vt.ra;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.ex;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.qbp;
import com.bytedance.sdk.openadsdk.utils.rn;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.bytedance.sdk.openadsdk.utils.uq;
import com.bytedance.sdk.openadsdk.utils.vm;
import com.bytedance.sdk.openadsdk.vm.lh;
import com.bytedance.sdk.openadsdk.yu.ouw.vt;
import com.ironsource.C3426d4;
import com.ironsource.Q6;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class ouw {
    public static final List<PAGSdk.PAGInitCallback> ouw = new ArrayList();
    public static float vt = 1.0f;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private static long f13293lh = 0;

    private static void fkw(final Context context, final InitConfig initConfig) {
        SystemClock.elapsedRealtime();
        bs.ouw(new pno("init_sync") { // from class: com.bytedance.sdk.openadsdk.pno.ouw.10
            @Override // java.lang.Runnable
            public final void run() {
                jg.ouw(initConfig.getData());
                com.bytedance.sdk.openadsdk.vpp.ouw.ouw(context, initConfig.getAppId());
                com.bytedance.sdk.openadsdk.vpp.ouw.ouw();
                lh.ouw();
                lh.vt();
                new rn();
                fkw.ouw(qbp.ouw() * 10);
                vt.ouw(context, initConfig.isSupportMultiProcess());
                ko.ouw().vt();
                com.bytedance.sdk.openadsdk.core.tlj.lh.ouw();
                com.bytedance.sdk.openadsdk.ex.ouw.ouw(new com.bytedance.sdk.openadsdk.ex.ouw.InterfaceC0141ouw() { // from class: com.bytedance.sdk.openadsdk.pno.ouw.10.1
                });
                cf.fkw = cf.vt(context);
                ra.vt();
                com.bykv.vk.openvk.ouw.ouw.vt.ouw.ouw(zih.yu().bs());
                com.bykv.vk.openvk.ouw.ouw.vt.ouw.ouw(CacheDirFactory.getICacheDir(0));
                cf cfVarYu = zih.yu();
                if (!cfVarYu.ksc()) {
                    synchronized (cfVarYu) {
                        if (!cfVarYu.ksc()) {
                            cfVarYu.lh();
                            cfVarYu.rn();
                        }
                    }
                }
                DeviceUtils.tlj();
                ouw.ouw(context);
                PAGSdk.getBiddingToken();
                le.ouw(true);
                le.ouw(new com.bytedance.sdk.openadsdk.rn.vt.ouw());
                DeviceUtils.ouw(context);
                DeviceUtils.ra(context);
                DeviceUtils.pno(context);
                com.bytedance.sdk.openadsdk.rn.ouw.ouw();
                yu.ouw();
                com.bytedance.sdk.openadsdk.rn.lh.lh();
                uoy.fkw(context);
                com.bytedance.sdk.openadsdk.yu.lh.ouw();
                ouw.yu();
                com.bytedance.sdk.openadsdk.core.tlj.lh.vt();
                com.bytedance.sdk.openadsdk.core.fkw.ouw.ouw().vt();
                com.bytedance.sdk.component.pno.lh.lh.ouw(jg.vt());
                com.bytedance.sdk.component.utils.vt.ouw(new com.bytedance.sdk.component.utils.vt.ouw() { // from class: com.bytedance.sdk.openadsdk.pno.ouw.10.2
                    @Override // com.bytedance.sdk.component.utils.vt.ouw
                    public final boolean ouw() {
                        return com.bytedance.sdk.openadsdk.vpp.ouw.ouw("start_activity_async", 0) == 1;
                    }

                    @Override // com.bytedance.sdk.component.utils.vt.ouw
                    public final boolean vt() {
                        return com.bytedance.sdk.openadsdk.vpp.ouw.ouw("start_act_asy", 0) == 1;
                    }

                    @Override // com.bytedance.sdk.component.utils.vt.ouw
                    public final ExecutorService lh() {
                        return bs.bly();
                    }
                });
                uoy.yu();
                jqy.ouw(new jqy.vt() { // from class: com.bytedance.sdk.openadsdk.pno.ouw.10.3
                    @Override // com.bytedance.sdk.component.utils.jqy.vt
                    public final void ouw(final String str, final jqy.ouw ouwVar) {
                        com.bytedance.sdk.openadsdk.rn.lh.ouw(str, false, new com.bytedance.sdk.openadsdk.rn.vt() { // from class: com.bytedance.sdk.openadsdk.pno.ouw.10.3.1
                            @Override // com.bytedance.sdk.openadsdk.rn.vt
                            public final com.bytedance.sdk.openadsdk.rn.ouw.lh ouw() throws Exception {
                                return com.bytedance.sdk.openadsdk.rn.ouw.yu.vt().ouw(str).vt(ouwVar.vt());
                            }
                        });
                    }
                });
                od.ouw(com.bytedance.sdk.openadsdk.vpp.ouw.ouw("webview_reuse_config", (String) null));
                com.bykv.vk.openvk.ouw.ouw.vt.ouw.ouw(com.bytedance.sdk.openadsdk.vpp.ouw.ouw("video_play_config", (String) null));
            }
        });
    }

    public static void lh() {
        if (com.bytedance.sdk.openadsdk.common.le.ouw()) {
            return;
        }
        try {
            String strYu = bly.ouw().yu();
            if (TextUtils.isEmpty(strYu)) {
                return;
            }
            ApmHelper.initApm(zih.ouw(), new PAGConfig.Builder().appId(strYu).build());
        } catch (Exception unused) {
        }
    }

    public static void vt() {
        zih.yu();
        com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("ttopenadsdk", "a", 0);
        com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("sp_global_file", "a", 0);
        com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("sp_global_privacy", "a", 0);
        com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("sp_global_app_id", "a", 0);
        com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("sp_global_icon_id", "a", 0);
        com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("tpl_fetch_model", "a", 0);
        com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("tt_sp", "a", 0);
        com.bytedance.sdk.openadsdk.multipro.yu.yu.vt("pag_sp_bad_par", "did");
        com.bytedance.sdk.openadsdk.multipro.yu.yu.vt("pag_sp_bad_par", Q6.V0);
    }

    private static void yu(Context context, InitConfig initConfig) {
        if (com.bytedance.sdk.openadsdk.core.settings.ra.ouw()) {
            le.le();
            com.bytedance.sdk.component.pno.fkw.ouw(new tlj() { // from class: com.bytedance.sdk.openadsdk.pno.ouw.9
                @Override // com.bytedance.sdk.component.pno.tlj
                public final com.bytedance.sdk.component.pno.bly ouw(int i10, String str) {
                    return new com.bytedance.sdk.component.pno.bly(i10, str) { // from class: com.bytedance.sdk.openadsdk.pno.ouw.9.1
                        @Override // com.bytedance.sdk.component.pno.bly, java.util.concurrent.ThreadFactory
                        public final Thread newThread(Runnable runnable) {
                            if (com.bytedance.sdk.component.pno.bly.yu) {
                                return null;
                            }
                            int iRrs = cf.vt().rrs();
                            if (iRrs < -524288 || iRrs >= 0) {
                                return super.newThread(runnable);
                            }
                            Thread thread = new Thread(this.ouw, runnable, this.vt, iRrs);
                            if (thread.isDaemon()) {
                                thread.setDaemon(false);
                            }
                            int i11 = this.f11885lh;
                            if (i11 > 10 || i11 <= 0) {
                                this.f11885lh = 5;
                            }
                            thread.setPriority(this.f11885lh);
                            return thread;
                        }
                    };
                }
            });
            com.bytedance.sdk.openadsdk.multipro.lh.ouw(context);
            com.bytedance.sdk.openadsdk.ra.vt.lh();
            jg.vt.set(true);
            try {
                com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().ouw(new com.bytedance.sdk.openadsdk.tlj.ouw());
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.qbp.lh("PAGSdk", e10.getMessage());
            }
            vt(initConfig);
            lh(context, initConfig);
            com.bykv.vk.openvk.ouw.ouw.ouw.lh.ouw(context, null);
            com.bykv.vk.openvk.ouw.ouw.ouw.lh.le();
            com.bykv.vk.openvk.ouw.ouw.ouw.lh.ouw(initConfig.isSupportMultiProcess());
            com.bykv.vk.openvk.ouw.ouw.ouw.lh.ouw(com.bytedance.sdk.openadsdk.th.vt.ouw().vt().fkw());
        }
    }

    private static void fkw() {
        jg.ouw(1);
        try {
            List<PAGSdk.PAGInitCallback> list = ouw;
            synchronized (list) {
                Iterator<PAGSdk.PAGInitCallback> it = list.iterator();
                while (it.hasNext()) {
                    PAGSdk.PAGInitCallback next = it.next();
                    if (next != null) {
                        it.remove();
                        next.success();
                    }
                }
            }
            lh.vt(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.pno.ouw.2
                @Override // com.bytedance.sdk.openadsdk.vm.yu
                public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                    com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                    ouwVar.ouw(C3426d4.a.f28413f);
                    return ouwVar;
                }
            });
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.qbp.yu(th2.getMessage(), new Object[0]);
        }
    }

    public static final void ouw() {
        try {
            com.bytedance.sdk.component.vt.ouw(new com.bytedance.sdk.component.vt.ouw() { // from class: com.bytedance.sdk.openadsdk.pno.ouw.1
                @Override // com.bytedance.sdk.component.vt.ouw
                public final ExecutorService ouw() {
                    return bs.fkw();
                }

                @Override // com.bytedance.sdk.component.vt.ouw
                public final HandlerThread ouw(String str) {
                    return com.bytedance.sdk.component.utils.pno.ouw(str, -2);
                }
            });
            bs.ouw(new pno("tt_init_memory_data") { // from class: com.bytedance.sdk.openadsdk.pno.ouw.4
                @Override // java.lang.Runnable
                public final void run() {
                    com.bytedance.sdk.openadsdk.qbp.ouw.vt.ouw.ouw().ouw(false);
                    ouw.lh();
                    ouw.vt();
                }
            });
            jg.ouw(System.currentTimeMillis());
            jg.vt();
            com.bytedance.sdk.component.bly.le.setWebViewProvider(new com.bytedance.sdk.component.bly.le.yu() { // from class: com.bytedance.sdk.openadsdk.pno.ouw.5
                @Override // com.bytedance.sdk.component.bly.le.yu
                public final WebView ouw(Context context, AttributeSet attributeSet, com.bytedance.sdk.component.bly.le.lh lhVar) {
                    if (od.vt(lhVar)) {
                        return od.vt(context, attributeSet, lhVar);
                    }
                    if (!(context instanceof MutableContextWrapper)) {
                        context = context.getApplicationContext();
                    }
                    try {
                        return new com.bytedance.sdk.component.bly.fkw(context, attributeSet);
                    } catch (Exception unused) {
                        return new com.bytedance.sdk.component.bly.fkw(context, attributeSet);
                    }
                }
            });
        } catch (Throwable th2) {
            Log.i("PAGSdk", th2.getMessage());
        }
    }

    private static void lh(Context context, InitConfig initConfig) {
        jg.ouw = true;
        pd.ouw().ouw(initConfig.getAppId()).vt(initConfig.getGdpr()).fkw(initConfig.getPA()).yu(tc.ouw(context)).ouw(initConfig.getTitleBarTheme()).lh(initConfig.getAdxId());
        bly.zih();
        if (initConfig instanceof PAGConfig) {
            pd.ouw().lh(((PAGConfig) initConfig).getDebugLog() ? 1 : 0);
        }
        try {
            if (((PAGConfig) initConfig).getDebugLog()) {
                pd.ouw().ouw();
                vm.ouw();
            }
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.component.utils.bly.ouw();
    }

    public static void ouw(Context context) {
        com.bytedance.sdk.openadsdk.core.ouw.ouw.ouw(context);
        uq.ouw();
        osn.ouw(context);
        com.bytedance.sdk.openadsdk.core.lh.ouw();
        com.bytedance.sdk.openadsdk.core.lh.ouw(CommonUrlParts.UUID, ex.ouw());
        zih.fkw();
        String strOuw = ryl.ouw(context);
        com.bytedance.sdk.openadsdk.core.tlj.lh.vt(strOuw);
        vt.ouw(strOuw, true);
        com.bytedance.sdk.component.adexpress.ouw.vt.vt.ouw();
        com.bytedance.sdk.openadsdk.core.mwh.lh.ouw.ouw().vt();
        try {
            float f10 = Settings.System.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
            vt = f10;
            if (f10 <= 0.0f) {
                vt = 1.0f;
            }
        } catch (Throwable unused) {
            vt = 1.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void vt(Context context, InitConfig initConfig) {
        long jElapsedRealtime;
        try {
            if (PAGSdk.isInitSuccess()) {
                fkw();
                return;
            }
            yu(context, initConfig);
            jElapsedRealtime = SystemClock.elapsedRealtime() - f13293lh;
            fkw();
            fkw(context, initConfig);
            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - f13293lh;
            ouw(context, PAGSdk.isInitSuccess(), initConfig, jElapsedRealtime2, jElapsedRealtime);
            com.bytedance.sdk.component.utils.ko.vt("PAGSdk", "init exec init sdk sdkInitTime=", Long.valueOf(jElapsedRealtime), " duration=", Long.valueOf(jElapsedRealtime2));
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ko.lh("PAGSdk", "init throwable " + th2.getMessage());
            com.bytedance.sdk.component.utils.qbp.lh("PAGSdk", th2.getMessage());
            long jElapsedRealtime3 = SystemClock.elapsedRealtime() - f13293lh;
            ouw(4000, th2.getMessage());
            jElapsedRealtime = jElapsedRealtime3;
        }
    }

    public static /* synthetic */ void yu() {
        ShortcutManager shortcutManager;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                Context contextOuw = zih.ouw();
                if (contextOuw == null || (shortcutManager = (ShortcutManager) contextOuw.getSystemService(ShortcutManager.class)) == null) {
                    return;
                }
                bly.ouw().ouw(shortcutManager.isRequestPinShortcutSupported());
            } catch (Throwable unused) {
            }
        }
    }

    public static void ouw(final Context context, final InitConfig initConfig, PAGSdk.PAGInitCallback pAGInitCallback) {
        Context applicationContext;
        f13293lh = SystemClock.elapsedRealtime();
        zih.vt(context);
        if (pAGInitCallback != null) {
            List<PAGSdk.PAGInitCallback> list = ouw;
            synchronized (list) {
                if (!list.contains(pAGInitCallback)) {
                    list.add(pAGInitCallback);
                    if (jg.yu() == 3) {
                        return;
                    }
                }
            }
        }
        if (com.bytedance.sdk.openadsdk.common.le.ouw()) {
            ouw(-1, "DisableSDK is called, interrupt initialization");
            return;
        }
        if (PAGSdk.isInitSuccess()) {
            fkw();
            vt(initConfig);
            return;
        }
        if (initConfig == null) {
            ouw(4000, "PAGConfig is null, please check.");
            return;
        }
        jg.ouw(3);
        int pa2 = initConfig.getPA();
        if (pa2 < -1 || pa2 > 1) {
            ouw(10004, com.bytedance.sdk.openadsdk.core.pno.ouw(10004));
            return;
        }
        if (context == null) {
            ouw(4000, "Context is null, please check. ");
            return;
        }
        if (!(context instanceof Application) && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        if (!TextUtils.isEmpty(initConfig.getPackageName())) {
            vpp.ouw(initConfig.getPackageName());
            com.bytedance.adsdk.ugeno.ra.yu.ouw(initConfig.getPackageName());
        } else {
            vpp.ouw((String) null);
            com.bytedance.adsdk.ugeno.ra.yu.ouw(null);
        }
        zih.vt(context);
        if (initConfig.isSupportMultiProcess()) {
            com.bytedance.sdk.openadsdk.multipro.vt.ouw();
        } else {
            com.bytedance.sdk.openadsdk.multipro.vt.vt();
        }
        com.bytedance.sdk.openadsdk.core.bly.ryl.ouw();
        com.bytedance.sdk.openadsdk.core.cf.vt.ouw();
        ApmHelper.initApm(context, initConfig);
        try {
            bly.ouw(new mwh() { // from class: com.bytedance.sdk.openadsdk.pno.ouw.6
                @Override // com.bytedance.sdk.openadsdk.core.mwh
                public final void ouw(String str) {
                    ouw.ouw(4000, str);
                }
            });
            try {
                vpp.ouw(zih.ouw(), "tt_ad_logo_txt");
                if (vpp.yu(context, "tt_ad_logo") == 0) {
                    ouw(initConfig, pAGInitCallback);
                    return;
                }
                if (PAGSdk.isInitSuccess()) {
                    if (pAGInitCallback != null) {
                        fkw();
                        return;
                    }
                    return;
                }
                final com.bytedance.sdk.openadsdk.fkw.ouw ouwVar = new com.bytedance.sdk.openadsdk.fkw.ouw();
                SDKTypeConfig.setSdkTypeFactory(new ISDKTypeFactory() { // from class: com.bytedance.sdk.openadsdk.pno.ouw.7
                    @Override // com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory
                    public final IADTypeLoaderFactory createADTypeLoaderFactory(String str) {
                        return ouwVar;
                    }
                });
                if (!initConfig.isSupportMultiProcess()) {
                    vt(context, initConfig);
                } else {
                    com.bytedance.sdk.openadsdk.multipro.aidl.ouw.ouw().ouw(new com.bytedance.sdk.openadsdk.multipro.aidl.vt() { // from class: com.bytedance.sdk.openadsdk.pno.ouw.8
                        @Override // com.bytedance.sdk.openadsdk.multipro.aidl.vt
                        public final void ouw() {
                            jg.vt().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.pno.ouw.8.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    AnonymousClass8 anonymousClass8 = AnonymousClass8.this;
                                    ouw.vt(context, initConfig);
                                }
                            });
                        }
                    });
                    com.bytedance.sdk.openadsdk.multipro.aidl.ouw.ouw().lh();
                }
            } catch (Throwable unused) {
                ouw(initConfig, pAGInitCallback);
            }
        } catch (Throwable unused2) {
            ouw(4000, "Internal Error, setting exception. ");
        }
    }

    private static void vt(InitConfig initConfig) {
        if (initConfig == null) {
            return;
        }
        if (!TextUtils.isEmpty(initConfig.getData())) {
            bly.ouw().ouw(initConfig.getData());
        }
        bly.ouw().vt(((PAGConfig) initConfig).getDebugLog());
    }

    private static void ouw(InitConfig initConfig, PAGSdk.PAGInitCallback pAGInitCallback) {
        jg.ouw(2);
        if (pAGInitCallback != null) {
            if (initConfig instanceof PAGConfig) {
                ouw(4000, "resources not found, if you use aab please call PAGConfig.setPackageName");
            } else {
                ouw(4000, "resources not found, if you use aab please call TTAdConfig.setPackageName");
            }
        }
    }

    private static void ouw(final Context context, final boolean z10, final InitConfig initConfig, final long j10, final long j11) {
        com.bytedance.sdk.openadsdk.rn.lh.ouw();
        com.bytedance.sdk.openadsdk.rn.lh.ouw("pangle_sdk_init", false, new com.bytedance.sdk.openadsdk.rn.vt() { // from class: com.bytedance.sdk.openadsdk.pno.ouw.11
            @Override // com.bytedance.sdk.openadsdk.rn.vt
            public final com.bytedance.sdk.openadsdk.rn.ouw.lh ouw() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    bly.ouw();
                    boolean zVt = bly.vt();
                    jSONObject.put("duration", j10);
                    jSONObject.put("sdk_init_time", j11);
                    jSONObject.put("is_async", true);
                    jSONObject.put("is_multi_process", initConfig.isSupportMultiProcess());
                    jSONObject.put("is_debug", ouw.ouw(initConfig));
                    jSONObject.put("is_use_texture_view", initConfig.isUseTextureView());
                    jSONObject.put("is_activate_init", zVt);
                    jSONObject.put("minSdkVersion", uoy.lh(context));
                    jSONObject.put("targetSdkVersion", uoy.vt(context));
                    jSONObject.put("apm_is_init", ApmHelper.isIsInit());
                    jSONObject.put("is_success", z10);
                    jSONObject.put("support_hevc_levels", com.bykv.vk.openvk.ouw.ouw.ouw.ra.yu.ouw());
                    bly.ouw();
                    bly.lh();
                } catch (Exception e10) {
                    com.bytedance.sdk.component.utils.qbp.ouw("PAGSdk", "run: ", e10);
                }
                return com.bytedance.sdk.openadsdk.rn.ouw.yu.vt().ouw("pangle_sdk_init").vt(jSONObject.toString());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ouw(int i10, String str) {
        jg.ouw(2);
        try {
            List<PAGSdk.PAGInitCallback> list = ouw;
            synchronized (list) {
                Iterator<PAGSdk.PAGInitCallback> it = list.iterator();
                while (it.hasNext()) {
                    PAGSdk.PAGInitCallback next = it.next();
                    if (next != null) {
                        it.remove();
                        next.fail(i10, str);
                    }
                }
                lh.lh(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.pno.ouw.3
                    @Override // com.bytedance.sdk.openadsdk.vm.yu
                    public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                        com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                        ouwVar.ouw(C3426d4.a.f28413f);
                        return ouwVar;
                    }
                });
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.qbp.yu(th2.getMessage(), new Object[0]);
        }
    }

    public static String ouw(PAGBiddingRequest pAGBiddingRequest) {
        if (com.bytedance.sdk.openadsdk.common.le.ouw()) {
            return null;
        }
        return (zih.ouw() == null || pd.ouw() == null) ? "" : pd.ouw().ouw(pAGBiddingRequest);
    }

    public static /* synthetic */ boolean ouw(InitConfig initConfig) {
        return ((PAGConfig) initConfig).getDebugLog();
    }
}
