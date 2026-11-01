package yads;

import android.graphics.Bitmap;
import android.net.Uri;
import com.yandex.div.core.images.BitmapSource;
import com.yandex.div.core.images.CachedBitmap;
import com.yandex.div.core.images.DivImageDownloadCallback;

/* JADX INFO: loaded from: classes2.dex */
public final class mh0 implements j41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DivImageDownloadCallback f80173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f80174b;

    @Override // yads.tp2
    public final void a(im3 im3Var) {
        this.f80173a.onError();
    }

    public mh0(String str, DivImageDownloadCallback divImageDownloadCallback) {
        this.f80173a = divImageDownloadCallback;
        this.f80174b = str;
    }

    @Override // yads.j41
    public final void a(i41 i41Var, boolean z10) {
        Bitmap bitmap = i41Var.f78482a;
        if (bitmap != null) {
            this.f80173a.onSuccess(new CachedBitmap(bitmap, Uri.parse(this.f80174b), z10 ? BitmapSource.MEMORY : BitmapSource.NETWORK));
        }
    }
}
