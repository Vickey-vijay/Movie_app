package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.tabs.TabLayout;
import com.mgs.carparking.ui.homecontent.HomePageViewModel;
import com.mgs.carparking.util.ScrollTextView;
import com.mgs.carparking.widgets.viewpager.SuperViewPager;

/* JADX INFO: loaded from: classes3.dex */
public abstract class FragmentHomeBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f40155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f40156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f40157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f40158e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40159f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ScrollTextView f40160g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40161h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40162i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TabLayout f40163j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f40164k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f40165l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final SuperViewPager f40166m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Bindable
    public HomePageViewModel f40167n;

    public FragmentHomeBinding(Object obj, View view, int i10, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, RelativeLayout relativeLayout, ScrollTextView scrollTextView, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, TabLayout tabLayout, TextView textView, TextView textView2, SuperViewPager superViewPager) {
        super(obj, view, i10);
        this.f40155b = imageView;
        this.f40156c = imageView2;
        this.f40157d = imageView3;
        this.f40158e = imageView4;
        this.f40159f = relativeLayout;
        this.f40160g = scrollTextView;
        this.f40161h = relativeLayout2;
        this.f40162i = relativeLayout3;
        this.f40163j = tabLayout;
        this.f40164k = textView;
        this.f40165l = textView2;
        this.f40166m = superViewPager;
    }
}
