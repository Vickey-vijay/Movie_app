package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.z6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3349z6 extends C6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short f25829a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3349z6) && this.f25829a == ((C3349z6) obj).f25829a;
    }

    public final int hashCode() {
        return Short.hashCode(this.f25829a);
    }

    public final String toString() {
        return "Failure(errorCode=" + ((int) this.f25829a) + ")";
    }

    public C3349z6(short s10) {
        this.f25829a = s10;
    }
}
