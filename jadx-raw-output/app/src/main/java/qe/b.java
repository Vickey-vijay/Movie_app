package qe;

import ck.i;
import ck.p;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: Optional.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class b<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f66572b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f66573c = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f66574a;

    /* JADX INFO: compiled from: Optional.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final <T> b<T> b(T t10) {
            p.j(t10, "value");
            return new b<>(t10, null);
        }

        public final <T> b<T> a() {
            return b.f66573c;
        }
    }

    public b(T t10) {
        this.f66574a = t10;
    }

    public /* synthetic */ b(Object obj, i iVar) {
        this(obj);
    }

    public final T b() {
        T t10 = this.f66574a;
        if (t10 != null) {
            return t10;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean c() {
        return this.f66574a != null;
    }

    public final T d() {
        return this.f66574a;
    }
}
