package el;

import ck.i;
import java.util.List;
import kotlinx.serialization.modules.SerializersModuleCollector;
import nj.s;
import xk.g;

/* JADX INFO: compiled from: SerializersModule.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public c() {
    }

    public /* synthetic */ c(i iVar) {
        this();
    }

    public abstract void a(SerializersModuleCollector serializersModuleCollector);

    public abstract <T> xk.b<T> b(jk.c<T> cVar, List<? extends xk.b<?>> list);

    public abstract <T> xk.a<T> d(jk.c<? super T> cVar, String str);

    public abstract <T> g<T> e(jk.c<? super T> cVar, T t10);

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ xk.b c(c cVar, jk.c cVar2, List list, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContextual");
        }
        if ((i10 & 2) != 0) {
            list = s.k();
        }
        return cVar.b(cVar2, list);
    }
}
