package com.mgs.carparking.databinding;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.widgets.CircularImageView;
import w9.l1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ItemExtensionRecordBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final CircularImageView f40383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Bindable
    public l1 f40384c;

    public ItemExtensionRecordBinding(Object obj, View view, int i10, CircularImageView circularImageView) {
        super(obj, view, i10);
        this.f40383b = circularImageView;
    }
}
