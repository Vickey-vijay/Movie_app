package com.mgs.carparking.ui.mine.languageswitching;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.SetLanguageEntry;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class SetLanguageAdapter extends RecyclerView.Adapter<b> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f42123i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c f42124j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LayoutInflater f42125k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List<SetLanguageEntry> f42126l;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f42127b;

        public a(int i10) {
            this.f42127b = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (SetLanguageAdapter.this.f42124j != null) {
                SetLanguageAdapter.this.f42124j.a(this.f42127b);
            }
        }
    }

    public class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public RelativeLayout f42129l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public TextView f42130m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public ImageView f42131n;

        public b(View view) {
            super(view);
            this.f42129l = (RelativeLayout) view.findViewById(R.id.rl_click);
            this.f42130m = (TextView) view.findViewById(R.id.tv_name);
            this.f42131n = (ImageView) view.findViewById(R.id.iv_select);
        }
    }

    public interface c {
        void a(int i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new b(this.f42125k.inflate(R.layout.item_dialog_set_language, viewGroup, false));
    }

    public void f(c cVar) {
        this.f42124j = cVar;
    }

    public void g(List<SetLanguageEntry> list, int i10) {
        this.f42126l = list;
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
        return this.f42126l.size();
    }

    public SetLanguageAdapter(Context context, List<SetLanguageEntry> list) {
        this.f42123i = context;
        this.f42126l = list;
        this.f42125k = LayoutInflater.from(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i10) {
        bVar.f42130m.setText(this.f42126l.get(i10).getDetailname());
        if (this.f42126l.get(i10).isSelector()) {
            bVar.f42130m.setTextColor(this.f42123i.getResources().getColor(R.color.color_42BD56));
            bVar.f42131n.setImageResource(R.drawable.ic_set_language_selected);
        } else {
            bVar.f42130m.setTextColor(this.f42123i.getResources().getColor(R.color.color_item_text_mormal));
            bVar.f42131n.setImageResource(R.drawable.ic_set_language_selected_normal);
        }
        bVar.f42129l.setOnClickListener(new a(i10));
    }
}
