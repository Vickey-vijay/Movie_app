package yads;

import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import com.yandex.mobile.ads.nativeads.NativeAdImage;

/* JADX INFO: loaded from: classes4.dex */
public final class et3 implements NativeAdAssets {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y00 f77191a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof et3) && ck.p.e(this.f77191a, ((et3) obj).f77191a);
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final String getBody() {
        return this.f77191a.f84772g;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final String getCallToAction() {
        return this.f77191a.f84773h;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final String getDomain() {
        return this.f77191a.f84774i;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final NativeAdImage getIcon() {
        a10 a10Var = this.f77191a.f84768c;
        if (a10Var != null) {
            return new kt3(a10Var);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final Float getRating() {
        return this.f77191a.f84776k;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final String getTitle() {
        return this.f77191a.f84779n;
    }

    public final int hashCode() {
        return this.f77191a.hashCode();
    }

    public final String toString() {
        return "YandexNativeAdAssetsAdapter(assets=" + this.f77191a + ")";
    }

    public et3(y00 y00Var) {
        this.f77191a = y00Var;
    }
}
