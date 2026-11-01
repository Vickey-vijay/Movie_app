package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class zzaue implements zzauy {
    public static final /* synthetic */ zzaue zza;
    public static final /* synthetic */ zzaue zzb;
    public static final /* synthetic */ zzaue zzc;
    public static final /* synthetic */ zzaue zzd;
    public static final /* synthetic */ zzaue zze;
    public static final /* synthetic */ zzaue zzf;
    public static final /* synthetic */ zzaue zzg;
    public static final /* synthetic */ zzaue zzh;
    public static final /* synthetic */ zzaue zzi;
    public static final /* synthetic */ zzaue zzj;
    public static final /* synthetic */ zzaue zzk;
    public static final /* synthetic */ zzaue zzl;
    public static final /* synthetic */ zzaue zzm;
    public static final /* synthetic */ zzaue zzn;
    public static final /* synthetic */ zzaue zzo;
    public static final /* synthetic */ zzaue zzp;
    public static final /* synthetic */ zzaue zzq;
    public static final /* synthetic */ zzaue zzr;
    public static final /* synthetic */ zzaue zzs;
    public static final /* synthetic */ zzaue zzt;
    public static final /* synthetic */ zzaue zzu;
    private final /* synthetic */ int zzv;

    static {
        int[] iArr = {1281944976, 1463473736, 847256033, 1698424328, 948255187, -1554299394, 419914800, 1727952741, 1091714937};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        iArr[0] = 2068224547;
        iArr[1] = 575179716;
        iArr[2] = 1587938398;
        iArr[3] = 1013484418;
        iArr[4] = 1605526586;
        iArr[5] = -933550855;
        iArr[6] = 218948411;
        iArr[7] = 1603386966;
        iArr[8] = 1010764797;
        iArr[0] = 682736626;
        iArr[1] = 1985796848;
        iArr[2] = 208315317;
        iArr[3] = 1922324801;
        iArr[4] = 8464129;
        iArr[5] = -706852288;
        iArr[6] = 1498387409;
        iArr[7] = 649022765;
        iArr[8] = 608034986;
        iArr[0] = 574682290;
        iArr[1] = 203332142;
        iArr[2] = 828655825;
        iArr[3] = 488280686;
        iArr[4] = 1367367889;
        iArr[5] = 2113643018;
        iArr[6] = 73912900;
        iArr[7] = 1891066487;
        iArr[8] = 382926234;
        int i18 = (73912900 + ((((203332142 & (~574682290)) | 828655825) + ((574682290 & 488280686) | 1367367889)) - 2113643018)) ^ (1891066487 % 382926234);
        iArr[0] = 309667127;
        iArr[1] = 3230344;
        iArr[2] = 101519449;
        iArr[3] = 607439488;
        iArr[4] = 793023522;
        iArr[5] = 1313557171;
        iArr[6] = 466647227;
        iArr[7] = 1953534826;
        iArr[8] = 1902736997;
        iArr[0] = 1855103807;
        iArr[1] = 659964675;
        iArr[2] = 1290440236;
        iArr[3] = 588562691;
        iArr[4] = 482511980;
        iArr[5] = 2030511293;
        iArr[6] = 43196093;
        iArr[7] = 988506952;
        iArr[8] = 614340012;
        iArr[0] = 167368542;
        iArr[1] = 67146177;
        iArr[2] = 1656237739;
        iArr[3] = 1145098568;
        iArr[4] = 1113671327;
        iArr[5] = -1143176479;
        iArr[6] = 589913120;
        iArr[7] = 1999038585;
        iArr[8] = 574620392;
        iArr[0] = 138700754;
        iArr[1] = 1311190796;
        iArr[2] = 1098494210;
        iArr[3] = 235277837;
        iArr[4] = 2126145;
        iArr[5] = 2082044636;
        iArr[6] = 778544518;
        iArr[7] = 631340353;
        iArr[8] = 54449299;
        int i19 = (778544518 + (((((~138700754) & 1311190796) | 1098494210) + ((138700754 & 235277837) | 2126145)) - 2082044636)) ^ (631340353 % 54449299);
        iArr[0] = 1725362297;
        iArr[1] = 1360741300;
        iArr[2] = 1109702041;
        iArr[3] = 354116135;
        iArr[4] = 1147188355;
        iArr[5] = -1599707889;
        iArr[6] = 234686974;
        iArr[7] = 1760481135;
        iArr[8] = 279527351;
        iArr[0] = 1362243428;
        iArr[1] = 18451060;
        iArr[2] = 1179867339;
        iArr[3] = 558662325;
        iArr[4] = 550966467;
        iArr[5] = 2036932222;
        iArr[6] = 413059767;
        iArr[7] = 1106211926;
        iArr[8] = 327305250;
        iArr[0] = 363159161;
        iArr[1] = 562794784;
        iArr[2] = 672605403;
        iArr[3] = 25727904;
        iArr[4] = 2081572569;
        iArr[5] = -1499032769;
        iArr[6] = 117043947;
        iArr[7] = 912078408;
        iArr[8] = 135177290;
        iArr[0] = 429857344;
        iArr[1] = 761470753;
        iArr[2] = 244716435;
        iArr[3] = 862030880;
        iArr[4] = 1585885407;
        iArr[5] = -1219426468;
        iArr[6] = 693550658;
        iArr[7] = 1209597698;
        iArr[8] = 1200977805;
        int i20 = (693550658 + ((((761470753 & (~429857344)) | 244716435) + ((429857344 & 862030880) | 1585885407)) - (-1219426468))) ^ (1209597698 % 1200977805);
        iArr[0] = 1451163042;
        iArr[1] = 1144033732;
        iArr[2] = 979119168;
        iArr[3] = 1142985108;
        iArr[4] = 17523737;
        iArr[5] = 2082272570;
        iArr[6] = 447053428;
        iArr[7] = 1178835412;
        iArr[8] = 674426555;
        iArr[0] = 899633766;
        iArr[1] = 123837830;
        iArr[2] = 368257288;
        iArr[3] = 167810182;
        iArr[4] = 1023429240;
        iArr[5] = 1441797528;
        iArr[6] = 106553086;
        iArr[7] = 2104001379;
        iArr[8] = 2013966848;
        iArr[0] = 353056618;
        iArr[1] = 587352576;
        iArr[2] = 1209239528;
        iArr[3] = 1728108930;
        iArr[4] = 1420269559;
        iArr[5] = -1483278464;
        iArr[6] = 364027473;
        iArr[7] = 1896236448;
        iArr[8] = 1127167744;
        iArr[0] = 2129768394;
        iArr[1] = 1627076842;
        iArr[2] = 1930240353;
        iArr[3] = 384997514;
        iArr[4] = 369722160;
        iArr[5] = -969283552;
        iArr[6] = 1026488339;
        iArr[7] = 1450967523;
        iArr[8] = 42186306;
        int i21 = (364027473 + ((((587352576 & (~353056618)) | 1209239528) + ((353056618 & 1728108930) | 1420269559)) - (-1483278464))) ^ (1896236448 % 1127167744);
        int i22 = (106553086 + ((((123837830 & (~899633766)) | 368257288) + ((899633766 & 167810182) | 1023429240)) - 1441797528)) ^ (2104001379 % 2013966848);
        int i23 = (447053428 + ((((1144033732 & (~1451163042)) | 979119168) + ((1451163042 & 1142985108) | 17523737)) - 2082272570)) ^ (1178835412 % 674426555);
        int i24 = (1026488339 + ((((1627076842 & (~2129768394)) | 1930240353) + ((2129768394 & 384997514) | 369722160)) - (-969283552))) ^ (1450967523 % 42186306);
        iArr[0] = 217704412;
        iArr[1] = 144255288;
        iArr[2] = 1174857666;
        iArr[3] = 1788447288;
        iArr[4] = 1667270208;
        iArr[5] = -513330018;
        iArr[6] = 928494151;
        iArr[7] = 1234644696;
        iArr[8] = 220282619;
        iArr[0] = 2105342203;
        iArr[1] = 63587109;
        iArr[2] = 1700430907;
        iArr[3] = 42025732;
        iArr[4] = 358031402;
        iArr[5] = 2065089764;
        iArr[6] = 11749780;
        iArr[7] = 1059789835;
        iArr[8] = 1012707329;
        iArr[0] = 880944650;
        iArr[1] = 1717883648;
        iArr[2] = 10231720;
        iArr[3] = 1718140932;
        iArr[4] = 277359766;
        iArr[5] = -1675436631;
        iArr[6] = 1148576388;
        iArr[7] = 2122533302;
        iArr[8] = 1588279465;
        zzu = new zzaue((1148576388 + (((((~880944650) & 1717883648) | 10231720) + ((880944650 & 1718140932) | 277359766)) - (-1675436631))) ^ (2122533302 % 1588279465));
        zzt = new zzaue((11749780 + (((((~2105342203) & 63587109) | 1700430907) + ((2105342203 & 42025732) | 358031402)) - 2065089764)) ^ (1059789835 % 1012707329));
        zzs = new zzaue((928494151 + (((((~217704412) & 144255288) | 1174857666) + ((217704412 & 1788447288) | 1667270208)) - (-513330018))) ^ (1234644696 % 220282619));
        zzr = new zzaue(i24);
        zzq = new zzaue(i21);
        zzp = new zzaue(i22);
        zzaue zzaueVar = new zzaue(i23);
        int i25 = (117043947 + ((((562794784 & (~363159161)) | 672605403) + ((363159161 & 25727904) | 2081572569)) - (-1499032769))) ^ (912078408 % 135177290);
        int i26 = (413059767 + ((((18451060 & (~1362243428)) | 1179867339) + ((1362243428 & 558662325) | 550966467)) - 2036932222)) ^ (1106211926 % 327305250);
        int i27 = (234686974 + ((((1360741300 & (~1725362297)) | 1109702041) + ((1725362297 & 354116135) | 1147188355)) - (-1599707889))) ^ (1760481135 % 279527351);
        int i28 = (589913120 + (((((~167368542) & 67146177) | 1656237739) + ((167368542 & 1145098568) | 1113671327)) - (-1143176479))) ^ (1999038585 % 574620392);
        int i29 = (43196093 + (((((~1855103807) & 659964675) | 1290440236) + ((1855103807 & 588562691) | 482511980)) - 2030511293)) ^ (988506952 % 614340012);
        int i30 = (466647227 + ((((3230344 & (~309667127)) | 101519449) + ((309667127 & 607439488) | 793023522)) - 1313557171)) ^ (1953534826 % 1902736997);
        int i31 = (1498387409 + ((((1985796848 & (~682736626)) | 208315317) + ((682736626 & 1922324801) | 8464129)) - (-706852288))) ^ (649022765 % 608034986);
        int i32 = (218948411 + ((((575179716 & (~2068224547)) | 1587938398) + ((2068224547 & 1013484418) | 1605526586)) - (-933550855))) ^ (1603386966 % 1010764797);
        int i33 = (i16 + ((((i11 & (~i10)) | i12) + ((i10 & i13) | i14)) - i15)) ^ (i17 % 1091714937);
        zzo = zzaueVar;
        zzn = new zzaue(i20);
        zzm = new zzaue(i25);
        zzl = new zzaue(i26);
        zzk = new zzaue(i27);
        zzj = new zzaue(i19);
        zzi = new zzaue(i28);
        zzh = new zzaue(i29);
        zzg = new zzaue(i30);
        zzf = new zzaue(i18);
        zze = new zzaue(i31);
        zzd = new zzaue(i32);
        zzc = new zzaue(i33);
        zzb = new zzaue(1);
        zza = new zzaue(0);
    }

    private /* synthetic */ zzaue(int i10) {
        this.zzv = i10;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        zzatq zzatqVar;
        long jZzm;
        zzaup zzaupVar;
        zzaux zzauxVar;
        zzavg zzavgVarZzb;
        zzaux zzauxVar2;
        zzavg zzavgVarZzc;
        zzatq zzatqVar2;
        long j10 = 1;
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        switch (this.zzv) {
                                            case 0:
                                                zzavb zzavbVar = (zzavb) obj;
                                                zzaux zzauxVar3 = zzavbVar.zzb;
                                                jZzm = zzauxVar3.zzc().zzm();
                                                if (zzauxVar3.zzc().zzm() != 0) {
                                                    zzaupVar = zzavbVar.zzd;
                                                    zzaupVar.zza(jZzm);
                                                    break;
                                                }
                                                return Optional.empty();
                                            case 1:
                                                try {
                                                    zzaux zzauxVar4 = ((zzavb) obj).zzb;
                                                    long jZzm2 = zzauxVar4.zzc().zzm();
                                                    zzavg zzavgVarZzc2 = zzauxVar4.zzc();
                                                    zzavg zzavgVarZzc3 = zzauxVar4.zzc();
                                                    List listZzo = zzavgVarZzc3.zzo();
                                                    if (jZzm2 < 0) {
                                                        jZzm2 += (long) (listZzo.size() + 1);
                                                    }
                                                    if (jZzm2 < 0 || jZzm2 >= listZzo.size() + 1) {
                                                        throw new zzave();
                                                    }
                                                    listZzo.add((int) jZzm2, zzavgVarZzc2);
                                                    zzauxVar4.zzb(zzavgVarZzc3);
                                                    return Optional.empty();
                                                } catch (zzave unused) {
                                                    zzatqVar = zzatq.zzI;
                                                    return Optional.of(zzatqVar);
                                                }
                                            case 2:
                                                zzavb zzavbVar2 = (zzavb) obj;
                                                zzaux zzauxVar5 = zzavbVar2.zzb;
                                                jZzm = zzauxVar5.zzc().zzm();
                                                if (zzauxVar5.zzc().zzm() == 0) {
                                                    zzaupVar = zzavbVar2.zzd;
                                                    zzaupVar.zza(jZzm);
                                                    break;
                                                }
                                                return Optional.empty();
                                            case 3:
                                                zzauxVar = ((zzavb) obj).zzb;
                                                zzavgVarZzb = zzavg.zzb(zzauxVar.zzc().zzo().size());
                                                zzauxVar.zzb(zzavgVarZzb);
                                                return Optional.empty();
                                            case 4:
                                                zzauxVar = ((zzavb) obj).zzb;
                                                zzavgVarZzb = zzavg.zzb(zzauxVar.zzc().zzn().zza.length);
                                                zzauxVar.zzb(zzavgVarZzb);
                                                return Optional.empty();
                                            case 5:
                                                zzauxVar2 = ((zzavb) obj).zzb;
                                                zzavgVarZzc = zzavg.zzc(Math.log(zzauxVar2.zzc().zzq()));
                                                zzauxVar2.zzb(zzavgVarZzc);
                                                return Optional.empty();
                                            case 6:
                                                zzauxVar2 = ((zzavb) obj).zzb;
                                                long jZzm3 = zzauxVar2.zzc().zzm();
                                                long jZzm4 = zzauxVar2.zzc().zzm();
                                                if (jZzm3 == 0 || jZzm4 == 0) {
                                                    j10 = 0;
                                                }
                                                zzavgVarZzc = zzavg.zzb(j10);
                                                zzauxVar2.zzb(zzavgVarZzc);
                                                return Optional.empty();
                                            case 7:
                                                zzauxVar2 = ((zzavb) obj).zzb;
                                                if (zzauxVar2.zzc().zzm() != 0) {
                                                    j10 = 0;
                                                }
                                                zzavgVarZzc = zzavg.zzb(j10);
                                                zzauxVar2.zzb(zzavgVarZzc);
                                                return Optional.empty();
                                            case 8:
                                                zzauxVar2 = ((zzavb) obj).zzb;
                                                long jZzm5 = zzauxVar2.zzc().zzm();
                                                long jZzm6 = zzauxVar2.zzc().zzm();
                                                if (jZzm5 == 0 && jZzm6 == 0) {
                                                    j10 = 0;
                                                }
                                                zzavgVarZzc = zzavg.zzb(j10);
                                                zzauxVar2.zzb(zzavgVarZzc);
                                                return Optional.empty();
                                            case 9:
                                                zzavb zzavbVar3 = (zzavb) obj;
                                                zzaux zzauxVar6 = zzavbVar3.zzb;
                                                try {
                                                    int iCompare = new zzavc(false).compare(zzauxVar6.zzc(), zzauxVar6.zzc());
                                                    zzaux zzauxVar7 = zzavbVar3.zzb;
                                                    if (iCompare >= 0) {
                                                        j10 = 0;
                                                    }
                                                    zzauxVar7.zzb(zzavg.zzb(j10));
                                                    return Optional.empty();
                                                } catch (IllegalArgumentException unused2) {
                                                    return Optional.of(zzatq.zzd);
                                                }
                                            case 10:
                                                int i10 = 246144337 + ((((348137722 & (~1944216249)) | 926438168) + ((1944216249 & 13122018) | 1882968836)) - (-1273372307));
                                                int i11 = 1723705710 % 1677157265;
                                                zzavb zzavbVar4 = (zzavb) obj;
                                                try {
                                                    zzaux zzauxVar8 = zzavbVar4.zzb;
                                                    long jZzm7 = zzauxVar8.zzc().zzm();
                                                    zzatw zzatwVar = zzavbVar4.zza;
                                                    zzaux zzauxVar9 = new zzaux(i10 ^ i11);
                                                    for (int i12 = 0; i12 < zzauxVar8.zzb; i12++) {
                                                        try {
                                                            zzauxVar9.zzb(zzavg.zzj((zzavg) zzauxVar8.zza.get(i12)));
                                                        } catch (zzauw e10) {
                                                            throw new AssertionError(zzaui.zza("CEiv6BFfPnitUE+D"), e10);
                                                        }
                                                    }
                                                    zzaup zzaupVar2 = zzavbVar4.zzd;
                                                    new zzavb(zzatwVar, zzauxVar9, new zzaup(zzaupVar2.zzb, zzaupVar2.zza, zzaupVar2.zzc.zzc(), zzaupVar2.zzd)).zzd.zza(jZzm7);
                                                    zzauxVar8.zzb(zzavg.zza(new zzaug()));
                                                    return Optional.empty();
                                                } catch (zzaun | zzauo unused3) {
                                                    zzatqVar = zzatq.zzt;
                                                    return Optional.of(zzatqVar);
                                                }
                                            case 11:
                                                try {
                                                    zzaux zzauxVar10 = ((zzavb) obj).zzb;
                                                    zzauxVar10.zzb(zzavg.zza(zzauxVar10.zzc().zzi((Class) zzauxVar10.zzc().zzl())));
                                                    return Optional.empty();
                                                } catch (zzavd unused4) {
                                                    zzatqVar = zzatq.zzp;
                                                    return Optional.of(zzatqVar);
                                                }
                                            case 12:
                                                zzauxVar2 = ((zzavb) obj).zzb;
                                                long jZzm8 = zzauxVar2.zzc().zzm();
                                                long jZzm9 = zzauxVar2.zzc().zzm();
                                                if (jZzm8 == 0) {
                                                    return Optional.of(zzatq.zzF);
                                                }
                                                zzavgVarZzc = zzavg.zzb(jZzm9 % jZzm8);
                                                zzauxVar2.zzb(zzavgVarZzc);
                                                return Optional.empty();
                                            case 13:
                                                zzauxVar2 = ((zzavb) obj).zzb;
                                                zzavgVarZzc = zzavg.zzc(zzauxVar2.zzc().zzq() * zzauxVar2.zzc().zzq());
                                                zzauxVar2.zzb(zzavgVarZzc);
                                                return Optional.empty();
                                            case 14:
                                                zzauxVar2 = ((zzavb) obj).zzb;
                                                zzavgVarZzc = zzavg.zzb(zzauxVar2.zzc().zzm() * zzauxVar2.zzc().zzm());
                                                zzauxVar2.zzb(zzavgVarZzc);
                                                return Optional.empty();
                                            case 15:
                                                zzauxVar = ((zzavb) obj).zzb;
                                                long jZzm10 = zzauxVar.zzc().zzm();
                                                ArrayList arrayList = new ArrayList();
                                                for (long j11 = 0; j11 < jZzm10; j11++) {
                                                    arrayList.add(zzauxVar.zzc());
                                                }
                                                Collections.reverse(arrayList);
                                                zzavgVarZzb = zzavg.zze(arrayList);
                                                zzauxVar.zzb(zzavgVarZzb);
                                                return Optional.empty();
                                            case 16:
                                                zzauxVar2 = ((zzavb) obj).zzb;
                                                zzavgVarZzc = zzavg.zzc(Math.pow(zzauxVar2.zzc().zzq(), zzauxVar2.zzc().zzq()));
                                                zzauxVar2.zzb(zzavgVarZzc);
                                                return Optional.empty();
                                            case 17:
                                                ((zzavb) obj).zzb.zzb(zzavg.zza(null));
                                                return Optional.empty();
                                            case 18:
                                                zzavb zzavbVar5 = (zzavb) obj;
                                                ByteBuffer byteBufferWrap = ByteBuffer.wrap(zzavbVar5.zzd.zzf((173020597 + ((((403189074 & (~1201162069L)) | 1043752718) + ((1201162069 & 95979632) | 900760100)) - 1939818933)) ^ (507611410 % 329370448)).zza());
                                                byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                                                zzavbVar5.zzb.zzb(zzavg.zzc(Double.longBitsToDouble(byteBufferWrap.getLong())));
                                                return Optional.empty();
                                            case 19:
                                                zzavb zzavbVar6 = (zzavb) obj;
                                                zzavbVar6.zzb.zzb(zzavg.zzb(zzavbVar6.zzd.zze()));
                                                return Optional.empty();
                                            default:
                                                long j12 = 204353385 + (((((~346030096L) & 203234088) | 575197286) + ((346030096 & 2352425736L) | 2745332883L)) - 1710193702);
                                                long j13 = 1246101662 % 372004513;
                                                long j14 = 560413640 + ((((1747262537 & (~1810821955L)) | 563863662) + ((1810821955 & 1295301633) | 94020008)) - 2251412746L);
                                                long j15 = 1675644664 % 749217043;
                                                zzavb zzavbVar7 = (zzavb) obj;
                                                zzaup zzaupVar3 = zzavbVar7.zzd;
                                                long jZze = zzaupVar3.zze();
                                                if (jZze < 0 || jZze > (j12 ^ j13)) {
                                                    zzatqVar2 = zzatq.zzz;
                                                } else {
                                                    if (((j14 ^ j15) & jZze) == 0) {
                                                        zzavbVar7.zzb.zzb(zzavg.zzd(zzaupVar3.zzf(jZze)));
                                                        return Optional.empty();
                                                    }
                                                    zzatqVar2 = zzatq.zze;
                                                }
                                                return Optional.of(zzatqVar2);
                                        }
                                    } catch (zzaum unused5) {
                                        zzatqVar = zzatq.zzD;
                                    }
                                } catch (zzavd unused6) {
                                    zzatqVar = zzatq.zzy;
                                }
                            } catch (zzauw unused7) {
                                zzatqVar = zzatq.zza;
                            }
                        } catch (zzauw e11) {
                            e = e11;
                            throw new AssertionError(zzaui.zza("CEiv6BFfPnitUE+D"), e);
                        }
                    } catch (zzauv unused8) {
                        zzatqVar = zzatq.zzx;
                    }
                } catch (zzauo unused9) {
                    zzatqVar = zzatq.zzz;
                }
            } catch (zzaun | zzauo unused10) {
                zzatqVar = zzatq.zzi;
            }
        } catch (zzaun e12) {
            e = e12;
            throw new AssertionError(zzaui.zza("CEiv6BFfPnitUE+D"), e);
        }
    }
}
