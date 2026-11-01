package com.mgs.carparking.databinding;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.widgets.cardbanner.view.RoundedImageView;
import ea.j;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ItemHomeRecommendMultipleListItemHotBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final RoundedImageView f40707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Bindable
    public j f40708c;

    public ItemHomeRecommendMultipleListItemHotBinding(Object obj, View view, int i10, RoundedImageView roundedImageView) {
        super(obj, view, i10);
        this.f40707b = roundedImageView;
    }
}
