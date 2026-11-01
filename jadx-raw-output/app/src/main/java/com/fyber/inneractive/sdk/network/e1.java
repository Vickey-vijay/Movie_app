package com.fyber.inneractive.sdk.network;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class e1 extends t0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f16014p;

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int g() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final boolean u() {
        return false;
    }

    public e1(com.fyber.inneractive.sdk.flow.endcard.loaders.companion.d dVar, String str, com.fyber.inneractive.sdk.config.global.r rVar) {
        super(dVar, g0.f16028c.a(), rVar);
        this.f16014p = str;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final o0 a(l lVar, Map map, int i10) {
        o0 o0Var = new o0();
        d1 d1Var = new d1();
        try {
            InputStream inputStream = lVar.f16041c;
            if (inputStream != null) {
                int iA = t0.a(map);
                AtomicInteger atomicInteger = new AtomicInteger(0);
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(new com.fyber.inneractive.sdk.util.v0(inputStream, atomicInteger));
                if (atomicInteger.get() != iA) {
                    bitmapDecodeStream = null;
                }
                if (bitmapDecodeStream != null) {
                    int width = bitmapDecodeStream.getWidth();
                    int height = bitmapDecodeStream.getHeight();
                    int i11 = width * height;
                    int[] iArr = new int[i11];
                    bitmapDecodeStream.getPixels(iArr, 0, width, 0, 0, width, height);
                    int i12 = -1;
                    for (int i13 = 0; i13 < i11; i13++) {
                        int i14 = iArr[i13];
                        if (i13 == 0) {
                            i12 = i14;
                        } else if (i14 != i12) {
                            d1Var.f16007a = bitmapDecodeStream;
                            IAlog.a("SimpleImageLoader: Got a valid bitmap %s", this.f16014p);
                        }
                    }
                    IAlog.a("SimpleImageLoader: Got an invalid bitmap", new Object[0]);
                    d1Var.f16008b = "Got an invalid bitmap";
                } else {
                    IAlog.a("SimpleImageLoader: Got an invalid bitmap", new Object[0]);
                    d1Var.f16008b = "Got an invalid bitmap";
                }
            }
        } catch (Exception e10) {
            IAlog.c("SimpleImageLoader: Exception on load image %s %s", e10.getMessage(), e10.toString());
            d1Var.f16008b = e10.getMessage();
        } catch (OutOfMemoryError e11) {
            IAlog.c("SimpleImageLoader: OutOfMemoryError on load image %s", e11.getMessage());
            Bitmap bitmap = d1Var.f16007a;
            if (bitmap != null) {
                bitmap.recycle();
            }
            d1Var.f16008b = e11.getMessage();
        }
        o0Var.f16063a = d1Var;
        return o0Var;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final m0 m() {
        return m0.GET;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final g1 o() {
        return g1.LOW;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final String r() {
        return this.f16014p;
    }
}
