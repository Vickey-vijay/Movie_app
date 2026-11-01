package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.mgs.carparking.model.DOWNLOADVIEWMODEL;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ActivityDownloadBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ActionbarBackBinding f39743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f39744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f39745d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TabLayout f39746e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ViewPager f39747f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Bindable
    public DOWNLOADVIEWMODEL f39748g;

    public ActivityDownloadBinding(Object obj, View view, int i10, ActionbarBackBinding actionbarBackBinding, TextView textView, TextView textView2, TabLayout tabLayout, ViewPager viewPager) {
        super(obj, view, i10);
        this.f39743b = actionbarBackBinding;
        this.f39744c = textView;
        this.f39745d = textView2;
        this.f39746e = tabLayout;
        this.f39747f = viewPager;
    }
}
