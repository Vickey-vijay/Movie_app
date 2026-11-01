package el;

import bk.l;
import ck.p;
import java.util.List;

/* JADX INFO: compiled from: SerializersModule.kt */
/* JADX INFO: loaded from: classes11.dex */
public abstract class a {

    /* JADX INFO: renamed from: el.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SerializersModule.kt */
    public static final class C0466a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xk.b<?> f52657a;

        @Override // el.a
        public xk.b<?> a(List<? extends xk.b<?>> list) {
            p.j(list, "typeArgumentsSerializers");
            return this.f52657a;
        }

        public final xk.b<?> b() {
            return this.f52657a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C0466a) && p.e(((C0466a) obj).f52657a, this.f52657a);
        }

        public int hashCode() {
            return this.f52657a.hashCode();
        }
    }

    /* JADX INFO: compiled from: SerializersModule.kt */
    public static final class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l<List<? extends xk.b<?>>, xk.b<?>> f52658a;

        @Override // el.a
        public xk.b<?> a(List<? extends xk.b<?>> list) {
            p.j(list, "typeArgumentsSerializers");
            return this.f52658a.invoke(list);
        }

        public final l<List<? extends xk.b<?>>, xk.b<?>> b() {
            return this.f52658a;
        }
    }

    public abstract xk.b<?> a(List<? extends xk.b<?>> list);
}
