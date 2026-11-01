package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Set;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.af, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4064af extends AbstractC4695zd implements Co {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Ze f56356d = new Ze("LOCATION_TRACKING_ENABLED", null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Ze f56357e = new Ze("PREF_KEY_OFFSET", null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Ze f56358f = new Ze("UNCHECKED_TIME", null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Ze f56359g = new Ze("STATISTICS_RESTRICTED_IN_MAIN", null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Ze f56360h = new Ze("LAST_IDENTITY_LIGHT_SEND_TIME", null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Ze f56361i = new Ze("NEXT_REPORT_SEND_ATTEMPT_NUMBER", null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Ze f56362j = new Ze("NEXT_LOCATION_SEND_ATTEMPT_NUMBER", null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Ze f56363k = new Ze("NEXT_STARTUP_SEND_ATTEMPT_NUMBER", null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Ze f56364l = new Ze("LAST_REPORT_SEND_ATTEMPT_TIME", null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Ze f56365m = new Ze("LAST_LOCATION_SEND_ATTEMPT_TIME", null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Ze f56366n = new Ze("LAST_STARTUP_SEND_ATTEMPT_TIME", null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Ze f56367o = new Ze("SATELLITE_PRELOAD_INFO_CHECKED", null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Ze f56368p = new Ze("SATELLITE_CLIDS_CHECKED", null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Ze f56369q = new Ze("VITAL_DATA", null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Ze f56370r = new Ze("LAST_KOTLIN_VERSION_SEND_TIME", null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Ze f56371s = new Ze("ADV_IDENTIFIERS_TRACKING_ENABLED", null);

    public final long a(int i10) {
        return this.f56247a.getLong(f56357e.f56287b, i10);
    }

    public final boolean b(boolean z10) {
        return this.f56247a.getBoolean(f56358f.f56287b, z10);
    }

    public final C4064af c(boolean z10) {
        return (C4064af) b(f56359g.f56287b, z10);
    }

    public final C4064af d(long j10) {
        return (C4064af) b(f56357e.f56287b, j10);
    }

    public final boolean e() {
        return this.f56247a.getBoolean(f56356d.f56287b, false);
    }

    public final void f(boolean z10) {
        b(f56356d.f56287b, z10).b();
    }

    public final C4064af g() {
        return (C4064af) b(f56368p.f56287b, true);
    }

    public final C4064af h() {
        return (C4064af) b(f56367o.f56287b, true);
    }

    public final boolean i() {
        return this.f56247a.getBoolean(f56367o.f56287b, false);
    }

    public final boolean j() {
        return this.f56247a.getBoolean(f56368p.f56287b, false);
    }

    public C4064af(Ia ia2) {
        super(ia2);
    }

    public final long a(long j10) {
        return this.f56247a.getLong(f56360h.f56287b, j10);
    }

    public final C4064af b(long j10) {
        return (C4064af) b(f56360h.f56287b, j10);
    }

    public final C4064af c(long j10) {
        return (C4064af) b(f56370r.f56287b, j10);
    }

    public final C4064af d(boolean z10) {
        return (C4064af) b(f56358f.f56287b, z10);
    }

    public final void e(boolean z10) {
        b(f56371s.f56287b, z10).b();
    }

    public final long f() {
        return this.f56247a.getLong(f56370r.f56287b, 0L);
    }

    @Override // io.appmetrica.analytics.impl.Co
    @Nullable
    public final String a() {
        return this.f56247a.getString(f56369q.f56287b, null);
    }

    public final C4064af b(@NonNull Ud ud2, int i10) {
        Ze ze2;
        int iOrdinal = ud2.ordinal();
        if (iOrdinal == 0) {
            ze2 = f56361i;
        } else if (iOrdinal != 1) {
            ze2 = iOrdinal != 2 ? null : f56363k;
        } else {
            ze2 = f56362j;
        }
        return ze2 != null ? (C4064af) b(ze2.f56287b, i10) : this;
    }

    @Override // io.appmetrica.analytics.impl.Ye
    @NonNull
    public final Set<String> c() {
        return this.f56247a.a();
    }

    @Nullable
    public final Boolean d() {
        Ze ze2 = f56359g;
        if (!this.f56247a.a(ze2.f56287b)) {
            return null;
        }
        return Boolean.valueOf(this.f56247a.getBoolean(ze2.f56287b, true));
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4695zd
    @NonNull
    public final String f(@NonNull String str) {
        return new Ze(str, null).f56287b;
    }

    @Override // io.appmetrica.analytics.impl.Co
    public final void a(@NonNull String str) {
        b(f56369q.f56287b, str).b();
    }

    public final boolean a(boolean z10) {
        return this.f56247a.getBoolean(f56371s.f56287b, z10);
    }

    public final C4064af b(@NonNull Ud ud2, long j10) {
        Ze ze2;
        int iOrdinal = ud2.ordinal();
        if (iOrdinal == 0) {
            ze2 = f56364l;
        } else if (iOrdinal != 1) {
            ze2 = iOrdinal != 2 ? null : f56366n;
        } else {
            ze2 = f56365m;
        }
        return ze2 != null ? (C4064af) b(ze2.f56287b, j10) : this;
    }

    public final int a(@NonNull Ud ud2, int i10) {
        Ze ze2;
        int iOrdinal = ud2.ordinal();
        if (iOrdinal == 0) {
            ze2 = f56361i;
        } else if (iOrdinal != 1) {
            ze2 = iOrdinal != 2 ? null : f56363k;
        } else {
            ze2 = f56362j;
        }
        if (ze2 == null) {
            return i10;
        }
        return this.f56247a.getInt(ze2.f56287b, i10);
    }

    public final long a(@NonNull Ud ud2, long j10) {
        Ze ze2;
        int iOrdinal = ud2.ordinal();
        if (iOrdinal == 0) {
            ze2 = f56364l;
        } else if (iOrdinal != 1) {
            ze2 = iOrdinal != 2 ? null : f56366n;
        } else {
            ze2 = f56365m;
        }
        if (ze2 == null) {
            return j10;
        }
        return this.f56247a.getLong(ze2.f56287b, j10);
    }
}
