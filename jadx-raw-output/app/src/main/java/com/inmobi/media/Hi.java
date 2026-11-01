package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.inmobi.media.core.config.models.AdConfig;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes7.dex */
public final class Hi extends AbstractC3195t2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f22820b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Hi(View view, AdConfig.AdQualityConfig adQualityConfig) {
        super(adQualityConfig);
        ck.p.j(view, "adView");
        ck.p.j(adQualityConfig, "adQualityConfig");
        this.f22820b = new WeakReference(view);
    }

    @Override // com.inmobi.media.M0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Bitmap a() {
        System.currentTimeMillis();
        View view = (View) this.f22820b.get();
        if (view != null) {
            ck.p.j(view, "adView");
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            ck.p.i(bitmapCreateBitmap, "createBitmap(...)");
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Drawable background = view.getBackground();
            if (background != null) {
                background.draw(canvas);
            } else {
                canvas.drawColor(-1);
            }
            view.draw(canvas);
            if (bitmapCreateBitmap == null) {
                return null;
            }
            System.currentTimeMillis();
            return a(bitmapCreateBitmap);
        }
        System.currentTimeMillis();
        return null;
    }
}
