package yads;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes8.dex */
public final class q31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f81693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bitmap f81694b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q31)) {
            return false;
        }
        q31 q31Var = (q31) obj;
        return ck.p.e(this.f81693a, q31Var.f81693a) && ck.p.e(this.f81694b, q31Var.f81694b);
    }

    public final int hashCode() {
        return this.f81694b.hashCode() + (this.f81693a.hashCode() * 31);
    }

    public final String toString() {
        return "ImageData(url=" + this.f81693a + ", bitmap=" + this.f81694b + ")";
    }

    public q31(String str, Bitmap bitmap) {
        this.f81693a = str;
        this.f81694b = bitmap;
    }
}
