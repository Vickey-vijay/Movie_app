package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.widgets.cardbanner.view.StraightImageView;
import w9.h2;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ItemHomeSearchHotSearchBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final StraightImageView f40790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final LinearLayout f40791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f40792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f40793e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Bindable
    public h2 f40794f;

    public ItemHomeSearchHotSearchBinding(Object obj, View view, int i10, StraightImageView straightImageView, LinearLayout linearLayout, TextView textView, TextView textView2) {
        super(obj, view, i10);
        this.f40790b = straightImageView;
        this.f40791c = linearLayout;
        this.f40792d = textView;
        this.f40793e = textView2;
    }
}
