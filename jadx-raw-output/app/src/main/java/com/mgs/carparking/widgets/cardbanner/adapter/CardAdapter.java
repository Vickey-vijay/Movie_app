package com.mgs.carparking.widgets.cardbanner.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bb.b;
import cb.a;
import ck.p;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.widgets.cardbanner.view.RoundedImageView;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.List;

/* JADX INFO: compiled from: CardAdapter.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class CardAdapter extends RecyclerView.Adapter<BannerViewHolder> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Context f42348i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f42349j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f42350k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f42351l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List<b> f42352m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f42353n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a f42354o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f42355p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f42356q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public db.a f42357r;

    public CardAdapter(Context context, int i10, int i11, int i12) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        this.f42348i = context;
        this.f42349j = i10;
        this.f42350k = i11;
        this.f42351l = i12;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(BannerViewHolder bannerViewHolder, int i10) {
        int size;
        a aVar;
        p.j(bannerViewHolder, "holder");
        View view = bannerViewHolder.itemView;
        List<b> list = this.f42352m;
        if (list != null) {
            p.g(list);
            size = list.size();
        } else {
            size = this.f42353n;
        }
        view.setTag(R.id.key_position, Integer.valueOf(i10 % size));
        bannerViewHolder.itemView.setTag(R.id.key_item, Integer.valueOf(i10));
        View view2 = bannerViewHolder.itemView;
        int i11 = this.f42351l;
        view2.setPadding(i11, 0, i11, 0);
        bannerViewHolder.itemView.setLayoutParams(new ViewGroup.LayoutParams(this.f42349j - (this.f42350k * 2), -1));
        if (this.f42353n != 0 && (aVar = this.f42354o) != null) {
            p.g(aVar);
            aVar.a(bannerViewHolder, i10 % this.f42353n);
            return;
        }
        ViewHolder viewHolder = (ViewHolder) bannerViewHolder;
        TextView textViewB = viewHolder.b();
        List<b> list2 = this.f42352m;
        p.g(list2);
        List<b> list3 = this.f42352m;
        p.g(list3);
        textViewB.setText(list2.get(i10 % list3.size()).b());
        viewHolder.b().setTextSize(this.f42355p);
        TextView textViewD = viewHolder.d();
        List<b> list4 = this.f42352m;
        p.g(list4);
        List<b> list5 = this.f42352m;
        p.g(list5);
        textViewD.setText(list4.get(i10 % list5.size()).c());
        viewHolder.d().setTextSize(this.f42356q);
        db.a aVar2 = this.f42357r;
        if (aVar2 != null) {
            p.g(aVar2);
            Context context = this.f42348i;
            RoundedImageView roundedImageViewC = viewHolder.c();
            List<b> list6 = this.f42352m;
            p.g(list6);
            List<b> list7 = this.f42352m;
            p.g(list7);
            aVar2.a(context, roundedImageViewC, list6.get(i10 % list7.size()).a());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public BannerViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        a aVar;
        p.j(viewGroup, "parent");
        if (this.f42353n != 0 && (aVar = this.f42354o) != null) {
            p.g(aVar);
            return aVar.b(viewGroup, i10);
        }
        View viewInflate = LayoutInflater.from(this.f42348i).inflate(R.layout.banner_item, viewGroup, false);
        p.i(viewInflate, "inflate(...)");
        return new ViewHolder(viewInflate);
    }

    public final void e(a aVar) {
        this.f42354o = aVar;
    }

    public final void f(db.a aVar) {
        this.f42357r = aVar;
    }

    public final void g(int i10) {
        this.f42353n = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (this.f42353n == 0 && this.f42352m == null) {
            return 0;
        }
        List<b> list = this.f42352m;
        if (list != null) {
            p.g(list);
            if (list.size() == 0) {
                return 0;
            }
        }
        return Integer.MAX_VALUE;
    }

    public final void h(List<b> list) {
        this.f42352m = list;
    }

    public final void i(int i10, int i11) {
        this.f42355p = i10;
        this.f42356q = i11;
    }
}
