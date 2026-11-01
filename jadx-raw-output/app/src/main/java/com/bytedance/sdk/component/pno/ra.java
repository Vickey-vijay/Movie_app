package com.bytedance.sdk.component.pno;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes11.dex */
public final class ra<V> extends FutureTask<V> implements Comparable<ra<V>> {
    private int ouw;
    private int vt;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int i10 = this.ouw;
        int i11 = ((ra) obj).ouw;
        if (i10 < i11) {
            return 1;
        }
        return i10 > i11 ? -1 : 0;
    }

    public ra(Callable<V> callable) {
        super(callable);
        this.ouw = 5;
        this.vt = 2;
    }
}
