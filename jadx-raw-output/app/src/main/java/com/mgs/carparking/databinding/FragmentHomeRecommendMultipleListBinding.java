package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.ui.homecontent.recommend.HomeRecommendMultipleListAdapter;
import com.mgs.carparking.ui.homecontent.recommend.HomeRecommendMultipleListViewModel;
import com.mgs.carparking.widgets.FeedRootRecyclerView;
import com.mgs.carparking.widgets.WaterDropHeader;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes11.dex */
public abstract class FragmentHomeRecommendMultipleListBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final WaterDropHeader f40225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f40226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final SmartRefreshLayout f40227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final FeedRootRecyclerView f40228e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f40229f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Bindable
    public HomeRecommendMultipleListViewModel f40230g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Bindable
    public HomeRecommendMultipleListAdapter f40231h;

    public FragmentHomeRecommendMultipleListBinding(Object obj, View view, int i10, WaterDropHeader waterDropHeader, ImageView imageView, SmartRefreshLayout smartRefreshLayout, FeedRootRecyclerView feedRootRecyclerView, TextView textView) {
        super(obj, view, i10);
        this.f40225b = waterDropHeader;
        this.f40226c = imageView;
        this.f40227d = smartRefreshLayout;
        this.f40228e = feedRootRecyclerView;
        this.f40229f = textView;
    }
}
