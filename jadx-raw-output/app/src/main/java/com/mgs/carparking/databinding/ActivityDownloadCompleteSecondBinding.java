package com.mgs.carparking.databinding;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.model.DOWNLOADCOMPLETESECONDVIEWMODEL;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ActivityDownloadCompleteSecondBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ActionbarBackBinding f39754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Bindable
    public DOWNLOADCOMPLETESECONDVIEWMODEL f39755c;

    public ActivityDownloadCompleteSecondBinding(Object obj, View view, int i10, ActionbarBackBinding actionbarBackBinding) {
        super(obj, view, i10);
        this.f39754b = actionbarBackBinding;
    }
}
