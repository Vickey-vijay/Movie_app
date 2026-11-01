package io.reactivex.internal.disposables;

import androidx.lifecycle.e;
import ej.a;
import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicReference;
import mi.b;

/* JADX INFO: loaded from: classes2.dex */
public enum DisposableHelper implements b {
    DISPOSED;

    public static boolean trySet(AtomicReference<b> atomicReference, b bVar) {
        if (e.a(atomicReference, null, bVar)) {
            return true;
        }
        if (atomicReference.get() != DISPOSED) {
            return false;
        }
        bVar.dispose();
        return false;
    }

    public static boolean validate(b bVar, b bVar2) {
        if (bVar2 == null) {
            a.s(new NullPointerException("next is null"));
            return false;
        }
        if (bVar == null) {
            return true;
        }
        bVar2.dispose();
        reportDisposableSet();
        return false;
    }

    @Override // mi.b
    public void dispose() {
    }

    @Override // mi.b
    public boolean isDisposed() {
        return true;
    }

    public static boolean isDisposed(b bVar) {
        return bVar == DISPOSED;
    }

    public static void reportDisposableSet() {
        a.s(new ProtocolViolationException("Disposable already set!"));
    }

    public static boolean setOnce(AtomicReference<b> atomicReference, b bVar) {
        qi.a.e(bVar, "d is null");
        if (e.a(atomicReference, null, bVar)) {
            return true;
        }
        bVar.dispose();
        if (atomicReference.get() == DISPOSED) {
            return false;
        }
        reportDisposableSet();
        return false;
    }

    public static boolean dispose(AtomicReference<b> atomicReference) {
        b andSet;
        b bVar = atomicReference.get();
        DisposableHelper disposableHelper = DISPOSED;
        if (bVar != disposableHelper && (andSet = atomicReference.getAndSet(disposableHelper)) != disposableHelper) {
            if (andSet != null) {
                andSet.dispose();
                return true;
            }
            return true;
        }
        return false;
    }

    public static boolean replace(AtomicReference<b> atomicReference, b bVar) {
        b bVar2;
        do {
            bVar2 = atomicReference.get();
            if (bVar2 == DISPOSED) {
                if (bVar != null) {
                    bVar.dispose();
                    return false;
                }
                return false;
            }
        } while (!e.a(atomicReference, bVar2, bVar));
        return true;
    }

    public static boolean set(AtomicReference<b> atomicReference, b bVar) {
        b bVar2;
        do {
            bVar2 = atomicReference.get();
            if (bVar2 == DISPOSED) {
                if (bVar != null) {
                    bVar.dispose();
                    return false;
                }
                return false;
            }
        } while (!e.a(atomicReference, bVar2, bVar));
        if (bVar2 != null) {
            bVar2.dispose();
            return true;
        }
        return true;
    }
}
