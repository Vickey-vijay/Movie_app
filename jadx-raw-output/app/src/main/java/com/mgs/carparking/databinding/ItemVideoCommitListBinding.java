package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.widgets.CircularImageView;
import w9.y0;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ItemVideoCommitListBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f40926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final CircularImageView f40927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final LinearLayout f40928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40929e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f40930f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f40931g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Bindable
    public y0 f40932h;

    public ItemVideoCommitListBinding(Object obj, View view, int i10, ImageView imageView, CircularImageView circularImageView, LinearLayout linearLayout, RelativeLayout relativeLayout, TextView textView, TextView textView2) {
        super(obj, view, i10);
        this.f40926b = imageView;
        this.f40927c = circularImageView;
        this.f40928d = linearLayout;
        this.f40929e = relativeLayout;
        this.f40930f = textView;
        this.f40931g = textView2;
    }
}
