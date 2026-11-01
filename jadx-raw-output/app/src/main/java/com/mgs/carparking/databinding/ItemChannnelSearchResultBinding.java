package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.widgets.cardbanner.view.RoundedImageView;
import w9.p0;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ItemChannnelSearchResultBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final RoundedImageView f40322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f40323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Bindable
    public p0 f40324d;

    public ItemChannnelSearchResultBinding(Object obj, View view, int i10, RoundedImageView roundedImageView, TextView textView) {
        super(obj, view, i10);
        this.f40322b = roundedImageView;
        this.f40323c = textView;
    }
}
