package com.fyber.inneractive.sdk.player.exoplayer2;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes2.dex */
public final class s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s f17526d = new s(1.0f, 1.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f17527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f17528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17529c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        return this.f17527a == sVar.f17527a && this.f17528b == sVar.f17528b;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f17528b) + ((Float.floatToRawIntBits(this.f17527a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    public s(float f10, float f11) {
        this.f17527a = f10;
        this.f17528b = f11;
        this.f17529c = Math.round(f10 * 1000.0f);
    }
}
