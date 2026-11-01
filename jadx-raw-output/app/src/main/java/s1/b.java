package s1;

import android.content.SharedPreferences;
import ck.p;
import com.facebook.GraphRequest;
import com.facebook.HttpMethod;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests;
import com.facebook.appevents.cloudbridge.SettingsAPIFields;
import com.facebook.internal.a0;
import com.facebook.internal.j0;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import mj.d;
import nj.b0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q1.t;
import q1.z;

/* JADX INFO: compiled from: AppEventsCAPIManager.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u000b\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\nR\"\u0010\u0013\u001a\u00020\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R@\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00142\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00148A@@X\u0080\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Ls1/b;", "", "Lmj/r;", "b", "Lq1/z;", "response", "d", "(Lq1/z;)V", "", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "", "c", "Z", InneractiveMediationDefs.GENDER_FEMALE, "()Z", "setEnabled$facebook_core_release", "(Z)V", "isEnabled", "", "valuesToSave", "e", "()Ljava/util/Map;", "g", "(Ljava/util/Map;)V", "savedCloudBridgeCredentials", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f66972a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final String TAG = b.class.getCanonicalName();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static boolean isEnabled;

    public static final void b() {
        try {
            GraphRequest graphRequest = new GraphRequest(null, p.s(t.m(), "/cloudbridge_settings"), null, HttpMethod.GET, new GraphRequest.b() { // from class: s1.a
                @Override // com.facebook.GraphRequest.b
                public final void b(z zVar) {
                    b.c(zVar);
                }
            }, null, 32, null);
            a0.Companion companion = a0.INSTANCE;
            LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
            String str = TAG;
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            companion.c(loggingBehavior, str, " \n\nCreating Graph Request: \n=============\n%s\n\n ", graphRequest);
            graphRequest.l();
        } catch (JSONException e10) {
            a0.Companion companion2 = a0.INSTANCE;
            LoggingBehavior loggingBehavior2 = LoggingBehavior.APP_EVENTS;
            String str2 = TAG;
            if (str2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            companion2.c(loggingBehavior2, str2, " \n\nGraph Request Exception: \n=============\n%s\n\n ", d.b(e10));
        }
    }

    public static final void c(z zVar) {
        p.j(zVar, "response");
        f66972a.d(zVar);
    }

    public static final Map<String, Object> e() {
        if (i2.a.d(b.class)) {
            return null;
        }
        try {
            SharedPreferences sharedPreferences = t.l().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
            if (sharedPreferences == null) {
                return null;
            }
            SettingsAPIFields settingsAPIFields = SettingsAPIFields.DATASETID;
            String string = sharedPreferences.getString(settingsAPIFields.getRawValue(), null);
            SettingsAPIFields settingsAPIFields2 = SettingsAPIFields.URL;
            String string2 = sharedPreferences.getString(settingsAPIFields2.getRawValue(), null);
            SettingsAPIFields settingsAPIFields3 = SettingsAPIFields.ACCESSKEY;
            String string3 = sharedPreferences.getString(settingsAPIFields3.getRawValue(), null);
            if (!(string == null || lk.a0.n0(string))) {
                if (!(string2 == null || lk.a0.n0(string2))) {
                    if (!(string3 == null || lk.a0.n0(string3))) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put(settingsAPIFields2.getRawValue(), string2);
                        linkedHashMap.put(settingsAPIFields.getRawValue(), string);
                        linkedHashMap.put(settingsAPIFields3.getRawValue(), string3);
                        a0.INSTANCE.c(LoggingBehavior.APP_EVENTS, TAG.toString(), " \n\nLoading Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n ", string, string2, string3);
                        return linkedHashMap;
                    }
                }
            }
            return null;
        } catch (Throwable th2) {
            i2.a.b(th2, b.class);
            return null;
        }
    }

    public final void d(z response) {
        p.j(response, "response");
        boolean zBooleanValue = false;
        if (response.getError() != null) {
            a0.Companion companion = a0.INSTANCE;
            LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
            String str = TAG;
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            companion.c(loggingBehavior, str, " \n\nGraph Response Error: \n================\nResponse Error: %s\nResponse Error Exception: %s\n\n ", response.getError().toString(), String.valueOf(response.getError().getException()));
            Map<String, Object> mapE = e();
            if (mapE != null) {
                URL url = new URL(String.valueOf(mapE.get(SettingsAPIFields.URL.getRawValue())));
                AppEventsConversionsAPITransformerWebRequests appEventsConversionsAPITransformerWebRequests = AppEventsConversionsAPITransformerWebRequests.f14192a;
                AppEventsConversionsAPITransformerWebRequests.d(String.valueOf(mapE.get(SettingsAPIFields.DATASETID.getRawValue())), url.getProtocol() + "://" + ((Object) url.getHost()), String.valueOf(mapE.get(SettingsAPIFields.ACCESSKEY.getRawValue())));
                isEnabled = true;
                return;
            }
            return;
        }
        a0.Companion companion2 = a0.INSTANCE;
        LoggingBehavior loggingBehavior2 = LoggingBehavior.APP_EVENTS;
        String str2 = TAG;
        if (str2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        companion2.c(loggingBehavior2, str2, " \n\nGraph Response Received: \n================\n%s\n\n ", response);
        JSONObject graphObject = response.getGraphObject();
        try {
            j0 j0Var = j0.f14425a;
            Object obj = graphObject == null ? null : graphObject.get("data");
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
            }
            Map<String, ? extends Object> mapN = j0.n(new JSONObject((String) b0.h0(j0.m((JSONArray) obj))));
            String str3 = (String) mapN.get(SettingsAPIFields.URL.getRawValue());
            String str4 = (String) mapN.get(SettingsAPIFields.DATASETID.getRawValue());
            String str5 = (String) mapN.get(SettingsAPIFields.ACCESSKEY.getRawValue());
            if (str3 == null || str4 == null || str5 == null) {
                p.i(str2, "TAG");
                companion2.b(loggingBehavior2, str2, "CloudBridge Settings API response doesn't have valid data");
                return;
            }
            try {
                AppEventsConversionsAPITransformerWebRequests.d(str4, str3, str5);
                g(mapN);
                SettingsAPIFields settingsAPIFields = SettingsAPIFields.ENABLED;
                if (mapN.get(settingsAPIFields.getRawValue()) != null) {
                    Object obj2 = mapN.get(settingsAPIFields.getRawValue());
                    if (obj2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                    }
                    zBooleanValue = ((Boolean) obj2).booleanValue();
                }
                isEnabled = zBooleanValue;
            } catch (MalformedURLException e10) {
                a0.Companion companion3 = a0.INSTANCE;
                LoggingBehavior loggingBehavior3 = LoggingBehavior.APP_EVENTS;
                String str6 = TAG;
                p.i(str6, "TAG");
                companion3.c(loggingBehavior3, str6, "CloudBridge Settings API response doesn't have valid url\n %s ", d.b(e10));
            }
        } catch (NullPointerException e11) {
            a0.Companion companion4 = a0.INSTANCE;
            LoggingBehavior loggingBehavior4 = LoggingBehavior.APP_EVENTS;
            String str7 = TAG;
            p.i(str7, "TAG");
            companion4.c(loggingBehavior4, str7, "CloudBridge Settings API response is not a valid json: \n%s ", d.b(e11));
        } catch (JSONException e12) {
            a0.Companion companion5 = a0.INSTANCE;
            LoggingBehavior loggingBehavior5 = LoggingBehavior.APP_EVENTS;
            String str8 = TAG;
            p.i(str8, "TAG");
            companion5.c(loggingBehavior5, str8, "CloudBridge Settings API response is not a valid json: \n%s ", d.b(e12));
        }
    }

    public final boolean f() {
        return isEnabled;
    }

    public final void g(Map<String, ? extends Object> map) {
        SharedPreferences sharedPreferences = t.l().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
        if (sharedPreferences == null) {
            return;
        }
        if (map == null) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.clear();
            editorEdit.apply();
            return;
        }
        SettingsAPIFields settingsAPIFields = SettingsAPIFields.DATASETID;
        Object obj = map.get(settingsAPIFields.getRawValue());
        SettingsAPIFields settingsAPIFields2 = SettingsAPIFields.URL;
        Object obj2 = map.get(settingsAPIFields2.getRawValue());
        SettingsAPIFields settingsAPIFields3 = SettingsAPIFields.ACCESSKEY;
        Object obj3 = map.get(settingsAPIFields3.getRawValue());
        if (obj != null && obj2 != null && obj3 != null) {
            SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
            editorEdit2.putString(settingsAPIFields.getRawValue(), obj.toString());
            editorEdit2.putString(settingsAPIFields2.getRawValue(), obj2.toString());
            editorEdit2.putString(settingsAPIFields3.getRawValue(), obj3.toString());
            editorEdit2.apply();
            a0.INSTANCE.c(LoggingBehavior.APP_EVENTS, TAG.toString(), " \n\nSaving Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n ", obj, obj2, obj3);
        }
    }
}
