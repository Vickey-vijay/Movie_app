package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class zzauh implements zzauy {
    public static final /* synthetic */ zzauh zza;
    public static final /* synthetic */ zzauh zzb;
    public static final /* synthetic */ zzauh zzc;
    public static final /* synthetic */ zzauh zzd;
    public static final /* synthetic */ zzauh zze;
    public static final /* synthetic */ zzauh zzf;
    public static final /* synthetic */ zzauh zzg;
    public static final /* synthetic */ zzauh zzh;
    public static final /* synthetic */ zzauh zzi;
    public static final /* synthetic */ zzauh zzj;
    public static final /* synthetic */ zzauh zzk;
    public static final /* synthetic */ zzauh zzl;
    public static final /* synthetic */ zzauh zzm;
    public static final /* synthetic */ zzauh zzn;
    public static final /* synthetic */ zzauh zzo;
    public static final /* synthetic */ zzauh zzp;
    private final /* synthetic */ int zzq;

    static {
        int[] iArr = {1566288819, 1018167620, 793479703, 284165456, 1648575546, -1602978314, 292218004, 846942590, 524688209};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        iArr[0] = 12895151;
        iArr[1] = 1277237303;
        iArr[2] = 185162640;
        iArr[3] = 1411547303;
        iArr[4] = 306429832;
        iArr[5] = -1705725298;
        iArr[6] = 1113502215;
        iArr[7] = 1498617647;
        iArr[8] = 669908538;
        iArr[0] = 70788355;
        iArr[1] = 1377181904;
        iArr[2] = 713084892;
        iArr[3] = 1410740224;
        iArr[4] = 99160279;
        iArr[5] = -2098040901;
        iArr[6] = 241909610;
        iArr[7] = 1156541312;
        iArr[8] = 318561886;
        iArr[0] = 358984857;
        iArr[1] = 11257432;
        iArr[2] = 369424399;
        iArr[3] = 615188052;
        iArr[4] = 873771151;
        iArr[5] = 1734030319;
        iArr[6] = 488663950;
        iArr[7] = 1985433483;
        iArr[8] = 395279207;
        int i18 = (488663950 + ((((11257432 & (~358984857)) | 369424399) + ((358984857 & 615188052) | 873771151)) - 1734030319)) ^ (1985433483 % 395279207);
        iArr[0] = 1460082195;
        iArr[1] = 849562858;
        iArr[2] = 543970048;
        iArr[3] = 381881578;
        iArr[4] = 1279262981;
        iArr[5] = 1927825639;
        iArr[6] = 55241220;
        iArr[7] = 1122336503;
        iArr[8] = 861109485;
        iArr[0] = 279121308;
        iArr[1] = 136482862;
        iArr[2] = 293951273;
        iArr[3] = 1302561302;
        iArr[4] = 1440046744;
        iArr[5] = 2103257287;
        iArr[6] = 245798898;
        iArr[7] = 1404515797;
        iArr[8] = 695748720;
        iArr[0] = 1889804310;
        iArr[1] = 69748745;
        iArr[2] = 707083896;
        iArr[3] = 604795185;
        iArr[4] = 951435262;
        iArr[5] = 1438069009;
        iArr[6] = 153968086;
        iArr[7] = 1663080928;
        iArr[8] = 610506582;
        iArr[0] = 1402492972;
        iArr[1] = 1009329808;
        iArr[2] = 1643537068;
        iArr[3] = 503911450;
        iArr[4] = 580170602;
        iArr[5] = -1906091398;
        iArr[6] = 230124900;
        iArr[7] = 1489001354;
        iArr[8] = 953691761;
        int i19 = (230124900 + (((((~1402492972) & 1009329808) | 1643537068) + ((1402492972 & 503911450) | 580170602)) - (-1906091398))) ^ (1489001354 % 953691761);
        iArr[0] = 1953161956;
        iArr[1] = 2021553924;
        iArr[2] = 1308628610;
        iArr[3] = 813590916;
        iArr[4] = 134225131;
        iArr[5] = -1689272644;
        iArr[6] = 530788967;
        iArr[7] = 1172063133;
        iArr[8] = 990526343;
        iArr[0] = 1666231349;
        iArr[1] = 289538432;
        iArr[2] = 621649449;
        iArr[3] = 406985104;
        iArr[4] = 264059443;
        iArr[5] = 1150383422;
        iArr[6] = 56528119;
        iArr[7] = 1698487330;
        iArr[8] = 272312086;
        iArr[0] = 1389079342;
        iArr[1] = 405954790;
        iArr[2] = 5768193;
        iArr[3] = 967468022;
        iArr[4] = 1640566552;
        iArr[5] = 1700701810;
        iArr[6] = 82691308;
        iArr[7] = 1588695568;
        iArr[8] = 1155465115;
        iArr[0] = 1540846267;
        iArr[1] = 571107379;
        iArr[2] = 1484708373;
        iArr[3] = 709108258;
        iArr[4] = 1568035525;
        iArr[5] = -642115705;
        iArr[6] = 192048860;
        iArr[7] = 2037335344;
        iArr[8] = 1874960596;
        int i20 = (82691308 + ((((405954790 & (~1389079342)) | 5768193) + ((1389079342 & 967468022) | 1640566552)) - 1700701810)) ^ (1588695568 % 1155465115);
        int i21 = (56528119 + ((((289538432 & (~1666231349)) | 621649449) + ((1666231349 & 406985104) | 264059443)) - 1150383422)) ^ (1698487330 % 272312086);
        int i22 = (530788967 + ((((2021553924 & (~1953161956)) | 1308628610) + ((1953161956 & 813590916) | 134225131)) - (-1689272644))) ^ (1172063133 % 990526343);
        int i23 = (153968086 + (((((~1889804310) & 69748745) | 707083896) + ((1889804310 & 604795185) | 951435262)) - 1438069009)) ^ (1663080928 % 610506582);
        int i24 = (245798898 + (((((~279121308) & 136482862) | 293951273) + ((279121308 & 1302561302) | 1440046744)) - 2103257287)) ^ (1404515797 % 695748720);
        int i25 = (55241220 + ((((849562858 & (~1460082195)) | 543970048) + ((1460082195 & 381881578) | 1279262981)) - 1927825639)) ^ (1122336503 % 861109485);
        int i26 = (241909610 + ((((1377181904 & (~70788355)) | 713084892) + ((70788355 & 1410740224) | 99160279)) - (-2098040901))) ^ (1156541312 % 318561886);
        int i27 = (1113502215 + ((((1277237303 & (~12895151)) | 185162640) + ((12895151 & 1411547303) | 306429832)) - (-1705725298))) ^ (1498617647 % 669908538);
        int i28 = (i16 + ((((i11 & (~i10)) | i12) + ((i10 & i13) | i14)) - i15)) ^ (i17 % 524688209);
        int i29 = (192048860 + ((((571107379 & (~1540846267)) | 1484708373) + ((1540846267 & 709108258) | 1568035525)) - (-642115705))) ^ (2037335344 % 1874960596);
        iArr[0] = 464837581;
        iArr[1] = 1181588952;
        iArr[2] = 603091067;
        iArr[3] = 1544523140;
        iArr[4] = 967967255;
        iArr[5] = -2021501120;
        iArr[6] = 102524643;
        iArr[7] = 1295815494;
        iArr[8] = 753959819;
        iArr[0] = 1245644428;
        iArr[1] = 268473430;
        iArr[2] = 2019232319;
        iArr[3] = 2266696;
        iArr[4] = 1693582250;
        iArr[5] = -820691478;
        iArr[6] = 6902638;
        iArr[7] = 1308581515;
        iArr[8] = 354367395;
        zzp = new zzauh((6902638 + (((((~1245644428) & 268473430) | 2019232319) + ((1245644428 & 2266696) | 1693582250)) - (-820691478))) ^ (1308581515 % 354367395));
        zzo = new zzauh((102524643 + (((((~464837581) & 1181588952) | 603091067) + ((464837581 & 1544523140) | 967967255)) - (-2021501120))) ^ (1295815494 % 753959819));
        zzn = new zzauh(i29);
        zzm = new zzauh(i20);
        zzl = new zzauh(i21);
        zzk = new zzauh(i22);
        zzj = new zzauh(i19);
        zzi = new zzauh(i23);
        zzh = new zzauh(i24);
        zzg = new zzauh(i25);
        zzf = new zzauh(i18);
        zze = new zzauh(i26);
        zzd = new zzauh(i27);
        zzc = new zzauh(i28);
        zzb = new zzauh(1);
        zza = new zzauh(0);
    }

    private /* synthetic */ zzauh(int i10) {
        this.zzq = i10;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        zzatq zzatqVar;
        zzaux zzauxVar;
        zzavg zzavgVarZzd;
        zzaux zzauxVar2;
        zzavg zzavgVarZzb;
        zzaux zzauxVar3;
        zzavg zzavgVarZzd2;
        zzavg zzavgVarZzc;
        int[] iArr = {603123090, 1079339320, 204100681, 1131784560, 52466888, 1421285553, 105108813, 1216803069, 33252481};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int i18 = i16 + ((((i11 & (~i10)) | i12) + ((i10 & i13) | i14)) - i15);
        int i19 = i17 % 33252481;
        try {
            try {
                try {
                    try {
                        try {
                            switch (this.zzq) {
                                case 0:
                                    return ((zzavb) obj).zza();
                                case 1:
                                    try {
                                        zzaux zzauxVar4 = ((zzavb) obj).zzb;
                                        long jZzm = zzauxVar4.zzc().zzm();
                                        zzavg zzavgVarZzc2 = zzauxVar4.zzc();
                                        List listZzo = zzavgVarZzc2.zzo();
                                        if (jZzm < 0) {
                                            jZzm += (long) listZzo.size();
                                        }
                                        if (jZzm < 0 || jZzm >= listZzo.size()) {
                                            throw new zzave();
                                        }
                                        listZzo.remove((int) jZzm);
                                        zzauxVar4.zzb(zzavgVarZzc2);
                                        return Optional.empty();
                                    } catch (zzave unused) {
                                        zzatqVar = zzatq.zzI;
                                        return Optional.of(zzatqVar);
                                    }
                                case 2:
                                    zzavb zzavbVar = (zzavb) obj;
                                    zzaux zzauxVar5 = zzavbVar.zzb;
                                    zzavg zzavgVarZzc3 = zzauxVar5.zzc();
                                    zzauk zzaukVarZzn = zzauxVar5.zzc().zzn();
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    zzavgVarZzc3.zzk(byteArrayOutputStream);
                                    zzauk zzaukVarZzd = zzaukVarZzn.zzd(zzauk.zze(byteArrayOutputStream.toByteArray()));
                                    zzauxVar = zzavbVar.zzb;
                                    zzavgVarZzd = zzavg.zzd(zzaukVarZzd);
                                    zzauxVar.zzb(zzavgVarZzd);
                                    return Optional.empty();
                                case 3:
                                    zzavb zzavbVar2 = (zzavb) obj;
                                    zzaux zzauxVar6 = zzavbVar2.zzb;
                                    zzavg zzavgVarZzc4 = zzauxVar6.zzc();
                                    zzauk zzaukVarZzn2 = zzauxVar6.zzc().zzn();
                                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                    zzaug.zzb(zzavgVarZzc4.zzm(), new zzavf(byteArrayOutputStream2, i18 ^ i19), false);
                                    zzauk zzaukVarZzd2 = zzaukVarZzn2.zzd(zzauk.zze(byteArrayOutputStream2.toByteArray()));
                                    zzauxVar = zzavbVar2.zzb;
                                    zzavgVarZzd = zzavg.zzd(zzaukVarZzd2);
                                    zzauxVar.zzb(zzavgVarZzd);
                                    return Optional.empty();
                                case 4:
                                    zzavb zzavbVar3 = (zzavb) obj;
                                    zzavbVar3.zzb.zze(-(zzavbVar3.zzc.zzb().zzb + zzavbVar3.zzd.zze()), zzavbVar3.zzb.zzc());
                                    return Optional.empty();
                                case 5:
                                    zzauxVar2 = ((zzavb) obj).zzb;
                                    zzavgVarZzb = zzavg.zzb(zzauxVar2.zzc().zzm() << ((int) zzauxVar2.zzc().zzm()));
                                    zzauxVar2.zzb(zzavgVarZzb);
                                    return Optional.empty();
                                case 6:
                                    zzauxVar2 = ((zzavb) obj).zzb;
                                    zzavgVarZzb = zzavg.zzb(zzauxVar2.zzc().zzm() >>> ((int) zzauxVar2.zzc().zzm()));
                                    zzauxVar2.zzb(zzavgVarZzb);
                                    return Optional.empty();
                                case 7:
                                    zzauxVar2 = ((zzavb) obj).zzb;
                                    zzavgVarZzb = zzavg.zzc(zzauxVar2.zzc().zzq() - zzauxVar2.zzc().zzq());
                                    zzauxVar2.zzb(zzavgVarZzb);
                                    return Optional.empty();
                                case 8:
                                    zzauxVar2 = ((zzavb) obj).zzb;
                                    zzavgVarZzb = zzavg.zzb(zzauxVar2.zzc().zzm() - zzauxVar2.zzc().zzm());
                                    zzauxVar2.zzb(zzavgVarZzb);
                                    return Optional.empty();
                                case 9:
                                    zzavb zzavbVar4 = (zzavb) obj;
                                    zzaux zzauxVar7 = zzavbVar4.zzb;
                                    long jZzm2 = zzauxVar7.zzc().zzm();
                                    zzavg zzavgVarZzc5 = zzauxVar7.zzc();
                                    zzauxVar3 = zzavbVar4.zzb;
                                    zzavgVarZzd2 = zzauxVar3.zzd(jZzm2);
                                    zzauxVar3.zze(jZzm2, zzavgVarZzc5);
                                    zzauxVar3.zzb(zzavgVarZzd2);
                                    return Optional.empty();
                                case 10:
                                    zzavb zzavbVar5 = (zzavb) obj;
                                    zzaux zzauxVar8 = zzavbVar5.zzb;
                                    long jZzm3 = zzavbVar5.zzc.zzb().zzb + zzauxVar8.zzc().zzm();
                                    zzavg zzavgVarZzc6 = zzauxVar8.zzc();
                                    zzauxVar3 = zzavbVar5.zzb;
                                    long j10 = -jZzm3;
                                    zzavgVarZzd2 = zzauxVar3.zzd(j10);
                                    zzauxVar3.zze(j10, zzavgVarZzc6);
                                    zzauxVar3.zzb(zzavgVarZzd2);
                                    return Optional.empty();
                                case 11:
                                    zzavb zzavbVar6 = (zzavb) obj;
                                    long jZze = zzavbVar6.zzc.zzb().zzb + zzavbVar6.zzd.zze();
                                    zzavg zzavgVarZzc7 = zzavbVar6.zzb.zzc();
                                    zzauxVar3 = zzavbVar6.zzb;
                                    long j11 = -jZze;
                                    zzavgVarZzd2 = zzauxVar3.zzd(j11);
                                    zzauxVar3.zze(j11, zzavgVarZzc7);
                                    zzauxVar3.zzb(zzavgVarZzd2);
                                    return Optional.empty();
                                case 12:
                                    zzavb zzavbVar7 = (zzavb) obj;
                                    long jZzm4 = zzavbVar7.zzb.zzc().zzm();
                                    try {
                                        zzaux zzauxVar9 = zzavbVar7.zzb;
                                        iArr[0] = 1349029729;
                                        iArr[1] = 1683806466;
                                        iArr[2] = 298308136;
                                        iArr[3] = -199751405;
                                        iArr[4] = -1830723495;
                                        iArr[5] = 459474285;
                                        iArr[6] = 21152635;
                                        iArr[7] = 1478326644;
                                        iArr[8] = 593443203;
                                        int i20 = 21152635 + (((((~1349029729) & 1683806466) | 298308136) + ((1349029729 & (-199751405)) | (-1830723495))) - 459474285);
                                        int i21 = 1478326644 % 593443203;
                                        if (jZzm4 == 0) {
                                            zzavgVarZzc = zzauxVar9.zzc();
                                        } else {
                                            int iZza = zzauxVar9.zza(jZzm4);
                                            zzauxVar9.zzb += i20 ^ i21;
                                            zzavgVarZzc = (zzavg) zzauxVar9.zza.remove(iZza);
                                        }
                                        zzauxVar9.zzb(zzavgVarZzc);
                                        return Optional.empty();
                                    } catch (zzauv unused2) {
                                        zzatqVar = zzatq.zzg;
                                        return Optional.of(zzatqVar);
                                    }
                                case 13:
                                    zzavb zzavbVar8 = (zzavb) obj;
                                    try {
                                        zzaux zzauxVar10 = zzavbVar8.zzb;
                                        long jZzm5 = zzauxVar10.zzc().zzm();
                                        long jZzm6 = zzauxVar10.zzc().zzm();
                                        zzauu zzauuVar = zzavbVar8.zzc;
                                        zzaup zzaupVar = zzavbVar8.zzd;
                                        zzauuVar.zza(zzaupVar.zzb(), jZzm6, zzauuVar.zzb().zzb);
                                        zzaupVar.zza(jZzm5);
                                        return Optional.empty();
                                    } catch (zzaun | zzauo unused3) {
                                        zzatqVar = zzatq.zzr;
                                        return Optional.of(zzatqVar);
                                    } catch (zzaus unused4) {
                                        zzatqVar = zzatq.zzB;
                                        return Optional.of(zzatqVar);
                                    } catch (zzaut unused5) {
                                        zzatqVar = zzatq.zzw;
                                        return Optional.of(zzatqVar);
                                    }
                                case 14:
                                    zzavb zzavbVar9 = (zzavb) obj;
                                    try {
                                        zzavbVar9.zzb.zzb(zzavg.zzg(zzavbVar9.zzb.zzc().zzl()));
                                        return Optional.empty();
                                    } catch (zzavd unused6) {
                                        zzatqVar = zzatq.zzp;
                                        return Optional.of(zzatqVar);
                                    }
                                default:
                                    try {
                                        zzaux zzauxVar11 = ((zzavb) obj).zzb;
                                        Iterator it = zzauxVar11.zzc().zzo().iterator();
                                        while (it.hasNext()) {
                                            zzauxVar11.zzb((zzavg) it.next());
                                        }
                                        return Optional.empty();
                                    } catch (zzauw unused7) {
                                        zzatqVar = zzatq.zza;
                                        return Optional.of(zzatqVar);
                                    }
                            }
                        } catch (zzauv unused8) {
                            zzatqVar = zzatq.zzh;
                        }
                    } catch (zzaum | zzauo | zzavd unused9) {
                        zzatqVar = zzatq.zzy;
                    }
                } catch (zzaut | zzauv unused10) {
                    zzatqVar = zzatq.zzx;
                }
            } catch (zzauw e10) {
                e = e10;
                throw new AssertionError(zzaui.zza("CEiv6BFfPnitUE+D"), e);
            }
        } catch (zzavd unused11) {
            zzatqVar = zzatq.zzk;
        } catch (IOException e11) {
            e = e11;
            throw new AssertionError(zzaui.zza("CEiv6BFfPnitUE+D"), e);
        }
    }
}
