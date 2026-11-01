package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: com.inmobi.media.e4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2822e4 implements qk.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2924i4 f24290a;

    public C2822e4(C2924i4 c2924i4) {
        this.f24290a = c2924i4;
    }

    @Override // qk.d
    public final Object emit(Object obj, rj.c cVar) {
        Config config = (Config) obj;
        this.f24290a.f24533a.f24648b.put(config.getType(), config);
        C2924i4 c2924i4 = this.f24290a;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) c2924i4.f24533a.f24649c.get(config.getType());
        if (concurrentLinkedQueue != null) {
            Iterator it = concurrentLinkedQueue.iterator();
            while (it.hasNext()) {
                InterfaceC3172s4 interfaceC3172s4 = (InterfaceC3172s4) ((WeakReference) it.next()).get();
                if (interfaceC3172s4 != null) {
                    interfaceC3172s4.a(config);
                }
            }
        }
        c2924i4.f24533a.f24649c.remove(config.getType());
        return mj.r.f64562a;
    }
}
