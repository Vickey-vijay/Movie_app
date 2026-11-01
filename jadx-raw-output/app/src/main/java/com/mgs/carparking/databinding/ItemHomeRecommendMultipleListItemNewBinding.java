package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.widgets.cardbanner.view.RoundedImageView;
import ea.c0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ItemHomeRecommendMultipleListItemNewBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f40730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final RoundedImageView f40731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Bindable
    public c0 f40732d;

    public ItemHomeRecommendMultipleListItemNewBinding(Object obj, View view, int i10, ImageView imageView, RoundedImageView roundedImageView) {
        super(obj, view, i10);
        this.f40730b = imageView;
        this.f40731c = roundedImageView;
    }
}
