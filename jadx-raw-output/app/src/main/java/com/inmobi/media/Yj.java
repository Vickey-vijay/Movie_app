package com.inmobi.media;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class Yj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f23858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f23859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f23860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f23861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f23862e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f23863f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f23864g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Yj)) {
            return false;
        }
        Yj yj2 = (Yj) obj;
        return this.f23858a == yj2.f23858a && this.f23859b == yj2.f23859b && this.f23860c == yj2.f23860c && this.f23861d == yj2.f23861d && this.f23862e == yj2.f23862e && ck.p.e(this.f23863f, yj2.f23863f) && Double.compare(this.f23864g, yj2.f23864g) == 0;
    }

    public Yj(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, List list, double d10) {
        ck.p.j(list, "priorityEventsList");
        this.f23858a = z10;
        this.f23859b = z11;
        this.f23860c = z12;
        this.f23861d = z13;
        this.f23862e = z14;
        this.f23863f = list;
        this.f23864g = d10;
    }

    public final int hashCode() {
        return Double.hashCode(this.f23864g) + ((this.f23863f.hashCode() + ((Boolean.hashCode(this.f23862e) + ((Boolean.hashCode(this.f23861d) + ((Boolean.hashCode(this.f23860c) + ((Boolean.hashCode(this.f23859b) + (Boolean.hashCode(this.f23858a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TelemetryConfigMetaData(isTelemetryEnabled=" + this.f23858a + ", isImageEnabled=" + this.f23859b + ", isGIFEnabled=" + this.f23860c + ", isVideoEnabled=" + this.f23861d + ", isGeneralEventsDisabled=" + this.f23862e + ", priorityEventsList=" + this.f23863f + ", samplingFactor=" + this.f23864g + ")";
    }
}
