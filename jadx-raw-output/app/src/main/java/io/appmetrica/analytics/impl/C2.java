package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* JADX INFO: loaded from: classes2.dex */
public class C2 implements ExternalAttribution {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B9 f55072a;

    @Override // io.appmetrica.analytics.ExternalAttribution
    public final byte[] toBytes() {
        return MessageNano.toByteArray(this.f55072a);
    }

    public final String toString() {
        return "ExternalAttribution(type=`" + L9.a(this.f55072a.f55013a) + "`value=`" + new String(this.f55072a.f55014b, lk.c.f63591b) + "`)";
    }

    public C2(B9 b10) {
        this.f55072a = b10;
    }
}
