package com.inmobi.media;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class E6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f22570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F6 f22571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f22572c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E6)) {
            return false;
        }
        E6 e10 = (E6) obj;
        return Float.compare(this.f22570a, e10.f22570a) == 0 && ck.p.e(this.f22571b, e10.f22571b) && ck.p.e(this.f22572c, e10.f22572c);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f22570a) * 31;
        F6 f10 = this.f22571b;
        int iHashCode2 = (iHashCode + (f10 == null ? 0 : f10.hashCode())) * 31;
        ArrayList arrayList = this.f22572c;
        return iHashCode2 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final String toString() {
        return "ExposureMetrics(exposedPercentage=" + this.f22570a + ", visibleRectangle=" + this.f22571b + ", occlusionRectangles=" + this.f22572c + ")";
    }

    public E6(float f10, F6 f11, ArrayList arrayList) {
        this.f22570a = f10;
        this.f22571b = f11;
        this.f22572c = arrayList;
    }
}
