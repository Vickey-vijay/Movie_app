package com.inmobi.media;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public abstract class Lb {
    public static ArrayList a() {
        CopyOnWriteArrayList copyOnWriteArrayList = Mb.f23154a;
        ArrayList arrayList = new ArrayList();
        try {
            Iterator it = Mb.f23154a.iterator();
            while (it.hasNext()) {
                Gh gh2 = (Gh) ((WeakReference) it.next()).get();
                if (gh2 != null) {
                    arrayList.add(gh2);
                }
            }
        } catch (Exception e10) {
            mj.g gVar = P9.f23321a;
            AbstractC2929i9.a(e10);
        }
        CopyOnWriteArrayList copyOnWriteArrayList2 = Mb.f23154a;
        arrayList.toString();
        return arrayList;
    }

    public static void b(Gh gh2) {
        ck.p.j(gh2, "logger");
        CopyOnWriteArrayList copyOnWriteArrayList = Mb.f23154a;
        Objects.toString(gh2);
        Mb.f23154a.add(new WeakReference(gh2));
    }

    public static boolean a(String str) {
        ck.p.j(str, com.ironsource.Y5.c.f27928b);
        CopyOnWriteArrayList copyOnWriteArrayList = Mb.f23154a;
        try {
            Iterator it = Mb.f23154a.iterator();
            while (it.hasNext()) {
                Gh gh2 = (Gh) ((WeakReference) it.next()).get();
                if (ck.p.e(gh2 != null ? gh2.f22745j : null, str)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e10) {
            mj.g gVar = P9.f23321a;
            AbstractC2929i9.a(e10);
            return false;
        }
    }

    public static void a(Gh gh2) {
        CopyOnWriteArrayList copyOnWriteArrayList = Mb.f23154a;
        Objects.toString(gh2);
        if (gh2 == null) {
            return;
        }
        try {
            Iterator it = Mb.f23154a.iterator();
            ck.p.i(it, "iterator(...)");
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() == null || ck.p.e(weakReference.get(), gh2)) {
                    Mb.f23154a.remove(weakReference);
                }
            }
        } catch (Exception e10) {
            mj.g gVar = P9.f23321a;
            AbstractC2929i9.a(e10);
        }
    }
}
