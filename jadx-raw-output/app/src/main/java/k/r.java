package k;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.yk.e.util.CoreUtils;
import com.yk.e.util.ImageHandler;

/* JADX INFO: loaded from: classes7.dex */
public final class r implements ImageHandler.IImageHandlerCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f62026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f62027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f62028c;

    public r(x xVar, Activity activity, String str) {
        this.f62028c = xVar;
        this.f62026a = activity;
        this.f62027b = str;
    }

    @Override // com.yk.e.util.ImageHandler.IImageHandlerCallback
    public final void onFailed(String str) {
        this.f62028c.a("resource load failed, msg = " + str);
    }

    @Override // com.yk.e.util.ImageHandler.IImageHandlerCallback
    public final void onSuccess(Drawable drawable) {
        CoreUtils.addCacheImgAdsID(this.f62026a, this.f62028c.f61589j);
        this.f62028c.H.setVisibility(0);
        this.f62028c.J.setVisibility(8);
        new ImageHandler().loadImg(this.f62026a, this.f62027b, this.f62028c.H, "", null);
        x xVar = this.f62028c;
        xVar.O = true;
        xVar.A();
    }
}
