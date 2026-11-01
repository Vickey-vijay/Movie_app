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

/* JADX INFO: loaded from: classes9.dex */
public class TvAndComicDownloadAdapter extends RecyclerView.Adapter<b> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f42492i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<VideoBean> f42493j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LayoutInflater f42494k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c f42495l;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f42496b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f42497c;

        public a(int i10, b bVar) {
            this.f42496b = i10;
            this.f42497c = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TvAndComicDownloadAdapter.this.f42495l != null) {
                TvAndComicDownloadAdapter.this.f42495l.a(this.f42496b, this.f42497c.f42501n);
            }
        }
    }

    public class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public RelativeLayout f42499l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public ImageView f42500m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public TextView f42501n;

        public b(View view) {
            super(view);
            this.f42499l = (RelativeLayout) view.findViewById(R.id.rl_click);
            this.f42501n = (TextView) view.findViewById(R.id.tv_name);
            this.f42500m = (ImageView) view.findViewById(R.id.iv_download);
        }
    }

    public interface c {
        void a(int i10, TextView textView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i10) {
        if (this.f42493j.get(i10).isCheck()) {
            bVar.f42501n.setBackground(this.f42492i.getResources().getDrawable(R.drawable.bg_home_search_tv_set_num_selector));
            bVar.f42501n.setTextColor(this.f42492i.getResources().getColor(R.color.color_commen));
        } else {
            if (o.b(this.f42493j.get(i10).getVod_url())) {
                bVar.f42501n.setTextColor(this.f42492i.getResources().getColor(R.color.black));
            } else {
                bVar.f42501n.setTextColor(this.f42492i.getResources().getColor(R.color.color_999999));
            }
            bVar.f42501n.setBackground(this.f42492i.getResources().getDrawable(R.drawable.bg_home_search_tv_set_num));
        }
        if (this.f42493j.get(i10).isDownload()) {
            bVar.f42500m.setVisibility(0);
            if (this.f42493j.get(i10).isCompleteDownload()) {
                bVar.f42500m.setImageResource(R.drawable.ic_video_download_complete);
            } else {
                Glide.with(this.f42492i).load(Integer.valueOf(R.drawable.ic_video_is_download)).into(bVar.f42500m);
            }
        } else {
            bVar.f42500m.setVisibility(8);
        }
        bVar.f42501n.setText(this.f42493j.get(i10).getTitle());
        bVar.f42499l.setOnClickListener(new a(i10, bVar));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new b(this.f42494k.inflate(R.layout.item_pop_tv_set_num_download, viewGroup, false));
    }

    public void f(c cVar) {
        this.f42495l = cVar;
    }

    public void g(List<VideoBean> list, int i10) {
        this.f42493j = list;
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
        return this.f42493j.size();
    }

    public void h(List<VideoBean> list, int i10) {
        this.f42493j = list;
        list.get(i10).setDownload(false);
        notifyDataSetChanged();
    }

    public void i(List<VideoBean> list, int i10) {
        this.f42493j = list;
        list.get(i10).setDownload(true);
        notifyDataSetChanged();
    }

    public TvAndComicDownloadAdapter(Context context, List<VideoBean> list) {
        this.f42492i = context;
        this.f42493j = list;
        this.f42494k = LayoutInflater.from(context);
    }
}
