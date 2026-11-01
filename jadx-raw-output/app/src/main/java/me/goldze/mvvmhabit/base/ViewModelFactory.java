package me.goldze.mvvmhabit.base;

import android.app.Application;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: loaded from: classes11.dex */
public class ViewModelFactory extends ViewModelProvider.NewInstanceFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f64426a;

    @Override // androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> cls) {
        return new BaseViewModel(this.f64426a);
    }
}
