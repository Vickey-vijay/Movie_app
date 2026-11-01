package dl;

import java.lang.annotation.Annotation;
import kotlin.KotlinNothingValueException;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: compiled from: Polymorphic.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class s0 {
    public static final void f(xk.g<?> gVar, xk.g<Object> gVar2, String str) {
    }

    public static final void b(zk.g gVar) {
        ck.p.j(gVar, "kind");
        if (gVar instanceof zk.g.b) {
            throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
        }
        if (gVar instanceof zk.e) {
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
        }
        if (gVar instanceof zk.d) {
            throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself".toString());
        }
    }

    public static final String c(kotlinx.serialization.descriptors.a aVar, cl.a aVar2) {
        ck.p.j(aVar, "<this>");
        ck.p.j(aVar2, "json");
        for (Annotation annotation : aVar.getAnnotations()) {
            if (annotation instanceof cl.e) {
                return ((cl.e) annotation).discriminator();
            }
        }
        return aVar2.e().c();
    }

    public static final <T> T d(cl.g gVar, xk.a<? extends T> aVar) {
        kotlinx.serialization.json.c cVarL;
        ck.p.j(gVar, "<this>");
        ck.p.j(aVar, "deserializer");
        if (!(aVar instanceof bl.b) || gVar.d().e().l()) {
            return aVar.deserialize(gVar);
        }
        String strC = c(aVar.getDescriptor(), gVar.d());
        kotlinx.serialization.json.b bVarT = gVar.t();
        kotlinx.serialization.descriptors.a descriptor = aVar.getDescriptor();
        if (bVarT instanceof JsonObject) {
            JsonObject jsonObject = (JsonObject) bVarT;
            kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) jsonObject.get(strC);
            String strE = (bVar == null || (cVarL = cl.i.l(bVar)) == null) ? null : cVarL.e();
            xk.a<T> aVarC = ((bl.b) aVar).c(gVar, strE);
            if (aVarC != null) {
                return (T) b1.b(gVar.d(), strC, jsonObject, aVarC);
            }
            e(strE, jsonObject);
            throw new KotlinNothingValueException();
        }
        throw f0.e(-1, "Expected " + ck.s.b(JsonObject.class) + " as the serialized body of " + descriptor.h() + ", but had " + ck.s.b(bVarT.getClass()));
    }

    public static final Void e(String str, JsonObject jsonObject) {
        String str2;
        ck.p.j(jsonObject, "jsonTree");
        if (str == null) {
            str2 = "missing class discriminator ('null')";
        } else {
            str2 = "class discriminator '" + str + '\'';
        }
        throw f0.f(-1, "Polymorphic serializer was not found for " + str2, jsonObject.toString());
    }
}
