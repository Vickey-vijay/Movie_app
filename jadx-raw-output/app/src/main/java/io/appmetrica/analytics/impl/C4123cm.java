package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.BuildConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.cm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4123cm extends O5 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f56532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f56533e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f56534f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f56535g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Map f56536h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C4510s3 f56537i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List f56538j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f56539k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f56540l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f56541m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f56542n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C4374mg f56543o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final I7 f56544p;

    public C4123cm() {
        this(C4418oa.k().u(), new I7());
    }

    public final long a(long j10) {
        if (this.f56542n == 0) {
            this.f56542n = j10;
        }
        return this.f56542n;
    }

    @NonNull
    public final C4510s3 c() {
        return this.f56537i;
    }

    @Nullable
    public final Map<String, String> d() {
        return this.f56536h;
    }

    public final String e() {
        return this.f56541m;
    }

    @Nullable
    public final String f() {
        return this.f56534f;
    }

    public final long g() {
        return this.f56542n;
    }

    @Nullable
    public final String h() {
        return this.f56535g;
    }

    @Nullable
    public final List<String> i() {
        return this.f56538j;
    }

    @NonNull
    public final C4374mg j() {
        return this.f56543o;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0059  */
    /* JADX WARN: Code duplicated, block: B:29:0x0063  */
    /* JADX WARN: Code duplicated, block: B:34:0x0070  */
    /* JADX WARN: Code duplicated, block: B:36:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:27:0x0059, please report this as an issue */
    public final List<String> k() {
        String[] strArr;
        ArrayList arrayList;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (!mo.a((Collection) this.f56532d)) {
            linkedHashSet.addAll(this.f56532d);
        }
        if (!mo.a((Collection) this.f56533e)) {
            linkedHashSet.addAll(this.f56533e);
        }
        String[] strArr2 = (String[]) this.f56544p.f55339a.a();
        if (strArr2 != null) {
            arrayList = new ArrayList();
            for (String str : strArr2) {
                if (str == null || !(!lk.a0.n0(str))) {
                    str = null;
                }
                if (str != null) {
                    arrayList.add(str);
                }
            }
            if (!(!arrayList.isEmpty())) {
                arrayList = null;
            }
            if (arrayList == null) {
                strArr = BuildConfig.DEFAULT_HOSTS;
                arrayList = new ArrayList();
                for (String str2 : strArr) {
                    if (str2 != null || !(!lk.a0.n0(str2))) {
                        str2 = null;
                    }
                    if (str2 != null) {
                        arrayList.add(str2);
                    }
                }
            }
        } else {
            strArr = BuildConfig.DEFAULT_HOSTS;
            arrayList = new ArrayList();
            while (i < r5) {
                if (str2 != null) {
                    str2 = null;
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    arrayList.add(str2);
                }
            }
        }
        linkedHashSet.addAll(arrayList);
        return new ArrayList(linkedHashSet);
    }

    public final List<String> l() {
        return this.f56533e;
    }

    public final List<String> m() {
        return this.f56532d;
    }

    @Nullable
    public final boolean n() {
        return this.f56539k;
    }

    public final boolean o() {
        return this.f56540l;
    }

    @Override // io.appmetrica.analytics.impl.O5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig
    public final String toString() {
        return "StartupRequestConfig{mStartupHostsFromStartup=" + this.f56532d + ", mStartupHostsFromClient=" + this.f56533e + ", mDistributionReferrer='" + this.f56534f + "', mInstallReferrerSource='" + this.f56535g + "', mClidsFromClient=" + this.f56536h + ", mNewCustomHosts=" + this.f56538j + ", mHasNewCustomHosts=" + this.f56539k + ", mSuccessfulStartup=" + this.f56540l + ", mCountryInit='" + this.f56541m + "', mFirstStartupTime=" + this.f56542n + "} " + super.toString();
    }

    public C4123cm(C4374mg c4374mg, I7 i10) {
        this.f56537i = new C4510s3(null, T7.f55911c);
        this.f56542n = 0L;
        this.f56543o = c4374mg;
        this.f56544p = i10;
    }

    public final void a(@Nullable List<String> list) {
        this.f56538j = list;
    }

    public final void a(boolean z10) {
        this.f56539k = z10;
    }

    public final void a(String str) {
        this.f56541m = str;
    }
}
