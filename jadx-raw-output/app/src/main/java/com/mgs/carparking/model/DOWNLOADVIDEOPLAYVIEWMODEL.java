package com.mgs.carparking.model;

import android.app.Application;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import me.goldze.mvvmhabit.base.BaseViewModel;

/* JADX INFO: loaded from: classes7.dex */
public class DOWNLOADVIDEOPLAYVIEWMODEL extends BaseViewModel<n9.a> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ObservableField<Drawable> f41117f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ObservableField<Boolean> f41118g;

    public DOWNLOADVIDEOPLAYVIEWMODEL(@NonNull Application application, n9.a aVar) {
        super(application, aVar);
        this.f41117f = new ObservableField<>();
        this.f41118g = new ObservableField<>(Boolean.FALSE);
    }
}
