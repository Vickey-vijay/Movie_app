package com.inmobi.media;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes7.dex */
public abstract class Y3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2924i4 f23815a = new C2924i4(new C2973k4(), new C2948j4(A9.f22351c));

    public static void a(String str, InterfaceC3172s4 interfaceC3172s4) {
        ck.p.j(str, "type");
        ck.p.j(interfaceC3172s4, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        C2924i4 c2924i4 = f23815a;
        c2924i4.getClass();
        ck.p.j(str, "type");
        ck.p.j(interfaceC3172s4, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        LinkedHashMap linkedHashMap = c2924i4.f24533a.f24649c;
        Object concurrentLinkedQueue = linkedHashMap.get(str);
        if (concurrentLinkedQueue == null) {
            concurrentLinkedQueue = new ConcurrentLinkedQueue();
            linkedHashMap.put(str, concurrentLinkedQueue);
        }
        ((ConcurrentLinkedQueue) concurrentLinkedQueue).add(new WeakReference(interfaceC3172s4));
    }
}
