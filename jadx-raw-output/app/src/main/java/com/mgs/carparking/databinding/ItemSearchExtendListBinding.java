package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import w9.f2;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ItemSearchExtendListBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f40885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Bindable
    public f2 f40886c;

    public ItemSearchExtendListBinding(Object obj, View view, int i10, ImageView imageView) {
        super(obj, view, i10);
        this.f40885b = imageView;
    }
}
