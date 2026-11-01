package yj;

import ck.p;
import java.io.File;

/* JADX INFO: compiled from: Exceptions.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class c {
    public static final String b(File file, File file2, String str) {
        StringBuilder sb2 = new StringBuilder(file.toString());
        if (file2 != null) {
            sb2.append(" -> " + file2);
        }
        if (str != null) {
            sb2.append(": " + str);
        }
        String string = sb2.toString();
        p.i(string, "toString(...)");
        return string;
    }
}
