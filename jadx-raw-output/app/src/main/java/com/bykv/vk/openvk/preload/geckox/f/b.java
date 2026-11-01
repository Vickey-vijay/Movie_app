package com.bykv.vk.openvk.preload.geckox.f;

import com.bykv.vk.openvk.preload.geckox.utils.FileLock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: SelectChannelVersionLock.java */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, Lock> f10661a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ReentrantLock f10662b = new ReentrantLock();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f10663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private FileLock f10664d;

    public static b a(String str) throws Exception {
        f10662b.lock();
        try {
            FileLock fileLockA = FileLock.a(str);
            Map<String, Lock> map = f10661a;
            Lock reentrantLock = map.get(str);
            if (reentrantLock == null) {
                reentrantLock = new ReentrantLock();
                map.put(str, reentrantLock);
            }
            reentrantLock.lock();
            return new b(str, fileLockA);
        } catch (Exception e10) {
            f10662b.unlock();
            throw e10;
        }
    }

    private b(String str, FileLock fileLock) {
        this.f10663c = str;
        this.f10664d = fileLock;
    }

    public final void a() {
        try {
            this.f10664d.a();
            this.f10664d.b();
            Lock lock = f10661a.get(this.f10663c);
            if (lock != null) {
                lock.unlock();
            }
        } finally {
            f10662b.unlock();
        }
    }
}
