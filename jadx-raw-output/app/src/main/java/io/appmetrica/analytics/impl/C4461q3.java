package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.q3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4461q3 implements InterfaceC4687z5 {
    @Override // io.appmetrica.analytics.impl.InterfaceC4687z5, bk.l
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, String> invoke(ContentValues contentValues) {
        String asString = contentValues.getAsString("clids");
        HashMap mapC = AbstractC4241hb.c(asString);
        if (Gm.a(mapC)) {
            return mapC;
        }
        AbstractC4223gj.a("Passed clids (" + asString + ") are invalid.", new Object[0]);
        return null;
    }
}
