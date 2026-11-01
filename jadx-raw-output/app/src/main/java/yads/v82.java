package yads;

import android.graphics.Bitmap;
import android.util.LruCache;

/* JADX INFO: loaded from: classes11.dex */
public final class v82 extends LruCache {
    @Override // android.util.LruCache
    public final int sizeOf(Object obj, Object obj2) {
        Bitmap bitmap = (Bitmap) obj2;
        return bitmap != null ? bitmap.getByteCount() / 1024 : super.sizeOf((String) obj, null);
    }

    public v82(int i10) {
        super(i10);
    }
}
