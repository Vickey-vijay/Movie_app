package com.mgs.carparking.databinding;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import ca.e0;
import com.mgs.carparking.widgets.cardbanner.view.RoundedImageView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ItemHomeContentListBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final RoundedImageView f40430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Bindable
    public e0 f40431c;

    public ItemHomeContentListBinding(Object obj, View view, int i10, RoundedImageView roundedImageView) {
        super(obj, view, i10);
        this.f40430b = roundedImageView;
    }
}
