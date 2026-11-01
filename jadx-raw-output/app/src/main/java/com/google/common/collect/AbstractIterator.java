package com.google.common.collect;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractIterator<T> extends r2<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public State f20263b = State.NOT_READY;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public T f20264c;

    public enum State {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    public abstract T a();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20266a;

        static {
            int[] iArr = new int[State.values().length];
            f20266a = iArr;
            try {
                iArr[State.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20266a[State.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public final T b() {
        this.f20263b = State.DONE;
        return null;
    }

    public final boolean c() {
        this.f20263b = State.FAILED;
        this.f20264c = a();
        if (this.f20263b == State.DONE) {
            return false;
        }
        this.f20263b = State.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        m5.l.r(this.f20263b != State.FAILED);
        int i10 = a.f20266a[this.f20263b.ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 != 2) {
            return c();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            this.f20263b = State.NOT_READY;
            T t10 = (T) c2.a(this.f20264c);
            this.f20264c = null;
            return t10;
        }
        throw new NoSuchElementException();
    }
}
