package yads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes11.dex */
public final class oz0 implements yj0 {
    @Override // yads.yj0
    public final Drawable a(byte[] bArr, Context context) throws IOException {
        if (Build.VERSION.SDK_INT < 28) {
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
            if (bitmapDecodeByteArray != null) {
                return new BitmapDrawable(context.getResources(), bitmapDecodeByteArray);
            }
            throw new IllegalArgumentException("Cannot decode bitmap from data");
        }
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(ByteBuffer.wrap(bArr)));
        if (!(drawableDecodeDrawable instanceof AnimatedImageDrawable)) {
            return drawableDecodeDrawable;
        }
        ((AnimatedImageDrawable) drawableDecodeDrawable).start();
        return drawableDecodeDrawable;
    }
}
