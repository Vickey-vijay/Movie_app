package yads;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import com.yandex.mobile.ads.R$id;

/* JADX INFO: loaded from: classes10.dex */
public final class ly implements zf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y00 f79991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f79992b;

    @Override // yads.zf0
    public final void c() {
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        ExtendedNativeAdView extendedNativeAdView = (ExtendedNativeAdView) viewGroup;
        y00 y00Var = this.f79991a;
        ny nyVar = new ny(y00Var, this.f79992b, new gy1());
        ImageView imageViewA = nyVar.a(extendedNativeAdView, my.f80453b, y00Var.f84767b);
        ImageView imageViewA2 = nyVar.a(extendedNativeAdView, my.f80454c, y00Var.f84768c);
        if (imageViewA != null) {
            imageViewA.setId(R$id.favicon);
        }
        if (imageViewA2 != null) {
            imageViewA2.setId(R$id.icon);
        }
    }

    public ly(y00 y00Var, int i10) {
        this.f79991a = y00Var;
        this.f79992b = i10;
    }
}
