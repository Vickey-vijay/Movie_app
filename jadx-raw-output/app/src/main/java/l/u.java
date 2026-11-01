package l;

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

/* JADX INFO: loaded from: classes9.dex */
public final class u implements ImageHandler.IImageHandlerCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f63350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f63351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0 f63352c;

    public u(e0 e0Var, Activity activity, String str) {
        this.f63352c = e0Var;
        this.f63350a = activity;
        this.f63351b = str;
    }

    @Override // com.yk.e.util.ImageHandler.IImageHandlerCallback
    public final void onFailed(String str) {
        AdLog.e("resource load failed, msg = " + str);
        this.f63352c.a("resource load failed, msg = " + str);
    }

    @Override // com.yk.e.util.ImageHandler.IImageHandlerCallback
    public final void onSuccess(Drawable drawable) {
        CoreUtils.addCacheImgAdsID(this.f63350a, this.f63352c.f61589j);
        try {
            e0 e0Var = this.f63352c;
            String str = this.f63351b;
            e0Var.getClass();
            Bitmap bitmap = !".gif".equals(str.substring(str.lastIndexOf(".")).toLowerCase(Locale.ROOT)) ? ((BitmapDrawable) drawable).getBitmap() : ((GifDrawable) drawable).getFirstFrame();
            if (bitmap == null) {
                this.f63352c.a("img is null");
                return;
            }
            e0.C(this.f63352c, bitmap);
            e0.D(this.f63352c, bitmap, this.f63351b);
            this.f63352c.A();
        } catch (Exception e10) {
            b.d.a(e10, new StringBuilder("MainNative loadAd error, msg = "), e10);
            this.f63352c.a("resource load failed, msg = " + e10.getMessage());
        }
    }
}
