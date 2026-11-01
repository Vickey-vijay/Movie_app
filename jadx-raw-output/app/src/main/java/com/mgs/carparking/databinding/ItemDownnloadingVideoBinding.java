package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.model.a;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ItemDownnloadingVideoBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ProgressBar f40368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Bindable
    public a f40370d;

    public ItemDownnloadingVideoBinding(Object obj, View view, int i10, ProgressBar progressBar, RelativeLayout relativeLayout) {
        super(obj, view, i10);
        this.f40368b = progressBar;
        this.f40369c = relativeLayout;
    }
}
