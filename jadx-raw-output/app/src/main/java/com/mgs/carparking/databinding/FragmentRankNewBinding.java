package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.mgs.carparking.ui.ranklist.RankNumberNewViewModel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentRankNewBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f40278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final RecyclerView f40279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TabLayout f40280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final View f40281e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f40282f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final View f40283g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final ViewPager f40284h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Bindable
    public RankNumberNewViewModel f40285i;

    public FragmentRankNewBinding(Object obj, View view, int i10, ImageView imageView, RecyclerView recyclerView, TabLayout tabLayout, View view2, TextView textView, View view3, ViewPager viewPager) {
        super(obj, view, i10);
        this.f40278b = imageView;
        this.f40279c = recyclerView;
        this.f40280d = tabLayout;
        this.f40281e = view2;
        this.f40282f = textView;
        this.f40283g = view3;
        this.f40284h = viewPager;
    }
}
