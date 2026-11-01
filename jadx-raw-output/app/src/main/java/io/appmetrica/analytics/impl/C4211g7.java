package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.g7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4211g7 implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4134d7 f56796a;

    /* JADX WARN: Multi-variable type inference failed */
    public C4211g7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ContentValues fromModel(C4185f7 c4185f7) {
        ContentValues contentValues = new ContentValues();
        Long l10 = c4185f7.f56715a;
        if (l10 != null) {
            contentValues.put("session_id", Long.valueOf(l10.longValue()));
        }
        Wk wk2 = c4185f7.f56716b;
        if (wk2 != null) {
            contentValues.put("session_type", Integer.valueOf(wk2.f56124a));
        }
        Long l11 = c4185f7.f56717c;
        if (l11 != null) {
            contentValues.put("number_in_session", Long.valueOf(l11.longValue()));
        }
        EnumC4112cb enumC4112cb = c4185f7.f56718d;
        if (enumC4112cb != null) {
            contentValues.put("type", Integer.valueOf(enumC4112cb.f56509a));
        }
        Long l12 = c4185f7.f56719e;
        if (l12 != null) {
            contentValues.put("global_number", Long.valueOf(l12.longValue()));
        }
        Long l13 = c4185f7.f56720f;
        if (l13 != null) {
            contentValues.put("time", Long.valueOf(l13.longValue()));
        }
        C4134d7 c4134d7 = this.f56796a;
        contentValues.put("event_description", MessageNano.toByteArray(c4134d7.f56573a.fromModel(c4185f7.f56721g)));
        return contentValues;
    }

    public C4211g7(C4134d7 c4134d7) {
        this.f56796a = c4134d7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C4211g7(C4134d7 c4134d7, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? new C4134d7(null, 1, 0 == true ? 1 : 0) : c4134d7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4185f7 toModel(ContentValues contentValues) {
        Wk wk2;
        int iIntValue;
        Long asLong = contentValues.getAsLong("session_id");
        Integer asInteger = contentValues.getAsInteger("session_type");
        if (asInteger != null) {
            Integer numValueOf = Integer.valueOf(asInteger.intValue());
            wk2 = Wk.FOREGROUND;
            if (numValueOf != null && (iIntValue = numValueOf.intValue()) != 0 && iIntValue == 1) {
                wk2 = Wk.BACKGROUND;
            }
        } else {
            wk2 = null;
        }
        Long asLong2 = contentValues.getAsLong("number_in_session");
        Integer asInteger2 = contentValues.getAsInteger("type");
        return new C4185f7(asLong, wk2, asLong2, asInteger2 != null ? EnumC4112cb.a(asInteger2.intValue()) : null, contentValues.getAsLong("global_number"), contentValues.getAsLong("time"), this.f56796a.toModel(contentValues.getAsByteArray("event_description")));
    }
}
