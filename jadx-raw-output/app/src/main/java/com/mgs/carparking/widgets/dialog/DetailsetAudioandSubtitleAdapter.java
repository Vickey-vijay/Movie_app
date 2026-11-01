package com.mgs.carparking.widgets.dialog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.DetailsetAudioandSubtitleEntry;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class DetailsetAudioandSubtitleAdapter extends RecyclerView.Adapter<b> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f42427i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c f42428j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LayoutInflater f42429k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List<DetailsetAudioandSubtitleEntry> f42430l;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f42431b;

        public a(int i10) {
            this.f42431b = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (DetailsetAudioandSubtitleAdapter.this.f42428j != null) {
                DetailsetAudioandSubtitleAdapter.this.f42428j.a(this.f42431b);
            }
        }
    }

    public class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public RelativeLayout f42433l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public TextView f42434m;

        public b(View view) {
            super(view);
            this.f42433l = (RelativeLayout) view.findViewById(R.id.rl_click);
            this.f42434m = (TextView) view.findViewById(R.id.tv_name);
        }
    }

    public interface c {
        void a(int i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new b(this.f42429k.inflate(R.layout.item_pop_set_speed, viewGroup, false));
    }

    public void f(c cVar) {
        this.f42428j = cVar;
    }

    public void g(List<DetailsetAudioandSubtitleEntry> list, int i10) {
        this.f42430l = list;
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
        return this.f42430l.size();
    }

    public DetailsetAudioandSubtitleAdapter(Context context, List<DetailsetAudioandSubtitleEntry> list) {
        this.f42427i = context;
        this.f42430l = list;
        this.f42429k = LayoutInflater.from(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i10) {
        bVar.f42434m.setText(this.f42430l.get(i10).getDetailname());
        if (this.f42430l.get(i10).isSelector()) {
            bVar.f42434m.setTextColor(this.f42427i.getResources().getColor(R.color.color_42BD56));
        } else {
            bVar.f42434m.setTextColor(this.f42427i.getResources().getColor(R.color.white));
        }
        bVar.f42433l.setOnClickListener(new a(i10));
    }
}
