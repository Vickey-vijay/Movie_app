package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class gm0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final gm0 f77854c = new gm0(1, "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCznqFqHos01bT613or9cQ8OWXEB0nvx8UZ//V75T+fb1IDn1/lPBwGY/OK5RfQYuqeIKoKasqfwtRo3sr8dJ+SDm29Brh3lV9r+apohla+GIAyYd5wcJugMfVH5z9SBxh19ukg+GiIvvDpmgi0M8gNVo6Nk21tkEgFxc9FfdT/HwIDAQAB");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f77856b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gm0)) {
            return false;
        }
        gm0 gm0Var = (gm0) obj;
        return ck.p.e(this.f77855a, gm0Var.f77855a) && this.f77856b == gm0Var.f77856b;
    }

    public final String a() {
        return this.f77855a;
    }

    public final int b() {
        return this.f77856b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f77856b) + (this.f77855a.hashCode() * 31);
    }

    public final String toString() {
        return "EncryptionParameters(publicKey=" + this.f77855a + ", version=" + this.f77856b + ")";
    }

    public gm0(int i10, String str) {
        this.f77855a = str;
        this.f77856b = i10;
    }
}
