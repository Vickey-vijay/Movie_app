package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.w2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4609w2 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final W1 fromModel(@NonNull C4659y2 c4659y2) {
        W1 w10 = new W1();
        EnumC4634x2 enumC4634x2 = c4659y2.f57987a;
        if (enumC4634x2 != null) {
            int iOrdinal = enumC4634x2.ordinal();
            if (iOrdinal == 0) {
                w10.f56058a = 6;
            } else if (iOrdinal == 1) {
                w10.f56058a = 1;
            } else if (iOrdinal == 2) {
                w10.f56058a = 2;
            } else if (iOrdinal == 3) {
                w10.f56058a = 3;
            } else if (iOrdinal == 4) {
                w10.f56058a = 4;
            } else if (iOrdinal != 5) {
                w10.f56058a = 0;
            } else {
                w10.f56058a = 5;
            }
        }
        Boolean bool = c4659y2.f57988b;
        if (bool != null) {
            if (bool.booleanValue()) {
                w10.f56059b = 1;
            } else {
                w10.f56059b = 0;
            }
        }
        return w10;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4659y2 toModel(@NonNull W1 w10) {
        EnumC4634x2 enumC4634x2;
        Boolean bool = null;
        switch (w10.f56058a) {
            case 1:
                enumC4634x2 = EnumC4634x2.ACTIVE;
                break;
            case 2:
                enumC4634x2 = EnumC4634x2.WORKING_SET;
                break;
            case 3:
                enumC4634x2 = EnumC4634x2.FREQUENT;
                break;
            case 4:
                enumC4634x2 = EnumC4634x2.RARE;
                break;
            case 5:
                enumC4634x2 = EnumC4634x2.RESTRICTED;
                break;
            case 6:
                enumC4634x2 = EnumC4634x2.EXEMPTED;
                break;
            default:
                enumC4634x2 = null;
                break;
        }
        int i10 = w10.f56059b;
        if (i10 == 0) {
            bool = Boolean.FALSE;
        } else if (i10 == 1) {
            bool = Boolean.TRUE;
        }
        return new C4659y2(enumC4634x2, bool);
    }
}
