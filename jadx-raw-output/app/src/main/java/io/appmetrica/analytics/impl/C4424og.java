package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.og, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4424og {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f57445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f57446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f57447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final EnumC4399ng f57448d;

    public C4424og(byte[] bArr) throws InvalidProtocolBufferNanoException {
        C4449pg c4449pgA = C4449pg.a(bArr);
        this.f57445a = c4449pgA.f57514a;
        this.f57446b = c4449pgA.f57516c;
        this.f57447c = c4449pgA.f57515b;
        this.f57448d = a(c4449pgA.f57517d);
    }

    public final byte[] a() {
        C4449pg c4449pg = new C4449pg();
        c4449pg.f57514a = this.f57445a;
        c4449pg.f57516c = this.f57446b;
        c4449pg.f57515b = this.f57447c;
        int iOrdinal = this.f57448d.ordinal();
        int i10 = 2;
        if (iOrdinal == 1) {
            i10 = 1;
        } else if (iOrdinal != 2) {
            i10 = 0;
        }
        c4449pg.f57517d = i10;
        return MessageNano.toByteArray(c4449pg);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4424og.class != obj.getClass()) {
            return false;
        }
        C4424og c4424og = (C4424og) obj;
        return this.f57446b == c4424og.f57446b && this.f57447c == c4424og.f57447c && this.f57445a.equals(c4424og.f57445a) && this.f57448d == c4424og.f57448d;
    }

    public final int hashCode() {
        int iHashCode = this.f57445a.hashCode() * 31;
        long j10 = this.f57446b;
        int i10 = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f57447c;
        return this.f57448d.hashCode() + ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31);
    }

    public final String toString() {
        return "ReferrerInfo{installReferrer='" + this.f57445a + "', referrerClickTimestampSeconds=" + this.f57446b + ", installBeginTimestampSeconds=" + this.f57447c + ", source=" + this.f57448d + '}';
    }

    public C4424og(String str, long j10, long j11, EnumC4399ng enumC4399ng) {
        this.f57445a = str;
        this.f57446b = j10;
        this.f57447c = j11;
        this.f57448d = enumC4399ng;
    }

    public static EnumC4399ng a(int i10) {
        if (i10 == 1) {
            return EnumC4399ng.f57350c;
        }
        if (i10 != 2) {
            return EnumC4399ng.f57349b;
        }
        return EnumC4399ng.f57351d;
    }
}
