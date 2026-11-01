package com.mbridge.msdk.thrid.okio;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: Segment.java */
/* JADX INFO: loaded from: classes11.dex */
final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f38069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f38071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f38072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f38073e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o f38074f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public o f38075g;

    public o() {
        this.f38069a = new byte[8192];
        this.f38073e = true;
        this.f38072d = false;
    }

    public final o a(o oVar) {
        oVar.f38075g = this;
        oVar.f38074f = this.f38074f;
        this.f38074f.f38075g = oVar;
        this.f38074f = oVar;
        return oVar;
    }

    public final o c() {
        this.f38072d = true;
        return new o(this.f38069a, this.f38070b, this.f38071c, true, false);
    }

    @Nullable
    public final o b() {
        o oVar = this.f38074f;
        o oVar2 = oVar != this ? oVar : null;
        o oVar3 = this.f38075g;
        oVar3.f38074f = oVar;
        this.f38074f.f38075g = oVar3;
        this.f38074f = null;
        this.f38075g = null;
        return oVar2;
    }

    public o(byte[] bArr, int i10, int i11, boolean z10, boolean z11) {
        this.f38069a = bArr;
        this.f38070b = i10;
        this.f38071c = i11;
        this.f38072d = z10;
        this.f38073e = z11;
    }

    public final o a(int i10) {
        o oVarA;
        if (i10 > 0 && i10 <= this.f38071c - this.f38070b) {
            if (i10 >= 1024) {
                oVarA = c();
            } else {
                oVarA = p.a();
                System.arraycopy(this.f38069a, this.f38070b, oVarA.f38069a, 0, i10);
            }
            oVarA.f38071c = oVarA.f38070b + i10;
            this.f38070b += i10;
            this.f38075g.a(oVarA);
            return oVarA;
        }
        throw new IllegalArgumentException();
    }

    public final void a() {
        o oVar = this.f38075g;
        if (oVar != this) {
            if (oVar.f38073e) {
                int i10 = this.f38071c - this.f38070b;
                if (i10 > (8192 - oVar.f38071c) + (oVar.f38072d ? 0 : oVar.f38070b)) {
                    return;
                }
                a(oVar, i10);
                b();
                p.a(this);
                return;
            }
            return;
        }
        throw new IllegalStateException();
    }

    public final void a(o oVar, int i10) {
        if (oVar.f38073e) {
            int i11 = oVar.f38071c;
            int i12 = i11 + i10;
            if (i12 > 8192) {
                if (!oVar.f38072d) {
                    int i13 = oVar.f38070b;
                    if (i12 - i13 <= 8192) {
                        byte[] bArr = oVar.f38069a;
                        System.arraycopy(bArr, i13, bArr, 0, i11 - i13);
                        oVar.f38071c -= oVar.f38070b;
                        oVar.f38070b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.f38069a, this.f38070b, oVar.f38069a, oVar.f38071c, i10);
            oVar.f38071c += i10;
            this.f38070b += i10;
            return;
        }
        throw new IllegalArgumentException();
    }
}
