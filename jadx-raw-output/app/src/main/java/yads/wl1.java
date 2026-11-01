package yads;

import android.net.Uri;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: classes10.dex */
public final class wl1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f84253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f84254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s51 f84255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f84256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f84257e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f84258f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p51 f84259g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f84260h;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wl1)) {
            return false;
        }
        wl1 wl1Var = (wl1) obj;
        return this.f84253a.equals(wl1Var.f84253a) && ib3.a(this.f84254b, wl1Var.f84254b) && ib3.a(this.f84255c, wl1Var.f84255c) && this.f84256d == wl1Var.f84256d && this.f84258f == wl1Var.f84258f && this.f84257e == wl1Var.f84257e && this.f84259g.equals(wl1Var.f84259g) && Arrays.equals(this.f84260h, wl1Var.f84260h);
    }

    public final byte[] a() {
        byte[] bArr = this.f84260h;
        if (bArr != null) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.f84253a.hashCode() * 31;
        Uri uri = this.f84254b;
        return Arrays.hashCode(this.f84260h) + ((this.f84259g.hashCode() + ((((((((ly2.a(this.f84255c.entrySet()) + ((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31)) * 31) + (this.f84256d ? 1 : 0)) * 31) + (this.f84258f ? 1 : 0)) * 31) + (this.f84257e ? 1 : 0)) * 31)) * 31);
    }

    public wl1(vl1 vl1Var) {
        boolean z10;
        byte[] bArrCopyOf;
        if (vl1Var.f83950f && vl1Var.f83946b == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        ni.b(z10);
        this.f84253a = (UUID) ni.a(vl1Var.f83945a);
        this.f84254b = vl1Var.f83946b;
        this.f84255c = vl1Var.f83947c;
        this.f84256d = vl1Var.f83948d;
        this.f84258f = vl1Var.f83950f;
        this.f84257e = vl1Var.f83949e;
        this.f84259g = vl1Var.f83951g;
        byte[] bArr = vl1Var.f83952h;
        if (bArr != null) {
            bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        } else {
            bArrCopyOf = null;
        }
        this.f84260h = bArrCopyOf;
    }
}
