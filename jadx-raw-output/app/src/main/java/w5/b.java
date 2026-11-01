package w5;

import java.lang.reflect.AccessibleObject;

/* JADX INFO: compiled from: ReflectionAccessor.java */
/* JADX INFO: loaded from: classes8.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f73509a;

    public abstract void b(AccessibleObject accessibleObject);

    public static b a() {
        return f73509a;
    }

    static {
        b cVar;
        if (u5.c.c() < 9) {
            cVar = new a();
        } else {
            cVar = new c();
        }
        f73509a = cVar;
    }
}
