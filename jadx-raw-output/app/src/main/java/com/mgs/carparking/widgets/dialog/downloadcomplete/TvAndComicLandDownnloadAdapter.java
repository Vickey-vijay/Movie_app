package com.mgs.carparking.widgets.dialog.downloadcomplete;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.dbtable.VideoDownloadEntity;
import em.o;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class TvAndComicLandDownnloadAdapter extends RecyclerView.Adapter<b> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f42632i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<VideoDownloadEntity> f42633j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LayoutInflater f42634k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c f42635l;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f42636b;

        public a(int i10) {
            this.f42636b = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TvAndComicLandDownnloadAdapter.this.f42635l != null) {
                TvAndComicLandDownnloadAdapter.this.f42635l.a(this.f42636b);
            }
        }
    }

    public class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public RelativeLayout f42638l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public TextView f42639m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public ImageView f42640n;

        public b(View view) {
            super(view);
            this.f42638l = (RelativeLayout) view.findViewById(R.id.rl_click);
            this.f42639m = (TextView) view.findViewById(R.id.tv_name);
            this.f42640n = (ImageView) view.findViewById(R.id.iv_is_play);
        }
    }

    public interface c {
        void a(int i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i10) {
        if (this.f42633j.get(i10).isCheck()) {
            bVar.f42639m.setBackground(this.f42632i.getResources().getDrawable(R.drawable.bg_home_search_tv_set_num_selector));
            bVar.f42639m.setTextColor(this.f42632i.getResources().getColor(R.color.color_commen));
            bVar.f42640n.setVisibility(0);
            Glide.with(this.f42632i).load(Integer.valueOf(R.drawable.ic_video_is_play)).into(bVar.f42640n);
        } else {
            bVar.f42639m.setBackground(this.f42632i.getResources().getDrawable(R.drawable.bg_tvcomic_land_num_normal));
            bVar.f42639m.setTextColor(this.f42632i.getResources().getColor(R.color.color_text_commen1));
            bVar.f42640n.setVisibility(8);
        }
        if (!o.b(this.f42633j.get(i10).getCollection() + "")) {
            bVar.f42639m.setText(this.f42633j.get(i10).getCollection() + "");
        }
        bVar.f42638l.setOnClickListener(new a(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new b(this.f42634k.inflate(R.layout.item_pop_land_tv_set_num, viewGroup, false));
    }

    public void f(c cVar) {
        this.f42635l = cVar;
    }

    public void g(List<VideoDownloadEntity> list, int i10) {
        this.f42633j = list;
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (i10 == i11) {
                list.get(i11).setCheck(true);
            } else {
                list.get(i11).setCheck(false);
            }
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f42633j.size();
    }

    public TvAndComicLandDownnloadAdapter(Context context, List<VideoDownloadEntity> list) {
        this.f42632i = context;
        this.f42633j = list;
        this.f42634k = LayoutInflater.from(context);
    }
}
