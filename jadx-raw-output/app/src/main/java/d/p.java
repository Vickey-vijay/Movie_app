package d;

import android.graphics.Bitmap;
import com.yk.e.util.ImageLoader;

/* JADX INFO: loaded from: classes11.dex */
public final class p extends ImageLoader.ImageLoadCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f51778a;

    public p(q qVar) {
        this.f51778a = qVar;
    }

    @Override // com.yk.e.util.ImageLoader.ImageLoadCallBack
    public final void execute(Bitmap bitmap) {
        if (bitmap != null) {
            this.f51778a.f51784f.setImageBitmap(bitmap);
        }
    }
}
