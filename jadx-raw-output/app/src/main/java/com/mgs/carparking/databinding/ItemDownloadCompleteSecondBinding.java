package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.widgets.cardbanner.view.RoundedImageView;
import w9.f1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ItemDownloadCompleteSecondBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final RoundedImageView f40344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Bindable
    public f1 f40345d;

    public ItemDownloadCompleteSecondBinding(Object obj, View view, int i10, RelativeLayout relativeLayout, RoundedImageView roundedImageView) {
        super(obj, view, i10);
        this.f40343b = relativeLayout;
        this.f40344c = roundedImageView;
    }
}
