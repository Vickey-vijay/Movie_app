package androidx.core.net;

import android.net.Uri;
import ck.p;
import com.ironsource.C3426d4;
import java.io.File;

/* JADX INFO: compiled from: Uri.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class UriKt {
    public static final Uri toUri(String str) {
        return Uri.parse(str);
    }

    public static final Uri toUri(File file) {
        return Uri.fromFile(file);
    }

    public static final File toFile(Uri uri) {
        if (p.e(uri.getScheme(), C3426d4.i.f28530b)) {
            String path = uri.getPath();
            if (path != null) {
                return new File(path);
            }
            throw new IllegalArgumentException(("Uri path is null: " + uri).toString());
        }
        throw new IllegalArgumentException(("Uri lacks 'file' scheme: " + uri).toString());
    }
}
