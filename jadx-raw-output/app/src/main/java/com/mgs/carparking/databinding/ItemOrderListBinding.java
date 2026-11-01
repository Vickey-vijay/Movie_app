package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import w9.d2;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ItemOrderListBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f40833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f40834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f40835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f40836e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Bindable
    public d2 f40837f;

    public ItemOrderListBinding(Object obj, View view, int i10, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i10);
        this.f40833b = textView;
        this.f40834c = textView2;
        this.f40835d = textView3;
        this.f40836e = textView4;
    }
}
