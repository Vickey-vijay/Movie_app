package com.facebook.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.GraphRequest;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: FetchedAppSettingsManager.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u000223B\t\b\u0002¢\u0006\u0004\b0\u00101J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0007J\u001a\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0007J\u001f\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0002J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J*\u0010\u0018\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00170\u00160\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u000eH\u0002R\u001c\u0010\u001c\u001a\n \u0019*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010!R\"\u0010&\u001a\u0010\u0012\f\u0012\n \u0019*\u0004\u0018\u00010$0$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010%R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\b0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010(R\u0016\u0010+\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010*R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00064"}, d2 = {"Lcom/facebook/internal/FetchedAppSettingsManager;", "", "Lmj/r;", "g", "", "applicationId", "Lcom/facebook/internal/q;", InneractiveMediationDefs.GENDER_FEMALE, "Lcom/facebook/internal/FetchedAppSettingsManager$a;", "callback", "d", "", "forceRequery", "n", "Lorg/json/JSONObject;", "settingsJSON", "i", "(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/facebook/internal/q;", CampaignEx.JSON_KEY_AD_K, "e", "dialogConfigResponse", "", "", "Lcom/facebook/internal/q$b;", "j", "kotlin.jvm.PlatformType", "b", "Ljava/lang/String;", "TAG", "", "c", "Ljava/util/List;", "APP_SETTING_FIELDS", "Ljava/util/Map;", "fetchedAppSettings", "Ljava/util/concurrent/atomic/AtomicReference;", "Lcom/facebook/internal/FetchedAppSettingsManager$FetchAppSettingState;", "Ljava/util/concurrent/atomic/AtomicReference;", "loadingState", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "fetchedAppSettingsCallbacks", "Z", "printedSDKUpdatedMessage", "Lorg/json/JSONArray;", "h", "Lorg/json/JSONArray;", "unityEventBindings", "<init>", "()V", "FetchAppSettingState", "a", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class FetchedAppSettingsManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final FetchedAppSettingsManager f14327a = new FetchedAppSettingsManager();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final String TAG = FetchedAppSettingsManager.class.getSimpleName();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final List<String> APP_SETTING_FIELDS = nj.s.n("supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params", "aam_rules", "suggested_events_setting");

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Map<String, q> fetchedAppSettings = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final AtomicReference<FetchAppSettingState> loadingState = new AtomicReference<>(FetchAppSettingState.NOT_LOADED);

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final ConcurrentLinkedQueue<a> fetchedAppSettingsCallbacks = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static boolean printedSDKUpdatedMessage;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static JSONArray unityEventBindings;

    /* JADX INFO: compiled from: FetchedAppSettingsManager.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/facebook/internal/FetchedAppSettingsManager$FetchAppSettingState;", "", "(Ljava/lang/String;I)V", "NOT_LOADED", "LOADING", "SUCCESS", "ERROR", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum FetchAppSettingState {
        NOT_LOADED,
        LOADING,
        SUCCESS,
        ERROR;

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static FetchAppSettingState[] valuesCustom() {
            FetchAppSettingState[] fetchAppSettingStateArrValuesCustom = values();
            return (FetchAppSettingState[]) Arrays.copyOf(fetchAppSettingStateArrValuesCustom, fetchAppSettingStateArrValuesCustom.length);
        }
    }

    /* JADX INFO: compiled from: FetchedAppSettingsManager.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\b\u0010\u0006\u001a\u00020\u0004H&¨\u0006\u0007"}, d2 = {"Lcom/facebook/internal/FetchedAppSettingsManager$a;", "", "Lcom/facebook/internal/q;", "fetchedAppSettings", "Lmj/r;", "a", "onError", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public interface a {
        void a(q qVar);

        void onError();
    }

    public final synchronized void k() {
        FetchAppSettingState fetchAppSettingState = loadingState.get();
        if (FetchAppSettingState.NOT_LOADED != fetchAppSettingState && FetchAppSettingState.LOADING != fetchAppSettingState) {
            final q qVar = fetchedAppSettings.get(q1.t.m());
            Handler handler = new Handler(Looper.getMainLooper());
            if (FetchAppSettingState.ERROR == fetchAppSettingState) {
                while (true) {
                    ConcurrentLinkedQueue<a> concurrentLinkedQueue = fetchedAppSettingsCallbacks;
                    if (concurrentLinkedQueue.isEmpty()) {
                        return;
                    }
                    final a aVarPoll = concurrentLinkedQueue.poll();
                    handler.post(new Runnable() { // from class: com.facebook.internal.s
                        @Override // java.lang.Runnable
                        public final void run() {
                            FetchedAppSettingsManager.l(aVarPoll);
                        }
                    });
                }
            } else {
                while (true) {
                    ConcurrentLinkedQueue<a> concurrentLinkedQueue2 = fetchedAppSettingsCallbacks;
                    if (concurrentLinkedQueue2.isEmpty()) {
                        return;
                    }
                    final a aVarPoll2 = concurrentLinkedQueue2.poll();
                    handler.post(new Runnable() { // from class: com.facebook.internal.t
                        @Override // java.lang.Runnable
                        public final void run() {
                            FetchedAppSettingsManager.m(aVarPoll2, qVar);
                        }
                    });
                }
            }
        }
    }

    public static final void d(a aVar) {
        ck.p.j(aVar, "callback");
        fetchedAppSettingsCallbacks.add(aVar);
        g();
    }

    public static final q f(String applicationId) {
        if (applicationId != null) {
            return fetchedAppSettings.get(applicationId);
        }
        return null;
    }

    public static final void h(Context context, String str, String str2) {
        JSONObject jSONObject;
        ck.p.j(context, "$context");
        ck.p.j(str, "$settingsKey");
        ck.p.j(str2, "$applicationId");
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
        q qVarI = null;
        String string = sharedPreferences.getString(str, null);
        if (!j0.X(string)) {
            if (string == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            try {
                jSONObject = new JSONObject(string);
            } catch (JSONException e10) {
                j0.d0("FacebookSDK", e10);
                jSONObject = null;
            }
            if (jSONObject != null) {
                qVarI = f14327a.i(str2, jSONObject);
            }
        }
        FetchedAppSettingsManager fetchedAppSettingsManager = f14327a;
        JSONObject jSONObjectE = fetchedAppSettingsManager.e(str2);
        if (jSONObjectE != null) {
            fetchedAppSettingsManager.i(str2, jSONObjectE);
            sharedPreferences.edit().putString(str, jSONObjectE.toString()).apply();
        }
        if (qVarI != null) {
            String strH = qVarI.getSdkUpdateMessage();
            if (!printedSDKUpdatedMessage && strH != null && strH.length() > 0) {
                printedSDKUpdatedMessage = true;
                Log.w(TAG, strH);
            }
        }
        p.m(str2, true);
        y1.h.d();
        loadingState.set(fetchedAppSettings.containsKey(str2) ? FetchAppSettingState.SUCCESS : FetchAppSettingState.ERROR);
        fetchedAppSettingsManager.k();
    }

    public static final q n(String applicationId, boolean forceRequery) {
        ck.p.j(applicationId, "applicationId");
        if (!forceRequery) {
            Map<String, q> map = fetchedAppSettings;
            if (map.containsKey(applicationId)) {
                return map.get(applicationId);
            }
        }
        FetchedAppSettingsManager fetchedAppSettingsManager = f14327a;
        JSONObject jSONObjectE = fetchedAppSettingsManager.e(applicationId);
        if (jSONObjectE == null) {
            return null;
        }
        q qVarI = fetchedAppSettingsManager.i(applicationId, jSONObjectE);
        if (ck.p.e(applicationId, q1.t.m())) {
            loadingState.set(FetchAppSettingState.SUCCESS);
            fetchedAppSettingsManager.k();
        }
        return qVarI;
    }

    public final JSONObject e(String applicationId) {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(APP_SETTING_FIELDS);
        bundle.putString("fields", TextUtils.join(StringUtils.COMMA, arrayList));
        GraphRequest graphRequestX = GraphRequest.INSTANCE.x(null, MBridgeConstans.DYNAMIC_VIEW_WX_APP, null);
        graphRequestX.D(true);
        graphRequestX.G(bundle);
        JSONObject jSONObjectD = graphRequestX.k().getJsonObject();
        return jSONObjectD == null ? new JSONObject() : jSONObjectD;
    }

    public final q i(String applicationId, JSONObject settingsJSON) {
        ck.p.j(applicationId, "applicationId");
        ck.p.j(settingsJSON, "settingsJSON");
        JSONArray jSONArrayOptJSONArray = settingsJSON.optJSONArray("android_sdk_error_categories");
        j.Companion aVar = j.INSTANCE;
        j jVarA = aVar.a(jSONArrayOptJSONArray);
        if (jVarA == null) {
            jVarA = aVar.b();
        }
        j jVar = jVarA;
        int iOptInt = settingsJSON.optInt("app_events_feature_bitmask", 0);
        boolean z10 = (iOptInt & 8) != 0;
        boolean z11 = (iOptInt & 16) != 0;
        boolean z12 = (iOptInt & 32) != 0;
        boolean z13 = (iOptInt & 256) != 0;
        boolean z14 = (iOptInt & 16384) != 0;
        JSONArray jSONArrayOptJSONArray2 = settingsJSON.optJSONArray("auto_event_mapping_android");
        unityEventBindings = jSONArrayOptJSONArray2;
        if (jSONArrayOptJSONArray2 != null && x.b()) {
            u1.c cVar = u1.c.f72515a;
            u1.c.c(jSONArrayOptJSONArray2 == null ? null : jSONArrayOptJSONArray2.toString());
        }
        boolean zOptBoolean = settingsJSON.optBoolean("supports_implicit_sdk_logging", false);
        String strOptString = settingsJSON.optString("gdpv4_nux_content", "");
        ck.p.i(strOptString, "settingsJSON.optString(APP_SETTING_NUX_CONTENT, \"\")");
        boolean zOptBoolean2 = settingsJSON.optBoolean("gdpv4_nux_enabled", false);
        int iOptInt2 = settingsJSON.optInt("app_events_session_timeout", y1.i.a());
        EnumSet<SmartLoginOption> enumSetA = SmartLoginOption.INSTANCE.a(settingsJSON.optLong("seamless_login"));
        Map<String, Map<String, q.b>> mapJ = j(settingsJSON.optJSONObject("android_dialog_configs"));
        String strOptString2 = settingsJSON.optString("smart_login_bookmark_icon_url");
        ck.p.i(strOptString2, "settingsJSON.optString(SMART_LOGIN_BOOKMARK_ICON_URL)");
        String strOptString3 = settingsJSON.optString("smart_login_menu_icon_url");
        ck.p.i(strOptString3, "settingsJSON.optString(SMART_LOGIN_MENU_ICON_URL)");
        String strOptString4 = settingsJSON.optString("sdk_update_message");
        ck.p.i(strOptString4, "settingsJSON.optString(SDK_UPDATE_MESSAGE)");
        q qVar = new q(zOptBoolean, strOptString, zOptBoolean2, iOptInt2, enumSetA, mapJ, z10, jVar, strOptString2, strOptString3, z11, z12, jSONArrayOptJSONArray2, strOptString4, z13, z14, settingsJSON.optString("aam_rules"), settingsJSON.optString("suggested_events_setting"), settingsJSON.optString("restrictive_data_filter_params"));
        fetchedAppSettings.put(applicationId, qVar);
        return qVar;
    }

    public final Map<String, Map<String, q.b>> j(JSONObject dialogConfigResponse) {
        JSONArray jSONArrayOptJSONArray;
        HashMap map = new HashMap();
        if (dialogConfigResponse != null && (jSONArrayOptJSONArray = dialogConfigResponse.optJSONArray("data")) != null) {
            int i10 = 0;
            int length = jSONArrayOptJSONArray.length();
            if (length > 0) {
                while (true) {
                    int i11 = i10 + 1;
                    q.b.Companion aVar = q.b.INSTANCE;
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                    ck.p.i(jSONObjectOptJSONObject, "dialogConfigData.optJSONObject(i)");
                    q.b bVarA = aVar.a(jSONObjectOptJSONObject);
                    if (bVarA != null) {
                        String strA = bVarA.getDialogName();
                        Map map2 = (Map) map.get(strA);
                        if (map2 == null) {
                            map2 = new HashMap();
                            map.put(strA, map2);
                        }
                        map2.put(bVarA.getFeatureName(), bVarA);
                    }
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
        }
        return map;
    }

    public static final void g() {
        boolean z10;
        final Context contextL = q1.t.l();
        final String strM = q1.t.m();
        if (j0.X(strM)) {
            loadingState.set(FetchAppSettingState.ERROR);
            f14327a.k();
            return;
        }
        if (fetchedAppSettings.containsKey(strM)) {
            loadingState.set(FetchAppSettingState.SUCCESS);
            f14327a.k();
            return;
        }
        AtomicReference<FetchAppSettingState> atomicReference = loadingState;
        FetchAppSettingState fetchAppSettingState = FetchAppSettingState.NOT_LOADED;
        FetchAppSettingState fetchAppSettingState2 = FetchAppSettingState.LOADING;
        if (!androidx.lifecycle.e.a(atomicReference, fetchAppSettingState, fetchAppSettingState2) && !androidx.lifecycle.e.a(atomicReference, FetchAppSettingState.ERROR, fetchAppSettingState2)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            f14327a.k();
            return;
        }
        ck.w wVar = ck.w.f6066a;
        final String str = String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[]{strM}, 1));
        ck.p.i(str, "java.lang.String.format(format, *args)");
        q1.t.t().execute(new Runnable() { // from class: com.facebook.internal.r
            @Override // java.lang.Runnable
            public final void run() {
                FetchedAppSettingsManager.h(contextL, str, strM);
            }
        });
    }

    public static final void l(a aVar) {
        aVar.onError();
    }

    public static final void m(a aVar, q qVar) {
        aVar.a(qVar);
    }
}
