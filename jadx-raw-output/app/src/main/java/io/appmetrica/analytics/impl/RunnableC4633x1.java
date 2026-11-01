package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.Iterator;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.x1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class RunnableC4633x1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f57902a;

    public RunnableC4633x1(Context context) {
        this.f57902a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Rj rj2 = AbstractC4452pj.f57520a;
        Context context = this.f57902a;
        synchronized (rj2) {
            if (rj2.f55828b == null) {
                rj2.f55828b = AbstractC4426oi.f57449a.a(context, "20799a27-fa80-4b36-b2db-0f8141f24180");
                Iterator it = rj2.f55827a.iterator();
                while (it.hasNext()) {
                    ((Ra) it.next()).a(rj2.f55828b);
                }
                rj2.f55827a.clear();
            }
        }
    }
}
