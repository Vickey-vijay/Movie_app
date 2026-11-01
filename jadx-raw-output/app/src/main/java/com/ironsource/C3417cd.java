package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.cd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3417cd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f28363a;

    public C3417cd(String str) {
        ck.p.j(str, "baseControllerUrl");
        this.f28363a = str;
    }

    public final String a() {
        String str = this.f28363a;
        String strSubstring = str.substring(0, lk.a0.r0(str, "/", 0, false, 6, null));
        ck.p.i(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }
}
