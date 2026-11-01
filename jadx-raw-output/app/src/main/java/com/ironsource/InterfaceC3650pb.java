package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: renamed from: com.ironsource.pb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC3650pb<T> {

    /* JADX INFO: renamed from: com.ironsource.pb$a */
    public static final class a<T> implements InterfaceC3650pb<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final IronSourceError f30456a;

        public final IronSourceError a() {
            return this.f30456a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && ck.p.e(this.f30456a, ((a) obj).f30456a);
        }

        public a(IronSourceError ironSourceError) {
            ck.p.j(ironSourceError, "error");
            this.f30456a = ironSourceError;
        }

        public final a<T> a(IronSourceError ironSourceError) {
            ck.p.j(ironSourceError, "error");
            return new a<>(ironSourceError);
        }

        public final IronSourceError b() {
            return this.f30456a;
        }

        public int hashCode() {
            return this.f30456a.hashCode();
        }

        public String toString() {
            return "Failure(error=" + this.f30456a + ")";
        }

        public static /* synthetic */ a a(a aVar, IronSourceError ironSourceError, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                ironSourceError = aVar.f30456a;
            }
            return aVar.a(ironSourceError);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.pb$b */
    public static final class b<T> implements InterfaceC3650pb<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final T f30457a;

        public final T a() {
            return this.f30457a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && ck.p.e(this.f30457a, ((b) obj).f30457a);
        }

        public final b<T> a(T t10) {
            return new b<>(t10);
        }

        public final T b() {
            return this.f30457a;
        }

        public int hashCode() {
            T t10 = this.f30457a;
            if (t10 == null) {
                return 0;
            }
            return t10.hashCode();
        }

        public String toString() {
            return "Success(value=" + this.f30457a + ")";
        }

        public b(T t10) {
            this.f30457a = t10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b a(b bVar, Object obj, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                obj = bVar.f30457a;
            }
            return bVar.a(obj);
        }
    }
}
