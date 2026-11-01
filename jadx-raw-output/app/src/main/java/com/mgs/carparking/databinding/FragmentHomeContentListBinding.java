package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.mgs.carparking.ui.homecontent.HomeContentListViewModel;
import com.mgs.carparking.util.DotView;
import com.mgs.carparking.widgets.WaterDropHeader;
import com.mgs.carparking.widgets.cardbanner.CardBanner;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes10.dex */
public abstract class FragmentHomeContentListBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final DotView f40176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final WaterDropHeader f40177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final CardBanner f40178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f40179e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final SmartRefreshLayout f40180f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final RecyclerView f40181g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f40182h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Bindable
    public HomeContentListViewModel f40183i;

    public FragmentHomeContentListBinding(Object obj, View view, int i10, DotView dotView, WaterDropHeader waterDropHeader, CardBanner cardBanner, ImageView imageView, SmartRefreshLayout smartRefreshLayout, RecyclerView recyclerView, TextView textView) {
        super(obj, view, i10);
        this.f40176b = dotView;
        this.f40177c = waterDropHeader;
        this.f40178d = cardBanner;
        this.f40179e = imageView;
        this.f40180f = smartRefreshLayout;
        this.f40181g = recyclerView;
        this.f40182h = textView;
    }
}
