package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class Gl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Il f55281a;

    public Gl(Il il2) {
        this.f55281a = il2;
    }

    public final void a(String str, Kl kl2, C4226gm c4226gm) {
        ArrayList arrayList;
        synchronized (this.f55281a.f55362b) {
            Collection collection = (Collection) this.f55281a.f55361a.f57557a.get(str);
            arrayList = collection == null ? new ArrayList() : new ArrayList(collection);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Rl) it.next()).a(kl2, c4226gm);
        }
    }
}
