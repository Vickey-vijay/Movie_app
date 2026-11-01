package com.mgs.carparking.databinding;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import ca.g0;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ItemHomeContentMultipleCategoryListBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final RecyclerView f40448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Bindable
    public g0 f40449c;

    public ItemHomeContentMultipleCategoryListBinding(Object obj, View view, int i10, RecyclerView recyclerView) {
        super(obj, view, i10);
        this.f40448b = recyclerView;
    }
}
