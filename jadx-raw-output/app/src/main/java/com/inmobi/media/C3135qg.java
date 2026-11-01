package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.PixelCopy;
import android.view.Window;
import com.inmobi.media.C3135qg;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: renamed from: com.inmobi.media.qg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3135qg extends AbstractC3195t2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Window f25184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f25185c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3135qg(Window window, AdConfig.AdQualityConfig adQualityConfig) {
        super(adQualityConfig);
        ck.p.j(window, "window");
        ck.p.j(adQualityConfig, "config");
        this.f25184b = window;
        this.f25185c = new AtomicBoolean(false);
    }

    public static final void a(Ref$BooleanRef ref$BooleanRef, C3135qg c3135qg, int i10) {
        if (i10 == 0) {
            ref$BooleanRef.element = true;
        }
        boolean z10 = ref$BooleanRef.element;
        c3135qg.f25185c.set(true);
    }

    @Override // com.inmobi.media.M0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Bitmap a() throws InterruptedException {
        System.currentTimeMillis();
        int width = this.f25184b.getDecorView().getWidth();
        int height = this.f25184b.getDecorView().getHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        ck.p.i(bitmapCreateBitmap, "createBitmap(...)");
        Rect rect = new Rect(0, 0, width, height);
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        int layerType = this.f25184b.getDecorView().getLayerType();
        this.f25184b.getDecorView().setLayerType(0, null);
        PixelCopy.request(this.f25184b, rect, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: b7.ca
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i10) {
                C3135qg.a(ref$BooleanRef, this, i10);
            }
        }, new Handler(Looper.getMainLooper()));
        while (!this.f25185c.get()) {
            Thread.sleep(500L);
        }
        System.currentTimeMillis();
        this.f25184b.getDecorView().setLayerType(layerType, null);
        if (!ref$BooleanRef.element) {
            return null;
        }
        return a(bitmapCreateBitmap);
    }
}
