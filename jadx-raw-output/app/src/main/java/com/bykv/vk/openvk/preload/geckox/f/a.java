package com.bykv.vk.openvk.preload.geckox.f;

import com.bykv.vk.openvk.preload.geckox.utils.FileLock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: ChannelUpdateLock.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, Lock> f10658a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FileLock f10659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f10660c;

    public static a a(String str) throws Exception {
        Map<String, Lock> map = f10658a;
        synchronized (map) {
            Lock reentrantLock = map.get(str);
            if (reentrantLock == null) {
                reentrantLock = new ReentrantLock();
                map.put(str, reentrantLock);
            }
            if (!reentrantLock.tryLock()) {
                return null;
            }
            try {
                FileLock fileLockC = FileLock.c(str);
                if (fileLockC == null) {
                    reentrantLock.unlock();
                    return null;
                }
                return new a(str, fileLockC);
            } catch (Exception e10) {
                reentrantLock.lock();
                com.bykv.vk.openvk.preload.geckox.utils.a.a(new RuntimeException(e10));
                return null;
            }
        }
    }

    private a(String str, FileLock fileLock) {
        this.f10660c = str;
        this.f10659b = fileLock;
    }

    public final void a() {
        Map<String, Lock> map = f10658a;
        synchronized (map) {
            try {
                this.f10659b.a();
                this.f10659b.b();
                map.get(this.f10660c).unlock();
            } catch (Throwable th2) {
                f10658a.get(this.f10660c).unlock();
                throw th2;
            }
        }
    }
}
