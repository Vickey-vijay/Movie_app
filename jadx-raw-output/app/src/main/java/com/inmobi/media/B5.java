package com.inmobi.media;

import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class B5 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ H5 f22405a;

    public B5(H5 h10) {
        this.f22405a = h10;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        synchronized (this.f22405a) {
            H5 h10 = this.f22405a;
            if (h10.f22783l == null) {
                return null;
            }
            while (h10.f22782k > h10.f22781j) {
                h10.d((String) ((Map.Entry) h10.f22780i.entrySet().iterator().next()).getKey());
            }
            H5 h11 = this.f22405a;
            int i10 = h11.f22784m;
            if (i10 >= 2000 && i10 >= h11.f22780i.size()) {
                this.f22405a.c();
                this.f22405a.f22784m = 0;
            }
            return null;
        }
    }
}
