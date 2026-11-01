package s4;

import android.net.Uri;
import g5.k0;

/* JADX INFO: compiled from: SsUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a {
    public static Uri a(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment != null && k0.K0(lastPathSegment).matches("manifest(\\(.+\\))?")) {
            return uri;
        }
        return Uri.withAppendedPath(uri, "Manifest");
    }
}
