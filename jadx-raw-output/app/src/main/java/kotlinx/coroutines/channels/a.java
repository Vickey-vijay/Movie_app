package kotlinx.coroutines.channels;

import ck.i;
import ck.p;

/* JADX INFO: compiled from: Channel.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class a<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f63077b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f63078c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f63079a;

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Channel.kt */
    public static final class C0563a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f63080a;

        public boolean equals(Object obj) {
            return (obj instanceof C0563a) && p.e(this.f63080a, ((C0563a) obj).f63080a);
        }

        public int hashCode() {
            Throwable th2 = this.f63080a;
            if (th2 != null) {
                return th2.hashCode();
            }
            return 0;
        }

        @Override // kotlinx.coroutines.channels.a.c
        public String toString() {
            return "Closed(" + this.f63080a + ')';
        }

        public C0563a(Throwable th2) {
            this.f63080a = th2;
        }
    }

    /* JADX INFO: compiled from: Channel.kt */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(i iVar) {
            this();
        }

        public final <E> Object a(Throwable th2) {
            return a.c(new C0563a(th2));
        }

        public final <E> Object b() {
            return a.c(a.f63078c);
        }

        public final <E> Object c(E e10) {
            return a.c(e10);
        }
    }

    /* JADX INFO: compiled from: Channel.kt */
    public static class c {
        public String toString() {
            return "Failed";
        }
    }

    public static final /* synthetic */ a b(Object obj) {
        return new a(obj);
    }

    public static <T> Object c(Object obj) {
        return obj;
    }

    public static boolean d(Object obj, Object obj2) {
        return (obj2 instanceof a) && p.e(obj, ((a) obj2).k());
    }

    public static int g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public boolean equals(Object obj) {
        return d(this.f63079a, obj);
    }

    public int hashCode() {
        return g(this.f63079a);
    }

    public final /* synthetic */ Object k() {
        return this.f63079a;
    }

    public static final Throwable e(Object obj) {
        C0563a c0563a = obj instanceof C0563a ? (C0563a) obj : null;
        if (c0563a != null) {
            return c0563a.f63080a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final T f(Object obj) {
        if (obj instanceof c) {
            return null;
        }
        return obj;
    }

    public static final boolean h(Object obj) {
        return obj instanceof C0563a;
    }

    public static final boolean i(Object obj) {
        return !(obj instanceof c);
    }

    public static String j(Object obj) {
        if (obj instanceof C0563a) {
            return ((C0563a) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public String toString() {
        return j(this.f63079a);
    }

    public /* synthetic */ a(Object obj) {
        this.f63079a = obj;
    }
}
