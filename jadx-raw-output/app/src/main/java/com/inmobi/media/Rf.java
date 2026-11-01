package com.inmobi.media;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class Rf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f23454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f23455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f23456e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f23457f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f23458g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f23459h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f23460i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Long f23461j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C2888gi f23462k;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rf)) {
            return false;
        }
        Rf rf2 = (Rf) obj;
        return ck.p.e(this.f23452a, rf2.f23452a) && ck.p.e(this.f23453b, rf2.f23453b) && ck.p.e(this.f23454c, rf2.f23454c) && this.f23455d == rf2.f23455d && ck.p.e(this.f23456e, rf2.f23456e) && this.f23457f == rf2.f23457f && this.f23458g == rf2.f23458g && ck.p.e(this.f23459h, rf2.f23459h) && this.f23460i == rf2.f23460i && ck.p.e(this.f23461j, rf2.f23461j) && ck.p.e(this.f23462k, rf2.f23462k);
    }

    public Rf(String str, String str2, Map map, boolean z10, String str3, boolean z11, int i10, String str4, long j10, Long l10, C2888gi c2888gi) {
        ck.p.j(str, "url");
        ck.p.j(str2, "id");
        ck.p.j(map, "headers");
        ck.p.j(str3, HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
        ck.p.j(str4, "ownerId");
        this.f23452a = str;
        this.f23453b = str2;
        this.f23454c = map;
        this.f23455d = z10;
        this.f23456e = str3;
        this.f23457f = z11;
        this.f23458g = i10;
        this.f23459h = str4;
        this.f23460i = j10;
        this.f23461j = l10;
        this.f23462k = c2888gi;
    }

    public final int hashCode() {
        int iHashCode = (Long.hashCode(this.f23460i) + ((this.f23459h.hashCode() + AbstractC2862fi.a(this.f23458g, (Boolean.hashCode(this.f23457f) + ((this.f23456e.hashCode() + ((Boolean.hashCode(this.f23455d) + ((this.f23454c.hashCode() + ((this.f23453b.hashCode() + (this.f23452a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31)) * 31)) * 31;
        Long l10 = this.f23461j;
        int iHashCode2 = (iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
        C2888gi c2888gi = this.f23462k;
        return iHashCode2 + (c2888gi != null ? c2888gi.hashCode() : 0);
    }

    public final String toString() {
        return "Ping(url=" + this.f23452a + ", id=" + this.f23453b + ", headers=" + this.f23454c + ", allowRedirects=" + this.f23455d + ", priority=" + this.f23456e + ", ackRequired=" + this.f23457f + ", retryCount=" + this.f23458g + ", ownerId=" + this.f23459h + ", createdAt=" + this.f23460i + ", retryAfterTimestamp=" + this.f23461j + ", telemetryData=" + this.f23462k + ")";
    }
}
