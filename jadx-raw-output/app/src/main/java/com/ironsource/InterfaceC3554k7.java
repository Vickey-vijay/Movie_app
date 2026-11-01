package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.k7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC3554k7 {

    /* JADX INFO: renamed from: com.ironsource.k7$a */
    public interface a extends InterfaceC3554k7 {

        /* JADX INFO: renamed from: com.ironsource.k7$a$a, reason: collision with other inner class name */
        public static final class C0275a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Exception f29339a;

            public final C0275a a(Exception exc) {
                ck.p.j(exc, "exception");
                return new C0275a(exc);
            }

            @Override // com.ironsource.InterfaceC3554k7.a
            public boolean b() {
                return true;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0275a) && ck.p.e(this.f29339a, ((C0275a) obj).f29339a);
            }

            public C0275a(Exception exc) {
                ck.p.j(exc, "exception");
                this.f29339a = exc;
            }

            public static /* synthetic */ C0275a a(C0275a c0275a, Exception exc, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    exc = c0275a.f29339a;
                }
                return c0275a.a(exc);
            }

            public final Exception c() {
                return this.f29339a;
            }

            public final Exception d() {
                return this.f29339a;
            }

            public int hashCode() {
                return this.f29339a.hashCode();
            }

            public String toString() {
                return "Exception(exception=" + this.f29339a + ")";
            }

            @Override // com.ironsource.InterfaceC3554k7.a
            public String a() {
                String message = this.f29339a.getMessage();
                if (message == null) {
                    message = "No message";
                }
                return "Exception - " + message;
            }
        }

        /* JADX INFO: renamed from: com.ironsource.k7$a$b */
        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f29340a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f29341b;

            public final b a(int i10, String str) {
                return new b(i10, str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.f29340a == bVar.f29340a && ck.p.e(this.f29341b, bVar.f29341b);
            }

            public static /* synthetic */ b a(b bVar, int i10, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    i10 = bVar.f29340a;
                }
                if ((i11 & 2) != 0) {
                    str = bVar.f29341b;
                }
                return bVar.a(i10, str);
            }

            @Override // com.ironsource.InterfaceC3554k7.a
            public boolean b() {
                return this.f29340a != 400;
            }

            public final int c() {
                return this.f29340a;
            }

            public final String d() {
                return this.f29341b;
            }

            public final int e() {
                return this.f29340a;
            }

            public final String f() {
                return this.f29341b;
            }

            public int hashCode() {
                int iHashCode = Integer.hashCode(this.f29340a) * 31;
                String str = this.f29341b;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "HttpError(errorCode=" + this.f29340a + ", errorMessage=" + this.f29341b + ")";
            }

            public b(int i10, String str) {
                this.f29340a = i10;
                this.f29341b = str;
            }

            @Override // com.ironsource.InterfaceC3554k7.a
            public String a() {
                int i10 = this.f29340a;
                String str = this.f29341b;
                if (str == null) {
                    str = "Unknown";
                }
                return "HTTP Error - Code: " + i10 + ", Message: " + str;
            }
        }

        /* JADX INFO: renamed from: com.ironsource.k7$a$c */
        public static final class c implements a {
            @Override // com.ironsource.InterfaceC3554k7.a
            public String a() {
                return "Parse Error - Unable to parse the response";
            }

            @Override // com.ironsource.InterfaceC3554k7.a
            public boolean b() {
                return true;
            }
        }

        String a();

        boolean b();
    }

    /* JADX INFO: renamed from: com.ironsource.k7$b */
    public static final class b implements InterfaceC3554k7 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f29342a;

        public final b a(String str) {
            ck.p.j(str, "response");
            return new b(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && ck.p.e(this.f29342a, ((b) obj).f29342a);
        }

        public b(String str) {
            ck.p.j(str, "response");
            this.f29342a = str;
        }

        public static /* synthetic */ b a(b bVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = bVar.f29342a;
            }
            return bVar.a(str);
        }

        public final String c() {
            return this.f29342a;
        }

        public final String d() {
            return this.f29342a;
        }

        public int hashCode() {
            return this.f29342a.hashCode();
        }

        public String toString() {
            return "Success(response=" + this.f29342a + ")";
        }
    }
}
