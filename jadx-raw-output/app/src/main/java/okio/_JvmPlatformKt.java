package okio;

import bk.a;
import ck.n;
import ck.p;
import java.util.concurrent.locks.ReentrantLock;
import lk.c;

/* JADX INFO: compiled from: -JvmPlatform.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class _JvmPlatformKt {
    public static final byte[] asUtf8ToByteArray(String str) {
        p.j(str, "<this>");
        byte[] bytes = str.getBytes(c.f63591b);
        p.i(bytes, "getBytes(...)");
        return bytes;
    }

    public static final ReentrantLock newLock() {
        return new ReentrantLock();
    }

    public static final String toUtf8String(byte[] bArr) {
        p.j(bArr, "<this>");
        return new String(bArr, c.f63591b);
    }

    public static final <T> T withLock(ReentrantLock reentrantLock, a<? extends T> aVar) {
        p.j(reentrantLock, "<this>");
        p.j(aVar, "action");
        reentrantLock.lock();
        try {
            return aVar.invoke();
        } finally {
            n.b(1);
            reentrantLock.unlock();
            n.a(1);
        }
    }
}
