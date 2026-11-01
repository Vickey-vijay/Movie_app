package kk;

import java.util.Iterator;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

/* JADX INFO: compiled from: SequenceBuilder.kt */
/* JADX INFO: loaded from: classes5.dex */
public class l {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Sequences.kt */
    public static final class a<T> implements i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ bk.p f62864a;

        public a(bk.p pVar) {
            this.f62864a = pVar;
        }

        @Override // kk.i
        public Iterator<T> iterator() {
            return l.a(this.f62864a);
        }
    }

    public static final <T> Iterator<T> a(bk.p<? super k<? super T>, ? super rj.c<? super mj.r>, ? extends Object> pVar) {
        ck.p.j(pVar, "block");
        j jVar = new j();
        jVar.h(IntrinsicsKt__IntrinsicsJvmKt.a(pVar, jVar, jVar));
        return jVar;
    }

    public static final <T> i<T> b(bk.p<? super k<? super T>, ? super rj.c<? super mj.r>, ? extends Object> pVar) {
        ck.p.j(pVar, "block");
        return new a(pVar);
    }
}
