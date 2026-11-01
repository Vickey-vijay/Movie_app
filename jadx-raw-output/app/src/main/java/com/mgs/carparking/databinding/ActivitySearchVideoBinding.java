package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.mgs.carparking.model.SEARCHCONTENTVIDEOVIEWMODEL;
import com.mgs.carparking.widgets.ClearableEditText;
import com.mgs.carparking.widgets.FlowLayout2;
import com.mgs.carparking.widgets.MaxLayout;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ActivitySearchVideoBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ClearableEditText f39927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final FlowLayout2 f39928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final MaxLayout f39929d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f39930e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TabLayout f39931f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ViewPager f39932g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Bindable
    public SEARCHCONTENTVIDEOVIEWMODEL f39933h;

    public ActivitySearchVideoBinding(Object obj, View view, int i10, ClearableEditText clearableEditText, FlowLayout2 flowLayout2, MaxLayout maxLayout, LinearLayout linearLayout, TabLayout tabLayout, ViewPager viewPager) {
        super(obj, view, i10);
        this.f39927b = clearableEditText;
        this.f39928c = flowLayout2;
        this.f39929d = maxLayout;
        this.f39930e = linearLayout;
        this.f39931f = tabLayout;
        this.f39932g = viewPager;
    }
}
