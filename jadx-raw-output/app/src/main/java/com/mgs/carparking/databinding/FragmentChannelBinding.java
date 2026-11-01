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
import com.mgs.carparking.model.CHANNELVIEWMODEL;
import com.mgs.carparking.widgets.WaterDropHeader;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes10.dex */
public abstract class FragmentChannelBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final AppBarLayout f40093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final RecyclerView f40094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final RecyclerView f40095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final CollapsingToolbarLayout f40096e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final WaterDropHeader f40097f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ImageView f40098g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final ImageView f40099h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final LinearLayout f40100i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final SmartRefreshLayout f40101j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40102k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final RecyclerView f40103l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final Toolbar f40104m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final TextView f40105n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final TextView f40106o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NonNull
    public final TextView f40107p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Bindable
    public CHANNELVIEWMODEL f40108q;

    public FragmentChannelBinding(Object obj, View view, int i10, AppBarLayout appBarLayout, RecyclerView recyclerView, RecyclerView recyclerView2, CollapsingToolbarLayout collapsingToolbarLayout, WaterDropHeader waterDropHeader, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, SmartRefreshLayout smartRefreshLayout, RelativeLayout relativeLayout, RecyclerView recyclerView3, Toolbar toolbar, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i10);
        this.f40093b = appBarLayout;
        this.f40094c = recyclerView;
        this.f40095d = recyclerView2;
        this.f40096e = collapsingToolbarLayout;
        this.f40097f = waterDropHeader;
        this.f40098g = imageView;
        this.f40099h = imageView2;
        this.f40100i = linearLayout;
        this.f40101j = smartRefreshLayout;
        this.f40102k = relativeLayout;
        this.f40103l = recyclerView3;
        this.f40104m = toolbar;
        this.f40105n = textView;
        this.f40106o = textView2;
        this.f40107p = textView3;
    }
}
