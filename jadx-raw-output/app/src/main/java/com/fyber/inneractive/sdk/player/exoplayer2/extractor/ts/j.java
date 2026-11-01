package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements h {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final double[] f17187n = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f17188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f17189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f17190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f17191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean[] f17192e = new boolean[4];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f17193f = new i();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f17194g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f17195h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f17196i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f17197j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f17198k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f17199l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f17200m;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a() {
        com.fyber.inneractive.sdk.player.exoplayer2.util.l.a(this.f17192e);
        i iVar = this.f17193f;
        iVar.f17183a = false;
        iVar.f17184b = 0;
        iVar.f17185c = 0;
        this.f17197j = false;
        this.f17194g = false;
        this.f17195h = 0L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void b() {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.f17188a = e0Var.f17165e;
        e0Var.b();
        this.f17189b = jVar.a(e0Var.f17164d, 2);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(boolean z10, long j10) {
        boolean z11 = j10 != -9223372036854775807L;
        this.f17197j = z11;
        if (z11) {
            this.f17196i = j10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0109  */
    /* JADX WARN: Code duplicated, block: B:50:0x010d  */
    /* JADX WARN: Code duplicated, block: B:52:0x011d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        boolean z10;
        float f10;
        int i10;
        float f11;
        long j10;
        int i11;
        double[] dArr;
        double d10;
        int i12;
        int i13;
        int i14 = nVar.f17846b;
        int i15 = nVar.f17847c;
        byte[] bArr = nVar.f17845a;
        int i16 = i15 - i14;
        this.f17195h += (long) i16;
        this.f17189b.a(i16, nVar);
        int i17 = i14;
        while (true) {
            int iA = com.fyber.inneractive.sdk.player.exoplayer2.util.l.a(bArr, i14, i15, this.f17192e);
            if (iA == i15) {
                break;
            }
            int i18 = iA + 3;
            boolean z11 = nVar.f17845a[i18] & 255;
            if (!this.f17190c) {
                int i19 = iA - i17;
                if (i19 > 0) {
                    i iVar = this.f17193f;
                    if (iVar.f17183a) {
                        byte[] bArr2 = iVar.f17186d;
                        int length = bArr2.length;
                        int i20 = iVar.f17184b + i19;
                        if (length < i20) {
                            iVar.f17186d = Arrays.copyOf(bArr2, i20 * 2);
                        }
                        System.arraycopy(bArr, i17, iVar.f17186d, iVar.f17184b, i19);
                        iVar.f17184b += i19;
                    }
                }
                int i21 = i19 < 0 ? -i19 : 0;
                i iVar2 = this.f17193f;
                if (iVar2.f17183a) {
                    if (iVar2.f17185c == 0 && z11 == 181) {
                        iVar2.f17185c = iVar2.f17184b;
                    } else {
                        int i22 = iVar2.f17184b - i21;
                        iVar2.f17184b = i22;
                        iVar2.f17183a = false;
                        String str = this.f17188a;
                        byte[] bArrCopyOf = Arrays.copyOf(iVar2.f17186d, i22);
                        int i23 = bArrCopyOf[4] & 255;
                        byte b10 = bArrCopyOf[5];
                        int i24 = (i23 << 4) | ((b10 & 255) >> 4);
                        int i25 = ((b10 & 15) << 8) | (bArrCopyOf[6] & 255);
                        int i26 = (bArrCopyOf[7] & 240) >> 4;
                        if (i26 == 2) {
                            f10 = i25 * 4;
                            i10 = i24 * 3;
                        } else if (i26 != 3) {
                            if (i26 != 4) {
                                f11 = 1.0f;
                            } else {
                                f10 = i25 * 121;
                                i10 = i24 * 100;
                            }
                            com.fyber.inneractive.sdk.player.exoplayer2.o oVarA = com.fyber.inneractive.sdk.player.exoplayer2.o.a(str, "video/mpeg2", -1, i24, i25, Collections.singletonList(bArrCopyOf), -1, f11, null, -1, null, null);
                            j10 = 0;
                            i11 = (bArrCopyOf[7] & 15) - 1;
                            if (i11 >= 0) {
                                dArr = f17187n;
                                if (i11 < 8) {
                                    d10 = dArr[i11];
                                    byte b11 = bArrCopyOf[iVar2.f17185c + 9];
                                    i12 = (b11 & 96) >> 5;
                                    i13 = b11 & 31;
                                    if (i12 != i13) {
                                        d10 *= (((double) i12) + 1.0d) / ((double) (i13 + 1));
                                    }
                                    j10 = (long) (1000000.0d / d10);
                                }
                            }
                            Pair pairCreate = Pair.create(oVarA, Long.valueOf(j10));
                            this.f17189b.a((com.fyber.inneractive.sdk.player.exoplayer2.o) pairCreate.first);
                            this.f17191d = ((Long) pairCreate.second).longValue();
                            this.f17190c = true;
                        } else {
                            f10 = i25 * 16;
                            i10 = i24 * 9;
                        }
                        f11 = f10 / i10;
                        com.fyber.inneractive.sdk.player.exoplayer2.o oVarA2 = com.fyber.inneractive.sdk.player.exoplayer2.o.a(str, "video/mpeg2", -1, i24, i25, Collections.singletonList(bArrCopyOf), -1, f11, null, -1, null, null);
                        j10 = 0;
                        i11 = (bArrCopyOf[7] & 15) - 1;
                        if (i11 >= 0) {
                            dArr = f17187n;
                            if (i11 < 8) {
                                d10 = dArr[i11];
                                byte b12 = bArrCopyOf[iVar2.f17185c + 9];
                                i12 = (b12 & 96) >> 5;
                                i13 = b12 & 31;
                                if (i12 != i13) {
                                    d10 *= (((double) i12) + 1.0d) / ((double) (i13 + 1));
                                }
                                j10 = (long) (1000000.0d / d10);
                            }
                        }
                        Pair pairCreate2 = Pair.create(oVarA2, Long.valueOf(j10));
                        this.f17189b.a((com.fyber.inneractive.sdk.player.exoplayer2.o) pairCreate2.first);
                        this.f17191d = ((Long) pairCreate2.second).longValue();
                        this.f17190c = true;
                    }
                } else if (z11 == 179) {
                    iVar2.f17183a = true;
                }
            }
            if (this.f17190c && (z11 == 184 || z11 == 0)) {
                int i27 = i15 - iA;
                if (this.f17194g) {
                    this.f17189b.a(this.f17200m, this.f17198k ? 1 : 0, ((int) (this.f17195h - this.f17199l)) - i27, i27, null);
                    z10 = false;
                    this.f17198k = false;
                } else {
                    z10 = false;
                }
                if (z11 == 184) {
                    this.f17194g = z10;
                    this.f17198k = true;
                } else {
                    this.f17200m = this.f17197j ? this.f17196i : this.f17200m + this.f17191d;
                    this.f17199l = this.f17195h - ((long) i27);
                    this.f17197j = false;
                    this.f17194g = true;
                }
            }
            i17 = iA;
            i14 = i18;
        }
        if (this.f17190c) {
            return;
        }
        i iVar3 = this.f17193f;
        if (iVar3.f17183a) {
            int i28 = i15 - i17;
            byte[] bArr3 = iVar3.f17186d;
            int length2 = bArr3.length;
            int i29 = iVar3.f17184b + i28;
            if (length2 < i29) {
                iVar3.f17186d = Arrays.copyOf(bArr3, i29 * 2);
            }
            System.arraycopy(bArr, i17, iVar3.f17186d, iVar3.f17184b, i28);
            iVar3.f17184b += i28;
        }
    }
}
