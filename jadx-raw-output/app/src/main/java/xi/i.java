package xi;

import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.observers.BlockingObserver;
import io.reactivex.internal.observers.LambdaObserver;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: ObservableBlockingSubscribe.java */
/* JADX INFO: loaded from: classes11.dex */
public final class i {
    public static <T> void a(ii.p<? extends T> pVar) {
        bj.d dVar = new bj.d();
        LambdaObserver lambdaObserver = new LambdaObserver(Functions.g(), dVar, dVar, Functions.g());
        pVar.subscribe(lambdaObserver);
        bj.c.a(dVar, lambdaObserver);
        Throwable th2 = dVar.f5362b;
        if (th2 != null) {
            throw ExceptionHelper.d(th2);
        }
    }

    public static <T> void b(ii.p<? extends T> pVar, ii.r<? super T> rVar) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        BlockingObserver blockingObserver = new BlockingObserver(linkedBlockingQueue);
        rVar.onSubscribe(blockingObserver);
        pVar.subscribe(blockingObserver);
        while (!blockingObserver.isDisposed()) {
            Object objPoll = linkedBlockingQueue.poll();
            if (objPoll == null) {
                try {
                    objPoll = linkedBlockingQueue.take();
                } catch (InterruptedException e10) {
                    blockingObserver.dispose();
                    rVar.onError(e10);
                    return;
                }
            }
            if (blockingObserver.isDisposed() || pVar == BlockingObserver.TERMINATED || NotificationLite.acceptFull(objPoll, rVar)) {
                return;
            }
        }
    }

    public static <T> void c(ii.p<? extends T> pVar, oi.g<? super T> gVar, oi.g<? super Throwable> gVar2, oi.a aVar) {
        qi.a.e(gVar, "onNext is null");
        qi.a.e(gVar2, "onError is null");
        qi.a.e(aVar, "onComplete is null");
        b(pVar, new LambdaObserver(gVar, gVar2, aVar, Functions.g()));
    }
}
