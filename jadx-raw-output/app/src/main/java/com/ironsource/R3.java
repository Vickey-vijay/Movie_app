package com.ironsource;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class R3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f27527a = a.NOT_READY;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList f27528b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f27529c;

    public enum a {
        NOT_READY,
        READY
    }

    public synchronized void a(Runnable runnable) {
        if (this.f27527a != a.READY) {
            this.f27528b.add(runnable);
        } else {
            runnable.run();
        }
    }

    public synchronized void b() {
        this.f27527a = a.NOT_READY;
    }

    public synchronized void c() {
        this.f27527a = a.READY;
    }

    public R3(String str) {
        this.f27529c = str;
    }

    public synchronized void a() {
        Object[] array = this.f27528b.toArray();
        for (int i10 = 0; i10 < array.length; i10++) {
            ((Runnable) array[i10]).run();
            array[i10] = null;
        }
        this.f27528b.clear();
    }
}
