package com.google.common.collect;

import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* JADX INFO: compiled from: CollectCollectors.java */
/* JADX INFO: loaded from: classes10.dex */
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Collector<Object, ?, ImmutableList<Object>> f20616a = Collector.of(new Supplier() { // from class: com.google.common.collect.j
        @Override // java.util.function.Supplier
        public final Object get() {
            return ImmutableList.builder();
        }
    }, new BiConsumer() { // from class: com.google.common.collect.m
        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Object obj2) {
            ((ImmutableList.a) obj).a(obj2);
        }
    }, new BinaryOperator() { // from class: com.google.common.collect.n
        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            return ((ImmutableList.a) obj).n((ImmutableList.a) obj2);
        }
    }, new Function() { // from class: com.google.common.collect.o
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((ImmutableList.a) obj).m();
        }
    }, new Collector.Characteristics[0]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Collector<Object, ?, ImmutableSet<Object>> f20617b = Collector.of(new Supplier() { // from class: com.google.common.collect.p
        @Override // java.util.function.Supplier
        public final Object get() {
            return ImmutableSet.builder();
        }
    }, new BiConsumer() { // from class: com.google.common.collect.q
        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Object obj2) {
            ((ImmutableSet.a) obj).a(obj2);
        }
    }, new BinaryOperator() { // from class: com.google.common.collect.r
        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            return ((ImmutableSet.a) obj).o((ImmutableSet.a) obj2);
        }
    }, new Function() { // from class: com.google.common.collect.s
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((ImmutableSet.a) obj).n();
        }
    }, new Collector.Characteristics[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Collector<Range<Comparable<?>>, ?, ImmutableRangeSet<Comparable<?>>> f20618c = Collector.of(new Supplier() { // from class: com.google.common.collect.u
        @Override // java.util.function.Supplier
        public final Object get() {
            return ImmutableRangeSet.builder();
        }
    }, new BiConsumer() { // from class: com.google.common.collect.v
        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Object obj2) {
            ((ImmutableRangeSet.a) obj).a((Range) obj2);
        }
    }, new BinaryOperator() { // from class: com.google.common.collect.k
        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            return ((ImmutableRangeSet.a) obj).d((ImmutableRangeSet.a) obj2);
        }
    }, new Function() { // from class: com.google.common.collect.l
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((ImmutableRangeSet.a) obj).c();
        }
    }, new Collector.Characteristics[0]);

    public static /* synthetic */ TreeMap F(Comparator comparator) {
        return new TreeMap(comparator);
    }

    public static /* synthetic */ ImmutableSortedMap.a G(Comparator comparator) {
        return new ImmutableSortedMap.a(comparator);
    }

    public static /* synthetic */ ImmutableSortedSet.a I(Comparator comparator) {
        return new ImmutableSortedSet.a(comparator);
    }

    public static <E> Collector<E, ?, ImmutableList<E>> J() {
        return (Collector<E, ?, ImmutableList<E>>) f20616a;
    }

    public static <T, K, V> Collector<T, ?, ImmutableListMultimap<K, V>> K(final Function<? super T, ? extends K> function, final Function<? super T, ? extends V> function2) {
        m5.l.n(function, "keyFunction");
        m5.l.n(function2, "valueFunction");
        return Collector.of(new Supplier() { // from class: com.google.common.collect.j0
            @Override // java.util.function.Supplier
            public final Object get() {
                return ImmutableListMultimap.builder();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.k0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                i1.z(function, function2, (ImmutableListMultimap.a) obj, obj2);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.l0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ImmutableListMultimap.a) obj).i((ImmutableListMultimap.a) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.m0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableListMultimap.a) obj).h();
            }
        }, new Collector.Characteristics[0]);
    }

    public static <E extends Comparable<? super E>> Collector<Range<E>, ?, ImmutableRangeSet<E>> O() {
        return (Collector<Range<E>, ?, ImmutableRangeSet<E>>) f20618c;
    }

    public static <E> Collector<E, ?, ImmutableSet<E>> P() {
        return (Collector<E, ?, ImmutableSet<E>>) f20617b;
    }

    public static <T, K, V> Collector<T, ?, ImmutableSetMultimap<K, V>> Q(final Function<? super T, ? extends K> function, final Function<? super T, ? extends V> function2) {
        m5.l.n(function, "keyFunction");
        m5.l.n(function2, "valueFunction");
        return Collector.of(new Supplier() { // from class: com.google.common.collect.a0
            @Override // java.util.function.Supplier
            public final Object get() {
                return ImmutableSetMultimap.builder();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.b0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                i1.E(function, function2, (ImmutableSetMultimap.a) obj, obj2);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.c0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ImmutableSetMultimap.a) obj).i((ImmutableSetMultimap.a) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.d0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableSetMultimap.a) obj).h();
            }
        }, new Collector.Characteristics[0]);
    }

    public static /* synthetic */ void A(Function function, Function function2, ImmutableMap.b bVar, Object obj) {
        bVar.g(function.apply(obj), function2.apply(obj));
    }

    public static /* synthetic */ void B(Function function, ToIntFunction toIntFunction, b2 b2Var, Object obj) {
        b2Var.add(m5.l.m(function.apply(obj)), toIntFunction.applyAsInt(obj));
    }

    public static /* synthetic */ b2 C(b2 b2Var, b2 b2Var2) {
        b2Var.addAll(b2Var2);
        return b2Var;
    }

    public static /* synthetic */ ImmutableMultiset D(b2 b2Var) {
        return ImmutableMultiset.copyFromEntries(b2Var.entrySet());
    }

    public static /* synthetic */ void E(Function function, Function function2, ImmutableSetMultimap.a aVar, Object obj) {
        aVar.d(function.apply(obj), function2.apply(obj));
    }

    public static /* synthetic */ void H(Function function, Function function2, ImmutableSortedMap.a aVar, Object obj) {
        aVar.g(function.apply(obj), function2.apply(obj));
    }

    public static <T, K, V> Collector<T, ?, ImmutableMap<K, V>> L(final Function<? super T, ? extends K> function, final Function<? super T, ? extends V> function2) {
        m5.l.m(function);
        m5.l.m(function2);
        return Collector.of(new Supplier() { // from class: com.google.common.collect.f0
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ImmutableMap.b();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.g0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                i1.A(function, function2, (ImmutableMap.b) obj, obj2);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.h0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ImmutableMap.b) obj).d((ImmutableMap.b) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.i0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableMap.b) obj).c();
            }
        }, new Collector.Characteristics[0]);
    }

    public static <T, K, V> Collector<T, ?, ImmutableMap<K, V>> M(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, BinaryOperator<V> binaryOperator) {
        m5.l.m(function);
        m5.l.m(function2);
        m5.l.m(binaryOperator);
        return Collectors.collectingAndThen(Collectors.toMap(function, function2, binaryOperator, new Supplier() { // from class: com.google.common.collect.a1
            @Override // java.util.function.Supplier
            public final Object get() {
                return new LinkedHashMap();
            }
        }), new Function() { // from class: com.google.common.collect.d1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ImmutableMap.copyOf((Map) obj);
            }
        });
    }

    public static <T, E> Collector<T, ?, ImmutableMultiset<E>> N(final Function<? super T, ? extends E> function, final ToIntFunction<? super T> toIntFunction) {
        m5.l.m(function);
        m5.l.m(toIntFunction);
        return Collector.of(new Supplier() { // from class: com.google.common.collect.e1
            @Override // java.util.function.Supplier
            public final Object get() {
                return LinkedHashMultiset.create();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.f1
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                i1.B(function, toIntFunction, (b2) obj, obj2);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.g1
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return i1.C((b2) obj, (b2) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.h1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return i1.D((b2) obj);
            }
        }, new Collector.Characteristics[0]);
    }

    public static <T, K, V> Collector<T, ?, ImmutableSortedMap<K, V>> R(final Comparator<? super K> comparator, final Function<? super T, ? extends K> function, final Function<? super T, ? extends V> function2) {
        m5.l.m(comparator);
        m5.l.m(function);
        m5.l.m(function2);
        return Collector.of(new Supplier() { // from class: com.google.common.collect.x0
            @Override // java.util.function.Supplier
            public final Object get() {
                return i1.G(comparator);
            }
        }, new BiConsumer() { // from class: com.google.common.collect.y0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                i1.H(function, function2, (ImmutableSortedMap.a) obj, obj2);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.z0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ImmutableSortedMap.a) obj).m((ImmutableSortedMap.a) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.b1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableSortedMap.a) obj).c();
            }
        }, Collector.Characteristics.UNORDERED);
    }

    public static <T, K, V> Collector<T, ?, ImmutableSortedMap<K, V>> S(final Comparator<? super K> comparator, Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, BinaryOperator<V> binaryOperator) {
        m5.l.m(comparator);
        m5.l.m(function);
        m5.l.m(function2);
        m5.l.m(binaryOperator);
        return Collectors.collectingAndThen(Collectors.toMap(function, function2, binaryOperator, new Supplier() { // from class: com.google.common.collect.s0
            @Override // java.util.function.Supplier
            public final Object get() {
                return i1.F(comparator);
            }
        }), new Function() { // from class: com.google.common.collect.t0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ImmutableSortedMap.copyOfSorted((TreeMap) obj);
            }
        });
    }

    public static <E> Collector<E, ?, ImmutableSortedSet<E>> T(final Comparator<? super E> comparator) {
        m5.l.m(comparator);
        return Collector.of(new Supplier() { // from class: com.google.common.collect.n0
            @Override // java.util.function.Supplier
            public final Object get() {
                return i1.I(comparator);
            }
        }, new BiConsumer() { // from class: com.google.common.collect.o0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((ImmutableSortedSet.a) obj).a(obj2);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.q0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ImmutableSortedSet.a) obj).o((ImmutableSortedSet.a) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.r0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableSortedSet.a) obj).n();
            }
        }, new Collector.Characteristics[0]);
    }

    public static <T, K, V> Collector<T, ?, ImmutableListMultimap<K, V>> q(final Function<? super T, ? extends K> function, final Function<? super T, ? extends Stream<? extends V>> function2) {
        m5.l.m(function);
        m5.l.m(function2);
        Function function3 = new Function() { // from class: com.google.common.collect.i
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return i1.t(function, obj);
            }
        };
        Function function4 = new Function() { // from class: com.google.common.collect.t
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return i1.u(function2, obj);
            }
        };
        final MultimapBuilder.d<Object, Object> dVarA = MultimapBuilder.c().a();
        Objects.requireNonNull(dVarA);
        return Collectors.collectingAndThen(s(function3, function4, new Supplier() { // from class: com.google.common.collect.e0
            @Override // java.util.function.Supplier
            public final Object get() {
                return dVarA.g();
            }
        }), new Function() { // from class: com.google.common.collect.p0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ImmutableListMultimap.copyOf((a2) obj);
            }
        });
    }

    public static <T, K, V> Collector<T, ?, ImmutableSetMultimap<K, V>> r(final Function<? super T, ? extends K> function, final Function<? super T, ? extends Stream<? extends V>> function2) {
        m5.l.m(function);
        m5.l.m(function2);
        Function function3 = new Function() { // from class: com.google.common.collect.w
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return i1.v(function, obj);
            }
        };
        Function function4 = new Function() { // from class: com.google.common.collect.x
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return i1.w(function2, obj);
            }
        };
        final MultimapBuilder.f<Object, Object> fVarD = MultimapBuilder.c().d();
        Objects.requireNonNull(fVarD);
        return Collectors.collectingAndThen(s(function3, function4, new Supplier() { // from class: com.google.common.collect.y
            @Override // java.util.function.Supplier
            public final Object get() {
                return fVarD.g();
            }
        }), new Function() { // from class: com.google.common.collect.z
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ImmutableSetMultimap.copyOf((a2) obj);
            }
        });
    }

    public static <T, K, V, M extends a2<K, V>> Collector<T, ?, M> s(final Function<? super T, ? extends K> function, final Function<? super T, ? extends Stream<? extends V>> function2, Supplier<M> supplier) {
        m5.l.m(function);
        m5.l.m(function2);
        m5.l.m(supplier);
        return Collector.of(supplier, new BiConsumer() { // from class: com.google.common.collect.u0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                i1.x(function, function2, (a2) obj, obj2);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.v0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return i1.y((a2) obj, (a2) obj2);
            }
        }, new Collector.Characteristics[0]);
    }

    public static /* synthetic */ Object t(Function function, Object obj) {
        return m5.l.m(function.apply(obj));
    }

    public static /* synthetic */ Stream u(Function function, Object obj) {
        return ((Stream) function.apply(obj)).peek(new w0());
    }

    public static /* synthetic */ Object v(Function function, Object obj) {
        return m5.l.m(function.apply(obj));
    }

    public static /* synthetic */ Stream w(Function function, Object obj) {
        return ((Stream) function.apply(obj)).peek(new w0());
    }

    public static /* synthetic */ void x(Function function, Function function2, a2 a2Var, Object obj) {
        final Collection collection = a2Var.get(function.apply(obj));
        Stream stream = (Stream) function2.apply(obj);
        Objects.requireNonNull(collection);
        stream.forEachOrdered(new Consumer() { // from class: com.google.common.collect.c1
            @Override // java.util.function.Consumer
            public final void accept(Object obj2) {
                collection.add(obj2);
            }
        });
    }

    public static /* synthetic */ a2 y(a2 a2Var, a2 a2Var2) {
        a2Var.putAll(a2Var2);
        return a2Var;
    }

    public static /* synthetic */ void z(Function function, Function function2, ImmutableListMultimap.a aVar, Object obj) {
        aVar.d(function.apply(obj), function2.apply(obj));
    }
}
