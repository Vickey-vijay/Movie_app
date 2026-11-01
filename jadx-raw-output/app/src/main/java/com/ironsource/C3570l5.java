package com.ironsource;

import java.util.Date;

/* JADX INFO: renamed from: com.ironsource.l5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C3570l5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f29399a = new Date().getTime();

    public static long a(C3570l5 c3570l5) {
        if (c3570l5 == null) {
            return 0L;
        }
        return new Date().getTime() - c3570l5.f29399a;
    }
}
