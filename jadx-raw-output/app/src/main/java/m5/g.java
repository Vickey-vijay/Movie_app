package m5;

import com.google.common.base.Optional;
import com.ironsource.G5;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: compiled from: MoreObjects.java */
/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: compiled from: MoreObjects.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f64124a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C0582b f64125b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public C0582b f64126c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f64127d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f64128e;

        /* JADX INFO: compiled from: MoreObjects.java */
        public static final class a extends C0582b {
            public a() {
            }
        }

        /* JADX INFO: renamed from: m5.g$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: MoreObjects.java */
        public static class C0582b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public String f64129a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Object f64130b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public C0582b f64131c;
        }

        public b(String str) {
            C0582b c0582b = new C0582b();
            this.f64125b = c0582b;
            this.f64126c = c0582b;
            this.f64127d = false;
            this.f64128e = false;
            this.f64124a = (String) l.m(str);
        }

        public static boolean i(Object obj) {
            if (obj instanceof CharSequence) {
                return ((CharSequence) obj).length() == 0;
            }
            if (obj instanceof Collection) {
                return ((Collection) obj).isEmpty();
            }
            if (obj instanceof Map) {
                return ((Map) obj).isEmpty();
            }
            if (obj instanceof Optional) {
                return !((Optional) obj).isPresent();
            }
            return obj.getClass().isArray() && Array.getLength(obj) == 0;
        }

        public final C0582b c() {
            C0582b c0582b = new C0582b();
            this.f64126c.f64131c = c0582b;
            this.f64126c = c0582b;
            return c0582b;
        }

        public final a f() {
            a aVar = new a();
            this.f64126c.f64131c = aVar;
            this.f64126c = aVar;
            return aVar;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0030  */
        /* JADX WARN: Code duplicated, block: B:14:0x0037  */
        /* JADX WARN: Code duplicated, block: B:16:0x0041  */
        /* JADX WARN: Code duplicated, block: B:19:0x005e  */
        public String toString() {
            String str;
            boolean z10 = this.f64127d;
            boolean z11 = this.f64128e;
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(this.f64124a);
            sb2.append('{');
            String str2 = "";
            for (C0582b c0582b = this.f64125b.f64131c; c0582b != null; c0582b = c0582b.f64131c) {
                Object obj = c0582b.f64130b;
                if (c0582b instanceof a) {
                    sb2.append(str2);
                    str = c0582b.f64129a;
                    if (str != null) {
                        sb2.append(str);
                        sb2.append(G5.T);
                    }
                    if (obj == null && obj.getClass().isArray()) {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    } else {
                        sb2.append(obj);
                    }
                    str2 = ", ";
                } else if (obj == null) {
                    if (!z10) {
                        sb2.append(str2);
                        str = c0582b.f64129a;
                        if (str != null) {
                            sb2.append(str);
                            sb2.append(G5.T);
                        }
                        if (obj == null) {
                            sb2.append(obj);
                        } else {
                            sb2.append(obj);
                        }
                        str2 = ", ";
                    }
                } else if (!z11 || !i(obj)) {
                    sb2.append(str2);
                    str = c0582b.f64129a;
                    if (str != null) {
                        sb2.append(str);
                        sb2.append(G5.T);
                    }
                    if (obj == null) {
                        sb2.append(obj);
                    } else {
                        sb2.append(obj);
                    }
                    str2 = ", ";
                }
            }
            sb2.append('}');
            return sb2.toString();
        }

        public b a(String str, int i10) {
            return g(str, String.valueOf(i10));
        }

        public b b(String str, Object obj) {
            return e(str, obj);
        }

        public final b d(Object obj) {
            c().f64130b = obj;
            return this;
        }

        public final b e(String str, Object obj) {
            C0582b c0582bC = c();
            c0582bC.f64130b = obj;
            c0582bC.f64129a = (String) l.m(str);
            return this;
        }

        public final b g(String str, Object obj) {
            a aVarF = f();
            aVarF.f64130b = obj;
            aVarF.f64129a = (String) l.m(str);
            return this;
        }

        public b h(Object obj) {
            return d(obj);
        }
    }

    public static <T> T a(T t10, T t11) {
        if (t10 != null) {
            return t10;
        }
        if (t11 != null) {
            return t11;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static b b(Object obj) {
        return new b(obj.getClass().getSimpleName());
    }
}
