package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import bk.l;
import ck.p;

/* JADX INFO: compiled from: InitializerViewModelFactory.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class ViewModelInitializer<T extends ViewModel> {
    private final Class<T> clazz;
    private final l<CreationExtras, T> initializer;

    /* JADX WARN: Multi-variable type inference failed */
    public ViewModelInitializer(Class<T> cls, l<? super CreationExtras, ? extends T> lVar) {
        p.j(cls, "clazz");
        p.j(lVar, "initializer");
        this.clazz = cls;
        this.initializer = lVar;
    }

    public final Class<T> getClazz$lifecycle_viewmodel_release() {
        return this.clazz;
    }

    public final l<CreationExtras, T> getInitializer$lifecycle_viewmodel_release() {
        return this.initializer;
    }
}
