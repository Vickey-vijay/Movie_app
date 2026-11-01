package io.appmetrica.analytics.impl;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.l5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4338l5 implements InterfaceC4491r9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4616w9 f57171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f57172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f57173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f57174d;

    /* JADX WARN: Code duplicated, block: B:21:0x0041  */
    /* JADX WARN: Code duplicated, block: B:30:0x004f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:? A[LOOP:1: B:19:0x003b->B:31:?, LOOP_END, SYNTHETIC] */
    public final boolean a() {
        List list;
        Iterator it;
        List list2 = this.f57173c;
        if (list2.isEmpty() || list2.isEmpty()) {
            list = this.f57172b;
            if ((!list.isEmpty()) && !list.isEmpty()) {
                it = list.iterator();
                while (it.hasNext()) {
                    if (((G8) it.next()).b()) {
                        return true;
                    }
                }
            }
        } else {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                if (!((G8) it2.next()).b()) {
                }
            }
            list = this.f57172b;
            if (!list.isEmpty()) {
                it = list.iterator();
                while (it.hasNext()) {
                    if (((G8) it.next()).b()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void b() {
        this.f57174d.set(false);
    }

    public final void c() {
        this.f57174d.set(true);
    }

    public final void d() {
        if (this.f57174d.get()) {
            List list = this.f57173c;
            if (!list.isEmpty() && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!((G8) it.next()).b()) {
                        return;
                    }
                }
            }
            ((C4381mn) this.f57171a).c();
        }
    }

    public final void e() {
        if (this.f57174d.get() && a()) {
            ((C4381mn) this.f57171a).c();
        }
    }

    public final void f() {
        if (this.f57174d.get() && a()) {
            ((C4381mn) this.f57171a).b();
        }
    }

    public C4338l5(InterfaceC4616w9 interfaceC4616w9, List<? extends G8> list, List<? extends G8> list2, R4 r10) {
        this.f57171a = interfaceC4616w9;
        this.f57172b = list;
        this.f57173c = list2;
        Objects.toString(r10);
        this.f57174d = new AtomicBoolean(true);
    }
}
