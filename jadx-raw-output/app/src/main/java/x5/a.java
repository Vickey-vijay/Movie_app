package x5;

import com.google.gson.internal.C$Gson$Types;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: TypeToken.java */
/* JADX INFO: loaded from: classes9.dex */
public class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<? super T> f74362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f74363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f74364c;

    public a() {
        Type typeD = d(getClass());
        this.f74363b = typeD;
        this.f74362a = (Class<? super T>) C$Gson$Types.k(typeD);
        this.f74364c = typeD.hashCode();
    }

    public static <T> a<T> a(Class<T> cls) {
        return new a<>(cls);
    }

    public static a<?> b(Type type) {
        return new a<>(type);
    }

    public final Class<? super T> c() {
        return this.f74362a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && C$Gson$Types.f(this.f74363b, ((a) obj).f74363b);
    }

    public final Type getType() {
        return this.f74363b;
    }

    public final int hashCode() {
        return this.f74364c;
    }

    public final String toString() {
        return C$Gson$Types.u(this.f74363b);
    }

    public static Type d(Class<?> cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            return C$Gson$Types.b(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        }
        throw new RuntimeException("Missing type parameter.");
    }

    public a(Type type) {
        Type typeB = C$Gson$Types.b((Type) u5.a.b(type));
        this.f74363b = typeB;
        this.f74362a = (Class<? super T>) C$Gson$Types.k(typeB);
        this.f74364c = typeB.hashCode();
    }
}
