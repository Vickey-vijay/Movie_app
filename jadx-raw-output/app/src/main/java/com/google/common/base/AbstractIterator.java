package com.google.common.base;

import java.util.Iterator;
import java.util.NoSuchElementException;
import m5.h;
import m5.l;

/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractIterator<T> implements Iterator<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public State f20253b = State.NOT_READY;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public T f20254c;

    public enum State {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    public abstract T a();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20256a;

        static {
            int[] iArr = new int[State.values().length];
            f20256a = iArr;
            try {
                iArr[State.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20256a[State.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public final T b() {
        this.f20253b = State.DONE;
        return null;
    }

    public final boolean c() {
        this.f20253b = State.FAILED;
        this.f20254c = a();
        if (this.f20253b == State.DONE) {
            return false;
        }
        this.f20253b = State.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        l.r(this.f20253b != State.FAILED);
        int i10 = a.f20256a[this.f20253b.ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 != 2) {
            return c();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            this.f20253b = State.NOT_READY;
            T t10 = (T) h.a(this.f20254c);
            this.f20254c = null;
            return t10;
        }
        throw new NoSuchElementException();
    }
}
