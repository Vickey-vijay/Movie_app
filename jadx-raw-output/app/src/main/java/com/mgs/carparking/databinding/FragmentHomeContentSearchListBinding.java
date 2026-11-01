package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.mgs.carparking.model.HOMECONTENTSEARCHLISTVIEWMODEL;
import com.mgs.carparking.widgets.WaterDropHeader;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentHomeContentSearchListBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final WaterDropHeader f40205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f40206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final SmartRefreshLayout f40207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final RecyclerView f40208e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f40209f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f40210g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f40211h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Bindable
    public HOMECONTENTSEARCHLISTVIEWMODEL f40212i;

    public FragmentHomeContentSearchListBinding(Object obj, View view, int i10, WaterDropHeader waterDropHeader, ImageView imageView, SmartRefreshLayout smartRefreshLayout, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i10);
        this.f40205b = waterDropHeader;
        this.f40206c = imageView;
        this.f40207d = smartRefreshLayout;
        this.f40208e = recyclerView;
        this.f40209f = textView;
        this.f40210g = textView2;
        this.f40211h = textView3;
    }
}
