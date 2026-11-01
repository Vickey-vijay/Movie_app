package com.inmobi.media;

import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.q9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC3128q9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArrayList f25157a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f25158b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C3078o9 f25159c = new C3078o9();

    public static void a(Jb jb2) {
        ck.p.j(jb2, "finishListener");
        if (!f25158b.getAndSet(true)) {
            AbstractC2940il.a(new C3103p9(null));
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = f25157a;
        copyOnWriteArrayList.add(new WeakReference(jb2));
        try {
            for (WeakReference weakReference : copyOnWriteArrayList) {
                if (weakReference.get() == null) {
                    f25157a.remove(weakReference);
                }
            }
        } catch (Exception e10) {
            mj.g gVar = P9.f23321a;
            AbstractC2929i9.a(e10);
        }
    }
}
