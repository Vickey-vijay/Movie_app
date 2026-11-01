package com.mgs.carparking.databinding;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.widgets.cardbanner.view.RoundedImageView;
import ea.a0;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ItemHomeRecommendMultipleListItemMultipleBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final RoundedImageView f40719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Bindable
    public a0 f40720c;

    public ItemHomeRecommendMultipleListItemMultipleBinding(Object obj, View view, int i10, RoundedImageView roundedImageView) {
        super(obj, view, i10);
        this.f40719b = roundedImageView;
    }
}
