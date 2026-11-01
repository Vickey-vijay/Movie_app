package com.mgs.carparking.databinding;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.widgets.BannerView;
import ea.m0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ItemHomeRecommendMultipleSlideBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final BannerView f40784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Bindable
    public m0 f40785c;

    public ItemHomeRecommendMultipleSlideBinding(Object obj, View view, int i10, BannerView bannerView) {
        super(obj, view, i10);
        this.f40784b = bannerView;
    }
}
