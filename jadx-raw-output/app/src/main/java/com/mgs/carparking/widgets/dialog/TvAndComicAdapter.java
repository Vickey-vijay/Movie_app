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

/* JADX INFO: loaded from: classes7.dex */
public class TvAndComicAdapter extends RecyclerView.Adapter<b> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f42482i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<VideoBean> f42483j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LayoutInflater f42484k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c f42485l;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f42486b;

        public a(int i10) {
            this.f42486b = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TvAndComicAdapter.this.f42485l != null) {
                TvAndComicAdapter.this.f42485l.a(this.f42486b);
            }
        }
    }

    public class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public RelativeLayout f42488l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public TextView f42489m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public ImageView f42490n;

        public b(View view) {
            super(view);
            this.f42488l = (RelativeLayout) view.findViewById(R.id.rl_click);
            this.f42489m = (TextView) view.findViewById(R.id.tv_name);
            this.f42490n = (ImageView) view.findViewById(R.id.iv_is_play);
        }
    }

    public interface c {
        void a(int i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i10) {
        if (this.f42483j.get(i10).isCheck()) {
            bVar.f42489m.setBackground(this.f42482i.getResources().getDrawable(R.drawable.bg_home_search_tv_set_num_selector));
            bVar.f42489m.setTextColor(this.f42482i.getResources().getColor(R.color.color_commen));
            bVar.f42490n.setVisibility(0);
            Glide.with(this.f42482i).load(Integer.valueOf(R.drawable.ic_video_is_play)).into(bVar.f42490n);
        } else {
            bVar.f42489m.setBackground(this.f42482i.getResources().getDrawable(R.drawable.bg_home_search_tv_set_num));
            if (o.b(this.f42483j.get(i10).getVod_url())) {
                bVar.f42489m.setTextColor(this.f42482i.getResources().getColor(R.color.color_999999));
            } else {
                bVar.f42489m.setTextColor(this.f42482i.getResources().getColor(R.color.color_999999));
            }
            bVar.f42490n.setVisibility(8);
        }
        bVar.f42489m.setText(this.f42483j.get(i10).getTitle());
        bVar.f42488l.setOnClickListener(new a(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new b(this.f42484k.inflate(R.layout.item_pop_tv_set_num, viewGroup, false));
    }

    public void f(c cVar) {
        this.f42485l = cVar;
    }

    public void g(List<VideoBean> list, int i10) {
        this.f42483j = list;
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
        return this.f42483j.size();
    }

    public TvAndComicAdapter(Context context, List<VideoBean> list) {
        this.f42482i = context;
        this.f42483j = list;
        this.f42484k = LayoutInflater.from(context);
    }
}
