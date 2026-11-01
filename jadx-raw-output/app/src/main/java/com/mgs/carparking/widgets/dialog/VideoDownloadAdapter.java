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
import com.ironsource.Z7;
import com.mgs.carparking.netbean.VideoBean;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class VideoDownloadAdapter extends RecyclerView.Adapter<b> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f42547i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<VideoBean> f42548j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LayoutInflater f42549k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c f42550l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f42551m;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f42552b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f42553c;

        public a(int i10, b bVar) {
            this.f42552b = i10;
            this.f42553c = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (VideoDownloadAdapter.this.f42550l != null) {
                VideoDownloadAdapter.this.f42550l.a(this.f42552b, this.f42553c.f42556m);
            }
        }
    }

    public class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public RelativeLayout f42555l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public TextView f42556m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public ImageView f42557n;

        public b(View view) {
            super(view);
            this.f42555l = (RelativeLayout) view.findViewById(R.id.rl_click);
            this.f42556m = (TextView) view.findViewById(R.id.tv_name);
            this.f42557n = (ImageView) view.findViewById(R.id.iv_download);
        }
    }

    public interface c {
        void a(int i10, TextView textView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i10) {
        if (this.f42548j.get(i10).isDownload()) {
            bVar.f42557n.setVisibility(0);
            if (this.f42548j.get(i10).isCompleteDownload()) {
                bVar.f42557n.setImageResource(R.drawable.ic_video_download_complete);
            } else {
                Glide.with(this.f42547i).load(Integer.valueOf(R.drawable.ic_video_is_download)).into(bVar.f42557n);
            }
        } else {
            bVar.f42557n.setVisibility(8);
        }
        bVar.f42556m.setText(this.f42551m + Z7.f27998r + this.f42548j.get(i10).getTitle());
        bVar.f42555l.setOnClickListener(new a(i10, bVar));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new b(this.f42549k.inflate(R.layout.item_pop_video_download, viewGroup, false));
    }

    public void f(c cVar) {
        this.f42550l = cVar;
    }

    public void g(List<VideoBean> list, int i10) {
        this.f42548j = list;
        list.get(i10).setDownload(false);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f42548j.size();
    }

    public void h(List<VideoBean> list, int i10) {
        this.f42548j = list;
        list.get(i10).setDownload(true);
        notifyDataSetChanged();
    }

    public VideoDownloadAdapter(Context context, List<VideoBean> list, String str) {
        this.f42547i = context;
        this.f42548j = list;
        this.f42551m = str;
        this.f42549k = LayoutInflater.from(context);
    }
}
