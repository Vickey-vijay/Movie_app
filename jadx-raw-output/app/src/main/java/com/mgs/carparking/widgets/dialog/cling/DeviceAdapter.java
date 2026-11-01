package com.mgs.carparking.widgets.dialog.cling;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ck.p;
import com.fvvcl.flickverse.R;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C3426d4;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.ArrayList;
import java.util.List;
import w.e;

/* JADX INFO: compiled from: DeviceAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DeviceAdapter extends RecyclerView.Adapter<DeviceHolder> implements e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a f42618i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LayoutInflater f42619j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List<un.a<?, ?, ?>> f42620k;

    /* JADX INFO: compiled from: DeviceAdapter.kt */
    public final class DeviceHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final a f42621l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final TextView f42622m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ DeviceAdapter f42623n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeviceHolder(DeviceAdapter deviceAdapter, View view, a aVar) {
            super(view);
            p.j(view, "itemView");
            p.j(aVar, "itemSelectedListener");
            this.f42623n = deviceAdapter;
            this.f42621l = aVar;
            View viewFindViewById = view.findViewById(R.id.device_name);
            p.i(viewFindViewById, "findViewById(...)");
            this.f42622m = (TextView) viewFindViewById;
            view.setOnClickListener(this);
        }

        public final void b(un.a<?, ?, ?> aVar) {
            this.itemView.setTag(aVar);
            if (aVar != null) {
                this.f42622m.setText(aVar.m().d());
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            un.a<?, ?, ?> aVar;
            p.j(view, "v");
            Object tag = view.getTag();
            if (tag instanceof un.a) {
                aVar = (un.a) tag;
            } else {
                aVar = null;
            }
            if (aVar != null) {
                this.f42621l.a(aVar);
            }
        }
    }

    /* JADX INFO: compiled from: DeviceAdapter.kt */
    public interface a {
        void a(un.a<?, ?, ?> aVar);

        void b();
    }

    public DeviceAdapter(Context context, a aVar) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f42618i = aVar;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        p.i(layoutInflaterFrom, "from(...)");
        this.f42619j = layoutInflaterFrom;
        this.f42620k = new ArrayList();
    }

    @Override // w.e
    public void a(un.a<?, ?, ?> aVar) {
        p.j(aVar, C3426d4.i.G);
        Log.e("onDeviceAdded", aVar.m().d());
        if (this.f42620k.contains(aVar)) {
            return;
        }
        this.f42618i.b();
        this.f42620k.add(aVar);
        notifyDataSetChanged();
    }

    @Override // w.e
    public void b(un.a<?, ?, ?> aVar) {
        p.j(aVar, C3426d4.i.G);
        if (this.f42620k.contains(aVar)) {
            this.f42620k.remove(aVar);
            notifyDataSetChanged();
        }
    }

    public final un.a<?, ?, ?> c(int i10) {
        if (i10 < 0 || i10 >= getItemCount()) {
            return null;
        }
        return this.f42620k.get(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(DeviceHolder deviceHolder, int i10) {
        p.j(deviceHolder, "holder");
        deviceHolder.b(c(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public DeviceHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        p.j(viewGroup, "parent");
        View viewInflate = this.f42619j.inflate(R.layout.item_device, viewGroup, false);
        p.i(viewInflate, "inflate(...)");
        return new DeviceHolder(this, viewInflate, this.f42618i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f42620k.size();
    }
}
