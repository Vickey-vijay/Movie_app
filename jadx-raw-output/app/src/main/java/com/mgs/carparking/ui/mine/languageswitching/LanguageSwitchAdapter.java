package com.mgs.carparking.ui.mine.languageswitching;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.SetLanguageEntry;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class LanguageSwitchAdapter extends RecyclerView.Adapter<b> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f42107i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c f42108j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LayoutInflater f42109k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List<SetLanguageEntry> f42110l;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f42111b;

        public a(int i10) {
            this.f42111b = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (LanguageSwitchAdapter.this.f42108j != null) {
                LanguageSwitchAdapter.this.f42108j.a(this.f42111b);
            }
        }
    }

    public class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public RelativeLayout f42113l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public TextView f42114m;

        public b(View view) {
            super(view);
            this.f42113l = (RelativeLayout) view.findViewById(R.id.rl_click);
            this.f42114m = (TextView) view.findViewById(R.id.tv_name);
        }
    }

    public interface c {
        void a(int i10);
    }

    public void d(c cVar) {
        this.f42108j = cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new b(this.f42109k.inflate(R.layout.item_dialog_language_switch, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f42110l.size();
    }

    public LanguageSwitchAdapter(Context context, List<SetLanguageEntry> list) {
        this.f42107i = context;
        this.f42110l = list;
        this.f42109k = LayoutInflater.from(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i10) {
        bVar.f42114m.setText(this.f42110l.get(i10).getDetailname());
        if (this.f42110l.get(i10).isSelector()) {
            bVar.f42114m.setTextColor(this.f42107i.getResources().getColor(R.color.color_42BD56));
        } else {
            bVar.f42114m.setTextColor(this.f42107i.getResources().getColor(R.color.color_item_text_mormal));
        }
        bVar.f42113l.setOnClickListener(new a(i10));
    }
}
