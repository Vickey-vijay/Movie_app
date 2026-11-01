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
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class VarietyDownnloadAdapter extends RecyclerView.Adapter<b> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f42524i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<VideoBean> f42525j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LayoutInflater f42526k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f42527l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c f42528m;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f42529b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f42530c;

        public a(int i10, b bVar) {
            this.f42529b = i10;
            this.f42530c = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (VarietyDownnloadAdapter.this.f42528m != null) {
                VarietyDownnloadAdapter.this.f42528m.a(this.f42529b, this.f42530c.f42533m);
            }
        }
    }

    public class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public RelativeLayout f42532l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public TextView f42533m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public ImageView f42534n;

        public b(View view) {
            super(view);
            this.f42532l = (RelativeLayout) view.findViewById(R.id.rl_click);
            this.f42533m = (TextView) view.findViewById(R.id.tv_name);
            this.f42534n = (ImageView) view.findViewById(R.id.iv_download);
        }
    }

    public interface c {
        void a(int i10, TextView textView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i10) {
        if (this.f42525j.get(i10).isCheck()) {
            bVar.f42533m.setBackground(this.f42524i.getResources().getDrawable(R.drawable.bg_home_search_tv_set_num_selector));
            bVar.f42533m.setTextColor(this.f42524i.getResources().getColor(R.color.color_commen));
        } else {
            bVar.f42533m.setBackground(this.f42524i.getResources().getDrawable(R.drawable.bg_home_search_tv_set_num));
            bVar.f42533m.setTextColor(this.f42524i.getResources().getColor(R.color.color_999999));
        }
        if (this.f42525j.get(i10).isDownload()) {
            bVar.f42534n.setVisibility(0);
            if (this.f42525j.get(i10).isCompleteDownload()) {
                bVar.f42534n.setImageResource(R.drawable.ic_video_download_complete);
            } else {
                Glide.with(this.f42524i).load(Integer.valueOf(R.drawable.ic_video_is_download)).into(bVar.f42534n);
            }
        } else {
            bVar.f42534n.setVisibility(8);
        }
        bVar.f42533m.setText(this.f42525j.get(i10).getTitle());
        bVar.f42532l.setOnClickListener(new a(i10, bVar));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new b(this.f42526k.inflate(R.layout.item_pop_variety_download, viewGroup, false));
    }

    public void f(c cVar) {
        this.f42528m = cVar;
    }

    public void g(List<VideoBean> list, int i10) {
        this.f42525j = list;
        list.get(i10).setDownload(false);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f42525j.size();
    }

    public void h(List<VideoBean> list, int i10) {
        this.f42525j = list;
        list.get(i10).setDownload(true);
        notifyDataSetChanged();
    }

    public VarietyDownnloadAdapter(Context context, List<VideoBean> list, String str) {
        this.f42524i = context;
        this.f42525j = list;
        this.f42527l = str;
        this.f42526k = LayoutInflater.from(context);
    }
}
