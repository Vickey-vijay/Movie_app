package yads;

import android.net.Uri;

/* JADX INFO: loaded from: classes6.dex */
public final class k90 implements m90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f79340a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k90) && ck.p.e(this.f79340a, ((k90) obj).f79340a);
    }

    public final int hashCode() {
        return this.f79340a.hashCode();
    }

    public final String toString() {
        return "ShareReport(reportUri=" + this.f79340a + ")";
    }

    public k90(Uri uri) {
        this.f79340a = uri;
    }
}
