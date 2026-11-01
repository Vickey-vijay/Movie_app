package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.model.EXTENSIONSHAREVIEWMODEL;
import com.ruffian.library.widget.RConstraintLayout;
import com.ruffian.library.widget.RTextView;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ActivityExtensionShareBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ActionbarBackBinding f39812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final RConstraintLayout f39813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f39814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f39815e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f39816f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final RTextView f39817g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Bindable
    public EXTENSIONSHAREVIEWMODEL f39818h;

    public ActivityExtensionShareBinding(Object obj, View view, int i10, ActionbarBackBinding actionbarBackBinding, RConstraintLayout rConstraintLayout, ImageView imageView, LinearLayout linearLayout, TextView textView, RTextView rTextView) {
        super(obj, view, i10);
        this.f39812b = actionbarBackBinding;
        this.f39813c = rConstraintLayout;
        this.f39814d = imageView;
        this.f39815e = linearLayout;
        this.f39816f = textView;
        this.f39817g = rTextView;
    }
}
