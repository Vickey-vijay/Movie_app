package b2;

import android.util.Log;
import androidx.annotation.RestrictTo;
import ck.p;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.j0;
import com.facebook.internal.q;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C3426d4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;
import q1.t;

/* JADX INFO: compiled from: RestrictiveDataManager.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J&\u0010\t\u001a\u00020\u00022\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\n\u001a\u00020\u0002H\u0002J\u001a\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u000fR\u001c\u0010\u0013\u001a\n \u0011*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019¨\u0006\u001d"}, d2 = {"Lb2/a;", "", "Lmj/r;", "a", "", C3426d4.i.f28547j0, "e", "", "parameters", InneractiveMediationDefs.GENDER_FEMALE, "c", "paramKey", "b", "", "d", "Z", "enabled", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "", "Lb2/a$a;", "Ljava/util/List;", "restrictiveParamFilters", "", "Ljava/util/Set;", "restrictedEvents", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static boolean enabled;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f4746a = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final String TAG = a.class.getCanonicalName();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final List<C0014a> restrictiveParamFilters = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Set<String> restrictedEvents = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: RestrictiveDataManager.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R0\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lb2/a$a;", "", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "setEventName", "(Ljava/lang/String;)V", C3426d4.i.f28547j0, "", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "c", "(Ljava/util/Map;)V", "restrictiveParams", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class C0014a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public String eventName;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public Map<String, String> restrictiveParams;

        public C0014a(String str, Map<String, String> map) {
            p.j(str, C3426d4.i.f28547j0);
            p.j(map, "restrictiveParams");
            this.eventName = str;
            this.restrictiveParams = map;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getEventName() {
            return this.eventName;
        }

        public final Map<String, String> b() {
            return this.restrictiveParams;
        }

        public final void c(Map<String, String> map) {
            p.j(map, "<set-?>");
            this.restrictiveParams = map;
        }
    }

    public static final void a() {
        if (i2.a.d(a.class)) {
            return;
        }
        try {
            enabled = true;
            f4746a.c();
        } catch (Throwable th2) {
            i2.a.b(th2, a.class);
        }
    }

    public static final String e(String eventName) {
        if (i2.a.d(a.class)) {
            return null;
        }
        try {
            p.j(eventName, C3426d4.i.f28547j0);
            return (enabled && f4746a.d(eventName)) ? "_removed_" : eventName;
        } catch (Throwable th2) {
            i2.a.b(th2, a.class);
            return null;
        }
    }

    public static final void f(Map<String, String> map, String str) {
        if (i2.a.d(a.class)) {
            return;
        }
        try {
            p.j(map, "parameters");
            p.j(str, C3426d4.i.f28547j0);
            if (enabled) {
                HashMap map2 = new HashMap();
                for (String str2 : new ArrayList(map.keySet())) {
                    String strB = f4746a.b(str, str2);
                    if (strB != null) {
                        map2.put(str2, strB);
                        map.remove(str2);
                    }
                }
                if (!map2.isEmpty()) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        for (Map.Entry entry : map2.entrySet()) {
                            jSONObject.put((String) entry.getKey(), (String) entry.getValue());
                        }
                        map.put("_restrictedParams", jSONObject.toString());
                    } catch (JSONException unused) {
                    }
                }
            }
        } catch (Throwable th2) {
            i2.a.b(th2, a.class);
        }
    }

    public final String b(String eventName, String paramKey) {
        try {
            if (i2.a.d(this)) {
                return null;
            }
            try {
                for (C0014a c0014a : new ArrayList(restrictiveParamFilters)) {
                    if (c0014a != null && p.e(eventName, c0014a.getEventName())) {
                        for (String str : c0014a.b().keySet()) {
                            if (p.e(paramKey, str)) {
                                return c0014a.b().get(str);
                            }
                        }
                    }
                }
            } catch (Exception e10) {
                Log.w(TAG, "getMatchedRuleType failed", e10);
            }
            return null;
        } catch (Throwable th2) {
            i2.a.b(th2, this);
            return null;
        }
    }

    public final void c() {
        String restrictiveDataSetting;
        if (i2.a.d(this)) {
            return;
        }
        try {
            FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.f14327a;
            boolean z10 = false;
            q qVarN = FetchedAppSettingsManager.n(t.m(), false);
            if (qVarN != null && (restrictiveDataSetting = qVarN.getRestrictiveDataSetting()) != null) {
                if (restrictiveDataSetting.length() == 0) {
                    z10 = true;
                }
                if (!z10) {
                    JSONObject jSONObject = new JSONObject(restrictiveDataSetting);
                    restrictiveParamFilters.clear();
                    restrictedEvents.clear();
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                        if (jSONObject2 != null) {
                            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("restrictive_param");
                            p.i(next, C3426d4.i.W);
                            C0014a c0014a = new C0014a(next, new HashMap());
                            if (jSONObjectOptJSONObject != null) {
                                c0014a.c(j0.o(jSONObjectOptJSONObject));
                                restrictiveParamFilters.add(c0014a);
                            }
                            if (jSONObject2.has("process_event_name")) {
                                restrictedEvents.add(c0014a.getEventName());
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            i2.a.b(th2, this);
        }
    }

    public final boolean d(String eventName) {
        if (i2.a.d(this)) {
            return false;
        }
        try {
            return restrictedEvents.contains(eventName);
        } catch (Throwable th2) {
            i2.a.b(th2, this);
            return false;
        }
    }
}
