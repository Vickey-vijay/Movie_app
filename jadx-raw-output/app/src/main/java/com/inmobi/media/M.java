package com.inmobi.media;

import android.graphics.RectF;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RectF f23118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f23119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f23121d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m10 = (M) obj;
        return ck.p.e(this.f23118a, m10.f23118a) && ck.p.e(this.f23119b, m10.f23119b) && this.f23120c == m10.f23120c && this.f23121d == m10.f23121d;
    }

    public M(RectF rectF, ArrayList arrayList, int i10, int i11) {
        ck.p.j(rectF, "visibleRect");
        ck.p.j(arrayList, "obstructions");
        this.f23118a = rectF;
        this.f23119b = arrayList;
        this.f23120c = i10;
        this.f23121d = i11;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f23121d) + AbstractC2862fi.a(this.f23120c, (this.f23119b.hashCode() + (this.f23118a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "ExposureInputData(visibleRect=" + this.f23118a + ", obstructions=" + this.f23119b + ", screenWidth=" + this.f23120c + ", screenHeight=" + this.f23121d + ")";
    }
}
