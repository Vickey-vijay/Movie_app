package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.model.VIDEOPLAYDETAILVIEWMODEL;

/* JADX INFO: loaded from: classes8.dex */
public abstract class PopLayoutVideoCommentItemBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f41008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Bindable
    public VIDEOPLAYDETAILVIEWMODEL f41009c;

    public abstract void a(@Nullable VIDEOPLAYDETAILVIEWMODEL videoplaydetailviewmodel);

    public PopLayoutVideoCommentItemBinding(Object obj, View view, int i10, TextView textView) {
        super(obj, view, i10);
        this.f41008b = textView;
    }
}
