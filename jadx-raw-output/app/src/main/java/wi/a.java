package wi;

import a.h;
import ii.b;
import ii.c;
import ii.i;
import ii.r;
import ii.v;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.operators.maybe.MaybeToObservable;
import io.reactivex.internal.operators.single.SingleToObservable;
import java.util.concurrent.Callable;
import oi.o;

/* JADX INFO: compiled from: ScalarXMapZHelper.java */
/* JADX INFO: loaded from: classes11.dex */
public final class a {
    public static <T> boolean a(Object obj, o<? super T, ? extends c> oVar, b bVar) {
        if (!(obj instanceof Callable)) {
            return false;
        }
        try {
            h hVar = (Object) ((Callable) obj).call();
            c cVar = hVar != null ? (c) qi.a.e(oVar.apply(hVar), "The mapper returned a null CompletableSource") : null;
            if (cVar == null) {
                EmptyDisposable.complete(bVar);
            } else {
                cVar.b(bVar);
            }
            return true;
        } catch (Throwable th2) {
            ni.a.b(th2);
            EmptyDisposable.error(th2, bVar);
            return true;
        }
    }

    public static <T, R> boolean b(Object obj, o<? super T, ? extends i<? extends R>> oVar, r<? super R> rVar) {
        if (!(obj instanceof Callable)) {
            return false;
        }
        try {
            h hVar = (Object) ((Callable) obj).call();
            i iVar = hVar != null ? (i) qi.a.e(oVar.apply(hVar), "The mapper returned a null MaybeSource") : null;
            if (iVar == null) {
                EmptyDisposable.complete(rVar);
            } else {
                iVar.b(MaybeToObservable.b(rVar));
            }
            return true;
        } catch (Throwable th2) {
            ni.a.b(th2);
            EmptyDisposable.error(th2, rVar);
            return true;
        }
    }

    public static <T, R> boolean c(Object obj, o<? super T, ? extends v<? extends R>> oVar, r<? super R> rVar) {
        if (!(obj instanceof Callable)) {
            return false;
        }
        try {
            h hVar = (Object) ((Callable) obj).call();
            v vVar = hVar != null ? (v) qi.a.e(oVar.apply(hVar), "The mapper returned a null SingleSource") : null;
            if (vVar == null) {
                EmptyDisposable.complete(rVar);
            } else {
                vVar.b(SingleToObservable.b(rVar));
            }
            return true;
        } catch (Throwable th2) {
            ni.a.b(th2);
            EmptyDisposable.error(th2, rVar);
            return true;
        }
    }
}
