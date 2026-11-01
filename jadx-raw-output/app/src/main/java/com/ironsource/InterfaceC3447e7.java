package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.e7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3447e7 {

    /* JADX INFO: renamed from: com.ironsource.e7$a */
    public static final class a implements InterfaceC3447e7 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC3393b7 f28741a;

        public final InterfaceC3393b7 a() {
            return this.f28741a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && ck.p.e(this.f28741a, ((a) obj).f28741a);
        }

        public a(InterfaceC3393b7 interfaceC3393b7) {
            ck.p.j(interfaceC3393b7, "failure");
            this.f28741a = interfaceC3393b7;
        }

        public final a a(InterfaceC3393b7 interfaceC3393b7) {
            ck.p.j(interfaceC3393b7, "failure");
            return new a(interfaceC3393b7);
        }

        public final InterfaceC3393b7 b() {
            return this.f28741a;
        }

        public int hashCode() {
            return this.f28741a.hashCode();
        }

        public String toString() {
            return "Failure(failure=" + this.f28741a + ")";
        }

        public static /* synthetic */ a a(a aVar, InterfaceC3393b7 interfaceC3393b7, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                interfaceC3393b7 = aVar.f28741a;
            }
            return aVar.a(interfaceC3393b7);
        }

        @Override // com.ironsource.InterfaceC3447e7
        public void a(InterfaceC3465f7 interfaceC3465f7) {
            ck.p.j(interfaceC3465f7, "handler");
            interfaceC3465f7.a(this.f28741a);
        }
    }

    default void a(InterfaceC3465f7 interfaceC3465f7) {
        ck.p.j(interfaceC3465f7, "handler");
    }
}
