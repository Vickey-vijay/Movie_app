package ck;

import java.util.List;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference0;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.PropertyReference0;
import kotlin.jvm.internal.PropertyReference1;

/* JADX INFO: compiled from: ReflectionFactory.java */
/* JADX INFO: loaded from: classes6.dex */
public class t {
    public jk.g a(FunctionReference functionReference) {
        return functionReference;
    }

    public jk.n d(jk.n nVar) {
        z zVar = (z) nVar;
        return new z(nVar.h(), nVar.getArguments(), zVar.l(), zVar.k() | 2);
    }

    public jk.i e(MutablePropertyReference0 mutablePropertyReference0) {
        return mutablePropertyReference0;
    }

    public jk.j f(MutablePropertyReference1 mutablePropertyReference1) {
        return mutablePropertyReference1;
    }

    public jk.l g(PropertyReference0 propertyReference0) {
        return propertyReference0;
    }

    public jk.m h(PropertyReference1 propertyReference1) {
        return propertyReference1;
    }

    public jk.c b(Class cls) {
        return new g(cls);
    }

    public jk.f c(Class cls, String str) {
        return new r(cls, str);
    }

    public jk.n k(jk.e eVar, List<jk.o> list, boolean z10) {
        return new z(eVar, list, z10);
    }

    public String i(m mVar) {
        String string = mVar.getClass().getGenericInterfaces()[0].toString();
        if (string.startsWith("kotlin.jvm.functions.")) {
            return string.substring(21);
        }
        return string;
    }

    public String j(Lambda lambda) {
        return i(lambda);
    }
}
