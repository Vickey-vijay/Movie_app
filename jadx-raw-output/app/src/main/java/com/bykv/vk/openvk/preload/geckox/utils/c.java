package com.bykv.vk.openvk.preload.geckox.utils;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: IOSerialExecutor.java */
/* JADX INFO: loaded from: classes9.dex */
public class c implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile c f10725a;

    public static c a() {
        if (f10725a == null) {
            synchronized (c.class) {
                if (f10725a == null) {
                    f10725a = new c();
                }
            }
        }
        return f10725a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        com.bykv.vk.openvk.preload.geckox.b.t().execute(runnable);
    }
}
