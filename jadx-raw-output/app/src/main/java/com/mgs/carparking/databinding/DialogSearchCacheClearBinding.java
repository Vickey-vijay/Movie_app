package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.model.SETTINGVIEWMODEL;

/* JADX INFO: loaded from: classes11.dex */
public abstract class DialogSearchCacheClearBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final LinearLayout f40039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f40040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Bindable
    public SETTINGVIEWMODEL f40041d;

    public abstract void a(@Nullable SETTINGVIEWMODEL settingviewmodel);

    public DialogSearchCacheClearBinding(Object obj, View view, int i10, LinearLayout linearLayout, TextView textView) {
        super(obj, view, i10);
        this.f40039b = linearLayout;
        this.f40040c = textView;
    }
}
