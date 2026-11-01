package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import java.io.EOFException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f17043a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f17044b = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(0, new byte[65025]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17045c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f17047e;

    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) throws InterruptedException, EOFException {
        int i10;
        int i11;
        int i12;
        if (this.f17047e) {
            this.f17047e = false;
            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = this.f17044b;
            nVar.f17846b = 0;
            nVar.f17847c = 0;
        }
        while (true) {
            if (this.f17047e) {
                return true;
            }
            if (this.f17045c < 0) {
                if (!this.f17043a.a(bVar, true)) {
                    return false;
                }
                g gVar = this.f17043a;
                int i13 = gVar.f17052d;
                if ((gVar.f17049a & 1) == 1 && this.f17044b.f17847c == 0) {
                    this.f17046d = 0;
                    int i14 = 0;
                    do {
                        int i15 = this.f17046d;
                        g gVar2 = this.f17043a;
                        if (i15 >= gVar2.f17051c) {
                            break;
                        }
                        int[] iArr = gVar2.f17054f;
                        this.f17046d = i15 + 1;
                        i12 = iArr[i15];
                        i14 += i12;
                    } while (i12 == 255);
                    i13 += i14;
                    i11 = this.f17046d;
                } else {
                    i11 = 0;
                }
                bVar.a(i13);
                this.f17045c = i11;
            }
            int i16 = this.f17045c;
            this.f17046d = 0;
            int i17 = 0;
            do {
                int i18 = this.f17046d;
                int i19 = i16 + i18;
                g gVar3 = this.f17043a;
                if (i19 >= gVar3.f17051c) {
                    break;
                }
                int[] iArr2 = gVar3.f17054f;
                this.f17046d = i18 + 1;
                i10 = iArr2[i19];
                i17 += i10;
            } while (i10 == 255);
            int i20 = this.f17045c + this.f17046d;
            if (i17 > 0) {
                int iA = this.f17044b.a();
                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.f17044b;
                int i21 = nVar2.f17847c + i17;
                if (iA < i21) {
                    nVar2.f17845a = Arrays.copyOf(nVar2.f17845a, i21);
                }
                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar3 = this.f17044b;
                bVar.b(nVar3.f17845a, nVar3.f17847c, i17, false);
                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar4 = this.f17044b;
                nVar4.d(nVar4.f17847c + i17);
                this.f17047e = this.f17043a.f17054f[i20 + (-1)] != 255;
            }
            if (i20 == this.f17043a.f17051c) {
                i20 = -1;
            }
            this.f17045c = i20;
        }
    }

    public final void a() {
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = this.f17044b;
        byte[] bArr = nVar.f17845a;
        if (bArr.length == 65025) {
            return;
        }
        nVar.f17845a = Arrays.copyOf(bArr, Math.max(65025, nVar.f17847c));
    }
}
