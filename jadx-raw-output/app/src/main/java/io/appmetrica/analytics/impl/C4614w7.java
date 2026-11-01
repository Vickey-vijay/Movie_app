package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.math.BigDecimal;
import java.math.BigInteger;
import kotlin.Pair;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.w7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4614w7 implements ProtobufConverter {
    @NonNull
    public final BigDecimal a(@NonNull C4238h8 c4238h8) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4238h8 fromModel(@NonNull BigDecimal bigDecimal) {
        BigInteger bigInteger = AbstractC4664y7.f58015a;
        int i10 = -bigDecimal.scale();
        BigInteger bigIntegerUnscaledValue = bigDecimal.unscaledValue();
        while (true) {
            if (bigIntegerUnscaledValue.compareTo(AbstractC4664y7.f58015a) <= 0 && bigIntegerUnscaledValue.compareTo(AbstractC4664y7.f58016b) >= 0) {
                Pair pairA = mj.h.a(Long.valueOf(bigIntegerUnscaledValue.longValue()), Integer.valueOf(i10));
                C4639x7 c4639x7 = new C4639x7(((Number) pairA.getFirst()).longValue(), ((Number) pairA.getSecond()).intValue());
                C4238h8 c4238h8 = new C4238h8();
                c4238h8.f56881a = c4639x7.f57916a;
                c4238h8.f56882b = c4639x7.f57917b;
                return c4238h8;
            }
            bigIntegerUnscaledValue = bigIntegerUnscaledValue.divide(BigInteger.TEN);
            i10++;
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }
}
