package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.u7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4564u7 implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4489r7 f57758a;

    /* JADX WARN: Multi-variable type inference failed */
    public C4564u7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ContentValues fromModel(C4539t7 c4539t7) {
        ContentValues contentValues = new ContentValues();
        Long l10 = c4539t7.f57703a;
        if (l10 != null) {
            contentValues.put("id", Long.valueOf(l10.longValue()));
        }
        Wk wk2 = c4539t7.f57704b;
        if (wk2 != null) {
            contentValues.put("type", Integer.valueOf(wk2.f56124a));
        }
        String str = c4539t7.f57705c;
        if (str != null) {
            contentValues.put("report_request_parameters", str);
        }
        C4489r7 c4489r7 = this.f57758a;
        contentValues.put("session_description", MessageNano.toByteArray(c4489r7.f57592a.fromModel(c4539t7.f57706d)));
        return contentValues;
    }

    public C4564u7(C4489r7 c4489r7) {
        this.f57758a = c4489r7;
    }

    public /* synthetic */ C4564u7(C4489r7 c4489r7, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? new C4489r7(null, 1, null) : c4489r7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4539t7 toModel(ContentValues contentValues) {
        Wk wk2;
        int iIntValue;
        Long asLong = contentValues.getAsLong("id");
        Integer asInteger = contentValues.getAsInteger("type");
        if (asInteger != null) {
            Integer numValueOf = Integer.valueOf(asInteger.intValue());
            wk2 = Wk.FOREGROUND;
            if (numValueOf != null && (iIntValue = numValueOf.intValue()) != 0 && iIntValue == 1) {
                wk2 = Wk.BACKGROUND;
            }
        } else {
            wk2 = null;
        }
        return new C4539t7(asLong, wk2, contentValues.getAsString("report_request_parameters"), this.f57758a.toModel(contentValues.getAsByteArray("session_description")));
    }
}
