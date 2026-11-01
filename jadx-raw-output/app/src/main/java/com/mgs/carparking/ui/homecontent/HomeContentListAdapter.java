package com.mgs.carparking.ui.homecontent;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import me.tatarka.bindingcollectionadapter2.BindingRecyclerViewAdapter;

/* JADX INFO: loaded from: classes6.dex */
public class HomeContentListAdapter extends BindingRecyclerViewAdapter<HomeContentListViewModel> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public View f41769r;

    @Override // me.tatarka.bindingcollectionadapter2.BindingRecyclerViewAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i10) {
        return (this.f41769r != null && i10 == 0) ? 0 : 1;
    }

    @Override // me.tatarka.bindingcollectionadapter2.BindingRecyclerViewAdapter
    public RecyclerView.ViewHolder h(ViewDataBinding viewDataBinding) {
        return super.h(viewDataBinding);
    }

    @Override // me.tatarka.bindingcollectionadapter2.BindingRecyclerViewAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10, List<Object> list) {
        super.onBindViewHolder(viewHolder, i10, list);
        getItemViewType(i10);
    }
}
