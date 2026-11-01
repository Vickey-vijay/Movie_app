package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.km, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4329km {
    public final Map A;
    public final C9 B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f57131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f57132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f57133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f57134d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f57135e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f57136f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f57137g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f57138h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Map f57139i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f57140j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f57141k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f57142l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C4362m4 f57143m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f57144n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f57145o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f57146p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f57147q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Hm f57148r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C4671ye f57149s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final RetryPolicyConfig f57150t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f57151u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f57152v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f57153w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C4155e3 f57154x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C4385n2 f57155y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Dm f57156z;

    public final C4303jm a(C4362m4 c4362m4) {
        C4303jm c4303jm = new C4303jm(c4362m4);
        c4303jm.f57030a = this.f57131a;
        c4303jm.f57035f = this.f57136f;
        c4303jm.f57036g = this.f57137g;
        c4303jm.f57039j = this.f57140j;
        c4303jm.f57031b = this.f57132b;
        c4303jm.f57032c = this.f57133c;
        c4303jm.f57033d = this.f57134d;
        c4303jm.f57034e = this.f57135e;
        c4303jm.f57037h = this.f57138h;
        c4303jm.f57038i = this.f57139i;
        c4303jm.f57040k = this.f57141k;
        c4303jm.f57041l = this.f57142l;
        c4303jm.f57046q = this.f57146p;
        c4303jm.f57044o = this.f57144n;
        c4303jm.f57045p = this.f57145o;
        c4303jm.f57047r = this.f57147q;
        c4303jm.f57043n = this.f57149s;
        c4303jm.f57049t = this.f57151u;
        c4303jm.f57050u = this.f57152v;
        c4303jm.f57048s = this.f57148r;
        c4303jm.f57051v = this.f57153w;
        c4303jm.f57052w = this.f57150t;
        c4303jm.f57053x = this.f57154x;
        c4303jm.f57054y = this.f57155y;
        c4303jm.f57055z = this.f57156z;
        c4303jm.A = this.A;
        c4303jm.B = this.B;
        return c4303jm;
    }

    public final String toString() {
        return "StartupStateModel{uuid='" + this.f57131a + "', reportUrls=" + this.f57132b + ", getAdUrl='" + this.f57133c + "', reportAdUrl='" + this.f57134d + "', certificateUrl='" + this.f57135e + "', hostUrlsFromStartup=" + this.f57136f + ", hostUrlsFromClient=" + this.f57137g + ", diagnosticUrls=" + this.f57138h + ", customSdkHosts=" + this.f57139i + ", encodedClidsFromResponse='" + this.f57140j + "', lastClientClidsForStartupRequest='" + this.f57141k + "', lastChosenForRequestClids='" + this.f57142l + "', collectingFlags=" + this.f57143m + ", obtainTime=" + this.f57144n + ", hadFirstStartup=" + this.f57145o + ", startupDidNotOverrideClids=" + this.f57146p + ", countryInit='" + this.f57147q + "', statSending=" + this.f57148r + ", permissionsCollectingConfig=" + this.f57149s + ", retryPolicyConfig=" + this.f57150t + ", obtainServerTime=" + this.f57151u + ", firstStartupServerTime=" + this.f57152v + ", outdated=" + this.f57153w + ", cacheControl=" + this.f57154x + ", attributionConfig=" + this.f57155y + ", startupUpdateConfig=" + this.f57156z + ", modulesRemoteConfigs=" + this.A + ", externalAttributionConfig=" + this.B + '}';
    }

    public C4329km(C4303jm c4303jm) {
        List listUnmodifiableListCopy;
        List listUnmodifiableListCopy2;
        List listUnmodifiableListCopy3;
        List listUnmodifiableListCopy4;
        Dm dm2;
        Map mapEmptyMap;
        this.f57131a = c4303jm.f57030a;
        List list = c4303jm.f57031b;
        if (list == null) {
            listUnmodifiableListCopy = null;
        } else {
            listUnmodifiableListCopy = CollectionUtils.unmodifiableListCopy(list);
        }
        this.f57132b = listUnmodifiableListCopy;
        this.f57133c = c4303jm.f57032c;
        this.f57134d = c4303jm.f57033d;
        this.f57135e = c4303jm.f57034e;
        List list2 = c4303jm.f57035f;
        if (list2 == null) {
            listUnmodifiableListCopy2 = null;
        } else {
            listUnmodifiableListCopy2 = CollectionUtils.unmodifiableListCopy(list2);
        }
        this.f57136f = listUnmodifiableListCopy2;
        List list3 = c4303jm.f57036g;
        if (list3 == null) {
            listUnmodifiableListCopy3 = null;
        } else {
            listUnmodifiableListCopy3 = CollectionUtils.unmodifiableListCopy(list3);
        }
        this.f57137g = listUnmodifiableListCopy3;
        List list4 = c4303jm.f57037h;
        if (list4 == null) {
            listUnmodifiableListCopy4 = null;
        } else {
            listUnmodifiableListCopy4 = CollectionUtils.unmodifiableListCopy(list4);
        }
        this.f57138h = listUnmodifiableListCopy4;
        Map map = c4303jm.f57038i;
        this.f57139i = map != null ? CollectionUtils.unmodifiableMapCopy(map) : null;
        this.f57140j = c4303jm.f57039j;
        this.f57141k = c4303jm.f57040k;
        this.f57143m = c4303jm.f57042m;
        this.f57149s = c4303jm.f57043n;
        this.f57144n = c4303jm.f57044o;
        this.f57145o = c4303jm.f57045p;
        this.f57142l = c4303jm.f57041l;
        this.f57146p = c4303jm.f57046q;
        this.f57147q = c4303jm.f57047r;
        this.f57148r = c4303jm.f57048s;
        this.f57151u = c4303jm.f57049t;
        this.f57152v = c4303jm.f57050u;
        this.f57153w = c4303jm.f57051v;
        RetryPolicyConfig retryPolicyConfig = c4303jm.f57052w;
        if (retryPolicyConfig == null) {
            C4654xm c4654xm = new C4654xm();
            this.f57150t = new RetryPolicyConfig(c4654xm.f57968w, c4654xm.f57969x);
        } else {
            this.f57150t = retryPolicyConfig;
        }
        this.f57154x = c4303jm.f57053x;
        this.f57155y = c4303jm.f57054y;
        if (c4303jm.f57055z != null) {
            dm2 = c4303jm.f57055z;
        } else {
            dm2 = new Dm(J7.f55418b.f57849a);
        }
        this.f57156z = dm2;
        if (c4303jm.A != null) {
            mapEmptyMap = c4303jm.A;
        } else {
            mapEmptyMap = Collections.emptyMap();
        }
        this.A = mapEmptyMap;
        this.B = c4303jm.B;
    }
}
