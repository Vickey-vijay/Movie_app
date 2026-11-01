package tj;

import ck.p;
import java.lang.reflect.Method;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;

/* JADX INFO: compiled from: DebugMetadata.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f72421a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f72422b = new a(null, null, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static a f72423c;

    /* JADX INFO: compiled from: DebugMetadata.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f72424a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f72425b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Method f72426c;

        public a(Method method, Method method2, Method method3) {
            this.f72424a = method;
            this.f72425b = method2;
            this.f72426c = method3;
        }
    }

    public final a a(BaseContinuationImpl baseContinuationImpl) {
        try {
            a aVar = new a(Class.class.getDeclaredMethod("getModule", new Class[0]), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            f72423c = aVar;
            return aVar;
        } catch (Exception unused) {
            a aVar2 = f72422b;
            f72423c = aVar2;
            return aVar2;
        }
    }

    public final String b(BaseContinuationImpl baseContinuationImpl) {
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        p.j(baseContinuationImpl, "continuation");
        a aVarA = f72423c;
        if (aVarA == null) {
            aVarA = a(baseContinuationImpl);
        }
        if (aVarA == f72422b || (method = aVarA.f72424a) == null || (objInvoke = method.invoke(baseContinuationImpl.getClass(), new Object[0])) == null || (method2 = aVarA.f72425b) == null || (objInvoke2 = method2.invoke(objInvoke, new Object[0])) == null) {
            return null;
        }
        Method method3 = aVarA.f72426c;
        Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, new Object[0]) : null;
        if (objInvoke3 instanceof String) {
            return (String) objInvoke3;
        }
        return null;
    }
}
