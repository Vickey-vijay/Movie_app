package yads;

import android.net.Uri;

/* JADX INFO: loaded from: classes10.dex */
public final class ci0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f76285a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ci0) && ck.p.e(this.f76285a, ((ci0) obj).f76285a);
    }

    public final int hashCode() {
        return this.f76285a.hashCode();
    }

    public final String toString() {
        return "DivKitClickExtensionData(url=" + this.f76285a + ")";
    }

    public ci0(Uri uri) {
        this.f76285a = uri;
    }
}
