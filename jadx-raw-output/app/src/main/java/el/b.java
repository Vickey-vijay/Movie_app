package el;

import bk.l;
import ck.p;
import ck.s;
import ck.x;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.modules.SerializersModuleCollector;
import xk.g;

/* JADX INFO: compiled from: SerializersModule.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<jk.c<?>, a> f52659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<jk.c<?>, Map<jk.c<?>, xk.b<?>>> f52660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<jk.c<?>, l<?, g<?>>> f52661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<jk.c<?>, Map<String, xk.b<?>>> f52662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<jk.c<?>, l<String, xk.a<?>>> f52663e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(Map<jk.c<?>, ? extends a> map, Map<jk.c<?>, ? extends Map<jk.c<?>, ? extends xk.b<?>>> map2, Map<jk.c<?>, ? extends l<?, ? extends g<?>>> map3, Map<jk.c<?>, ? extends Map<String, ? extends xk.b<?>>> map4, Map<jk.c<?>, ? extends l<? super String, ? extends xk.a<?>>> map5) {
        super(null);
        p.j(map, "class2ContextualFactory");
        p.j(map2, "polyBase2Serializers");
        p.j(map3, "polyBase2DefaultSerializerProvider");
        p.j(map4, "polyBase2NamedSerializers");
        p.j(map5, "polyBase2DefaultDeserializerProvider");
        this.f52659a = map;
        this.f52660b = map2;
        this.f52661c = map3;
        this.f52662d = map4;
        this.f52663e = map5;
    }

    @Override // el.c
    public void a(SerializersModuleCollector serializersModuleCollector) {
        p.j(serializersModuleCollector, "collector");
        for (Map.Entry<jk.c<?>, a> entry : this.f52659a.entrySet()) {
            jk.c<?> key = entry.getKey();
            a value = entry.getValue();
            if (value instanceof a.C0466a) {
                p.h(key, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                xk.b<?> bVarB = ((a.C0466a) value).b();
                p.h(bVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                serializersModuleCollector.b(key, bVarB);
            } else if (value instanceof a.b) {
                serializersModuleCollector.e(key, ((a.b) value).b());
            }
        }
        for (Map.Entry<jk.c<?>, Map<jk.c<?>, xk.b<?>>> entry2 : this.f52660b.entrySet()) {
            jk.c<?> key2 = entry2.getKey();
            for (Map.Entry<jk.c<?>, xk.b<?>> entry3 : entry2.getValue().entrySet()) {
                jk.c<?> key3 = entry3.getKey();
                xk.b<?> value2 = entry3.getValue();
                p.h(key2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                p.h(key3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                p.h(value2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                serializersModuleCollector.d(key2, key3, value2);
            }
        }
        for (Map.Entry<jk.c<?>, l<?, g<?>>> entry4 : this.f52661c.entrySet()) {
            jk.c<?> key4 = entry4.getKey();
            l<?, g<?>> value3 = entry4.getValue();
            p.h(key4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            p.h(value3, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = 'value')] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>{ kotlinx.serialization.modules.SerializersModuleKt.PolymorphicSerializerProvider<kotlin.Any> }");
            serializersModuleCollector.a(key4, (l) x.e(value3, 1));
        }
        for (Map.Entry<jk.c<?>, l<String, xk.a<?>>> entry5 : this.f52663e.entrySet()) {
            jk.c<?> key5 = entry5.getKey();
            l<String, xk.a<?>> value4 = entry5.getValue();
            p.h(key5, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            p.h(value4, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = 'className')] kotlin.String?, kotlinx.serialization.DeserializationStrategy<out kotlin.Any>?>{ kotlinx.serialization.modules.SerializersModuleKt.PolymorphicDeserializerProvider<out kotlin.Any> }");
            serializersModuleCollector.c(key5, (l) x.e(value4, 1));
        }
    }

    @Override // el.c
    public <T> xk.b<T> b(jk.c<T> cVar, List<? extends xk.b<?>> list) {
        p.j(cVar, "kClass");
        p.j(list, "typeArgumentsSerializers");
        a aVar = this.f52659a.get(cVar);
        xk.b<?> bVarA = aVar != null ? aVar.a(list) : null;
        if (bVarA instanceof xk.b) {
            return (xk.b<T>) bVarA;
        }
        return null;
    }

    @Override // el.c
    public <T> xk.a<T> d(jk.c<? super T> cVar, String str) {
        p.j(cVar, "baseClass");
        Map<String, xk.b<?>> map = this.f52662d.get(cVar);
        xk.b<?> bVar = map != null ? map.get(str) : null;
        if (!(bVar instanceof xk.b)) {
            bVar = null;
        }
        if (bVar != null) {
            return bVar;
        }
        l<String, xk.a<?>> lVar = this.f52663e.get(cVar);
        l<String, xk.a<?>> lVar2 = x.k(lVar, 1) ? lVar : null;
        if (lVar2 != null) {
            return (xk.a) lVar2.invoke(str);
        }
        return null;
    }

    @Override // el.c
    public <T> g<T> e(jk.c<? super T> cVar, T t10) {
        p.j(cVar, "baseClass");
        p.j(t10, "value");
        if (!cVar.e(t10)) {
            return null;
        }
        Map<jk.c<?>, xk.b<?>> map = this.f52660b.get(cVar);
        xk.b<?> bVar = map != null ? map.get(s.b(t10.getClass())) : null;
        if (!(bVar instanceof g)) {
            bVar = null;
        }
        if (bVar != null) {
            return bVar;
        }
        l<?, g<?>> lVar = this.f52661c.get(cVar);
        l<?, g<?>> lVar2 = x.k(lVar, 1) ? lVar : null;
        if (lVar2 != null) {
            return (g) lVar2.invoke(t10);
        }
        return null;
    }
}
