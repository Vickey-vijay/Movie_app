package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.widgets.cardbanner.view.RoundedImageView;
import w9.v1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ItemMineHistoryBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final RoundedImageView f40821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Bindable
    public v1 f40823d;

    public ItemMineHistoryBinding(Object obj, View view, int i10, RoundedImageView roundedImageView, RelativeLayout relativeLayout) {
        super(obj, view, i10);
        this.f40821b = roundedImageView;
        this.f40822c = relativeLayout;
    }
}
