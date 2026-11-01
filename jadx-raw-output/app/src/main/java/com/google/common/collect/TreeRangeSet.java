package com.google.common.collect;

import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes10.dex */
public class TreeRangeSet<C extends Comparable<?>> extends f<C> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient Set<Range<C>> f20548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient Set<Range<C>> f20549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient i2<C> f20550d;
    public final NavigableMap<Cut<C>, Range<C>> rangesByLowerBound;

    public final class Complement extends TreeRangeSet<C> {
        public Complement() {
            super(new c(TreeRangeSet.this.rangesByLowerBound));
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.f
        public void add(Range<C> range) {
            TreeRangeSet.this.remove(range);
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.i2
        public i2<C> complement() {
            return TreeRangeSet.this;
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.f
        public boolean contains(C c10) {
            return !TreeRangeSet.this.contains(c10);
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.f
        public void remove(Range<C> range) {
            TreeRangeSet.this.add(range);
        }
    }

    public final class SubRangeSet extends TreeRangeSet<C> {
        private final Range<C> restriction;

        /* JADX WARN: Illegal instructions before constructor call */
        public SubRangeSet(Range<C> range) {
            super(new e(Range.all(), range, TreeRangeSet.this.rangesByLowerBound));
            this.restriction = range;
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.f
        public void add(Range<C> range) {
            m5.l.j(this.restriction.encloses(range), "Cannot add range %s to subRangeSet(%s)", range, this.restriction);
            TreeRangeSet.this.add(range);
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.f
        public void clear() {
            TreeRangeSet.this.remove(this.restriction);
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.f
        public boolean contains(C c10) {
            return this.restriction.contains(c10) && TreeRangeSet.this.contains(c10);
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.f, com.google.common.collect.i2
        public boolean encloses(Range<C> range) {
            Range rangeA;
            return (this.restriction.isEmpty() || !this.restriction.encloses(range) || (rangeA = TreeRangeSet.this.a(range)) == null || rangeA.intersection(this.restriction).isEmpty()) ? false : true;
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.f
        public Range<C> rangeContaining(C c10) {
            Range<C> rangeRangeContaining;
            if (this.restriction.contains(c10) && (rangeRangeContaining = TreeRangeSet.this.rangeContaining(c10)) != null) {
                return rangeRangeContaining.intersection(this.restriction);
            }
            return null;
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.f
        public void remove(Range<C> range) {
            if (range.isConnected(this.restriction)) {
                TreeRangeSet.this.remove(range.intersection(this.restriction));
            }
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.i2
        public i2<C> subRangeSet(Range<C> range) {
            if (range.encloses(this.restriction)) {
                return this;
            }
            return range.isConnected(this.restriction) ? new SubRangeSet(this.restriction.intersection(range)) : ImmutableRangeSet.of();
        }
    }

    public final class b extends o1<Range<C>> implements Set<Range<C>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Collection<Range<C>> f20551c;

        @Override // com.google.common.collect.o1, com.google.common.collect.r1
        /* JADX INFO: renamed from: delegate */
        public Collection<Range<C>> g() {
            return this.f20551c;
        }

        public b(TreeRangeSet treeRangeSet, Collection<Range<C>> collection) {
            this.f20551c = collection;
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return Sets.a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return Sets.d(this);
        }
    }

    public static final class c<C extends Comparable<?>> extends com.google.common.collect.e<Cut<C>, Range<C>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final NavigableMap<Cut<C>, Range<C>> f20552b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final NavigableMap<Cut<C>, Range<C>> f20553c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Range<Cut<C>> f20554d;

        public class a extends AbstractIterator<Map.Entry<Cut<C>, Range<C>>> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public Cut<C> f20555d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Cut f20556e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ g2 f20557f;

            public a(Cut cut, g2 g2Var) {
                this.f20556e = cut;
                this.f20557f = g2Var;
                this.f20555d = cut;
            }

            @Override // com.google.common.collect.AbstractIterator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry<Cut<C>, Range<C>> a() {
                Range rangeCreate;
                if (c.this.f20554d.upperBound.isLessThan(this.f20555d) || this.f20555d == Cut.aboveAll()) {
                    return (Map.Entry) b();
                }
                if (this.f20557f.hasNext()) {
                    Range range = (Range) this.f20557f.next();
                    rangeCreate = Range.create(this.f20555d, range.lowerBound);
                    this.f20555d = range.upperBound;
                } else {
                    rangeCreate = Range.create(this.f20555d, Cut.aboveAll());
                    this.f20555d = Cut.aboveAll();
                }
                return Maps.e(rangeCreate.lowerBound, rangeCreate);
            }
        }

        public class b extends AbstractIterator<Map.Entry<Cut<C>, Range<C>>> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public Cut<C> f20559d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Cut f20560e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ g2 f20561f;

            public b(Cut cut, g2 g2Var) {
                this.f20560e = cut;
                this.f20561f = g2Var;
                this.f20559d = cut;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.google.common.collect.AbstractIterator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry<Cut<C>, Range<C>> a() {
                if (this.f20559d == Cut.belowAll()) {
                    return (Map.Entry) b();
                }
                if (this.f20561f.hasNext()) {
                    Range range = (Range) this.f20561f.next();
                    Range rangeCreate = Range.create(range.upperBound, this.f20559d);
                    this.f20559d = range.lowerBound;
                    if (c.this.f20554d.lowerBound.isLessThan(rangeCreate.lowerBound)) {
                        return Maps.e(rangeCreate.lowerBound, rangeCreate);
                    }
                } else if (c.this.f20554d.lowerBound.isLessThan(Cut.belowAll())) {
                    Range rangeCreate2 = Range.create(Cut.belowAll(), this.f20559d);
                    this.f20559d = Cut.belowAll();
                    return Maps.e(Cut.belowAll(), rangeCreate2);
                }
                return (Map.Entry) b();
            }
        }

        public c(NavigableMap<Cut<C>, Range<C>> navigableMap) {
            this(navigableMap, Range.all());
        }

        public c(NavigableMap<Cut<C>, Range<C>> navigableMap, Range<Cut<C>> range) {
            this.f20552b = navigableMap;
            this.f20553c = new d(navigableMap);
            this.f20554d = range;
        }

        @Override // com.google.common.collect.Maps.e
        public Iterator<Map.Entry<Cut<C>, Range<C>>> a() {
            Collection<Range<C>> collectionValues;
            Cut cutBelowAll;
            if (this.f20554d.hasLowerBound()) {
                collectionValues = this.f20553c.tailMap((Cut) this.f20554d.lowerEndpoint(), this.f20554d.lowerBoundType() == BoundType.CLOSED).values();
            } else {
                collectionValues = this.f20553c.values();
            }
            g2 g2VarQ = Iterators.q(collectionValues.iterator());
            if (this.f20554d.contains(Cut.belowAll()) && (!g2VarQ.hasNext() || ((Range) g2VarQ.peek()).lowerBound != Cut.belowAll())) {
                cutBelowAll = Cut.belowAll();
            } else {
                if (!g2VarQ.hasNext()) {
                    return Iterators.g();
                }
                cutBelowAll = ((Range) g2VarQ.next()).upperBound;
            }
            return new a(cutBelowAll, g2VarQ);
        }

        @Override // com.google.common.collect.e
        public Iterator<Map.Entry<Cut<C>, Range<C>>> b() {
            Cut<C> cutHigherKey;
            g2 g2VarQ = Iterators.q(this.f20553c.headMap(this.f20554d.hasUpperBound() ? (Cut) this.f20554d.upperEndpoint() : Cut.aboveAll(), this.f20554d.hasUpperBound() && this.f20554d.upperBoundType() == BoundType.CLOSED).descendingMap().values().iterator());
            if (g2VarQ.hasNext()) {
                cutHigherKey = ((Range) g2VarQ.peek()).upperBound == Cut.aboveAll() ? ((Range) g2VarQ.next()).lowerBound : this.f20552b.higherKey(((Range) g2VarQ.peek()).upperBound);
            } else {
                if (!this.f20554d.contains(Cut.belowAll()) || this.f20552b.containsKey(Cut.belowAll())) {
                    return Iterators.g();
                }
                cutHigherKey = this.f20552b.higherKey(Cut.belowAll());
            }
            return new b((Cut) m5.g.a(cutHigherKey, Cut.aboveAll()), g2VarQ);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Range<C> get(Object obj) {
            if (obj instanceof Cut) {
                try {
                    Cut<C> cut = (Cut) obj;
                    Map.Entry<Cut<C>, Range<C>> entryFirstEntry = tailMap(cut, true).firstEntry();
                    if (entryFirstEntry != null && entryFirstEntry.getKey().equals(cut)) {
                        return entryFirstEntry.getValue();
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        public final NavigableMap<Cut<C>, Range<C>> h(Range<Cut<C>> range) {
            if (!this.f20554d.isConnected(range)) {
                return ImmutableSortedMap.of();
            }
            return new c(this.f20552b, range.intersection(this.f20554d));
        }

        @Override // java.util.SortedMap
        public Comparator<? super Cut<C>> comparator() {
            return Ordering.natural();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            if (get(obj) != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public NavigableMap<Cut<C>, Range<C>> headMap(Cut<C> cut, boolean z10) {
            return h(Range.upTo(cut, BoundType.forBoolean(z10)));
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public NavigableMap<Cut<C>, Range<C>> subMap(Cut<C> cut, boolean z10, Cut<C> cut2, boolean z11) {
            return h(Range.range(cut, BoundType.forBoolean(z10), cut2, BoundType.forBoolean(z11)));
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public NavigableMap<Cut<C>, Range<C>> tailMap(Cut<C> cut, boolean z10) {
            return h(Range.downTo(cut, BoundType.forBoolean(z10)));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return Iterators.w(a());
        }
    }

    public static final class d<C extends Comparable<?>> extends com.google.common.collect.e<Cut<C>, Range<C>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final NavigableMap<Cut<C>, Range<C>> f20563b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Range<Cut<C>> f20564c;

        public class a extends AbstractIterator<Map.Entry<Cut<C>, Range<C>>> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Iterator f20565d;

            public a(Iterator it) {
                this.f20565d = it;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.google.common.collect.AbstractIterator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry<Cut<C>, Range<C>> a() {
                if (!this.f20565d.hasNext()) {
                    return (Map.Entry) b();
                }
                Range range = (Range) this.f20565d.next();
                return d.this.f20564c.upperBound.isLessThan(range.upperBound) ? (Map.Entry) b() : Maps.e(range.upperBound, range);
            }
        }

        public class b extends AbstractIterator<Map.Entry<Cut<C>, Range<C>>> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ g2 f20567d;

            public b(g2 g2Var) {
                this.f20567d = g2Var;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.google.common.collect.AbstractIterator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry<Cut<C>, Range<C>> a() {
                if (!this.f20567d.hasNext()) {
                    return (Map.Entry) b();
                }
                Range range = (Range) this.f20567d.next();
                return d.this.f20564c.lowerBound.isLessThan(range.upperBound) ? Maps.e(range.upperBound, range) : (Map.Entry) b();
            }
        }

        public d(NavigableMap<Cut<C>, Range<C>> navigableMap) {
            this.f20563b = navigableMap;
            this.f20564c = Range.all();
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // com.google.common.collect.Maps.e
        public Iterator<Map.Entry<Cut<C>, Range<C>>> a() {
            Map.Entry<Cut<C>, Range<C>> entryLowerEntry;
            Iterator<Range<C>> it;
            if (this.f20564c.hasLowerBound() && (entryLowerEntry = this.f20563b.lowerEntry((Cut) this.f20564c.lowerEndpoint())) != null) {
                it = this.f20564c.lowerBound.isLessThan(entryLowerEntry.getValue().upperBound) ? this.f20563b.tailMap(entryLowerEntry.getKey(), true).values().iterator() : this.f20563b.tailMap((Cut) this.f20564c.lowerEndpoint(), true).values().iterator();
            } else {
                it = this.f20563b.values().iterator();
            }
            return new a(it);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // com.google.common.collect.e
        public Iterator<Map.Entry<Cut<C>, Range<C>>> b() {
            g2 g2VarQ = Iterators.q((this.f20564c.hasUpperBound() ? this.f20563b.headMap((Cut) this.f20564c.upperEndpoint(), false).descendingMap().values() : this.f20563b.descendingMap().values()).iterator());
            if (g2VarQ.hasNext() && this.f20564c.upperBound.isLessThan(((Range) g2VarQ.peek()).upperBound)) {
                g2VarQ.next();
            }
            return new b(g2VarQ);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Range<C> get(Object obj) {
            Map.Entry<Cut<C>, Range<C>> entryLowerEntry;
            if (obj instanceof Cut) {
                try {
                    Cut<C> cut = (Cut) obj;
                    if (this.f20564c.contains(cut) && (entryLowerEntry = this.f20563b.lowerEntry(cut)) != null && entryLowerEntry.getValue().upperBound.equals(cut)) {
                        return entryLowerEntry.getValue();
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        public final NavigableMap<Cut<C>, Range<C>> h(Range<Cut<C>> range) {
            return range.isConnected(this.f20564c) ? new d(this.f20563b, range.intersection(this.f20564c)) : ImmutableSortedMap.of();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            if (this.f20564c.equals(Range.all())) {
                return this.f20563b.isEmpty();
            }
            return !a().hasNext();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f20564c.equals(Range.all()) ? this.f20563b.size() : Iterators.w(a());
        }

        @Override // java.util.SortedMap
        public Comparator<? super Cut<C>> comparator() {
            return Ordering.natural();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            if (get(obj) != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public NavigableMap<Cut<C>, Range<C>> headMap(Cut<C> cut, boolean z10) {
            return h(Range.upTo(cut, BoundType.forBoolean(z10)));
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public NavigableMap<Cut<C>, Range<C>> subMap(Cut<C> cut, boolean z10, Cut<C> cut2, boolean z11) {
            return h(Range.range(cut, BoundType.forBoolean(z10), cut2, BoundType.forBoolean(z11)));
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public NavigableMap<Cut<C>, Range<C>> tailMap(Cut<C> cut, boolean z10) {
            return h(Range.downTo(cut, BoundType.forBoolean(z10)));
        }

        public d(NavigableMap<Cut<C>, Range<C>> navigableMap, Range<Cut<C>> range) {
            this.f20563b = navigableMap;
            this.f20564c = range;
        }
    }

    public static final class e<C extends Comparable<?>> extends com.google.common.collect.e<Cut<C>, Range<C>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Range<Cut<C>> f20569b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Range<C> f20570c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final NavigableMap<Cut<C>, Range<C>> f20571d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final NavigableMap<Cut<C>, Range<C>> f20572e;

        public class a extends AbstractIterator<Map.Entry<Cut<C>, Range<C>>> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Iterator f20573d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Cut f20574e;

            public a(Iterator it, Cut cut) {
                this.f20573d = it;
                this.f20574e = cut;
            }

            @Override // com.google.common.collect.AbstractIterator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry<Cut<C>, Range<C>> a() {
                if (!this.f20573d.hasNext()) {
                    return (Map.Entry) b();
                }
                Range range = (Range) this.f20573d.next();
                if (this.f20574e.isLessThan(range.lowerBound)) {
                    return (Map.Entry) b();
                }
                Range rangeIntersection = range.intersection(e.this.f20570c);
                return Maps.e(rangeIntersection.lowerBound, rangeIntersection);
            }
        }

        public class b extends AbstractIterator<Map.Entry<Cut<C>, Range<C>>> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Iterator f20576d;

            public b(Iterator it) {
                this.f20576d = it;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.google.common.collect.AbstractIterator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry<Cut<C>, Range<C>> a() {
                if (!this.f20576d.hasNext()) {
                    return (Map.Entry) b();
                }
                Range range = (Range) this.f20576d.next();
                if (e.this.f20570c.lowerBound.compareTo((Cut) range.upperBound) >= 0) {
                    return (Map.Entry) b();
                }
                Range rangeIntersection = range.intersection(e.this.f20570c);
                return e.this.f20569b.contains(rangeIntersection.lowerBound) ? Maps.e(rangeIntersection.lowerBound, rangeIntersection) : (Map.Entry) b();
            }
        }

        public e(Range<Cut<C>> range, Range<C> range2, NavigableMap<Cut<C>, Range<C>> navigableMap) {
            this.f20569b = (Range) m5.l.m(range);
            this.f20570c = (Range) m5.l.m(range2);
            this.f20571d = (NavigableMap) m5.l.m(navigableMap);
            this.f20572e = new d(navigableMap);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // com.google.common.collect.Maps.e
        public Iterator<Map.Entry<Cut<C>, Range<C>>> a() {
            Iterator<Range<C>> it;
            if (this.f20570c.isEmpty()) {
                return Iterators.g();
            }
            if (this.f20569b.upperBound.isLessThan(this.f20570c.lowerBound)) {
                return Iterators.g();
            }
            if (this.f20569b.lowerBound.isLessThan(this.f20570c.lowerBound)) {
                it = this.f20572e.tailMap(this.f20570c.lowerBound, false).values().iterator();
            } else {
                it = this.f20571d.tailMap((Cut) this.f20569b.lowerBound.endpoint(), this.f20569b.lowerBoundType() == BoundType.CLOSED).values().iterator();
            }
            return new a(it, (Cut) Ordering.natural().min(this.f20569b.upperBound, Cut.belowValue(this.f20570c.upperBound)));
        }

        @Override // com.google.common.collect.e
        public Iterator<Map.Entry<Cut<C>, Range<C>>> b() {
            if (this.f20570c.isEmpty()) {
                return Iterators.g();
            }
            Cut cut = (Cut) Ordering.natural().min(this.f20569b.upperBound, Cut.belowValue(this.f20570c.upperBound));
            return new b(this.f20571d.headMap((Cut) cut.endpoint(), cut.typeAsUpperBound() == BoundType.CLOSED).descendingMap().values().iterator());
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Range<C> get(Object obj) {
            if (obj instanceof Cut) {
                try {
                    Cut<C> cut = (Cut) obj;
                    if (this.f20569b.contains(cut) && cut.compareTo((Cut) this.f20570c.lowerBound) >= 0 && cut.compareTo((Cut) this.f20570c.upperBound) < 0) {
                        if (cut.equals(this.f20570c.lowerBound)) {
                            Range range = (Range) Maps.s(this.f20571d.floorEntry(cut));
                            if (range != null && range.upperBound.compareTo((Cut) this.f20570c.lowerBound) > 0) {
                                return range.intersection(this.f20570c);
                            }
                        } else {
                            Range<C> range2 = this.f20571d.get(cut);
                            if (range2 != null) {
                                return range2.intersection(this.f20570c);
                            }
                        }
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        public final NavigableMap<Cut<C>, Range<C>> j(Range<Cut<C>> range) {
            return !range.isConnected(this.f20569b) ? ImmutableSortedMap.of() : new e(this.f20569b.intersection(range), this.f20570c, this.f20571d);
        }

        @Override // java.util.SortedMap
        public Comparator<? super Cut<C>> comparator() {
            return Ordering.natural();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            if (get(obj) != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public NavigableMap<Cut<C>, Range<C>> headMap(Cut<C> cut, boolean z10) {
            return j(Range.upTo(cut, BoundType.forBoolean(z10)));
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public NavigableMap<Cut<C>, Range<C>> subMap(Cut<C> cut, boolean z10, Cut<C> cut2, boolean z11) {
            return j(Range.range(cut, BoundType.forBoolean(z10), cut2, BoundType.forBoolean(z11)));
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public NavigableMap<Cut<C>, Range<C>> tailMap(Cut<C> cut, boolean z10) {
            return j(Range.downTo(cut, BoundType.forBoolean(z10)));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return Iterators.w(a());
        }
    }

    public static <C extends Comparable<?>> TreeRangeSet<C> create() {
        return new TreeRangeSet<>(new TreeMap());
    }

    @Override // com.google.common.collect.f
    public /* bridge */ /* synthetic */ void addAll(i2 i2Var) {
        super.addAll(i2Var);
    }

    @Override // com.google.common.collect.f
    public /* bridge */ /* synthetic */ boolean enclosesAll(i2 i2Var) {
        return super.enclosesAll(i2Var);
    }

    @Override // com.google.common.collect.f, com.google.common.collect.i2
    public /* bridge */ /* synthetic */ void removeAll(i2 i2Var) {
        super.removeAll(i2Var);
    }

    public TreeRangeSet(NavigableMap<Cut<C>, Range<C>> navigableMap) {
        this.rangesByLowerBound = navigableMap;
    }

    public static <C extends Comparable<?>> TreeRangeSet<C> create(i2<C> i2Var) {
        TreeRangeSet<C> treeRangeSetCreate = create();
        treeRangeSetCreate.addAll(i2Var);
        return treeRangeSetCreate;
    }

    @Override // com.google.common.collect.f
    public /* bridge */ /* synthetic */ void addAll(Iterable iterable) {
        super.addAll(iterable);
    }

    public Set<Range<C>> asDescendingSetOfRanges() {
        Set<Range<C>> set = this.f20549c;
        if (set != null) {
            return set;
        }
        b bVar = new b(this, this.rangesByLowerBound.descendingMap().values());
        this.f20549c = bVar;
        return bVar;
    }

    @Override // com.google.common.collect.i2
    public Set<Range<C>> asRanges() {
        Set<Range<C>> set = this.f20548b;
        if (set != null) {
            return set;
        }
        b bVar = new b(this, this.rangesByLowerBound.values());
        this.f20548b = bVar;
        return bVar;
    }

    @Override // com.google.common.collect.i2
    public i2<C> complement() {
        i2<C> i2Var = this.f20550d;
        if (i2Var != null) {
            return i2Var;
        }
        Complement complement = new Complement();
        this.f20550d = complement;
        return complement;
    }

    @Override // com.google.common.collect.f
    public /* bridge */ /* synthetic */ boolean enclosesAll(Iterable iterable) {
        return super.enclosesAll(iterable);
    }

    @Override // com.google.common.collect.f
    public /* bridge */ /* synthetic */ void removeAll(Iterable iterable) {
        super.removeAll(iterable);
    }

    public Range<C> span() {
        Map.Entry<Cut<C>, Range<C>> entryFirstEntry = this.rangesByLowerBound.firstEntry();
        Map.Entry<Cut<C>, Range<C>> entryLastEntry = this.rangesByLowerBound.lastEntry();
        if (entryFirstEntry == null || entryLastEntry == null) {
            throw new NoSuchElementException();
        }
        return Range.create(entryFirstEntry.getValue().lowerBound, entryLastEntry.getValue().upperBound);
    }

    public final Range<C> a(Range<C> range) {
        m5.l.m(range);
        Map.Entry<Cut<C>, Range<C>> entryFloorEntry = this.rangesByLowerBound.floorEntry(range.lowerBound);
        if (entryFloorEntry != null && entryFloorEntry.getValue().encloses(range)) {
            return entryFloorEntry.getValue();
        }
        return null;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.google.common.collect.f
    public void add(Range<C> range) {
        m5.l.m(range);
        if (range.isEmpty()) {
            return;
        }
        Cut<C> cut = range.lowerBound;
        Cut<C> cut2 = range.upperBound;
        Map.Entry<Cut<C>, Range<C>> entryLowerEntry = this.rangesByLowerBound.lowerEntry(cut);
        if (entryLowerEntry != null) {
            Range<C> value = entryLowerEntry.getValue();
            if (value.upperBound.compareTo((Cut) cut) >= 0) {
                if (value.upperBound.compareTo((Cut) cut2) >= 0) {
                    cut2 = value.upperBound;
                }
                cut = value.lowerBound;
            }
        }
        Map.Entry<Cut<C>, Range<C>> entryFloorEntry = this.rangesByLowerBound.floorEntry(cut2);
        if (entryFloorEntry != null) {
            Range<C> value2 = entryFloorEntry.getValue();
            if (value2.upperBound.compareTo((Cut) cut2) >= 0) {
                cut2 = value2.upperBound;
            }
        }
        this.rangesByLowerBound.subMap(cut, cut2).clear();
        b(Range.create(cut, cut2));
    }

    public final void b(Range<C> range) {
        if (range.isEmpty()) {
            this.rangesByLowerBound.remove(range.lowerBound);
        } else {
            this.rangesByLowerBound.put(range.lowerBound, range);
        }
    }

    @Override // com.google.common.collect.f
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.google.common.collect.f
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return super.contains(comparable);
    }

    @Override // com.google.common.collect.f, com.google.common.collect.i2
    public boolean encloses(Range<C> range) {
        m5.l.m(range);
        Map.Entry<Cut<C>, Range<C>> entryFloorEntry = this.rangesByLowerBound.floorEntry(range.lowerBound);
        if (entryFloorEntry != null && entryFloorEntry.getValue().encloses(range)) {
            return true;
        }
        return false;
    }

    @Override // com.google.common.collect.f
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.f
    public boolean intersects(Range<C> range) {
        m5.l.m(range);
        Map.Entry<Cut<C>, Range<C>> entryCeilingEntry = this.rangesByLowerBound.ceilingEntry(range.lowerBound);
        if (entryCeilingEntry != null && entryCeilingEntry.getValue().isConnected(range) && !entryCeilingEntry.getValue().intersection(range).isEmpty()) {
            return true;
        }
        Map.Entry<Cut<C>, Range<C>> entryLowerEntry = this.rangesByLowerBound.lowerEntry(range.lowerBound);
        if (entryLowerEntry != null && entryLowerEntry.getValue().isConnected(range) && !entryLowerEntry.getValue().intersection(range).isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // com.google.common.collect.f, com.google.common.collect.i2
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.f
    public Range<C> rangeContaining(C c10) {
        m5.l.m(c10);
        Map.Entry<Cut<C>, Range<C>> entryFloorEntry = this.rangesByLowerBound.floorEntry(Cut.belowValue(c10));
        if (entryFloorEntry != null && entryFloorEntry.getValue().contains(c10)) {
            return entryFloorEntry.getValue();
        }
        return null;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.common.collect.f
    public void remove(Range<C> range) {
        m5.l.m(range);
        if (range.isEmpty()) {
            return;
        }
        Map.Entry<Cut<C>, Range<C>> entryLowerEntry = this.rangesByLowerBound.lowerEntry(range.lowerBound);
        if (entryLowerEntry != null) {
            Range<C> value = entryLowerEntry.getValue();
            if (value.upperBound.compareTo((Cut) range.lowerBound) >= 0) {
                if (range.hasUpperBound() && value.upperBound.compareTo((Cut) range.upperBound) >= 0) {
                    b(Range.create(range.upperBound, value.upperBound));
                }
                b(Range.create(value.lowerBound, range.lowerBound));
            }
        }
        Map.Entry<Cut<C>, Range<C>> entryFloorEntry = this.rangesByLowerBound.floorEntry(range.upperBound);
        if (entryFloorEntry != null) {
            Range<C> value2 = entryFloorEntry.getValue();
            if (range.hasUpperBound() && value2.upperBound.compareTo((Cut) range.upperBound) >= 0) {
                b(Range.create(range.upperBound, value2.upperBound));
            }
        }
        this.rangesByLowerBound.subMap(range.lowerBound, range.upperBound).clear();
    }

    @Override // com.google.common.collect.i2
    public i2<C> subRangeSet(Range<C> range) {
        if (range.equals(Range.all())) {
            return this;
        }
        return new SubRangeSet(range);
    }

    public static <C extends Comparable<?>> TreeRangeSet<C> create(Iterable<Range<C>> iterable) {
        TreeRangeSet<C> treeRangeSetCreate = create();
        treeRangeSetCreate.addAll(iterable);
        return treeRangeSetCreate;
    }
}
