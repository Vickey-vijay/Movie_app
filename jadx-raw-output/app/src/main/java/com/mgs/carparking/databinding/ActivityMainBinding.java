package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.model.MAINVIEWMODEL;
import com.mgs.carparking.widgets.tab.TabLayout;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ActivityMainBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f39884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final FrameLayout f39885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TabLayout f39886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Bindable
    public MAINVIEWMODEL f39887e;

    public ActivityMainBinding(Object obj, View view, int i10, ImageView imageView, FrameLayout frameLayout, TabLayout tabLayout) {
        super(obj, view, i10);
        this.f39884b = imageView;
        this.f39885c = frameLayout;
        this.f39886d = tabLayout;
    }
}
