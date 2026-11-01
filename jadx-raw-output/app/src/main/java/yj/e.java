package yj;

import ck.p;
import java.io.File;
import lk.a0;

/* JADX INFO: compiled from: FilePathComponents.kt */
/* JADX INFO: loaded from: classes10.dex */
public class e {
    public static final int a(String str) {
        int iK0;
        int iK1 = a0.k0(str, File.separatorChar, 0, false, 4, null);
        if (iK1 != 0) {
            if (iK1 > 0 && str.charAt(iK1 - 1) == ':') {
                return iK1 + 1;
            }
            if (iK1 == -1 && a0.c0(str, ':', false, 2, null)) {
                return str.length();
            }
            return 0;
        }
        if (str.length() > 1) {
            char cCharAt = str.charAt(1);
            char c10 = File.separatorChar;
            if (cCharAt == c10 && (iK0 = a0.k0(str, c10, 2, false, 4, null)) >= 0) {
                int iK2 = a0.k0(str, File.separatorChar, iK0 + 1, false, 4, null);
                return iK2 >= 0 ? iK2 + 1 : str.length();
            }
        }
        return 1;
    }

    public static final boolean b(File file) {
        p.j(file, "<this>");
        String path = file.getPath();
        p.i(path, "getPath(...)");
        return a(path) > 0;
    }
}
