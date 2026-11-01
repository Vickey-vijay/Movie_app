package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import ca.j0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ItemHomeContentMultipleCategoryBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f40438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final RecyclerView f40439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f40440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f40441e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Bindable
    public j0 f40442f;

    public ItemHomeContentMultipleCategoryBinding(Object obj, View view, int i10, ImageView imageView, RecyclerView recyclerView, TextView textView, TextView textView2) {
        super(obj, view, i10);
        this.f40438b = imageView;
        this.f40439c = recyclerView;
        this.f40440d = textView;
        this.f40441e = textView2;
    }
}
