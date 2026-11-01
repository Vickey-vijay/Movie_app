package com.luck.picture.lib.adapter;

import a8.d;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.luck.picture.lib.R$layout;
import com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.entity.LocalMedia;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class PictureImageGridAdapter extends RecyclerView.Adapter<BaseRecyclerMediaHolder> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f32044i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList<LocalMedia> f32045j = new ArrayList<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final PictureSelectionConfig f32046k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Context f32047l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b f32048m;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PictureImageGridAdapter.this.f32048m != null) {
                PictureImageGridAdapter.this.f32048m.b();
            }
        }
    }

    public interface b {
        int a(View view, int i10, LocalMedia localMedia);

        void b();

        void c(View view, int i10, LocalMedia localMedia);

        void d(View view, int i10);
    }

    public final int e(int i10) {
        if (i10 == 1) {
            return R$layout.ps_item_grid_camera;
        }
        if (i10 == 3) {
            int iA = a8.b.a(this.f32047l, 4);
            return iA != 0 ? iA : R$layout.ps_item_grid_video;
        }
        if (i10 != 4) {
            int iA2 = a8.b.a(this.f32047l, 3);
            return iA2 != 0 ? iA2 : R$layout.ps_item_grid_image;
        }
        int iA3 = a8.b.a(this.f32047l, 5);
        return iA3 != 0 ? iA3 : R$layout.ps_item_grid_audio;
    }

    public ArrayList<LocalMedia> d() {
        return this.f32045j;
    }

    public boolean f() {
        return this.f32045j.size() == 0;
    }

    public boolean g() {
        return this.f32044i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f32044i ? this.f32045j.size() + 1 : this.f32045j.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i10) {
        boolean z10 = this.f32044i;
        if (z10 && i10 == 0) {
            return 1;
        }
        if (z10) {
            i10--;
        }
        String strS = this.f32045j.get(i10).s();
        if (d.i(strS)) {
            return 3;
        }
        return d.d(strS) ? 4 : 2;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public void k(ArrayList<LocalMedia> arrayList) {
        if (arrayList != null) {
            this.f32045j = arrayList;
            notifyDataSetChanged();
        }
    }

    public void l(boolean z10) {
        this.f32044i = z10;
    }

    public void m(b bVar) {
        this.f32048m = bVar;
    }

    public PictureImageGridAdapter(Context context, PictureSelectionConfig pictureSelectionConfig) {
        this.f32046k = pictureSelectionConfig;
        this.f32047l = context;
    }

    public void h(int i10) {
        notifyItemChanged(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(BaseRecyclerMediaHolder baseRecyclerMediaHolder, int i10) {
        if (getItemViewType(i10) == 1) {
            baseRecyclerMediaHolder.itemView.setOnClickListener(new a());
            return;
        }
        if (this.f32044i) {
            i10--;
        }
        baseRecyclerMediaHolder.e(this.f32045j.get(i10), i10);
        baseRecyclerMediaHolder.l(this.f32048m);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public BaseRecyclerMediaHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i10) {
        return BaseRecyclerMediaHolder.g(viewGroup, i10, e(i10), this.f32046k);
    }
}
