package lk;

/* JADX INFO: compiled from: Char.kt */
/* JADX INFO: loaded from: classes11.dex */
public class b extends a {
    public static final boolean h(char c10, char c11, boolean z10) {
        if (c10 == c11) {
            return true;
        }
        if (!z10) {
            return false;
        }
        char upperCase = Character.toUpperCase(c10);
        char upperCase2 = Character.toUpperCase(c11);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static final int g(char c10) {
        int iB = a.b(c10, 10);
        if (iB >= 0) {
            return iB;
        }
        throw new IllegalArgumentException("Char " + c10 + " is not a decimal digit");
    }

    public static final String i(char c10) {
        return i0.a(c10);
    }
}
