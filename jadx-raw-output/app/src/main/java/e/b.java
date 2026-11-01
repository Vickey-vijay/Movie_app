package e;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.yk.e.util.AdLog;
import com.yk.e.util.CoreUtils;
import com.yk.e.util.ImageHandler;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements ImageHandler.IImageHandlerCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f52283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f52284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f52285c;

    public b(a aVar, Activity activity, String str) {
        this.f52285c = aVar;
        this.f52283a = activity;
        this.f52284b = str;
    }

    @Override // com.yk.e.util.ImageHandler.IImageHandlerCallback
    public final void onFailed(String str) {
        AdLog.e("resource load failed, msg = " + str);
        this.f52285c.a("resource load failed, msg = " + str);
    }

    @Override // com.yk.e.util.ImageHandler.IImageHandlerCallback
    public final void onSuccess(Drawable drawable) {
        CoreUtils.addCacheImgAdsID(this.f52283a, this.f52285c.f61589j);
        try {
            a aVar = this.f52285c;
            String str = this.f52284b;
            aVar.getClass();
            Bitmap bitmap = !".gif".equals(str.substring(str.lastIndexOf(".")).toLowerCase(Locale.ROOT)) ? ((BitmapDrawable) drawable).getBitmap() : ((GifDrawable) drawable).getFirstFrame();
            if (bitmap == null) {
                this.f52285c.a("img is null");
                return;
            }
            a.C(this.f52285c, bitmap);
            a aVar2 = this.f52285c;
            a.D(aVar2, aVar2.f61589j, bitmap, this.f52284b);
            this.f52285c.A();
        } catch (Exception e10) {
            b.d.a(e10, new StringBuilder("Mainbanner loadAd error, msg = "), e10);
            this.f52285c.a("resource load failed, msg = " + e10.getMessage());
        }
    }
}
