package yads;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes2.dex */
public final class j13 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m13 f78892a = new m13();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bm f78893b = new bm();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bp f78894c = new bp();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l13 f78895d;

    public final void a(ImageView imageView) {
        imageView.removeOnLayoutChangeListener(this.f78895d);
    }

    public final void a(Drawable drawable, ImageView imageView, u41 u41Var) {
        l13 l13Var = new l13(this.f78893b, this.f78894c, this.f78892a, u41Var, drawable);
        this.f78895d = l13Var;
        imageView.addOnLayoutChangeListener(l13Var);
        if (imageView.getLayoutParams().width == -1 || imageView.getLayoutParams().height == -1 || imageView.getLayoutParams().width == -2 || imageView.getLayoutParams().height == -2) {
            imageView.setImageDrawable(drawable);
        }
    }
}
