package io.appmetrica.analytics.impl;

import androidx.annotation.WorkerThread;
import java.util.ArrayList;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.bg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4091bg implements Xf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4194fg f56423a;

    public C4091bg(C4194fg c4194fg) {
        this.f56423a = c4194fg;
    }

    @Override // io.appmetrica.analytics.impl.Xf
    @WorkerThread
    public final void a() {
        C4194fg c4194fg = this.f56423a;
        ArrayList arrayList = c4194fg.f56771g;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            C4424og c4424og = (C4424og) obj;
            c4194fg.f56767c.getClass();
            String str = c4424og != null ? c4424og.f57445a : null;
            if (!(str == null || str.length() == 0)) {
                arrayList2.add(obj);
            }
        }
        c4194fg.a(c4194fg.f56767c.a(nj.b0.c0(arrayList2)));
    }
}
