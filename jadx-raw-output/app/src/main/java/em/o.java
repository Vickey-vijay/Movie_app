package em;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: StringUtils.java */
/* JADX INFO: loaded from: classes11.dex */
public class o {
    public static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        int length;
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || (length = charSequence.length()) != charSequence2.length()) {
            return false;
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return charSequence.equals(charSequence2);
        }
        for (int i10 = 0; i10 < length; i10++) {
            if (charSequence.charAt(i10) != charSequence2.charAt(i10)) {
                return false;
            }
        }
        return true;
    }

    public static String d(@Nullable String str) {
        return str == null ? "" : str;
    }

    public static boolean b(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static boolean e(@Nullable String str) {
        return str == null || str.isEmpty();
    }

    public static boolean c(@Nullable String str) {
        return e(str);
    }
}
