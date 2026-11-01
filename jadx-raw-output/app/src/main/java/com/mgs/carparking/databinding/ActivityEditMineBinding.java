package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.model.EDITMINEVIEWMODEL;
import com.mgs.carparking.widgets.CircularImageView;
import com.mgs.carparking.widgets.ClearableEditText;

/* JADX INFO: loaded from: classes9.dex */
public abstract class ActivityEditMineBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ActionbarBackBinding f39784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ClearableEditText f39785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ClearableEditText f39786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ClearableEditText f39787e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final CircularImageView f39788f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f39789g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f39790h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f39791i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f39792j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Bindable
    public EDITMINEVIEWMODEL f39793k;

    public ActivityEditMineBinding(Object obj, View view, int i10, ActionbarBackBinding actionbarBackBinding, ClearableEditText clearableEditText, ClearableEditText clearableEditText2, ClearableEditText clearableEditText3, CircularImageView circularImageView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i10);
        this.f39784b = actionbarBackBinding;
        this.f39785c = clearableEditText;
        this.f39786d = clearableEditText2;
        this.f39787e = clearableEditText3;
        this.f39788f = circularImageView;
        this.f39789g = textView;
        this.f39790h = textView2;
        this.f39791i = textView3;
        this.f39792j = textView4;
    }
}
