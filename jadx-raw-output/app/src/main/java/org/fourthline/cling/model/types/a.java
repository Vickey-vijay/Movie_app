package org.fourthline.cling.model.types;

import java.lang.reflect.ParameterizedType;
import yn.f;

/* JADX INFO: compiled from: AbstractDatatype.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a<V> implements Datatype<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Datatype.Builtin f65801a;

    @Override // org.fourthline.cling.model.types.Datatype
    public String a() {
        if (this instanceof f) {
            return ((f) this).h();
        }
        return b() != null ? b().getDescriptorName() : f().getSimpleName();
    }

    @Override // org.fourthline.cling.model.types.Datatype
    public Datatype.Builtin b() {
        return this.f65801a;
    }

    @Override // org.fourthline.cling.model.types.Datatype
    public String e(V v10) throws InvalidValueException {
        if (v10 == null) {
            return "";
        }
        if (isValid(v10)) {
            return v10.toString();
        }
        throw new InvalidValueException("Value is not valid: " + v10);
    }

    public void g(Datatype.Builtin builtin) {
        this.f65801a = builtin;
    }

    @Override // org.fourthline.cling.model.types.Datatype
    public boolean isValid(V v10) {
        return v10 == null || f().isAssignableFrom(v10.getClass());
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ")";
    }

    @Override // org.fourthline.cling.model.types.Datatype
    public boolean d(Class cls) {
        return f().isAssignableFrom(cls);
    }

    public Class<V> f() {
        return (Class) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }
}
