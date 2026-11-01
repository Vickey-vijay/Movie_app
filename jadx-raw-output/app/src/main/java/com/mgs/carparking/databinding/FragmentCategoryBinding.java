package com.mgs.carparking.databinding;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.tabs.TabLayout;
import com.mgs.carparking.model.CATEGORYVIEWMODEL;
import com.mgs.carparking.widgets.viewpager.SuperViewPager;

/* JADX INFO: loaded from: classes6.dex */
public abstract class FragmentCategoryBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TabLayout f40084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final View f40085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final SuperViewPager f40086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Bindable
    public CATEGORYVIEWMODEL f40087e;

    public FragmentCategoryBinding(Object obj, View view, int i10, TabLayout tabLayout, View view2, SuperViewPager superViewPager) {
        super(obj, view, i10);
        this.f40084b = tabLayout;
        this.f40085c = view2;
        this.f40086d = superViewPager;
    }
}
