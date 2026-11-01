package m5;

/* JADX INFO: compiled from: CharMatcher.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class b implements m<Character> {

    /* JADX INFO: compiled from: CharMatcher.java */
    public static abstract class a extends b {
        @Override // m5.m
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.b(ch2);
        }
    }

    /* JADX INFO: renamed from: m5.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CharMatcher.java */
    public static final class C0581b extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final char f64114b;

        @Override // m5.b
        public boolean e(char c10) {
            return c10 == this.f64114b;
        }

        public String toString() {
            return "CharMatcher.is('" + b.g(this.f64114b) + "')";
        }

        public C0581b(char c10) {
            this.f64114b = c10;
        }
    }

    /* JADX INFO: compiled from: CharMatcher.java */
    public static abstract class c extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f64115b;

        public final String toString() {
            return this.f64115b;
        }

        public c(String str) {
            this.f64115b = (String) l.m(str);
        }
    }

    /* JADX INFO: compiled from: CharMatcher.java */
    public static final class d extends c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f64116c = new d();

        @Override // m5.b
        public boolean e(char c10) {
            return false;
        }

        public d() {
            super("CharMatcher.none()");
        }

        @Override // m5.b
        public int c(CharSequence charSequence, int i10) {
            l.o(i10, charSequence.length());
            return -1;
        }
    }

    public static String g(char c10) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(c10 & 15);
            c10 = (char) (c10 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public abstract boolean e(char c10);

    public static b d(char c10) {
        return new C0581b(c10);
    }

    public static b f() {
        return d.f64116c;
    }

    @Deprecated
    public boolean b(Character ch2) {
        return e(ch2.charValue());
    }

    public int c(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        l.o(i10, length);
        while (i10 < length) {
            if (e(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }
}
