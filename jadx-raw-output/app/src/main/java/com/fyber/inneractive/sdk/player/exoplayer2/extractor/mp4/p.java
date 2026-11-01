package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Stack;

/* JADX INFO: loaded from: classes11.dex */
public final class p implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.i, com.fyber.inneractive.sdk.player.exoplayer2.extractor.q {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f16953p = z.a("qt  ");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16958e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16959f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f16960g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f16961h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.util.n f16962i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f16963j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f16964k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.j f16965l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public o[] f16966m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f16967n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f16968o;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f16956c = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(16);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Stack f16957d = new Stack();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f16954a = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(com.fyber.inneractive.sdk.player.exoplayer2.util.l.f17837a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f16955b = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(4);

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        return r.a(bVar, false);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        return this.f16967n;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar) {
        this.f16965l = jVar;
    }

    /* JADX WARN: Code duplicated, block: B:129:0x0216 A[Catch: all -> 0x024a, TRY_LEAVE, TryCatch #0 {all -> 0x024a, blocks: (B:32:0x00aa, B:34:0x00ae, B:36:0x00bd, B:39:0x00d0, B:41:0x00d5, B:44:0x00dd, B:45:0x00e4, B:37:0x00c8, B:46:0x00ec, B:48:0x00f0, B:49:0x00f7, B:51:0x00fb, B:52:0x0102, B:54:0x0106, B:56:0x0111, B:58:0x0115, B:59:0x011d, B:61:0x0121, B:62:0x0127, B:64:0x012b, B:65:0x0132, B:67:0x0136, B:68:0x013d, B:70:0x0141, B:71:0x0148, B:73:0x014c, B:74:0x0153, B:76:0x0157, B:77:0x015e, B:79:0x0162, B:80:0x0169, B:82:0x016d, B:83:0x0175, B:85:0x0179, B:86:0x0182, B:88:0x0186, B:89:0x018d, B:91:0x0191, B:92:0x0199, B:94:0x019d, B:129:0x0216, B:95:0x01a3, B:97:0x01ab, B:98:0x01b1, B:100:0x01b5, B:103:0x01bb, B:105:0x01bf, B:108:0x01c4, B:110:0x01c8, B:111:0x01d0, B:113:0x01d4, B:114:0x01dc, B:116:0x01e0, B:117:0x01e8, B:119:0x01ec, B:120:0x01f4, B:122:0x01f8, B:123:0x0200, B:125:0x0204, B:126:0x020a, B:128:0x020e, B:131:0x022e, B:132:0x0236), top: B:404:0x00aa }] */
    /* JADX WARN: Code duplicated, block: B:194:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:200:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:203:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:205:0x03f8 A[ADDED_TO_REGION, LOOP:6: B:205:0x03f8->B:208:0x0400, LOOP_START, PHI: r11 r12 r29 r31
  0x03f8: PHI (r11v17 int) = (r11v16 int), (r11v22 int) binds: [B:204:0x03f6, B:208:0x0400] A[DONT_GENERATE, DONT_INLINE]
  0x03f8: PHI (r12v11 int[]) = (r12v8 int[]), (r12v22 int[]) binds: [B:204:0x03f6, B:208:0x0400] A[DONT_GENERATE, DONT_INLINE]
  0x03f8: PHI (r29v7 int) = (r29v6 int), (r29v10 int) binds: [B:204:0x03f6, B:208:0x0400] A[DONT_GENERATE, DONT_INLINE]
  0x03f8: PHI (r31v6 long) = (r31v5 long), (r31v8 long) binds: [B:204:0x03f6, B:208:0x0400] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:206:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:208:0x0400 A[LOOP:6: B:205:0x03f8->B:208:0x0400, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:213:0x041d A[ADDED_TO_REGION, LOOP:7: B:213:0x041d->B:215:0x0421, LOOP_START, PHI: r24 r25 r26
  0x041d: PHI (r24v10 int) = (r24v8 int), (r24v12 int) binds: [B:212:0x041b, B:215:0x0421] A[DONT_GENERATE, DONT_INLINE]
  0x041d: PHI (r25v18 int) = (r25v13 int), (r25v19 int) binds: [B:212:0x041b, B:215:0x0421] A[DONT_GENERATE, DONT_INLINE]
  0x041d: PHI (r26v10 int) = (r26v6 int), (r26v11 int) binds: [B:212:0x041b, B:215:0x0421] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:214:0x041f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:219:0x043a  */
    /* JADX WARN: Code duplicated, block: B:222:0x0444  */
    /* JADX WARN: Code duplicated, block: B:223:0x0446  */
    /* JADX WARN: Code duplicated, block: B:226:0x044b  */
    /* JADX WARN: Code duplicated, block: B:228:0x0452  */
    /* JADX WARN: Code duplicated, block: B:231:0x0463 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:233:0x0470  */
    /* JADX WARN: Code duplicated, block: B:237:0x0493 A[ADDED_TO_REGION, LOOP:8: B:237:0x0493->B:240:0x049b, LOOP_START, PHI: r26
  0x0493: PHI (r26v7 int) = (r26v6 int), (r26v8 int) binds: [B:236:0x0491, B:240:0x049b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:238:0x0495  */
    /* JADX WARN: Code duplicated, block: B:240:0x049b A[LOOP:8: B:237:0x0493->B:240:0x049b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:244:0x04a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:249:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:253:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:256:0x050e A[LOOP:14: B:254:0x0508->B:256:0x050e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:259:0x0525 A[LOOP:15: B:258:0x0523->B:259:0x0525, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:262:0x053f  */
    /* JADX WARN: Code duplicated, block: B:264:0x054b A[LOOP:17: B:263:0x0549->B:264:0x054b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:269:0x058c  */
    /* JADX WARN: Code duplicated, block: B:271:0x0593  */
    /* JADX WARN: Code duplicated, block: B:276:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:297:0x062c  */
    /* JADX WARN: Code duplicated, block: B:299:0x0632  */
    /* JADX WARN: Code duplicated, block: B:301:0x063c  */
    /* JADX WARN: Code duplicated, block: B:304:0x0641 A[LOOP:9: B:302:0x063e->B:304:0x0641, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:307:0x066f  */
    /* JADX WARN: Code duplicated, block: B:310:0x0676  */
    /* JADX WARN: Code duplicated, block: B:311:0x0678  */
    /* JADX WARN: Code duplicated, block: B:315:0x0684  */
    /* JADX WARN: Code duplicated, block: B:317:0x068c  */
    /* JADX WARN: Code duplicated, block: B:319:0x06ad  */
    /* JADX WARN: Code duplicated, block: B:320:0x06af  */
    /* JADX WARN: Code duplicated, block: B:322:0x06b5  */
    /* JADX WARN: Code duplicated, block: B:326:0x06c5  */
    /* JADX WARN: Code duplicated, block: B:327:0x06c7  */
    /* JADX WARN: Code duplicated, block: B:330:0x06cb  */
    /* JADX WARN: Code duplicated, block: B:331:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:333:0x06d1  */
    /* JADX WARN: Code duplicated, block: B:334:0x06d4  */
    /* JADX WARN: Code duplicated, block: B:336:0x06d7  */
    /* JADX WARN: Code duplicated, block: B:338:0x06db  */
    /* JADX WARN: Code duplicated, block: B:339:0x06de  */
    /* JADX WARN: Code duplicated, block: B:343:0x06ec  */
    /* JADX WARN: Code duplicated, block: B:345:0x06f9  */
    /* JADX WARN: Code duplicated, block: B:347:0x0718  */
    /* JADX WARN: Code duplicated, block: B:348:0x0727  */
    /* JADX WARN: Code duplicated, block: B:352:0x0732  */
    /* JADX WARN: Code duplicated, block: B:354:0x0755  */
    /* JADX WARN: Code duplicated, block: B:359:0x0769  */
    /* JADX WARN: Code duplicated, block: B:364:0x0788 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:367:0x0790  */
    /* JADX WARN: Code duplicated, block: B:368:0x0792  */
    /* JADX WARN: Code duplicated, block: B:371:0x0799  */
    /* JADX WARN: Code duplicated, block: B:374:0x07b1  */
    /* JADX WARN: Code duplicated, block: B:410:0x0411 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:411:0x04f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:412:0x04a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:413:0x07a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00da  */
    /* JADX WARN: Code duplicated, block: B:439:0x06bf A[EDGE_INSN: B:439:0x06bf->B:324:0x06bf BREAK  A[LOOP:10: B:313:0x067d->B:323:0x06b8], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:442:0x077f A[EDGE_INSN: B:442:0x077f->B:361:0x077f BREAK  A[LOOP:11: B:341:0x06e7->B:360:0x0771], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:445:0x0766 A[EDGE_INSN: B:445:0x0766->B:358:0x0766 BREAK  A[LOOP:12: B:350:0x072c->B:357:0x075b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:447:0x075b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:129:0x0216, please report this as an issue */
    public final void c(long j10) throws com.fyber.inneractive.sdk.player.exoplayer2.r {
        com.fyber.inneractive.sdk.player.exoplayer2.metadata.b bVar;
        s sVarA;
        e hVar;
        a aVar;
        boolean z10;
        long j11;
        int iM;
        int iM2;
        int iM3;
        long j12;
        boolean z11;
        s sVar;
        int i10;
        int i11;
        long[] jArr;
        int[] iArr;
        int iB;
        long j13;
        int i12;
        int i13;
        int i14;
        long[] jArr2;
        int[] iArr2;
        long[] jArr3;
        int[] iArr3;
        int i15;
        int i16;
        int i17;
        int iMax;
        long[] jArr4;
        long[] jArr5;
        int i18;
        long j14;
        long j15;
        int i19;
        long[] jArr6;
        v vVar;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.m mVar;
        long[] jArr7;
        boolean z12;
        int i20;
        int i21;
        int i22;
        boolean z13;
        long[] jArr8;
        boolean z14;
        boolean z15;
        long[] jArr9;
        int[] iArr4;
        int[] iArr5;
        long[] jArr10;
        int i23;
        int i24;
        int i25;
        long j16;
        long[] jArr11;
        long[] jArr12;
        int[] iArr6;
        int[] iArr7;
        int i26;
        boolean z16;
        boolean z17;
        long[] jArr13;
        int[] iArr8;
        long j17;
        long j18;
        long[] jArr14;
        boolean z18;
        int[] iArr9;
        int[] iArr10;
        int[] iArr11;
        int iA;
        int iA2;
        long j19;
        int iA3;
        boolean z19;
        char c10;
        int i27;
        v vVar2;
        int[] iArr12;
        int[] iArr13;
        int i28;
        int i29;
        int iM4;
        int i30;
        int i31;
        int i32;
        int iB2;
        int i33;
        long j20;
        int i34;
        int iM5;
        int i35;
        int[] iArr14;
        int[] iArr15;
        int i36;
        int[] iArr16;
        int iB3;
        int i37;
        int iM6;
        int iM7;
        s sVar2;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.m mVar2;
        long jMax;
        ArrayList arrayList;
        int i38;
        com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o oVarB;
        com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o oVarA;
        int iJ;
        String str;
        p pVar = this;
        while (!pVar.f16957d.isEmpty() && ((a) pVar.f16957d.peek()).P0 == j10) {
            a aVar2 = (a) pVar.f16957d.pop();
            if (aVar2.f16854a == c.C) {
                ArrayList arrayList2 = new ArrayList();
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.m mVar3 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.m();
                b bVarC = aVar2.c(c.A0);
                int i39 = 12;
                if (bVarC != null) {
                    boolean z20 = pVar.f16968o;
                    int i40 = i.f16876a;
                    if (z20) {
                        bVar = null;
                        break;
                    }
                    com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = bVarC.P0;
                    nVar.e(8);
                    while (true) {
                        int i41 = nVar.f17847c;
                        int i42 = nVar.f17846b;
                        if (i41 - i42 >= 8) {
                            int iB4 = nVar.b();
                            if (nVar.b() == c.B0) {
                                nVar.e(i42);
                                int i43 = i42 + iB4;
                                nVar.e(nVar.f17846b + i39);
                                while (true) {
                                    int i44 = nVar.f17846b;
                                    if (i44 < i43) {
                                        int iB5 = nVar.b();
                                        if (nVar.b() == c.C0) {
                                            nVar.e(i44);
                                            int i45 = i44 + iB5;
                                            nVar.e(nVar.f17846b + 8);
                                            ArrayList arrayList3 = new ArrayList();
                                            while (true) {
                                                int i46 = nVar.f17846b;
                                                if (i46 >= i45) {
                                                    break;
                                                }
                                                int i47 = n.f16923a;
                                                int iB6 = nVar.b() + i46;
                                                int iB7 = nVar.b();
                                                int i48 = (iB7 >> 24) & 255;
                                                if (i48 == 169 || i48 == 65533) {
                                                    int i49 = 16777215 & iB7;
                                                    if (i49 == n.f16925c) {
                                                        oVarB = n.a(iB7, nVar);
                                                    } else if (i49 == n.f16923a || i49 == n.f16924b) {
                                                        oVarB = n.b(iB7, nVar, "TIT2");
                                                    } else if (i49 == n.f16930h || i49 == n.f16931i) {
                                                        oVarB = n.b(iB7, nVar, "TCOM");
                                                    } else if (i49 == n.f16926d) {
                                                        oVarB = n.b(iB7, nVar, "TDRC");
                                                    } else if (i49 == n.f16927e) {
                                                        oVarB = n.b(iB7, nVar, "TPE1");
                                                    } else if (i49 == n.f16928f) {
                                                        oVarB = n.b(iB7, nVar, "TSSE");
                                                    } else if (i49 == n.f16929g) {
                                                        oVarB = n.b(iB7, nVar, "TALB");
                                                    } else if (i49 == n.f16932j) {
                                                        oVarB = n.b(iB7, nVar, "USLT");
                                                    } else if (i49 == n.f16933k) {
                                                        oVarB = n.b(iB7, nVar, "TCON");
                                                    } else if (i49 == n.f16936n) {
                                                        oVarB = n.b(iB7, nVar, "TIT1");
                                                    } else {
                                                        Log.d("MetadataUtil", "Skipped unknown metadata entry: " + c.a(iB7));
                                                        nVar.e(iB6);
                                                        oVarA = null;
                                                    }
                                                    oVarA = oVarB;
                                                    nVar.e(iB6);
                                                } else {
                                                    try {
                                                        if (iB7 == n.f16935m) {
                                                            nVar.e(nVar.f17846b + 4);
                                                            if (nVar.b() == c.F0) {
                                                                nVar.e(nVar.f17846b + 8);
                                                                iJ = nVar.j();
                                                            } else {
                                                                Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
                                                                iJ = -1;
                                                            }
                                                            if (iJ > 0) {
                                                                String[] strArr = n.D;
                                                                if (iJ <= strArr.length) {
                                                                    str = strArr[iJ - 1];
                                                                } else {
                                                                    str = null;
                                                                }
                                                            } else {
                                                                str = null;
                                                            }
                                                            if (str != null) {
                                                                oVarA = new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.s("TCON", null, str);
                                                            } else {
                                                                Log.w("MetadataUtil", "Failed to parse standard genre code");
                                                                oVarA = null;
                                                            }
                                                        } else {
                                                            if (iB7 == n.f16937o) {
                                                                oVarB = n.a(iB7, nVar, "TPOS");
                                                            } else if (iB7 == n.f16938p) {
                                                                oVarB = n.a(iB7, nVar, "TRCK");
                                                            } else if (iB7 == n.f16939q) {
                                                                oVarB = n.a(iB7, "TBPM", nVar, true, false);
                                                            } else if (iB7 == n.f16940r) {
                                                                oVarB = n.a(iB7, "TCMP", nVar, true, true);
                                                            } else if (iB7 == n.f16934l) {
                                                                oVarA = n.a(nVar);
                                                            } else if (iB7 == n.f16941s) {
                                                                oVarB = n.b(iB7, nVar, "TPE2");
                                                            } else if (iB7 == n.f16942t) {
                                                                oVarB = n.b(iB7, nVar, "TSOT");
                                                            } else if (iB7 == n.f16943u) {
                                                                oVarB = n.b(iB7, nVar, "TSO2");
                                                            } else if (iB7 == n.f16944v) {
                                                                oVarB = n.b(iB7, nVar, "TSOA");
                                                            } else if (iB7 == n.f16945w) {
                                                                oVarB = n.b(iB7, nVar, "TSOP");
                                                            } else if (iB7 == n.f16946x) {
                                                                oVarB = n.b(iB7, nVar, "TSOC");
                                                            } else if (iB7 == n.f16947y) {
                                                                oVarB = n.a(iB7, "ITUNESADVISORY", nVar, false, false);
                                                            } else if (iB7 == n.f16948z) {
                                                                oVarB = n.a(iB7, "ITUNESGAPLESS", nVar, false, true);
                                                            } else if (iB7 == n.A) {
                                                                oVarB = n.b(iB7, nVar, "TVSHOWSORT");
                                                            } else if (iB7 == n.B) {
                                                                oVarB = n.b(iB7, nVar, "TVSHOW");
                                                            } else if (iB7 == n.C) {
                                                                oVarB = n.b(iB6, nVar);
                                                            } else {
                                                                Log.d("MetadataUtil", "Skipped unknown metadata entry: " + c.a(iB7));
                                                                nVar.e(iB6);
                                                                oVarA = null;
                                                            }
                                                            oVarA = oVarB;
                                                        }
                                                        nVar.e(iB6);
                                                    } catch (Throwable th2) {
                                                        nVar.e(iB6);
                                                        throw th2;
                                                    }
                                                }
                                                if (oVarA != null) {
                                                    arrayList3.add(oVarA);
                                                }
                                            }
                                            if (!arrayList3.isEmpty()) {
                                                bVar = new com.fyber.inneractive.sdk.player.exoplayer2.metadata.b(arrayList3);
                                                break;
                                            }
                                            break;
                                        }
                                        nVar.e(nVar.f17846b + (iB5 - 8));
                                    }
                                }
                            } else {
                                nVar.e(nVar.f17846b + (iB4 - 8));
                                i39 = 12;
                            }
                        }
                        bVar = null;
                        break;
                    }
                    if (bVar != null) {
                        mVar3.a(bVar);
                    }
                } else {
                    bVar = null;
                }
                long j21 = -9223372036854775807L;
                long j22 = Long.MAX_VALUE;
                int i50 = 0;
                while (i50 < aVar2.R0.size()) {
                    a aVar3 = (a) aVar2.R0.get(i50);
                    if (aVar3.f16854a == c.E && (sVarA = i.a(aVar3, aVar2.c(c.D), -9223372036854775807L, (com.fyber.inneractive.sdk.player.exoplayer2.drm.d) null, pVar.f16968o)) != null) {
                        a aVarB = aVar3.b(c.F).b(c.G).b(c.H);
                        b bVarC2 = aVarB.c(c.f16835q0);
                        if (bVarC2 != null) {
                            hVar = new g(bVarC2);
                        } else {
                            b bVarC3 = aVarB.c(c.f16837r0);
                            if (bVarC3 == null) {
                                throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Track has no sample table size information");
                            }
                            hVar = new h(bVarC3);
                        }
                        int iA4 = hVar.a();
                        if (iA4 == 0) {
                            aVar = aVar2;
                            vVar = new v(new long[0], new int[0], 0, new long[0], new int[0]);
                            bVar = bVar;
                            j12 = j21;
                            arrayList2 = arrayList2;
                            j11 = j22;
                            mVar3 = mVar3;
                            sVar = sVarA;
                            i50 = i50;
                        } else {
                            aVar = aVar2;
                            b bVarC4 = aVarB.c(c.f16839s0);
                            if (bVarC4 == null) {
                                bVarC4 = aVarB.c(c.f16841t0);
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = bVarC4.P0;
                            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar3 = aVarB.c(c.f16833p0).P0;
                            j11 = j22;
                            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar4 = aVarB.c(c.f16827m0).P0;
                            b bVarC5 = aVarB.c(c.f16829n0);
                            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar5 = bVarC5 != null ? bVarC5.P0 : null;
                            b bVarC6 = aVarB.c(c.f16831o0);
                            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar6 = bVarC6 != null ? bVarC6.P0 : null;
                            d dVar = new d(nVar3, nVar2, z10);
                            nVar4.e(12);
                            int iM8 = nVar4.m() - 1;
                            int iM9 = nVar4.m();
                            int iM10 = nVar4.m();
                            if (nVar6 != null) {
                                nVar6.e(12);
                                iM = nVar6.m();
                            } else {
                                iM = 0;
                            }
                            if (nVar5 != null) {
                                nVar5.e(12);
                                iM2 = nVar5.m();
                                if (iM2 > 0) {
                                    iM3 = nVar5.m() - 1;
                                } else {
                                    nVar5 = null;
                                }
                                if (hVar.c()) {
                                    j12 = j21;
                                    if (!"audio/raw".equals(sVarA.f16975f.f17504f) && iM8 == 0 && iM == 0 && iM2 == 0) {
                                        z11 = true;
                                    }
                                    if (z11) {
                                        sVar = sVarA;
                                        i10 = iA4;
                                        i11 = dVar.f16855a;
                                        jArr = new long[i11];
                                        iArr = new int[i11];
                                        while (dVar.a()) {
                                            int i51 = dVar.f16856b;
                                            jArr[i51] = dVar.f16858d;
                                            iArr[i51] = dVar.f16857c;
                                        }
                                        iB = hVar.b();
                                        j13 = iM10;
                                        i12 = 8192 / iB;
                                        i14 = 0;
                                        for (i13 = 0; i13 < i11; i13++) {
                                            int i52 = iArr[i13];
                                            int i53 = z.f17873a;
                                            i14 += ((i52 + i12) - 1) / i12;
                                        }
                                        jArr2 = new long[i14];
                                        iArr2 = new int[i14];
                                        jArr3 = new long[i14];
                                        iArr3 = new int[i14];
                                        i15 = 0;
                                        i16 = 0;
                                        i17 = 0;
                                        iMax = 0;
                                        while (i15 < i11) {
                                            int i54 = iArr[i15];
                                            j15 = jArr[i15];
                                            int i55 = i11;
                                            i19 = i54;
                                            while (i19 > 0) {
                                                int iMin = Math.min(i12, i19);
                                                jArr2[i17] = j15;
                                                long[] jArr15 = jArr;
                                                int i56 = iB * iMin;
                                                iArr2[i17] = i56;
                                                iMax = Math.max(iMax, i56);
                                                jArr3[i17] = ((long) i16) * j13;
                                                iArr3[i17] = 1;
                                                j15 += (long) iArr2[i17];
                                                i16 += iMin;
                                                i19 -= iMin;
                                                i17++;
                                                iArr = iArr;
                                                jArr = jArr15;
                                                iB = iB;
                                            }
                                            i15++;
                                            i11 = i55;
                                            jArr = jArr;
                                        }
                                        jArr4 = jArr2;
                                        jArr5 = jArr3;
                                        i18 = iMax;
                                        j14 = 0;
                                    } else {
                                        jArr4 = new long[iA4];
                                        iArr12 = new int[iA4];
                                        jArr5 = new long[iA4];
                                        iArr13 = new int[iA4];
                                        i28 = iM10;
                                        i29 = iM2;
                                        iM4 = iM3;
                                        i30 = iM8;
                                        i31 = 0;
                                        i32 = 0;
                                        iB2 = 0;
                                        i33 = 0;
                                        j20 = 0;
                                        j14 = 0;
                                        i34 = iM;
                                        iM5 = 0;
                                        i35 = iM9;
                                        while (i31 < iA4) {
                                            while (i33 == 0) {
                                                if (dVar.a()) {
                                                    throw new IllegalStateException();
                                                }
                                                j20 = dVar.f16858d;
                                                i33 = dVar.f16857c;
                                                iArr13 = iArr13;
                                                i28 = i28;
                                            }
                                            i36 = i28;
                                            iArr16 = iArr13;
                                            if (nVar6 != null) {
                                                while (iM5 == 0 && i34 > 0) {
                                                    iM5 = nVar6.m();
                                                    iB2 = nVar6.b();
                                                    i34--;
                                                }
                                                iM5--;
                                            }
                                            int i57 = iB2;
                                            jArr4[i31] = j20;
                                            iB3 = hVar.b();
                                            iArr12[i31] = iB3;
                                            if (iB3 > i32) {
                                                i32 = iB3;
                                            }
                                            int i58 = iA4;
                                            jArr5[i31] = j14 + ((long) i57);
                                            if (nVar5 == null) {
                                                i37 = 1;
                                            } else {
                                                i37 = 0;
                                            }
                                            iArr16[i31] = i37;
                                            if (i31 == iM4) {
                                                iArr16[i31] = 1;
                                                i29--;
                                                if (i29 > 0) {
                                                    iM4 = nVar5.m() - 1;
                                                }
                                            }
                                            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar7 = nVar5;
                                            int i59 = iM4;
                                            j14 += (long) i36;
                                            iM6 = i35 - 1;
                                            if (iM6 == 0 || i30 <= 0) {
                                                iM7 = i36;
                                            } else {
                                                iM6 = nVar4.m();
                                                iM7 = nVar4.m();
                                                i30--;
                                            }
                                            j20 += (long) iArr12[i31];
                                            i33--;
                                            i31++;
                                            iArr12 = iArr12;
                                            nVar5 = nVar7;
                                            iA4 = i58;
                                            iArr13 = iArr16;
                                            i35 = iM6;
                                            iB2 = i57;
                                            i28 = iM7;
                                            iM4 = i59;
                                        }
                                        iArr14 = iArr13;
                                        i10 = iA4;
                                        iArr15 = iArr12;
                                        if (iM5 == 0) {
                                            throw new IllegalArgumentException();
                                        }
                                        while (i34 > 0) {
                                            if (nVar6.m() == 0) {
                                                throw new IllegalArgumentException();
                                            }
                                            nVar6.b();
                                            i34--;
                                        }
                                        if (i29 != 0 && i35 == 0 && i33 == 0 && i30 == 0) {
                                            sVar = sVarA;
                                        } else {
                                            StringBuilder sb2 = new StringBuilder("Inconsistent stbl box for track ");
                                            sVar = sVarA;
                                            sb2.append(sVar.f16970a);
                                            sb2.append(": remainingSynchronizationSamples ");
                                            sb2.append(i29);
                                            sb2.append(", remainingSamplesAtTimestampDelta ");
                                            sb2.append(i35);
                                            sb2.append(", remainingSamplesInChunk ");
                                            sb2.append(i33);
                                            sb2.append(", remainingTimestampDeltaChanges ");
                                            sb2.append(i30);
                                            Log.w("AtomParsers", sb2.toString());
                                        }
                                        i18 = i32;
                                        iArr2 = iArr15;
                                        iArr3 = iArr14;
                                    }
                                    jArr6 = sVar.f16978i;
                                    if (jArr6 != null) {
                                        mVar = mVar3;
                                        if (mVar.f16704a == -1 && mVar.f16705b != -1) {
                                            mVar3 = mVar;
                                        } else if (jArr6.length == 1 || sVar.f16971b != 1 || jArr5.length < 2) {
                                            jArr7 = sVar.f16978i;
                                            if (jArr7.length == 1) {
                                                c10 = 0;
                                                if (jArr7[0] == 0) {
                                                    i27 = 0;
                                                    while (i27 < jArr5.length) {
                                                        jArr5[i27] = z.a(jArr5[i27] - sVar.f16979j[c10], 1000000L, sVar.f16972c);
                                                        i27++;
                                                        c10 = 0;
                                                    }
                                                    vVar2 = new v(jArr4, iArr2, i18, jArr5, iArr3);
                                                    vVar = vVar2;
                                                    mVar3 = mVar;
                                                }
                                            }
                                            if (sVar.f16971b == 1) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            i20 = 0;
                                            i21 = 0;
                                            i22 = 0;
                                            z13 = false;
                                            while (true) {
                                                jArr8 = sVar.f16978i;
                                                if (i20 >= jArr8.length) {
                                                    break;
                                                }
                                                j19 = sVar.f16979j[i20];
                                                if (j19 != -1) {
                                                    long jA = z.a(jArr8[i20], sVar.f16972c, sVar.f16973d);
                                                    iA3 = z.a(jArr5, j19, true, true);
                                                    int iA5 = z.a(jArr5, j19 + jA, z12, false);
                                                    int i60 = (iA5 - iA3) + i21;
                                                    if (i22 != iA3) {
                                                        z19 = true;
                                                    } else {
                                                        z19 = false;
                                                    }
                                                    i22 = iA5;
                                                    z13 = z19 | z13;
                                                    i21 = i60;
                                                }
                                                i20++;
                                                mVar = mVar;
                                            }
                                            mVar3 = mVar;
                                            if (i21 != i10) {
                                                z14 = true;
                                            } else {
                                                z14 = false;
                                            }
                                            z15 = z14 | z13;
                                            if (z15) {
                                                jArr9 = new long[i21];
                                            } else {
                                                jArr9 = jArr4;
                                            }
                                            if (z15) {
                                                iArr4 = new int[i21];
                                            } else {
                                                iArr4 = iArr2;
                                            }
                                            if (z15) {
                                                i18 = 0;
                                            }
                                            if (z15) {
                                                iArr5 = new int[i21];
                                            } else {
                                                iArr5 = iArr3;
                                            }
                                            jArr10 = new long[i21];
                                            i23 = i18;
                                            i24 = 0;
                                            i25 = 0;
                                            j16 = 0;
                                            while (true) {
                                                jArr11 = sVar.f16978i;
                                                if (i24 >= jArr11.length) {
                                                    break;
                                                }
                                                jArr13 = jArr10;
                                                iArr8 = iArr4;
                                                j17 = sVar.f16979j[i24];
                                                j18 = jArr11[i24];
                                                if (j17 != -1) {
                                                    iArr11 = iArr5;
                                                    long jA2 = z.a(j18, sVar.f16972c, sVar.f16973d) + j17;
                                                    iA = z.a(jArr5, j17, true, true);
                                                    iA2 = z.a(jArr5, jA2, z12, false);
                                                    if (z15) {
                                                        int i61 = iA2 - iA;
                                                        System.arraycopy(jArr4, iA, jArr9, i25, i61);
                                                        iArr9 = iArr8;
                                                        System.arraycopy(iArr2, iA, iArr9, i25, i61);
                                                        iArr10 = iArr11;
                                                        System.arraycopy(iArr3, iA, iArr10, i25, i61);
                                                    } else {
                                                        iArr9 = iArr8;
                                                        iArr10 = iArr11;
                                                    }
                                                    int i62 = i23;
                                                    while (true) {
                                                        jArr14 = jArr4;
                                                        z18 = z12;
                                                        if (iA >= iA2) {
                                                            break;
                                                        }
                                                        long j23 = j17;
                                                        jArr13[i25] = z.a(j16, 1000000L, sVar.f16973d) + z.a(jArr5[iA] - j17, 1000000L, sVar.f16972c);
                                                        if (!z15 && iArr9[i25] > i62) {
                                                            i62 = iArr2[iA];
                                                        }
                                                        i25++;
                                                        iA++;
                                                        jArr4 = jArr14;
                                                        j17 = j23;
                                                        z12 = z18;
                                                    }
                                                    i23 = i62;
                                                } else {
                                                    jArr14 = jArr4;
                                                    z18 = z12;
                                                    iArr9 = iArr8;
                                                    iArr10 = iArr5;
                                                }
                                                j16 += j18;
                                                i24++;
                                                iArr4 = iArr9;
                                                iArr5 = iArr10;
                                                jArr10 = jArr13;
                                                jArr4 = jArr14;
                                                z12 = z18;
                                            }
                                            jArr12 = jArr10;
                                            iArr6 = iArr4;
                                            iArr7 = iArr5;
                                            z16 = false;
                                            for (i26 = 0; i26 < iArr7.length && !z16; i26++) {
                                                if ((iArr7[i26] & 1) != 0) {
                                                    z17 = true;
                                                } else {
                                                    z17 = false;
                                                }
                                                z16 |= z17;
                                            }
                                            if (!z16) {
                                                throw new com.fyber.inneractive.sdk.player.exoplayer2.r("The edited sample sequence does not contain a sync sample.");
                                            }
                                            vVar = new v(jArr9, iArr6, i23, jArr12, iArr7);
                                        } else {
                                            long j24 = sVar.f16979j[0];
                                            long jA3 = j24 + z.a(jArr6[0], sVar.f16972c, sVar.f16973d);
                                            long j25 = jArr5[0];
                                            if (j25 > j24 || j24 >= jArr5[1] || jArr5[jArr5.length - 1] >= jA3 || jA3 > j14) {
                                                jArr7 = sVar.f16978i;
                                                if (jArr7.length == 1) {
                                                    c10 = 0;
                                                    if (jArr7[0] == 0) {
                                                        i27 = 0;
                                                        while (i27 < jArr5.length) {
                                                            jArr5[i27] = z.a(jArr5[i27] - sVar.f16979j[c10], 1000000L, sVar.f16972c);
                                                            i27++;
                                                            c10 = 0;
                                                        }
                                                        vVar2 = new v(jArr4, iArr2, i18, jArr5, iArr3);
                                                        vVar = vVar2;
                                                        mVar3 = mVar;
                                                    }
                                                }
                                                if (sVar.f16971b == 1) {
                                                    z12 = true;
                                                } else {
                                                    z12 = false;
                                                }
                                                i20 = 0;
                                                i21 = 0;
                                                i22 = 0;
                                                z13 = false;
                                                while (true) {
                                                    jArr8 = sVar.f16978i;
                                                    if (i20 >= jArr8.length) {
                                                        break;
                                                        break;
                                                    }
                                                    j19 = sVar.f16979j[i20];
                                                    if (j19 != -1) {
                                                        long jA4 = z.a(jArr8[i20], sVar.f16972c, sVar.f16973d);
                                                        iA3 = z.a(jArr5, j19, true, true);
                                                        int iA6 = z.a(jArr5, j19 + jA4, z12, false);
                                                        int i63 = (iA6 - iA3) + i21;
                                                        if (i22 != iA3) {
                                                            z19 = true;
                                                        } else {
                                                            z19 = false;
                                                        }
                                                        i22 = iA6;
                                                        z13 = z19 | z13;
                                                        i21 = i63;
                                                    }
                                                    i20++;
                                                    mVar = mVar;
                                                }
                                                mVar3 = mVar;
                                                if (i21 != i10) {
                                                    z14 = true;
                                                } else {
                                                    z14 = false;
                                                }
                                                z15 = z14 | z13;
                                                if (z15) {
                                                    jArr9 = new long[i21];
                                                } else {
                                                    jArr9 = jArr4;
                                                }
                                                if (z15) {
                                                    iArr4 = new int[i21];
                                                } else {
                                                    iArr4 = iArr2;
                                                }
                                                if (z15) {
                                                    i18 = 0;
                                                }
                                                if (z15) {
                                                    iArr5 = new int[i21];
                                                } else {
                                                    iArr5 = iArr3;
                                                }
                                                jArr10 = new long[i21];
                                                i23 = i18;
                                                i24 = 0;
                                                i25 = 0;
                                                j16 = 0;
                                                while (true) {
                                                    jArr11 = sVar.f16978i;
                                                    if (i24 >= jArr11.length) {
                                                        break;
                                                        break;
                                                    }
                                                    jArr13 = jArr10;
                                                    iArr8 = iArr4;
                                                    j17 = sVar.f16979j[i24];
                                                    j18 = jArr11[i24];
                                                    if (j17 != -1) {
                                                        iArr11 = iArr5;
                                                        long jA5 = z.a(j18, sVar.f16972c, sVar.f16973d) + j17;
                                                        iA = z.a(jArr5, j17, true, true);
                                                        iA2 = z.a(jArr5, jA5, z12, false);
                                                        if (z15) {
                                                            int i64 = iA2 - iA;
                                                            System.arraycopy(jArr4, iA, jArr9, i25, i64);
                                                            iArr9 = iArr8;
                                                            System.arraycopy(iArr2, iA, iArr9, i25, i64);
                                                            iArr10 = iArr11;
                                                            System.arraycopy(iArr3, iA, iArr10, i25, i64);
                                                        } else {
                                                            iArr9 = iArr8;
                                                            iArr10 = iArr11;
                                                        }
                                                        int i65 = i23;
                                                        while (true) {
                                                            jArr14 = jArr4;
                                                            z18 = z12;
                                                            if (iA >= iA2) {
                                                                break;
                                                                break;
                                                            }
                                                            long j26 = j17;
                                                            jArr13[i25] = z.a(j16, 1000000L, sVar.f16973d) + z.a(jArr5[iA] - j17, 1000000L, sVar.f16972c);
                                                            if (!z15) {
                                                            }
                                                            i25++;
                                                            iA++;
                                                            jArr4 = jArr14;
                                                            j17 = j26;
                                                            z12 = z18;
                                                        }
                                                        i23 = i65;
                                                    } else {
                                                        jArr14 = jArr4;
                                                        z18 = z12;
                                                        iArr9 = iArr8;
                                                        iArr10 = iArr5;
                                                    }
                                                    j16 += j18;
                                                    i24++;
                                                    iArr4 = iArr9;
                                                    iArr5 = iArr10;
                                                    jArr10 = jArr13;
                                                    jArr4 = jArr14;
                                                    z12 = z18;
                                                }
                                                jArr12 = jArr10;
                                                iArr6 = iArr4;
                                                iArr7 = iArr5;
                                                z16 = false;
                                                while (i26 < iArr7.length) {
                                                    if ((iArr7[i26] & 1) != 0) {
                                                        z17 = true;
                                                    } else {
                                                        z17 = false;
                                                    }
                                                    z16 |= z17;
                                                }
                                                if (!z16) {
                                                    throw new com.fyber.inneractive.sdk.player.exoplayer2.r("The edited sample sequence does not contain a sync sample.");
                                                }
                                                vVar = new v(jArr9, iArr6, i23, jArr12, iArr7);
                                            } else {
                                                long jA6 = z.a(j24 - j25, sVar.f16975f.f17517s, sVar.f16972c);
                                                long jA7 = z.a(j14 - jA3, sVar.f16975f.f17517s, sVar.f16972c);
                                                if (!(jA6 == 0 && jA7 == 0) && jA6 <= 2147483647L && jA7 <= 2147483647L) {
                                                    mVar.f16704a = (int) jA6;
                                                    mVar.f16705b = (int) jA7;
                                                    z.a(jArr5, sVar.f16972c);
                                                    vVar2 = new v(jArr4, iArr2, i18, jArr5, iArr3);
                                                } else {
                                                    jArr7 = sVar.f16978i;
                                                    if (jArr7.length == 1) {
                                                        c10 = 0;
                                                        if (jArr7[0] == 0) {
                                                            i27 = 0;
                                                            while (i27 < jArr5.length) {
                                                                jArr5[i27] = z.a(jArr5[i27] - sVar.f16979j[c10], 1000000L, sVar.f16972c);
                                                                i27++;
                                                                c10 = 0;
                                                            }
                                                            vVar2 = new v(jArr4, iArr2, i18, jArr5, iArr3);
                                                        }
                                                    }
                                                    if (sVar.f16971b == 1) {
                                                        z12 = true;
                                                    } else {
                                                        z12 = false;
                                                    }
                                                    i20 = 0;
                                                    i21 = 0;
                                                    i22 = 0;
                                                    z13 = false;
                                                    while (true) {
                                                        jArr8 = sVar.f16978i;
                                                        if (i20 >= jArr8.length) {
                                                            break;
                                                            break;
                                                        }
                                                        j19 = sVar.f16979j[i20];
                                                        if (j19 != -1) {
                                                            long jA8 = z.a(jArr8[i20], sVar.f16972c, sVar.f16973d);
                                                            iA3 = z.a(jArr5, j19, true, true);
                                                            int iA7 = z.a(jArr5, j19 + jA8, z12, false);
                                                            int i66 = (iA7 - iA3) + i21;
                                                            if (i22 != iA3) {
                                                                z19 = true;
                                                            } else {
                                                                z19 = false;
                                                            }
                                                            i22 = iA7;
                                                            z13 = z19 | z13;
                                                            i21 = i66;
                                                        }
                                                        i20++;
                                                        mVar = mVar;
                                                    }
                                                    mVar3 = mVar;
                                                    if (i21 != i10) {
                                                        z14 = true;
                                                    } else {
                                                        z14 = false;
                                                    }
                                                    z15 = z14 | z13;
                                                    if (z15) {
                                                        jArr9 = new long[i21];
                                                    } else {
                                                        jArr9 = jArr4;
                                                    }
                                                    if (z15) {
                                                        iArr4 = new int[i21];
                                                    } else {
                                                        iArr4 = iArr2;
                                                    }
                                                    if (z15) {
                                                        i18 = 0;
                                                    }
                                                    if (z15) {
                                                        iArr5 = new int[i21];
                                                    } else {
                                                        iArr5 = iArr3;
                                                    }
                                                    jArr10 = new long[i21];
                                                    i23 = i18;
                                                    i24 = 0;
                                                    i25 = 0;
                                                    j16 = 0;
                                                    while (true) {
                                                        jArr11 = sVar.f16978i;
                                                        if (i24 >= jArr11.length) {
                                                            break;
                                                            break;
                                                        }
                                                        jArr13 = jArr10;
                                                        iArr8 = iArr4;
                                                        j17 = sVar.f16979j[i24];
                                                        j18 = jArr11[i24];
                                                        if (j17 != -1) {
                                                            iArr11 = iArr5;
                                                            long jA9 = z.a(j18, sVar.f16972c, sVar.f16973d) + j17;
                                                            iA = z.a(jArr5, j17, true, true);
                                                            iA2 = z.a(jArr5, jA9, z12, false);
                                                            if (z15) {
                                                                int i67 = iA2 - iA;
                                                                System.arraycopy(jArr4, iA, jArr9, i25, i67);
                                                                iArr9 = iArr8;
                                                                System.arraycopy(iArr2, iA, iArr9, i25, i67);
                                                                iArr10 = iArr11;
                                                                System.arraycopy(iArr3, iA, iArr10, i25, i67);
                                                            } else {
                                                                iArr9 = iArr8;
                                                                iArr10 = iArr11;
                                                            }
                                                            int i68 = i23;
                                                            while (true) {
                                                                jArr14 = jArr4;
                                                                z18 = z12;
                                                                if (iA >= iA2) {
                                                                    break;
                                                                    break;
                                                                }
                                                                long j27 = j17;
                                                                jArr13[i25] = z.a(j16, 1000000L, sVar.f16973d) + z.a(jArr5[iA] - j17, 1000000L, sVar.f16972c);
                                                                if (!z15) {
                                                                }
                                                                i25++;
                                                                iA++;
                                                                jArr4 = jArr14;
                                                                j17 = j27;
                                                                z12 = z18;
                                                            }
                                                            i23 = i68;
                                                        } else {
                                                            jArr14 = jArr4;
                                                            z18 = z12;
                                                            iArr9 = iArr8;
                                                            iArr10 = iArr5;
                                                        }
                                                        j16 += j18;
                                                        i24++;
                                                        iArr4 = iArr9;
                                                        iArr5 = iArr10;
                                                        jArr10 = jArr13;
                                                        jArr4 = jArr14;
                                                        z12 = z18;
                                                    }
                                                    jArr12 = jArr10;
                                                    iArr6 = iArr4;
                                                    iArr7 = iArr5;
                                                    z16 = false;
                                                    while (i26 < iArr7.length) {
                                                        if ((iArr7[i26] & 1) != 0) {
                                                            z17 = true;
                                                        } else {
                                                            z17 = false;
                                                        }
                                                        z16 |= z17;
                                                    }
                                                    if (!z16) {
                                                        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("The edited sample sequence does not contain a sync sample.");
                                                    }
                                                    vVar = new v(jArr9, iArr6, i23, jArr12, iArr7);
                                                }
                                                vVar = vVar2;
                                                mVar3 = mVar;
                                            }
                                        }
                                    }
                                    z.a(jArr5, sVar.f16972c);
                                    vVar = new v(jArr4, iArr2, i18, jArr5, iArr3);
                                } else {
                                    j12 = j21;
                                }
                                z11 = false;
                                if (z11) {
                                    jArr4 = new long[iA4];
                                    iArr12 = new int[iA4];
                                    jArr5 = new long[iA4];
                                    iArr13 = new int[iA4];
                                    i28 = iM10;
                                    i29 = iM2;
                                    iM4 = iM3;
                                    i30 = iM8;
                                    i31 = 0;
                                    i32 = 0;
                                    iB2 = 0;
                                    i33 = 0;
                                    j20 = 0;
                                    j14 = 0;
                                    i34 = iM;
                                    iM5 = 0;
                                    i35 = iM9;
                                    while (i31 < iA4) {
                                        while (i33 == 0) {
                                            if (dVar.a()) {
                                                throw new IllegalStateException();
                                            }
                                            j20 = dVar.f16858d;
                                            i33 = dVar.f16857c;
                                            iArr13 = iArr13;
                                            i28 = i28;
                                        }
                                        i36 = i28;
                                        iArr16 = iArr13;
                                        if (nVar6 != null) {
                                            while (iM5 == 0) {
                                                iM5 = nVar6.m();
                                                iB2 = nVar6.b();
                                                i34--;
                                            }
                                            iM5--;
                                        }
                                        int i510 = iB2;
                                        jArr4[i31] = j20;
                                        iB3 = hVar.b();
                                        iArr12[i31] = iB3;
                                        if (iB3 > i32) {
                                            i32 = iB3;
                                        }
                                        int i511 = iA4;
                                        jArr5[i31] = j14 + ((long) i510);
                                        if (nVar5 == null) {
                                            i37 = 1;
                                        } else {
                                            i37 = 0;
                                        }
                                        iArr16[i31] = i37;
                                        if (i31 == iM4) {
                                            iArr16[i31] = 1;
                                            i29--;
                                            if (i29 > 0) {
                                                iM4 = nVar5.m() - 1;
                                            }
                                        }
                                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar8 = nVar5;
                                        int i512 = iM4;
                                        j14 += (long) i36;
                                        iM6 = i35 - 1;
                                        if (iM6 == 0) {
                                            iM7 = i36;
                                        } else {
                                            iM7 = i36;
                                        }
                                        j20 += (long) iArr12[i31];
                                        i33--;
                                        i31++;
                                        iArr12 = iArr12;
                                        nVar5 = nVar8;
                                        iA4 = i511;
                                        iArr13 = iArr16;
                                        i35 = iM6;
                                        iB2 = i510;
                                        i28 = iM7;
                                        iM4 = i512;
                                    }
                                    iArr14 = iArr13;
                                    i10 = iA4;
                                    iArr15 = iArr12;
                                    if (iM5 == 0) {
                                        throw new IllegalArgumentException();
                                    }
                                    while (i34 > 0) {
                                        if (nVar6.m() == 0) {
                                            throw new IllegalArgumentException();
                                        }
                                        nVar6.b();
                                        i34--;
                                    }
                                    if (i29 != 0) {
                                        StringBuilder sb3 = new StringBuilder("Inconsistent stbl box for track ");
                                        sVar = sVarA;
                                        sb3.append(sVar.f16970a);
                                        sb3.append(": remainingSynchronizationSamples ");
                                        sb3.append(i29);
                                        sb3.append(", remainingSamplesAtTimestampDelta ");
                                        sb3.append(i35);
                                        sb3.append(", remainingSamplesInChunk ");
                                        sb3.append(i33);
                                        sb3.append(", remainingTimestampDeltaChanges ");
                                        sb3.append(i30);
                                        Log.w("AtomParsers", sb3.toString());
                                    } else {
                                        StringBuilder sb4 = new StringBuilder("Inconsistent stbl box for track ");
                                        sVar = sVarA;
                                        sb4.append(sVar.f16970a);
                                        sb4.append(": remainingSynchronizationSamples ");
                                        sb4.append(i29);
                                        sb4.append(", remainingSamplesAtTimestampDelta ");
                                        sb4.append(i35);
                                        sb4.append(", remainingSamplesInChunk ");
                                        sb4.append(i33);
                                        sb4.append(", remainingTimestampDeltaChanges ");
                                        sb4.append(i30);
                                        Log.w("AtomParsers", sb4.toString());
                                    }
                                    i18 = i32;
                                    iArr2 = iArr15;
                                    iArr3 = iArr14;
                                } else {
                                    sVar = sVarA;
                                    i10 = iA4;
                                    i11 = dVar.f16855a;
                                    jArr = new long[i11];
                                    iArr = new int[i11];
                                    while (dVar.a()) {
                                        int i513 = dVar.f16856b;
                                        jArr[i513] = dVar.f16858d;
                                        iArr[i513] = dVar.f16857c;
                                    }
                                    iB = hVar.b();
                                    j13 = iM10;
                                    i12 = 8192 / iB;
                                    i14 = 0;
                                    while (i13 < i11) {
                                        int i514 = iArr[i13];
                                        int i515 = z.f17873a;
                                        i14 += ((i514 + i12) - 1) / i12;
                                    }
                                    jArr2 = new long[i14];
                                    iArr2 = new int[i14];
                                    jArr3 = new long[i14];
                                    iArr3 = new int[i14];
                                    i15 = 0;
                                    i16 = 0;
                                    i17 = 0;
                                    iMax = 0;
                                    while (i15 < i11) {
                                        int i516 = iArr[i15];
                                        j15 = jArr[i15];
                                        int i517 = i11;
                                        i19 = i516;
                                        while (i19 > 0) {
                                            int iMin2 = Math.min(i12, i19);
                                            jArr2[i17] = j15;
                                            long[] jArr16 = jArr;
                                            int i518 = iB * iMin2;
                                            iArr2[i17] = i518;
                                            iMax = Math.max(iMax, i518);
                                            jArr3[i17] = ((long) i16) * j13;
                                            iArr3[i17] = 1;
                                            j15 += (long) iArr2[i17];
                                            i16 += iMin2;
                                            i19 -= iMin2;
                                            i17++;
                                            iArr = iArr;
                                            jArr = jArr16;
                                            iB = iB;
                                        }
                                        i15++;
                                        i11 = i517;
                                        jArr = jArr;
                                    }
                                    jArr4 = jArr2;
                                    jArr5 = jArr3;
                                    i18 = iMax;
                                    j14 = 0;
                                }
                                jArr6 = sVar.f16978i;
                                if (jArr6 != null) {
                                    mVar = mVar3;
                                    if (mVar.f16704a == -1) {
                                    }
                                    if (jArr6.length == 1) {
                                        jArr7 = sVar.f16978i;
                                        if (jArr7.length == 1) {
                                            c10 = 0;
                                            if (jArr7[0] == 0) {
                                                i27 = 0;
                                                while (i27 < jArr5.length) {
                                                    jArr5[i27] = z.a(jArr5[i27] - sVar.f16979j[c10], 1000000L, sVar.f16972c);
                                                    i27++;
                                                    c10 = 0;
                                                }
                                                vVar2 = new v(jArr4, iArr2, i18, jArr5, iArr3);
                                                vVar = vVar2;
                                                mVar3 = mVar;
                                            }
                                        }
                                        if (sVar.f16971b == 1) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        i20 = 0;
                                        i21 = 0;
                                        i22 = 0;
                                        z13 = false;
                                        while (true) {
                                            jArr8 = sVar.f16978i;
                                            if (i20 >= jArr8.length) {
                                                break;
                                                break;
                                            }
                                            j19 = sVar.f16979j[i20];
                                            if (j19 != -1) {
                                                long jA10 = z.a(jArr8[i20], sVar.f16972c, sVar.f16973d);
                                                iA3 = z.a(jArr5, j19, true, true);
                                                int iA8 = z.a(jArr5, j19 + jA10, z12, false);
                                                int i69 = (iA8 - iA3) + i21;
                                                if (i22 != iA3) {
                                                    z19 = true;
                                                } else {
                                                    z19 = false;
                                                }
                                                i22 = iA8;
                                                z13 = z19 | z13;
                                                i21 = i69;
                                            }
                                            i20++;
                                            mVar = mVar;
                                        }
                                        mVar3 = mVar;
                                        if (i21 != i10) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        z15 = z14 | z13;
                                        if (z15) {
                                            jArr9 = new long[i21];
                                        } else {
                                            jArr9 = jArr4;
                                        }
                                        if (z15) {
                                            iArr4 = new int[i21];
                                        } else {
                                            iArr4 = iArr2;
                                        }
                                        if (z15) {
                                            i18 = 0;
                                        }
                                        if (z15) {
                                            iArr5 = new int[i21];
                                        } else {
                                            iArr5 = iArr3;
                                        }
                                        jArr10 = new long[i21];
                                        i23 = i18;
                                        i24 = 0;
                                        i25 = 0;
                                        j16 = 0;
                                        while (true) {
                                            jArr11 = sVar.f16978i;
                                            if (i24 >= jArr11.length) {
                                                break;
                                                break;
                                            }
                                            jArr13 = jArr10;
                                            iArr8 = iArr4;
                                            j17 = sVar.f16979j[i24];
                                            j18 = jArr11[i24];
                                            if (j17 != -1) {
                                                iArr11 = iArr5;
                                                long jA11 = z.a(j18, sVar.f16972c, sVar.f16973d) + j17;
                                                iA = z.a(jArr5, j17, true, true);
                                                iA2 = z.a(jArr5, jA11, z12, false);
                                                if (z15) {
                                                    int i610 = iA2 - iA;
                                                    System.arraycopy(jArr4, iA, jArr9, i25, i610);
                                                    iArr9 = iArr8;
                                                    System.arraycopy(iArr2, iA, iArr9, i25, i610);
                                                    iArr10 = iArr11;
                                                    System.arraycopy(iArr3, iA, iArr10, i25, i610);
                                                } else {
                                                    iArr9 = iArr8;
                                                    iArr10 = iArr11;
                                                }
                                                int i611 = i23;
                                                while (true) {
                                                    jArr14 = jArr4;
                                                    z18 = z12;
                                                    if (iA >= iA2) {
                                                        break;
                                                        break;
                                                    }
                                                    long j28 = j17;
                                                    jArr13[i25] = z.a(j16, 1000000L, sVar.f16973d) + z.a(jArr5[iA] - j17, 1000000L, sVar.f16972c);
                                                    if (!z15) {
                                                    }
                                                    i25++;
                                                    iA++;
                                                    jArr4 = jArr14;
                                                    j17 = j28;
                                                    z12 = z18;
                                                }
                                                i23 = i611;
                                            } else {
                                                jArr14 = jArr4;
                                                z18 = z12;
                                                iArr9 = iArr8;
                                                iArr10 = iArr5;
                                            }
                                            j16 += j18;
                                            i24++;
                                            iArr4 = iArr9;
                                            iArr5 = iArr10;
                                            jArr10 = jArr13;
                                            jArr4 = jArr14;
                                            z12 = z18;
                                        }
                                        jArr12 = jArr10;
                                        iArr6 = iArr4;
                                        iArr7 = iArr5;
                                        z16 = false;
                                        while (i26 < iArr7.length) {
                                            if ((iArr7[i26] & 1) != 0) {
                                                z17 = true;
                                            } else {
                                                z17 = false;
                                            }
                                            z16 |= z17;
                                        }
                                        if (!z16) {
                                            throw new com.fyber.inneractive.sdk.player.exoplayer2.r("The edited sample sequence does not contain a sync sample.");
                                        }
                                        vVar = new v(jArr9, iArr6, i23, jArr12, iArr7);
                                    } else {
                                        jArr7 = sVar.f16978i;
                                        if (jArr7.length == 1) {
                                            c10 = 0;
                                            if (jArr7[0] == 0) {
                                                i27 = 0;
                                                while (i27 < jArr5.length) {
                                                    jArr5[i27] = z.a(jArr5[i27] - sVar.f16979j[c10], 1000000L, sVar.f16972c);
                                                    i27++;
                                                    c10 = 0;
                                                }
                                                vVar2 = new v(jArr4, iArr2, i18, jArr5, iArr3);
                                                vVar = vVar2;
                                                mVar3 = mVar;
                                            }
                                        }
                                        if (sVar.f16971b == 1) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        i20 = 0;
                                        i21 = 0;
                                        i22 = 0;
                                        z13 = false;
                                        while (true) {
                                            jArr8 = sVar.f16978i;
                                            if (i20 >= jArr8.length) {
                                                break;
                                                break;
                                            }
                                            j19 = sVar.f16979j[i20];
                                            if (j19 != -1) {
                                                long jA12 = z.a(jArr8[i20], sVar.f16972c, sVar.f16973d);
                                                iA3 = z.a(jArr5, j19, true, true);
                                                int iA9 = z.a(jArr5, j19 + jA12, z12, false);
                                                int i612 = (iA9 - iA3) + i21;
                                                if (i22 != iA3) {
                                                    z19 = true;
                                                } else {
                                                    z19 = false;
                                                }
                                                i22 = iA9;
                                                z13 = z19 | z13;
                                                i21 = i612;
                                            }
                                            i20++;
                                            mVar = mVar;
                                        }
                                        mVar3 = mVar;
                                        if (i21 != i10) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        z15 = z14 | z13;
                                        if (z15) {
                                            jArr9 = new long[i21];
                                        } else {
                                            jArr9 = jArr4;
                                        }
                                        if (z15) {
                                            iArr4 = new int[i21];
                                        } else {
                                            iArr4 = iArr2;
                                        }
                                        if (z15) {
                                            i18 = 0;
                                        }
                                        if (z15) {
                                            iArr5 = new int[i21];
                                        } else {
                                            iArr5 = iArr3;
                                        }
                                        jArr10 = new long[i21];
                                        i23 = i18;
                                        i24 = 0;
                                        i25 = 0;
                                        j16 = 0;
                                        while (true) {
                                            jArr11 = sVar.f16978i;
                                            if (i24 >= jArr11.length) {
                                                break;
                                                break;
                                            }
                                            jArr13 = jArr10;
                                            iArr8 = iArr4;
                                            j17 = sVar.f16979j[i24];
                                            j18 = jArr11[i24];
                                            if (j17 != -1) {
                                                iArr11 = iArr5;
                                                long jA13 = z.a(j18, sVar.f16972c, sVar.f16973d) + j17;
                                                iA = z.a(jArr5, j17, true, true);
                                                iA2 = z.a(jArr5, jA13, z12, false);
                                                if (z15) {
                                                    int i613 = iA2 - iA;
                                                    System.arraycopy(jArr4, iA, jArr9, i25, i613);
                                                    iArr9 = iArr8;
                                                    System.arraycopy(iArr2, iA, iArr9, i25, i613);
                                                    iArr10 = iArr11;
                                                    System.arraycopy(iArr3, iA, iArr10, i25, i613);
                                                } else {
                                                    iArr9 = iArr8;
                                                    iArr10 = iArr11;
                                                }
                                                int i614 = i23;
                                                while (true) {
                                                    jArr14 = jArr4;
                                                    z18 = z12;
                                                    if (iA >= iA2) {
                                                        break;
                                                        break;
                                                    }
                                                    long j29 = j17;
                                                    jArr13[i25] = z.a(j16, 1000000L, sVar.f16973d) + z.a(jArr5[iA] - j17, 1000000L, sVar.f16972c);
                                                    if (!z15) {
                                                    }
                                                    i25++;
                                                    iA++;
                                                    jArr4 = jArr14;
                                                    j17 = j29;
                                                    z12 = z18;
                                                }
                                                i23 = i614;
                                            } else {
                                                jArr14 = jArr4;
                                                z18 = z12;
                                                iArr9 = iArr8;
                                                iArr10 = iArr5;
                                            }
                                            j16 += j18;
                                            i24++;
                                            iArr4 = iArr9;
                                            iArr5 = iArr10;
                                            jArr10 = jArr13;
                                            jArr4 = jArr14;
                                            z12 = z18;
                                        }
                                        jArr12 = jArr10;
                                        iArr6 = iArr4;
                                        iArr7 = iArr5;
                                        z16 = false;
                                        while (i26 < iArr7.length) {
                                            if ((iArr7[i26] & 1) != 0) {
                                                z17 = true;
                                            } else {
                                                z17 = false;
                                            }
                                            z16 |= z17;
                                        }
                                        if (!z16) {
                                            throw new com.fyber.inneractive.sdk.player.exoplayer2.r("The edited sample sequence does not contain a sync sample.");
                                        }
                                        vVar = new v(jArr9, iArr6, i23, jArr12, iArr7);
                                    }
                                }
                                z.a(jArr5, sVar.f16972c);
                                vVar = new v(jArr4, iArr2, i18, jArr5, iArr3);
                            } else {
                                iM2 = 0;
                            }
                            iM3 = -1;
                            if (hVar.c()) {
                                j12 = j21;
                                if (!"audio/raw".equals(sVarA.f16975f.f17504f)) {
                                }
                                if (z11) {
                                    jArr4 = new long[iA4];
                                    iArr12 = new int[iA4];
                                    jArr5 = new long[iA4];
                                    iArr13 = new int[iA4];
                                    i28 = iM10;
                                    i29 = iM2;
                                    iM4 = iM3;
                                    i30 = iM8;
                                    i31 = 0;
                                    i32 = 0;
                                    iB2 = 0;
                                    i33 = 0;
                                    j20 = 0;
                                    j14 = 0;
                                    i34 = iM;
                                    iM5 = 0;
                                    i35 = iM9;
                                    while (i31 < iA4) {
                                        while (i33 == 0) {
                                            if (dVar.a()) {
                                                throw new IllegalStateException();
                                            }
                                            j20 = dVar.f16858d;
                                            i33 = dVar.f16857c;
                                            iArr13 = iArr13;
                                            i28 = i28;
                                        }
                                        i36 = i28;
                                        iArr16 = iArr13;
                                        if (nVar6 != null) {
                                            while (iM5 == 0) {
                                                iM5 = nVar6.m();
                                                iB2 = nVar6.b();
                                                i34--;
                                            }
                                            iM5--;
                                        }
                                        int i519 = iB2;
                                        jArr4[i31] = j20;
                                        iB3 = hVar.b();
                                        iArr12[i31] = iB3;
                                        if (iB3 > i32) {
                                            i32 = iB3;
                                        }
                                        int i5110 = iA4;
                                        jArr5[i31] = j14 + ((long) i519);
                                        if (nVar5 == null) {
                                            i37 = 1;
                                        } else {
                                            i37 = 0;
                                        }
                                        iArr16[i31] = i37;
                                        if (i31 == iM4) {
                                            iArr16[i31] = 1;
                                            i29--;
                                            if (i29 > 0) {
                                                iM4 = nVar5.m() - 1;
                                            }
                                        }
                                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar9 = nVar5;
                                        int i5111 = iM4;
                                        j14 += (long) i36;
                                        iM6 = i35 - 1;
                                        if (iM6 == 0) {
                                            iM7 = i36;
                                        } else {
                                            iM7 = i36;
                                        }
                                        j20 += (long) iArr12[i31];
                                        i33--;
                                        i31++;
                                        iArr12 = iArr12;
                                        nVar5 = nVar9;
                                        iA4 = i5110;
                                        iArr13 = iArr16;
                                        i35 = iM6;
                                        iB2 = i519;
                                        i28 = iM7;
                                        iM4 = i5111;
                                    }
                                    iArr14 = iArr13;
                                    i10 = iA4;
                                    iArr15 = iArr12;
                                    if (iM5 == 0) {
                                        throw new IllegalArgumentException();
                                    }
                                    while (i34 > 0) {
                                        if (nVar6.m() == 0) {
                                            throw new IllegalArgumentException();
                                        }
                                        nVar6.b();
                                        i34--;
                                    }
                                    if (i29 != 0) {
                                        StringBuilder sb5 = new StringBuilder("Inconsistent stbl box for track ");
                                        sVar = sVarA;
                                        sb5.append(sVar.f16970a);
                                        sb5.append(": remainingSynchronizationSamples ");
                                        sb5.append(i29);
                                        sb5.append(", remainingSamplesAtTimestampDelta ");
                                        sb5.append(i35);
                                        sb5.append(", remainingSamplesInChunk ");
                                        sb5.append(i33);
                                        sb5.append(", remainingTimestampDeltaChanges ");
                                        sb5.append(i30);
                                        Log.w("AtomParsers", sb5.toString());
                                    } else {
                                        StringBuilder sb6 = new StringBuilder("Inconsistent stbl box for track ");
                                        sVar = sVarA;
                                        sb6.append(sVar.f16970a);
                                        sb6.append(": remainingSynchronizationSamples ");
                                        sb6.append(i29);
                                        sb6.append(", remainingSamplesAtTimestampDelta ");
                                        sb6.append(i35);
                                        sb6.append(", remainingSamplesInChunk ");
                                        sb6.append(i33);
                                        sb6.append(", remainingTimestampDeltaChanges ");
                                        sb6.append(i30);
                                        Log.w("AtomParsers", sb6.toString());
                                    }
                                    i18 = i32;
                                    iArr2 = iArr15;
                                    iArr3 = iArr14;
                                } else {
                                    sVar = sVarA;
                                    i10 = iA4;
                                    i11 = dVar.f16855a;
                                    jArr = new long[i11];
                                    iArr = new int[i11];
                                    while (dVar.a()) {
                                        int i5112 = dVar.f16856b;
                                        jArr[i5112] = dVar.f16858d;
                                        iArr[i5112] = dVar.f16857c;
                                    }
                                    iB = hVar.b();
                                    j13 = iM10;
                                    i12 = 8192 / iB;
                                    i14 = 0;
                                    while (i13 < i11) {
                                        int i5113 = iArr[i13];
                                        int i5114 = z.f17873a;
                                        i14 += ((i5113 + i12) - 1) / i12;
                                    }
                                    jArr2 = new long[i14];
                                    iArr2 = new int[i14];
                                    jArr3 = new long[i14];
                                    iArr3 = new int[i14];
                                    i15 = 0;
                                    i16 = 0;
                                    i17 = 0;
                                    iMax = 0;
                                    while (i15 < i11) {
                                        int i5115 = iArr[i15];
                                        j15 = jArr[i15];
                                        int i5116 = i11;
                                        i19 = i5115;
                                        while (i19 > 0) {
                                            int iMin3 = Math.min(i12, i19);
                                            jArr2[i17] = j15;
                                            long[] jArr17 = jArr;
                                            int i5117 = iB * iMin3;
                                            iArr2[i17] = i5117;
                                            iMax = Math.max(iMax, i5117);
                                            jArr3[i17] = ((long) i16) * j13;
                                            iArr3[i17] = 1;
                                            j15 += (long) iArr2[i17];
                                            i16 += iMin3;
                                            i19 -= iMin3;
                                            i17++;
                                            iArr = iArr;
                                            jArr = jArr17;
                                            iB = iB;
                                        }
                                        i15++;
                                        i11 = i5116;
                                        jArr = jArr;
                                    }
                                    jArr4 = jArr2;
                                    jArr5 = jArr3;
                                    i18 = iMax;
                                    j14 = 0;
                                }
                                jArr6 = sVar.f16978i;
                                if (jArr6 != null) {
                                    mVar = mVar3;
                                    if (mVar.f16704a == -1) {
                                    }
                                    if (jArr6.length == 1) {
                                        jArr7 = sVar.f16978i;
                                        if (jArr7.length == 1) {
                                            c10 = 0;
                                            if (jArr7[0] == 0) {
                                                i27 = 0;
                                                while (i27 < jArr5.length) {
                                                    jArr5[i27] = z.a(jArr5[i27] - sVar.f16979j[c10], 1000000L, sVar.f16972c);
                                                    i27++;
                                                    c10 = 0;
                                                }
                                                vVar2 = new v(jArr4, iArr2, i18, jArr5, iArr3);
                                                vVar = vVar2;
                                                mVar3 = mVar;
                                            }
                                        }
                                        if (sVar.f16971b == 1) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        i20 = 0;
                                        i21 = 0;
                                        i22 = 0;
                                        z13 = false;
                                        while (true) {
                                            jArr8 = sVar.f16978i;
                                            if (i20 >= jArr8.length) {
                                                break;
                                                break;
                                            }
                                            j19 = sVar.f16979j[i20];
                                            if (j19 != -1) {
                                                long jA14 = z.a(jArr8[i20], sVar.f16972c, sVar.f16973d);
                                                iA3 = z.a(jArr5, j19, true, true);
                                                int iA10 = z.a(jArr5, j19 + jA14, z12, false);
                                                int i615 = (iA10 - iA3) + i21;
                                                if (i22 != iA3) {
                                                    z19 = true;
                                                } else {
                                                    z19 = false;
                                                }
                                                i22 = iA10;
                                                z13 = z19 | z13;
                                                i21 = i615;
                                            }
                                            i20++;
                                            mVar = mVar;
                                        }
                                        mVar3 = mVar;
                                        if (i21 != i10) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        z15 = z14 | z13;
                                        if (z15) {
                                            jArr9 = new long[i21];
                                        } else {
                                            jArr9 = jArr4;
                                        }
                                        if (z15) {
                                            iArr4 = new int[i21];
                                        } else {
                                            iArr4 = iArr2;
                                        }
                                        if (z15) {
                                            i18 = 0;
                                        }
                                        if (z15) {
                                            iArr5 = new int[i21];
                                        } else {
                                            iArr5 = iArr3;
                                        }
                                        jArr10 = new long[i21];
                                        i23 = i18;
                                        i24 = 0;
                                        i25 = 0;
                                        j16 = 0;
                                        while (true) {
                                            jArr11 = sVar.f16978i;
                                            if (i24 >= jArr11.length) {
                                                break;
                                                break;
                                            }
                                            jArr13 = jArr10;
                                            iArr8 = iArr4;
                                            j17 = sVar.f16979j[i24];
                                            j18 = jArr11[i24];
                                            if (j17 != -1) {
                                                iArr11 = iArr5;
                                                long jA15 = z.a(j18, sVar.f16972c, sVar.f16973d) + j17;
                                                iA = z.a(jArr5, j17, true, true);
                                                iA2 = z.a(jArr5, jA15, z12, false);
                                                if (z15) {
                                                    int i616 = iA2 - iA;
                                                    System.arraycopy(jArr4, iA, jArr9, i25, i616);
                                                    iArr9 = iArr8;
                                                    System.arraycopy(iArr2, iA, iArr9, i25, i616);
                                                    iArr10 = iArr11;
                                                    System.arraycopy(iArr3, iA, iArr10, i25, i616);
                                                } else {
                                                    iArr9 = iArr8;
                                                    iArr10 = iArr11;
                                                }
                                                int i617 = i23;
                                                while (true) {
                                                    jArr14 = jArr4;
                                                    z18 = z12;
                                                    if (iA >= iA2) {
                                                        break;
                                                        break;
                                                    }
                                                    long j210 = j17;
                                                    jArr13[i25] = z.a(j16, 1000000L, sVar.f16973d) + z.a(jArr5[iA] - j17, 1000000L, sVar.f16972c);
                                                    if (!z15) {
                                                    }
                                                    i25++;
                                                    iA++;
                                                    jArr4 = jArr14;
                                                    j17 = j210;
                                                    z12 = z18;
                                                }
                                                i23 = i617;
                                            } else {
                                                jArr14 = jArr4;
                                                z18 = z12;
                                                iArr9 = iArr8;
                                                iArr10 = iArr5;
                                            }
                                            j16 += j18;
                                            i24++;
                                            iArr4 = iArr9;
                                            iArr5 = iArr10;
                                            jArr10 = jArr13;
                                            jArr4 = jArr14;
                                            z12 = z18;
                                        }
                                        jArr12 = jArr10;
                                        iArr6 = iArr4;
                                        iArr7 = iArr5;
                                        z16 = false;
                                        while (i26 < iArr7.length) {
                                            if ((iArr7[i26] & 1) != 0) {
                                                z17 = true;
                                            } else {
                                                z17 = false;
                                            }
                                            z16 |= z17;
                                        }
                                        if (!z16) {
                                            throw new com.fyber.inneractive.sdk.player.exoplayer2.r("The edited sample sequence does not contain a sync sample.");
                                        }
                                        vVar = new v(jArr9, iArr6, i23, jArr12, iArr7);
                                    } else {
                                        jArr7 = sVar.f16978i;
                                        if (jArr7.length == 1) {
                                            c10 = 0;
                                            if (jArr7[0] == 0) {
                                                i27 = 0;
                                                while (i27 < jArr5.length) {
                                                    jArr5[i27] = z.a(jArr5[i27] - sVar.f16979j[c10], 1000000L, sVar.f16972c);
                                                    i27++;
                                                    c10 = 0;
                                                }
                                                vVar2 = new v(jArr4, iArr2, i18, jArr5, iArr3);
                                                vVar = vVar2;
                                                mVar3 = mVar;
                                            }
                                        }
                                        if (sVar.f16971b == 1) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        i20 = 0;
                                        i21 = 0;
                                        i22 = 0;
                                        z13 = false;
                                        while (true) {
                                            jArr8 = sVar.f16978i;
                                            if (i20 >= jArr8.length) {
                                                break;
                                                break;
                                            }
                                            j19 = sVar.f16979j[i20];
                                            if (j19 != -1) {
                                                long jA16 = z.a(jArr8[i20], sVar.f16972c, sVar.f16973d);
                                                iA3 = z.a(jArr5, j19, true, true);
                                                int iA11 = z.a(jArr5, j19 + jA16, z12, false);
                                                int i618 = (iA11 - iA3) + i21;
                                                if (i22 != iA3) {
                                                    z19 = true;
                                                } else {
                                                    z19 = false;
                                                }
                                                i22 = iA11;
                                                z13 = z19 | z13;
                                                i21 = i618;
                                            }
                                            i20++;
                                            mVar = mVar;
                                        }
                                        mVar3 = mVar;
                                        if (i21 != i10) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        z15 = z14 | z13;
                                        if (z15) {
                                            jArr9 = new long[i21];
                                        } else {
                                            jArr9 = jArr4;
                                        }
                                        if (z15) {
                                            iArr4 = new int[i21];
                                        } else {
                                            iArr4 = iArr2;
                                        }
                                        if (z15) {
                                            i18 = 0;
                                        }
                                        if (z15) {
                                            iArr5 = new int[i21];
                                        } else {
                                            iArr5 = iArr3;
                                        }
                                        jArr10 = new long[i21];
                                        i23 = i18;
                                        i24 = 0;
                                        i25 = 0;
                                        j16 = 0;
                                        while (true) {
                                            jArr11 = sVar.f16978i;
                                            if (i24 >= jArr11.length) {
                                                break;
                                                break;
                                            }
                                            jArr13 = jArr10;
                                            iArr8 = iArr4;
                                            j17 = sVar.f16979j[i24];
                                            j18 = jArr11[i24];
                                            if (j17 != -1) {
                                                iArr11 = iArr5;
                                                long jA17 = z.a(j18, sVar.f16972c, sVar.f16973d) + j17;
                                                iA = z.a(jArr5, j17, true, true);
                                                iA2 = z.a(jArr5, jA17, z12, false);
                                                if (z15) {
                                                    int i619 = iA2 - iA;
                                                    System.arraycopy(jArr4, iA, jArr9, i25, i619);
                                                    iArr9 = iArr8;
                                                    System.arraycopy(iArr2, iA, iArr9, i25, i619);
                                                    iArr10 = iArr11;
                                                    System.arraycopy(iArr3, iA, iArr10, i25, i619);
                                                } else {
                                                    iArr9 = iArr8;
                                                    iArr10 = iArr11;
                                                }
                                                int i6110 = i23;
                                                while (true) {
                                                    jArr14 = jArr4;
                                                    z18 = z12;
                                                    if (iA >= iA2) {
                                                        break;
                                                        break;
                                                    }
                                                    long j211 = j17;
                                                    jArr13[i25] = z.a(j16, 1000000L, sVar.f16973d) + z.a(jArr5[iA] - j17, 1000000L, sVar.f16972c);
                                                    if (!z15) {
                                                    }
                                                    i25++;
                                                    iA++;
                                                    jArr4 = jArr14;
                                                    j17 = j211;
                                                    z12 = z18;
                                                }
                                                i23 = i6110;
                                            } else {
                                                jArr14 = jArr4;
                                                z18 = z12;
                                                iArr9 = iArr8;
                                                iArr10 = iArr5;
                                            }
                                            j16 += j18;
                                            i24++;
                                            iArr4 = iArr9;
                                            iArr5 = iArr10;
                                            jArr10 = jArr13;
                                            jArr4 = jArr14;
                                            z12 = z18;
                                        }
                                        jArr12 = jArr10;
                                        iArr6 = iArr4;
                                        iArr7 = iArr5;
                                        z16 = false;
                                        while (i26 < iArr7.length) {
                                            if ((iArr7[i26] & 1) != 0) {
                                                z17 = true;
                                            } else {
                                                z17 = false;
                                            }
                                            z16 |= z17;
                                        }
                                        if (!z16) {
                                            throw new com.fyber.inneractive.sdk.player.exoplayer2.r("The edited sample sequence does not contain a sync sample.");
                                        }
                                        vVar = new v(jArr9, iArr6, i23, jArr12, iArr7);
                                    }
                                }
                                z.a(jArr5, sVar.f16972c);
                                vVar = new v(jArr4, iArr2, i18, jArr5, iArr3);
                            } else {
                                j12 = j21;
                            }
                            z11 = false;
                            if (z11) {
                                jArr4 = new long[iA4];
                                iArr12 = new int[iA4];
                                jArr5 = new long[iA4];
                                iArr13 = new int[iA4];
                                i28 = iM10;
                                i29 = iM2;
                                iM4 = iM3;
                                i30 = iM8;
                                i31 = 0;
                                i32 = 0;
                                iB2 = 0;
                                i33 = 0;
                                j20 = 0;
                                j14 = 0;
                                i34 = iM;
                                iM5 = 0;
                                i35 = iM9;
                                while (i31 < iA4) {
                                    while (i33 == 0) {
                                        if (dVar.a()) {
                                            throw new IllegalStateException();
                                        }
                                        j20 = dVar.f16858d;
                                        i33 = dVar.f16857c;
                                        iArr13 = iArr13;
                                        i28 = i28;
                                    }
                                    i36 = i28;
                                    iArr16 = iArr13;
                                    if (nVar6 != null) {
                                        while (iM5 == 0) {
                                            iM5 = nVar6.m();
                                            iB2 = nVar6.b();
                                            i34--;
                                        }
                                        iM5--;
                                    }
                                    int i5118 = iB2;
                                    jArr4[i31] = j20;
                                    iB3 = hVar.b();
                                    iArr12[i31] = iB3;
                                    if (iB3 > i32) {
                                        i32 = iB3;
                                    }
                                    int i5119 = iA4;
                                    jArr5[i31] = j14 + ((long) i5118);
                                    if (nVar5 == null) {
                                        i37 = 1;
                                    } else {
                                        i37 = 0;
                                    }
                                    iArr16[i31] = i37;
                                    if (i31 == iM4) {
                                        iArr16[i31] = 1;
                                        i29--;
                                        if (i29 > 0) {
                                            iM4 = nVar5.m() - 1;
                                        }
                                    }
                                    com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar10 = nVar5;
                                    int i51110 = iM4;
                                    j14 += (long) i36;
                                    iM6 = i35 - 1;
                                    if (iM6 == 0) {
                                        iM7 = i36;
                                    } else {
                                        iM7 = i36;
                                    }
                                    j20 += (long) iArr12[i31];
                                    i33--;
                                    i31++;
                                    iArr12 = iArr12;
                                    nVar5 = nVar10;
                                    iA4 = i5119;
                                    iArr13 = iArr16;
                                    i35 = iM6;
                                    iB2 = i5118;
                                    i28 = iM7;
                                    iM4 = i51110;
                                }
                                iArr14 = iArr13;
                                i10 = iA4;
                                iArr15 = iArr12;
                                if (iM5 == 0) {
                                    throw new IllegalArgumentException();
                                }
                                while (i34 > 0) {
                                    if (nVar6.m() == 0) {
                                        throw new IllegalArgumentException();
                                    }
                                    nVar6.b();
                                    i34--;
                                }
                                if (i29 != 0) {
                                    StringBuilder sb7 = new StringBuilder("Inconsistent stbl box for track ");
                                    sVar = sVarA;
                                    sb7.append(sVar.f16970a);
                                    sb7.append(": remainingSynchronizationSamples ");
                                    sb7.append(i29);
                                    sb7.append(", remainingSamplesAtTimestampDelta ");
                                    sb7.append(i35);
                                    sb7.append(", remainingSamplesInChunk ");
                                    sb7.append(i33);
                                    sb7.append(", remainingTimestampDeltaChanges ");
                                    sb7.append(i30);
                                    Log.w("AtomParsers", sb7.toString());
                                } else {
                                    StringBuilder sb8 = new StringBuilder("Inconsistent stbl box for track ");
                                    sVar = sVarA;
                                    sb8.append(sVar.f16970a);
                                    sb8.append(": remainingSynchronizationSamples ");
                                    sb8.append(i29);
                                    sb8.append(", remainingSamplesAtTimestampDelta ");
                                    sb8.append(i35);
                                    sb8.append(", remainingSamplesInChunk ");
                                    sb8.append(i33);
                                    sb8.append(", remainingTimestampDeltaChanges ");
                                    sb8.append(i30);
                                    Log.w("AtomParsers", sb8.toString());
                                }
                                i18 = i32;
                                iArr2 = iArr15;
                                iArr3 = iArr14;
                            } else {
                                sVar = sVarA;
                                i10 = iA4;
                                i11 = dVar.f16855a;
                                jArr = new long[i11];
                                iArr = new int[i11];
                                while (dVar.a()) {
                                    int i51111 = dVar.f16856b;
                                    jArr[i51111] = dVar.f16858d;
                                    iArr[i51111] = dVar.f16857c;
                                }
                                iB = hVar.b();
                                j13 = iM10;
                                i12 = 8192 / iB;
                                i14 = 0;
                                while (i13 < i11) {
                                    int i51112 = iArr[i13];
                                    int i51113 = z.f17873a;
                                    i14 += ((i51112 + i12) - 1) / i12;
                                }
                                jArr2 = new long[i14];
                                iArr2 = new int[i14];
                                jArr3 = new long[i14];
                                iArr3 = new int[i14];
                                i15 = 0;
                                i16 = 0;
                                i17 = 0;
                                iMax = 0;
                                while (i15 < i11) {
                                    int i51114 = iArr[i15];
                                    j15 = jArr[i15];
                                    int i51115 = i11;
                                    i19 = i51114;
                                    while (i19 > 0) {
                                        int iMin4 = Math.min(i12, i19);
                                        jArr2[i17] = j15;
                                        long[] jArr18 = jArr;
                                        int i51116 = iB * iMin4;
                                        iArr2[i17] = i51116;
                                        iMax = Math.max(iMax, i51116);
                                        jArr3[i17] = ((long) i16) * j13;
                                        iArr3[i17] = 1;
                                        j15 += (long) iArr2[i17];
                                        i16 += iMin4;
                                        i19 -= iMin4;
                                        i17++;
                                        iArr = iArr;
                                        jArr = jArr18;
                                        iB = iB;
                                    }
                                    i15++;
                                    i11 = i51115;
                                    jArr = jArr;
                                }
                                jArr4 = jArr2;
                                jArr5 = jArr3;
                                i18 = iMax;
                                j14 = 0;
                            }
                            jArr6 = sVar.f16978i;
                            if (jArr6 != null) {
                                mVar = mVar3;
                                if (mVar.f16704a == -1) {
                                }
                                if (jArr6.length == 1) {
                                    jArr7 = sVar.f16978i;
                                    if (jArr7.length == 1) {
                                        c10 = 0;
                                        if (jArr7[0] == 0) {
                                            i27 = 0;
                                            while (i27 < jArr5.length) {
                                                jArr5[i27] = z.a(jArr5[i27] - sVar.f16979j[c10], 1000000L, sVar.f16972c);
                                                i27++;
                                                c10 = 0;
                                            }
                                            vVar2 = new v(jArr4, iArr2, i18, jArr5, iArr3);
                                            vVar = vVar2;
                                            mVar3 = mVar;
                                        }
                                    }
                                    if (sVar.f16971b == 1) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    i20 = 0;
                                    i21 = 0;
                                    i22 = 0;
                                    z13 = false;
                                    while (true) {
                                        jArr8 = sVar.f16978i;
                                        if (i20 >= jArr8.length) {
                                            break;
                                            break;
                                        }
                                        j19 = sVar.f16979j[i20];
                                        if (j19 != -1) {
                                            long jA18 = z.a(jArr8[i20], sVar.f16972c, sVar.f16973d);
                                            iA3 = z.a(jArr5, j19, true, true);
                                            int iA12 = z.a(jArr5, j19 + jA18, z12, false);
                                            int i6111 = (iA12 - iA3) + i21;
                                            if (i22 != iA3) {
                                                z19 = true;
                                            } else {
                                                z19 = false;
                                            }
                                            i22 = iA12;
                                            z13 = z19 | z13;
                                            i21 = i6111;
                                        }
                                        i20++;
                                        mVar = mVar;
                                    }
                                    mVar3 = mVar;
                                    if (i21 != i10) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    z15 = z14 | z13;
                                    if (z15) {
                                        jArr9 = new long[i21];
                                    } else {
                                        jArr9 = jArr4;
                                    }
                                    if (z15) {
                                        iArr4 = new int[i21];
                                    } else {
                                        iArr4 = iArr2;
                                    }
                                    if (z15) {
                                        i18 = 0;
                                    }
                                    if (z15) {
                                        iArr5 = new int[i21];
                                    } else {
                                        iArr5 = iArr3;
                                    }
                                    jArr10 = new long[i21];
                                    i23 = i18;
                                    i24 = 0;
                                    i25 = 0;
                                    j16 = 0;
                                    while (true) {
                                        jArr11 = sVar.f16978i;
                                        if (i24 >= jArr11.length) {
                                            break;
                                            break;
                                        }
                                        jArr13 = jArr10;
                                        iArr8 = iArr4;
                                        j17 = sVar.f16979j[i24];
                                        j18 = jArr11[i24];
                                        if (j17 != -1) {
                                            iArr11 = iArr5;
                                            long jA19 = z.a(j18, sVar.f16972c, sVar.f16973d) + j17;
                                            iA = z.a(jArr5, j17, true, true);
                                            iA2 = z.a(jArr5, jA19, z12, false);
                                            if (z15) {
                                                int i6112 = iA2 - iA;
                                                System.arraycopy(jArr4, iA, jArr9, i25, i6112);
                                                iArr9 = iArr8;
                                                System.arraycopy(iArr2, iA, iArr9, i25, i6112);
                                                iArr10 = iArr11;
                                                System.arraycopy(iArr3, iA, iArr10, i25, i6112);
                                            } else {
                                                iArr9 = iArr8;
                                                iArr10 = iArr11;
                                            }
                                            int i6113 = i23;
                                            while (true) {
                                                jArr14 = jArr4;
                                                z18 = z12;
                                                if (iA >= iA2) {
                                                    break;
                                                    break;
                                                }
                                                long j212 = j17;
                                                jArr13[i25] = z.a(j16, 1000000L, sVar.f16973d) + z.a(jArr5[iA] - j17, 1000000L, sVar.f16972c);
                                                if (!z15) {
                                                }
                                                i25++;
                                                iA++;
                                                jArr4 = jArr14;
                                                j17 = j212;
                                                z12 = z18;
                                            }
                                            i23 = i6113;
                                        } else {
                                            jArr14 = jArr4;
                                            z18 = z12;
                                            iArr9 = iArr8;
                                            iArr10 = iArr5;
                                        }
                                        j16 += j18;
                                        i24++;
                                        iArr4 = iArr9;
                                        iArr5 = iArr10;
                                        jArr10 = jArr13;
                                        jArr4 = jArr14;
                                        z12 = z18;
                                    }
                                    jArr12 = jArr10;
                                    iArr6 = iArr4;
                                    iArr7 = iArr5;
                                    z16 = false;
                                    while (i26 < iArr7.length) {
                                        if ((iArr7[i26] & 1) != 0) {
                                            z17 = true;
                                        } else {
                                            z17 = false;
                                        }
                                        z16 |= z17;
                                    }
                                    if (!z16) {
                                        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("The edited sample sequence does not contain a sync sample.");
                                    }
                                    vVar = new v(jArr9, iArr6, i23, jArr12, iArr7);
                                } else {
                                    jArr7 = sVar.f16978i;
                                    if (jArr7.length == 1) {
                                        c10 = 0;
                                        if (jArr7[0] == 0) {
                                            i27 = 0;
                                            while (i27 < jArr5.length) {
                                                jArr5[i27] = z.a(jArr5[i27] - sVar.f16979j[c10], 1000000L, sVar.f16972c);
                                                i27++;
                                                c10 = 0;
                                            }
                                            vVar2 = new v(jArr4, iArr2, i18, jArr5, iArr3);
                                            vVar = vVar2;
                                            mVar3 = mVar;
                                        }
                                    }
                                    if (sVar.f16971b == 1) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    i20 = 0;
                                    i21 = 0;
                                    i22 = 0;
                                    z13 = false;
                                    while (true) {
                                        jArr8 = sVar.f16978i;
                                        if (i20 >= jArr8.length) {
                                            break;
                                            break;
                                        }
                                        j19 = sVar.f16979j[i20];
                                        if (j19 != -1) {
                                            long jA110 = z.a(jArr8[i20], sVar.f16972c, sVar.f16973d);
                                            iA3 = z.a(jArr5, j19, true, true);
                                            int iA13 = z.a(jArr5, j19 + jA110, z12, false);
                                            int i6114 = (iA13 - iA3) + i21;
                                            if (i22 != iA3) {
                                                z19 = true;
                                            } else {
                                                z19 = false;
                                            }
                                            i22 = iA13;
                                            z13 = z19 | z13;
                                            i21 = i6114;
                                        }
                                        i20++;
                                        mVar = mVar;
                                    }
                                    mVar3 = mVar;
                                    if (i21 != i10) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    z15 = z14 | z13;
                                    if (z15) {
                                        jArr9 = new long[i21];
                                    } else {
                                        jArr9 = jArr4;
                                    }
                                    if (z15) {
                                        iArr4 = new int[i21];
                                    } else {
                                        iArr4 = iArr2;
                                    }
                                    if (z15) {
                                        i18 = 0;
                                    }
                                    if (z15) {
                                        iArr5 = new int[i21];
                                    } else {
                                        iArr5 = iArr3;
                                    }
                                    jArr10 = new long[i21];
                                    i23 = i18;
                                    i24 = 0;
                                    i25 = 0;
                                    j16 = 0;
                                    while (true) {
                                        jArr11 = sVar.f16978i;
                                        if (i24 >= jArr11.length) {
                                            break;
                                            break;
                                        }
                                        jArr13 = jArr10;
                                        iArr8 = iArr4;
                                        j17 = sVar.f16979j[i24];
                                        j18 = jArr11[i24];
                                        if (j17 != -1) {
                                            iArr11 = iArr5;
                                            long jA111 = z.a(j18, sVar.f16972c, sVar.f16973d) + j17;
                                            iA = z.a(jArr5, j17, true, true);
                                            iA2 = z.a(jArr5, jA111, z12, false);
                                            if (z15) {
                                                int i6115 = iA2 - iA;
                                                System.arraycopy(jArr4, iA, jArr9, i25, i6115);
                                                iArr9 = iArr8;
                                                System.arraycopy(iArr2, iA, iArr9, i25, i6115);
                                                iArr10 = iArr11;
                                                System.arraycopy(iArr3, iA, iArr10, i25, i6115);
                                            } else {
                                                iArr9 = iArr8;
                                                iArr10 = iArr11;
                                            }
                                            int i6116 = i23;
                                            while (true) {
                                                jArr14 = jArr4;
                                                z18 = z12;
                                                if (iA >= iA2) {
                                                    break;
                                                    break;
                                                }
                                                long j213 = j17;
                                                jArr13[i25] = z.a(j16, 1000000L, sVar.f16973d) + z.a(jArr5[iA] - j17, 1000000L, sVar.f16972c);
                                                if (!z15) {
                                                }
                                                i25++;
                                                iA++;
                                                jArr4 = jArr14;
                                                j17 = j213;
                                                z12 = z18;
                                            }
                                            i23 = i6116;
                                        } else {
                                            jArr14 = jArr4;
                                            z18 = z12;
                                            iArr9 = iArr8;
                                            iArr10 = iArr5;
                                        }
                                        j16 += j18;
                                        i24++;
                                        iArr4 = iArr9;
                                        iArr5 = iArr10;
                                        jArr10 = jArr13;
                                        jArr4 = jArr14;
                                        z12 = z18;
                                    }
                                    jArr12 = jArr10;
                                    iArr6 = iArr4;
                                    iArr7 = iArr5;
                                    z16 = false;
                                    while (i26 < iArr7.length) {
                                        if ((iArr7[i26] & 1) != 0) {
                                            z17 = true;
                                        } else {
                                            z17 = false;
                                        }
                                        z16 |= z17;
                                    }
                                    if (!z16) {
                                        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("The edited sample sequence does not contain a sync sample.");
                                    }
                                    vVar = new v(jArr9, iArr6, i23, jArr12, iArr7);
                                }
                            }
                            z.a(jArr5, sVar.f16972c);
                            vVar = new v(jArr4, iArr2, i18, jArr5, iArr3);
                        }
                        if (vVar.f17001a != 0) {
                            com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA = this.f16965l.a(i50, sVar.f16971b);
                            o oVar = new o(sVar, vVar, gVarA);
                            int i70 = vVar.f17004d + 30;
                            com.fyber.inneractive.sdk.player.exoplayer2.o oVar2 = sVar.f16975f;
                            String str2 = oVar2.f17499a;
                            String str3 = oVar2.f17503e;
                            String str4 = oVar2.f17504f;
                            String str5 = oVar2.f17501c;
                            int i71 = oVar2.f17500b;
                            int i72 = oVar2.f17508j;
                            int i73 = oVar2.f17509k;
                            float f10 = oVar2.f17510l;
                            int i74 = oVar2.f17511m;
                            v vVar3 = vVar;
                            float f11 = oVar2.f17512n;
                            byte[] bArr = oVar2.f17514p;
                            int i75 = oVar2.f17513o;
                            com.fyber.inneractive.sdk.player.exoplayer2.video.c cVar = oVar2.f17515q;
                            int i76 = oVar2.f17516r;
                            int i77 = oVar2.f17517s;
                            int i78 = oVar2.f17518t;
                            int i79 = oVar2.f17519u;
                            int i80 = oVar2.f17520v;
                            int i81 = oVar2.f17522x;
                            String str6 = oVar2.f17523y;
                            int i82 = oVar2.f17524z;
                            long j30 = oVar2.f17521w;
                            com.fyber.inneractive.sdk.player.exoplayer2.o oVar3 = new com.fyber.inneractive.sdk.player.exoplayer2.o(str2, str3, str4, str5, i71, i70, i72, i73, f10, i74, f11, bArr, i75, cVar, i76, i77, i78, i79, i80, i81, str6, i82, j30, oVar2.f17506h, oVar2.f17507i, oVar2.f17502d);
                            if (sVar.f16971b == 1) {
                                mVar2 = mVar3;
                                int i83 = mVar2.f16704a;
                                sVar2 = sVar;
                                if (i83 != -1 && (i38 = mVar2.f16705b) != -1) {
                                    oVar3 = new com.fyber.inneractive.sdk.player.exoplayer2.o(str2, str3, str4, str5, i71, i70, i72, i73, f10, i74, f11, bArr, i75, cVar, i76, i77, i78, i83, i38, i81, str6, i82, j30, oVar3.f17506h, oVar3.f17507i, oVar3.f17502d);
                                }
                                if (bVar != null) {
                                    oVar3 = new com.fyber.inneractive.sdk.player.exoplayer2.o(oVar3.f17499a, oVar3.f17503e, oVar3.f17504f, oVar3.f17501c, oVar3.f17500b, oVar3.f17505g, oVar3.f17508j, oVar3.f17509k, oVar3.f17510l, oVar3.f17511m, oVar3.f17512n, oVar3.f17514p, oVar3.f17513o, oVar3.f17515q, oVar3.f17516r, oVar3.f17517s, oVar3.f17518t, oVar3.f17519u, oVar3.f17520v, oVar3.f17522x, oVar3.f17523y, oVar3.f17524z, oVar3.f17521w, oVar3.f17506h, oVar3.f17507i, bVar);
                                }
                            } else {
                                sVar2 = sVar;
                                mVar2 = mVar3;
                            }
                            gVarA.a(oVar3);
                            jMax = Math.max(j12, sVar2.f16974e);
                            arrayList = arrayList2;
                            arrayList.add(oVar);
                            long j31 = vVar3.f17002b[0];
                            j22 = j31 < j11 ? j31 : j11;
                        }
                        i50++;
                        mVar3 = mVar2;
                        arrayList2 = arrayList;
                        aVar2 = aVar;
                        bVar = bVar;
                        j21 = jMax;
                        pVar = this;
                    } else {
                        aVar = aVar2;
                        bVar = bVar;
                        j12 = j21;
                        arrayList2 = arrayList2;
                        j11 = j22;
                        mVar3 = mVar3;
                        i50 = i50;
                    }
                    j22 = j11;
                    arrayList = arrayList2;
                    jMax = j12;
                    mVar2 = mVar3;
                    i50++;
                    mVar3 = mVar2;
                    arrayList2 = arrayList;
                    aVar2 = aVar;
                    bVar = bVar;
                    j21 = jMax;
                    pVar = this;
                }
                ArrayList arrayList4 = arrayList2;
                pVar.f16967n = j21;
                pVar.f16966m = (o[]) arrayList4.toArray(new o[arrayList4.size()]);
                pVar.f16965l.b();
                pVar.f16965l.a(pVar);
                pVar.f16957d.clear();
                pVar.f16958e = 2;
            } else if (!pVar.f16957d.isEmpty()) {
                ((a) pVar.f16957d.peek()).R0.add(aVar2);
            }
        }
        if (pVar.f16958e != 2) {
            pVar.f16958e = 0;
            pVar.f16961h = 0;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j10, long j11) {
        int i10;
        this.f16957d.clear();
        this.f16961h = 0;
        this.f16963j = 0;
        this.f16964k = 0;
        if (j10 == 0) {
            this.f16958e = 0;
            this.f16961h = 0;
            return;
        }
        o[] oVarArr = this.f16966m;
        if (oVarArr != null) {
            for (o oVar : oVarArr) {
                v vVar = oVar.f16950b;
                int iA = z.a(vVar.f17005e, j11, false);
                while (true) {
                    i10 = -1;
                    if (iA < 0) {
                        iA = -1;
                        break;
                    } else if ((vVar.f17006f[iA] & 1) != 0) {
                        break;
                    } else {
                        iA--;
                    }
                }
                if (iA != -1) {
                    i10 = iA;
                    break;
                    break;
                }
                iA = z.a(vVar.f17005e, j11, true, false);
                while (iA < vVar.f17005e.length) {
                    if ((vVar.f17006f[iA] & 1) != 0) {
                        i10 = iA;
                        break;
                    }
                    iA++;
                }
                oVar.f16952d = i10;
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o oVar) throws InterruptedException, com.fyber.inneractive.sdk.player.exoplayer2.r, EOFException {
        o[] oVarArr;
        int i10;
        boolean z10;
        boolean z11;
        while (true) {
            int i11 = this.f16958e;
            if (i11 == 0) {
                if (this.f16961h == 0) {
                    if (!bVar.b(this.f16956c.f17845a, 0, 8, true)) {
                        return -1;
                    }
                    this.f16961h = 8;
                    this.f16956c.e(0);
                    this.f16960g = this.f16956c.k();
                    this.f16959f = this.f16956c.b();
                }
                if (this.f16960g == 1) {
                    bVar.b(this.f16956c.f17845a, 8, 8, false);
                    this.f16961h += 8;
                    this.f16960g = this.f16956c.n();
                }
                int i12 = this.f16959f;
                if (i12 != c.C && i12 != c.E && i12 != c.F && i12 != c.G && i12 != c.H && i12 != c.Q) {
                    if (i12 != c.S && i12 != c.D && i12 != c.T && i12 != c.U && i12 != c.f16827m0 && i12 != c.f16829n0 && i12 != c.f16831o0 && i12 != c.R && i12 != c.f16833p0 && i12 != c.f16835q0 && i12 != c.f16837r0 && i12 != c.f16839s0 && i12 != c.f16841t0 && i12 != c.P && i12 != c.f16804b && i12 != c.A0) {
                        this.f16962i = null;
                        this.f16958e = 1;
                    } else if (this.f16961h == 8) {
                        long j10 = this.f16960g;
                        if (j10 <= 2147483647L) {
                            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.n((int) j10);
                            this.f16962i = nVar;
                            System.arraycopy(this.f16956c.f17845a, 0, nVar.f17845a, 0, 8);
                            this.f16958e = 1;
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    long j11 = (bVar.f16452c + this.f16960g) - ((long) this.f16961h);
                    this.f16957d.add(new a(this.f16959f, j11));
                    if (this.f16960g == this.f16961h) {
                        c(j11);
                    } else {
                        this.f16958e = 0;
                        this.f16961h = 0;
                    }
                }
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException();
                    }
                    long j12 = Long.MAX_VALUE;
                    int i13 = -1;
                    int i14 = 0;
                    while (true) {
                        oVarArr = this.f16966m;
                        if (i14 >= oVarArr.length) {
                            break;
                        }
                        o oVar2 = oVarArr[i14];
                        int i15 = oVar2.f16952d;
                        v vVar = oVar2.f16950b;
                        if (i15 != vVar.f17001a) {
                            long j13 = vVar.f17002b[i15];
                            if (j13 < j12) {
                                i13 = i14;
                                j12 = j13;
                            }
                        }
                        i14++;
                    }
                    if (i13 == -1) {
                        return -1;
                    }
                    o oVar3 = oVarArr[i13];
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar = oVar3.f16951c;
                    int i16 = oVar3.f16952d;
                    v vVar2 = oVar3.f16950b;
                    long j14 = vVar2.f17002b[i16];
                    int i17 = vVar2.f17003c[i16];
                    if (oVar3.f16949a.f16976g == 1) {
                        j14 += 8;
                        i17 -= 8;
                    }
                    int i18 = i17;
                    long j15 = (j14 - bVar.f16452c) + ((long) this.f16963j);
                    if (j15 >= 0 && j15 < PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                        bVar.a((int) j15);
                        int i19 = oVar3.f16949a.f16980k;
                        if (i19 == 0) {
                            while (true) {
                                int i20 = this.f16963j;
                                i10 = i18;
                                if (i20 >= i10) {
                                    break;
                                }
                                int iA = rVar.a(bVar, i10 - i20, false);
                                this.f16963j += iA;
                                this.f16964k -= iA;
                                i18 = i10;
                            }
                        } else {
                            byte[] bArr = this.f16955b.f17845a;
                            boolean z12 = false;
                            bArr[0] = 0;
                            bArr[1] = 0;
                            bArr[2] = 0;
                            int i21 = 4 - i19;
                            i10 = i18;
                            while (this.f16963j < i10) {
                                int i22 = this.f16964k;
                                if (i22 == 0) {
                                    bVar.b(this.f16955b.f17845a, i21, i19, z12);
                                    this.f16955b.e(z12 ? 1 : 0);
                                    this.f16964k = this.f16955b.m();
                                    this.f16954a.e(z12 ? 1 : 0);
                                    rVar.a(4, this.f16954a);
                                    this.f16963j += 4;
                                    i10 += i21;
                                } else {
                                    int iA2 = rVar.a(bVar, i22, z12);
                                    this.f16963j += iA2;
                                    this.f16964k -= iA2;
                                    z12 = false;
                                }
                            }
                        }
                        v vVar3 = oVar3.f16950b;
                        rVar.a(vVar3.f17005e[i16], vVar3.f17006f[i16], i10, 0, null);
                        oVar3.f16952d++;
                        this.f16963j = 0;
                        this.f16964k = 0;
                        return 0;
                    }
                    oVar.f17021a = j14;
                    return 1;
                }
                long j16 = this.f16960g;
                int i23 = this.f16961h;
                long j17 = j16 - ((long) i23);
                long j18 = bVar.f16452c + j17;
                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.f16962i;
                if (nVar2 != null) {
                    bVar.b(nVar2.f17845a, i23, (int) j17, false);
                    if (this.f16959f == c.f16804b) {
                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar3 = this.f16962i;
                        nVar3.e(8);
                        if (nVar3.b() != f16953p) {
                            nVar3.e(nVar3.f17846b + 4);
                            while (true) {
                                if (nVar3.f17847c - nVar3.f17846b <= 0) {
                                    z11 = false;
                                    break;
                                }
                                if (nVar3.b() == f16953p) {
                                    z11 = true;
                                    break;
                                }
                            }
                        } else {
                            z11 = true;
                            break;
                        }
                        this.f16968o = z11;
                    } else if (!this.f16957d.isEmpty()) {
                        ((a) this.f16957d.peek()).Q0.add(new b(this.f16959f, this.f16962i));
                    }
                } else {
                    if (j17 < PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                        bVar.a((int) j17);
                    } else {
                        oVar.f17021a = j18;
                        z10 = true;
                    }
                    c(j18);
                    if (z10 && this.f16958e != 2) {
                        return 1;
                    }
                }
                z10 = false;
                c(j18);
                if (z10) {
                    continue;
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long a(long j10) {
        int i10;
        long j11 = Long.MAX_VALUE;
        for (o oVar : this.f16966m) {
            v vVar = oVar.f16950b;
            int iA = z.a(vVar.f17005e, j10, false);
            while (true) {
                i10 = -1;
                if (iA < 0) {
                    iA = -1;
                    break;
                }
                if ((vVar.f17006f[iA] & 1) != 0) {
                    break;
                }
                iA--;
            }
            if (iA != -1) {
                i10 = iA;
                break;
            }
            iA = z.a(vVar.f17005e, j10, true, false);
            while (iA < vVar.f17005e.length) {
                if ((vVar.f17006f[iA] & 1) != 0) {
                    i10 = iA;
                    break;
                }
                iA++;
            }
            long j12 = vVar.f17002b[i10];
            if (j12 < j11) {
                j11 = j12;
            }
        }
        return j11;
    }
}
