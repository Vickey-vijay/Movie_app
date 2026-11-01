package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import ea.u;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ItemHomeRecommendMultipleHotBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final RecyclerView f40675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f40676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Bindable
    public u f40677d;

    public ItemHomeRecommendMultipleHotBinding(Object obj, View view, int i10, RecyclerView recyclerView, TextView textView) {
        super(obj, view, i10);
        this.f40675b = recyclerView;
        this.f40676c = textView;
    }
}
