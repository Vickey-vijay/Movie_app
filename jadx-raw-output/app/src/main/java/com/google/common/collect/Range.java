package com.google.common.collect;

import java.io.Serializable;
import java.lang.Comparable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes6.dex */
public final class Range<C extends Comparable> extends RangeGwtSerializationDependencies implements m5.m<C> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Range<Comparable> f20515b = new Range<>(Cut.belowAll(), Cut.aboveAll());
    private static final long serialVersionUID = 0;
    public final Cut<C> lowerBound;
    public final Cut<C> upperBound;

    public static class RangeLexOrdering extends Ordering<Range<?>> implements Serializable {
        public static final Ordering<Range<?>> INSTANCE = new RangeLexOrdering();
        private static final long serialVersionUID = 0;

        @Override // com.google.common.collect.Ordering, java.util.Comparator
        public int compare(Range<?> range, Range<?> range2) {
            return m1.k().f(range.lowerBound, range2.lowerBound).f(range.upperBound, range2.upperBound).j();
        }

        private RangeLexOrdering() {
        }
    }

    public static class b implements m5.e<Range, Cut> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f20517b = new b();

        @Override // m5.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cut apply(Range range) {
            return range.lowerBound;
        }
    }

    public static class c implements m5.e<Range, Cut> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f20518b = new c();

        @Override // m5.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cut apply(Range range) {
            return range.upperBound;
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20516a;

        static {
            int[] iArr = new int[BoundType.values().length];
            f20516a = iArr;
            try {
                iArr[BoundType.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20516a[BoundType.CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static String a(Cut<?> cut, Cut<?> cut2) {
        StringBuilder sb2 = new StringBuilder(16);
        cut.describeAsLowerBound(sb2);
        sb2.append("..");
        cut2.describeAsUpperBound(sb2);
        return sb2.toString();
    }

    public static <C extends Comparable<?>> Range<C> all() {
        return (Range<C>) f20515b;
    }

    public static <C extends Comparable<?>> Range<C> create(Cut<C> cut, Cut<C> cut2) {
        return new Range<>(cut, cut2);
    }

    public static <C extends Comparable<?>> Range<C> downTo(C c10, BoundType boundType) {
        int i10 = a.f20516a[boundType.ordinal()];
        if (i10 == 1) {
            return greaterThan(c10);
        }
        if (i10 == 2) {
            return atLeast(c10);
        }
        throw new AssertionError();
    }

    public static <C extends Comparable<?>> m5.e<Range<C>, Cut<C>> lowerBoundFn() {
        return b.f20517b;
    }

    public static <C extends Comparable<?>> Ordering<Range<C>> rangeLexOrdering() {
        return (Ordering<Range<C>>) RangeLexOrdering.INSTANCE;
    }

    public static <C extends Comparable<?>> Range<C> upTo(C c10, BoundType boundType) {
        int i10 = a.f20516a[boundType.ordinal()];
        if (i10 == 1) {
            return lessThan(c10);
        }
        if (i10 == 2) {
            return atMost(c10);
        }
        throw new AssertionError();
    }

    public static <C extends Comparable<?>> m5.e<Range<C>, Cut<C>> upperBoundFn() {
        return c.f20518b;
    }

    @Override // m5.m
    @Deprecated
    public boolean apply(C c10) {
        return contains(c10);
    }

    public boolean encloses(Range<C> range) {
        return this.lowerBound.compareTo((Cut) range.lowerBound) <= 0 && this.upperBound.compareTo((Cut) range.upperBound) >= 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Range)) {
            return false;
        }
        Range range = (Range) obj;
        return this.lowerBound.equals(range.lowerBound) && this.upperBound.equals(range.upperBound);
    }

    public Range<C> gap(Range<C> range) {
        if (this.lowerBound.compareTo((Cut) range.upperBound) >= 0 || range.lowerBound.compareTo((Cut) this.upperBound) >= 0) {
            boolean z10 = this.lowerBound.compareTo((Cut) range.lowerBound) < 0;
            Range<C> range2 = z10 ? this : range;
            if (!z10) {
                range = this;
            }
            return create(range2.upperBound, range.lowerBound);
        }
        throw new IllegalArgumentException("Ranges have a nonempty intersection: " + this + ", " + range);
    }

    public boolean hasLowerBound() {
        return this.lowerBound != Cut.belowAll();
    }

    public boolean hasUpperBound() {
        return this.upperBound != Cut.aboveAll();
    }

    public int hashCode() {
        return (this.lowerBound.hashCode() * 31) + this.upperBound.hashCode();
    }

    public Range<C> intersection(Range<C> range) {
        int iCompareTo = this.lowerBound.compareTo((Cut) range.lowerBound);
        int iCompareTo2 = this.upperBound.compareTo((Cut) range.upperBound);
        if (iCompareTo >= 0 && iCompareTo2 <= 0) {
            return this;
        }
        if (iCompareTo <= 0 && iCompareTo2 >= 0) {
            return range;
        }
        Cut<C> cut = iCompareTo >= 0 ? this.lowerBound : range.lowerBound;
        Cut<C> cut2 = iCompareTo2 <= 0 ? this.upperBound : range.upperBound;
        m5.l.j(cut.compareTo((Cut) cut2) <= 0, "intersection is undefined for disconnected ranges %s and %s", this, range);
        return create(cut, cut2);
    }

    public boolean isConnected(Range<C> range) {
        return this.lowerBound.compareTo((Cut) range.upperBound) <= 0 && range.lowerBound.compareTo((Cut) this.upperBound) <= 0;
    }

    public boolean isEmpty() {
        return this.lowerBound.equals(this.upperBound);
    }

    public BoundType lowerBoundType() {
        return this.lowerBound.typeAsLowerBound();
    }

    public C lowerEndpoint() {
        return (C) this.lowerBound.endpoint();
    }

    public Object readResolve() {
        return equals(f20515b) ? all() : this;
    }

    public Range<C> span(Range<C> range) {
        int iCompareTo = this.lowerBound.compareTo((Cut) range.lowerBound);
        int iCompareTo2 = this.upperBound.compareTo((Cut) range.upperBound);
        if (iCompareTo <= 0 && iCompareTo2 >= 0) {
            return this;
        }
        if (iCompareTo < 0 || iCompareTo2 > 0) {
            return create(iCompareTo <= 0 ? this.lowerBound : range.lowerBound, iCompareTo2 >= 0 ? this.upperBound : range.upperBound);
        }
        return range;
    }

    public String toString() {
        return a(this.lowerBound, this.upperBound);
    }

    public BoundType upperBoundType() {
        return this.upperBound.typeAsUpperBound();
    }

    public C upperEndpoint() {
        return (C) this.upperBound.endpoint();
    }

    public Range(Cut<C> cut, Cut<C> cut2) {
        this.lowerBound = (Cut) m5.l.m(cut);
        this.upperBound = (Cut) m5.l.m(cut2);
        if (cut.compareTo((Cut) cut2) <= 0 && cut != Cut.aboveAll() && cut2 != Cut.belowAll()) {
            return;
        }
        throw new IllegalArgumentException("Invalid range: " + a(cut, cut2));
    }

    public static <C extends Comparable<?>> Range<C> atLeast(C c10) {
        return create(Cut.belowValue(c10), Cut.aboveAll());
    }

    public static <C extends Comparable<?>> Range<C> atMost(C c10) {
        return create(Cut.belowAll(), Cut.aboveValue(c10));
    }

    public static <C extends Comparable<?>> Range<C> closed(C c10, C c11) {
        return create(Cut.belowValue(c10), Cut.aboveValue(c11));
    }

    public static <C extends Comparable<?>> Range<C> closedOpen(C c10, C c11) {
        return create(Cut.belowValue(c10), Cut.belowValue(c11));
    }

    public static int compareOrThrow(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    public static <C extends Comparable<?>> Range<C> encloseAll(Iterable<C> iterable) {
        m5.l.m(iterable);
        if (iterable instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) iterable;
            Comparator comparator = sortedSet.comparator();
            if (Ordering.natural().equals(comparator) || comparator == null) {
                return closed((Comparable) sortedSet.first(), (Comparable) sortedSet.last());
            }
        }
        Iterator<C> it = iterable.iterator();
        Comparable comparable = (Comparable) m5.l.m(it.next());
        Comparable comparable2 = comparable;
        while (it.hasNext()) {
            Comparable comparable3 = (Comparable) m5.l.m(it.next());
            comparable = (Comparable) Ordering.natural().min(comparable, comparable3);
            comparable2 = (Comparable) Ordering.natural().max(comparable2, comparable3);
        }
        return closed(comparable, comparable2);
    }

    public static <C extends Comparable<?>> Range<C> greaterThan(C c10) {
        return create(Cut.aboveValue(c10), Cut.aboveAll());
    }

    public static <C extends Comparable<?>> Range<C> lessThan(C c10) {
        return create(Cut.belowAll(), Cut.belowValue(c10));
    }

    public static <C extends Comparable<?>> Range<C> open(C c10, C c11) {
        return create(Cut.aboveValue(c10), Cut.belowValue(c11));
    }

    public static <C extends Comparable<?>> Range<C> openClosed(C c10, C c11) {
        return create(Cut.aboveValue(c10), Cut.aboveValue(c11));
    }

    public static <C extends Comparable<?>> Range<C> range(C c10, BoundType boundType, C c11, BoundType boundType2) {
        Cut cutBelowValue;
        Cut cutAboveValue;
        m5.l.m(boundType);
        m5.l.m(boundType2);
        BoundType boundType3 = BoundType.OPEN;
        if (boundType == boundType3) {
            cutBelowValue = Cut.aboveValue(c10);
        } else {
            cutBelowValue = Cut.belowValue(c10);
        }
        if (boundType2 == boundType3) {
            cutAboveValue = Cut.belowValue(c11);
        } else {
            cutAboveValue = Cut.aboveValue(c11);
        }
        return create(cutBelowValue, cutAboveValue);
    }

    public static <C extends Comparable<?>> Range<C> singleton(C c10) {
        return closed(c10, c10);
    }

    public Range<C> canonical(DiscreteDomain<C> discreteDomain) {
        m5.l.m(discreteDomain);
        Cut<C> cutCanonical = this.lowerBound.canonical(discreteDomain);
        Cut<C> cutCanonical2 = this.upperBound.canonical(discreteDomain);
        if (cutCanonical == this.lowerBound && cutCanonical2 == this.upperBound) {
            return this;
        }
        return create(cutCanonical, cutCanonical2);
    }

    public boolean contains(C c10) {
        m5.l.m(c10);
        if (this.lowerBound.isLessThan(c10) && !this.upperBound.isLessThan(c10)) {
            return true;
        }
        return false;
    }

    public boolean containsAll(Iterable<? extends C> iterable) {
        if (y1.j(iterable)) {
            return true;
        }
        if (iterable instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) iterable;
            Comparator comparator = sortedSet.comparator();
            if (Ordering.natural().equals(comparator) || comparator == null) {
                if (contains((Comparable) sortedSet.first()) && contains((Comparable) sortedSet.last())) {
                    return true;
                }
                return false;
            }
        }
        Iterator<? extends C> it = iterable.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }
}
