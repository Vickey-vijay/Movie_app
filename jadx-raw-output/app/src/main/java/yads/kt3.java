package yads;

import android.graphics.Bitmap;
import com.yandex.mobile.ads.nativeads.NativeAdImage;

/* JADX INFO: loaded from: classes11.dex */
public final class kt3 implements NativeAdImage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a10 f79569a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kt3) && ck.p.e(this.f79569a, ((kt3) obj).f79569a);
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdImage
    public final Bitmap getBitmap() {
        return (Bitmap) this.f79569a.f75358a.invoke();
    }

    public final int hashCode() {
        return this.f79569a.hashCode();
    }

    public final String toString() {
        return "YandexNativeAdImageAdapter(image=" + this.f79569a + ")";
    }

    public kt3(a10 a10Var) {
        this.f79569a = a10Var;
    }
}
