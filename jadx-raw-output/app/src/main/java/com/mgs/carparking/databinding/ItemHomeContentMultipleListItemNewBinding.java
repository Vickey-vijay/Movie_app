package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import ca.s0;
import com.mgs.carparking.widgets.cardbanner.view.RoundedImageView;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ItemHomeContentMultipleListItemNewBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f40499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final RoundedImageView f40500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Bindable
    public s0 f40501d;

    public ItemHomeContentMultipleListItemNewBinding(Object obj, View view, int i10, ImageView imageView, RoundedImageView roundedImageView) {
        super(obj, view, i10);
        this.f40499b = imageView;
        this.f40500c = roundedImageView;
    }
}
