package z7;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: PictureContentResolver.java */
/* JADX INFO: loaded from: classes2.dex */
public final class e {
    public static InputStream a(Context context, Uri uri) {
        try {
            return context.getContentResolver().openInputStream(uri);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static OutputStream b(Context context, Uri uri) {
        try {
            return context.getContentResolver().openOutputStream(uri);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
