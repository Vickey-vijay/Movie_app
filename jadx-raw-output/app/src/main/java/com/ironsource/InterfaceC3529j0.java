package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC3529j0 {

    /* JADX INFO: renamed from: com.ironsource.j0$a */
    public static final class a implements InterfaceC3529j0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0272a f29178c = new C0272a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f29179a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f29180b;

        /* JADX INFO: renamed from: com.ironsource.j0$a$a, reason: collision with other inner class name */
        public static final class C0272a {
            public /* synthetic */ C0272a(ck.i iVar) {
                this();
            }

            private C0272a() {
            }

            public final a a(String str) {
                return new a(str);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final a a(String str) {
            return new a(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && ck.p.e(this.f29179a, ((a) obj).f29179a);
        }

        public a(String str) {
            this.f29179a = str;
        }

        public static /* synthetic */ a a(a aVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = aVar.f29179a;
            }
            return aVar.a(str);
        }

        public final String b() {
            return this.f29179a;
        }

        public final String c() {
            return this.f29179a;
        }

        public int hashCode() {
            String str = this.f29179a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "NotReady(reason=" + this.f29179a + ")";
        }

        public /* synthetic */ a(String str, int i10, ck.i iVar) {
            this((i10 & 1) != 0 ? null : str);
        }

        @Override // com.ironsource.InterfaceC3529j0
        public boolean a() {
            return this.f29180b;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.j0$b */
    public static final class b implements InterfaceC3529j0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f29181a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final boolean f29182b = true;

        @Override // com.ironsource.InterfaceC3529j0
        public boolean a() {
            return f29182b;
        }

        private b() {
        }
    }

    boolean a();
}
