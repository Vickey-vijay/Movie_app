package kotlinx.serialization.json;

import ck.h;
import ck.i;
import ck.p;
import com.ironsource.C3426d4;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import nj.b0;
import xk.f;

/* JADX INFO: compiled from: JsonElement.kt */
/* JADX INFO: loaded from: classes.dex */
@f(with = cl.c.class)
public final class a extends b implements List<b>, dk.a {
    public static final C0568a Companion = new C0568a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<b> f63289b;

    /* JADX INFO: renamed from: kotlinx.serialization.json.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: JsonElement.kt */
    public static final class C0568a {
        public C0568a() {
        }

        public /* synthetic */ C0568a(i iVar) {
            this();
        }

        public final xk.b<a> serializer() {
            return cl.c.f6078a;
        }
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i10, b bVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends b> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends b> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        p.j(collection, "elements");
        return this.f63289b.containsAll(collection);
    }

    public boolean e(b bVar) {
        p.j(bVar, "element");
        return this.f63289b.contains(bVar);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public b get(int i10) {
        return this.f63289b.get(i10);
    }

    public int g() {
        return this.f63289b.size();
    }

    public int h(b bVar) {
        p.j(bVar, "element");
        return this.f63289b.indexOf(bVar);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f63289b.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<b> iterator() {
        return this.f63289b.iterator();
    }

    public int j(b bVar) {
        p.j(bVar, "element");
        return this.f63289b.lastIndexOf(bVar);
    }

    @Override // java.util.List
    public ListIterator<b> listIterator() {
        return this.f63289b.listIterator();
    }

    @Override // java.util.List
    public ListIterator<b> listIterator(int i10) {
        return this.f63289b.listIterator(i10);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ b remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<b> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ b set(int i10, b bVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void sort(Comparator<? super b> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<b> subList(int i10, int i11) {
        return this.f63289b.subList(i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return h.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        p.j(tArr, "array");
        return (T[]) h.b(this, tArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(List<? extends b> list) {
        super(null);
        p.j(list, "content");
        this.f63289b = list;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof b) {
            return e((b) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return p.e(this.f63289b, obj);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.f63289b.hashCode();
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof b) {
            return h((b) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof b) {
            return j((b) obj);
        }
        return -1;
    }

    public String toString() {
        return b0.p0(this.f63289b, StringUtils.COMMA, C3426d4.j.f28586d, C3426d4.j.f28588e, 0, null, null, 56, null);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return g();
    }
}
