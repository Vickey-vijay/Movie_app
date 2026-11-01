package com.inmobi.media;

import android.graphics.Bitmap;
import com.squareup.picasso.Transformation;

/* JADX INFO: loaded from: classes6.dex */
public final class Lf implements Transformation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap.Config f23088a;

    public Lf(Bitmap.Config config) {
        ck.p.j(config, "config");
        this.f23088a = config;
    }

    @Override // com.squareup.picasso.Transformation
    public final String key() {
        return "config(" + this.f23088a + ")";
    }

    @Override // com.squareup.picasso.Transformation
    public final Bitmap transform(Bitmap bitmap) {
        ck.p.j(bitmap, "source");
        Bitmap bitmapCopy = bitmap.copy(this.f23088a, false);
        bitmap.recycle();
        ck.p.g(bitmapCopy);
        return bitmapCopy;
    }
}
