package t9;

import java.util.List;

/* JADX INFO: compiled from: ListUtils.java */
/* JADX INFO: loaded from: classes10.dex */
public class e {
    public static boolean b(List<?> list) {
        return list == null;
    }

    public static boolean a(List<?> list) {
        if (!b(list) && !c(list)) {
            return false;
        }
        return true;
    }

    public static boolean c(List<?> list) {
        if (b(list) || list.size() == 0) {
            return true;
        }
        return false;
    }
}
