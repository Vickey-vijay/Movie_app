package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.safedk.android.internal.partials.PangleVideoBridge;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class bly {
    public static final Set<String> bly = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.bly.1
        {
            add("8025677");
            add("5001121");
        }
    };
    public static mwh ouw;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    private static boolean f12497vm;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public String f12498cf;
    public int fkw;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private boolean f12499jg;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    @NonNull
    private String f12500ko;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public Integer f12501le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public String f12502lh;
    public volatile ConcurrentHashMap<String, com.bytedance.sdk.openadsdk.core.yu.ra.ouw> mwh;
    public String pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public int f12503ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    @Nullable
    private String f12504rn;
    public com.bytedance.sdk.openadsdk.core.mwh.lh.lh ryl;
    public boolean tlj;

    @NonNull
    public String vt;
    public int yu;
    private Bitmap zih;

    public static class ouw {
        private static final bly ouw = new bly(0);
    }

    public /* synthetic */ bly(byte b10) {
        this();
    }

    public static int fkw() {
        try {
            String strOuw = ouw("domain_index", Long.MAX_VALUE);
            if (TextUtils.isEmpty(strOuw)) {
                return 0;
            }
            return Integer.valueOf(strOuw).intValue();
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ko.yu("TTAD.GlobalInfo", "getDomainIndex", th2.getMessage());
            return 0;
        }
    }

    public static int le() {
        try {
            String strOuw = ouw("config_fail_times", Long.MAX_VALUE);
            if (TextUtils.isEmpty(strOuw)) {
                return 0;
            }
            return Integer.valueOf(strOuw).intValue();
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ko.yu("TTAD.GlobalInfo", "getConfigFailTimes", th2.getMessage());
            return 0;
        }
    }

    public static void lh() {
        com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("sp_global_file", "sdk_activate_init", Boolean.FALSE);
    }

    public final String ra() {
        String str = this.f12502lh;
        if (str != null) {
            return str;
        }
        String strOuw = ouw("mediation_info", Long.MAX_VALUE);
        this.f12502lh = strOuw;
        if (strOuw == null) {
            this.f12502lh = "";
        }
        return this.f12502lh;
    }

    @Nullable
    public final String yu() {
        if (TextUtils.isEmpty(this.vt)) {
            String strOuw = ouw("app_id", Long.MAX_VALUE);
            if (!TextUtils.isEmpty(strOuw)) {
                this.vt = strOuw;
            }
        }
        return this.vt;
    }

    private bly() {
        this.f12499jg = false;
        this.fkw = 0;
        this.zih = null;
        this.f12501le = null;
        this.f12503ra = -1;
        this.mwh = null;
    }

    public static void ouw(mwh mwhVar) {
        ouw = mwhVar;
    }

    public static boolean rn() {
        return f12497vm;
    }

    public static boolean vt() {
        return com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("sp_global_file", "sdk_activate_init");
    }

    public static void zih() {
        if (Build.VERSION.SDK_INT == 26 && "MI 6".equals(Build.MODEL)) {
            f12497vm = true;
        }
    }

    public final boolean cf() {
        int i10 = this.f12503ra;
        return i10 < -1 || i10 > 1;
    }

    public final boolean jg() {
        return bly.contains(this.vt);
    }

    public final com.bytedance.sdk.openadsdk.core.yu.ra.ouw lh(String str) {
        try {
            if (this.mwh == null || str == null) {
                return null;
            }
            return this.mwh.get(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    @NonNull
    public final String pno() {
        if (TextUtils.isEmpty(this.f12500ko)) {
            this.f12500ko = ouw(zih.ouw());
        }
        return this.f12500ko;
    }

    public final int tlj() {
        Integer num = this.f12501le;
        return num != null ? num.intValue() : com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("sp_global_privacy", "tt_gdpr", -1);
    }

    public static boolean ko() {
        return "com.union_test.internationad".equals(com.bytedance.sdk.openadsdk.utils.uoy.ra());
    }

    public static void vt(int i10) {
        if (i10 >= 0) {
            ouw("config_fail_times", String.valueOf(i10));
        }
    }

    public final int bly() {
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            return com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("sp_global_icon_id", "icon_id", 0);
        }
        return this.yu;
    }

    public final Bitmap mwh() {
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            return com.bytedance.sdk.component.utils.yu.ouw(com.bytedance.sdk.openadsdk.multipro.yu.yu.vt("sp_global_file", "pause_icon", null));
        }
        return this.zih;
    }

    public final void ouw(boolean z10) {
        this.tlj = z10;
    }

    @Nullable
    public final String ryl() {
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            return com.bytedance.sdk.openadsdk.multipro.yu.yu.vt("sp_global_file", "extra_data", null);
        }
        return this.f12504rn;
    }

    public final String vm() {
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            return com.bytedance.sdk.openadsdk.multipro.yu.yu.vt("sp_global_file", "adx_id", "");
        }
        return this.pno;
    }

    @NonNull
    public static bly ouw() {
        return ouw.ouw;
    }

    public static Pair<String, Long> vt(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObjectRa = ra(str);
            if (jSONObjectRa == null) {
                return null;
            }
            return new Pair<>(jSONObjectRa.getString("value"), Long.valueOf(jSONObjectRa.getLong("time")));
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.qbp.lh("TTAD.GlobalInfo", e10.getMessage());
            return null;
        }
    }

    public static boolean fkw(String str) {
        return (TextUtils.isEmpty(str) || str.contains("sp_full_screen_video") || str.contains("sp_reward_video") || str.contains("tt_openad") || str.contains("pag_sp_bad_par")) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void le(String str) {
        if (!TextUtils.isEmpty(this.f12504rn)) {
            try {
                HashMap map = new HashMap();
                JSONArray jSONArray = new JSONArray(this.f12504rn);
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                    if (jSONObjectOptJSONObject != null) {
                        String strOptString = jSONObjectOptJSONObject.optString("name");
                        if (!TextUtils.isEmpty(strOptString)) {
                            map.put(strOptString, jSONObjectOptJSONObject);
                        }
                    }
                }
                JSONArray jSONArray2 = new JSONArray(str);
                for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                    JSONObject jSONObjectOptJSONObject2 = jSONArray2.optJSONObject(i11);
                    if (jSONObjectOptJSONObject2 != null) {
                        String strOptString2 = jSONObjectOptJSONObject2.optString("name");
                        String strOptString3 = jSONObjectOptJSONObject2.optString("value");
                        if (!TextUtils.isEmpty(strOptString2) && !TextUtils.isEmpty(strOptString3)) {
                            map.put(strOptString2, jSONObjectOptJSONObject2);
                        }
                    }
                }
                Collection collectionValues = map.values();
                JSONArray jSONArray3 = new JSONArray();
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    jSONArray3.put((JSONObject) it.next());
                }
                this.f12504rn = jSONArray3.toString();
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.ko.fkw("TTAD.GlobalInfo", th2.getMessage());
            }
        } else {
            this.f12504rn = str;
        }
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("sp_global_file", "extra_data", this.f12504rn);
        }
    }

    public static void ouw(int i10) {
        if (i10 >= 0) {
            ouw("domain_index", String.valueOf(i10));
        }
    }

    private static JSONObject ra(String str) {
        String strVt = com.bytedance.sdk.openadsdk.multipro.yu.yu.vt("sp_global_file", str, null);
        if (TextUtils.isEmpty(strVt)) {
            return null;
        }
        try {
            return PangleVideoBridge.jsonObjectInit(strVt);
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.qbp.lh("TTAD.GlobalInfo", e10.getMessage());
            return null;
        }
    }

    private static String ouw(Context context) {
        try {
            PackageManager packageManager = context.getApplicationContext().getPackageManager();
            return (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getPackageName(), 128));
        } catch (Throwable unused) {
            return "";
        }
    }

    public final void yu(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
                com.bytedance.sdk.openadsdk.lh.tlj.ouw(str);
            } else if (this.mwh != null) {
                this.mwh.remove(str);
            }
        } catch (Throwable unused) {
        }
    }

    public static void ouw(Integer num, int i10) {
        if (num == null) {
            if (com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("sp_global_privacy", "tt_gdpr", -1) != i10) {
                com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("sp_global_privacy", "tt_gdpr", Integer.valueOf(i10));
                com.bytedance.sdk.openadsdk.core.settings.cf.vt().ouw(4, true);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("sp_global_privacy", "tt_gdpr", Integer.valueOf(i10));
        com.bytedance.sdk.openadsdk.core.settings.cf.vt().ouw(4, true);
    }

    public final void vt(boolean z10) {
        this.f12499jg = z10;
    }

    public static void ouw(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("value", str2);
            jSONObject.put("time", System.currentTimeMillis());
            com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("sp_global_file", str, jSONObject.toString());
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.qbp.lh("TTAD.GlobalInfo", e10.getMessage());
        }
    }

    public static String ouw(String str, long j10) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObjectRa = ra(str);
            if (jSONObjectRa == null) {
                return null;
            }
            if (System.currentTimeMillis() - jSONObjectRa.getLong("time") <= j10) {
                return jSONObjectRa.getString("value");
            }
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.qbp.lh("TTAD.GlobalInfo", e10.getMessage());
        }
        return null;
    }

    public final void ouw(String str, com.bytedance.sdk.openadsdk.core.yu.ra.ouw ouwVar) {
        try {
            if (TextUtils.isEmpty(str) || ouwVar == null) {
                return;
            }
            if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
                com.bytedance.sdk.openadsdk.lh.tlj.ouw(str, ouwVar);
                return;
            }
            if (this.mwh == null) {
                synchronized (bly.class) {
                    if (this.mwh == null) {
                        this.mwh = new ConcurrentHashMap<>();
                    }
                }
            }
            if (this.mwh != null) {
                this.mwh.put(str, ouwVar);
            }
        } catch (Throwable unused) {
        }
    }

    public final void ouw(@Nullable final String str) {
        if (!TextUtils.isEmpty(str) && str.length() > 1000) {
            mwh mwhVar = ouw;
            if (mwhVar != null) {
                mwhVar.ouw("Data is very long, the longest is 1000");
            }
            com.bytedance.sdk.component.utils.qbp.lh("TTAD.GlobalInfo", "Data is very long, the longest is 1000");
        }
        if (com.bytedance.sdk.openadsdk.utils.bs.le()) {
            jg.vt().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bly.3
                @Override // java.lang.Runnable
                public final void run() {
                    bly.this.le(str);
                }
            });
        } else {
            le(str);
        }
    }
}
