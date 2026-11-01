package fd;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.ImageView;

/* JADX INFO: compiled from: UCropImageEngine.java */
/* JADX INFO: loaded from: classes11.dex */
public interface c {

    /* JADX INFO: compiled from: UCropImageEngine.java */
    public interface a<T> {
        void a(T t10);
    }

    void a(Context context, String str, ImageView imageView);

    void b(Context context, Uri uri, int i10, int i11, a<Bitmap> aVar);
}
