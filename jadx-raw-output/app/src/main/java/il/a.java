package il;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import com.yk.e.util.CoreUtils;
import com.yk.e.util.ImageHandler;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements ImageHandler.IImageHandlerCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f54222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f54223b;

    public a(e eVar, Activity activity) {
        this.f54223b = eVar;
        this.f54222a = activity;
    }

    @Override // com.yk.e.util.ImageHandler.IImageHandlerCallback
    public final void onFailed(String str) {
        this.f54223b.a("load img failed, msg = " + str);
    }

    @Override // com.yk.e.util.ImageHandler.IImageHandlerCallback
    public final void onSuccess(Drawable drawable) {
        CoreUtils.addCacheImgAdsID(this.f54222a, this.f54223b.f61589j);
        this.f54223b.A();
    }
}
