package com.luck.picture.lib.adapter.holder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.luck.picture.lib.R$id;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.photoview.PhotoView;
import o8.c;
import o8.e;
import o8.j;

/* JADX INFO: loaded from: classes8.dex */
public abstract class BasePreviewHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f32054l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f32055m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f32056n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public LocalMedia f32057o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final PictureSelectionConfig f32058p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public PhotoView f32059q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public a f32060r;

    public interface a {
        void a(LocalMedia localMedia);

        void b(String str);

        void onBackPressed();
    }

    public abstract void c(View view);

    public abstract void f(LocalMedia localMedia, int i10, int i11);

    public abstract void g();

    public abstract void h(LocalMedia localMedia);

    public void i() {
    }

    public void j() {
    }

    public void b(LocalMedia localMedia, int i10) {
        this.f32057o = localMedia;
        int[] iArrE = e(localMedia);
        int[] iArrB = c.b(iArrE[0], iArrE[1]);
        f(localMedia, iArrB[0], iArrB[1]);
        m(localMedia);
        k(localMedia);
        g();
        h(localMedia);
    }

    public void l(a aVar) {
        this.f32060r = aVar;
    }

    public void m(LocalMedia localMedia) {
        if (this.f32058p.M || this.f32054l >= this.f32055m || localMedia.D() <= 0 || localMedia.q() <= 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f32059q.getLayoutParams();
        layoutParams.width = this.f32054l;
        layoutParams.height = this.f32056n;
        layoutParams.gravity = 17;
    }

    public BasePreviewHolder(@NonNull View view) {
        super(view);
        this.f32058p = PictureSelectionConfig.e();
        this.f32054l = e.e(view.getContext());
        this.f32055m = e.g(view.getContext());
        this.f32056n = e.d(view.getContext());
        this.f32059q = (PhotoView) view.findViewById(R$id.preview_image);
        c(view);
    }

    public static BasePreviewHolder d(ViewGroup viewGroup, int i10, int i11) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(i11, viewGroup, false);
        if (i10 == 2) {
            return new PreviewVideoHolder(viewInflate);
        }
        if (i10 == 3) {
            return new PreviewAudioHolder(viewInflate);
        }
        return new PreviewImageHolder(viewInflate);
    }

    public int[] e(LocalMedia localMedia) {
        if (localMedia.G() && localMedia.k() > 0 && localMedia.j() > 0) {
            return new int[]{localMedia.k(), localMedia.j()};
        }
        return new int[]{localMedia.D(), localMedia.q()};
    }

    public void k(LocalMedia localMedia) {
        if (j.n(localMedia.D(), localMedia.q())) {
            this.f32059q.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            this.f32059q.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
    }
}
