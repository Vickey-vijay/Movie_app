package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import ea.p;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ItemHomeRecommendMultipleCategoryBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f40635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final RecyclerView f40636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f40637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f40638e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Bindable
    public p f40639f;

    public ItemHomeRecommendMultipleCategoryBinding(Object obj, View view, int i10, ImageView imageView, RecyclerView recyclerView, TextView textView, TextView textView2) {
        super(obj, view, i10);
        this.f40635b = imageView;
        this.f40636c = recyclerView;
        this.f40637d = textView;
        this.f40638e = textView2;
    }
}
