package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionState;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Q5 implements CounterReportApi, Parcelable {
    public static final Parcelable.Creator<Q5> CREATOR = new P5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public String f55773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public String f55774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f55775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f55776d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f55777e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Pair f55778f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f55779g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f55780h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f55781i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f55782j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public EnumC4162ea f55783k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public EnumC4392n9 f55784l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Bundle f55785m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Boolean f55786n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Integer f55787o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Map f55788p;

    public Q5() {
        this("", 0);
    }

    public final void a(String str, String str2) {
        if (this.f55778f == null) {
            this.f55778f = new Pair(str, str2);
        }
    }

    @Nullable
    public final Pair<String, String> b() {
        return this.f55778f;
    }

    public final void c(@Nullable Bundle bundle) {
        this.f55785m = bundle;
    }

    public final long d() {
        return this.f55781i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final long e() {
        return this.f55782j;
    }

    public Q5(@Nullable String str, int i10) {
        this("", str, i10);
    }

    @NonNull
    public static Q5 e(@NonNull Q5 q10) {
        return a(q10, EnumC4112cb.EVENT_TYPE_APP_UPDATE);
    }

    public final void b(@Nullable String str) {
        this.f55775c = str;
    }

    public void c(@Nullable String str) {
        this.f55780h = str;
    }

    @NonNull
    public final Bundle d(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putParcelable("CounterReport.Object", this);
        return bundle;
    }

    @Nullable
    public final String f() {
        return this.f55775c;
    }

    @NonNull
    public final EnumC4162ea g() {
        return this.f55783k;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getBytesTruncated() {
        return this.f55779g;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getCustomType() {
        return this.f55777e;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    @NonNull
    public final Map<String, byte[]> getExtras() {
        return this.f55788p;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    @Nullable
    public final String getName() {
        return this.f55773a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getType() {
        return this.f55776d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    @Nullable
    public final String getValue() {
        return this.f55774b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    @Nullable
    public final byte[] getValueBytes() {
        String str = this.f55774b;
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    @Nullable
    public final Integer h() {
        return this.f55787o;
    }

    @Nullable
    public final Bundle i() {
        return this.f55785m;
    }

    @Nullable
    public final String j() {
        return this.f55780h;
    }

    @Nullable
    public final EnumC4392n9 k() {
        return this.f55784l;
    }

    public final boolean l() {
        return this.f55773a == null;
    }

    public final boolean m() {
        EnumC4112cb enumC4112cb = EnumC4112cb.EVENT_TYPE_UNDEFINED;
        return -1 == this.f55776d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setBytesTruncated(int i10) {
        this.f55779g = i10;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setCustomType(int i10) {
        this.f55777e = i10;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setExtras(@NonNull Map<String, byte[]> map) {
        this.f55788p = map;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setName(@Nullable String str) {
        this.f55773a = str;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setType(int i10) {
        this.f55776d = i10;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setValue(@Nullable String str) {
        this.f55774b = str;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setValueBytes(@Nullable byte[] bArr) {
        this.f55774b = bArr == null ? null : new String(Base64.encode(bArr, 0));
    }

    @NonNull
    public final String toString() {
        Locale locale = Locale.US;
        Object[] objArr = new Object[3];
        objArr[0] = this.f55773a;
        objArr[1] = EnumC4112cb.a(this.f55776d).f56510b;
        String strSubstring = this.f55774b;
        if (strSubstring == null) {
            strSubstring = null;
        } else if (strSubstring.length() > 500) {
            strSubstring = strSubstring.substring(0, 500);
        }
        objArr[2] = strSubstring;
        return String.format(locale, "[event: %s, type: %s, value: %s]", objArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Bundle bundle = new Bundle();
        bundle.putString("CounterReport.Event", this.f55773a);
        bundle.putString("CounterReport.Value", this.f55774b);
        bundle.putInt("CounterReport.Type", this.f55776d);
        bundle.putInt("CounterReport.CustomType", this.f55777e);
        bundle.putInt("CounterReport.TRUNCATED", this.f55779g);
        bundle.putString("CounterReport.ProfileID", this.f55780h);
        bundle.putInt("CounterReport.UniquenessStatus", this.f55783k.f56666a);
        Bundle bundle2 = this.f55785m;
        if (bundle2 != null) {
            bundle.putParcelable("CounterReport.Payload", bundle2);
        }
        String str = this.f55775c;
        if (str != null) {
            bundle.putString("CounterReport.Environment", str);
        }
        Pair pair = this.f55778f;
        if (pair != null) {
            bundle.putString("CounterReport.AppEnvironmentDiffKey", (String) pair.first);
            bundle.putString("CounterReport.AppEnvironmentDiffValue", (String) pair.second);
        }
        bundle.putLong("CounterReport.CreationElapsedRealtime", this.f55781i);
        bundle.putLong("CounterReport.CreationTimestamp", this.f55782j);
        EnumC4392n9 enumC4392n9 = this.f55784l;
        if (enumC4392n9 != null) {
            bundle.putInt("CounterReport.Source", enumC4392n9.f57340a);
        }
        Boolean bool = this.f55786n;
        if (bool != null) {
            bundle.putBoolean("CounterReport.AttributionIdChanged", bool.booleanValue());
        }
        Integer num = this.f55787o;
        if (num != null) {
            bundle.putInt("CounterReport.OpenId", num.intValue());
        }
        bundle.putBundle("CounterReport.Extras", CollectionUtils.mapToBundle(this.f55788p));
        parcel.writeBundle(bundle);
    }

    public Q5(@Nullable String str, @Nullable String str2, int i10) {
        this(str, str2, i10, new SystemTimeProvider());
    }

    public final void a(long j10) {
        this.f55781i = j10;
    }

    public final void b(long j10) {
        this.f55782j = j10;
    }

    @Nullable
    public final Boolean c() {
        return this.f55786n;
    }

    @VisibleForTesting
    public Q5(@Nullable String str, @Nullable String str2, int i10, @NonNull SystemTimeProvider systemTimeProvider) {
        this.f55783k = EnumC4162ea.UNKNOWN;
        this.f55788p = new HashMap();
        this.f55773a = str2;
        this.f55776d = i10;
        this.f55774b = str;
        this.f55781i = systemTimeProvider.elapsedRealtime();
        this.f55782j = systemTimeProvider.currentTimeMillis();
    }

    @NonNull
    public static Q5 b(@Nullable Bundle bundle) {
        if (bundle != null) {
            try {
                Q5 q10 = (Q5) bundle.getParcelable("CounterReport.Object");
                if (q10 != null) {
                    return q10;
                }
            } catch (Throwable unused) {
                return new Q5("", 0);
            }
        }
        return new Q5("", 0);
    }

    @NonNull
    public static Q5 c(@NonNull Q5 q10) {
        return a(q10, EnumC4112cb.EVENT_TYPE_INIT);
    }

    @NonNull
    public static Q5 d(@NonNull Q5 q10) {
        Q5 q11 = new Q5("", 0);
        q11.f55782j = q10.f55782j;
        q11.f55781i = q10.f55781i;
        q11.f55778f = q10.f55778f;
        q11.f55775c = q10.f55775c;
        q11.f55785m = q10.f55785m;
        q11.f55788p = q10.f55788p;
        q11.f55780h = q10.f55780h;
        return q11;
    }

    public final void a(@NonNull EnumC4162ea enumC4162ea) {
        this.f55783k = enumC4162ea;
    }

    public final void a(@Nullable EnumC4392n9 enumC4392n9) {
        this.f55784l = enumC4392n9;
    }

    public final void a(@Nullable Boolean bool) {
        this.f55786n = bool;
    }

    public final void a(@Nullable Integer num) {
        this.f55787o = num;
    }

    public static Pair a(Bundle bundle) {
        if (bundle.containsKey("CounterReport.AppEnvironmentDiffKey") && bundle.containsKey("CounterReport.AppEnvironmentDiffValue")) {
            return new Pair(bundle.getString("CounterReport.AppEnvironmentDiffKey"), bundle.getString("CounterReport.AppEnvironmentDiffValue"));
        }
        return null;
    }

    @NonNull
    public static Q5 b(@NonNull Q5 q10) {
        return a(q10, EnumC4112cb.EVENT_TYPE_FIRST_ACTIVATION);
    }

    public static Q5 a(Q5 q10, EnumC4112cb enumC4112cb) {
        Q5 q5D = d(q10);
        q5D.f55776d = enumC4112cb.f56509a;
        return q5D;
    }

    @NonNull
    public static Q5 a(@NonNull Q5 q10) {
        return a(q10, EnumC4112cb.EVENT_TYPE_ALIVE);
    }

    @NonNull
    public static Q5 a(@NonNull Q5 q10, @NonNull N9 n10) {
        Q5 q5A = a(q10, EnumC4112cb.EVENT_TYPE_START);
        q5A.setValueBytes(MessageNano.toByteArray(new C4467q9().fromModel(new C4442p9((String) n10.f55618b.a()))));
        q5A.f55782j = q10.f55782j;
        q5A.f55781i = q10.f55781i;
        return q5A;
    }

    @NonNull
    public static Q5 a(@NonNull Q5 q10, @NonNull Collection<PermissionState> collection, @Nullable C4659y2 c4659y2, @NonNull C4129d2 c4129d2, @NonNull List<String> list) {
        String string;
        String str;
        Q5 q5D = d(q10);
        try {
            JSONArray jSONArray = new JSONArray();
            for (PermissionState permissionState : collection) {
                jSONArray.put(new JSONObject().put("name", permissionState.name).put("granted", permissionState.granted));
            }
            JSONObject jSONObject = new JSONObject();
            if (c4659y2 != null) {
                jSONObject.put("background_restricted", c4659y2.f57988b);
                EnumC4634x2 enumC4634x2 = c4659y2.f57987a;
                c4129d2.getClass();
                if (enumC4634x2 != null) {
                    int iOrdinal = enumC4634x2.ordinal();
                    if (iOrdinal == 0) {
                        str = "EXEMPTED";
                    } else if (iOrdinal == 1) {
                        str = "ACTIVE";
                    } else if (iOrdinal == 2) {
                        str = "WORKING_SET";
                    } else if (iOrdinal == 3) {
                        str = "FREQUENT";
                    } else if (iOrdinal == 4) {
                        str = "RARE";
                    } else if (iOrdinal == 5) {
                        str = "RESTRICTED";
                    }
                    jSONObject.put("app_standby_bucket", str);
                }
                str = null;
                jSONObject.put("app_standby_bucket", str);
            }
            string = new JSONObject().put("permissions", jSONArray).put("background_restrictions", jSONObject).put("available_providers", new JSONArray((Collection) list)).toString();
        } catch (Throwable unused) {
            string = "";
        }
        EnumC4112cb enumC4112cb = EnumC4112cb.EVENT_TYPE_UNDEFINED;
        q5D.f55776d = 12288;
        q5D.setValue(string);
        return q5D;
    }

    @NonNull
    public static Q5 a(@NonNull Q5 q10, @Nullable String str) {
        Q5 q5D = d(q10);
        EnumC4112cb enumC4112cb = EnumC4112cb.EVENT_TYPE_UNDEFINED;
        q5D.f55776d = 12289;
        q5D.setValue(str);
        return q5D;
    }

    @NonNull
    public static Q5 a() {
        Q5 q10 = new Q5("", 0);
        EnumC4112cb enumC4112cb = EnumC4112cb.EVENT_TYPE_UNDEFINED;
        q10.f55776d = 16384;
        return q10;
    }

    @NonNull
    public static Q5 a(@NonNull String str) {
        Q5 q10 = new Q5("", 0);
        EnumC4112cb enumC4112cb = EnumC4112cb.EVENT_TYPE_UNDEFINED;
        q10.f55776d = 12320;
        q10.f55774b = str;
        q10.f55784l = EnumC4392n9.JS;
        return q10;
    }
}
