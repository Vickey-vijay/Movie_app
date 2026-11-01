package com.mgs.carparking.widgets.dialog;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.VipListItemEntry;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class VipTagVertalAdapter extends RecyclerView.Adapter<b> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List<VipListItemEntry> f42568i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LayoutInflater f42569j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c f42570k;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f42571b;

        public a(int i10) {
            this.f42571b = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (VipTagVertalAdapter.this.f42570k != null) {
                VipTagVertalAdapter.this.f42570k.a(this.f42571b);
            }
        }
    }

    public class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public LinearLayout f42573l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public TextView f42574m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public TextView f42575n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public TextView f42576o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public ImageView f42577p;

        public b(View view) {
            super(view);
            this.f42573l = (LinearLayout) view.findViewById(R.id.ll_click);
            this.f42574m = (TextView) view.findViewById(R.id.tv_title);
            this.f42577p = (ImageView) view.findViewById(R.id.iv_select);
            this.f42575n = (TextView) view.findViewById(R.id.tv_price_normal);
            this.f42576o = (TextView) view.findViewById(R.id.tv_price);
        }
    }

    public interface c {
        void a(int i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i10) {
        if (this.f42568i.get(i10).isCheck()) {
            bVar.f42577p.setImageResource(R.drawable.ic_vip_selected);
            bVar.f42573l.setBackgroundResource(R.drawable.bg_vip_item_selected);
        } else {
            bVar.f42577p.setImageResource(R.drawable.ic_vip_normal);
            bVar.f42573l.setBackgroundResource(R.drawable.bg_vip_item_normal);
        }
        bVar.f42574m.setText(this.f42568i.get(i10).getTitle());
        bVar.f42575n.setText(this.f42568i.get(i10).getPrice_original());
        bVar.f42575n.getPaint().setFlags(16);
        bVar.f42576o.setText(this.f42568i.get(i10).getPrice());
        bVar.f42573l.setOnClickListener(new a(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new b(this.f42569j.inflate(R.layout.item_vip_vertal_tag, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f42568i.size();
    }
}
