package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.model.DOWNLOADVIDEOVIEWMODEL;

/* JADX INFO: loaded from: classes9.dex */
public abstract class DialogVideoDeleteBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final LinearLayout f40070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f40071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Bindable
    public DOWNLOADVIDEOVIEWMODEL f40072d;

    public abstract void a(@Nullable DOWNLOADVIDEOVIEWMODEL downloadvideoviewmodel);

    public DialogVideoDeleteBinding(Object obj, View view, int i10, LinearLayout linearLayout, TextView textView) {
        super(obj, view, i10);
        this.f40070b = linearLayout;
        this.f40071c = textView;
    }
}
