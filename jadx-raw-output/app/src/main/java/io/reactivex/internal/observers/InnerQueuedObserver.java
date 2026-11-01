package io.reactivex.internal.observers;

import bj.k;
import ii.r;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import mi.b;
import ri.c;
import ri.h;
import si.i;

/* JADX INFO: loaded from: classes2.dex */
public final class InnerQueuedObserver<T> extends AtomicReference<b> implements r<T>, b {
    private static final long serialVersionUID = -5417183359794346637L;
    public volatile boolean done;
    public int fusionMode;
    public final i<T> parent;
    public final int prefetch;
    public h<T> queue;

    public void setDone() {
        this.done = true;
    }

    public int fusionMode() {
        return this.fusionMode;
    }

    public boolean isDone() {
        return this.done;
    }

    @Override // ii.r
    public void onComplete() {
        this.parent.innerComplete(this);
    }

    @Override // ii.r
    public void onError(Throwable th2) {
        this.parent.innerError(this, th2);
    }

    @Override // ii.r
    public void onNext(T t10) {
        if (this.fusionMode == 0) {
            this.parent.innerNext(this, t10);
        } else {
            this.parent.drain();
        }
    }

    public h<T> queue() {
        return this.queue;
    }

    public InnerQueuedObserver(i<T> iVar, int i10) {
        this.parent = iVar;
        this.prefetch = i10;
    }

    @Override // mi.b
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // mi.b
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    @Override // ii.r
    public void onSubscribe(b bVar) {
        if (DisposableHelper.setOnce(this, bVar)) {
            if (bVar instanceof c) {
                c cVar = (c) bVar;
                int iRequestFusion = cVar.requestFusion(3);
                if (iRequestFusion == 1) {
                    this.fusionMode = iRequestFusion;
                    this.queue = cVar;
                    this.done = true;
                    this.parent.innerComplete(this);
                    return;
                }
                if (iRequestFusion == 2) {
                    this.fusionMode = iRequestFusion;
                    this.queue = cVar;
                    return;
                }
            }
            this.queue = k.b(-this.prefetch);
        }
    }
}
