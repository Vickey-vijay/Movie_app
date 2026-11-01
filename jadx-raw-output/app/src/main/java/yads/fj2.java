package yads;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.ProgressBar;

/* JADX INFO: loaded from: classes9.dex */
public final class fj2 implements t31 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ jk.k[] f77412c = {wb.a(fj2.class, "preview", "getPreview()Landroid/widget/ImageView;", 0), wb.a(fj2.class, "progressBar", "getProgressBar()Landroid/widget/ProgressBar;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lm2 f77413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lm2 f77414b;

    @Override // yads.t31
    public final void a(Drawable drawable) {
        if (drawable == null) {
            lm2 lm2Var = this.f77414b;
            jk.k kVar = f77412c[1];
            ProgressBar progressBar = (ProgressBar) lm2Var.f79854a.get();
            if (progressBar != null) {
                progressBar.setVisibility(0);
                return;
            }
            return;
        }
        lm2 lm2Var2 = this.f77413a;
        jk.k[] kVarArr = f77412c;
        jk.k kVar2 = kVarArr[0];
        ImageView imageView = (ImageView) lm2Var2.f79854a.get();
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
            imageView.setVisibility(0);
            return;
        }
        lm2 lm2Var3 = this.f77414b;
        jk.k kVar3 = kVarArr[1];
        ProgressBar progressBar2 = (ProgressBar) lm2Var3.f79854a.get();
        if (progressBar2 != null) {
            progressBar2.setVisibility(0);
        }
    }

    public fj2(ImageView imageView, ProgressBar progressBar) {
        this.f77413a = mm2.a(imageView);
        this.f77414b = mm2.a(progressBar);
    }
}
