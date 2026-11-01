package io.reactivex.internal.subscriptions;

import bj.b;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import qi.a;
import qo.c;

/* JADX INFO: loaded from: classes2.dex */
public class SubscriptionArbiter extends AtomicInteger implements c {
    private static final long serialVersionUID = -2189523197179400958L;
    public c actual;
    public volatile boolean cancelled;
    public long requested;
    public boolean unbounded;
    public final AtomicReference<c> missedSubscription = new AtomicReference<>();
    public final AtomicLong missedRequested = new AtomicLong();
    public final AtomicLong missedProduced = new AtomicLong();

    public void cancel() {
        if (this.cancelled) {
            return;
        }
        this.cancelled = true;
        drain();
    }

    final void drainLoop() {
        int iAddAndGet = 1;
        c cVar = null;
        long jB = 0;
        do {
            c andSet = this.missedSubscription.get();
            if (andSet != null) {
                andSet = this.missedSubscription.getAndSet(null);
            }
            long andSet2 = this.missedRequested.get();
            if (andSet2 != 0) {
                andSet2 = this.missedRequested.getAndSet(0L);
            }
            long andSet3 = this.missedProduced.get();
            if (andSet3 != 0) {
                andSet3 = this.missedProduced.getAndSet(0L);
            }
            c cVar2 = this.actual;
            if (this.cancelled) {
                if (cVar2 != null) {
                    cVar2.cancel();
                    this.actual = null;
                }
                if (andSet != null) {
                    andSet.cancel();
                }
            } else {
                long jB2 = this.requested;
                if (jB2 != Long.MAX_VALUE) {
                    jB2 = b.b(jB2, andSet2);
                    if (jB2 != Long.MAX_VALUE) {
                        jB2 -= andSet3;
                        if (jB2 < 0) {
                            SubscriptionHelper.reportMoreProduced(jB2);
                            jB2 = 0;
                        }
                    }
                    this.requested = jB2;
                }
                if (andSet != null) {
                    if (cVar2 != null) {
                        cVar2.cancel();
                    }
                    this.actual = andSet;
                    if (jB2 != 0) {
                        jB = b.b(jB, jB2);
                        cVar = andSet;
                    }
                } else if (cVar2 != null && andSet2 != 0) {
                    jB = b.b(jB, andSet2);
                    cVar = cVar2;
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
        if (jB != 0) {
            cVar.request(jB);
        }
    }

    public final boolean isCancelled() {
        return this.cancelled;
    }

    public final boolean isUnbounded() {
        return this.unbounded;
    }

    public final void produced(long j10) {
        if (this.unbounded) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            b.a(this.missedProduced, j10);
            drain();
            return;
        }
        long j11 = this.requested;
        if (j11 != Long.MAX_VALUE) {
            long j12 = j11 - j10;
            if (j12 < 0) {
                SubscriptionHelper.reportMoreProduced(j12);
                j12 = 0;
            }
            this.requested = j12;
        }
        if (decrementAndGet() == 0) {
            return;
        }
        drainLoop();
    }

    public final void setSubscription(c cVar) {
        if (this.cancelled) {
            cVar.cancel();
            return;
        }
        a.e(cVar, "s is null");
        if (get() != 0 || !compareAndSet(0, 1)) {
            c andSet = this.missedSubscription.getAndSet(cVar);
            if (andSet != null) {
                andSet.cancel();
            }
            drain();
            return;
        }
        c cVar2 = this.actual;
        if (cVar2 != null) {
            cVar2.cancel();
        }
        this.actual = cVar;
        long j10 = this.requested;
        if (decrementAndGet() != 0) {
            drainLoop();
        }
        if (j10 != 0) {
            cVar.request(j10);
        }
    }

    final void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        drainLoop();
    }

    @Override // qo.c
    public final void request(long j10) {
        if (!SubscriptionHelper.validate(j10) || this.unbounded) {
            return;
        }
        if (get() == 0 && compareAndSet(0, 1)) {
            long j11 = this.requested;
            if (j11 != Long.MAX_VALUE) {
                long jB = b.b(j11, j10);
                this.requested = jB;
                if (jB == Long.MAX_VALUE) {
                    this.unbounded = true;
                }
            }
            c cVar = this.actual;
            if (decrementAndGet() != 0) {
                drainLoop();
            }
            if (cVar != null) {
                cVar.request(j10);
                return;
            }
            return;
        }
        b.a(this.missedRequested, j10);
        drain();
    }
}
