package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.widgets.cardbanner.view.RoundedImageView;
import pa.f;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ItemRankContentMultipleNextBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final RoundedImageView f40868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f40869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Bindable
    public f f40870d;

    public ItemRankContentMultipleNextBinding(Object obj, View view, int i10, RoundedImageView roundedImageView, TextView textView) {
        super(obj, view, i10);
        this.f40868b = roundedImageView;
        this.f40869c = textView;
    }
}
