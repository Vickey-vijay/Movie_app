package sg.bigo.ads.ad.interstitial.e;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends sg.bigo.ads.common.view.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f68337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f68338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Drawable f68339c;

    public b(float f10, float f11, float f12, float f13, @Nullable Rect rect, float f14, @Nullable boolean[] zArr, @NonNull sg.bigo.ads.ad.interstitial.e.a.b.a aVar) {
        super(f10, f11, f12, f13, rect, aVar.f68325b, aVar.f68326c, f14, zArr);
        int i10 = aVar.f68325b;
        this.f68337a = i10;
        boolean z10 = aVar.f68324a;
        this.f68338b = z10;
        if (z10) {
            this.f68339c = null;
        } else {
            Drawable drawableA = sg.bigo.ads.common.utils.d.a(f10, f11, f12, f13, rect, i10);
            this.f68339c = this.f70229n != null ? new LayerDrawable(new Drawable[]{drawableA, this.f70229n}) : drawableA;
        }
    }

    public b(float f10, float f11, @NonNull sg.bigo.ads.ad.interstitial.e.a.b.a aVar) {
        this(f10, f10, f10, f10, null, f11, null, aVar);
    }

    @Nullable
    public final Drawable a() {
        return this.f68339c;
    }
}
