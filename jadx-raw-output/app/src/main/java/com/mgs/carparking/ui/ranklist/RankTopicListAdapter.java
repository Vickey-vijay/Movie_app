package com.mgs.carparking.ui.ranklist;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.TopicPidList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class RankTopicListAdapter extends RecyclerView.Adapter<b> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f42182i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c f42183j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LayoutInflater f42184k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List<TopicPidList> f42185l;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f42186b;

        public a(int i10) {
            this.f42186b = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (RankTopicListAdapter.this.f42183j != null) {
                RankTopicListAdapter.this.f42183j.a(RankTopicListAdapter.this.f42185l, this.f42186b);
            }
        }
    }

    public class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public TextView f42188l;

        public b(View view) {
            super(view);
            this.f42188l = (TextView) view.findViewById(R.id.tv_name);
        }
    }

    public interface c {
        void a(List<TopicPidList> list, int i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new b(this.f42184k.inflate(R.layout.item_topic_filter_common, viewGroup, false));
    }

    public void g(c cVar) {
        this.f42183j = cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f42185l.size();
    }

    public void h(List<TopicPidList> list) {
        this.f42185l = list;
        notifyDataSetChanged();
    }

    public RankTopicListAdapter(Context context) {
        this.f42182i = context;
        this.f42184k = LayoutInflater.from(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, @SuppressLint({RecyclerView.TAG}) int i10) {
        bVar.f42188l.setText(this.f42185l.get(i10).getName());
        if (this.f42185l.get(i10).isSelector()) {
            bVar.f42188l.setTextColor(this.f42182i.getResources().getColor(R.color.color_text_light_5));
            bVar.f42188l.setBackgroundResource(R.drawable.bg_channel_filter_type_selector);
        } else {
            bVar.f42188l.setTextColor(this.f42182i.getResources().getColor(R.color.color_999999));
            bVar.f42188l.setBackgroundResource(R.drawable.bg_channel_filter_type_normal);
        }
        bVar.f42188l.setOnClickListener(new a(i10));
    }
}
