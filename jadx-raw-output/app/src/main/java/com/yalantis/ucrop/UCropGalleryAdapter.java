package com.yalantis.ucrop;

import android.graphics.ColorFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.BlendModeColorFilterCompat;
import androidx.core.graphics.BlendModeCompat;
import androidx.recyclerview.widget.RecyclerView;
import fd.c;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class UCropGalleryAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<String> f45630i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f45631j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b f45632k;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewHolder f45635b;

        public a(ViewHolder viewHolder) {
            this.f45635b = viewHolder;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (UCropGalleryAdapter.this.f45632k != null) {
                UCropGalleryAdapter.this.f45632k.a(this.f45635b.getAbsoluteAdapterPosition(), view);
            }
        }
    }

    public interface b {
        void a(int i10, View view);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public ImageView f45633l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public View f45634m;

        public ViewHolder(View view) {
            super(view);
            this.f45633l = (ImageView) view.findViewById(R$id.iv_photo);
            this.f45634m = view.findViewById(R$id.view_current_select);
        }
    }

    public int d() {
        return this.f45631j;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(ViewHolder viewHolder, int i10) {
        ColorFilter colorFilterCreateBlendModeColorFilterCompat;
        String str = this.f45630i.get(i10);
        c cVar = fd.b.f52944a;
        if (cVar != null) {
            cVar.a(viewHolder.itemView.getContext(), str, viewHolder.f45633l);
        }
        if (this.f45631j == i10) {
            viewHolder.f45634m.setVisibility(0);
            colorFilterCreateBlendModeColorFilterCompat = BlendModeColorFilterCompat.createBlendModeColorFilterCompat(ContextCompat.getColor(viewHolder.itemView.getContext(), R$color.ucrop_color_80), BlendModeCompat.SRC_ATOP);
        } else {
            colorFilterCreateBlendModeColorFilterCompat = BlendModeColorFilterCompat.createBlendModeColorFilterCompat(ContextCompat.getColor(viewHolder.itemView.getContext(), R$color.ucrop_color_20), BlendModeCompat.SRC_ATOP);
            viewHolder.f45634m.setVisibility(8);
        }
        viewHolder.f45633l.setColorFilter(colorFilterCreateBlendModeColorFilterCompat);
        viewHolder.itemView.setOnClickListener(new a(viewHolder));
    }

    public void g(int i10) {
        this.f45631j = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<String> list = this.f45630i;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public void h(b bVar) {
        this.f45632k = bVar;
    }

    public UCropGalleryAdapter(List<String> list) {
        this.f45630i = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.ucrop_gallery_adapter_item, viewGroup, false));
    }
}
