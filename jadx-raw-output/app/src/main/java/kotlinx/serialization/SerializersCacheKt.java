package kotlinx.serialization;

import bk.l;
import bl.l1;
import bl.o;
import bl.z1;
import ck.p;
import el.d;
import java.util.List;
import jk.c;
import jk.e;
import jk.n;
import xk.b;
import xk.h;
import yk.a;

/* JADX INFO: compiled from: SerializersCache.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class SerializersCacheKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z1<? extends Object> f63230a = o.a(new l<c<?>, b<? extends Object>>() { // from class: kotlinx.serialization.SerializersCacheKt$SERIALIZERS_CACHE$1
        @Override // bk.l
        public final b<? extends Object> invoke(c<?> cVar) {
            p.j(cVar, "it");
            return h.d(cVar);
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z1<Object> f63231b = o.a(new l<c<?>, b<Object>>() { // from class: kotlinx.serialization.SerializersCacheKt$SERIALIZERS_CACHE_NULLABLE$1
        @Override // bk.l
        public final b<Object> invoke(c<?> cVar) {
            b<Object> bVarT;
            p.j(cVar, "it");
            b bVarD = h.d(cVar);
            if (bVarD == null || (bVarT = a.t(bVarD)) == null) {
                return null;
            }
            return bVarT;
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l1<? extends Object> f63232c = o.b(new bk.p<c<Object>, List<? extends n>, b<? extends Object>>() { // from class: kotlinx.serialization.SerializersCacheKt$PARAMETRIZED_SERIALIZERS_CACHE$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final b<? extends Object> mo1invoke(c<Object> cVar, final List<? extends n> list) {
            p.j(cVar, "clazz");
            p.j(list, "types");
            List<b<Object>> listE = h.e(d.a(), list, true);
            p.g(listE);
            return h.a(cVar, listE, new bk.a<e>() { // from class: kotlinx.serialization.SerializersCacheKt$PARAMETRIZED_SERIALIZERS_CACHE$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // bk.a
                public final e invoke() {
                    return list.get(0).h();
                }
            });
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l1<Object> f63233d = o.b(new bk.p<c<Object>, List<? extends n>, b<Object>>() { // from class: kotlinx.serialization.SerializersCacheKt$PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final b<Object> mo1invoke(c<Object> cVar, final List<? extends n> list) {
            b<Object> bVarT;
            p.j(cVar, "clazz");
            p.j(list, "types");
            List<b<Object>> listE = h.e(d.a(), list, true);
            p.g(listE);
            b<? extends Object> bVarA = h.a(cVar, listE, new bk.a<e>() { // from class: kotlinx.serialization.SerializersCacheKt$PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // bk.a
                public final e invoke() {
                    return list.get(0).h();
                }
            });
            if (bVarA == null || (bVarT = a.t(bVarA)) == null) {
                return null;
            }
            return bVarT;
        }
    });

    public static final b<Object> a(c<Object> cVar, boolean z10) {
        p.j(cVar, "clazz");
        if (z10) {
            return f63231b.a(cVar);
        }
        b<? extends Object> bVarA = f63230a.a(cVar);
        if (bVarA != null) {
            return bVarA;
        }
        return null;
    }

    public static final Object b(c<Object> cVar, List<? extends n> list, boolean z10) {
        p.j(cVar, "clazz");
        p.j(list, "types");
        return !z10 ? f63232c.a(cVar, list) : f63233d.a(cVar, list);
    }
}
