package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.ui.toolbar.ToolbarViewModel;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ActionbarBackBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f39729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f39730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f39731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f39732e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f39733f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f39734g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f39735h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f39736i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Bindable
    public ToolbarViewModel f39737j;

    public abstract void a(@Nullable ToolbarViewModel toolbarViewModel);

    public ActionbarBackBinding(Object obj, View view, int i10, ImageView imageView, ImageView imageView2, RelativeLayout relativeLayout, LinearLayout linearLayout, RelativeLayout relativeLayout2, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i10);
        this.f39729b = imageView;
        this.f39730c = imageView2;
        this.f39731d = relativeLayout;
        this.f39732e = linearLayout;
        this.f39733f = relativeLayout2;
        this.f39734g = textView;
        this.f39735h = textView2;
        this.f39736i = textView3;
    }
}
