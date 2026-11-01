package kotlinx.serialization.modules;

import bk.l;
import ck.p;
import java.util.List;
import jk.c;
import xk.a;
import xk.b;
import xk.g;

/* JADX INFO: compiled from: SerializersModuleCollector.kt */
/* JADX INFO: loaded from: classes6.dex */
public interface SerializersModuleCollector {

    /* JADX INFO: compiled from: SerializersModuleCollector.kt */
    public static final class DefaultImpls {
        public static <T> void a(SerializersModuleCollector serializersModuleCollector, c<T> cVar, final b<T> bVar) {
            p.j(cVar, "kClass");
            p.j(bVar, "serializer");
            serializersModuleCollector.e(cVar, new l<List<? extends b<?>>, b<?>>() { // from class: kotlinx.serialization.modules.SerializersModuleCollector$contextual$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // bk.l
                public final b<?> invoke(List<? extends b<?>> list) {
                    p.j(list, "it");
                    return bVar;
                }
            });
        }
    }

    <Base> void a(c<Base> cVar, l<? super Base, ? extends g<? super Base>> lVar);

    <T> void b(c<T> cVar, b<T> bVar);

    <Base> void c(c<Base> cVar, l<? super String, ? extends a<? extends Base>> lVar);

    <Base, Sub extends Base> void d(c<Base> cVar, c<Sub> cVar2, b<Sub> bVar);

    <T> void e(c<T> cVar, l<? super List<? extends b<?>>, ? extends b<?>> lVar);
}
