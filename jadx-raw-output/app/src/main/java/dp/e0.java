package dp;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.yk.e.util.AdLog;
import com.yk.e.util.CoreUtils;
import com.yk.e.util.ImageHandler;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public final class e0 implements ImageHandler.IImageHandlerCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f52247a;

    public e0(n nVar) {
        this.f52247a = nVar;
    }

    @Override // com.yk.e.util.ImageHandler.IImageHandlerCallback
    public final void onFailed(String str) {
        AdLog.e("resource load failed, msg = " + str);
        this.f52247a.a("resource load failed, msg = " + str);
    }

    @Override // com.yk.e.util.ImageHandler.IImageHandlerCallback
    public final void onSuccess(Drawable drawable) {
        CoreUtils.addCacheImgAdsID(this.f52247a.G.getApplicationContext(), this.f52247a.f61589j);
        try {
            String str = this.f52247a.f61589j.imgUrl;
            Bitmap bitmap = !".gif".equals(str.substring(str.lastIndexOf(".")).toLowerCase(Locale.ROOT)) ? ((BitmapDrawable) drawable).getBitmap() : ((GifDrawable) drawable).getFirstFrame();
            if (bitmap == null) {
                this.f52247a.a("img is null");
                return;
            }
            n nVar = this.f52247a;
            nVar.getClass();
            nVar.D(bitmap.getWidth(), bitmap.getHeight());
            n nVar2 = this.f52247a;
            n.E(nVar2, bitmap, nVar2.f61589j.imgUrl);
            this.f52247a.A();
        } catch (Exception e10) {
            b.d.a(e10, new StringBuilder("Mainbanner loadAd error, msg = "), e10);
            this.f52247a.a("resource load failed, msg = " + e10.getMessage());
        }
    }
}
