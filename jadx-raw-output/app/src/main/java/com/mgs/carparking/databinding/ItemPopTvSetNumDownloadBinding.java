package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import w9.c3;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ItemPopTvSetNumDownloadBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f40858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f40860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Bindable
    public c3 f40861e;

    public ItemPopTvSetNumDownloadBinding(Object obj, View view, int i10, ImageView imageView, RelativeLayout relativeLayout, TextView textView) {
        super(obj, view, i10);
        this.f40858b = imageView;
        this.f40859c = relativeLayout;
        this.f40860d = textView;
    }
}
