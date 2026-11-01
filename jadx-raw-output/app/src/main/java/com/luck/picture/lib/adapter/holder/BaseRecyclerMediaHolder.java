package com.luck.picture.lib.adapter.holder;

import android.content.Context;
import android.graphics.ColorFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import c8.f;
import com.luck.picture.lib.R$color;
import com.luck.picture.lib.R$id;
import com.luck.picture.lib.adapter.PictureImageGridAdapter;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.style.SelectMainStyle;
import f8.h;
import o8.q;
import o8.s;

/* JADX INFO: loaded from: classes2.dex */
public class BaseRecyclerMediaHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ImageView f32061l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f32062m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f32063n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Context f32064o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public PictureSelectionConfig f32065p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f32066q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f32067r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ColorFilter f32068s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ColorFilter f32069t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ColorFilter f32070u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public PictureImageGridAdapter.b f32071v;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseRecyclerMediaHolder.this.f32063n.performClick();
        }
    }

    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LocalMedia f32073b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f32074c;

        public b(LocalMedia localMedia, int i10) {
            this.f32073b = localMedia;
            this.f32074c = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iA;
            h hVar;
            if (this.f32073b.J() || BaseRecyclerMediaHolder.this.f32071v == null || (iA = BaseRecyclerMediaHolder.this.f32071v.a(BaseRecyclerMediaHolder.this.f32062m, this.f32074c, this.f32073b)) == -1) {
                return;
            }
            if (iA == 0) {
                BaseRecyclerMediaHolder baseRecyclerMediaHolder = BaseRecyclerMediaHolder.this;
                if (baseRecyclerMediaHolder.f32065p.B0) {
                    h hVar2 = PictureSelectionConfig.f32195n1;
                    if (hVar2 != null) {
                        hVar2.a(baseRecyclerMediaHolder.f32061l, true);
                    } else {
                        o8.b.b(baseRecyclerMediaHolder.f32061l);
                    }
                }
            } else if (iA == 1) {
                BaseRecyclerMediaHolder baseRecyclerMediaHolder2 = BaseRecyclerMediaHolder.this;
                if (baseRecyclerMediaHolder2.f32065p.B0 && (hVar = PictureSelectionConfig.f32195n1) != null) {
                    hVar.a(baseRecyclerMediaHolder2.f32061l, false);
                }
            }
            BaseRecyclerMediaHolder baseRecyclerMediaHolder3 = BaseRecyclerMediaHolder.this;
            baseRecyclerMediaHolder3.k(baseRecyclerMediaHolder3.h(this.f32073b));
        }
    }

    public class c implements View.OnLongClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f32076b;

        public c(int i10) {
            this.f32076b = i10;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (BaseRecyclerMediaHolder.this.f32071v == null) {
                return false;
            }
            BaseRecyclerMediaHolder.this.f32071v.d(view, this.f32076b);
            return false;
        }
    }

    public class d implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LocalMedia f32078b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f32079c;

        public d(LocalMedia localMedia, int i10) {
            this.f32078b = localMedia;
            this.f32079c = i10;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0046  */
        /* JADX WARN: Code duplicated, block: B:21:0x0052  */
        /* JADX WARN: Code duplicated, block: B:26:0x005f  */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PictureSelectionConfig pictureSelectionConfig;
            if (this.f32078b.J() || BaseRecyclerMediaHolder.this.f32071v == null) {
                return;
            }
            boolean z10 = true;
            if ((!a8.d.h(this.f32078b.s()) || !BaseRecyclerMediaHolder.this.f32065p.I) && !BaseRecyclerMediaHolder.this.f32065p.f32204d) {
                if (a8.d.i(this.f32078b.s())) {
                    PictureSelectionConfig pictureSelectionConfig2 = BaseRecyclerMediaHolder.this.f32065p;
                    if (!pictureSelectionConfig2.J && pictureSelectionConfig2.f32218k != 1) {
                        if (a8.d.d(this.f32078b.s())) {
                            pictureSelectionConfig = BaseRecyclerMediaHolder.this.f32065p;
                            if (!pictureSelectionConfig.K && pictureSelectionConfig.f32218k != 1) {
                                z10 = false;
                            }
                        } else {
                            z10 = false;
                        }
                    }
                } else if (a8.d.d(this.f32078b.s())) {
                    pictureSelectionConfig = BaseRecyclerMediaHolder.this.f32065p;
                    if (!pictureSelectionConfig.K) {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                BaseRecyclerMediaHolder.this.f32071v.c(BaseRecyclerMediaHolder.this.f32062m, this.f32079c, this.f32078b);
            } else {
                BaseRecyclerMediaHolder.this.f32063n.performClick();
            }
        }
    }

    public BaseRecyclerMediaHolder(@NonNull View view) {
        super(view);
    }

    public BaseRecyclerMediaHolder(@NonNull View view, PictureSelectionConfig pictureSelectionConfig) {
        int i10;
        super(view);
        this.f32065p = pictureSelectionConfig;
        Context context = view.getContext();
        this.f32064o = context;
        this.f32068s = q.g(context, R$color.ps_color_20);
        this.f32069t = q.g(this.f32064o, R$color.ps_color_80);
        this.f32070u = q.g(this.f32064o, R$color.ps_color_half_white);
        SelectMainStyle selectMainStyleC = PictureSelectionConfig.T0.c();
        this.f32066q = selectMainStyleC.Y();
        this.f32061l = (ImageView) view.findViewById(R$id.ivPicture);
        this.f32062m = (TextView) view.findViewById(R$id.tvCheck);
        this.f32063n = view.findViewById(R$id.btnCheck);
        boolean z10 = true;
        if (pictureSelectionConfig.f32218k == 1 && pictureSelectionConfig.f32204d) {
            this.f32062m.setVisibility(8);
            this.f32063n.setVisibility(8);
        } else {
            this.f32062m.setVisibility(0);
            this.f32063n.setVisibility(0);
        }
        if (pictureSelectionConfig.f32204d || ((i10 = pictureSelectionConfig.f32218k) != 1 && i10 != 2)) {
            z10 = false;
        }
        this.f32067r = z10;
        int iV = selectMainStyleC.v();
        if (q.b(iV)) {
            this.f32062m.setTextSize(iV);
        }
        int iU = selectMainStyleC.u();
        if (q.c(iU)) {
            this.f32062m.setTextColor(iU);
        }
        int I = selectMainStyleC.I();
        if (q.c(I)) {
            this.f32062m.setBackgroundResource(I);
        }
        int[] iArrT = selectMainStyleC.t();
        if (q.a(iArrT)) {
            if (this.f32062m.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                ((RelativeLayout.LayoutParams) this.f32062m.getLayoutParams()).removeRule(21);
                for (int i11 : iArrT) {
                    ((RelativeLayout.LayoutParams) this.f32062m.getLayoutParams()).addRule(i11);
                }
            }
            if (this.f32063n.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                ((RelativeLayout.LayoutParams) this.f32063n.getLayoutParams()).removeRule(21);
                for (int i12 : iArrT) {
                    ((RelativeLayout.LayoutParams) this.f32063n.getLayoutParams()).addRule(i12);
                }
            }
            int iS = selectMainStyleC.s();
            if (q.b(iS)) {
                ViewGroup.LayoutParams layoutParams = this.f32063n.getLayoutParams();
                layoutParams.width = iS;
                layoutParams.height = iS;
            }
        }
    }

    public void i(String str) {
        f fVar = PictureSelectionConfig.K0;
        if (fVar != null) {
            fVar.f(this.f32061l.getContext(), str, this.f32061l);
        }
    }

    public final void j(LocalMedia localMedia) {
        this.f32062m.setText("");
        for (int i10 = 0; i10 < j8.a.l(); i10++) {
            LocalMedia localMedia2 = j8.a.n().get(i10);
            if (TextUtils.equals(localMedia2.w(), localMedia.w()) || localMedia2.r() == localMedia.r()) {
                localMedia.l0(localMedia2.t());
                localMedia2.q0(localMedia.x());
                this.f32062m.setText(s.g(Integer.valueOf(localMedia.t())));
            }
        }
    }

    public final void k(boolean z10) {
        if (this.f32062m.isSelected() != z10) {
            this.f32062m.setSelected(z10);
        }
        if (this.f32065p.f32204d) {
            this.f32061l.setColorFilter(this.f32068s);
        } else {
            this.f32061l.setColorFilter(z10 ? this.f32069t : this.f32068s);
        }
    }

    public void l(PictureImageGridAdapter.b bVar) {
        this.f32071v = bVar;
    }

    public static BaseRecyclerMediaHolder g(ViewGroup viewGroup, int i10, int i11, PictureSelectionConfig pictureSelectionConfig) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(i11, viewGroup, false);
        if (i10 != 1) {
            if (i10 != 3) {
                if (i10 != 4) {
                    return new ImageViewHolder(viewInflate, pictureSelectionConfig);
                }
                return new AudioViewHolder(viewInflate, pictureSelectionConfig);
            }
            return new VideoViewHolder(viewInflate, pictureSelectionConfig);
        }
        return new CameraViewHolder(viewInflate);
    }

    public void e(LocalMedia localMedia, int i10) {
        localMedia.f32272n = getAbsoluteAdapterPosition();
        k(h(localMedia));
        if (this.f32066q) {
            j(localMedia);
        }
        if (this.f32067r && this.f32065p.f32213h0) {
            f(localMedia);
        }
        String strW = localMedia.w();
        if (localMedia.H()) {
            strW = localMedia.m();
        }
        i(strW);
        this.f32062m.setOnClickListener(new a());
        this.f32063n.setOnClickListener(new b(localMedia, i10));
        this.itemView.setOnLongClickListener(new c(i10));
        this.itemView.setOnClickListener(new d(localMedia, i10));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0025  */
    /* JADX WARN: Code duplicated, block: B:39:0x0077  */
    public final void f(LocalMedia localMedia) {
        boolean z10;
        if (j8.a.l() > 0 && !j8.a.n().contains(localMedia)) {
            PictureSelectionConfig pictureSelectionConfig = this.f32065p;
            int i10 = Integer.MAX_VALUE;
            if (pictureSelectionConfig.Q) {
                if (pictureSelectionConfig.f32218k == 1) {
                    z10 = false;
                } else {
                    z10 = false;
                }
            } else if (a8.d.i(j8.a.o())) {
                PictureSelectionConfig pictureSelectionConfig2 = this.f32065p;
                if (pictureSelectionConfig2.f32218k != 1) {
                    int i11 = pictureSelectionConfig2.f32224n;
                    if (i11 > 0) {
                        i10 = i11;
                    } else {
                        i10 = pictureSelectionConfig2.f32220l;
                    }
                }
                if (j8.a.l() == i10 || a8.d.h(localMedia.s())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                PictureSelectionConfig pictureSelectionConfig3 = this.f32065p;
                if (pictureSelectionConfig3.f32218k != 1) {
                    i10 = pictureSelectionConfig3.f32220l;
                }
                if (j8.a.l() == i10 || a8.d.i(localMedia.s())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
        } else {
            z10 = false;
        }
        if (z10) {
            this.f32061l.setColorFilter(this.f32070u);
            localMedia.j0(true);
        } else {
            localMedia.j0(false);
        }
    }

    public final boolean h(LocalMedia localMedia) {
        LocalMedia localMediaH;
        boolean zContains = j8.a.n().contains(localMedia);
        if (zContains && (localMediaH = localMedia.h()) != null && localMediaH.H()) {
            localMedia.b0(localMediaH.m());
            localMedia.a0(!TextUtils.isEmpty(localMediaH.m()));
            localMedia.e0(localMediaH.H());
        }
        return zContains;
    }
}
