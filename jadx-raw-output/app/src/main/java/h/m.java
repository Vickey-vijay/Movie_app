package h;

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

/* JADX INFO: loaded from: classes10.dex */
public final class m implements ImageHandler.IImageHandlerCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f53656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f53657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f53658c;

    public m(i iVar, Activity activity, String str) {
        this.f53658c = iVar;
        this.f53656a = activity;
        this.f53657b = str;
    }

    @Override // com.yk.e.util.ImageHandler.IImageHandlerCallback
    public final void onFailed(String str) {
        AdLog.e("resource load failed, msg = " + str);
        this.f53658c.a("resource load failed, msg = " + str);
    }

    @Override // com.yk.e.util.ImageHandler.IImageHandlerCallback
    public final void onSuccess(Drawable drawable) {
        CoreUtils.addCacheImgAdsID(this.f53656a, this.f53658c.f61589j);
        try {
            i iVar = this.f53658c;
            String str = this.f53657b;
            iVar.getClass();
            Bitmap bitmap = !".gif".equals(str.substring(str.lastIndexOf(".")).toLowerCase(Locale.ROOT)) ? ((BitmapDrawable) drawable).getBitmap() : ((GifDrawable) drawable).getFirstFrame();
            if (bitmap == null) {
                this.f53658c.a("img is null");
                return;
            }
            i.E(this.f53658c, bitmap);
            i.F(this.f53658c, bitmap, this.f53657b);
            this.f53658c.A();
        } catch (Exception e10) {
            b.d.a(e10, new StringBuilder("Mainbanner loadAd error, msg = "), e10);
            this.f53658c.a("resource load failed, msg = " + e10.getMessage());
        }
    }
}
