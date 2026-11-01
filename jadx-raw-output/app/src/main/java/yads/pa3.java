package yads;

import android.graphics.Bitmap;
import android.util.LruCache;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes11.dex */
public final class pa3 implements u82 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LruCache f81332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k31 f81333b;

    public final Bitmap a(String str) {
        this.f81333b.getClass();
        return (Bitmap) this.f81332a.get(k31.a(str, ImageView.ScaleType.CENTER_INSIDE));
    }

    public pa3(v82 v82Var, k31 k31Var) {
        this.f81332a = v82Var;
        this.f81333b = k31Var;
    }

    public final void a(String str, Bitmap bitmap) {
        this.f81333b.getClass();
        this.f81332a.put(k31.a(str, ImageView.ScaleType.CENTER_INSIDE), bitmap);
    }
}
