package bj;

import ii.r;
import io.reactivex.internal.queue.SpscArrayQueue;

/* JADX INFO: compiled from: QueueDrainHelper.java */
/* JADX INFO: loaded from: classes9.dex */
public final class k {
    public static <T, U> void c(ri.g<T> gVar, r<? super U> rVar, boolean z10, mi.b bVar, h<T, U> hVar) {
        int iD = 1;
        while (!a(hVar.e(), gVar.isEmpty(), rVar, z10, gVar, bVar, hVar)) {
            while (true) {
                boolean zE = hVar.e();
                T tPoll = gVar.poll();
                boolean z11 = tPoll == null;
                if (a(zE, z11, rVar, z10, gVar, bVar, hVar)) {
                    return;
                }
                if (z11) {
                    break;
                } else {
                    hVar.a(rVar, tPoll);
                }
            }
            iD = hVar.d(-iD);
            if (iD == 0) {
                return;
            }
        }
    }

    public static <T> ri.h<T> b(int i10) {
        return i10 < 0 ? new zi.a(-i10) : new SpscArrayQueue(i10);
    }

    public static <T, U> boolean a(boolean z10, boolean z11, r<?> rVar, boolean z12, ri.h<?> hVar, mi.b bVar, h<T, U> hVar2) {
        if (hVar2.f()) {
            hVar.clear();
            bVar.dispose();
            return true;
        }
        if (z10) {
            if (z12) {
                if (z11) {
                    if (bVar != null) {
                        bVar.dispose();
                    }
                    Throwable thC = hVar2.c();
                    if (thC != null) {
                        rVar.onError(thC);
                    } else {
                        rVar.onComplete();
                    }
                    return true;
                }
                return false;
            }
            Throwable thC2 = hVar2.c();
            if (thC2 != null) {
                hVar.clear();
                if (bVar != null) {
                    bVar.dispose();
                }
                rVar.onError(thC2);
                return true;
            }
            if (z11) {
                if (bVar != null) {
                    bVar.dispose();
                }
                rVar.onComplete();
                return true;
            }
            return false;
        }
        return false;
    }
}
