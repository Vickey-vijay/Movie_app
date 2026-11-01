package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.widgets.cardbanner.view.RoundedImageView;
import w9.x2;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ItemSpecialDetailResultBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final RoundedImageView f40915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f40916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Bindable
    public x2 f40917d;

    public ItemSpecialDetailResultBinding(Object obj, View view, int i10, RoundedImageView roundedImageView, TextView textView) {
        super(obj, view, i10);
        this.f40915b = roundedImageView;
        this.f40916c = textView;
    }
}
