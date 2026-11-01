package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.model.EXTENSIONRECORDVIEWMODEL;

/* JADX INFO: loaded from: classes9.dex */
public abstract class ActivityExtensionRecordBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ActionbarBackBinding f39801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f39802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Bindable
    public EXTENSIONRECORDVIEWMODEL f39803d;

    public ActivityExtensionRecordBinding(Object obj, View view, int i10, ActionbarBackBinding actionbarBackBinding, TextView textView) {
        super(obj, view, i10);
        this.f39801b = actionbarBackBinding;
        this.f39802c = textView;
    }
}
