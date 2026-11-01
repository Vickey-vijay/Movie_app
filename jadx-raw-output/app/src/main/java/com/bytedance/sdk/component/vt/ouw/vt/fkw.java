package com.bytedance.sdk.component.vt.ouw.vt;

/* JADX INFO: loaded from: classes3.dex */
final class fkw {
    public boolean fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public fkw f11963le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public int f11964lh;
    public final byte[] ouw;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public fkw f11965ra;
    public int vt;
    public boolean yu;

    public fkw() {
        this.ouw = new byte[8192];
        this.fkw = true;
        this.yu = false;
    }

    public final fkw ouw() {
        this.yu = true;
        return new fkw(this.ouw, this.vt, this.f11964lh);
    }

    public final fkw vt() {
        fkw fkwVar = this.f11963le;
        fkw fkwVar2 = fkwVar != this ? fkwVar : null;
        fkw fkwVar3 = this.f11965ra;
        if (fkwVar3 != null) {
            fkwVar3.f11963le = fkwVar;
        }
        fkw fkwVar4 = this.f11963le;
        if (fkwVar4 != null) {
            fkwVar4.f11965ra = fkwVar3;
        }
        this.f11963le = null;
        this.f11965ra = null;
        return fkwVar2;
    }

    public final fkw ouw(fkw fkwVar) {
        fkwVar.f11965ra = this;
        fkwVar.f11963le = this.f11963le;
        this.f11963le.f11965ra = fkwVar;
        this.f11963le = fkwVar;
        return fkwVar;
    }

    private fkw(byte[] bArr, int i10, int i11) {
        this.ouw = bArr;
        this.vt = i10;
        this.f11964lh = i11;
        this.yu = true;
        this.fkw = false;
    }
}
