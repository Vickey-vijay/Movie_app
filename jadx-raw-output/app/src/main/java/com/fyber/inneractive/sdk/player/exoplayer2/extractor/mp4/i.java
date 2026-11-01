package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import android.util.Pair;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f16876a = z.a("vide");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f16877b = z.a("soun");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f16878c = z.a("text");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f16879d = z.a("sbtl");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f16880e = z.a("subt");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f16881f = z.a("clcp");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f16882g = z.a("cenc");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f16883h = z.a("meta");

    public static s a(a aVar, b bVar, long j10, com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVar, boolean z10) throws com.fyber.inneractive.sdk.player.exoplayer2.r {
        int i10;
        long jK;
        int i11;
        s sVar;
        Pair pairCreate;
        b bVarC;
        long j11;
        List list;
        int i12;
        int iRound;
        int iIntValue;
        String str;
        int i13;
        String str2;
        String str3;
        String str4;
        long j12;
        List listSingletonList;
        a aVarB = aVar.b(c.F);
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = aVarB.c(c.T).P0;
        nVar.e(16);
        int iB = nVar.b();
        if (iB == f16877b) {
            i10 = 1;
        } else if (iB == f16876a) {
            i10 = 2;
        } else if (iB == f16878c || iB == f16879d || iB == f16880e || iB == f16881f) {
            i10 = 3;
        } else {
            i10 = iB == f16883h ? 4 : -1;
        }
        if (i10 == -1) {
            return null;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = aVar.c(c.P).P0;
        nVar2.e(8);
        int iB2 = (nVar2.b() >> 24) & 255;
        nVar2.e(nVar2.f17846b + (iB2 == 0 ? 8 : 16));
        int iB3 = nVar2.b();
        nVar2.e(nVar2.f17846b + 4);
        int i14 = nVar2.f17846b;
        int i15 = iB2 == 0 ? 4 : 8;
        int i16 = 0;
        while (true) {
            if (i16 >= i15) {
                nVar2.e(nVar2.f17846b + i15);
            } else {
                if (nVar2.f17845a[i14 + i16] != -1) {
                    jK = iB2 == 0 ? nVar2.k() : nVar2.n();
                    if (jK != 0) {
                        break;
                    }
                    break;
                }
                i16++;
            }
            jK = -9223372036854775807L;
            break;
        }
        nVar2.e(nVar2.f17846b + 16);
        int iB4 = nVar2.b();
        int iB5 = nVar2.b();
        nVar2.e(nVar2.f17846b + 4);
        int iB6 = nVar2.b();
        int iB7 = nVar2.b();
        if (iB4 == 0 && iB5 == 65536 && iB6 == -65536 && iB7 == 0) {
            i11 = 90;
        } else if (iB4 == 0 && iB5 == -65536 && iB6 == 65536 && iB7 == 0) {
            i11 = 270;
        } else {
            i11 = (iB4 == -65536 && iB5 == 0 && iB6 == 0 && iB7 == -65536) ? BaseTransientBottomBar.ANIMATION_FADE_DURATION : 0;
        }
        long j13 = j10 == -9223372036854775807L ? jK : j10;
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar3 = bVar.P0;
        nVar3.e(8);
        int iB8 = nVar3.b();
        int i17 = c.f16804b;
        nVar3.e(nVar3.f17846b + (((iB8 >> 24) & 255) == 0 ? 8 : 16));
        long jK2 = nVar3.k();
        long jA = j13 != -9223372036854775807L ? z.a(j13, 1000000L, jK2) : -9223372036854775807L;
        a aVarB2 = aVarB.b(c.G).b(c.H);
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar4 = aVarB.c(c.S).P0;
        nVar4.e(8);
        int iB9 = (nVar4.b() >> 24) & 255;
        nVar4.e(nVar4.f17846b + (iB9 == 0 ? 8 : 16));
        long jK3 = nVar4.k();
        nVar4.e(nVar4.f17846b + (iB9 == 0 ? 4 : 8));
        int iO = nVar4.o();
        Pair pairCreate2 = Pair.create(Long.valueOf(jK3), "" + ((char) (((iO >> 10) & 31) + 96)) + ((char) (((iO >> 5) & 31) + 96)) + ((char) ((iO & 31) + 96)));
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar5 = aVarB2.c(c.U).P0;
        String str5 = (String) pairCreate2.second;
        nVar5.e(12);
        int iB10 = nVar5.b();
        f fVar = new f(iB10);
        int i18 = 0;
        while (i18 < iB10) {
            int i19 = nVar5.f17846b;
            int iB11 = nVar5.b();
            String str6 = "childAtomSize should be positive";
            com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(iB11 > 0, "childAtomSize should be positive");
            int iB12 = nVar5.b();
            int i20 = iB10;
            if (iB12 == c.f16806c || iB12 == c.f16808d || iB12 == c.f16803a0 || iB12 == c.f16825l0 || iB12 == c.f16810e || iB12 == c.f16812f || iB12 == c.f16814g || iB12 == c.K0 || iB12 == c.L0) {
                pairCreate2 = pairCreate2;
                Object obj = "childAtomSize should be positive";
                i11 = i11;
                j11 = jK2;
                i10 = i10;
                nVar5.e(i19 + 16);
                nVar5.e(nVar5.f17846b + 16);
                int iO2 = nVar5.o();
                int iO3 = nVar5.o();
                nVar5.e(nVar5.f17846b + 50);
                int i21 = nVar5.f17846b;
                if (iB12 == c.f16803a0) {
                    iB11 = iB11;
                    iB12 = a(nVar5, i19, iB11, fVar, i18);
                    nVar5.e(i21);
                } else {
                    iB11 = iB11;
                }
                float fM = 1.0f;
                int i22 = -1;
                boolean z11 = false;
                String str7 = null;
                List listSingletonList2 = null;
                byte[] bArrCopyOfRange = null;
                while (i21 - i19 < iB11) {
                    nVar5.e(i21);
                    int i23 = nVar5.f17846b;
                    int iB13 = nVar5.b();
                    if (iB13 == 0 && nVar5.f17846b - i19 == iB11) {
                        break;
                    }
                    com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(iB13 > 0, obj);
                    int iB14 = nVar5.b();
                    if (iB14 != c.I) {
                        if (iB14 != c.J) {
                            if (iB14 == c.M0) {
                                if (str7 != null) {
                                    throw new IllegalStateException();
                                }
                                str7 = iB12 == c.K0 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                            } else if (iB14 == c.f16816h) {
                                if (str7 != null) {
                                    throw new IllegalStateException();
                                }
                                str7 = "video/3gpp";
                            } else if (iB14 == c.K) {
                                if (str7 != null) {
                                    throw new IllegalStateException();
                                }
                                Pair pairA = a(i23, nVar5);
                                str7 = (String) pairA.first;
                                listSingletonList2 = Collections.singletonList((byte[]) pairA.second);
                            } else if (iB14 == c.f16821j0) {
                                nVar5.e(i23 + 8);
                                fM = nVar5.m() / nVar5.m();
                                z11 = true;
                            } else if (iB14 == c.I0) {
                                int i24 = i23 + 8;
                                while (true) {
                                    if (i24 - i23 >= iB13) {
                                        bArrCopyOfRange = null;
                                        break;
                                    }
                                    nVar5.e(i24);
                                    int iB15 = nVar5.b();
                                    boolean z12 = z11;
                                    if (nVar5.b() == c.J0) {
                                        bArrCopyOfRange = Arrays.copyOfRange(nVar5.f17845a, i24, iB15 + i24);
                                        z11 = z12;
                                    } else {
                                        i24 += iB15;
                                        z11 = z12;
                                    }
                                }
                            } else {
                                boolean z13 = z11;
                                if (iB14 == c.H0) {
                                    int iJ = nVar5.j();
                                    nVar5.e(nVar5.f17846b + 3);
                                    if (iJ == 0) {
                                        int iJ2 = nVar5.j();
                                        if (iJ2 == 0) {
                                            i22 = 0;
                                        } else if (iJ2 == 1) {
                                            z11 = z13;
                                            i22 = 1;
                                        } else if (iJ2 == 2) {
                                            i22 = 2;
                                        } else if (iJ2 == 3) {
                                            i22 = 3;
                                        }
                                    }
                                }
                                z11 = z13;
                            }
                            break;
                        }
                        if (str7 != null) {
                            throw new IllegalStateException();
                        }
                        nVar5.e(i23 + 8);
                        com.fyber.inneractive.sdk.player.exoplayer2.video.d dVarA = com.fyber.inneractive.sdk.player.exoplayer2.video.d.a(nVar5);
                        list = dVarA.f17913a;
                        fVar.f16866c = dVarA.f17914b;
                        str7 = "video/hevc";
                        i21 += iB13;
                        obj = obj;
                    } else {
                        if (str7 != null) {
                            throw new IllegalStateException();
                        }
                        nVar5.e(i23 + 8);
                        com.fyber.inneractive.sdk.player.exoplayer2.video.a aVarA = com.fyber.inneractive.sdk.player.exoplayer2.video.a.a(nVar5);
                        list = aVarA.f17903a;
                        fVar.f16866c = aVarA.f17904b;
                        if (!z11) {
                            fM = aVarA.f17907e;
                        }
                        str7 = "video/avc";
                    }
                    listSingletonList2 = list;
                    break;
                    i21 += iB13;
                    obj = obj;
                }
                if (str7 != null) {
                    fVar.f16865b = com.fyber.inneractive.sdk.player.exoplayer2.o.a(Integer.toString(iB3), str7, -1, iO2, iO3, listSingletonList2, i11, fM, bArrCopyOfRange, i22, null, dVar);
                }
            } else if (iB12 == c.f16820j || iB12 == c.f16805b0 || iB12 == c.f16830o || iB12 == c.f16834q || iB12 == c.f16838s || iB12 == c.f16844v || iB12 == c.f16840t || iB12 == c.f16842u || iB12 == c.f16851y0 || iB12 == c.f16853z0 || iB12 == c.f16826m || iB12 == c.f16828n || iB12 == c.f16822k || iB12 == c.O0) {
                nVar5.e(i19 + 16);
                if (z10) {
                    int iO4 = nVar5.o();
                    nVar5.e(nVar5.f17846b + 6);
                    i12 = iO4;
                } else {
                    nVar5.e(nVar5.f17846b + 8);
                    i12 = 0;
                }
                j11 = jK2;
                if (i12 == 0 || i12 == 1) {
                    int iO5 = nVar5.o();
                    nVar5.e(nVar5.f17846b + 6);
                    byte[] bArr = nVar5.f17845a;
                    int i25 = nVar5.f17846b;
                    iRound = (bArr[i25 + 1] & 255) | ((bArr[i25] & 255) << 8);
                    nVar5.f17846b = i25 + 4;
                    if (i12 == 1) {
                        nVar5.e(i25 + 20);
                    }
                    iIntValue = iO5;
                } else if (i12 == 2) {
                    nVar5.e(nVar5.f17846b + 16);
                    iRound = (int) Math.round(Double.longBitsToDouble(nVar5.g()));
                    iIntValue = nVar5.m();
                    nVar5.e(nVar5.f17846b + 20);
                }
                int i26 = nVar5.f17846b;
                if (iB12 == c.f16805b0) {
                    iB12 = a(nVar5, i19, iB11, fVar, i18);
                    nVar5.e(i26);
                }
                int i27 = iRound;
                if (iB12 == c.f16830o) {
                    str = "audio/ac3";
                } else if (iB12 == c.f16834q) {
                    str = "audio/eac3";
                } else if (iB12 == c.f16838s) {
                    str = "audio/vnd.dts";
                } else if (iB12 == c.f16840t || iB12 == c.f16842u) {
                    str = "audio/vnd.dts.hd";
                } else if (iB12 == c.f16844v) {
                    str = "audio/vnd.dts.hd;profile=lbr";
                } else if (iB12 == c.f16851y0) {
                    str = "audio/3gpp";
                } else if (iB12 == c.f16853z0) {
                    str = "audio/amr-wb";
                } else if (iB12 == c.f16826m || iB12 == c.f16828n) {
                    str = "audio/raw";
                } else if (iB12 == c.f16822k) {
                    str = "audio/mpeg";
                } else {
                    str = iB12 == c.O0 ? "audio/alac" : null;
                }
                pairCreate2 = pairCreate2;
                int iIntValue2 = i27;
                byte[] bArr2 = null;
                while (i26 - i19 < iB11) {
                    nVar5.e(i26);
                    int iB16 = nVar5.b();
                    com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(iB16 > 0, str6);
                    int iB17 = nVar5.b();
                    int i28 = i11;
                    int i29 = c.K;
                    int i30 = iB11;
                    if (iB17 == i29 || (z10 && iB17 == c.f16824l)) {
                        if (iB17 != i29) {
                            i13 = nVar5.f17846b;
                            while (true) {
                                if (i13 - i26 >= iB16) {
                                    str2 = str6;
                                    i13 = -1;
                                    break;
                                }
                                nVar5.e(i13);
                                int iB18 = nVar5.b();
                                com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(iB18 > 0, str6);
                                str2 = str6;
                                if (nVar5.b() == c.K) {
                                    break;
                                }
                                i13 += iB18;
                                str6 = str2;
                            }
                        } else {
                            str2 = str6;
                            i13 = i26;
                        }
                        if (i13 != -1) {
                            Pair pairA2 = a(i13, nVar5);
                            str = (String) pairA2.first;
                            bArr2 = (byte[]) pairA2.second;
                            if ("audio/mp4a-latm".equals(str)) {
                                Pair pairA3 = com.fyber.inneractive.sdk.player.exoplayer2.util.d.a(bArr2);
                                iIntValue2 = ((Integer) pairA3.first).intValue();
                                iIntValue = ((Integer) pairA3.second).intValue();
                            }
                        }
                    } else {
                        if (iB17 == c.f16832p) {
                            nVar5.e(i26 + 8);
                            String string = Integer.toString(iB3);
                            int i31 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.f16292b[(nVar5.j() & 192) >> 6];
                            int iJ3 = nVar5.j();
                            int i32 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.f16294d[(iJ3 & 56) >> 3];
                            if ((iJ3 & 4) != 0) {
                                i32++;
                            }
                            fVar.f16865b = com.fyber.inneractive.sdk.player.exoplayer2.o.a(string, "audio/ac3", -1, -1, i32, i31, null, dVar, str5);
                        } else if (iB17 == c.f16836r) {
                            nVar5.e(i26 + 8);
                            String string2 = Integer.toString(iB3);
                            nVar5.e(nVar5.f17846b + 2);
                            int i33 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.f16292b[(nVar5.j() & 192) >> 6];
                            int iJ4 = nVar5.j();
                            int i34 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.f16294d[(iJ4 & 14) >> 1];
                            if ((iJ4 & 1) != 0) {
                                i34++;
                            }
                            fVar.f16865b = com.fyber.inneractive.sdk.player.exoplayer2.o.a(string2, "audio/eac3", -1, -1, i34, i33, null, dVar, str5);
                        } else if (iB17 == c.f16846w) {
                            fVar.f16865b = com.fyber.inneractive.sdk.player.exoplayer2.o.a(Integer.toString(iB3), str, -1, -1, iIntValue, iIntValue2, null, dVar, str5);
                        } else if (iB17 == c.O0) {
                            byte[] bArr3 = new byte[iB16];
                            nVar5.e(i26);
                            nVar5.a(bArr3, 0, iB16);
                            bArr2 = bArr3;
                            str2 = str6;
                        }
                        str2 = str6;
                    }
                    i26 += iB16;
                    str6 = str2;
                    i11 = i28;
                    iB11 = i30;
                }
                i11 = i11;
                int i35 = iB11;
                if (fVar.f16865b == null && str != null) {
                    fVar.f16865b = com.fyber.inneractive.sdk.player.exoplayer2.o.a(Integer.toString(iB3), str, -1, -1, iIntValue, iIntValue2, "audio/raw".equals(str) ? 2 : -1, -1, -1, bArr2 == null ? null : Collections.singletonList(bArr2), dVar, 0, str5, null);
                }
                iB11 = i35;
            } else {
                int i36 = c.f16823k0;
                if (iB12 == i36 || iB12 == c.f16843u0 || iB12 == c.f16845v0 || iB12 == c.f16847w0 || iB12 == c.f16849x0) {
                    nVar5.e(i19 + 16);
                    if (iB12 == i36) {
                        j12 = Long.MAX_VALUE;
                        listSingletonList = null;
                        str4 = "application/ttml+xml";
                    } else if (iB12 == c.f16843u0) {
                        int i37 = iB11 - 16;
                        byte[] bArr4 = new byte[i37];
                        nVar5.a(bArr4, 0, i37);
                        listSingletonList = Collections.singletonList(bArr4);
                        j12 = Long.MAX_VALUE;
                        str4 = "application/x-quicktime-tx3g";
                    } else {
                        if (iB12 == c.f16845v0) {
                            str3 = "application/x-mp4-vtt";
                        } else if (iB12 == c.f16847w0) {
                            str4 = "application/ttml+xml";
                            j12 = 0;
                            listSingletonList = null;
                        } else {
                            if (iB12 != c.f16849x0) {
                                throw new IllegalStateException();
                            }
                            fVar.f16867d = 1;
                            str3 = "application/x-mp4-cea-608";
                        }
                        j12 = Long.MAX_VALUE;
                        listSingletonList = null;
                        str4 = str3;
                    }
                    fVar.f16865b = com.fyber.inneractive.sdk.player.exoplayer2.o.a(Integer.toString(iB3), str4, 0, str5, -1, dVar, j12, listSingletonList);
                } else if (iB12 == c.N0) {
                    fVar.f16865b = com.fyber.inneractive.sdk.player.exoplayer2.o.a(Integer.toString(iB3), "application/x-camera-motion", dVar);
                }
                j11 = jK2;
            }
            nVar5.e(i19 + iB11);
            i18++;
            iB10 = i20;
            jK2 = j11;
            i10 = i10;
            pairCreate2 = pairCreate2;
            i11 = i11;
        }
        Pair pair = pairCreate2;
        long j14 = jK2;
        int i38 = i10;
        a aVarB3 = aVar.b(c.Q);
        if (aVarB3 == null || (bVarC = aVarB3.c(c.R)) == null) {
            sVar = null;
            pairCreate = Pair.create(null, null);
        } else {
            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar6 = bVarC.P0;
            nVar6.e(8);
            int iB19 = (nVar6.b() >> 24) & 255;
            int iM = nVar6.m();
            long[] jArr = new long[iM];
            long[] jArr2 = new long[iM];
            for (int i39 = 0; i39 < iM; i39++) {
                jArr[i39] = iB19 == 1 ? nVar6.n() : nVar6.k();
                jArr2[i39] = iB19 == 1 ? nVar6.g() : nVar6.b();
                byte[] bArr5 = nVar6.f17845a;
                int i40 = nVar6.f17846b;
                int i41 = (bArr5[i40] & 255) << 8;
                nVar6.f17846b = i40 + 2;
                if (((short) ((bArr5[i40 + 1] & 255) | i41)) != 1) {
                    throw new IllegalArgumentException("Unsupported media rate.");
                }
                nVar6.e(i40 + 4);
            }
            pairCreate = Pair.create(jArr, jArr2);
            sVar = null;
        }
        return fVar.f16865b == null ? sVar : new s(iB3, i38, ((Long) pair.first).longValue(), j14, jA, fVar.f16865b, fVar.f16867d, fVar.f16864a, fVar.f16866c, (long[]) pairCreate.first, (long[]) pairCreate.second);
    }

    public static int a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, int i10, int i11, f fVar, int i12) {
        int i13 = nVar.f17846b;
        while (true) {
            if (i13 - i10 >= i11) {
                return 0;
            }
            nVar.e(i13);
            int iB = nVar.b();
            com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(iB > 0, "childAtomSize should be positive");
            if (nVar.b() == c.W) {
                int i14 = i13 + 8;
                Pair pairCreate = null;
                boolean z10 = false;
                Integer numValueOf = null;
                t tVar = null;
                while (i14 - i13 < iB) {
                    nVar.e(i14);
                    int iB2 = nVar.b();
                    int iB3 = nVar.b();
                    if (iB3 == c.f16807c0) {
                        numValueOf = Integer.valueOf(nVar.b());
                    } else if (iB3 == c.X) {
                        nVar.e(nVar.f17846b + 4);
                        z10 = nVar.b() == f16882g;
                    } else if (iB3 == c.Y) {
                        int i15 = i14 + 8;
                        while (true) {
                            if (i15 - i14 >= iB2) {
                                tVar = null;
                                break;
                            }
                            nVar.e(i15);
                            int iB4 = nVar.b();
                            if (nVar.b() == c.Z) {
                                nVar.e(nVar.f17846b + 6);
                                nVar.j();
                                int iJ = nVar.j();
                                byte[] bArr = new byte[16];
                                nVar.a(bArr, 0, 16);
                                tVar = new t(iJ, bArr);
                                break;
                            }
                            i15 += iB4;
                        }
                    }
                    i14 += iB2;
                }
                if (z10) {
                    com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(numValueOf != null, "frma atom is mandatory");
                    com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(tVar != null, "schi->tenc atom is mandatory");
                    pairCreate = Pair.create(numValueOf, tVar);
                }
                if (pairCreate != null) {
                    fVar.f16864a[i12] = (t) pairCreate.second;
                    return ((Integer) pairCreate.first).intValue();
                }
            }
            i13 += iB;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008a  */
    public static Pair a(int i10, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        nVar.e(i10 + 12);
        nVar.e(nVar.f17846b + 1);
        a(nVar);
        nVar.e(nVar.f17846b + 2);
        int iJ = nVar.j();
        if ((iJ & 128) != 0) {
            nVar.e(nVar.f17846b + 2);
        }
        if ((iJ & 64) != 0) {
            nVar.e(nVar.f17846b + nVar.o());
        }
        if ((iJ & 32) != 0) {
            nVar.e(nVar.f17846b + 2);
        }
        nVar.e(nVar.f17846b + 1);
        a(nVar);
        int iJ2 = nVar.j();
        String str = null;
        if (iJ2 == 32) {
            str = "video/mp4v-es";
        } else if (iJ2 == 33) {
            str = "video/avc";
        } else if (iJ2 == 35) {
            str = "video/hevc";
        } else if (iJ2 == 64) {
            str = "audio/mp4a-latm";
        } else {
            if (iJ2 == 107) {
                return Pair.create("audio/mpeg", null);
            }
            if (iJ2 == 165) {
                str = "audio/ac3";
            } else if (iJ2 != 166) {
                switch (iJ2) {
                    case 102:
                    case 103:
                    case 104:
                        str = "audio/mp4a-latm";
                        break;
                    default:
                        switch (iJ2) {
                            case 169:
                            case 172:
                                return Pair.create("audio/vnd.dts", null);
                            case 170:
                            case 171:
                                return Pair.create("audio/vnd.dts.hd", null);
                        }
                }
            } else {
                str = "audio/eac3";
            }
        }
        nVar.e(nVar.f17846b + 12);
        nVar.e(nVar.f17846b + 1);
        int iA = a(nVar);
        byte[] bArr = new byte[iA];
        nVar.a(bArr, 0, iA);
        return Pair.create(str, bArr);
    }

    public static int a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        int iJ = nVar.j();
        int i10 = iJ & 127;
        while ((iJ & 128) == 128) {
            iJ = nVar.j();
            i10 = (i10 << 7) | (iJ & 127);
        }
        return i10;
    }
}
