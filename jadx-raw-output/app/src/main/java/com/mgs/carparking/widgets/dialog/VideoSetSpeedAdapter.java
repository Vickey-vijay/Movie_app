package com.mgs.carparking.widgets.dialog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.VideoSetSpeedEntry;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class VideoSetSpeedAdapter extends RecyclerView.Adapter<b> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f42559i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c f42560j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LayoutInflater f42561k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List<VideoSetSpeedEntry> f42562l;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f42563b;

        public a(int i10) {
            this.f42563b = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (VideoSetSpeedAdapter.this.f42560j != null) {
                VideoSetSpeedAdapter.this.f42560j.a(this.f42563b);
            }
        }
    }

    public class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public RelativeLayout f42565l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public TextView f42566m;

        public b(View view) {
            super(view);
            this.f42565l = (RelativeLayout) view.findViewById(R.id.rl_click);
            this.f42566m = (TextView) view.findViewById(R.id.tv_name);
        }
    }

    public interface c {
        void a(int i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new b(this.f42561k.inflate(R.layout.item_pop_set_speed, viewGroup, false));
    }

    public void f(c cVar) {
        this.f42560j = cVar;
    }

    public void g(List<VideoSetSpeedEntry> list, int i10) {
        this.f42562l = list;
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (i10 == i11) {
                list.get(i11).setSelector(true);
            } else {
                list.get(i11).setSelector(false);
            }
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f42562l.size();
    }

    public VideoSetSpeedAdapter(Context context, List<VideoSetSpeedEntry> list) {
        this.f42559i = context;
        this.f42562l = list;
        this.f42561k = LayoutInflater.from(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i10) {
        bVar.f42566m.setText(this.f42562l.get(i10).getName());
        if (this.f42562l.get(i10).isSelector()) {
            bVar.f42566m.setTextColor(this.f42559i.getResources().getColor(R.color.color_42BD56));
        } else {
            bVar.f42566m.setTextColor(this.f42559i.getResources().getColor(R.color.white));
        }
        bVar.f42565l.setOnClickListener(new a(i10));
    }
}
