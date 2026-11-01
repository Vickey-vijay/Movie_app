package xn;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: GetterStateVariableAccessor.java */
/* JADX INFO: loaded from: classes8.dex */
public class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Method f75074a;

    public Method d() {
        return this.f75074a;
    }

    @Override // xn.c
    public String toString() {
        return super.toString() + " Method: " + d();
    }

    public b(Method method) {
        this.f75074a = method;
    }

    @Override // xn.c
    public Class<?> a() {
        return d().getReturnType();
    }

    @Override // xn.c
    public Object b(Object obj) throws Exception {
        return so.d.k(d(), obj, new Object[0]);
    }
}
