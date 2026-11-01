package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.mgs.carparking.ui.ranklist.RankContentListViewModel;
import com.mgs.carparking.widgets.WaterDropHeader;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentRankContentListBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final WaterDropHeader f40264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f40265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final SmartRefreshLayout f40266d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final RecyclerView f40267e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f40268f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Bindable
    public RankContentListViewModel f40269g;

    public FragmentRankContentListBinding(Object obj, View view, int i10, WaterDropHeader waterDropHeader, ImageView imageView, SmartRefreshLayout smartRefreshLayout, RecyclerView recyclerView, TextView textView) {
        super(obj, view, i10);
        this.f40264b = waterDropHeader;
        this.f40265c = imageView;
        this.f40266d = smartRefreshLayout;
        this.f40267e = recyclerView;
        this.f40268f = textView;
    }
}
