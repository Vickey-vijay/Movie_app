package com.mgs.carparking.widgets.dialog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.VideoBean;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class VarietyLandAdapter extends RecyclerView.Adapter<b> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f42536i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<VideoBean> f42537j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LayoutInflater f42538k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f42539l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c f42540m;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f42541b;

        public a(int i10) {
            this.f42541b = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (VarietyLandAdapter.this.f42540m != null) {
                VarietyLandAdapter.this.f42540m.a(this.f42541b);
            }
        }
    }

    public class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public LinearLayout f42543l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public TextView f42544m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public ImageView f42545n;

        public b(View view) {
            super(view);
            this.f42543l = (LinearLayout) view.findViewById(R.id.ll_click);
            this.f42544m = (TextView) view.findViewById(R.id.tv_name);
            this.f42545n = (ImageView) view.findViewById(R.id.iv_is_play);
        }
    }

    public interface c {
        void a(int i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i10) {
        if (this.f42537j.get(i10).isCheck()) {
            bVar.f42544m.setBackground(this.f42536i.getResources().getDrawable(R.drawable.bg_home_search_tv_set_num_selector));
            bVar.f42544m.setTextColor(this.f42536i.getResources().getColor(R.color.color_commen));
            bVar.f42545n.setVisibility(0);
            Glide.with(this.f42536i).load(Integer.valueOf(R.drawable.ic_video_is_play)).into(bVar.f42545n);
        } else {
            bVar.f42544m.setBackground(this.f42536i.getResources().getDrawable(R.drawable.bg_tvcomic_land_num_normal));
            bVar.f42544m.setTextColor(this.f42536i.getResources().getColor(R.color.color_text_commen1));
            bVar.f42545n.setVisibility(8);
        }
        bVar.f42544m.setText(this.f42537j.get(i10).getTitle());
        bVar.f42543l.setOnClickListener(new a(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new b(this.f42538k.inflate(R.layout.item_pop_land_variety, viewGroup, false));
    }

    public void f(c cVar) {
        this.f42540m = cVar;
    }

    public void g(List<VideoBean> list, int i10) {
        this.f42537j = list;
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
        return this.f42537j.size();
    }

    public VarietyLandAdapter(Context context, List<VideoBean> list, String str) {
        this.f42536i = context;
        this.f42537j = list;
        this.f42539l = str;
        this.f42538k = LayoutInflater.from(context);
    }
}
