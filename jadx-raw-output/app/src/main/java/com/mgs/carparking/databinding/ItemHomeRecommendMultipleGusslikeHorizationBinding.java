package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.widgets.rv.SV_RV_inner;
import ea.s;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ItemHomeRecommendMultipleGusslikeHorizationBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final LinearLayout f40661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final SV_RV_inner f40662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f40663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Bindable
    public s f40664e;

    public ItemHomeRecommendMultipleGusslikeHorizationBinding(Object obj, View view, int i10, LinearLayout linearLayout, SV_RV_inner sV_RV_inner, TextView textView) {
        super(obj, view, i10);
        this.f40661b = linearLayout;
        this.f40662c = sV_RV_inner;
        this.f40663d = textView;
    }
}
