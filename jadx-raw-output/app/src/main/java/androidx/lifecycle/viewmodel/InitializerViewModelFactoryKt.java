package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import bk.l;
import ck.p;
import ck.s;
import mj.r;

/* JADX INFO: compiled from: InitializerViewModelFactory.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class InitializerViewModelFactoryKt {
    public static final /* synthetic */ <VM extends ViewModel> void initializer(InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder, l<? super CreationExtras, ? extends VM> lVar) {
        p.j(initializerViewModelFactoryBuilder, "<this>");
        p.j(lVar, "initializer");
        p.p(4, "VM");
        initializerViewModelFactoryBuilder.addInitializer(s.b(ViewModel.class), lVar);
    }

    public static final ViewModelProvider.Factory viewModelFactory(l<? super InitializerViewModelFactoryBuilder, r> lVar) {
        p.j(lVar, "builder");
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        lVar.invoke(initializerViewModelFactoryBuilder);
        return initializerViewModelFactoryBuilder.build();
    }
}
