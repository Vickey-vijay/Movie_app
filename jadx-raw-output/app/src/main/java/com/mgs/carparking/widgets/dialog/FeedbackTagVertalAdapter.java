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

/* JADX INFO: loaded from: classes8.dex */
public class FeedbackTagVertalAdapter extends RecyclerView.Adapter<b> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f42446i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<VodFeedbackEntry> f42447j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LayoutInflater f42448k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c f42449l;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f42450b;

        public a(int i10) {
            this.f42450b = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (FeedbackTagVertalAdapter.this.f42449l != null) {
                FeedbackTagVertalAdapter.this.f42449l.a(this.f42450b);
            }
        }
    }

    public class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public LinearLayout f42452l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public TextView f42453m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public ImageView f42454n;

        public b(View view) {
            super(view);
            this.f42452l = (LinearLayout) view.findViewById(R.id.ll_click);
            this.f42453m = (TextView) view.findViewById(R.id.tv_title);
            this.f42454n = (ImageView) view.findViewById(R.id.iv_select);
        }
    }

    public interface c {
        void a(int i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i10) {
        if (this.f42447j.get(i10).isCheck()) {
            bVar.f42454n.setImageResource(R.drawable.ic_mine_history_selector);
        } else {
            bVar.f42454n.setImageResource(R.drawable.ic_mine_history_unselector);
        }
        bVar.f42453m.setText(this.f42447j.get(i10).getTitle());
        bVar.f42452l.setOnClickListener(new a(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new b(this.f42448k.inflate(R.layout.item_video_vertal_feedback_tag, viewGroup, false));
    }

    public void f(c cVar) {
        this.f42449l = cVar;
    }

    public void g(List<VodFeedbackEntry> list, int i10) {
        this.f42447j = list;
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
        return this.f42447j.size();
    }

    public FeedbackTagVertalAdapter(Context context, List<VodFeedbackEntry> list) {
        this.f42446i = context;
        this.f42447j = list;
        this.f42448k = LayoutInflater.from(context);
    }
}
