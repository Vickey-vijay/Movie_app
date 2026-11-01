package androidx.lifecycle.viewmodel;

import ak.a;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import bk.l;
import ck.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jk.c;

/* JADX INFO: compiled from: InitializerViewModelFactory.kt */
/* JADX INFO: loaded from: classes6.dex */
@ViewModelFactoryDsl
public final class InitializerViewModelFactoryBuilder {
    private final List<ViewModelInitializer<?>> initializers = new ArrayList();

    public final <T extends ViewModel> void addInitializer(c<T> cVar, l<? super CreationExtras, ? extends T> lVar) {
        p.j(cVar, "clazz");
        p.j(lVar, "initializer");
        this.initializers.add(new ViewModelInitializer<>(a.a(cVar), lVar));
    }

    public final ViewModelProvider.Factory build() {
        ViewModelInitializer[] viewModelInitializerArr = (ViewModelInitializer[]) this.initializers.toArray(new ViewModelInitializer[0]);
        return new InitializerViewModelFactory((ViewModelInitializer[]) Arrays.copyOf(viewModelInitializerArr, viewModelInitializerArr.length));
    }
}
