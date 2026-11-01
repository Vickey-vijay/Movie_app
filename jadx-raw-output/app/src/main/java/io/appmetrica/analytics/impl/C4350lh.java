package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.lh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4350lh extends O5 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f57200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f57201e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f57202f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f57203g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f57204h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f57205i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Boolean f57206j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public InterfaceC4272ih f57207k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final InterfaceC4324kh f57208l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f57209m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f57210n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f57211o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f57212p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List f57213q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f57214r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f57215s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f57216t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f57217u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f57218v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List f57219w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Set f57220x = new HashSet();

    public final void a(int i10) {
        this.f57214r = i10;
    }

    public final void b(List<String> list) {
        this.f57213q = list;
    }

    public final String c() {
        return this.f57209m;
    }

    public final void d(boolean z10) {
        this.f57200d = z10;
    }

    public final void e(boolean z10) {
        this.f57204h = z10;
    }

    public final void f(boolean z10) {
        this.f57210n = z10;
    }

    public final void a(long j10) {
        this.f57218v = j10;
    }

    public final void b(long j10) {
        this.f57215s = j10;
    }

    public final void c(long j10) {
        this.f57216t = j10;
    }

    public final void d(int i10) {
        this.f57202f = i10;
    }

    @NonNull
    public final Set<String> e() {
        return this.f57220x;
    }

    @Nullable
    public final List<String> f() {
        return this.f57219w;
    }

    public final boolean g() {
        return this.f57217u;
    }

    @NonNull
    public final String h() {
        return (String) WrapUtils.getOrDefault(this.f57212p, "");
    }

    public final boolean i() {
        return this.f57207k.a(this.f57206j);
    }

    public final int j() {
        return this.f57203g;
    }

    public final long k() {
        return this.f57218v;
    }

    public final int l() {
        return this.f57205i;
    }

    public final long m() {
        return this.f57215s;
    }

    public final long n() {
        return this.f57216t;
    }

    public final List<String> o() {
        return this.f57213q;
    }

    public final int p() {
        return this.f57202f;
    }

    public final boolean q() {
        return this.f57211o;
    }

    public final boolean r() {
        return this.f57201e;
    }

    public final boolean s() {
        return this.f57200d;
    }

    public final boolean t() {
        return this.f57210n;
    }

    @Override // io.appmetrica.analytics.impl.O5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig
    public final String toString() {
        return "ReportRequestConfig{mLocationTracking=" + this.f57200d + ", mFirstActivationAsUpdate=" + this.f57201e + ", mSessionTimeout=" + this.f57202f + ", mDispatchPeriod=" + this.f57203g + ", mLogEnabled=" + this.f57204h + ", mMaxReportsCount=" + this.f57205i + ", dataSendingEnabledFromArguments=" + this.f57206j + ", dataSendingStrategy=" + this.f57207k + ", mPreloadInfoSendingStrategy=" + this.f57208l + ", mApiKey='" + this.f57209m + "', mPermissionsCollectingEnabled=" + this.f57210n + ", mFeaturesCollectingEnabled=" + this.f57211o + ", mClidsFromStartupResponse='" + this.f57212p + "', mReportHosts=" + this.f57213q + ", mAttributionId=" + this.f57214r + ", mPermissionsCollectingIntervalSeconds=" + this.f57215s + ", mPermissionsForceSendIntervalSeconds=" + this.f57216t + ", mClidsFromClientMatchClidsFromStartupRequest=" + this.f57217u + ", mMaxReportsInDbCount=" + this.f57218v + ", mCertificates=" + this.f57219w + "} " + super.toString();
    }

    public final boolean v() {
        return ((Y4) this.f57208l).B();
    }

    public C4350lh(Y4 y10) {
        this.f57208l = y10;
    }

    public final void a(@NonNull List<String> list) {
        this.f57219w = list;
    }

    public final void b(boolean z10) {
        this.f57211o = z10;
    }

    public final void c(boolean z10) {
        this.f57201e = z10;
    }

    public final int d() {
        return this.f57214r;
    }

    public final boolean u() {
        if (isIdentifiersValid() && !mo.a((Collection) this.f57213q) && this.f57217u) {
            return true;
        }
        return false;
    }

    public final void a(@Nullable Boolean bool, @NonNull InterfaceC4272ih interfaceC4272ih) {
        this.f57206j = bool;
        this.f57207k = interfaceC4272ih;
    }

    public final void b(int i10) {
        this.f57203g = i10;
    }

    public final void c(int i10) {
        this.f57205i = i10;
    }

    public final void a(boolean z10) {
        this.f57217u = z10;
    }

    public final void a(@NonNull Set<String> set) {
        this.f57220x = set;
    }
}
