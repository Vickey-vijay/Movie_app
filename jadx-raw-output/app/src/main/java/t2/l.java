package t2;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.formats.NativeAd;

/* JADX INFO: compiled from: InMobiNativeMappedImage.java */
/* JADX INFO: loaded from: classes10.dex */
public class l extends NativeAd.Image {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f72184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f72185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f72186c;

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    @NonNull
    public Drawable getDrawable() {
        return this.f72184a;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public double getScale() {
        return this.f72186c;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    @NonNull
    public Uri getUri() {
        return this.f72185b;
    }

    public l(Drawable drawable, Uri uri, double d10) {
        this.f72184a = drawable;
        this.f72185b = uri;
        this.f72186c = d10;
    }
}
