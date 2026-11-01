package zk;

import ck.p;
import java.util.Iterator;

/* JADX INFO: compiled from: SerialDescriptor.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: compiled from: SerialDescriptor.kt */
    public static final class a implements Iterator<kotlinx.serialization.descriptors.a>, dk.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f86469b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ kotlinx.serialization.descriptors.a f86470c;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public a(kotlinx.serialization.descriptors.a aVar) {
            this.f86470c = aVar;
            this.f86469b = aVar.e();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public kotlinx.serialization.descriptors.a next() {
            kotlinx.serialization.descriptors.a aVar = this.f86470c;
            int iE = aVar.e();
            int i10 = this.f86469b;
            this.f86469b = i10 - 1;
            return aVar.d(iE - i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f86469b > 0;
        }
    }

    /* JADX INFO: compiled from: SerialDescriptor.kt */
    public static final class b implements Iterator<String>, dk.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f86471b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ kotlinx.serialization.descriptors.a f86472c;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public b(kotlinx.serialization.descriptors.a aVar) {
            this.f86472c = aVar;
            this.f86471b = aVar.e();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            kotlinx.serialization.descriptors.a aVar = this.f86472c;
            int iE = aVar.e();
            int i10 = this.f86471b;
            this.f86471b = i10 - 1;
            return aVar.f(iE - i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f86471b > 0;
        }
    }

    /* JADX INFO: compiled from: Iterables.kt */
    public static final class c implements Iterable<kotlinx.serialization.descriptors.a>, dk.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ kotlinx.serialization.descriptors.a f86473b;

        public c(kotlinx.serialization.descriptors.a aVar) {
            this.f86473b = aVar;
        }

        @Override // java.lang.Iterable
        public Iterator<kotlinx.serialization.descriptors.a> iterator() {
            return new a(this.f86473b);
        }
    }

    /* JADX INFO: compiled from: Iterables.kt */
    public static final class d implements Iterable<String>, dk.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ kotlinx.serialization.descriptors.a f86474b;

        public d(kotlinx.serialization.descriptors.a aVar) {
            this.f86474b = aVar;
        }

        @Override // java.lang.Iterable
        public Iterator<String> iterator() {
            return new b(this.f86474b);
        }
    }

    public static final Iterable<kotlinx.serialization.descriptors.a> a(kotlinx.serialization.descriptors.a aVar) {
        p.j(aVar, "<this>");
        return new c(aVar);
    }

    public static final Iterable<String> b(kotlinx.serialization.descriptors.a aVar) {
        p.j(aVar, "<this>");
        return new d(aVar);
    }
}
