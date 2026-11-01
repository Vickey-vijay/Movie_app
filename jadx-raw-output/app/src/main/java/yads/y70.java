package yads;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes9.dex */
public final class y70 implements j41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ImageView f84837a;

    @Override // yads.tp2
    public final void a(im3 im3Var) {
    }

    public y70(ImageView imageView) {
        this.f84837a = imageView;
    }

    @Override // yads.j41
    public final void a(i41 i41Var, boolean z10) {
        Bitmap bitmap = i41Var.f78482a;
        if (bitmap != null) {
            this.f84837a.setImageBitmap(bitmap);
        }
    }
}
