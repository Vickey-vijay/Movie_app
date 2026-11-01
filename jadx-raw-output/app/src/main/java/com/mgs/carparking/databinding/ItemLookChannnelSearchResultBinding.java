package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.widgets.cardbanner.view.RoundedImageView;
import w9.y1;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ItemLookChannnelSearchResultBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final RoundedImageView f40811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f40812c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Bindable
    public y1 f40813d;

    public ItemLookChannnelSearchResultBinding(Object obj, View view, int i10, RoundedImageView roundedImageView, TextView textView) {
        super(obj, view, i10);
        this.f40811b = roundedImageView;
        this.f40812c = textView;
    }
}
