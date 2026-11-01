package com.ironsource;

/* JADX INFO: loaded from: classes7.dex */
public final class J4 implements Me<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26857b;

    public J4(String str, String str2) {
        ck.p.j(str, "encryptedResponse");
        ck.p.j(str2, "descriptionKey");
        this.f26856a = str;
        this.f26857b = str2;
    }

    @Override // com.ironsource.Me
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String a() {
        String strB = N9.b(this.f26857b, this.f26856a);
        if (strB == null || strB.length() == 0) {
            throw new IllegalArgumentException("Decryption failed");
        }
        ck.p.i(strB, "value");
        return strB;
    }
}
