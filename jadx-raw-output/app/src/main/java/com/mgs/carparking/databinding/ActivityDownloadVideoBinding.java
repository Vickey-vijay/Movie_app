package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.mgs.carparking.model.DOWNLOADVIDEOVIEWMODEL;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ActivityDownloadVideoBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final RecyclerView f39765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f39766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f39767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Bindable
    public DOWNLOADVIDEOVIEWMODEL f39768e;

    public ActivityDownloadVideoBinding(Object obj, View view, int i10, RecyclerView recyclerView, TextView textView, TextView textView2) {
        super(obj, view, i10);
        this.f39765b = recyclerView;
        this.f39766c = textView;
        this.f39767d = textView2;
    }
}
