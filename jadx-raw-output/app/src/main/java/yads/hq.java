package yads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes11.dex */
public final class hq implements yj0 {
    @Override // yads.yj0
    public final Drawable a(byte[] bArr, Context context) {
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        if (bitmapDecodeByteArray != null) {
            return new BitmapDrawable(context.getResources(), bitmapDecodeByteArray);
        }
        throw new IllegalArgumentException("Cannot decode bitmap from data");
    }
}
