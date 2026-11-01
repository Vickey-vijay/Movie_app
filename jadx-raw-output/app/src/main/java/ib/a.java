package ib;

import android.content.Context;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.fvvcl.flickverse.R;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* JADX INFO: compiled from: GlideEngine.java */
/* JADX INFO: loaded from: classes2.dex */
public class a implements c8.f {

    /* JADX INFO: renamed from: ib.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: GlideEngine.java */
    public static final class C0485a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f54094a = new a();
    }

    public a() {
    }

    public static a g() {
        return C0485a.f54094a;
    }

    @Override // c8.f
    public void a(Context context, String str, ImageView imageView) {
        if (!o8.a.a(context)) {
            return;
        }
        Glide.with(context).load(str).into(imageView);
    }

    @Override // c8.f
    public void b(Context context) {
        if (!o8.a.a(context)) {
            return;
        }
        Glide.with(context).pauseRequests();
    }

    @Override // c8.f
    public void c(Context context, ImageView imageView, String str, int i10, int i11) {
        if (!o8.a.a(context)) {
            return;
        }
        Glide.with(context).load(str).override(i10, i11).into(imageView);
    }

    @Override // c8.f
    public void d(Context context) {
        if (!o8.a.a(context)) {
            return;
        }
        Glide.with(context).resumeRequests();
    }

    @Override // c8.f
    public void e(Context context, String str, ImageView imageView) {
        if (!o8.a.a(context)) {
            return;
        }
        Glide.with(context).asBitmap().load(str).override(BaseTransientBottomBar.ANIMATION_FADE_DURATION, BaseTransientBottomBar.ANIMATION_FADE_DURATION).sizeMultiplier(0.5f).transform(new CenterCrop(), new RoundedCorners(8)).placeholder(R.drawable.ps_image_placeholder).into(imageView);
    }

    @Override // c8.f
    public void f(Context context, String str, ImageView imageView) {
        if (!o8.a.a(context)) {
            return;
        }
        Glide.with(context).load(str).override(200, 200).centerCrop().placeholder(R.drawable.ps_image_placeholder).into(imageView);
    }
}
