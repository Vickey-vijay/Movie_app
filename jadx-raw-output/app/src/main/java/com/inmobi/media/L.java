package com.inmobi.media;

import android.graphics.RectF;

/* JADX INFO: loaded from: classes8.dex */
public final class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RectF f23031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f23032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f23033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RectF f23034d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l10 = (L) obj;
        return ck.p.e(this.f23031a, l10.f23031a) && ck.p.e(this.f23032b, l10.f23032b) && ck.p.e(this.f23033c, l10.f23033c) && ck.p.e(this.f23034d, l10.f23034d);
    }

    public final int hashCode() {
        RectF rectF = this.f23031a;
        int iHashCode = (rectF == null ? 0 : rectF.hashCode()) * 31;
        RectF rectF2 = this.f23032b;
        int iHashCode2 = (iHashCode + (rectF2 == null ? 0 : rectF2.hashCode())) * 31;
        RectF rectF3 = this.f23033c;
        int iHashCode3 = (iHashCode2 + (rectF3 == null ? 0 : rectF3.hashCode())) * 31;
        RectF rectF4 = this.f23034d;
        return iHashCode3 + (rectF4 != null ? rectF4.hashCode() : 0);
    }

    public final String toString() {
        return "CurvedEdges(topLeft=" + this.f23031a + ", topRight=" + this.f23032b + ", bottomLeft=" + this.f23033c + ", bottomRight=" + this.f23034d + ")";
    }

    public L(RectF rectF, RectF rectF2, RectF rectF3, RectF rectF4) {
        this.f23031a = rectF;
        this.f23032b = rectF2;
        this.f23033c = rectF3;
        this.f23034d = rectF4;
    }
}
