package com.mgs.carparking.widgets.dialog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.VodFeedbackEntry;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class FeedbackTagAdapter extends RecyclerView.Adapter<b> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f42436i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<VodFeedbackEntry> f42437j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LayoutInflater f42438k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c f42439l;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f42440b;

        public a(int i10) {
            this.f42440b = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (FeedbackTagAdapter.this.f42439l != null) {
                FeedbackTagAdapter.this.f42439l.a(this.f42440b);
            }
        }
    }

    public class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public LinearLayout f42442l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public TextView f42443m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public ImageView f42444n;

        public b(View view) {
            super(view);
            this.f42442l = (LinearLayout) view.findViewById(R.id.ll_click);
            this.f42443m = (TextView) view.findViewById(R.id.tv_title);
            this.f42444n = (ImageView) view.findViewById(R.id.iv_select);
        }
    }

    public interface c {
        void a(int i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i10) {
        if (this.f42437j.get(i10).isCheck()) {
            bVar.f42444n.setImageResource(R.drawable.ic_mine_history_selector);
        } else {
            bVar.f42444n.setImageResource(R.drawable.ic_mine_history_unselector);
        }
        bVar.f42443m.setText(this.f42437j.get(i10).getTitle());
        bVar.f42442l.setOnClickListener(new a(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new b(this.f42438k.inflate(R.layout.item_video_land_feedback_tag, viewGroup, false));
    }

    public void f(c cVar) {
        this.f42439l = cVar;
    }

    public void g(List<VodFeedbackEntry> list, int i10) {
        this.f42437j = list;
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
        return this.f42437j.size();
    }

    public FeedbackTagAdapter(Context context, List<VodFeedbackEntry> list) {
        this.f42436i = context;
        this.f42437j = list;
        this.f42438k = LayoutInflater.from(context);
    }
}
