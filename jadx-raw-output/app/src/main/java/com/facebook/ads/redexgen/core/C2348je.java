package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import androidx.core.view.InputDeviceCompat;
import java.io.IOException;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.je, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2348je implements GX {
    public static String[] A0B = {"UBvRkgXOGDkhiRviOullp8V", "VkNaXMTzU8N2w", "EmncOItxREzVuvRcJiesLUTUZ", "GKNHQwhZeE13dvoU8lLSXwuEJRZ0Rb8T", "UfDFEQBLtd8kFCM7fNQpR1e2paOBi7mP", "RVi2VPuM0SECIbGMRSZvlBLvqxfM7S", "lPCpjqdMUX8JsRnbL9v7kcIYKByBL6xe", "JprIbG5eTccKgwX6h6kDKt0luN"};
    public static final InterfaceC1263Gb A0C = new InterfaceC1263Gb() { // from class: com.facebook.ads.redexgen.X.jf
        @Override // com.facebook.ads.redexgen.core.InterfaceC1263Gb
        public final GX[] A5F() {
            return C2348je.A01();
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC1263Gb
        public final /* synthetic */ GX[] A5G(Uri uri, Map map) {
            return AbstractC1262Ga.A01(this, uri, map);
        }
    };
    public long A00;
    public GY A01;
    public C2350jg A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final SparseArray<KV> A07;
    public final C4J A08;
    public final C4R A09;
    public final KU A0A;

    /* JADX WARN: Code duplicated, block: B:73:0x0193  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:79:0x01b7  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.GX
    public final int AGb(InterfaceC2443lN interfaceC2443lN, C1281Gt c1281Gt) throws IOException {
        C3M.A02(this.A01);
        long jA8G = interfaceC2443lN.A8G();
        if ((jA8G != -1) && !this.A0A.A0E()) {
            return this.A0A.A0B(interfaceC2443lN, c1281Gt);
        }
        A00(jA8G);
        if (this.A02 != null && this.A02.A09()) {
            return this.A02.A06(interfaceC2443lN, c1281Gt);
        }
        interfaceC2443lN.AI1();
        long jA8a = jA8G != -1 ? jA8G - interfaceC2443lN.A8a() : -1L;
        if ((jA8a != -1 && jA8a < 4) || !interfaceC2443lN.AGA(this.A08.A0l(), 0, 4, true)) {
            return -1;
        }
        this.A08.A0f(0);
        int iA0C = this.A08.A0C();
        if (iA0C == 441) {
            return -1;
        }
        if (A0B[2].length() == 2) {
            throw new RuntimeException();
        }
        String[] strArr = A0B;
        strArr[5] = "kMhOTVhRWN36SIdb7fVpbVP8KQK8iP";
        strArr[1] = "K6CIMfQf5fCJv";
        if (iA0C == 442) {
            interfaceC2443lN.AG9(this.A08.A0l(), 0, 10);
            this.A08.A0f(9);
            interfaceC2443lN.AJJ((this.A08.A0I() & 7) + 14);
            return 0;
        }
        if (iA0C == 443) {
            interfaceC2443lN.AG9(this.A08.A0l(), 0, 2);
            this.A08.A0f(0);
            interfaceC2443lN.AJJ(this.A08.A0M() + 6);
            return 0;
        }
        if (((iA0C & InputDeviceCompat.SOURCE_ANY) >> 8) != 1) {
            interfaceC2443lN.AJJ(1);
            return 0;
        }
        int i10 = iA0C & 255;
        KV kv = this.A07.get(i10);
        if (!this.A03) {
            if (kv == null) {
                KJ c2360jq = null;
                if (i10 == 189) {
                    c2360jq = new C2370k0();
                    this.A04 = true;
                    this.A00 = interfaceC2443lN.A8f();
                } else {
                    int i11 = i10 & 224;
                    if (A0B[7].length() != 26) {
                        A0B[7] = "MD0211Yr4bYXM5L9ZkPBjN7rOQ";
                        if (i11 == 192) {
                            c2360jq = new C2354jk();
                            this.A04 = true;
                            this.A00 = interfaceC2443lN.A8f();
                        } else if ((i10 & 240) == 224) {
                            c2360jq = new C2360jq();
                            this.A05 = true;
                            this.A00 = interfaceC2443lN.A8f();
                        }
                    } else {
                        String[] strArr2 = A0B;
                        strArr2[6] = "PIHtVurnoe8IajroMJlyufhIBiisymoK";
                        strArr2[4] = "tbo4qyhyaN86Rqnk6vLIVirgmw8EdsC9";
                        if (i11 == 192) {
                            c2360jq = new C2354jk();
                            this.A04 = true;
                            this.A00 = interfaceC2443lN.A8f();
                        } else if ((i10 & 240) == 224) {
                            c2360jq = new C2360jq();
                            this.A05 = true;
                            this.A00 = interfaceC2443lN.A8f();
                        }
                    }
                }
                if (c2360jq != null) {
                    c2360jq.A5U(this.A01, new C1369Ke(i10, 256));
                    kv = new KV(c2360jq, this.A09);
                    this.A07.put(i10, kv);
                }
            }
            if (interfaceC2443lN.A8f() > ((this.A04 && this.A05) ? this.A00 + PlaybackStateCompat.ACTION_PLAY_FROM_URI : PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)) {
                this.A03 = true;
                this.A01.A6G();
            }
        }
        interfaceC2443lN.AG9(this.A08.A0l(), 0, 2);
        this.A08.A0f(0);
        int iA0M = this.A08.A0M() + 6;
        if (kv == null) {
            interfaceC2443lN.AJJ(iA0M);
            return 0;
        }
        this.A08.A0d(iA0M);
        interfaceC2443lN.readFully(this.A08.A0l(), 0, iA0M);
        this.A08.A0f(6);
        kv.A03(this.A08);
        this.A08.A0e(this.A08.A08());
        return 0;
    }

    public C2348je() {
        this(new C4R(0L));
    }

    public C2348je(C4R c4r) {
        this.A09 = c4r;
        this.A08 = new C4J(4096);
        this.A07 = new SparseArray<>();
        this.A0A = new KU();
    }

    @RequiresNonNull({"output"})
    private void A00(long j10) {
        if (!this.A06) {
            this.A06 = true;
            if (this.A0A.A0C() != -9223372036854775807L) {
                this.A02 = new C2350jg(this.A0A.A0D(), this.A0A.A0C(), j10);
                this.A01.AIN(this.A02.A07());
            } else {
                this.A01.AIN(new C2438lI(this.A0A.A0C()));
            }
        }
    }

    public static /* synthetic */ GX[] A01() {
        return new GX[]{new C2348je()};
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AA4(GY gy) {
        this.A01 = gy;
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AGr() {
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AIM(long j10, long j11) {
        boolean z10 = false;
        boolean resetTimestampAdjuster = this.A09.A04() == -9223372036854775807L;
        if (!resetTimestampAdjuster) {
            long jA02 = this.A09.A02();
            if (jA02 != -9223372036854775807L && jA02 != 0 && jA02 != j11) {
                z10 = true;
            }
            resetTimestampAdjuster = z10;
        }
        if (resetTimestampAdjuster) {
            this.A09.A07(j11);
        }
        if (this.A02 != null) {
            this.A02.A08(j11);
        }
        for (int i10 = 0; i10 < this.A07.size(); i10++) {
            this.A07.valueAt(i10).A02();
        }
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final boolean AJL(InterfaceC2443lN interfaceC2443lN) throws IOException {
        byte[] bArr = new byte[14];
        interfaceC2443lN.AG9(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        byte b10 = bArr[13];
        if (A0B[3].charAt(12) == 'n') {
            throw new RuntimeException();
        }
        A0B[2] = "VV5ZPjEmtEUa5x1ycfEwWXr";
        int packStuffingLength = b10 & 7;
        interfaceC2443lN.A3z(packStuffingLength);
        interfaceC2443lN.AG9(bArr, 0, 3);
        int packStuffingLength2 = bArr[0];
        int i10 = (packStuffingLength2 & 255) << 16;
        int packStuffingLength3 = bArr[1];
        int i11 = i10 | ((packStuffingLength3 & 255) << 8);
        int packStuffingLength4 = bArr[2];
        return 1 == ((packStuffingLength4 & 255) | i11);
    }
}
