package com.mgs.carparking.widgets.dialog;

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
import com.mgs.carparking.netbean.VideoBean;
import em.o;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class TvAndComicLandAdapter extends RecyclerView.Adapter<b> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f42503i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<VideoBean> f42504j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LayoutInflater f42505k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c f42506l;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f42507b;

        public a(int i10) {
            this.f42507b = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (o.b(((VideoBean) TvAndComicLandAdapter.this.f42504j.get(this.f42507b)).getVod_url()) || TvAndComicLandAdapter.this.f42506l == null) {
                return;
            }
            TvAndComicLandAdapter.this.f42506l.a(this.f42507b);
        }
    }

    public class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public RelativeLayout f42509l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public TextView f42510m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public ImageView f42511n;

        public b(View view) {
            super(view);
            this.f42509l = (RelativeLayout) view.findViewById(R.id.rl_click);
            this.f42510m = (TextView) view.findViewById(R.id.tv_name);
            this.f42511n = (ImageView) view.findViewById(R.id.iv_is_play);
        }
    }

    public interface c {
        void a(int i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i10) {
        if (this.f42504j.get(i10).isCheck()) {
            bVar.f42510m.setBackground(this.f42503i.getResources().getDrawable(R.drawable.bg_home_search_tv_set_num_selector));
            bVar.f42510m.setTextColor(this.f42503i.getResources().getColor(R.color.color_commen));
            bVar.f42511n.setVisibility(0);
            Glide.with(this.f42503i).load(Integer.valueOf(R.drawable.ic_video_is_play)).into(bVar.f42511n);
        } else {
            bVar.f42510m.setBackground(this.f42503i.getResources().getDrawable(R.drawable.bg_tvcomic_land_num_normal));
            if (o.b(this.f42504j.get(i10).getVod_url())) {
                bVar.f42510m.setTextColor(this.f42503i.getResources().getColor(R.color.color_666666));
            } else {
                bVar.f42510m.setTextColor(this.f42503i.getResources().getColor(R.color.color_text_commen1));
            }
            bVar.f42511n.setVisibility(8);
        }
        bVar.f42510m.setText(this.f42504j.get(i10).getTitle());
        bVar.f42509l.setOnClickListener(new a(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new b(this.f42505k.inflate(R.layout.item_pop_land_tv_set_num, viewGroup, false));
    }

    public void g(c cVar) {
        this.f42506l = cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f42504j.size();
    }

    public void h(List<VideoBean> list, int i10) {
        this.f42504j = list;
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (i10 == i11) {
                list.get(i11).setCheck(true);
            } else {
                list.get(i11).setCheck(false);
            }
        }
        notifyDataSetChanged();
    }

    public TvAndComicLandAdapter(Context context, List<VideoBean> list) {
        this.f42503i = context;
        this.f42504j = list;
        this.f42505k = LayoutInflater.from(context);
    }
}
