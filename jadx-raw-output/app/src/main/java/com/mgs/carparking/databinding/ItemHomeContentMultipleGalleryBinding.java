package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;
import ca.k0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ItemHomeContentMultipleGalleryBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f40455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f40456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ViewPager f40457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Bindable
    public k0 f40458e;

    public ItemHomeContentMultipleGalleryBinding(Object obj, View view, int i10, ImageView imageView, TextView textView, ViewPager viewPager) {
        super(obj, view, i10);
        this.f40455b = imageView;
        this.f40456c = textView;
        this.f40457d = viewPager;
    }
}
