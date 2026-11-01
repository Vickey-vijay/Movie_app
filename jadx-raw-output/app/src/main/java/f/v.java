package f;

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

/* JADX INFO: loaded from: classes4.dex */
public final class v implements ImageHandler.IImageHandlerCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f52758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f52759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f52760c;

    public v(g gVar, Activity activity, String str) {
        this.f52760c = gVar;
        this.f52758a = activity;
        this.f52759b = str;
    }

    @Override // com.yk.e.util.ImageHandler.IImageHandlerCallback
    public final void onFailed(String str) {
        AdLog.e("resource load failed, msg = " + str);
        this.f52760c.a("resource load failed, msg = " + str);
    }

    @Override // com.yk.e.util.ImageHandler.IImageHandlerCallback
    public final void onSuccess(Drawable drawable) {
        CoreUtils.addCacheImgAdsID(this.f52758a, this.f52760c.f61589j);
        try {
            g gVar = this.f52760c;
            String str = this.f52759b;
            gVar.getClass();
            Bitmap bitmap = !".gif".equals(str.substring(str.lastIndexOf(".")).toLowerCase(Locale.ROOT)) ? ((BitmapDrawable) drawable).getBitmap() : ((GifDrawable) drawable).getFirstFrame();
            if (bitmap == null) {
                this.f52760c.a("img is null");
                return;
            }
            g.C(this.f52760c, bitmap);
            g.D(this.f52760c, bitmap, this.f52759b);
            this.f52760c.A();
        } catch (Exception e10) {
            b.d.a(e10, new StringBuilder("Mainbanner loadAd error, msg = "), e10);
            this.f52760c.a("resource load failed, msg = " + e10.getMessage());
        }
    }
}
