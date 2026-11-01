package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.model.SPECIALDETAILNEWVIEWMODEL;
import com.mgs.carparking.widgets.WaterDropHeader;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ActivitySpecialDetailNewBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final WaterDropHeader f39973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f39974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final SmartRefreshLayout f39975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f39976e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final Toolbar f39977f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f39978g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f39979h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Bindable
    public SPECIALDETAILNEWVIEWMODEL f39980i;

    public ActivitySpecialDetailNewBinding(Object obj, View view, int i10, WaterDropHeader waterDropHeader, ImageView imageView, SmartRefreshLayout smartRefreshLayout, RelativeLayout relativeLayout, Toolbar toolbar, TextView textView, TextView textView2) {
        super(obj, view, i10);
        this.f39973b = waterDropHeader;
        this.f39974c = imageView;
        this.f39975d = smartRefreshLayout;
        this.f39976e = relativeLayout;
        this.f39977f = toolbar;
        this.f39978g = textView;
        this.f39979h = textView2;
    }
}
