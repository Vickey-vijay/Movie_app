package cl;

import bl.m0;
import dl.a1;
import kotlin.KotlinNothingValueException;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: compiled from: JsonElement.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kotlinx.serialization.descriptors.a f6110a = m0.a("kotlinx.serialization.json.JsonUnquotedLiteral", yk.a.C(ck.w.f6066a));

    public static final kotlinx.serialization.json.c a(Boolean bool) {
        return bool == null ? JsonNull.INSTANCE : new n(bool, false, null, 4, null);
    }

    public static final kotlinx.serialization.json.c b(Number number) {
        return number == null ? JsonNull.INSTANCE : new n(number, false, null, 4, null);
    }

    public static final kotlinx.serialization.json.c c(String str) {
        return str == null ? JsonNull.INSTANCE : new n(str, true, null, 4, null);
    }

    public static final Void d(kotlinx.serialization.json.b bVar, String str) {
        throw new IllegalArgumentException("Element " + ck.s.b(bVar.getClass()) + " is not a " + str);
    }

    public static final Boolean e(kotlinx.serialization.json.c cVar) {
        ck.p.j(cVar, "<this>");
        return a1.d(cVar.e());
    }

    public static final String f(kotlinx.serialization.json.c cVar) {
        ck.p.j(cVar, "<this>");
        if (cVar instanceof JsonNull) {
            return null;
        }
        return cVar.e();
    }

    public static final double g(kotlinx.serialization.json.c cVar) {
        ck.p.j(cVar, "<this>");
        return Double.parseDouble(cVar.e());
    }

    public static final Double h(kotlinx.serialization.json.c cVar) {
        ck.p.j(cVar, "<this>");
        return lk.v.o(cVar.e());
    }

    public static final float i(kotlinx.serialization.json.c cVar) {
        ck.p.j(cVar, "<this>");
        return Float.parseFloat(cVar.e());
    }

    public static final int j(kotlinx.serialization.json.c cVar) {
        ck.p.j(cVar, "<this>");
        return Integer.parseInt(cVar.e());
    }

    public static final JsonObject k(kotlinx.serialization.json.b bVar) {
        ck.p.j(bVar, "<this>");
        JsonObject jsonObject = bVar instanceof JsonObject ? (JsonObject) bVar : null;
        if (jsonObject != null) {
            return jsonObject;
        }
        d(bVar, "JsonObject");
        throw new KotlinNothingValueException();
    }

    public static final kotlinx.serialization.json.c l(kotlinx.serialization.json.b bVar) {
        ck.p.j(bVar, "<this>");
        kotlinx.serialization.json.c cVar = bVar instanceof kotlinx.serialization.json.c ? (kotlinx.serialization.json.c) bVar : null;
        if (cVar != null) {
            return cVar;
        }
        d(bVar, "JsonPrimitive");
        throw new KotlinNothingValueException();
    }

    public static final kotlinx.serialization.descriptors.a m() {
        return f6110a;
    }

    public static final long n(kotlinx.serialization.json.c cVar) {
        ck.p.j(cVar, "<this>");
        return Long.parseLong(cVar.e());
    }

    public static final Long o(kotlinx.serialization.json.c cVar) {
        ck.p.j(cVar, "<this>");
        return lk.w.t(cVar.e());
    }
}
