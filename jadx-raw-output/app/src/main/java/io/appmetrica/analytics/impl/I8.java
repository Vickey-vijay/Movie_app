package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes5.dex */
public final class I8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ec f55340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ec f55341b;

    public I8() {
        this(new W7(), new M9(), new C4074b());
    }

    public I8(W7 w10, M9 m10, C4074b c4074b) {
        Ec ec2 = new Ec(w10);
        this.f55340a = ec2;
        ec2.a(J8.NONE, w10);
        ec2.a(J8.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER, m10);
        ec2.a(J8.AES_VALUE_ENCRYPTION, c4074b);
        this.f55341b = new Ec(w10);
    }
}
