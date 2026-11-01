package com.luck.picture.lib.adapter.holder;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import c8.g;
import c8.k;
import com.luck.picture.lib.R$id;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.entity.LocalMedia;
import f8.q;
import m8.j;

/* JADX INFO: loaded from: classes2.dex */
public class PreviewVideoHolder extends BasePreviewHolder {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ImageView f32123s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ProgressBar f32124t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public View f32125u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f32126v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final q f32127w;

    public class a implements j {
        public a() {
        }

        @Override // m8.j
        public void a(View view, float f10, float f11) {
            BasePreviewHolder.a aVar = PreviewVideoHolder.this.f32060r;
            if (aVar != null) {
                aVar.onBackPressed();
            }
        }
    }

    public class b implements View.OnLongClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LocalMedia f32129b;

        public b(LocalMedia localMedia) {
            this.f32129b = localMedia;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            BasePreviewHolder.a aVar = PreviewVideoHolder.this.f32060r;
            if (aVar == null) {
                return false;
            }
            aVar.a(this.f32129b);
            return false;
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PreviewVideoHolder previewVideoHolder = PreviewVideoHolder.this;
            if (previewVideoHolder.f32058p.G0) {
                previewVideoHolder.q();
            } else {
                previewVideoHolder.x();
            }
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PreviewVideoHolder previewVideoHolder = PreviewVideoHolder.this;
            if (previewVideoHolder.f32058p.G0) {
                previewVideoHolder.q();
                return;
            }
            BasePreviewHolder.a aVar = previewVideoHolder.f32060r;
            if (aVar != null) {
                aVar.onBackPressed();
            }
        }
    }

    public class e implements q {
        public e() {
        }

        @Override // f8.q
        public void a() {
            PreviewVideoHolder.this.v();
        }

        @Override // f8.q
        public void b() {
            PreviewVideoHolder.this.u();
        }

        @Override // f8.q
        public void onPlayerError() {
            PreviewVideoHolder.this.u();
        }
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    public void c(View view) {
    }

    public final void u() {
        this.f32126v = false;
        this.f32123s.setVisibility(0);
        this.f32124t.setVisibility(8);
        this.f32059q.setVisibility(0);
        this.f32125u.setVisibility(8);
        BasePreviewHolder.a aVar = this.f32060r;
        if (aVar != null) {
            aVar.b(null);
        }
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    public void f(LocalMedia localMedia, int i10, int i11) {
        if (PictureSelectionConfig.K0 != null) {
            String strF = localMedia.f();
            if (i10 == -1 && i11 == -1) {
                PictureSelectionConfig.K0.a(this.itemView.getContext(), strF, this.f32059q);
            } else {
                PictureSelectionConfig.K0.c(this.itemView.getContext(), this.f32059q, strF, i10, i11);
            }
        }
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    public void g() {
        this.f32059q.setOnViewTapListener(new a());
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    public void h(LocalMedia localMedia) {
        this.f32059q.setOnLongClickListener(new b(localMedia));
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    public void i() {
        k kVar = PictureSelectionConfig.S0;
        if (kVar != null) {
            kVar.d(this.f32125u);
            PictureSelectionConfig.S0.a(this.f32127w);
        }
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    public void j() {
        k kVar = PictureSelectionConfig.S0;
        if (kVar != null) {
            kVar.i(this.f32125u);
            PictureSelectionConfig.S0.h(this.f32127w);
        }
        u();
    }

    public final void q() {
        if (!this.f32126v) {
            x();
        } else if (r()) {
            s();
        } else {
            t();
        }
    }

    public boolean r() {
        k kVar = PictureSelectionConfig.S0;
        return kVar != null && kVar.e(this.f32125u);
    }

    public final void s() {
        this.f32123s.setVisibility(0);
        k kVar = PictureSelectionConfig.S0;
        if (kVar != null) {
            kVar.j(this.f32125u);
        }
    }

    public final void t() {
        this.f32123s.setVisibility(8);
        k kVar = PictureSelectionConfig.S0;
        if (kVar != null) {
            kVar.g(this.f32125u);
        }
    }

    public final void v() {
        this.f32124t.setVisibility(8);
        this.f32123s.setVisibility(8);
        this.f32059q.setVisibility(8);
        this.f32125u.setVisibility(0);
    }

    public void w() {
        k kVar = PictureSelectionConfig.S0;
        if (kVar != null) {
            kVar.h(this.f32127w);
            PictureSelectionConfig.S0.b(this.f32125u);
        }
    }

    public void x() {
        if (this.f32125u == null) {
            throw new NullPointerException("VideoPlayer cannot be empty,Please implement " + k.class);
        }
        if (PictureSelectionConfig.S0 != null) {
            this.f32124t.setVisibility(0);
            this.f32123s.setVisibility(8);
            this.f32060r.b(this.f32057o.p());
            this.f32126v = true;
            PictureSelectionConfig.S0.c(this.f32125u, this.f32057o);
        }
    }

    public PreviewVideoHolder(@NonNull View view) {
        int i10;
        super(view);
        this.f32126v = false;
        this.f32127w = new e();
        this.f32123s = (ImageView) view.findViewById(R$id.iv_play_video);
        this.f32124t = (ProgressBar) view.findViewById(R$id.progress);
        PictureSelectionConfig pictureSelectionConfigE = PictureSelectionConfig.e();
        ImageView imageView = this.f32123s;
        if (pictureSelectionConfigE.M) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        imageView.setVisibility(i10);
        if (PictureSelectionConfig.S0 == null) {
            PictureSelectionConfig.S0 = new g();
        }
        View viewF = PictureSelectionConfig.S0.f(view.getContext());
        this.f32125u = viewF;
        if (viewF != null) {
            if (viewF.getLayoutParams() == null) {
                this.f32125u.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.indexOfChild(this.f32125u) != -1) {
                viewGroup.removeView(this.f32125u);
            }
            viewGroup.addView(this.f32125u, 0);
            this.f32125u.setVisibility(8);
            return;
        }
        throw new NullPointerException("onCreateVideoPlayer cannot be empty,Please implement " + k.class);
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    public void b(LocalMedia localMedia, int i10) {
        super.b(localMedia, i10);
        m(localMedia);
        this.f32123s.setOnClickListener(new c());
        this.itemView.setOnClickListener(new d());
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    public void m(LocalMedia localMedia) {
        super.m(localMedia);
        if (!this.f32058p.M && this.f32054l < this.f32055m) {
            ViewGroup.LayoutParams layoutParams = this.f32125u.getLayoutParams();
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.width = this.f32054l;
                layoutParams2.height = this.f32056n;
                layoutParams2.gravity = 17;
                return;
            }
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams;
                layoutParams3.width = this.f32054l;
                layoutParams3.height = this.f32056n;
                layoutParams3.addRule(13);
                return;
            }
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams4.width = this.f32054l;
                layoutParams4.height = this.f32056n;
                layoutParams4.gravity = 17;
                return;
            }
            if (layoutParams instanceof ConstraintLayout.LayoutParams) {
                ConstraintLayout.LayoutParams layoutParams5 = (ConstraintLayout.LayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) layoutParams5).width = this.f32054l;
                ((ViewGroup.MarginLayoutParams) layoutParams5).height = this.f32056n;
                layoutParams5.topToTop = 0;
                layoutParams5.bottomToBottom = 0;
            }
        }
    }
}
