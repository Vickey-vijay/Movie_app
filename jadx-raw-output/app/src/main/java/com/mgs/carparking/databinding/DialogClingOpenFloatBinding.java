package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.model.VIDEOPLAYDETAILVIEWMODEL;

/* JADX INFO: loaded from: classes8.dex */
public abstract class DialogClingOpenFloatBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final LinearLayout f40027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f40028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Bindable
    public VIDEOPLAYDETAILVIEWMODEL f40029d;

    public abstract void a(@Nullable VIDEOPLAYDETAILVIEWMODEL videoplaydetailviewmodel);

    public DialogClingOpenFloatBinding(Object obj, View view, int i10, LinearLayout linearLayout, TextView textView) {
        super(obj, view, i10);
        this.f40027b = linearLayout;
        this.f40028c = textView;
    }
}
