package nk;

import java.io.Closeable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes10.dex */
public abstract class j1 extends h0 implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f64794b = new a(null);

    /* JADX INFO: compiled from: Executors.kt */
    public static final class a extends kotlin.coroutines.b<h0, j1> {
        public a() {
            super(h0.Key, new bk.l() { // from class: nk.i1
                @Override // bk.l
                public final Object invoke(Object obj) {
                    return j1.a.d((kotlin.coroutines.d.b) obj);
                }
            });
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public static final j1 d(kotlin.coroutines.d.b bVar) {
            if (bVar instanceof j1) {
                return (j1) bVar;
            }
            return null;
        }
    }

    public abstract Executor n();
}
