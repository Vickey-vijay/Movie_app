package xe;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.yk.e.util.AdLog;
import com.yk.e.util.CoreUtils;
import com.yk.e.util.ImageHandler;

/* JADX INFO: loaded from: classes2.dex */
public final class k0 implements ImageHandler.IImageHandlerCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f74453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f74454b;

    public k0(u uVar, Context context) {
        this.f74454b = uVar;
        this.f74453a = context;
    }

    @Override // com.yk.e.util.ImageHandler.IImageHandlerCallback
    public final void onFailed(String str) {
        AdLog.e("resource load failed, msg = " + str);
        this.f74454b.a("resource load failed, msg = " + str);
    }

    @Override // com.yk.e.util.ImageHandler.IImageHandlerCallback
    public final void onSuccess(Drawable drawable) {
        CoreUtils.addCacheImgAdsID(this.f74453a, this.f74454b.f61589j);
        this.f74454b.A();
    }
}
