package io.bidmachine.analytics.internal;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "", "a", "(Ljava/lang/Object;)Ljava/lang/Float;", "bidmachine-android-sdk_bh_3_3_0"}, k = 2, mv = {1, 7, 1})
public final class a0 {
    public static final Float a(Object obj) {
        if (obj instanceof Number) {
            return Float.valueOf(((Number) obj).floatValue());
        }
        if (obj instanceof String) {
            return lk.v.p((String) obj);
        }
        return null;
    }
}
