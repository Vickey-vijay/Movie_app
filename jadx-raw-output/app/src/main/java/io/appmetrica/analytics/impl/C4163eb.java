package io.appmetrica.analytics.impl;

import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.eb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4163eb {
    public static final B9 a(C4163eb c4163eb, K9 k10, JSONObject jSONObject) {
        int i10;
        c4163eb.getClass();
        B9 b10 = new B9();
        switch (k10) {
            case UNKNOWN:
                i10 = 0;
                break;
            case APPSFLYER:
                i10 = 1;
                break;
            case ADJUST:
                i10 = 2;
                break;
            case KOCHAVA:
                i10 = 3;
                break;
            case TENJIN:
                i10 = 4;
                break;
            case AIRBRIDGE:
                i10 = 5;
                break;
            case SINGULAR:
                i10 = 6;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        b10.f55013a = i10;
        b10.f55014b = jSONObject.toString().getBytes(lk.c.f63591b);
        return b10;
    }
}
