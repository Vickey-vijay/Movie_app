package com.inmobi.media;

/* JADX INFO: loaded from: classes7.dex */
public final class Qa extends Sa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23380a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Qa) && this.f23380a == ((Qa) obj).f23380a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f23380a);
    }

    public final String toString() {
        return "InValid(errorCode=" + this.f23380a + ")";
    }

    public Qa(int i10) {
        this.f23380a = i10;
    }
}
