package com.inmobi.media;

import com.inmobi.media.C3305xc;
import com.inmobi.media.I2;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: com.inmobi.media.xc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3305xc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f25717a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f25718b;

    public static final void a(I2 i10, C3305xc c3305xc) {
        int i11 = i10.f22839a;
        c3305xc.a(i10);
    }

    public final void b(final I2 i10) {
        ck.p.j(i10, "event");
        try {
            this.f25718b.execute(new Runnable() { // from class: b7.kc
                @Override // java.lang.Runnable
                public final void run() {
                    C3305xc.a(i10, this);
                }
            });
        } catch (InternalError unused) {
            int i11 = i10.f22839a;
            a(i10);
        }
    }

    public C3305xc() {
        ck.p.j("MultiEventBus", "name");
        this.f25718b = Executors.newSingleThreadExecutor(new B9("MultiEventBus", false));
    }

    public static final boolean a(int[] iArr, I2 i10) {
        ck.p.j(i10, "event");
        return nj.n.B(iArr, i10.f22839a);
    }

    public final void a(final int[] iArr, bk.l lVar) {
        ck.p.j(iArr, "eventIds");
        ck.p.j(lVar, "subscriber");
        this.f25717a.put(new bk.l() { // from class: b7.jc
            @Override // bk.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(C3305xc.a(iArr, (I2) obj));
            }
        }, new WeakReference(lVar));
    }

    public final void a(bk.l lVar) {
        ck.p.j(lVar, "subscriber");
        Iterator it = this.f25717a.entrySet().iterator();
        while (it.hasNext()) {
            if (ck.p.e(((WeakReference) ((Map.Entry) it.next()).getValue()).get(), lVar)) {
                it.remove();
            }
        }
    }

    public final void a(I2 i10) {
        bk.l lVar;
        Set<Map.Entry> setEntrySet = this.f25717a.entrySet();
        ck.p.i(setEntrySet, "<get-entries>(...)");
        for (Map.Entry entry : setEntrySet) {
            if (((WeakReference) entry.getValue()).get() == null) {
                this.f25717a.remove(entry.getKey());
            }
        }
        Set<Map.Entry> setEntrySet2 = this.f25717a.entrySet();
        ck.p.i(setEntrySet2, "<get-entries>(...)");
        for (Map.Entry entry2 : setEntrySet2) {
            ck.p.g(entry2);
            Object key = entry2.getKey();
            ck.p.i(key, "component1(...)");
            bk.l lVar2 = (bk.l) key;
            Object value = entry2.getValue();
            ck.p.i(value, "component2(...)");
            WeakReference weakReference = (WeakReference) value;
            try {
                if (((Boolean) lVar2.invoke(i10)).booleanValue() && (lVar = (bk.l) weakReference.get()) != null) {
                    lVar.invoke(i10);
                }
            } catch (Exception e10) {
                mj.g gVar = P9.f23321a;
                AbstractC2929i9.a(e10);
            }
        }
    }
}
