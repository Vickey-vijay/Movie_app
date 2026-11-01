package com.google.common.collect;

import com.google.common.primitives.Ints;
import java.io.Serializable;
import java.lang.Comparable;
import java.math.BigInteger;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class DiscreteDomain<C extends Comparable> {
    public final boolean supportsFastOffset;

    public static final class BigIntegerDomain extends DiscreteDomain<BigInteger> implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final BigIntegerDomain f20346b = new BigIntegerDomain();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final BigInteger f20347c = BigInteger.valueOf(Long.MIN_VALUE);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final BigInteger f20348d = BigInteger.valueOf(Long.MAX_VALUE);
        private static final long serialVersionUID = 0;

        public BigIntegerDomain() {
            super(true);
        }

        public String toString() {
            return "DiscreteDomain.bigIntegers()";
        }

        private Object readResolve() {
            return f20346b;
        }

        @Override // com.google.common.collect.DiscreteDomain
        public long distance(BigInteger bigInteger, BigInteger bigInteger2) {
            return bigInteger2.subtract(bigInteger).max(f20347c).min(f20348d).longValue();
        }

        @Override // com.google.common.collect.DiscreteDomain
        public BigInteger next(BigInteger bigInteger) {
            return bigInteger.add(BigInteger.ONE);
        }

        @Override // com.google.common.collect.DiscreteDomain
        public BigInteger offset(BigInteger bigInteger, long j10) {
            j1.c(j10, "distance");
            return bigInteger.add(BigInteger.valueOf(j10));
        }

        @Override // com.google.common.collect.DiscreteDomain
        public BigInteger previous(BigInteger bigInteger) {
            return bigInteger.subtract(BigInteger.ONE);
        }
    }

    public static final class IntegerDomain extends DiscreteDomain<Integer> implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final IntegerDomain f20349b = new IntegerDomain();
        private static final long serialVersionUID = 0;

        public IntegerDomain() {
            super(true);
        }

        public String toString() {
            return "DiscreteDomain.integers()";
        }

        private Object readResolve() {
            return f20349b;
        }

        @Override // com.google.common.collect.DiscreteDomain
        public long distance(Integer num, Integer num2) {
            return ((long) num2.intValue()) - ((long) num.intValue());
        }

        @Override // com.google.common.collect.DiscreteDomain
        public Integer maxValue() {
            return Integer.MAX_VALUE;
        }

        @Override // com.google.common.collect.DiscreteDomain
        public Integer minValue() {
            return Integer.MIN_VALUE;
        }

        @Override // com.google.common.collect.DiscreteDomain
        public Integer next(Integer num) {
            int iIntValue = num.intValue();
            if (iIntValue == Integer.MAX_VALUE) {
                return null;
            }
            return Integer.valueOf(iIntValue + 1);
        }

        @Override // com.google.common.collect.DiscreteDomain
        public Integer offset(Integer num, long j10) {
            j1.c(j10, "distance");
            return Integer.valueOf(Ints.d(num.longValue() + j10));
        }

        @Override // com.google.common.collect.DiscreteDomain
        public Integer previous(Integer num) {
            int iIntValue = num.intValue();
            if (iIntValue == Integer.MIN_VALUE) {
                return null;
            }
            return Integer.valueOf(iIntValue - 1);
        }
    }

    public static final class LongDomain extends DiscreteDomain<Long> implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final LongDomain f20350b = new LongDomain();
        private static final long serialVersionUID = 0;

        public LongDomain() {
            super(true);
        }

        public String toString() {
            return "DiscreteDomain.longs()";
        }

        private Object readResolve() {
            return f20350b;
        }

        @Override // com.google.common.collect.DiscreteDomain
        public long distance(Long l10, Long l11) {
            long jLongValue = l11.longValue() - l10.longValue();
            if (l11.longValue() > l10.longValue() && jLongValue < 0) {
                return Long.MAX_VALUE;
            }
            if (l11.longValue() >= l10.longValue() || jLongValue <= 0) {
                return jLongValue;
            }
            return Long.MIN_VALUE;
        }

        @Override // com.google.common.collect.DiscreteDomain
        public Long maxValue() {
            return Long.MAX_VALUE;
        }

        @Override // com.google.common.collect.DiscreteDomain
        public Long minValue() {
            return Long.MIN_VALUE;
        }

        @Override // com.google.common.collect.DiscreteDomain
        public Long next(Long l10) {
            long jLongValue = l10.longValue();
            if (jLongValue == Long.MAX_VALUE) {
                return null;
            }
            return Long.valueOf(jLongValue + 1);
        }

        @Override // com.google.common.collect.DiscreteDomain
        public Long offset(Long l10, long j10) {
            j1.c(j10, "distance");
            long jLongValue = l10.longValue() + j10;
            if (jLongValue < 0) {
                m5.l.e(l10.longValue() < 0, "overflow");
            }
            return Long.valueOf(jLongValue);
        }

        @Override // com.google.common.collect.DiscreteDomain
        public Long previous(Long l10) {
            long jLongValue = l10.longValue();
            if (jLongValue == Long.MIN_VALUE) {
                return null;
            }
            return Long.valueOf(jLongValue - 1);
        }
    }

    public abstract long distance(C c10, C c11);

    public abstract C next(C c10);

    public abstract C previous(C c10);

    public DiscreteDomain() {
        this(false);
    }

    public C maxValue() {
        throw new NoSuchElementException();
    }

    public C minValue() {
        throw new NoSuchElementException();
    }

    public C offset(C c10, long j10) {
        j1.c(j10, "distance");
        C c11 = c10;
        for (long j11 = 0; j11 < j10; j11++) {
            c11 = (C) next(c11);
            if (c11 == null) {
                throw new IllegalArgumentException("overflowed computing offset(" + c10 + ", " + j10 + ")");
            }
        }
        return c11;
    }

    public DiscreteDomain(boolean z10) {
        this.supportsFastOffset = z10;
    }

    public static DiscreteDomain<BigInteger> bigIntegers() {
        return BigIntegerDomain.f20346b;
    }

    public static DiscreteDomain<Integer> integers() {
        return IntegerDomain.f20349b;
    }

    public static DiscreteDomain<Long> longs() {
        return LongDomain.f20350b;
    }
}
