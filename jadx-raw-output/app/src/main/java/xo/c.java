package xo;

import java.util.ArrayDeque;
import java.util.Queue;
import xo.h;

/* JADX INFO: compiled from: BaseKeyPool.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c<T extends h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Queue<T> f75084a = b(20);

    public abstract T a();

    public static <T> Queue<T> b(int i10) {
        return new ArrayDeque(i10);
    }

    public T c() {
        T tPoll = this.f75084a.poll();
        return tPoll == null ? (T) a() : tPoll;
    }

    public void d(T t10) {
        if (this.f75084a.size() < 20) {
            this.f75084a.offer(t10);
        }
    }
}
