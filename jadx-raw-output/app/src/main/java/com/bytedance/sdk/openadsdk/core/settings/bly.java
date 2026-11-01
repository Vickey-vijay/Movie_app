package com.bytedance.sdk.openadsdk.core.settings;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.ksc;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.pd;
import com.bytedance.sdk.openadsdk.core.ryl;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.multipro.aidl.BinderPoolService;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.jae;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.bytedance.sdk.openadsdk.utils.zin;
import com.inmobi.sdk.InMobiSdk;
import com.ironsource.C3426d4;
import com.ironsource.Q6;
import com.safedk.android.internal.partials.PangleVideoBridge;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class bly extends com.bytedance.sdk.component.pno.pno {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final Set<fkw> f13050lh;
    private final ouw ouw;
    private final pno vt;

    public interface ouw {
        void ouw(boolean z10);
    }

    public bly(ouw ouwVar, pno pnoVar, fkw... fkwVarArr) {
        super("SetF");
        HashSet hashSet = new HashSet();
        this.f13050lh = hashSet;
        this.ouw = ouwVar;
        this.vt = pnoVar;
        hashSet.addAll(Arrays.asList(fkwVarArr));
    }

    public static JSONObject ouw(int i10) {
        JSONObject jSONObject = new JSONObject();
        try {
            cf cfVarYu = zih.yu();
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("device_city", uoy.ex());
            com.bytedance.sdk.openadsdk.qbp.ouw.vt.ouw.ouw().ouw(jSONObject);
            jSONObject.put(InMobiSdk.IM_GDPR_CONSENT_GDPR_APPLIES, com.bytedance.sdk.openadsdk.core.bly.ouw().tlj());
            jSONObject.put("pa_consent", com.bytedance.sdk.openadsdk.core.bly.ouw().f12503ra);
            if (cfVarYu.zin("mcc")) {
                jSONObject.put("mcc", jae.vt());
            }
            Context contextOuw = zih.ouw();
            jSONObject.put("conn_type", uoy.ra(i10));
            jSONObject.put(Q6.F, 1);
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put(CommonUrlParts.OS_VERSION, Build.VERSION.RELEASE);
            jSONObject.put("aos_api_level", Build.VERSION.SDK_INT);
            jSONObject.put("sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("language", ryl.vt());
            jSONObject.put("time_zone", uoy.jae());
            jSONObject.put("package_name", uoy.ra());
            jSONObject.put(C3426d4.i.L, uoy.ouw() ? 1 : 2);
            jSONObject.put("app_version", uoy.bly());
            jSONObject.put("vendor", Build.MANUFACTURER);
            jSONObject.put(CommonUrlParts.UUID, ryl.lh(contextOuw));
            String strYu = com.bytedance.sdk.openadsdk.core.bly.ouw().yu();
            if (strYu != null) {
                jSONObject.put("app_id", strYu);
            }
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            jSONObject.put("ts", jCurrentTimeMillis);
            jSONObject.put("req_sign", com.bytedance.sdk.component.utils.fkw.ouw(strYu != null ? strYu.concat(String.valueOf(jCurrentTimeMillis)).concat(BuildConfig.VERSION_NAME) : ""));
            jSONObject.put("tcstring", cf.vt(contextOuw));
            jSONObject.put("tcf_gdpr", cf.ouw(contextOuw));
            jSONObject.put("lmt", DeviceUtils.lh());
            jSONObject.put("locale_language", DeviceUtils.yu());
            jSONObject.put("channel", C3426d4.i.Z);
            JSONObject jSONObjectFkw = cfVarYu.fkw();
            if (jSONObjectFkw != null) {
                jSONObject.put("digest", jSONObjectFkw);
            }
            jSONObject.put("data_time", cfVarYu.pno.ouw("data_time", 0L));
            jSONObject.put(CommonUrlParts.APP_SET_ID_SCOPE, yu.vt());
            jSONObject.put(CommonUrlParts.APP_SET_ID, yu.lh());
            jSONObject.put("installed_source", yu.yu());
            if (cfVarYu.zin(Q6.V0)) {
                jSONObject.put("did", ryl.ouw(zih.ouw()));
            }
            jSONObject.put(Q6.V0, com.bytedance.sdk.openadsdk.qbp.ouw.vt.ouw.ouw().vt());
            String strRa = com.bytedance.sdk.openadsdk.core.bly.ouw().ra();
            if (!TextUtils.isEmpty(strRa)) {
                jSONObject.put("mediation", strRa);
            }
            jSONObject.put(C3426d4.i.G, DeviceUtils.ouw(contextOuw, true));
            jSONObject.put("adx_id", com.bytedance.sdk.openadsdk.core.bly.ouw().vm());
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Log.d("TTAD.SdkSettingsFetch", "Start Try");
        int iOuw = ksc.ouw(zih.ouw(), 0L);
        if (iOuw == 0) {
            Log.d("TTAD.SdkSettingsFetch", "No net");
            this.ouw.ouw(false);
            return;
        }
        JSONObject jSONObjectOuw = ouw(iOuw);
        com.bytedance.sdk.component.ra.vt.yu yuVarOuw = com.bytedance.sdk.openadsdk.th.vt.ouw().ouw.ouw();
        try {
            yuVarOuw.ouw(com.bytedance.sdk.openadsdk.bly.lh.ouw(uoy.ouw("/api/ad/union/sdk/settings/", false, true)));
            yuVarOuw.vt("User-Agent", uoy.fkw());
        } catch (Exception unused) {
        }
        String string = com.bytedance.sdk.component.utils.ouw.ouw(jSONObjectOuw).toString();
        if (zih.yu().ex() && pd.ouw().yu() == 1) {
            uoy.ouw("Pangle_Debug_Mode", string, zih.ouw());
        }
        yuVarOuw.ouw(string, zih.yu().pno());
        yuVarOuw.f11911ra = 6;
        yuVarOuw.f11910le = "setting";
        com.bytedance.sdk.openadsdk.vm.lh.ouw(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.core.settings.bly.1
            @Override // com.bytedance.sdk.openadsdk.vm.yu
            public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                ouwVar.f13464lh = "settings_fetch";
                return ouwVar;
            }
        });
        yuVarOuw.ouw(new com.bytedance.sdk.component.ra.ouw.ouw() { // from class: com.bytedance.sdk.openadsdk.core.settings.bly.2
            @Override // com.bytedance.sdk.component.ra.ouw.ouw
            public final void ouw(com.bytedance.sdk.component.ra.vt.lh lhVar, IOException iOException) {
                bly.this.ouw.ouw(false);
                com.bytedance.sdk.openadsdk.vm.lh.lh(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.core.settings.bly.2.3
                    @Override // com.bytedance.sdk.openadsdk.vm.yu
                    public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                        com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                        ouwVar.f13464lh = "settings_fetch";
                        return ouwVar;
                    }
                });
                if (lhVar != null) {
                    zin.ouw(lhVar.fkw());
                    com.bytedance.sdk.openadsdk.rn.ouw.fkw.ouw("settings_fetch", lhVar.fkw(), -1, iOException != null ? iOException.getMessage() : null);
                }
            }

            @Override // com.bytedance.sdk.component.ra.ouw.ouw
            public final void ouw(com.bytedance.sdk.component.ra.vt.lh lhVar, com.bytedance.sdk.component.ra.vt vtVar) throws JSONException {
                JSONObject jSONObjectJsonObjectInit;
                int iOptInt;
                int i10 = vtVar.ouw;
                String str = vtVar.yu;
                if (zih.yu().ex() && pd.ouw().yu() == 1) {
                    uoy.ouw("Pangle_Debug_Mode", str, zih.ouw());
                }
                if (vtVar.pno && !TextUtils.isEmpty(str)) {
                    String strVt = null;
                    try {
                        jSONObjectJsonObjectInit = PangleVideoBridge.jsonObjectInit(str);
                    } catch (JSONException unused2) {
                        jSONObjectJsonObjectInit = null;
                    }
                    if (jSONObjectJsonObjectInit != null && (iOptInt = jSONObjectJsonObjectInit.optInt("cypher", -1)) != -1) {
                        if (iOptInt == 3) {
                            strVt = com.bytedance.sdk.component.utils.ouw.vt(jSONObjectJsonObjectInit.optString("message"));
                            if (!TextUtils.isEmpty(strVt)) {
                                try {
                                    jSONObjectJsonObjectInit = PangleVideoBridge.jsonObjectInit(strVt);
                                } catch (Throwable unused3) {
                                }
                            }
                        }
                        try {
                            bly.ouw(strVt, vtVar.f11908lh);
                        } catch (Throwable unused4) {
                        }
                        try {
                            bly.this.ouw(jSONObjectJsonObjectInit);
                            zih.yu().pno.ouw().ouw("last_req_time", System.currentTimeMillis()).ouw();
                            com.bytedance.sdk.openadsdk.vm.lh.vt(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.core.settings.bly.2.1
                                @Override // com.bytedance.sdk.openadsdk.vm.yu
                                public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                                    com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                                    ouwVar.f13464lh = "settings_fetch";
                                    return ouwVar;
                                }
                            });
                            zin.vt();
                        } catch (Throwable unused5) {
                        }
                        bly.this.ouw.ouw(true);
                        return;
                    }
                } else {
                    com.bytedance.sdk.openadsdk.vm.lh.lh(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.core.settings.bly.2.2
                        @Override // com.bytedance.sdk.openadsdk.vm.yu
                        public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                            com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                            ouwVar.f13464lh = "settings_fetch";
                            return ouwVar;
                        }
                    });
                    if (lhVar != null) {
                        zin.ouw(lhVar.fkw());
                    }
                }
                if (!vtVar.pno) {
                    com.bytedance.sdk.openadsdk.rn.ouw.fkw.ouw("settings_fetch", lhVar.fkw(), i10, vtVar.vt);
                }
                bly.this.ouw.ouw(false);
            }
        });
        com.bytedance.sdk.openadsdk.core.cf.vt(ryl.ouw(zih.ouw()));
        DeviceUtils.cf();
    }

    public final boolean ouw(@NonNull JSONObject jSONObject) {
        this.vt.ouw(jSONObject);
        for (fkw fkwVar : this.f13050lh) {
            if (fkwVar != null) {
                fkwVar.ouw(jSONObject);
            }
        }
        return this.vt.f13064lh;
    }

    public static boolean ouw() {
        return BinderPoolService.ouw;
    }

    public static /* synthetic */ void ouw(String str, Map map) {
        int i10 = 1;
        try {
            if (!TextUtils.isEmpty(str) && map != null) {
                HashMap map2 = new HashMap();
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = (String) entry.getKey();
                    if (str2 != null) {
                        map2.put(str2.toLowerCase(Locale.US), entry.getValue());
                    }
                }
                String str3 = (String) map2.get("active-control");
                if (str3 != null) {
                    int i11 = Integer.parseInt(str3);
                    String str4 = (String) map2.get("ts");
                    if (str4 != null) {
                        long j10 = Long.parseLong(str4);
                        String str5 = (String) map2.get("pst");
                        String strOuw = com.bykv.vk.openvk.ouw.ouw.ouw.ra.vt.ouw(str + i11 + j10);
                        if (strOuw != null && strOuw.equalsIgnoreCase(str5)) {
                            i10 = i11;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        ra.ouw(i10);
    }
}
