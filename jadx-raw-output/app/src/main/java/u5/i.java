package u5;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: compiled from: UnsafeAllocator.java */
/* JADX INFO: loaded from: classes11.dex */
public abstract class i {

    /* JADX INFO: compiled from: UnsafeAllocator.java */
    public static class a extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Method f72737a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f72738b;

        public a(Method method, Object obj) {
            this.f72737a = method;
            this.f72738b = obj;
        }

        @Override // u5.i
        public <T> T c(Class<T> cls) throws Exception {
            i.a(cls);
            return (T) this.f72737a.invoke(this.f72738b, cls);
        }
    }

    /* JADX INFO: compiled from: UnsafeAllocator.java */
    public static class b extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Method f72739a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f72740b;

        public b(Method method, int i10) {
            this.f72739a = method;
            this.f72740b = i10;
        }

        @Override // u5.i
        public <T> T c(Class<T> cls) throws Exception {
            i.a(cls);
            return (T) this.f72739a.invoke(null, cls, Integer.valueOf(this.f72740b));
        }
    }

    /* JADX INFO: compiled from: UnsafeAllocator.java */
    public static class c extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Method f72741a;

        public c(Method method) {
            this.f72741a = method;
        }

        @Override // u5.i
        public <T> T c(Class<T> cls) throws Exception {
            i.a(cls);
            return (T) this.f72741a.invoke(null, cls, Object.class);
        }
    }

    /* JADX INFO: compiled from: UnsafeAllocator.java */
    public static class d extends i {
        @Override // u5.i
        public <T> T c(Class<T> cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls);
        }
    }

    public abstract <T> T c(Class<T> cls) throws Exception;

    public static i b() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return new a(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int iIntValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    return new b(declaredMethod2, iIntValue);
                } catch (Exception unused2) {
                    return new d();
                }
            } catch (Exception unused3) {
                Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod3.setAccessible(true);
                return new c(declaredMethod3);
            }
        }
    }

    public static void a(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (!Modifier.isInterface(modifiers)) {
            if (!Modifier.isAbstract(modifiers)) {
                return;
            }
            throw new UnsupportedOperationException("Abstract class can't be instantiated! Class name: " + cls.getName());
        }
        throw new UnsupportedOperationException("Interface can't be instantiated! Interface name: " + cls.getName());
    }
}
