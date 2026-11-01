package w5;

import com.google.gson.JsonIOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: UnsafeReflectionAccessor.java */
/* JADX INFO: loaded from: classes8.dex */
public final class c extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Class f73510d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f73511b = d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f73512c = c();

    public static Object d() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f73510d = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Field c() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    public boolean e(AccessibleObject accessibleObject) {
        if (this.f73511b != null && this.f73512c != null) {
            try {
                f73510d.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(this.f73511b, accessibleObject, Long.valueOf(((Long) f73510d.getMethod("objectFieldOffset", Field.class).invoke(this.f73511b, this.f73512c)).longValue()), Boolean.TRUE);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // w5.b
    public void b(AccessibleObject accessibleObject) {
        if (!e(accessibleObject)) {
            try {
                accessibleObject.setAccessible(true);
            } catch (SecurityException e10) {
                throw new JsonIOException("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e10);
            }
        }
    }
}
