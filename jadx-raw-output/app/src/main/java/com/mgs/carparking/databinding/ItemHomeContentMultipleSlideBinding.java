package com.mgs.carparking.databinding;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import ca.c1;
import com.mgs.carparking.widgets.BannerView;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ItemHomeContentMultipleSlideBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final BannerView f40533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Bindable
    public c1 f40534c;

    public ItemHomeContentMultipleSlideBinding(Object obj, View view, int i10, BannerView bannerView) {
        super(obj, view, i10);
        this.f40533b = bannerView;
    }
}
