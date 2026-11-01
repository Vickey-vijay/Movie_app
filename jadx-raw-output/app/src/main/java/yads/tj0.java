package yads;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.LruCache;

/* JADX INFO: loaded from: classes11.dex */
public final class tj0 extends LruCache {
    @Override // android.util.LruCache
    public final int sizeOf(Object obj, Object obj2) {
        Drawable drawable = ((uj0) obj2).f83504a;
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap().getByteCount() / 1024;
        }
        return 100;
    }

    public tj0(int i10) {
        super(i10);
    }
}
