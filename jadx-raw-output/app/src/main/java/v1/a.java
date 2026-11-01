package v1;

import androidx.annotation.RestrictTo;
import ck.p;
import com.facebook.appevents.AppEvent;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.j0;
import com.facebook.internal.q;
import com.ironsource.C3426d4;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;
import q1.t;

/* JADX INFO: compiled from: EventDeactivationManager.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0016\u0010\u0007\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007J&\u0010\f\u001a\u00020\u00022\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\u000b\u001a\u00020\tH\u0007J\b\u0010\r\u001a\u00020\u0002H\u0002R\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015¨\u0006\u0019"}, d2 = {"Lv1/a;", "", "Lmj/r;", "a", "", "Lcom/facebook/appevents/AppEvent;", "events", "d", "", "", "parameters", C3426d4.i.f28547j0, "c", "b", "", "Z", "enabled", "Lv1/a$a;", "Ljava/util/List;", "deprecatedParamFilters", "", "Ljava/util/Set;", "deprecatedEvents", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static boolean enabled;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f73012a = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final List<C0764a> deprecatedParamFilters = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Set<String> deprecatedEvents = new HashSet();

    /* JADX INFO: renamed from: v1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: EventDeactivationManager.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR(\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u0003\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lv1/a$a;", "", "", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "setEventName", "(Ljava/lang/String;)V", C3426d4.i.f28547j0, "", "Ljava/util/List;", "()Ljava/util/List;", "c", "(Ljava/util/List;)V", "deprecateParams", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class C0764a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public String eventName;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public List<String> deprecateParams;

        public C0764a(String str, List<String> list) {
            p.j(str, C3426d4.i.f28547j0);
            p.j(list, "deprecateParams");
            this.eventName = str;
            this.deprecateParams = list;
        }

        public final List<String> a() {
            return this.deprecateParams;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getEventName() {
            return this.eventName;
        }

        public final void c(List<String> list) {
            p.j(list, "<set-?>");
            this.deprecateParams = list;
        }
    }

    public final synchronized void b() {
        try {
            if (i2.a.d(this)) {
                return;
            }
            try {
                FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.f14327a;
                q qVarN = FetchedAppSettingsManager.n(t.m(), false);
                if (qVarN == null) {
                    return;
                }
                String restrictiveDataSetting = qVarN.getRestrictiveDataSetting();
                if (restrictiveDataSetting != null) {
                    if (restrictiveDataSetting.length() > 0) {
                        JSONObject jSONObject = new JSONObject(restrictiveDataSetting);
                        deprecatedParamFilters.clear();
                        Iterator<String> itKeys = jSONObject.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                            if (jSONObject2 != null) {
                                if (jSONObject2.optBoolean("is_deprecated_event")) {
                                    Set<String> set = deprecatedEvents;
                                    p.i(next, C3426d4.i.W);
                                    set.add(next);
                                } else {
                                    JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("deprecated_param");
                                    p.i(next, C3426d4.i.W);
                                    C0764a c0764a = new C0764a(next, new ArrayList());
                                    if (jSONArrayOptJSONArray != null) {
                                        c0764a.c(j0.m(jSONArrayOptJSONArray));
                                    }
                                    deprecatedParamFilters.add(c0764a);
                                }
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            } catch (Throwable th2) {
                i2.a.b(th2, this);
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public static final void a() {
        if (i2.a.d(a.class)) {
            return;
        }
        try {
            enabled = true;
            f73012a.b();
        } catch (Throwable th2) {
            i2.a.b(th2, a.class);
        }
    }

    public static final void c(Map<String, String> map, String str) {
        if (i2.a.d(a.class)) {
            return;
        }
        try {
            p.j(map, "parameters");
            p.j(str, C3426d4.i.f28547j0);
            if (enabled) {
                ArrayList<String> arrayList = new ArrayList(map.keySet());
                for (C0764a c0764a : new ArrayList(deprecatedParamFilters)) {
                    if (p.e(c0764a.getEventName(), str)) {
                        for (String str2 : arrayList) {
                            if (c0764a.a().contains(str2)) {
                                map.remove(str2);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            i2.a.b(th2, a.class);
        }
    }

    public static final void d(List<AppEvent> list) {
        if (i2.a.d(a.class)) {
            return;
        }
        try {
            p.j(list, "events");
            if (enabled) {
                Iterator<AppEvent> it = list.iterator();
                while (it.hasNext()) {
                    if (deprecatedEvents.contains(it.next().getName())) {
                        it.remove();
                    }
                }
            }
        } catch (Throwable th2) {
            i2.a.b(th2, a.class);
        }
    }
}
