package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class Xe extends AbstractC4695zd implements Co {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f56145d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f56146e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f56147f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f56148g = "";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f56159r = "SESSION_";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Ze f56149h = new Ze("PERMISSIONS_CHECK_TIME", null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Ze f56150i = new Ze("PROFILE_ID", null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Ze f56151j = new Ze("APP_ENVIRONMENT", null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Ze f56152k = new Ze("APP_ENVIRONMENT_REVISION", null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Ze f56153l = new Ze("LAST_APP_VERSION_WITH_FEATURES", null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Ze f56154m = new Ze("APPLICATION_FEATURES", null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Ze f56155n = new Ze("CERTIFICATES_SHA1_FINGERPRINTS", null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Ze f56156o = new Ze("VITAL_DATA", null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Ze f56157p = new Ze("SENT_EXTERNAL_ATTRIBUTIONS", null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Ze f56158q = new Ze("AUTO_COLLECTED_DATA_SUBSCRIBERS", null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Ze f56160s = new Ze("MAIN_REPORTER_EVENTS_TRIGGER_CONDITION_MET", null);

    public final Xe a(C4256i0 c4256i0) {
        synchronized (this) {
            b(f56151j.f56287b, c4256i0.f56933a);
            b(f56152k.f56287b, c4256i0.f56934b);
        }
        return this;
    }

    public final void b(boolean z10) {
        b(f56160s.f56287b, z10);
    }

    public final C4256i0 d() {
        C4256i0 c4256i0;
        synchronized (this) {
            c4256i0 = new C4256i0(this.f56247a.getString(f56151j.f56287b, JsonUtils.EMPTY_JSON), this.f56247a.getLong(f56152k.f56287b, 0L));
        }
        return c4256i0;
    }

    public final String e() {
        return this.f56247a.getString(f56154m.f56287b, "");
    }

    public final Map<String, Long> f() {
        HashMap map = new HashMap();
        try {
            String string = this.f56247a.getString(f56158q.f56287b, null);
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, Long.valueOf(jSONObject.getLong(next)));
                }
            }
        } catch (Throwable unused) {
        }
        return map;
    }

    public final int h() {
        return this.f56247a.getInt(f56153l.f56287b, -1);
    }

    public final long i() {
        return this.f56247a.getLong(f56149h.f56287b, 0L);
    }

    @Nullable
    public final String j() {
        return this.f56247a.getString(f56150i.f56287b, null);
    }

    @Override // io.appmetrica.analytics.impl.Ye
    @NonNull
    public final Set<String> c() {
        return this.f56247a.a();
    }

    @NonNull
    public final List<String> g() {
        String str = f56155n.f56287b;
        List listEmptyList = Collections.emptyList();
        String[] strArr = listEmptyList == null ? null : (String[]) listEmptyList.toArray(new String[listEmptyList.size()]);
        String string = this.f56247a.getString(str, null);
        if (!TextUtils.isEmpty(string)) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                strArr = new String[jSONArray.length()];
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    strArr[i10] = jSONArray.optString(i10);
                }
            } catch (Throwable unused) {
            }
        }
        if (strArr == null) {
            return null;
        }
        return Arrays.asList(strArr);
    }

    @NonNull
    public final Map<Integer, String> k() {
        HashMap map = new HashMap();
        try {
            String string = this.f56247a.getString(f56157p.f56287b, null);
            if (string != null) {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(Integer.valueOf(Integer.parseInt(next)), jSONObject.getString(next));
                }
            }
        } catch (Throwable unused) {
        }
        return map;
    }

    public Xe(Ia ia2) {
        super(ia2);
    }

    public final void b(@NonNull Map<Integer, String> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey().toString(), entry.getValue());
            } catch (Throwable unused) {
            }
        }
        b(f56157p.f56287b, jSONObject.toString());
    }

    public final Xe e(String str, String str2) {
        return (Xe) b(new Ze(f56159r, str).f56287b, str2);
    }

    public final String h(String str) {
        return this.f56247a.getString(new Ze(f56159r, str).f56287b, "");
    }

    public final Xe i(String str) {
        return (Xe) b(f56154m.f56287b, str);
    }

    public final Xe j(@Nullable String str) {
        return (Xe) b(f56150i.f56287b, str);
    }

    public final Xe a(long j10) {
        return (Xe) b(f56149h.f56287b, j10);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4695zd
    @NonNull
    public final String f(@NonNull String str) {
        return new Ze(str, null).f56287b;
    }

    public final Xe a(int i10) {
        return (Xe) b(f56153l.f56287b, i10);
    }

    public final Xe a(List<String> list) {
        return (Xe) a(f56155n.f56287b, list);
    }

    public final boolean a(boolean z10) {
        return this.f56247a.getBoolean(f56160s.f56287b, z10);
    }

    @Override // io.appmetrica.analytics.impl.Co
    @Nullable
    public final String a() {
        return this.f56247a.getString(f56156o.f56287b, null);
    }

    @Override // io.appmetrica.analytics.impl.Co
    public final void a(@NonNull String str) {
        b(f56156o.f56287b, str);
    }

    public final void a(@NonNull Map<String, Long> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (Throwable unused) {
            }
        }
        b(f56158q.f56287b, jSONObject.toString());
    }
}
