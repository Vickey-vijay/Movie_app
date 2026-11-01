package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.model.MINEVIEWMODEL;
import com.mgs.carparking.widgets.CircularImageView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class FragmentMineBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final CircularImageView f40239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final LinearLayout f40240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final LinearLayout f40241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final Switch f40242e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final LinearLayout f40243f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f40244g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f40245h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f40246i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40247j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f40248k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Bindable
    public MINEVIEWMODEL f40249l;

    public FragmentMineBinding(Object obj, View view, int i10, CircularImageView circularImageView, LinearLayout linearLayout, LinearLayout linearLayout2, Switch r10, LinearLayout linearLayout3, TextView textView, TextView textView2, TextView textView3, RelativeLayout relativeLayout, ConstraintLayout constraintLayout) {
        super(obj, view, i10);
        this.f40239b = circularImageView;
        this.f40240c = linearLayout;
        this.f40241d = linearLayout2;
        this.f40242e = r10;
        this.f40243f = linearLayout3;
        this.f40244g = textView;
        this.f40245h = textView2;
        this.f40246i = textView3;
        this.f40247j = relativeLayout;
        this.f40248k = constraintLayout;
    }
}
