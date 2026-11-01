package com.luck.picture.lib.adapter;

import a8.d;
import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import c8.f;
import com.luck.picture.lib.R$drawable;
import com.luck.picture.lib.R$id;
import com.luck.picture.lib.R$layout;
import com.luck.picture.lib.R$string;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.entity.LocalMediaFolder;
import com.luck.picture.lib.style.AlbumWindowStyle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class PictureAlbumAdapter extends RecyclerView.Adapter<b> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List<LocalMediaFolder> f32036i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f8.a f32037j;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f32038b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ LocalMediaFolder f32039c;

        public a(int i10, LocalMediaFolder localMediaFolder) {
            this.f32038b = i10;
            this.f32039c = localMediaFolder;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PictureAlbumAdapter.this.f32037j == null) {
                return;
            }
            PictureAlbumAdapter.this.f32037j.a(this.f32038b, this.f32039c);
        }
    }

    public static class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public ImageView f32041l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public TextView f32042m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public TextView f32043n;

        public b(View view) {
            super(view);
            this.f32041l = (ImageView) view.findViewById(R$id.first_image);
            this.f32042m = (TextView) view.findViewById(R$id.tv_folder_name);
            this.f32043n = (TextView) view.findViewById(R$id.tv_select_tag);
            AlbumWindowStyle albumWindowStyleA = PictureSelectionConfig.T0.a();
            int iC = albumWindowStyleA.c();
            if (iC != 0) {
                view.setBackgroundResource(iC);
            }
            int iD = albumWindowStyleA.d();
            if (iD != 0) {
                this.f32043n.setBackgroundResource(iD);
            }
            int iE = albumWindowStyleA.e();
            if (iE != 0) {
                this.f32042m.setTextColor(iE);
            }
            int iF = albumWindowStyleA.f();
            if (iF > 0) {
                this.f32042m.setTextSize(iF);
            }
        }
    }

    public void d(List<LocalMediaFolder> list) {
        this.f32036i = new ArrayList(list);
    }

    public List<LocalMediaFolder> e() {
        List<LocalMediaFolder> list = this.f32036i;
        return list != null ? list : new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i10) {
        LocalMediaFolder localMediaFolder = this.f32036i.get(i10);
        String strH = localMediaFolder.h();
        int i11 = localMediaFolder.i();
        String strF = localMediaFolder.f();
        bVar.f32043n.setVisibility(localMediaFolder.k() ? 0 : 4);
        LocalMediaFolder localMediaFolderJ = j8.a.j();
        bVar.itemView.setSelected(localMediaFolderJ != null && localMediaFolder.c() == localMediaFolderJ.c());
        if (d.d(localMediaFolder.g())) {
            bVar.f32041l.setImageResource(R$drawable.ps_audio_placeholder);
        } else {
            f fVar = PictureSelectionConfig.K0;
            if (fVar != null) {
                fVar.e(bVar.itemView.getContext(), strF, bVar.f32041l);
            }
        }
        bVar.f32042m.setText(bVar.itemView.getContext().getString(R$string.ps_camera_roll_num, strH, Integer.valueOf(i11)));
        bVar.itemView.setOnClickListener(new a(i10, localMediaFolder));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f32036i.size();
    }

    public void h(f8.a aVar) {
        this.f32037j = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(@NonNull ViewGroup viewGroup, int i10) {
        int iA = a8.b.a(viewGroup.getContext(), 6);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (iA == 0) {
            iA = R$layout.ps_album_folder_item;
        }
        return new b(layoutInflaterFrom.inflate(iA, viewGroup, false));
    }
}
