package com.luck.picture.lib.adapter.holder;

import android.graphics.ColorFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import c8.f;
import com.luck.picture.lib.R$color;
import com.luck.picture.lib.R$id;
import com.luck.picture.lib.R$layout;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.style.SelectMainStyle;
import java.util.ArrayList;
import java.util.List;
import o8.q;

/* JADX INFO: loaded from: classes2.dex */
public class PreviewGalleryAdapter extends RecyclerView.Adapter<e> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<LocalMedia> f32107i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f32108j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c f32109k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public d f32110l;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f32111b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ LocalMedia f32112c;

        public a(e eVar, LocalMedia localMedia) {
            this.f32111b = eVar;
            this.f32112c = localMedia;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PreviewGalleryAdapter.this.f32109k != null) {
                PreviewGalleryAdapter.this.f32109k.a(this.f32111b.getAbsoluteAdapterPosition(), this.f32112c, view);
            }
        }
    }

    public class b implements View.OnLongClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f32114b;

        public b(e eVar) {
            this.f32114b = eVar;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (PreviewGalleryAdapter.this.f32110l == null) {
                return true;
            }
            PreviewGalleryAdapter.this.f32110l.a(this.f32114b, this.f32114b.getAbsoluteAdapterPosition(), view);
            return true;
        }
    }

    public interface c {
        void a(int i10, LocalMedia localMedia, View view);
    }

    public interface d {
        void a(RecyclerView.ViewHolder viewHolder, int i10, View view);
    }

    public final int f(LocalMedia localMedia) {
        for (int i10 = 0; i10 < this.f32107i.size(); i10++) {
            LocalMedia localMedia2 = this.f32107i.get(i10);
            if (TextUtils.equals(localMedia2.w(), localMedia.w()) || localMedia2.r() == localMedia.r()) {
                return i10;
            }
        }
        return -1;
    }

    public int h() {
        for (int i10 = 0; i10 < this.f32107i.size(); i10++) {
            if (this.f32107i.get(i10).E()) {
                return i10;
            }
        }
        return -1;
    }

    public static class e extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public ImageView f32116l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public ImageView f32117m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public ImageView f32118n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public View f32119o;

        public e(View view) {
            super(view);
            this.f32116l = (ImageView) view.findViewById(R$id.ivImage);
            this.f32117m = (ImageView) view.findViewById(R$id.ivPlay);
            this.f32118n = (ImageView) view.findViewById(R$id.ivEditor);
            this.f32119o = view.findViewById(R$id.viewBorder);
            SelectMainStyle selectMainStyleC = PictureSelectionConfig.T0.c();
            if (q.c(selectMainStyleC.n())) {
                this.f32118n.setImageResource(selectMainStyleC.n());
            }
            if (q.c(selectMainStyleC.q())) {
                this.f32119o.setBackgroundResource(selectMainStyleC.q());
            }
            int iR = selectMainStyleC.r();
            if (q.b(iR)) {
                view.setLayoutParams(new RelativeLayout.LayoutParams(iR, iR));
            }
        }
    }

    public void clear() {
        this.f32107i.clear();
    }

    public List<LocalMedia> g() {
        return this.f32107i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f32107i.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull e eVar, int i10) {
        LocalMedia localMedia = this.f32107i.get(i10);
        ColorFilter colorFilterG = q.g(eVar.itemView.getContext(), localMedia.I() ? R$color.ps_color_half_white : R$color.ps_color_transparent);
        if (localMedia.E() && localMedia.I()) {
            eVar.f32119o.setVisibility(0);
        } else {
            eVar.f32119o.setVisibility(localMedia.E() ? 0 : 8);
        }
        String strW = localMedia.w();
        if (!localMedia.H() || TextUtils.isEmpty(localMedia.m())) {
            eVar.f32118n.setVisibility(8);
        } else {
            strW = localMedia.m();
            eVar.f32118n.setVisibility(0);
        }
        eVar.f32116l.setColorFilter(colorFilterG);
        f fVar = PictureSelectionConfig.K0;
        if (fVar != null) {
            fVar.f(eVar.itemView.getContext(), strW, eVar.f32116l);
        }
        eVar.f32117m.setVisibility(a8.d.i(localMedia.s()) ? 0 : 8);
        eVar.itemView.setOnClickListener(new a(eVar, localMedia));
        eVar.itemView.setOnLongClickListener(new b(eVar));
    }

    public void m(c cVar) {
        this.f32109k = cVar;
    }

    public void n(d dVar) {
        this.f32110l = dVar;
    }

    public PreviewGalleryAdapter(boolean z10, List<LocalMedia> list) {
        this.f32108j = z10;
        this.f32107i = new ArrayList(list);
        for (int i10 = 0; i10 < this.f32107i.size(); i10++) {
            LocalMedia localMedia = this.f32107i.get(i10);
            localMedia.g0(false);
            localMedia.Q(false);
        }
    }

    public void e(LocalMedia localMedia) {
        int iH = h();
        if (iH != -1) {
            this.f32107i.get(iH).Q(false);
            notifyItemChanged(iH);
        }
        if (this.f32108j && this.f32107i.contains(localMedia)) {
            int iF = f(localMedia);
            LocalMedia localMedia2 = this.f32107i.get(iF);
            localMedia2.g0(false);
            localMedia2.Q(true);
            notifyItemChanged(iF);
            return;
        }
        localMedia.Q(true);
        this.f32107i.add(localMedia);
        notifyItemChanged(this.f32107i.size() - 1);
    }

    public void i(LocalMedia localMedia) {
        int iH = h();
        if (iH != -1) {
            this.f32107i.get(iH).Q(false);
            notifyItemChanged(iH);
        }
        int iF = f(localMedia);
        if (iF != -1) {
            this.f32107i.get(iF).Q(true);
            notifyItemChanged(iF);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public e onCreateViewHolder(@NonNull ViewGroup viewGroup, int i10) {
        int iA = a8.b.a(viewGroup.getContext(), 9);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (iA == 0) {
            iA = R$layout.ps_preview_gallery_item;
        }
        return new e(layoutInflaterFrom.inflate(iA, viewGroup, false));
    }

    public void l(LocalMedia localMedia) {
        int iF = f(localMedia);
        if (iF != -1) {
            if (this.f32108j) {
                this.f32107i.get(iF).g0(true);
                notifyItemChanged(iF);
            } else {
                this.f32107i.remove(iF);
                notifyItemRemoved(iF);
            }
        }
    }
}
