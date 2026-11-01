package j9;

import t9.b;

/* JADX INFO: compiled from: ExceptionUtils.java */
/* JADX INFO: loaded from: classes6.dex */
public class a {
    public static void a(Class<?> cls, String str) {
        try {
            throw new IllegalArgumentException("classs name:" + cls.getName() + ":--->" + str);
        } catch (Exception e10) {
            e10.printStackTrace();
            b.c(e10.toString());
        }
    }
}
