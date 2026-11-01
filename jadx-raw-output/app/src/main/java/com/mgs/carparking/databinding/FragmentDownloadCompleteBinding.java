package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.model.DOWNLOADCOMPLETEVIEWMODEL;

/* JADX INFO: loaded from: classes7.dex */
public abstract class FragmentDownloadCompleteBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f40143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f40144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Bindable
    public DOWNLOADCOMPLETEVIEWMODEL f40145d;

    public FragmentDownloadCompleteBinding(Object obj, View view, int i10, TextView textView, TextView textView2) {
        super(obj, view, i10);
        this.f40143b = textView;
        this.f40144c = textView2;
    }
}
