package yads;

import android.graphics.Color;

/* JADX INFO: loaded from: classes2.dex */
public final class f33 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f77285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f77286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f77287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f77288e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f77289f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f77290g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f77291h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f77292i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f77293j;

    public static boolean a(String str) {
        try {
            int i10 = Integer.parseInt(str);
            return i10 == 1 || i10 == -1;
        } catch (NumberFormatException e10) {
            ih1.d("SsaStyle", ih1.a("Failed to parse boolean value: '" + str + "'", e10));
            return false;
        }
    }

    public static Integer b(String str) {
        try {
            long j10 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            if (j10 > 4294967295L) {
                throw new IllegalArgumentException();
            }
            return Integer.valueOf(Color.argb(td1.a(((j10 >> 24) & 255) ^ 255), td1.a(j10 & 255), td1.a((j10 >> 8) & 255), td1.a((j10 >> 16) & 255)));
        } catch (IllegalArgumentException e10) {
            ih1.d("SsaStyle", ih1.a("Failed to parse color expression: '" + str + "'", e10));
            return null;
        }
    }

    public f33(String str, int i10, Integer num, Integer num2, float f10, boolean z10, boolean z11, boolean z12, boolean z13, int i11) {
        this.f77284a = str;
        this.f77285b = i10;
        this.f77286c = num;
        this.f77287d = num2;
        this.f77288e = f10;
        this.f77289f = z10;
        this.f77290g = z11;
        this.f77291h = z12;
        this.f77292i = z13;
        this.f77293j = i11;
    }
}
