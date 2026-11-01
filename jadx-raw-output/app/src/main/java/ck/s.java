package ck;

import java.util.Arrays;
import java.util.Collections;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference0;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.PropertyReference0;
import kotlin.jvm.internal.PropertyReference1;

/* JADX INFO: compiled from: Reflection.java */
/* JADX INFO: loaded from: classes6.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f6062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final jk.c[] f6063b;

    static {
        t tVar = null;
        try {
            tVar = (t) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (tVar == null) {
            tVar = new t();
        }
        f6062a = tVar;
        f6063b = new jk.c[0];
    }

    public static jk.g a(FunctionReference functionReference) {
        return f6062a.a(functionReference);
    }

    public static jk.c b(Class cls) {
        return f6062a.b(cls);
    }

    public static jk.f c(Class cls) {
        return f6062a.c(cls, "");
    }

    public static jk.n d(jk.n nVar) {
        return f6062a.d(nVar);
    }

    public static jk.i e(MutablePropertyReference0 mutablePropertyReference0) {
        return f6062a.e(mutablePropertyReference0);
    }

    public static jk.j f(MutablePropertyReference1 mutablePropertyReference1) {
        return f6062a.f(mutablePropertyReference1);
    }

    public static jk.n g(Class cls) {
        return f6062a.k(b(cls), Collections.emptyList(), true);
    }

    public static jk.l h(PropertyReference0 propertyReference0) {
        return f6062a.g(propertyReference0);
    }

    public static jk.m i(PropertyReference1 propertyReference1) {
        return f6062a.h(propertyReference1);
    }

    public static String j(m mVar) {
        return f6062a.i(mVar);
    }

    public static String k(Lambda lambda) {
        return f6062a.j(lambda);
    }

    public static jk.n l(Class cls) {
        return f6062a.k(b(cls), Collections.emptyList(), false);
    }

    public static jk.n m(Class cls, jk.o oVar) {
        return f6062a.k(b(cls), Collections.singletonList(oVar), false);
    }

    public static jk.n n(Class cls, jk.o oVar, jk.o oVar2) {
        return f6062a.k(b(cls), Arrays.asList(oVar, oVar2), false);
    }
}
