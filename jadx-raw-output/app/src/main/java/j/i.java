package j;

import android.graphics.drawable.Drawable;
import com.yk.e.util.AdLog;
import com.yk.e.util.ImageHandler;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements ImageHandler.IImageHandlerCallback {
    @Override // com.yk.e.util.ImageHandler.IImageHandlerCallback
    public final void onSuccess(Drawable drawable) {
    }

    @Override // com.yk.e.util.ImageHandler.IImageHandlerCallback
    public final void onFailed(String str) {
        AdLog.e("banner load img failed, msg = " + str);
    }
}
