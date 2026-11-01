package com.mgs.carparking.databinding;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.widgets.cardbanner.view.RoundedImageView;
import ea.w;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ItemHomeRecommendMultipleListItemCategoryBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final RoundedImageView f40682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Bindable
    public w f40683c;

    public ItemHomeRecommendMultipleListItemCategoryBinding(Object obj, View view, int i10, RoundedImageView roundedImageView) {
        super(obj, view, i10);
        this.f40682b = roundedImageView;
    }
}
