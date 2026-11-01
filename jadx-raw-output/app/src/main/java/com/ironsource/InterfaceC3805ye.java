package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.ye, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC3805ye {

    /* JADX INFO: renamed from: com.ironsource.ye$a */
    public static final class a implements InterfaceC3805ye {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C3617ne f31668a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f31669b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f31670c;

        public a(C3617ne c3617ne, String str, String str2) {
            ck.p.j(c3617ne, "error");
            this.f31668a = c3617ne;
            this.f31669b = str;
            this.f31670c = str2;
        }

        public final C3617ne a() {
            return this.f31668a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return ck.p.e(this.f31668a, aVar.f31668a) && ck.p.e(this.f31669b, aVar.f31669b) && ck.p.e(this.f31670c, aVar.f31670c);
        }

        public /* synthetic */ a(C3617ne c3617ne, String str, String str2, int i10, ck.i iVar) {
            this(c3617ne, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2);
        }

        public final a a(C3617ne c3617ne, String str, String str2) {
            ck.p.j(c3617ne, "error");
            return new a(c3617ne, str, str2);
        }

        public final String b() {
            return this.f31669b;
        }

        public final String c() {
            return this.f31670c;
        }

        public final C3617ne d() {
            return this.f31668a;
        }

        public final String e() {
            return this.f31670c;
        }

        public final String f() {
            return this.f31669b;
        }

        public int hashCode() {
            int iHashCode = this.f31668a.hashCode() * 31;
            String str = this.f31669b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f31670c;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Failure(error=" + this.f31668a + ", url=" + this.f31669b + ", json=" + this.f31670c + ")";
        }

        public static /* synthetic */ a a(a aVar, C3617ne c3617ne, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                c3617ne = aVar.f31668a;
            }
            if ((i10 & 2) != 0) {
                str = aVar.f31669b;
            }
            if ((i10 & 4) != 0) {
                str2 = aVar.f31670c;
            }
            return aVar.a(c3617ne, str, str2);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.ye$b */
    public static final class b implements InterfaceC3805ye {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C3737ue f31671a;

        public final C3737ue a() {
            return this.f31671a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && ck.p.e(this.f31671a, ((b) obj).f31671a);
        }

        public b(C3737ue c3737ue) {
            ck.p.j(c3737ue, "sdkInitResponse");
            this.f31671a = c3737ue;
        }

        public final b a(C3737ue c3737ue) {
            ck.p.j(c3737ue, "sdkInitResponse");
            return new b(c3737ue);
        }

        public final C3737ue b() {
            return this.f31671a;
        }

        public int hashCode() {
            return this.f31671a.hashCode();
        }

        public String toString() {
            return "Success(sdkInitResponse=" + this.f31671a + ")";
        }

        public static /* synthetic */ b a(b bVar, C3737ue c3737ue, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                c3737ue = bVar.f31671a;
            }
            return bVar.a(c3737ue);
        }
    }
}
