package yads;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class z61 implements a71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f85229a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z61) && ck.p.e(this.f85229a, ((z61) obj).f85229a);
    }

    public final int hashCode() {
        return this.f85229a.hashCode();
    }

    public final String toString() {
        return "Success(reportUri=" + this.f85229a + ")";
    }

    public z61(Uri uri) {
        this.f85229a = uri;
    }
}
