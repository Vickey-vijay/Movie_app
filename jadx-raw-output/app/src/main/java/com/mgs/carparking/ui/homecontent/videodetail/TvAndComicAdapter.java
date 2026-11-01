package com.mgs.carparking.ui.homecontent.videodetail;

import android.content.Context;
import android.widget.ImageView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.fvvcl.flickverse.R;
import java.util.List;
import me.tatarka.bindingcollectionadapter2.BindingRecyclerViewAdapter;

/* JADX INFO: loaded from: classes8.dex */
public class TvAndComicAdapter extends BindingRecyclerViewAdapter {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Context f41906r;

    public TvAndComicAdapter(Context context) {
        this.f41906r = context;
    }

    @Override // me.tatarka.bindingcollectionadapter2.BindingRecyclerViewAdapter
    public void f(ViewDataBinding viewDataBinding, int i10, int i11, int i12, Object obj) {
        super.f(viewDataBinding, i10, i11, i12, obj);
        Glide.with(this.f41906r).load(Integer.valueOf(R.drawable.ic_video_is_play)).into((ImageView) viewDataBinding.getRoot().findViewById(R.id.iv_is_play));
    }

    @Override // me.tatarka.bindingcollectionadapter2.BindingRecyclerViewAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10, List list) {
        super.onBindViewHolder(viewHolder, i10, list);
    }
}
