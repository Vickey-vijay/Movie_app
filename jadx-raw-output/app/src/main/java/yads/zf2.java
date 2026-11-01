package yads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class zf2 extends Lambda implements bk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zf2 f85380b = new zf2();

    public zf2() {
        super(0);
    }

    @Override // bk.a
    public final Object invoke() {
        Object next;
        Iterator<E> it = yf2.f84934d.iterator();
        while (it.hasNext()) {
            next = it.next();
            List list = ((yf2) next).f84935b;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    try {
                        Class.forName((String) it2.next());
                        return (yf2) next;
                    } catch (ClassNotFoundException unused) {
                    } catch (Throwable unused2) {
                        boolean z10 = ad1.f75480a;
                    }
                }
            }
        }
        next = null;
        return (yf2) next;
    }
}
