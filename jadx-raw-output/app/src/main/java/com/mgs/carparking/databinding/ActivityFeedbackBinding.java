package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.model.FEEDBACKVIEWMODEL;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ActivityFeedbackBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ActionbarBackBinding f39824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final EditText f39825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f39826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f39827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f39828f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f39829g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final ScrollView f39830h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Bindable
    public FEEDBACKVIEWMODEL f39831i;

    public ActivityFeedbackBinding(Object obj, View view, int i10, ActionbarBackBinding actionbarBackBinding, EditText editText, ImageView imageView, ImageView imageView2, ImageView imageView3, RelativeLayout relativeLayout, ScrollView scrollView) {
        super(obj, view, i10);
        this.f39824b = actionbarBackBinding;
        this.f39825c = editText;
        this.f39826d = imageView;
        this.f39827e = imageView2;
        this.f39828f = imageView3;
        this.f39829g = relativeLayout;
        this.f39830h = scrollView;
    }
}
