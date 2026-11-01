package com.bytedance.sdk.openadsdk;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.exifinterface.media.ExifInterface;
import com.apm.insight.AttachUserData;
import com.apm.insight.CrashType;
import com.apm.insight.CustomRequestHeader;
import com.apm.insight.MonitorCrash;
import com.apm.insight.Npth;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.pno.pno;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.core.ex;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.ryl;
import com.bytedance.sdk.openadsdk.core.settings.cf;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.multipro.yu.yu;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.ironsource.C3426d4;
import com.ironsource.C3784xa;
import com.ironsource.Q6;
import com.ironsource.Y1;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class ApmHelper {
    private static vt fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private static ouw f11989le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private static String f11990lh;
    private static volatile boolean ouw;
    private static final AtomicBoolean vt = new AtomicBoolean(false);
    private static boolean yu;

    public interface vt {
        void ouw(String str, String str2, Throwable th2);
    }

    public static class ouw {

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public final Throwable f11991lh;
        public final String ouw;
        public final String vt;

        public ouw(String str, String str2, Throwable th2) {
            this.ouw = str;
            this.vt = str2;
            this.f11991lh = th2;
        }
    }

    @NonNull
    public static Pair<String, String> generateRequestHeader() {
        String string = "";
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Q6.V0, com.bytedance.sdk.openadsdk.qbp.ouw.vt.ouw.ouw().vt());
            jSONObject.put("ipv6", yu.vt("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, ""));
            jSONObject.put("region", zih.yu().zin());
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        JSONObject jSONObjectEncryptType4WithNoWrapBase64 = PangleEncryptManager.encryptType4WithNoWrapBase64(jSONObject, new ex(PangleEncryptConstant.CryptDataScene.UNKNOWN));
        String str = "0";
        if (jSONObjectEncryptType4WithNoWrapBase64 != null) {
            int iOptInt = jSONObjectEncryptType4WithNoWrapBase64.optInt("cypher");
            if (iOptInt == 4) {
                string = jSONObjectEncryptType4WithNoWrapBase64.optString("message");
                str = "4";
            } else if (iOptInt == 3) {
                string = jSONObjectEncryptType4WithNoWrapBase64.optString("message");
                str = ExifInterface.GPS_MEASUREMENT_3D;
            } else {
                string = jSONObject.toString();
            }
        }
        return new Pair<>(str, string);
    }

    public static void initApm(final Context context, final InitConfig initConfig) {
        if (vt.compareAndSet(false, true) && !ouw) {
            bs.ouw(new pno("init-apm") { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (!ApmHelper.ouw) {
                        cf cfVarYu = zih.yu();
                        int iOuw = cfVarYu.f13057ra.ouw("perf_con_apm", 100);
                        boolean unused = ApmHelper.yu = iOuw != 0 && (iOuw < 0 || iOuw >= 100 || iOuw > ((int) (Math.random() * 100.0d)));
                        String strQbp = uoy.qbp();
                        if (ApmHelper.yu && !TextUtils.isEmpty(strQbp)) {
                            String unused2 = ApmHelper.f11990lh = initConfig.getAppId();
                            String[] strArr = {"com.bytedance.sdk.component", "com.bytedance.sdk.mediation", BuildConfig.LIBRARY_PACKAGE_NAME, "com.com.bytedance.overseas.sdk", "com.pgl.ssdk", "com.bykv.vk", "com.iab.omid.library.bytedance2", "com.bytedance.adsdk"};
                            String strOuw = ryl.ouw(context);
                            try {
                                Npth.setCrashWaitTime(com.bytedance.sdk.openadsdk.vpp.ouw.ouw("apm_crash_wait_time", 10000));
                                Npth.enableLoopMonitor(false);
                                Npth.enableAnrInfo(false);
                                Npth.enableNativeDump(false);
                                Npth.enableActivityDump(false);
                                Npth.enableMessageDump(false);
                                MonitorCrash.setCustomRequestHeaderCallback(new CustomRequestHeader() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.1
                                    @Override // com.apm.insight.CustomRequestHeader
                                    public final void addRequestHeader(HttpURLConnection httpURLConnection) {
                                        Pair<String, String> pairGenerateRequestHeader = ApmHelper.generateRequestHeader();
                                        httpURLConnection.setRequestProperty("cypher", (String) pairGenerateRequestHeader.first);
                                        httpURLConnection.setRequestProperty("transfer-param", (String) pairGenerateRequestHeader.second);
                                        httpURLConnection.setRequestProperty("x-pangle-target-idc", zih.yu().lso());
                                    }
                                });
                                final MonitorCrash monitorCrashInitSDK = MonitorCrash.initSDK(context, "10000001", 7808L, BuildConfig.VERSION_NAME, strArr);
                                monitorCrashInitSDK.setCustomDataCallback(new AttachUserData() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.2
                                    @Override // com.apm.insight.AttachUserData
                                    @Nullable
                                    public final Map<? extends String, ? extends String> getUserData(CrashType crashType) {
                                        Map<? extends String, ? extends String> mapLh = ApmHelper.lh();
                                        if (mapLh.containsKey("render_type")) {
                                            monitorCrashInitSDK.addTags("render_type", mapLh.get("render_type"));
                                        } else {
                                            monitorCrashInitSDK.addTags("render_type", "-2");
                                        }
                                        return mapLh;
                                    }
                                });
                                if (cfVarYu.pno.ouw("perf_con_apm_native", Integer.MAX_VALUE) == 1) {
                                    monitorCrashInitSDK.config().setSoList(new String[]{"libnms.so", "libtobEmbedPagEncrypt.so", "tt_ugen_layout.so"});
                                }
                                monitorCrashInitSDK.config().setDeviceId(strOuw);
                                monitorCrashInitSDK.setReportUrl(strQbp);
                                monitorCrashInitSDK.addTags("host_appid", ApmHelper.f11990lh);
                                monitorCrashInitSDK.addTags("sdk_version", BuildConfig.VERSION_NAME);
                                vt unused3 = ApmHelper.fkw = new vt() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.3
                                    @Override // com.bytedance.sdk.openadsdk.ApmHelper.vt
                                    public final void ouw(String str, String str2, Throwable th2) {
                                        monitorCrashInitSDK.reportCustomErr(str, str2, th2);
                                    }
                                };
                                boolean unused4 = ApmHelper.ouw = true;
                                ApmHelper.vt(strOuw, strQbp);
                                ouw ouwVar = ApmHelper.f11989le;
                                ouw unused5 = ApmHelper.f11989le = null;
                                if (ouwVar != null) {
                                    ApmHelper.fkw.ouw(ouwVar.ouw, ouwVar.vt, ouwVar.f11991lh);
                                }
                            } catch (Throwable unused6) {
                                ko.yu("ApmHelper", "init Apm fail or not include Apm module");
                                boolean unused7 = ApmHelper.ouw = false;
                            }
                        }
                    }
                    ApmHelper.vt.set(false);
                }
            });
        }
    }

    public static boolean isIsInit() {
        return ouw;
    }

    public static /* synthetic */ Map lh() {
        HashMap map = new HashMap();
        vpp vppVarVt = com.bytedance.sdk.openadsdk.utils.vt.vt();
        if (vppVarVt != null) {
            map.put("adType", String.valueOf(vppVarVt.lna));
            if (vppVarVt.zu < 0) {
                JSONObject jSONObjectFak = vppVarVt.fak();
                if (jSONObjectFak != null) {
                    vppVarVt.zu = jSONObjectFak.optLong(CreativeInfo.f44321c, 0L);
                } else {
                    vppVarVt.zu = 0L;
                }
            }
            map.put(C3784xa.f31580b, String.valueOf(vppVarVt.zu));
            map.put("cid", vppVarVt.pv);
            map.put("reqId", vppVarVt.ux());
            map.put("rit", vppVarVt.yu(Y1.f27894f));
            int i10 = vppVarVt.kfa;
            if (vppVarVt.rn() != 2) {
                i10 = -1;
            }
            map.put("render_type", String.valueOf(i10));
        }
        return map;
    }

    public static void reportCustomError(String str, String str2, Throwable th2) {
        vt vtVar = fkw;
        if (vtVar != null) {
            vtVar.ouw(str, str2, th2);
        } else {
            f11989le = new ouw(str, str2, th2);
        }
    }

    public static void reportPvFromBackGround() {
        if (yu) {
            vt(ryl.ouw(zih.ouw()), uoy.qbp());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void vt(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        zih.lh().vt(vt(str), "https://" + str2 + "/monitor/collect/c/session?version_code=7808&device_platform=android&aid=10000001");
    }

    private static JSONObject vt(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("sdk_version", BuildConfig.VERSION_NAME);
            jSONObject3.put("host_app_id", f11990lh);
            jSONObject2.putOpt("custom", jSONObject3);
            jSONObject2.put(Q6.F, C3426d4.f28386d);
            jSONObject2.put(CommonUrlParts.OS_VERSION, Build.VERSION.RELEASE);
            jSONObject2.put("device_model", Build.MODEL);
            jSONObject2.put("device_brand", Build.BRAND);
            jSONObject2.put("sdk_version_name", "0.0.5");
            jSONObject2.put(C3784xa.f31580b, "10000001");
            jSONObject2.put("update_version_code", BuildConfig.VERSION_CODE);
            jSONObject2.put("bd_did", str);
            jSONObject.putOpt("apm_id", "20000001");
            jSONObject.putOpt("header", jSONObject2);
            jSONObject.putOpt("local_time", Long.valueOf(System.currentTimeMillis()));
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(new JSONObject().put("local_time_ms", System.currentTimeMillis()));
            jSONObject.putOpt("launch", jSONArray);
        } catch (JSONException e10) {
            qbp.lh("ApmHelper", e10.getMessage());
        }
        return jSONObject;
    }
}
