package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.model.LOGINVIEWMODEL;
import com.mgs.carparking.widgets.ClearableEditText;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ActivityLoginBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Button f39866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final EditText f39867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ClearableEditText f39868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f39869e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f39870f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f39871g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Bindable
    public LOGINVIEWMODEL f39872h;

    public ActivityLoginBinding(Object obj, View view, int i10, Button button, EditText editText, ClearableEditText clearableEditText, ImageView imageView, ImageView imageView2, TextView textView) {
        super(obj, view, i10);
        this.f39866b = button;
        this.f39867c = editText;
        this.f39868d = clearableEditText;
        this.f39869e = imageView;
        this.f39870f = imageView2;
        this.f39871g = textView;
    }
}
