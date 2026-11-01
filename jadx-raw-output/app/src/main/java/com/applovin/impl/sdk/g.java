package com.applovin.impl.sdk;

import com.applovin.impl.l1;
import com.applovin.impl.y2;
import com.ironsource.C3605n2;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f9240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f9241b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f9242c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f9243d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f9244e = new Object();

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f9245a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f9246b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f9247c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f9248d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f9249e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f9250f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final String f9251g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f9252h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final ArrayDeque f9253i;

        private b(y2 y2Var, c cVar) {
            this.f9253i = new ArrayDeque();
            this.f9245a = y2Var.getAdUnitId();
            this.f9246b = y2Var.getFormat().getLabel();
            this.f9247c = y2Var.c();
            this.f9248d = y2Var.b();
            this.f9249e = y2Var.z();
            this.f9250f = y2Var.B();
            this.f9251g = y2Var.getCreativeId();
            a(cVar);
        }

        public String a() {
            return this.f9245a;
        }

        public String b() {
            return this.f9248d;
        }

        public String c() {
            return this.f9247c;
        }

        public String d() {
            return this.f9249e;
        }

        public String e() {
            return this.f9250f;
        }

        public String f() {
            return this.f9251g;
        }

        public String g() {
            return this.f9246b;
        }

        public String h() {
            return this.f9250f;
        }

        public c i() {
            return (c) this.f9253i.getLast();
        }

        public String toString() {
            return "AdInfo{state='" + i() + "', adUnitId='" + this.f9245a + "', format='" + this.f9246b + "', adapterName='" + this.f9247c + "', adapterClass='" + this.f9248d + "', adapterVersion='" + this.f9249e + "', bCode='" + this.f9250f + "', creativeId='" + this.f9251g + "', updated=" + this.f9252h + '}';
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(c cVar) {
            this.f9252h = System.currentTimeMillis();
            this.f9253i.add(cVar);
        }
    }

    public enum c {
        LOADING("loading"),
        LOAD("load"),
        SHOW(C3605n2.f30216v),
        HIDE("hide"),
        CLICK("click"),
        DESTROY("destroy"),
        SHOW_ERROR("show_error");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f9262a;

        @Override // java.lang.Enum
        public String toString() {
            return this.f9262a;
        }

        c(String str) {
            this.f9262a = str;
        }
    }

    public interface d {
        void a(b bVar);
    }

    public void a(y2 y2Var, c cVar) {
        synchronized (this.f9244e) {
            String strB = y2Var.B();
            b bVar = (b) this.f9243d.get(strB);
            if (bVar == null) {
                if (cVar == c.DESTROY) {
                    return;
                }
                bVar = new b(y2Var, cVar);
                this.f9243d.put(strB, bVar);
            } else if (bVar.i() == cVar) {
                return;
            } else {
                bVar.a(cVar);
            }
            if (cVar == c.DESTROY) {
                this.f9243d.remove(strB);
            }
            a(bVar, cVar);
        }
    }

    public g(k kVar) {
        this.f9240a = kVar;
        a();
    }

    public void a() {
        synchronized (this.f9242c) {
            for (c cVar : c.values()) {
                this.f9241b.put(cVar, new HashSet());
            }
        }
    }

    public void a(d dVar, Set set) {
        synchronized (this.f9242c) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                a((c) it.next()).add(dVar);
            }
        }
    }

    public void a(d dVar) {
        synchronized (this.f9242c) {
            Iterator it = this.f9241b.keySet().iterator();
            while (it.hasNext()) {
                a((c) it.next()).remove(dVar);
            }
        }
    }

    private Set a(c cVar) {
        synchronized (this.f9242c) {
            Set set = (Set) this.f9241b.get(cVar);
            if (l1.a(set)) {
                return set;
            }
            return new HashSet();
        }
    }

    private void a(b bVar, c cVar) {
        synchronized (this.f9242c) {
            Iterator it = a(cVar).iterator();
            while (it.hasNext()) {
                ((d) it.next()).a(bVar);
            }
        }
    }
}
