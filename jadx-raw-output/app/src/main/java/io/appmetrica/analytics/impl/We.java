package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class We extends AbstractC4695zd {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Ze f56089d = new Ze("UUID_RESULT", null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Ze f56090e = new Ze("DEVICE_ID_RESULT", null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Ze f56091f = new Ze("DEVICE_ID_HASH_RESULT", null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Ze f56092g = new Ze("AD_URL_GET_RESULT", null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Ze f56093h = new Ze("AD_URL_REPORT_RESULT", null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Ze f56094i = new Ze("CUSTOM_HOSTS", null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Ze f56095j = new Ze("SERVER_TIME_OFFSET", null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Ze f56096k = new Ze("RESPONSE_CLIDS_RESULT", null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Ze f56097l = new Ze("CUSTOM_SDK_HOSTS", null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Ze f56098m = new Ze("CLIENT_CLIDS", null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Ze f56099n = new Ze("DEFERRED_DEEP_LINK_WAS_CHECKED", null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Ze f56100o = new Ze("API_LEVEL", null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Ze f56101p = new Ze("NEXT_STARTUP_TIME", null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Ze f56102q = new Ze(IronSourceConstants.TYPE_GAID, null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Ze f56103r = new Ze("HOAID", null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Ze f56104s = new Ze("YANDEX_ADV_ID", null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Ze f56105t = new Ze("CLIENT_CLIDS_CHANGED_AFTER_LAST_IDENTIFIERS_UPDATE", null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Ze f56106u = new Ze("SCREEN_INFO", null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Ze f56107v = new Ze("SCREEN_SIZE_CHECKED_BY_DEPRECATED", null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Ze f56108w = new Ze("FEATURES", null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Ze f56109x = new Ze("APPMETRICA_CLIENT_CONFIG", null);

    public final boolean a(boolean z10) {
        return this.f56247a.getBoolean(f56105t.f56287b, z10);
    }

    public final long b(long j10) {
        return this.f56247a.getLong(f56095j.f56286a, j10);
    }

    @NonNull
    public final We c(@Nullable IdentifiersResult identifiersResult) {
        return a(f56097l.f56287b, identifiersResult);
    }

    @NonNull
    public final IdentifiersResult d() {
        return h(f56092g.f56287b);
    }

    @NonNull
    public final IdentifiersResult e() {
        return h(f56093h.f56287b);
    }

    @NonNull
    public final We f(@Nullable IdentifiersResult identifiersResult) {
        return a(f56102q.f56287b, identifiersResult);
    }

    @NonNull
    public final IdentifiersResult h() {
        return h(f56097l.f56287b);
    }

    @NonNull
    public final IdentifiersResult i() {
        return h(f56091f.f56287b);
    }

    @NonNull
    public final IdentifiersResult j() {
        return h(f56090e.f56287b);
    }

    @NonNull
    public final W9 k() {
        String string = this.f56247a.getString(f56108w.f56287b, null);
        try {
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                return new W9(JsonUtils.optBooleanOrNull(jSONObject, "libSslEnabled"), IdentifierStatus.from(JsonUtils.optStringOrNull(jSONObject, "STATUS")), JsonUtils.optStringOrNull(jSONObject, "ERROR_EXPLANATION"));
            }
        } catch (Throwable unused) {
        }
        return new W9(null, IdentifierStatus.UNKNOWN, null);
    }

    public final List<String> g() {
        String string = this.f56247a.getString(f56094i.f56287b, null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return AbstractC4241hb.b(string);
    }

    @NonNull
    public final IdentifiersResult l() {
        return h(f56102q.f56287b);
    }

    @NonNull
    public final IdentifiersResult m() {
        return h(f56103r.f56287b);
    }

    @NonNull
    public final long n() {
        return this.f56247a.getLong(f56101p.f56287b, 0L);
    }

    @NonNull
    public final IdentifiersResult o() {
        return h(f56096k.f56287b);
    }

    @Nullable
    public final ScreenInfo p() {
        return AbstractC4241hb.e(this.f56247a.getString(f56106u.f56287b, null));
    }

    @NonNull
    public final IdentifiersResult q() {
        return h(f56089d.f56287b);
    }

    @NonNull
    public final IdentifiersResult r() {
        return h(f56104s.f56287b);
    }

    public final boolean s() {
        return this.f56247a.getBoolean(f56099n.f56287b, false);
    }

    public final boolean t() {
        return this.f56247a.getBoolean(f56107v.f56287b, false);
    }

    public final We u() {
        return (We) b(f56099n.f56287b, true);
    }

    public final void v() {
        b(f56107v.f56287b, true);
    }

    public We(Ia ia2) {
        super(ia2);
    }

    public final long a(long j10) {
        return this.f56247a.getLong(f56100o.f56287b, j10);
    }

    @NonNull
    public final We b(@Nullable IdentifiersResult identifiersResult) {
        return a(f56093h.f56287b, identifiersResult);
    }

    public final We c(long j10) {
        return (We) b(f56100o.f56287b, j10);
    }

    @NonNull
    public final We d(@Nullable IdentifiersResult identifiersResult) {
        return a(f56091f.f56287b, identifiersResult);
    }

    @NonNull
    public final We e(@Nullable IdentifiersResult identifiersResult) {
        return a(f56090e.f56287b, identifiersResult);
    }

    @Nullable
    public final AppMetricaConfig.Builder f() {
        String string = this.f56247a.getString(f56109x.f56287b, null);
        if (string == null) {
            return null;
        }
        return new H3().a(string);
    }

    public final IdentifiersResult h(String str) {
        IdentifiersResult identifiersResult;
        try {
            String string = this.f56247a.getString(str, null);
            if (string != null) {
                JSONObject jSONObject = new JSONObject(string);
                identifiersResult = new IdentifiersResult(JsonUtils.optStringOrNull(jSONObject, "ID"), IdentifierStatus.from(JsonUtils.optStringOrNull(jSONObject, "STATUS")), JsonUtils.optStringOrNull(jSONObject, "ERROR_EXPLANATION"));
            } else {
                identifiersResult = null;
            }
        } catch (Throwable unused) {
        }
        return identifiersResult == null ? new IdentifiersResult(null, IdentifierStatus.UNKNOWN, "no identifier in preferences") : identifiersResult;
    }

    @NonNull
    public final We i(@Nullable IdentifiersResult identifiersResult) {
        return a(f56089d.f56287b, identifiersResult);
    }

    @NonNull
    public final We j(@Nullable IdentifiersResult identifiersResult) {
        return a(f56104s.f56287b, identifiersResult);
    }

    @NonNull
    public final We g(@Nullable IdentifiersResult identifiersResult) {
        return a(f56103r.f56287b, identifiersResult);
    }

    @NonNull
    public final We a(@Nullable IdentifiersResult identifiersResult) {
        return a(f56092g.f56287b, identifiersResult);
    }

    public final We b(boolean z10) {
        return (We) b(f56105t.f56287b, z10);
    }

    @NonNull
    public final We d(long j10) {
        return (We) b(f56101p.f56287b, j10);
    }

    public final We e(long j10) {
        return (We) b(f56095j.f56287b, j10);
    }

    @Nullable
    public final String i(@Nullable String str) {
        return this.f56247a.getString(f56098m.f56287b, str);
    }

    public final We j(@Nullable String str) {
        return (We) b(f56098m.f56287b, str);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4695zd
    @NonNull
    public final String f(@NonNull String str) {
        return new Ze(str, null).f56287b;
    }

    public final We a(List<String> list) {
        return (We) b(f56094i.f56287b, mo.a((Collection) list) ? null : new JSONArray((Collection) list).toString());
    }

    @NonNull
    public final We h(@Nullable IdentifiersResult identifiersResult) {
        return a(f56096k.f56287b, identifiersResult);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4695zd
    @NonNull
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final We g(@NonNull String str) {
        return (We) d(new Ze(str, null).f56287b);
    }

    @NonNull
    public final We a(@NonNull W9 w10) {
        String str = f56108w.f56287b;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("libSslEnabled", w10.f56080a).put("STATUS", w10.f56081b.getValue()).putOpt("ERROR_EXPLANATION", w10.f56082c);
        } catch (Throwable unused) {
        }
        return (We) b(str, jSONObject.toString());
    }

    public final void a(@Nullable ScreenInfo screenInfo) {
        b(f56106u.f56287b, AbstractC4241hb.a(screenInfo));
    }

    public final void a(@NonNull AppMetricaConfig appMetricaConfig) {
        b(f56109x.f56287b, appMetricaConfig.toJson());
    }

    public final We a(String str, IdentifiersResult identifiersResult) {
        String string;
        if (identifiersResult != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("ID", identifiersResult.f58084id).put("STATUS", identifiersResult.status.getValue()).put("ERROR_EXPLANATION", identifiersResult.errorExplanation);
                } catch (Throwable unused) {
                }
                string = jSONObject.toString();
            } catch (Throwable unused2) {
                string = null;
            }
        } else {
            string = null;
        }
        if (string != null) {
            b(str, string);
        }
        return this;
    }
}
