package androidx.lifecycle;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.viewmodel.CreationExtras;
import ck.i;
import ck.p;

/* JADX INFO: compiled from: ViewModelLazy.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class ViewModelLazy<VM extends ViewModel> implements mj.g<VM> {
    private VM cached;
    private final bk.a<CreationExtras> extrasProducer;
    private final bk.a<ViewModelProvider.Factory> factoryProducer;
    private final bk.a<ViewModelStore> storeProducer;
    private final jk.c<VM> viewModelClass;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelLazy(jk.c<VM> cVar, bk.a<? extends ViewModelStore> aVar, bk.a<? extends ViewModelProvider.Factory> aVar2) {
        this(cVar, aVar, aVar2, null, 8, null);
        p.j(cVar, "viewModelClass");
        p.j(aVar, "storeProducer");
        p.j(aVar2, "factoryProducer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ViewModelLazy(jk.c<VM> cVar, bk.a<? extends ViewModelStore> aVar, bk.a<? extends ViewModelProvider.Factory> aVar2, bk.a<? extends CreationExtras> aVar3) {
        p.j(cVar, "viewModelClass");
        p.j(aVar, "storeProducer");
        p.j(aVar2, "factoryProducer");
        p.j(aVar3, "extrasProducer");
        this.viewModelClass = cVar;
        this.storeProducer = aVar;
        this.factoryProducer = aVar2;
        this.extrasProducer = aVar3;
    }

    @Override // mj.g
    public VM getValue() {
        VM vm2 = this.cached;
        if (vm2 != null) {
            return vm2;
        }
        VM vm3 = (VM) new ViewModelProvider(this.storeProducer.invoke(), this.factoryProducer.invoke(), this.extrasProducer.invoke()).get(ak.a.a(this.viewModelClass));
        this.cached = vm3;
        return vm3;
    }

    public boolean isInitialized() {
        return this.cached != null;
    }

    public /* synthetic */ ViewModelLazy(jk.c cVar, bk.a aVar, bk.a aVar2, bk.a aVar3, int i10, i iVar) {
        this(cVar, aVar, aVar2, (i10 & 8) != 0 ? new bk.a<CreationExtras.Empty>() { // from class: androidx.lifecycle.ViewModelLazy.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final CreationExtras.Empty invoke() {
                return CreationExtras.Empty.INSTANCE;
            }
        } : aVar3);
    }
}
