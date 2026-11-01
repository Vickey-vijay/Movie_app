package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.widgets.cardbanner.view.RoundedImageView;
import w9.w2;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ItemSpecialDetailNewItemResultBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final RoundedImageView f40898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f40900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f40901e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Bindable
    public w2 f40902f;

    public ItemSpecialDetailNewItemResultBinding(Object obj, View view, int i10, RoundedImageView roundedImageView, RelativeLayout relativeLayout, TextView textView, TextView textView2) {
        super(obj, view, i10);
        this.f40898b = roundedImageView;
        this.f40899c = relativeLayout;
        this.f40900d = textView;
        this.f40901e = textView2;
    }
}
