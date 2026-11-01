package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.c6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2773c6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f24115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f24116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f24117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f24118e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f24119f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f24120g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f24121h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f24122i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f24123j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f24124k;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2773c6)) {
            return false;
        }
        C2773c6 c2773c6 = (C2773c6) obj;
        return this.f24114a == c2773c6.f24114a && this.f24115b == c2773c6.f24115b && this.f24116c == c2773c6.f24116c && this.f24117d == c2773c6.f24117d && this.f24118e == c2773c6.f24118e && this.f24119f == c2773c6.f24119f && this.f24120g == c2773c6.f24120g && this.f24121h == c2773c6.f24121h && this.f24122i == c2773c6.f24122i && this.f24123j == c2773c6.f24123j;
    }

    public final int hashCode() {
        return Long.hashCode(this.f24123j) + ((Long.hashCode(this.f24122i) + AbstractC2862fi.a(this.f24121h, AbstractC2862fi.a(this.f24120g, AbstractC2862fi.a(this.f24119f, AbstractC2862fi.a(this.f24118e, (Long.hashCode(this.f24117d) + ((Long.hashCode(this.f24116c) + ((Long.hashCode(this.f24115b) + (Integer.hashCode(this.f24114a) * 31)) * 31)) * 31)) * 31, 31), 31), 31), 31)) * 31);
    }

    public final String toString() {
        return "EventConfig(maxRetryCount=" + this.f24114a + ", timeToLiveInSec=" + this.f24115b + ", processingInterval=" + this.f24116c + ", ingestionLatencyInSec=" + this.f24117d + ", minBatchSizeWifi=" + this.f24118e + ", maxBatchSizeWifi=" + this.f24119f + ", minBatchSizeMobile=" + this.f24120g + ", maxBatchSizeMobile=" + this.f24121h + ", retryIntervalWifi=" + this.f24122i + ", retryIntervalMobile=" + this.f24123j + ")";
    }

    public C2773c6(int i10, long j10, long j11, long j12, int i11, int i12, int i13, int i14, long j13, long j14) {
        this.f24114a = i10;
        this.f24115b = j10;
        this.f24116c = j11;
        this.f24117d = j12;
        this.f24118e = i11;
        this.f24119f = i12;
        this.f24120g = i13;
        this.f24121h = i14;
        this.f24122i = j13;
        this.f24123j = j14;
    }
}
