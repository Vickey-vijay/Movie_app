package com.mgs.carparking.databinding;

import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.libutils.statusbar.StatusBarHeightView;
import com.mgs.carparking.model.SPIELVIEWMODEL;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentSpielBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final StatusBarHeightView f40293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f40294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ProgressBar f40295d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final WebView f40296e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Bindable
    public SPIELVIEWMODEL f40297f;

    public FragmentSpielBinding(Object obj, View view, int i10, StatusBarHeightView statusBarHeightView, ImageView imageView, ProgressBar progressBar, WebView webView) {
        super(obj, view, i10);
        this.f40293b = statusBarHeightView;
        this.f40294c = imageView;
        this.f40295d = progressBar;
        this.f40296e = webView;
    }
}
