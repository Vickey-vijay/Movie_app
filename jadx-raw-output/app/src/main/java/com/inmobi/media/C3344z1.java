package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.z1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3344z1 extends Q9 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f25820g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f25821h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3344z1(String str, int i10, String str2) {
        super("AppExitReasonReporting", "AppExitReasonEvent", AbstractC2940il.a("reason - " + i10 + " description - " + (str == null ? "ApplicationExit" : str), str2));
        ck.p.j(str2, "trace");
        this.f25820g = i10;
        this.f25821h = str2;
    }
}
