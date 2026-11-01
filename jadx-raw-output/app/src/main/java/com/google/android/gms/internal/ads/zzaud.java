package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Optional;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class zzaud implements zzauy {
    public static final /* synthetic */ zzaud zza;
    public static final /* synthetic */ zzaud zzb;
    public static final /* synthetic */ zzaud zzc;
    public static final /* synthetic */ zzaud zzd;
    public static final /* synthetic */ zzaud zze;
    public static final /* synthetic */ zzaud zzf;
    public static final /* synthetic */ zzaud zzg;
    public static final /* synthetic */ zzaud zzh;
    public static final /* synthetic */ zzaud zzi;
    public static final /* synthetic */ zzaud zzj;
    public static final /* synthetic */ zzaud zzk;
    public static final /* synthetic */ zzaud zzl;
    public static final /* synthetic */ zzaud zzm;
    public static final /* synthetic */ zzaud zzn;
    public static final /* synthetic */ zzaud zzo;
    public static final /* synthetic */ zzaud zzp;
    public static final /* synthetic */ zzaud zzq;
    public static final /* synthetic */ zzaud zzr;
    public static final /* synthetic */ zzaud zzs;
    public static final /* synthetic */ zzaud zzt;
    public static final /* synthetic */ zzaud zzu;
    private final /* synthetic */ int zzv;

    static {
        int[] iArr = {1424268980, 433259076, 136627722, 299303110, 33824130, 606102243, 157354814, 1129566413, 184803526};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        iArr[0] = 1194953865;
        iArr[1] = 541827704;
        iArr[2] = 1410336387;
        iArr[3] = 676044922;
        iArr[4] = 221517442;
        iArr[5] = -1933377539;
        iArr[6] = 270744729;
        iArr[7] = 485560280;
        iArr[8] = 402724286;
        iArr[0] = 2077486715;
        iArr[1] = 1348527492;
        iArr[2] = 196553360;
        iArr[3] = 1547749134;
        iArr[4] = 218380923;
        iArr[5] = -1556363273;
        iArr[6] = 1117142618;
        iArr[7] = 1713258270;
        iArr[8] = 1573363368;
        iArr[0] = 1272469786;
        iArr[1] = 1097507524;
        iArr[2] = 723881402;
        iArr[3] = 1078604356;
        iArr[4] = 746642480;
        iArr[5] = -897741623;
        iArr[6] = 933110197;
        iArr[7] = 1544617505;
        iArr[8] = 243268139;
        int i18 = (933110197 + ((((1097507524 & (~1272469786)) | 723881402) + ((1272469786 & 1078604356) | 746642480)) - (-897741623))) ^ (1544617505 % 243268139);
        iArr[0] = 2058657199;
        iArr[1] = 1077280871;
        iArr[2] = 426331554;
        iArr[3] = 1242960213;
        iArr[4] = 260153146;
        iArr[5] = 1989324759;
        iArr[6] = 535343610;
        iArr[7] = 711845894;
        iArr[8] = 404158660;
        iArr[0] = 1635905385;
        iArr[1] = 436500164;
        iArr[2] = 1627617040;
        iArr[3] = 1527677388;
        iArr[4] = 1092341018;
        iArr[5] = -139815355;
        iArr[6] = 1111783898;
        iArr[7] = 1253207672;
        iArr[8] = 570073850;
        iArr[0] = 1280321648;
        iArr[1] = 1509448282;
        iArr[2] = 1074834725;
        iArr[3] = 434689663;
        iArr[4] = 67544101;
        iArr[5] = 2051242917;
        iArr[6] = 654558235;
        iArr[7] = 1309383303;
        iArr[8] = 1129033333;
        iArr[0] = 1722060049;
        iArr[1] = 1087578905;
        iArr[2] = 70644109;
        iArr[3] = 1625428690;
        iArr[4] = 673239279;
        iArr[5] = -1074846867;
        iArr[6] = 1472576335;
        iArr[7] = 860516127;
        iArr[8] = 777720504;
        int i19 = (1472576335 + (((((~1722060049) & 1087578905) | 70644109) + ((1722060049 & 1625428690) | 673239279)) - (-1074846867))) ^ (860516127 % 777720504);
        iArr[0] = 2137100237;
        iArr[1] = 243279585;
        iArr[2] = 1476690352;
        iArr[3] = 1182836297;
        iArr[4] = 1215531406;
        iArr[5] = -1307577232;
        iArr[6] = 478034945;
        iArr[7] = 1251300606;
        iArr[8] = 959372260;
        iArr[0] = 257675105;
        iArr[1] = 286888065;
        iArr[2] = 1680106172;
        iArr[3] = 353998857;
        iArr[4] = 216033710;
        iArr[5] = -1837632293;
        iArr[6] = 282938351;
        iArr[7] = 2033505236;
        iArr[8] = 29777560;
        iArr[0] = 406011017;
        iArr[1] = 1269108768;
        iArr[2] = 73167649;
        iArr[3] = 2074166272;
        iArr[4] = 872470299;
        iArr[5] = -1892503949;
        iArr[6] = 524305153;
        iArr[7] = 1615935710;
        iArr[8] = 639806732;
        iArr[0] = 168057522;
        iArr[1] = 567809569;
        iArr[2] = 2007585082;
        iArr[3] = 1112917761;
        iArr[4] = 1200484666;
        iArr[5] = -1571978753;
        iArr[6] = 181271232;
        iArr[7] = 1761250573;
        iArr[8] = 1089653714;
        int i20 = (181271232 + ((((567809569 & (~168057522)) | 2007585082) + ((168057522 & 1112917761) | 1200484666)) - (-1571978753))) ^ (1761250573 % 1089653714);
        iArr[0] = 1687776787;
        iArr[1] = 1627592001;
        iArr[2] = 771768986;
        iArr[3] = 1226806633;
        iArr[4] = 136094264;
        iArr[5] = 2011805892;
        iArr[6] = 101323875;
        iArr[7] = 992028067;
        iArr[8] = 180785147;
        iArr[0] = 627992393;
        iArr[1] = 399075139;
        iArr[2] = 1263590114;
        iArr[3] = 1418280193;
        iArr[4] = 1644468862;
        iArr[5] = -1231608040;
        iArr[6] = 270754552;
        iArr[7] = 1449228398;
        iArr[8] = 989241888;
        iArr[0] = 386839851;
        iArr[1] = 502322088;
        iArr[2] = 1879579687;
        iArr[3] = 1341449096;
        iArr[4] = 1376723987;
        iArr[5] = -1336833132;
        iArr[6] = 467350160;
        iArr[7] = 2118801173;
        iArr[8] = 1119399015;
        iArr[0] = 1111088131;
        iArr[1] = 1881672142;
        iArr[2] = 1222111317;
        iArr[3] = 807995786;
        iArr[4] = 38123124;
        iArr[5] = 1582432229;
        iArr[6] = 74248348;
        iArr[7] = 1348361729;
        iArr[8] = 788380902;
        int i21 = (467350160 + ((((502322088 & (~386839851)) | 1879579687) + ((386839851 & 1341449096) | 1376723987)) - (-1336833132))) ^ (2118801173 % 1119399015);
        int i22 = (270754552 + ((((399075139 & (~627992393)) | 1263590114) + ((627992393 & 1418280193) | 1644468862)) - (-1231608040))) ^ (1449228398 % 989241888);
        int i23 = (101323875 + ((((1627592001 & (~1687776787)) | 771768986) + ((1687776787 & 1226806633) | 136094264)) - 2011805892)) ^ (992028067 % 180785147);
        int i24 = (74248348 + ((((1881672142 & (~1111088131)) | 1222111317) + ((1111088131 & 807995786) | 38123124)) - 1582432229)) ^ (1348361729 % 788380902);
        iArr[0] = 1374600938;
        iArr[1] = 269492393;
        iArr[2] = 962980710;
        iArr[3] = -2079309685;
        iArr[4] = -1096234186;
        iArr[5] = -75177426;
        iArr[6] = 649785905;
        iArr[7] = 1587992726;
        iArr[8] = 995234140;
        iArr[0] = 338346092;
        iArr[1] = 646267944;
        iArr[2] = 2030210865;
        iArr[3] = 109431182;
        iArr[4] = 1768591350;
        iArr[5] = -955070129;
        iArr[6] = 1725019;
        iArr[7] = 1912163036;
        iArr[8] = 671068506;
        iArr[0] = 636453333;
        iArr[1] = 363983206;
        iArr[2] = 1075208291;
        iArr[3] = 2146013964;
        iArr[4] = 1783382730;
        iArr[5] = -364134615;
        iArr[6] = 775056794;
        iArr[7] = 1564003050;
        iArr[8] = 99885196;
        zzu = new zzaud((775056794 + (((((~636453333) & 363983206) | 1075208291) + ((636453333 & 2146013964) | 1783382730)) - (-364134615))) ^ (1564003050 % 99885196));
        zzt = new zzaud((1725019 + (((((~338346092) & 646267944) | 2030210865) + ((338346092 & 109431182) | 1768591350)) - (-955070129))) ^ (1912163036 % 671068506));
        zzs = new zzaud((649785905 + (((((~1374600938) & 269492393) | 962980710) + ((1374600938 & (-2079309685)) | (-1096234186))) - (-75177426))) ^ (1587992726 % 995234140));
        zzr = new zzaud(i24);
        zzq = new zzaud(i21);
        zzp = new zzaud(i22);
        zzaud zzaudVar = new zzaud(i23);
        int i25 = (524305153 + ((((1269108768 & (~406011017)) | 73167649) + ((406011017 & 2074166272) | 872470299)) - (-1892503949))) ^ (1615935710 % 639806732);
        int i26 = (282938351 + ((((286888065 & (~257675105)) | 1680106172) + ((257675105 & 353998857) | 216033710)) - (-1837632293))) ^ (2033505236 % 29777560);
        int i27 = (478034945 + ((((243279585 & (~2137100237)) | 1476690352) + ((2137100237 & 1182836297) | 1215531406)) - (-1307577232))) ^ (1251300606 % 959372260);
        int i28 = (654558235 + (((((~1280321648) & 1509448282) | 1074834725) + ((1280321648 & 434689663) | 67544101)) - 2051242917)) ^ (1309383303 % 1129033333);
        int i29 = (1111783898 + (((((~1635905385) & 436500164) | 1627617040) + ((1635905385 & 1527677388) | 1092341018)) - (-139815355))) ^ (1253207672 % 570073850);
        int i30 = (535343610 + ((((1077280871 & (~2058657199)) | 426331554) + ((2058657199 & 1242960213) | 260153146)) - 1989324759)) ^ (711845894 % 404158660);
        int i31 = (1117142618 + ((((1348527492 & (~2077486715)) | 196553360) + ((2077486715 & 1547749134) | 218380923)) - (-1556363273))) ^ (1713258270 % 1573363368);
        int i32 = (270744729 + ((((541827704 & (~1194953865)) | 1410336387) + ((1194953865 & 676044922) | 221517442)) - (-1933377539))) ^ (485560280 % 402724286);
        int i33 = (i16 + ((((i11 & (~i10)) | i12) + ((i10 & i13) | i14)) - i15)) ^ (i17 % 184803526);
        zzo = zzaudVar;
        zzn = new zzaud(i20);
        zzm = new zzaud(i25);
        zzl = new zzaud(i26);
        zzk = new zzaud(i27);
        zzj = new zzaud(i19);
        zzi = new zzaud(i28);
        zzh = new zzaud(i29);
        zzg = new zzaud(i30);
        zzf = new zzaud(i18);
        zze = new zzaud(i31);
        zzd = new zzaud(i32);
        zzc = new zzaud(i33);
        zzb = new zzaud(1);
        zza = new zzaud(0);
    }

    private /* synthetic */ zzaud(int i10) {
        this.zzv = i10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:63:0x0126 A[Catch: zzauw -> 0x0099, ClassNotFoundException -> 0x0132, zzavd -> 0x0136, zzaut | zzauv -> 0x056f, TryCatch #5 {zzauw -> 0x0099, blocks: (B:200:0x0577, B:206:0x0595, B:208:0x059d, B:211:0x05a7, B:213:0x05b0, B:227:0x062b, B:214:0x05b9, B:215:0x05be, B:216:0x05bf, B:219:0x05ed, B:220:0x05f2, B:224:0x05fe, B:226:0x0606, B:228:0x0630, B:229:0x0635, B:230:0x0636, B:6:0x003b, B:7:0x004c, B:9:0x0052, B:11:0x0060, B:12:0x0062, B:13:0x0068, B:14:0x006f, B:16:0x0087, B:17:0x008a, B:25:0x00ac, B:30:0x00cb, B:64:0x012a, B:34:0x00d6, B:38:0x00e1, B:42:0x00ec, B:46:0x00f7, B:50:0x0102, B:54:0x010d, B:58:0x0118, B:62:0x0123, B:63:0x0126, B:69:0x013e, B:73:0x0155, B:79:0x0179, B:80:0x0184, B:85:0x019f, B:89:0x01b9, B:97:0x01e2, B:99:0x01f8, B:100:0x01fa, B:101:0x0200, B:102:0x0205, B:105:0x020d, B:107:0x0225, B:108:0x0228, B:125:0x035c, B:126:0x0362, B:150:0x03fd, B:152:0x0405, B:156:0x0411, B:157:0x0419, B:158:0x0421, B:168:0x0460, B:171:0x047d, B:174:0x04c0, B:177:0x04d7, B:188:0x0516, B:189:0x0530, B:192:0x0538, B:195:0x0554), top: B:238:0x000a }] */
    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        zzatq zzatqVar;
        zzaux zzauxVar;
        zzavg zzavgVarZzb;
        zzaux zzauxVar2;
        zzavg zzavgVarZzb2;
        zzaux zzauxVar3;
        zzavg zzavgVarZza;
        zzatq zzatqVar2;
        zzaux zzauxVar4;
        zzavg zzavgVarZzj;
        Class<?> cls;
        zzatq zzatqVar3;
        long j10 = 1;
        try {
            try {
                try {
                    try {
                        switch (this.zzv) {
                            case 0:
                                zzauxVar = ((zzavb) obj).zzb;
                                zzavgVarZzb = zzavg.zzb(zzauxVar.zzc().zzm() + zzauxVar.zzc().zzm());
                                zzauxVar.zzb(zzavgVarZzb);
                                return Optional.empty();
                            case 1:
                                zzauxVar = ((zzavb) obj).zzb;
                                zzavgVarZzb = zzavg.zzc(zzauxVar.zzc().zzq() + zzauxVar.zzc().zzq());
                                zzauxVar.zzb(zzavgVarZzb);
                                return Optional.empty();
                            case 2:
                                zzauxVar = ((zzavb) obj).zzb;
                                zzavgVarZzb = zzavg.zzd(zzauxVar.zzc().zzn().zzd(zzauxVar.zzc().zzn()));
                                zzauxVar.zzb(zzavgVarZzb);
                                return Optional.empty();
                            case 3:
                                zzavb zzavbVar = (zzavb) obj;
                                try {
                                    long jZze = zzavbVar.zzd.zze();
                                    for (long j11 = 0; j11 < jZze; j11++) {
                                        zzavbVar.zzb.zzb(zzavg.zza(null));
                                    }
                                    return Optional.empty();
                                } catch (zzauw unused) {
                                    zzatqVar = zzatq.zza;
                                    return Optional.of(zzatqVar);
                                }
                            case 4:
                                zzauxVar2 = ((zzavb) obj).zzb;
                                zzavgVarZzb2 = zzavg.zzb(zzauxVar2.zzc().zzm() & zzauxVar2.zzc().zzm());
                                zzauxVar2.zzb(zzavgVarZzb2);
                                return Optional.empty();
                            case 5:
                                long j12 = 6538657 + ((((1259538933 & (~916768482L)) | 805446160) + ((916768482 & (-15648283)) | (-1266372608))) - 883303887);
                                long j13 = 384868448 % 102194872;
                                zzauxVar2 = ((zzavb) obj).zzb;
                                zzavgVarZzb2 = zzavg.zzb(zzauxVar2.zzc().zzm() ^ (j12 ^ j13));
                                zzauxVar2.zzb(zzavgVarZzb2);
                                return Optional.empty();
                            case 6:
                                zzauxVar2 = ((zzavb) obj).zzb;
                                zzavgVarZzb2 = zzavg.zzb(zzauxVar2.zzc().zzm() | zzauxVar2.zzc().zzm());
                                zzauxVar2.zzb(zzavgVarZzb2);
                                return Optional.empty();
                            case 7:
                                zzauxVar2 = ((zzavb) obj).zzb;
                                zzavgVarZzb2 = zzavg.zzb(zzauxVar2.zzc().zzm() ^ zzauxVar2.zzc().zzm());
                                zzauxVar2.zzb(zzavgVarZzb2);
                                return Optional.empty();
                            case 8:
                                zzavb zzavbVar2 = (zzavb) obj;
                                try {
                                    zzaux zzauxVar5 = zzavbVar2.zzb;
                                    long jZzm = zzauxVar5.zzc().zzm();
                                    zzauu zzauuVar = zzavbVar2.zzc;
                                    zzaup zzaupVar = zzavbVar2.zzd;
                                    zzauuVar.zza(zzaupVar.zzb(), 0L, zzauxVar5.zzb);
                                    zzaupVar.zza(jZzm);
                                    return Optional.empty();
                                } catch (zzaun | zzauo unused2) {
                                    zzatqVar = zzatq.zzr;
                                    return Optional.of(zzatqVar);
                                } catch (zzaus unused3) {
                                    zzatqVar = zzatq.zzB;
                                    return Optional.of(zzatqVar);
                                }
                            case 9:
                                zzavb zzavbVar3 = (zzavb) obj;
                                try {
                                    zzaux zzauxVar6 = zzavbVar3.zzb;
                                    long jZzm2 = zzauxVar6.zzc().zzm();
                                    List listZzo = zzauxVar6.zzc().zzo();
                                    int size = listZzo.size();
                                    Object objZzh = zzauxVar6.zzc().zzh();
                                    Object objZzl = zzauxVar6.zzc().zzl();
                                    if (objZzl instanceof Method) {
                                        Method method = (Method) objZzl;
                                        Class<?>[] parameterTypes = method.getParameterTypes();
                                        if (parameterTypes.length == size) {
                                            Object[] objArr = new Object[size];
                                            if (objZzh instanceof Constructor) {
                                                Class<?>[] parameterTypes2 = ((Constructor) objZzh).getParameterTypes();
                                                int length = parameterTypes2.length;
                                                Object[] objArr2 = new Object[length];
                                                List listZzo2 = ((zzavg) listZzo.get(0)).zzo();
                                                if (listZzo2.size() == length) {
                                                    for (int i10 = 0; i10 < listZzo2.size(); i10++) {
                                                        objArr2[i10] = ((zzavg) listZzo2.get(i10)).zzi(parameterTypes2[i10]);
                                                    }
                                                    objArr[0] = objArr2;
                                                }
                                            } else {
                                                for (int i11 = 0; i11 < size; i11++) {
                                                    objArr[i11] = ((zzavg) listZzo.get(i11)).zzi(parameterTypes[i11]);
                                                }
                                            }
                                            try {
                                                Object objInvoke = method.invoke(objZzh, objArr);
                                                if (method.getReturnType() == Void.class || method.getReturnType() == Void.TYPE) {
                                                    zzauxVar3 = zzavbVar3.zzb;
                                                    zzavgVarZza = zzavg.zza(null);
                                                } else if (jZzm2 != 0) {
                                                    zzauxVar3 = zzavbVar3.zzb;
                                                    zzavgVarZza = zzavg.zzg(objInvoke);
                                                } else {
                                                    zzauxVar3 = zzavbVar3.zzb;
                                                    zzavgVarZza = zzavg.zza(objInvoke);
                                                }
                                                zzauxVar3.zzb(zzavgVarZza);
                                                return Optional.empty();
                                            } catch (Throwable unused4) {
                                                zzatqVar = zzatq.zzq;
                                                return Optional.of(zzatqVar);
                                            }
                                        }
                                    }
                                    return Optional.of(zzatq.zzp);
                                } catch (zzavd unused5) {
                                    zzatqVar = zzatq.zzp;
                                }
                                break;
                            case 10:
                                int i12 = 397101755 + ((((73475461 & (~2084546560)) | 438076064) + ((2084546560 & 611428101) | 2023412224)) - (-1433220034));
                                int i13 = 1073781763 % 1003463633;
                                int i14 = 149822540 + ((((107429921 & (~461273879)) | 378966045) + ((461273879 & 283197472) | 1937909388)) - (-2012085812));
                                int i15 = 1917305981 % 575705360;
                                zzavb zzavbVar4 = (zzavb) obj;
                                zzaux zzauxVar7 = zzavbVar4.zzb;
                                int intExact = Math.toIntExact(zzauxVar7.zzc().zzm());
                                zzauk zzaukVarZzn = zzauxVar7.zzc().zzn();
                                zzauk zzaukVarZzn2 = zzauxVar7.zzc().zzn();
                                if (zzaukVarZzn.zza.length != (i12 ^ i13)) {
                                    return Optional.of(zzatq.zzH);
                                }
                                int[] iArr = new int[i14 ^ i15];
                                ByteBuffer.wrap(zzaukVarZzn.zza()).asIntBuffer().get(iArr);
                                zzauc zzaucVar = new zzauc(intExact, iArr);
                                int i16 = 608109803 + (((((~1183912267) & 781500673) | 1683555012) + ((1183912267 & 180666625) | 541077750)) - (-1341878771));
                                int i17 = 1527793660 % 245277883;
                                int i18 = 91904737 + (((((~95266356) & 568641509) | 183483904) + ((95266356 & 553669093) | 504469010)) - 966284501);
                                int i19 = 2026478004 % 1659239833;
                                byte[] bArrZza = zzaukVarZzn2.zza();
                                int i20 = (224048977 + ((((1360184381 & (~1787189168)) | 611517270) + ((1787189168 & 1426637867) | 612056018)) - 1995525908)) ^ (1821115873 % 1010014811);
                                byte[] bArr = new byte[i20];
                                int i21 = 0;
                                while (i21 < bArrZza.length) {
                                    if (i21 % i20 == 0) {
                                        zzaucVar.zza(i21 >>> (i16 ^ i17), bArr);
                                    } else if (i21 == 0) {
                                        i21 = 0;
                                        zzaucVar.zza(i21 >>> (i16 ^ i17), bArr);
                                    }
                                    int i22 = i18 ^ i19;
                                    bArrZza[i21] = (byte) (((bArrZza[i21] ^ bArr[i21 % i20]) << i22) >> i22);
                                    i21++;
                                }
                                zzauk zzaukVarZze = zzauk.zze(bArrZza);
                                zzauxVar3 = zzavbVar4.zzb;
                                zzavgVarZza = zzavg.zzd(zzaukVarZze);
                                zzauxVar3.zzb(zzavgVarZza);
                                return Optional.empty();
                            case 11:
                                zzauxVar2 = ((zzavb) obj).zzb;
                                double dZzq = zzauxVar2.zzc().zzq();
                                double dZzq2 = zzauxVar2.zzc().zzq();
                                if (dZzq == 0.0d) {
                                    zzatqVar2 = zzatq.zzF;
                                    return Optional.of(zzatqVar2);
                                }
                                zzavgVarZzb2 = zzavg.zzc(dZzq2 / dZzq);
                                zzauxVar2.zzb(zzavgVarZzb2);
                                return Optional.empty();
                            case 12:
                                zzauxVar2 = ((zzavb) obj).zzb;
                                long jZzm3 = zzauxVar2.zzc().zzm();
                                long jZzm4 = zzauxVar2.zzc().zzm();
                                if (jZzm3 == 0) {
                                    zzatqVar2 = zzatq.zzF;
                                    return Optional.of(zzatqVar2);
                                }
                                zzavgVarZzb2 = zzavg.zzb(jZzm4 / jZzm3);
                                zzauxVar2.zzb(zzavgVarZzb2);
                                return Optional.empty();
                            case 13:
                                try {
                                    ((zzavb) obj).zzb.zzc();
                                    return Optional.empty();
                                } catch (zzauv unused6) {
                                    zzatqVar = zzatq.zzA;
                                    return Optional.of(zzatqVar);
                                }
                            case 14:
                                zzavb zzavbVar5 = (zzavb) obj;
                                long jZzm5 = zzavbVar5.zzb.zzc().zzm();
                                zzaux zzauxVar8 = zzavbVar5.zzb;
                                zzauxVar8.zzb(zzavg.zzj(zzauxVar8.zzd(jZzm5)));
                                return Optional.empty();
                            case 15:
                                zzavb zzavbVar6 = (zzavb) obj;
                                long jZzm6 = zzavbVar6.zzc.zzb().zzb + zzavbVar6.zzb.zzc().zzm();
                                zzauxVar4 = zzavbVar6.zzb;
                                zzavgVarZzj = zzavg.zzj(zzauxVar4.zzd(-jZzm6));
                                zzauxVar4.zzb(zzavgVarZzj);
                                return Optional.empty();
                            case 16:
                                zzavb zzavbVar7 = (zzavb) obj;
                                long jZze2 = zzavbVar7.zzc.zzb().zzb + zzavbVar7.zzd.zze();
                                zzauxVar4 = zzavbVar7.zzb;
                                zzavgVarZzj = zzavg.zzj(zzauxVar4.zzd(-jZze2));
                                zzauxVar4.zzb(zzavgVarZzj);
                                return Optional.empty();
                            case 17:
                                try {
                                    zzaux zzauxVar9 = ((zzavb) obj).zzb;
                                    if (new zzavc(true).compare(zzauxVar9.zzc(), zzauxVar9.zzc()) != 0) {
                                        j10 = 0;
                                    }
                                    zzauxVar9.zzb(zzavg.zzb(j10));
                                    return Optional.empty();
                                } catch (IllegalArgumentException unused7) {
                                    zzatqVar = zzatq.zzd;
                                    return Optional.of(zzatqVar);
                                }
                            case 18:
                                try {
                                    zzaux zzauxVar10 = ((zzavb) obj).zzb;
                                    String strZzc = zzauxVar10.zzc().zzn().zzc();
                                    switch (strZzc) {
                                        case "double":
                                            cls = Double.TYPE;
                                            break;
                                        case "int":
                                            cls = Integer.TYPE;
                                            break;
                                        case "byte":
                                            cls = Byte.TYPE;
                                            break;
                                        case "char":
                                            cls = Character.TYPE;
                                            break;
                                        case "long":
                                            cls = Long.TYPE;
                                            break;
                                        case "void":
                                            cls = Void.TYPE;
                                            break;
                                        case "boolean":
                                            cls = Boolean.TYPE;
                                            break;
                                        case "float":
                                            cls = Float.TYPE;
                                            break;
                                        case "short":
                                            cls = Short.TYPE;
                                            break;
                                        default:
                                            cls = Class.forName(strZzc);
                                            break;
                                    }
                                    zzauxVar10.zzb(zzavg.zza(cls));
                                    return Optional.empty();
                                } catch (zzavd unused8) {
                                    zzatqVar = zzatq.zzl;
                                    return Optional.of(zzatqVar);
                                } catch (ClassNotFoundException unused9) {
                                    zzatqVar = zzatq.zzm;
                                    return Optional.of(zzatqVar);
                                }
                            case 19:
                                try {
                                    zzaux zzauxVar11 = ((zzavb) obj).zzb;
                                    List listZzo3 = zzauxVar11.zzc().zzo();
                                    Class<?>[] clsArr = new Class[listZzo3.size()];
                                    for (int i23 = 0; i23 < listZzo3.size(); i23++) {
                                        Object objZzl2 = ((zzavg) listZzo3.get(i23)).zzl();
                                        if (!(objZzl2 instanceof Class)) {
                                            zzatqVar3 = zzatq.zzn;
                                            return Optional.of(zzatqVar3);
                                        }
                                        clsArr[i23] = (Class) objZzl2;
                                    }
                                    String strZzc2 = zzauxVar11.zzc().zzn().zzc();
                                    Object objZzl3 = zzauxVar11.zzc().zzl();
                                    if (objZzl3 instanceof Class) {
                                        zzauxVar11.zzb(zzavg.zza(((Class) objZzl3).getMethod(strZzc2, clsArr)));
                                        return Optional.empty();
                                    }
                                    zzatqVar3 = zzatq.zzn;
                                    return Optional.of(zzatqVar3);
                                } catch (zzavd unused10) {
                                    zzatqVar = zzatq.zzn;
                                    return Optional.of(zzatqVar);
                                } catch (NoSuchMethodException unused11) {
                                    zzatqVar = zzatq.zzo;
                                    return Optional.of(zzatqVar);
                                } catch (SecurityException unused12) {
                                    zzatqVar = zzatq.zzC;
                                    return Optional.of(zzatqVar);
                                }
                            default:
                                int i24 = 68643968 + ((((2040670728 & (~306851320)) | 1372152390) + ((306851320 & (-1473639347)) | (-2036492681))) - 312811060);
                                int i25 = 1764892438 % 764851988;
                                zzaux zzauxVar12 = ((zzavb) obj).zzb;
                                long jZzm7 = zzauxVar12.zzc().zzm();
                                zzavg zzavgVarZzc = zzauxVar12.zzc();
                                zzavg zzavgVarZzc2 = zzauxVar12.zzc();
                                int i26 = zzavgVarZzc2.zza;
                                int i27 = (i24 ^ i25) + i26;
                                if (i26 == 0) {
                                    throw null;
                                }
                                if (i27 == 3) {
                                    zzauk zzaukVarZzn3 = zzavgVarZzc2.zzn();
                                    int i28 = 365862802 + (((((~284327308) & 44384696) | 1708231444) + ((284327308 & 1647591593) | 1951966997)) - (-722584097));
                                    int i29 = 2085308422 % 531900034;
                                    if (jZzm7 < 0) {
                                        jZzm7 += (long) zzaukVarZzn3.zza.length;
                                    }
                                    if (zzavgVarZzc.zza != (i28 ^ i29)) {
                                        throw new zzavd();
                                    }
                                    if (jZzm7 >= 0 && jZzm7 < zzaukVarZzn3.zza.length) {
                                        char cCharAt = zzaukVarZzn3.zzc().charAt((int) jZzm7);
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(cCharAt).length());
                                        sb2.append(cCharAt);
                                        zzavgVarZzc = zzavg.zzd(zzauk.zzf(sb2.toString()));
                                    }
                                } else {
                                    if (i27 != 4) {
                                        throw new zzavd();
                                    }
                                    List listZzo4 = zzavgVarZzc2.zzo();
                                    if (jZzm7 < 0) {
                                        jZzm7 += (long) listZzo4.size();
                                    }
                                    if (jZzm7 >= 0 && jZzm7 < listZzo4.size()) {
                                        zzavgVarZzc = (zzavg) listZzo4.get((int) jZzm7);
                                    }
                                }
                                zzauxVar12.zzb(zzavgVarZzc);
                                return Optional.empty();
                        }
                    } catch (zzauw e10) {
                        throw new AssertionError(zzaui.zza("CEiv6BFfPnitUE+D"), e10);
                    }
                } catch (zzaut | zzauv unused13) {
                    zzatqVar = zzatq.zzx;
                }
            } catch (zzaum | zzauo | zzavd unused14) {
                zzatqVar = zzatq.zzy;
            }
        } catch (zzauv unused15) {
            zzatqVar = zzatq.zzf;
        }
    }
}
