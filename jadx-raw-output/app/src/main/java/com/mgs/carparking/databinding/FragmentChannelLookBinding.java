package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.mgs.carparking.model.LOOKCHANNELVIEWMODEL;
import com.mgs.carparking.widgets.WaterDropHeader;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes8.dex */
public abstract class FragmentChannelLookBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final AppBarLayout f40118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final RecyclerView f40119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final RecyclerView f40120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final CollapsingToolbarLayout f40121e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final WaterDropHeader f40122f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ImageView f40123g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final ImageView f40124h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final LinearLayout f40125i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final SmartRefreshLayout f40126j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40127k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final RecyclerView f40128l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final Toolbar f40129m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final TextView f40130n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final TextView f40131o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NonNull
    public final TextView f40132p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Bindable
    public LOOKCHANNELVIEWMODEL f40133q;

    public FragmentChannelLookBinding(Object obj, View view, int i10, AppBarLayout appBarLayout, RecyclerView recyclerView, RecyclerView recyclerView2, CollapsingToolbarLayout collapsingToolbarLayout, WaterDropHeader waterDropHeader, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, SmartRefreshLayout smartRefreshLayout, RelativeLayout relativeLayout, RecyclerView recyclerView3, Toolbar toolbar, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i10);
        this.f40118b = appBarLayout;
        this.f40119c = recyclerView;
        this.f40120d = recyclerView2;
        this.f40121e = collapsingToolbarLayout;
        this.f40122f = waterDropHeader;
        this.f40123g = imageView;
        this.f40124h = imageView2;
        this.f40125i = linearLayout;
        this.f40126j = smartRefreshLayout;
        this.f40127k = relativeLayout;
        this.f40128l = recyclerView3;
        this.f40129m = toolbar;
        this.f40130n = textView;
        this.f40131o = textView2;
        this.f40132p = textView3;
    }
}
