package yads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public final class d00 {
    public static e00 a(String str) {
        Object next;
        Iterator<E> it = e00.f76867l.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (ck.p.e(((e00) next).f76868b, str)) {
                return (e00) next;
            }
        }
        next = null;
        return (e00) next;
    }
}
