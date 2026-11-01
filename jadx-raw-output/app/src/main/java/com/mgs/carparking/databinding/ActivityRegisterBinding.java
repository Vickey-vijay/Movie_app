package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.model.REGISTERVIEWMODEL;
import com.mgs.carparking.widgets.ClearableEditText;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ActivityRegisterBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ActionbarBackBinding f39908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Button f39909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final EditText f39910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final EditText f39911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ClearableEditText f39912f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ImageView f39913g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final ImageView f39914h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Bindable
    public REGISTERVIEWMODEL f39915i;

    public ActivityRegisterBinding(Object obj, View view, int i10, ActionbarBackBinding actionbarBackBinding, Button button, EditText editText, EditText editText2, ClearableEditText clearableEditText, ImageView imageView, ImageView imageView2) {
        super(obj, view, i10);
        this.f39908b = actionbarBackBinding;
        this.f39909c = button;
        this.f39910d = editText;
        this.f39911e = editText2;
        this.f39912f = clearableEditText;
        this.f39913g = imageView;
        this.f39914h = imageView2;
    }
}
