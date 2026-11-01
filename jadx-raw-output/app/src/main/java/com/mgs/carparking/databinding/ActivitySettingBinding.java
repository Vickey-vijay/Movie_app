package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.model.SETTINGVIEWMODEL;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ActivitySettingBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ActionbarBackBinding f39949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Button f39950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f39951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f39952e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f39953f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ImageView f39954g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Bindable
    public SETTINGVIEWMODEL f39955h;

    public ActivitySettingBinding(Object obj, View view, int i10, ActionbarBackBinding actionbarBackBinding, Button button, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4) {
        super(obj, view, i10);
        this.f39949b = actionbarBackBinding;
        this.f39950c = button;
        this.f39951d = imageView;
        this.f39952e = imageView2;
        this.f39953f = imageView3;
        this.f39954g = imageView4;
    }
}
