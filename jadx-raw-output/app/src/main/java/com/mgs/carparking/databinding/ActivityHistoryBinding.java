package com.mgs.carparking.databinding;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.mgs.carparking.model.HISTORYVIEWMODEL;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ActivityHistoryBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ActionbarBackBinding f39855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final RecyclerView f39856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Bindable
    public HISTORYVIEWMODEL f39857d;

    public ActivityHistoryBinding(Object obj, View view, int i10, ActionbarBackBinding actionbarBackBinding, RecyclerView recyclerView) {
        super(obj, view, i10);
        this.f39855b = actionbarBackBinding;
        this.f39856c = recyclerView;
    }
}
