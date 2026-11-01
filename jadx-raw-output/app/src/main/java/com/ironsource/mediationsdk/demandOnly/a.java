package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.C3605n2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nj.b0;

/* JADX INFO: loaded from: classes6.dex */
public interface a {

    /* JADX INFO: renamed from: com.ironsource.mediationsdk.demandOnly.a$a, reason: collision with other inner class name */
    public static final class C0279a implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<C3605n2> f29644a;

        /* JADX WARN: Multi-variable type inference failed */
        public C0279a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        public C3605n2 a(String str) {
            Object next;
            ck.p.j(str, "instanceName");
            Iterator<T> it = this.f29644a.iterator();
            while (it.hasNext()) {
                next = it.next();
                if (ck.p.e(((C3605n2) next).c(), str)) {
                    return (C3605n2) next;
                }
            }
            next = null;
            return (C3605n2) next;
        }

        public C0279a(List<C3605n2> list) {
            ck.p.j(list, com.ironsource.mediationsdk.d.f29596h);
            this.f29644a = list;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        public List<C3605n2> a() {
            return this.f29644a;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        public String b() {
            if (this.f29644a.isEmpty()) {
                return "";
            }
            return "1" + ((C3605n2) b0.f0(this.f29644a)).c();
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        public C3605n2 get(int i10) {
            if (i10 < 0 || i10 >= this.f29644a.size()) {
                return null;
            }
            return this.f29644a.get(i10);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        public boolean isEmpty() {
            return this.f29644a.isEmpty();
        }

        public /* synthetic */ C0279a(List list, int i10, ck.i iVar) {
            this((i10 & 1) != 0 ? new ArrayList() : list);
        }
    }

    C3605n2 a(String str);

    List<C3605n2> a();

    String b();

    C3605n2 get(int i10);

    boolean isEmpty();
}
