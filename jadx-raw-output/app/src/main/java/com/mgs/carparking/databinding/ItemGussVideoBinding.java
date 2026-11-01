package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.widgets.cardbanner.view.RoundedImageView;
import w9.s1;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ItemGussVideoBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final RoundedImageView f40418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f40419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Bindable
    public s1 f40420d;

    public ItemGussVideoBinding(Object obj, View view, int i10, RoundedImageView roundedImageView, TextView textView) {
        super(obj, view, i10);
        this.f40418b = roundedImageView;
        this.f40419c = textView;
    }
}
