package f0;

import com.danikula.videocache.ProxyCacheException;

/* JADX INFO: compiled from: Cache.java */
/* JADX INFO: loaded from: classes9.dex */
public interface a {
    long available() throws ProxyCacheException;

    void close() throws ProxyCacheException;

    void complete() throws ProxyCacheException;

    boolean d();

    void e(byte[] bArr, int i10) throws ProxyCacheException;

    int f(byte[] bArr, long j10, int i10) throws ProxyCacheException;
}
