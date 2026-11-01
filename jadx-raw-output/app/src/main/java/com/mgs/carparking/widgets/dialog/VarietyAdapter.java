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

/* JADX INFO: loaded from: classes7.dex */
public class VarietyAdapter extends RecyclerView.Adapter<b> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f42513i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<VideoBean> f42514j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LayoutInflater f42515k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f42516l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c f42517m;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f42518b;

        public a(int i10) {
            this.f42518b = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (VarietyAdapter.this.f42517m != null) {
                VarietyAdapter.this.f42517m.a(this.f42518b);
            }
        }
    }

    public class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public LinearLayout f42520l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public TextView f42521m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public ImageView f42522n;

        public b(View view) {
            super(view);
            this.f42520l = (LinearLayout) view.findViewById(R.id.ll_click);
            this.f42521m = (TextView) view.findViewById(R.id.tv_name);
            this.f42522n = (ImageView) view.findViewById(R.id.iv_is_play);
        }
    }

    public interface c {
        void a(int i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i10) {
        if (this.f42514j.get(i10).isCheck()) {
            bVar.f42521m.setBackground(this.f42513i.getResources().getDrawable(R.drawable.bg_home_search_tv_set_num_selector));
            bVar.f42521m.setTextColor(this.f42513i.getResources().getColor(R.color.color_commen));
            bVar.f42522n.setVisibility(0);
            Glide.with(this.f42513i).load(Integer.valueOf(R.drawable.ic_video_is_play)).into(bVar.f42522n);
        } else {
            bVar.f42521m.setBackground(this.f42513i.getResources().getDrawable(R.drawable.bg_home_search_tv_set_num));
            bVar.f42521m.setTextColor(this.f42513i.getResources().getColor(R.color.color_999999));
            bVar.f42522n.setVisibility(8);
        }
        bVar.f42521m.setText(this.f42514j.get(i10).getTitle());
        bVar.f42520l.setOnClickListener(new a(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new b(this.f42515k.inflate(R.layout.item_pop_variety, viewGroup, false));
    }

    public void f(c cVar) {
        this.f42517m = cVar;
    }

    public void g(List<VideoBean> list, int i10) {
        this.f42514j = list;
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
        return this.f42514j.size();
    }

    public VarietyAdapter(Context context, List<VideoBean> list, String str) {
        this.f42513i = context;
        this.f42514j = list;
        this.f42516l = str;
        this.f42515k = LayoutInflater.from(context);
    }
}
