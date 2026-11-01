package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.q7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4465q7 implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4372me f57552a;

    /* JADX WARN: Multi-variable type inference failed */
    public C4465q7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4440p7 fromModel(C4514s7 c4514s7) {
        C4440p7 c4440p7 = new C4440p7();
        Long l10 = c4514s7.f57651a;
        if (l10 != null) {
            c4440p7.f57494a = l10.longValue();
        }
        Long l11 = c4514s7.f57652b;
        if (l11 != null) {
            c4440p7.f57495b = l11.longValue();
        }
        Boolean bool = c4514s7.f57653c;
        if (bool != null) {
            c4440p7.f57496c = this.f57552a.fromModel(Boolean.valueOf(bool.booleanValue())).intValue();
        }
        return c4440p7;
    }

    public C4465q7(C4372me c4372me) {
        this.f57552a = c4372me;
    }

    public /* synthetic */ C4465q7(C4372me c4372me, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? new C4372me() : c4372me);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4514s7 toModel(C4440p7 c4440p7) {
        C4440p7 c4440p8 = new C4440p7();
        Long lValueOf = Long.valueOf(c4440p7.f57494a);
        if (lValueOf.longValue() == c4440p8.f57494a) {
            lValueOf = null;
        }
        Long lValueOf2 = Long.valueOf(c4440p7.f57495b);
        return new C4514s7(lValueOf, lValueOf2.longValue() != c4440p8.f57495b ? lValueOf2 : null, this.f57552a.a(c4440p7.f57496c));
    }
}
