package com.bykv.vk.openvk.preload.geckox.utils;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PiecemealSerialExecutor.java */
/* JADX INFO: loaded from: classes9.dex */
public class f implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile f f10727a;

    public static f a() {
        if (f10727a == null) {
            synchronized (f.class) {
                if (f10727a == null) {
                    f10727a = new f();
                }
            }
        }
        return f10727a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        com.bykv.vk.openvk.preload.geckox.b.t().execute(runnable);
    }
}
