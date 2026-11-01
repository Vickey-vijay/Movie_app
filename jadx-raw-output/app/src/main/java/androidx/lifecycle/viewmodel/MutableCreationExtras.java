package androidx.lifecycle.viewmodel;

import ck.i;
import ck.p;
import com.ironsource.C3426d4;

/* JADX INFO: compiled from: CreationExtras.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class MutableCreationExtras extends CreationExtras {
    /* JADX WARN: Multi-variable type inference failed */
    public MutableCreationExtras() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public MutableCreationExtras(CreationExtras creationExtras) {
        p.j(creationExtras, "initialExtras");
        getMap$lifecycle_viewmodel_release().putAll(creationExtras.getMap$lifecycle_viewmodel_release());
    }

    @Override // androidx.lifecycle.viewmodel.CreationExtras
    public <T> T get(CreationExtras.Key<T> key) {
        p.j(key, C3426d4.i.W);
        return (T) getMap$lifecycle_viewmodel_release().get(key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> void set(CreationExtras.Key<T> key, T t10) {
        p.j(key, C3426d4.i.W);
        getMap$lifecycle_viewmodel_release().put(key, t10);
    }

    public /* synthetic */ MutableCreationExtras(CreationExtras creationExtras, int i10, i iVar) {
        this((i10 & 1) != 0 ? CreationExtras.Empty.INSTANCE : creationExtras);
    }
}
