package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.model.ORDERLISTVIEWMODEL;

/* JADX INFO: loaded from: classes9.dex */
public abstract class ActivityOrderListBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ActionbarBackBinding f39897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f39898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Bindable
    public ORDERLISTVIEWMODEL f39899d;

    public ActivityOrderListBinding(Object obj, View view, int i10, ActionbarBackBinding actionbarBackBinding, TextView textView) {
        super(obj, view, i10);
        this.f39897b = actionbarBackBinding;
        this.f39898c = textView;
    }
}
