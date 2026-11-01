package xn;

import java.lang.reflect.Field;

/* JADX INFO: compiled from: FieldStateVariableAccessor.java */
/* JADX INFO: loaded from: classes8.dex */
public class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Field f75073a;

    @Override // xn.c
    public Object b(Object obj) throws Exception {
        return so.d.b(this.f75073a, obj);
    }

    public Field d() {
        return this.f75073a;
    }

    @Override // xn.c
    public String toString() {
        return super.toString() + " Field: " + d();
    }

    public a(Field field) {
        this.f75073a = field;
    }

    @Override // xn.c
    public Class<?> a() {
        return d().getType();
    }
}
