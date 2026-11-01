package gd;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: BitmapLoadCallback.java */
/* JADX INFO: loaded from: classes11.dex */
public interface b {
    void a(@NonNull Bitmap bitmap, @NonNull hd.b bVar, @NonNull Uri uri, @Nullable Uri uri2);

    void onFailure(@NonNull Exception exc);
}
