package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.widgets.cardbanner.view.RoundedImageView;
import ea.y;

/* JADX INFO: loaded from: classes9.dex */
public abstract class ItemHomeRecommendMultipleListItemGusslikeHorizationBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final RoundedImageView f40693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Bindable
    public y f40695d;

    public ItemHomeRecommendMultipleListItemGusslikeHorizationBinding(Object obj, View view, int i10, RoundedImageView roundedImageView, RelativeLayout relativeLayout) {
        super(obj, view, i10);
        this.f40693b = roundedImageView;
        this.f40694c = relativeLayout;
    }
}
