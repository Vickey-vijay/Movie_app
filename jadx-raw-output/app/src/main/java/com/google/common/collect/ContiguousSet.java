package com.google.common.collect;

import java.lang.Comparable;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ContiguousSet<C extends Comparable> extends ImmutableSortedSet<C> {
    public final DiscreteDomain<C> domain;

    public static ContiguousSet<Integer> closed(int i10, int i11) {
        return create(Range.closed(Integer.valueOf(i10), Integer.valueOf(i11)), DiscreteDomain.integers());
    }

    public static ContiguousSet<Integer> closedOpen(int i10, int i11) {
        return create(Range.closedOpen(Integer.valueOf(i10), Integer.valueOf(i11)), DiscreteDomain.integers());
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public abstract ContiguousSet<C> headSetImpl(C c10, boolean z10);

    public abstract ContiguousSet<C> intersection(ContiguousSet<C> contiguousSet);

    public abstract Range<C> range();

    public abstract Range<C> range(BoundType boundType, BoundType boundType2);

    @Override // com.google.common.collect.ImmutableSortedSet
    public abstract ContiguousSet<C> subSetImpl(C c10, boolean z10, C c11, boolean z11);

    @Override // com.google.common.collect.ImmutableSortedSet
    public abstract ContiguousSet<C> tailSetImpl(C c10, boolean z10);

    @Deprecated
    public static <E> ImmutableSortedSet.a<E> builder() {
        throw new UnsupportedOperationException();
    }

    public static ContiguousSet<Long> closed(long j10, long j11) {
        return create(Range.closed(Long.valueOf(j10), Long.valueOf(j11)), DiscreteDomain.longs());
    }

    public static ContiguousSet<Long> closedOpen(long j10, long j11) {
        return create(Range.closedOpen(Long.valueOf(j10), Long.valueOf(j11)), DiscreteDomain.longs());
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public ImmutableSortedSet<C> createDescendingSet() {
        return new DescendingImmutableSortedSet(this);
    }

    public ContiguousSet(DiscreteDomain<C> discreteDomain) {
        super(Ordering.natural());
        this.domain = discreteDomain;
    }

    public static <C extends Comparable> ContiguousSet<C> create(Range<C> range, DiscreteDomain<C> discreteDomain) {
        Range<C> rangeIntersection;
        m5.l.m(range);
        m5.l.m(discreteDomain);
        try {
            if (!range.hasLowerBound()) {
                rangeIntersection = range.intersection(Range.atLeast(discreteDomain.minValue()));
            } else {
                rangeIntersection = range;
            }
            if (!range.hasUpperBound()) {
                rangeIntersection = rangeIntersection.intersection(Range.atMost(discreteDomain.maxValue()));
            }
            boolean z10 = true;
            if (!rangeIntersection.isEmpty()) {
                Comparable comparableLeastValueAbove = range.lowerBound.leastValueAbove(discreteDomain);
                Objects.requireNonNull(comparableLeastValueAbove);
                Comparable comparableGreatestValueBelow = range.upperBound.greatestValueBelow(discreteDomain);
                Objects.requireNonNull(comparableGreatestValueBelow);
                if (Range.compareOrThrow(comparableLeastValueAbove, comparableGreatestValueBelow) <= 0) {
                    z10 = false;
                }
            }
            if (z10) {
                return new EmptyContiguousSet(discreteDomain);
            }
            return new RegularContiguousSet(rangeIntersection, discreteDomain);
        } catch (NoSuchElementException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return range().toString();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    public ContiguousSet<C> headSet(C c10) {
        return headSetImpl((Comparable) m5.l.m(c10), false);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    public ContiguousSet<C> subSet(C c10, C c11) {
        m5.l.m(c10);
        m5.l.m(c11);
        m5.l.d(comparator().compare(c10, c11) <= 0);
        return subSetImpl((Comparable) c10, true, (Comparable) c11, false);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    public ContiguousSet<C> tailSet(C c10) {
        return tailSetImpl((Comparable) m5.l.m(c10), true);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public ContiguousSet<C> headSet(C c10, boolean z10) {
        return headSetImpl((Comparable) m5.l.m(c10), z10);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public ContiguousSet<C> tailSet(C c10, boolean z10) {
        return tailSetImpl((Comparable) m5.l.m(c10), z10);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public ContiguousSet<C> subSet(C c10, boolean z10, C c11, boolean z11) {
        m5.l.m(c10);
        m5.l.m(c11);
        m5.l.d(comparator().compare(c10, c11) <= 0);
        return subSetImpl((Comparable) c10, z10, (Comparable) c11, z11);
    }
}
