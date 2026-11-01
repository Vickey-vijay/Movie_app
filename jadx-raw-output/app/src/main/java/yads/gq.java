package yads;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes11.dex */
public final class gq implements eq {
    @Override // yads.eq
    public final boolean a(Drawable drawable, Bitmap bitmap) {
        return ck.p.e(bitmap, ((BitmapDrawable) drawable).getBitmap());
    }
}
