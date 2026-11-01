package ll;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import kl.k;

/* JADX INFO: compiled from: Danmakus.java */
/* JADX INFO: loaded from: classes8.dex */
public class e implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Collection<kl.c> f63695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f63696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public kl.c f63697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public kl.c f63698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public kl.c f63699e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public kl.c f63700f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile AtomicInteger f63701g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f63702h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public k.a f63703i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f63704j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f63705k;

    public e() {
        this(0, false);
    }

    @Override // kl.k
    public boolean g(kl.c cVar) {
        if (cVar == null) {
            return false;
        }
        if (cVar.r()) {
            cVar.C(false);
        }
        synchronized (this.f63705k) {
            if (!this.f63695a.remove(cVar)) {
                return false;
            }
            this.f63701g.decrementAndGet();
            return true;
        }
    }

    public e(int i10) {
        this(i10, false);
    }

    @Override // kl.k
    public boolean a(kl.c cVar) {
        synchronized (this.f63705k) {
            Collection<kl.c> collection = this.f63695a;
            if (collection != null) {
                try {
                    if (collection.add(cVar)) {
                        this.f63701g.incrementAndGet();
                        return true;
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            return false;
        }
    }

    @Override // kl.k
    public k b(long j10, long j11) {
        Collection<kl.c> collection = this.f63695a;
        if (collection == null || collection.size() == 0) {
            return null;
        }
        if (this.f63696b == null) {
            if (this.f63702h == 4) {
                e eVar = new e(4);
                this.f63696b = eVar;
                eVar.f63705k = this.f63705k;
                synchronized (this.f63705k) {
                    this.f63696b.i(this.f63695a);
                }
            } else {
                e eVar2 = new e(this.f63704j);
                this.f63696b = eVar2;
                eVar2.f63705k = this.f63705k;
            }
        }
        if (this.f63702h == 4) {
            return this.f63696b;
        }
        if (this.f63697c == null) {
            this.f63697c = h("start");
        }
        if (this.f63698d == null) {
            this.f63698d = h("end");
        }
        if (this.f63696b != null && j10 - this.f63697c.b() >= 0 && j11 <= this.f63698d.b()) {
            return this.f63696b;
        }
        this.f63697c.A(j10);
        this.f63698d.A(j11);
        synchronized (this.f63705k) {
            this.f63696b.i(((SortedSet) this.f63695a).subSet(this.f63697c, this.f63698d));
        }
        return this.f63696b;
    }

    @Override // kl.k
    public void c(k.b<? super kl.c, ?> bVar) {
        synchronized (this.f63705k) {
            f(bVar);
        }
    }

    @Override // kl.k
    public void clear() {
        synchronized (this.f63705k) {
            Collection<kl.c> collection = this.f63695a;
            if (collection != null) {
                collection.clear();
                this.f63701g.set(0);
            }
        }
        if (this.f63696b != null) {
            this.f63696b = null;
            this.f63697c = h("start");
            this.f63698d = h("end");
        }
    }

    @Override // kl.k
    public boolean d(kl.c cVar) {
        Collection<kl.c> collection = this.f63695a;
        return collection != null && collection.contains(cVar);
    }

    @Override // kl.k
    public kl.c first() {
        Collection<kl.c> collection = this.f63695a;
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        return this.f63702h == 4 ? (kl.c) ((LinkedList) this.f63695a).peek() : (kl.c) ((SortedSet) this.f63695a).first();
    }

    public final kl.c h(String str) {
        return new kl.d(str);
    }

    public void i(Collection<kl.c> collection) {
        if (!this.f63704j || this.f63702h == 4) {
            this.f63695a = collection;
        } else {
            synchronized (this.f63705k) {
                this.f63695a.clear();
                this.f63695a.addAll(collection);
                collection = this.f63695a;
            }
        }
        if (collection instanceof List) {
            this.f63702h = 4;
        }
        this.f63701g.set(collection == null ? 0 : collection.size());
    }

    @Override // kl.k
    public boolean isEmpty() {
        Collection<kl.c> collection = this.f63695a;
        return collection == null || collection.isEmpty();
    }

    public final Collection<kl.c> j(long j10, long j11) {
        Collection<kl.c> collection;
        if (this.f63702h == 4 || (collection = this.f63695a) == null || collection.size() == 0) {
            return null;
        }
        if (this.f63696b == null) {
            e eVar = new e(this.f63704j);
            this.f63696b = eVar;
            eVar.f63705k = this.f63705k;
        }
        if (this.f63700f == null) {
            this.f63700f = h("start");
        }
        if (this.f63699e == null) {
            this.f63699e = h("end");
        }
        this.f63700f.A(j10);
        this.f63699e.A(j11);
        return ((SortedSet) this.f63695a).subSet(this.f63700f, this.f63699e);
    }

    @Override // kl.k
    public kl.c last() {
        Collection<kl.c> collection = this.f63695a;
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        return this.f63702h == 4 ? (kl.c) ((LinkedList) this.f63695a).peekLast() : (kl.c) ((SortedSet) this.f63695a).last();
    }

    @Override // kl.k
    public int size() {
        return this.f63701g.get();
    }

    public e(int i10, boolean z10) {
        this(i10, z10, null);
    }

    @Override // kl.k
    public k e(long j10, long j11) {
        Collection<kl.c> collectionJ = j(j10, j11);
        if (collectionJ != null && !collectionJ.isEmpty()) {
            return new e(new LinkedList(collectionJ));
        }
        return null;
    }

    @Override // kl.k
    public void f(k.b<? super kl.c, ?> bVar) {
        bVar.c();
        Iterator<kl.c> it = this.f63695a.iterator();
        while (it.hasNext()) {
            kl.c next = it.next();
            if (next != null) {
                int iA = bVar.a(next);
                if (iA == 1) {
                    break;
                }
                if (iA == 2) {
                    it.remove();
                    this.f63701g.decrementAndGet();
                } else if (iA == 3) {
                    it.remove();
                    this.f63701g.decrementAndGet();
                    break;
                }
            }
        }
        bVar.b();
    }

    public e(int i10, boolean z10, k.a aVar) {
        this.f63701g = new AtomicInteger(0);
        this.f63702h = 0;
        this.f63705k = new Object();
        if (i10 == 0) {
            if (aVar == null) {
                aVar = new k.d(z10);
            }
        } else if (i10 == 1) {
            aVar = new k.e(z10);
        } else {
            aVar = i10 == 2 ? new k.f(z10) : null;
        }
        if (i10 == 4) {
            this.f63695a = new LinkedList();
        } else {
            this.f63704j = z10;
            aVar.b(z10);
            this.f63695a = new TreeSet(aVar);
            this.f63703i = aVar;
        }
        this.f63702h = i10;
        this.f63701g.set(0);
    }

    public e(Collection<kl.c> collection) {
        this.f63701g = new AtomicInteger(0);
        this.f63702h = 0;
        this.f63705k = new Object();
        i(collection);
    }

    public e(boolean z10) {
        this(0, z10);
    }
}
