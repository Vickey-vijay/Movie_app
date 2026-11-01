package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.model.FEEDBACKRECORDVIEWMODEL;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ActivityFeedbackRecordBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ActionbarBackBinding f39842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f39843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Bindable
    public FEEDBACKRECORDVIEWMODEL f39844d;

    public ActivityFeedbackRecordBinding(Object obj, View view, int i10, ActionbarBackBinding actionbarBackBinding, TextView textView) {
        super(obj, view, i10);
        this.f39842b = actionbarBackBinding;
        this.f39843c = textView;
    }
}
