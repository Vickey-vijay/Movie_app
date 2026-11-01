package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import w9.o1;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ItemFeedbackRecordBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f40391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f40392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Bindable
    public o1 f40393d;

    public ItemFeedbackRecordBinding(Object obj, View view, int i10, ImageView imageView, ImageView imageView2) {
        super(obj, view, i10);
        this.f40391b = imageView;
        this.f40392c = imageView2;
    }
}
