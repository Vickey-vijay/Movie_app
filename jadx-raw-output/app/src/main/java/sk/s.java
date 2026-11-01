package sk;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.sequences.SequencesKt___SequencesKt;
import nk.y1;

/* JADX INFO: compiled from: MainDispatchers.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f71985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f71986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y1 f71987c;

    static {
        s sVar = new s();
        f71985a = sVar;
        f71986b = e0.f("kotlinx.coroutines.fast.service.loader", true);
        f71987c = sVar.a();
    }

    public final y1 a() {
        Object next;
        y1 y1VarE;
        try {
            List<r> listC = f71986b ? i.f71953a.c() : SequencesKt___SequencesKt.T(kk.r.g(ServiceLoader.load(r.class, r.class.getClassLoader()).iterator()));
            Iterator<T> it = listC.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iA = ((r) next).a();
                    do {
                        Object next2 = it.next();
                        int iA2 = ((r) next2).a();
                        if (iA < iA2) {
                            next = next2;
                            iA = iA2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            r rVar = (r) next;
            return (rVar == null || (y1VarE = t.e(rVar, listC)) == null) ? t.b(null, null, 3, null) : y1VarE;
        } catch (Throwable th2) {
            return t.b(th2, null, 2, null);
        }
    }
}
