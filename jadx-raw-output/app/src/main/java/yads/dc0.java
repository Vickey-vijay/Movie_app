package yads;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.exifinterface.media.ExifInterface;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.ironsource.I9;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class dc0 implements im, r83 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final sm2 f76611n = p51.a(4800000L, 3100000L, 2100000L, 1500000L, 800000L);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final sm2 f76612o = p51.a(1500000L, 1000000L, 730000L, 440000L, 170000L);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final sm2 f76613p = p51.a(2200000L, 1400000L, 1100000L, 910000L, 620000L);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final sm2 f76614q = p51.a(3000000L, 1900000L, 1400000L, 1000000L, 660000L);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final sm2 f76615r = p51.a(6000000L, 4100000L, 3200000L, 1800000L, 1000000L);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final sm2 f76616s = p51.a(2800000L, 2400000L, 1600000L, 1100000L, 950000L);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static dc0 f76617t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s51 f76618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gm f76619b = new gm();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b13 f76620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final xv f76621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f76622e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f76623f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f76624g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f76625h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f76626i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f76627j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f76628k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f76629l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f76630m;

    public final void a(Handler handler, se seVar) {
        seVar.getClass();
        gm gmVar = this.f76619b;
        gmVar.getClass();
        for (fm fmVar : gmVar.f77853a) {
            if (fmVar.f77439b == seVar) {
                fmVar.f77440c = true;
                gmVar.f77853a.remove(fmVar);
            }
        }
        gmVar.f77853a.add(new fm(handler, seVar));
    }

    public final synchronized void b(int i10) {
        int i11 = this.f76626i;
        if (i11 == 0 || this.f76622e) {
            if (i11 == i10) {
                return;
            }
            this.f76626i = i10;
            if (i10 != 1 && i10 != 0 && i10 != 8) {
                this.f76629l = a(i10);
                ((f53) this.f76621d).getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                int i12 = this.f76623f > 0 ? (int) (jElapsedRealtime - this.f76624g) : 0;
                long j10 = this.f76625h;
                long j11 = this.f76629l;
                if (i12 != 0 || j10 != 0 || j11 != this.f76630m) {
                    this.f76630m = j11;
                    this.f76619b.a(i12, j10, j11);
                }
                this.f76624g = jElapsedRealtime;
                this.f76625h = 0L;
                this.f76628k = 0L;
                this.f76627j = 0L;
                b13 b13Var = this.f76620c;
                b13Var.f75690b.clear();
                b13Var.f75692d = -1;
                b13Var.f75693e = 0;
                b13Var.f75694f = 0;
            }
        }
    }

    public dc0(Context context, HashMap map, int i10, f53 f53Var, boolean z10) {
        this.f76618a = s51.a(map);
        this.f76620c = new b13(i10);
        this.f76621d = f53Var;
        this.f76622e = z10;
        if (context != null) {
            o82 o82VarA = o82.a(context);
            int iA = o82VarA.a();
            this.f76626i = iA;
            this.f76629l = a(iA);
            o82VarA.b(new m82() { // from class: cp.u0
                @Override // yads.m82
                public final void a(int i11) {
                    this.f51606a.b(i11);
                }
            });
            return;
        }
        this.f76626i = 0;
        this.f76629l = a(0);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int[] a(String str) {
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case 2083:
                if (str.equals("AD")) {
                    b10 = 0;
                }
                break;
            case 2084:
                if (str.equals("AE")) {
                    b10 = 1;
                }
                break;
            case 2085:
                if (str.equals("AF")) {
                    b10 = 2;
                }
                break;
            case 2086:
                if (str.equals("AG")) {
                    b10 = 3;
                }
                break;
            case 2088:
                if (str.equals("AI")) {
                    b10 = 4;
                }
                break;
            case 2091:
                if (str.equals("AL")) {
                    b10 = 5;
                }
                break;
            case 2092:
                if (str.equals("AM")) {
                    b10 = 6;
                }
                break;
            case 2094:
                if (str.equals("AO")) {
                    b10 = 7;
                }
                break;
            case 2096:
                if (str.equals("AQ")) {
                    b10 = 8;
                }
                break;
            case 2097:
                if (str.equals("AR")) {
                    b10 = 9;
                }
                break;
            case 2098:
                if (str.equals("AS")) {
                    b10 = 10;
                }
                break;
            case 2099:
                if (str.equals("AT")) {
                    b10 = 11;
                }
                break;
            case 2100:
                if (str.equals("AU")) {
                    b10 = 12;
                }
                break;
            case ERROR_REASON_ANALYTICS_MONITOR_BAD_CONTENT_VALUE:
                if (str.equals("AW")) {
                    b10 = 13;
                }
                break;
            case 2103:
                if (str.equals("AX")) {
                    b10 = 14;
                }
                break;
            case 2105:
                if (str.equals("AZ")) {
                    b10 = 15;
                }
                break;
            case 2111:
                if (str.equals("BA")) {
                    b10 = 16;
                }
                break;
            case 2112:
                if (str.equals("BB")) {
                    b10 = 17;
                }
                break;
            case 2114:
                if (str.equals("BD")) {
                    b10 = 18;
                }
                break;
            case 2115:
                if (str.equals("BE")) {
                    b10 = 19;
                }
                break;
            case 2116:
                if (str.equals("BF")) {
                    b10 = 20;
                }
                break;
            case 2117:
                if (str.equals("BG")) {
                    b10 = 21;
                }
                break;
            case 2118:
                if (str.equals("BH")) {
                    b10 = 22;
                }
                break;
            case 2119:
                if (str.equals("BI")) {
                    b10 = 23;
                }
                break;
            case 2120:
                if (str.equals("BJ")) {
                    b10 = 24;
                }
                break;
            case 2122:
                if (str.equals("BL")) {
                    b10 = 25;
                }
                break;
            case 2123:
                if (str.equals("BM")) {
                    b10 = 26;
                }
                break;
            case 2124:
                if (str.equals("BN")) {
                    b10 = 27;
                }
                break;
            case 2125:
                if (str.equals("BO")) {
                    b10 = 28;
                }
                break;
            case 2127:
                if (str.equals("BQ")) {
                    b10 = 29;
                }
                break;
            case 2129:
                if (str.equals("BS")) {
                    b10 = 30;
                }
                break;
            case 2130:
                if (str.equals("BT")) {
                    b10 = 31;
                }
                break;
            case 2133:
                if (str.equals("BW")) {
                    b10 = 32;
                }
                break;
            case 2135:
                if (str.equals("BY")) {
                    b10 = 33;
                }
                break;
            case 2136:
                if (str.equals("BZ")) {
                    b10 = 34;
                }
                break;
            case 2142:
                if (str.equals("CA")) {
                    b10 = 35;
                }
                break;
            case 2145:
                if (str.equals("CD")) {
                    b10 = 36;
                }
                break;
            case 2147:
                if (str.equals("CF")) {
                    b10 = 37;
                }
                break;
            case 2148:
                if (str.equals("CG")) {
                    b10 = 38;
                }
                break;
            case 2149:
                if (str.equals("CH")) {
                    b10 = 39;
                }
                break;
            case 2150:
                if (str.equals("CI")) {
                    b10 = 40;
                }
                break;
            case 2152:
                if (str.equals("CK")) {
                    b10 = 41;
                }
                break;
            case 2153:
                if (str.equals("CL")) {
                    b10 = ExifInterface.START_CODE;
                }
                break;
            case 2154:
                if (str.equals("CM")) {
                    b10 = 43;
                }
                break;
            case 2155:
                if (str.equals("CN")) {
                    b10 = 44;
                }
                break;
            case 2156:
                if (str.equals("CO")) {
                    b10 = 45;
                }
                break;
            case 2159:
                if (str.equals("CR")) {
                    b10 = 46;
                }
                break;
            case 2162:
                if (str.equals("CU")) {
                    b10 = 47;
                }
                break;
            case 2163:
                if (str.equals("CV")) {
                    b10 = 48;
                }
                break;
            case 2164:
                if (str.equals("CW")) {
                    b10 = 49;
                }
                break;
            case 2165:
                if (str.equals("CX")) {
                    b10 = 50;
                }
                break;
            case 2166:
                if (str.equals("CY")) {
                    b10 = 51;
                }
                break;
            case 2167:
                if (str.equals("CZ")) {
                    b10 = 52;
                }
                break;
            case 2177:
                if (str.equals("DE")) {
                    b10 = 53;
                }
                break;
            case 2182:
                if (str.equals("DJ")) {
                    b10 = 54;
                }
                break;
            case 2183:
                if (str.equals("DK")) {
                    b10 = 55;
                }
                break;
            case 2185:
                if (str.equals("DM")) {
                    b10 = 56;
                }
                break;
            case 2187:
                if (str.equals("DO")) {
                    b10 = 57;
                }
                break;
            case 2198:
                if (str.equals("DZ")) {
                    b10 = 58;
                }
                break;
            case 2206:
                if (str.equals("EC")) {
                    b10 = 59;
                }
                break;
            case 2208:
                if (str.equals("EE")) {
                    b10 = 60;
                }
                break;
            case I9.a.f26814e /* 2210 */:
                if (str.equals("EG")) {
                    b10 = 61;
                }
                break;
            case 2221:
                if (str.equals("ER")) {
                    b10 = 62;
                }
                break;
            case 2222:
                if (str.equals("ES")) {
                    b10 = 63;
                }
                break;
            case 2223:
                if (str.equals("ET")) {
                    b10 = 64;
                }
                break;
            case 2243:
                if (str.equals("FI")) {
                    b10 = 65;
                }
                break;
            case 2244:
                if (str.equals("FJ")) {
                    b10 = 66;
                }
                break;
            case 2245:
                if (str.equals("FK")) {
                    b10 = 67;
                }
                break;
            case 2247:
                if (str.equals("FM")) {
                    b10 = 68;
                }
                break;
            case 2249:
                if (str.equals("FO")) {
                    b10 = 69;
                }
                break;
            case 2252:
                if (str.equals("FR")) {
                    b10 = 70;
                }
                break;
            case 2266:
                if (str.equals("GA")) {
                    b10 = 71;
                }
                break;
            case 2267:
                if (str.equals("GB")) {
                    b10 = 72;
                }
                break;
            case 2269:
                if (str.equals("GD")) {
                    b10 = 73;
                }
                break;
            case 2270:
                if (str.equals("GE")) {
                    b10 = 74;
                }
                break;
            case 2271:
                if (str.equals("GF")) {
                    b10 = 75;
                }
                break;
            case 2272:
                if (str.equals("GG")) {
                    b10 = 76;
                }
                break;
            case 2273:
                if (str.equals("GH")) {
                    b10 = 77;
                }
                break;
            case 2274:
                if (str.equals("GI")) {
                    b10 = 78;
                }
                break;
            case 2277:
                if (str.equals("GL")) {
                    b10 = 79;
                }
                break;
            case 2278:
                if (str.equals("GM")) {
                    b10 = 80;
                }
                break;
            case 2279:
                if (str.equals("GN")) {
                    b10 = 81;
                }
                break;
            case 2281:
                if (str.equals("GP")) {
                    b10 = 82;
                }
                break;
            case 2282:
                if (str.equals("GQ")) {
                    b10 = 83;
                }
                break;
            case 2283:
                if (str.equals("GR")) {
                    b10 = 84;
                }
                break;
            case 2285:
                if (str.equals("GT")) {
                    b10 = 85;
                }
                break;
            case 2286:
                if (str.equals("GU")) {
                    b10 = 86;
                }
                break;
            case 2288:
                if (str.equals("GW")) {
                    b10 = 87;
                }
                break;
            case 2290:
                if (str.equals("GY")) {
                    b10 = 88;
                }
                break;
            case 2307:
                if (str.equals("HK")) {
                    b10 = 89;
                }
                break;
            case 2314:
                if (str.equals("HR")) {
                    b10 = 90;
                }
                break;
            case 2316:
                if (str.equals("HT")) {
                    b10 = 91;
                }
                break;
            case 2317:
                if (str.equals("HU")) {
                    b10 = 92;
                }
                break;
            case 2331:
                if (str.equals("ID")) {
                    b10 = 93;
                }
                break;
            case 2332:
                if (str.equals("IE")) {
                    b10 = 94;
                }
                break;
            case 2339:
                if (str.equals("IL")) {
                    b10 = 95;
                }
                break;
            case 2340:
                if (str.equals("IM")) {
                    b10 = 96;
                }
                break;
            case 2341:
                if (str.equals("IN")) {
                    b10 = 97;
                }
                break;
            case 2342:
                if (str.equals("IO")) {
                    b10 = 98;
                }
                break;
            case 2344:
                if (str.equals("IQ")) {
                    b10 = 99;
                }
                break;
            case 2345:
                if (str.equals("IR")) {
                    b10 = 100;
                }
                break;
            case 2346:
                if (str.equals(IronSourceConstants.INTERSTITIAL_EVENT_TYPE)) {
                    b10 = 101;
                }
                break;
            case 2347:
                if (str.equals("IT")) {
                    b10 = 102;
                }
                break;
            case 2363:
                if (str.equals("JE")) {
                    b10 = 103;
                }
                break;
            case 2371:
                if (str.equals("JM")) {
                    b10 = 104;
                }
                break;
            case 2373:
                if (str.equals("JO")) {
                    b10 = 105;
                }
                break;
            case 2374:
                if (str.equals("JP")) {
                    b10 = 106;
                }
                break;
            case 2394:
                if (str.equals("KE")) {
                    b10 = 107;
                }
                break;
            case 2396:
                if (str.equals("KG")) {
                    b10 = 108;
                }
                break;
            case 2397:
                if (str.equals("KH")) {
                    b10 = 109;
                }
                break;
            case 2398:
                if (str.equals("KI")) {
                    b10 = 110;
                }
                break;
            case 2402:
                if (str.equals("KM")) {
                    b10 = 111;
                }
                break;
            case 2403:
                if (str.equals("KN")) {
                    b10 = 112;
                }
                break;
            case 2405:
                if (str.equals("KP")) {
                    b10 = 113;
                }
                break;
            case 2407:
                if (str.equals("KR")) {
                    b10 = 114;
                }
                break;
            case 2412:
                if (str.equals("KW")) {
                    b10 = 115;
                }
                break;
            case 2414:
                if (str.equals("KY")) {
                    b10 = 116;
                }
                break;
            case 2415:
                if (str.equals("KZ")) {
                    b10 = 117;
                }
                break;
            case 2421:
                if (str.equals("LA")) {
                    b10 = 118;
                }
                break;
            case 2422:
                if (str.equals("LB")) {
                    b10 = 119;
                }
                break;
            case 2423:
                if (str.equals("LC")) {
                    b10 = 120;
                }
                break;
            case 2429:
                if (str.equals("LI")) {
                    b10 = 121;
                }
                break;
            case 2431:
                if (str.equals("LK")) {
                    b10 = 122;
                }
                break;
            case 2438:
                if (str.equals("LR")) {
                    b10 = 123;
                }
                break;
            case 2439:
                if (str.equals("LS")) {
                    b10 = 124;
                }
                break;
            case 2440:
                if (str.equals("LT")) {
                    b10 = 125;
                }
                break;
            case 2441:
                if (str.equals("LU")) {
                    b10 = 126;
                }
                break;
            case 2442:
                if (str.equals("LV")) {
                    b10 = 127;
                }
                break;
            case 2445:
                if (str.equals("LY")) {
                    b10 = 128;
                }
                break;
            case 2452:
                if (str.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_MA)) {
                    b10 = 129;
                }
                break;
            case 2454:
                if (str.equals("MC")) {
                    b10 = 130;
                }
                break;
            case 2455:
                if (str.equals("MD")) {
                    b10 = 131;
                }
                break;
            case 2456:
                if (str.equals("ME")) {
                    b10 = 132;
                }
                break;
            case 2457:
                if (str.equals("MF")) {
                    b10 = 133;
                }
                break;
            case 2458:
                if (str.equals("MG")) {
                    b10 = 134;
                }
                break;
            case 2459:
                if (str.equals("MH")) {
                    b10 = 135;
                }
                break;
            case 2462:
                if (str.equals("MK")) {
                    b10 = 136;
                }
                break;
            case 2463:
                if (str.equals("ML")) {
                    b10 = 137;
                }
                break;
            case 2464:
                if (str.equals("MM")) {
                    b10 = 138;
                }
                break;
            case 2465:
                if (str.equals("MN")) {
                    b10 = 139;
                }
                break;
            case 2466:
                if (str.equals("MO")) {
                    b10 = 140;
                }
                break;
            case 2467:
                if (str.equals("MP")) {
                    b10 = 141;
                }
                break;
            case 2468:
                if (str.equals("MQ")) {
                    b10 = 142;
                }
                break;
            case 2469:
                if (str.equals("MR")) {
                    b10 = 143;
                }
                break;
            case 2470:
                if (str.equals("MS")) {
                    b10 = 144;
                }
                break;
            case 2471:
                if (str.equals("MT")) {
                    b10 = 145;
                }
                break;
            case 2472:
                if (str.equals("MU")) {
                    b10 = 146;
                }
                break;
            case 2473:
                if (str.equals("MV")) {
                    b10 = 147;
                }
                break;
            case 2474:
                if (str.equals("MW")) {
                    b10 = 148;
                }
                break;
            case 2475:
                if (str.equals("MX")) {
                    b10 = 149;
                }
                break;
            case 2476:
                if (str.equals("MY")) {
                    b10 = 150;
                }
                break;
            case 2477:
                if (str.equals("MZ")) {
                    b10 = 151;
                }
                break;
            case 2483:
                if (str.equals("NA")) {
                    b10 = 152;
                }
                break;
            case 2485:
                if (str.equals("NC")) {
                    b10 = 153;
                }
                break;
            case 2487:
                if (str.equals("NE")) {
                    b10 = 154;
                }
                break;
            case 2489:
                if (str.equals("NG")) {
                    b10 = 155;
                }
                break;
            case 2491:
                if (str.equals("NI")) {
                    b10 = 156;
                }
                break;
            case 2494:
                if (str.equals("NL")) {
                    b10 = 157;
                }
                break;
            case 2497:
                if (str.equals("NO")) {
                    b10 = 158;
                }
                break;
            case 2498:
                if (str.equals("NP")) {
                    b10 = 159;
                }
                break;
            case 2500:
                if (str.equals("NR")) {
                    b10 = 160;
                }
                break;
            case I9.b.f26824e /* 2503 */:
                if (str.equals("NU")) {
                    b10 = 161;
                }
                break;
            case 2508:
                if (str.equals("NZ")) {
                    b10 = 162;
                }
                break;
            case 2526:
                if (str.equals("OM")) {
                    b10 = 163;
                }
                break;
            case 2545:
                if (str.equals("PA")) {
                    b10 = 164;
                }
                break;
            case 2549:
                if (str.equals("PE")) {
                    b10 = 165;
                }
                break;
            case 2550:
                if (str.equals("PF")) {
                    b10 = 166;
                }
                break;
            case 2551:
                if (str.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_PG)) {
                    b10 = 167;
                }
                break;
            case 2552:
                if (str.equals("PH")) {
                    b10 = 168;
                }
                break;
            case 2555:
                if (str.equals("PK")) {
                    b10 = 169;
                }
                break;
            case 2556:
                if (str.equals("PL")) {
                    b10 = 170;
                }
                break;
            case 2557:
                if (str.equals("PM")) {
                    b10 = 171;
                }
                break;
            case 2562:
                if (str.equals("PR")) {
                    b10 = 172;
                }
                break;
            case 2563:
                if (str.equals("PS")) {
                    b10 = 173;
                }
                break;
            case 2564:
                if (str.equals("PT")) {
                    b10 = 174;
                }
                break;
            case 2567:
                if (str.equals("PW")) {
                    b10 = 175;
                }
                break;
            case 2576:
                if (str.equals("QA")) {
                    b10 = 176;
                }
                break;
            case 2611:
                if (str.equals("RE")) {
                    b10 = 177;
                }
                break;
            case 2621:
                if (str.equals("RO")) {
                    b10 = 178;
                }
                break;
            case 2625:
                if (str.equals("RS")) {
                    b10 = 179;
                }
                break;
            case 2627:
                if (str.equals("RU")) {
                    b10 = 180;
                }
                break;
            case 2629:
                if (str.equals("RW")) {
                    b10 = 181;
                }
                break;
            case 2638:
                if (str.equals("SA")) {
                    b10 = 182;
                }
                break;
            case 2639:
                if (str.equals("SB")) {
                    b10 = 183;
                }
                break;
            case 2640:
                if (str.equals("SC")) {
                    b10 = 184;
                }
                break;
            case 2641:
                if (str.equals("SD")) {
                    b10 = 185;
                }
                break;
            case 2642:
                if (str.equals("SE")) {
                    b10 = 186;
                }
                break;
            case 2644:
                if (str.equals("SG")) {
                    b10 = 187;
                }
                break;
            case 2645:
                if (str.equals("SH")) {
                    b10 = 188;
                }
                break;
            case 2646:
                if (str.equals("SI")) {
                    b10 = 189;
                }
                break;
            case 2648:
                if (str.equals("SK")) {
                    b10 = 190;
                }
                break;
            case 2649:
                if (str.equals("SL")) {
                    b10 = 191;
                }
                break;
            case 2650:
                if (str.equals("SM")) {
                    b10 = 192;
                }
                break;
            case 2651:
                if (str.equals("SN")) {
                    b10 = 193;
                }
                break;
            case 2652:
                if (str.equals("SO")) {
                    b10 = 194;
                }
                break;
            case 2655:
                if (str.equals("SR")) {
                    b10 = 195;
                }
                break;
            case 2656:
                if (str.equals("SS")) {
                    b10 = 196;
                }
                break;
            case 2657:
                if (str.equals("ST")) {
                    b10 = 197;
                }
                break;
            case 2659:
                if (str.equals("SV")) {
                    b10 = 198;
                }
                break;
            case 2661:
                if (str.equals("SX")) {
                    b10 = 199;
                }
                break;
            case 2662:
                if (str.equals("SY")) {
                    b10 = 200;
                }
                break;
            case 2663:
                if (str.equals("SZ")) {
                    b10 = 201;
                }
                break;
            case 2671:
                if (str.equals("TC")) {
                    b10 = 202;
                }
                break;
            case 2672:
                if (str.equals("TD")) {
                    b10 = 203;
                }
                break;
            case 2675:
                if (str.equals("TG")) {
                    b10 = 204;
                }
                break;
            case 2676:
                if (str.equals("TH")) {
                    b10 = 205;
                }
                break;
            case 2678:
                if (str.equals("TJ")) {
                    b10 = 206;
                }
                break;
            case 2679:
                if (str.equals("TK")) {
                    b10 = 207;
                }
                break;
            case 2680:
                if (str.equals("TL")) {
                    b10 = 208;
                }
                break;
            case 2681:
                if (str.equals("TM")) {
                    b10 = 209;
                }
                break;
            case 2682:
                if (str.equals("TN")) {
                    b10 = 210;
                }
                break;
            case 2683:
                if (str.equals("TO")) {
                    b10 = 211;
                }
                break;
            case 2686:
                if (str.equals("TR")) {
                    b10 = 212;
                }
                break;
            case 2688:
                if (str.equals("TT")) {
                    b10 = 213;
                }
                break;
            case 2690:
                if (str.equals("TV")) {
                    b10 = 214;
                }
                break;
            case 2691:
                if (str.equals("TW")) {
                    b10 = 215;
                }
                break;
            case 2694:
                if (str.equals("TZ")) {
                    b10 = 216;
                }
                break;
            case 2700:
                if (str.equals("UA")) {
                    b10 = ExifInterface.MARKER_EOI;
                }
                break;
            case 2706:
                if (str.equals("UG")) {
                    b10 = 218;
                }
                break;
            case 2718:
                if (str.equals("US")) {
                    b10 = 219;
                }
                break;
            case 2724:
                if (str.equals("UY")) {
                    b10 = 220;
                }
                break;
            case 2725:
                if (str.equals("UZ")) {
                    b10 = 221;
                }
                break;
            case 2731:
                if (str.equals("VA")) {
                    b10 = 222;
                }
                break;
            case 2733:
                if (str.equals("VC")) {
                    b10 = 223;
                }
                break;
            case 2735:
                if (str.equals("VE")) {
                    b10 = 224;
                }
                break;
            case 2737:
                if (str.equals("VG")) {
                    b10 = ExifInterface.MARKER_APP1;
                }
                break;
            case 2739:
                if (str.equals("VI")) {
                    b10 = 226;
                }
                break;
            case 2744:
                if (str.equals("VN")) {
                    b10 = 227;
                }
                break;
            case 2751:
                if (str.equals("VU")) {
                    b10 = 228;
                }
                break;
            case 2767:
                if (str.equals("WF")) {
                    b10 = 229;
                }
                break;
            case 2780:
                if (str.equals("WS")) {
                    b10 = 230;
                }
                break;
            case 2803:
                if (str.equals("XK")) {
                    b10 = 231;
                }
                break;
            case 2828:
                if (str.equals("YE")) {
                    b10 = 232;
                }
                break;
            case 2843:
                if (str.equals("YT")) {
                    b10 = 233;
                }
                break;
            case 2855:
                if (str.equals("ZA")) {
                    b10 = 234;
                }
                break;
            case 2867:
                if (str.equals("ZM")) {
                    b10 = 235;
                }
                break;
            case 2877:
                if (str.equals("ZW")) {
                    b10 = 236;
                }
                break;
        }
        switch (b10) {
            case 0:
            case 26:
            case 29:
            case 73:
            case 79:
            case 112:
            case 116:
            case 120:
            case STALE_CACHED_RESPONSE_VALUE:
                return new int[]{1, 2, 0, 0, 2, 2};
            case 1:
                return new int[]{1, 4, 4, 4, 4, 0};
            case 2:
            case 80:
                return new int[]{4, 3, 3, 4, 2, 2};
            case 3:
                return new int[]{2, 4, 1, 2, 2, 2};
            case 4:
                return new int[]{0, 2, 0, 3, 2, 2};
            case 5:
            case 231:
                return new int[]{1, 1, 1, 1, 2, 2};
            case 6:
                return new int[]{2, 3, 2, 3, 2, 2};
            case 7:
                return new int[]{4, 4, 3, 2, 2, 2};
            case 8:
            case 62:
            case 188:
                return new int[]{4, 2, 2, 2, 2, 2};
            case 9:
            case 108:
            case 210:
            case AD_RESPONSE_RETRY_AFTER_VALUE:
                return new int[]{2, 1, 1, 1, 2, 2};
            case 10:
                return new int[]{2, 2, 3, 3, 2, 2};
            case 11:
                return new int[]{1, 0, 1, 1, 0, 0};
            case 12:
                return new int[]{0, 1, 1, 1, 2, 0};
            case 13:
                return new int[]{1, 3, 4, 4, 2, 2};
            case 14:
            case 121:
            case 144:
            case 171:
            case 192:
                return new int[]{0, 2, 2, 2, 2, 2};
            case 15:
            case 75:
            case 128:
            case 169:
            case 194:
            case LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE:
                return new int[]{3, 2, 3, 3, 2, 2};
            case 16:
                return new int[]{1, 2, 1, 1, 2, 2};
            case 17:
            case 56:
            case 69:
            case 78:
                return new int[]{0, 2, 0, 0, 2, 2};
            case 18:
                return new int[]{2, 1, 3, 3, 2, 2};
            case 19:
                return new int[]{0, 1, 4, 4, 3, 2};
            case 20:
                return new int[]{4, 3, 4, 3, 2, 2};
            case 21:
            case 145:
            case 190:
                return new int[]{0, 0, 0, 0, 1, 2};
            case 22:
                return new int[]{1, 2, 1, 3, 4, 2};
            case 23:
            case 91:
            case 111:
            case 134:
            case 154:
            case 185:
            case 203:
            case 224:
            case 232:
                return new int[]{4, 4, 4, 4, 2, 2};
            case 24:
                return new int[]{4, 4, 3, 3, 2, 2};
            case 25:
            case 50:
            case INVALID_WATERFALL_PLACEMENT_ID_VALUE:
                return new int[]{1, 2, 2, 2, 2, 2};
            case 27:
            case 49:
                return new int[]{2, 2, 0, 0, 2, 2};
            case 28:
                return new int[]{1, 2, 3, 2, 2, 2};
            case 30:
                return new int[]{4, 4, 2, 2, 2, 2};
            case 31:
                return new int[]{3, 1, 3, 2, 2, 2};
            case 32:
                return new int[]{3, 2, 1, 0, 2, 2};
            case 33:
                return new int[]{0, 1, 2, 3, 2, 2};
            case 34:
                return new int[]{2, 4, 2, 1, 2, 2};
            case 35:
                return new int[]{0, 2, 2, 2, 3, 2};
            case 36:
                return new int[]{4, 2, 3, 2, 2, 2};
            case 37:
            case 110:
                return new int[]{4, 2, 4, 2, 2, 2};
            case 38:
            case 61:
            case 87:
                return new int[]{3, 4, 3, 3, 2, 2};
            case 39:
                return new int[]{0, 0, 0, 1, 0, 2};
            case 40:
            case 58:
            case 123:
                return new int[]{3, 4, 4, 4, 2, 2};
            case 41:
            case 166:
                return new int[]{2, 2, 2, 1, 2, 2};
            case 42:
            case 95:
                return new int[]{1, 2, 2, 2, 3, 2};
            case 43:
                return new int[]{3, 3, 3, 3, 2, 2};
            case 44:
                return new int[]{2, 0, 1, 1, 3, 2};
            case 45:
                return new int[]{2, 3, 4, 3, 2, 2};
            case 46:
                return new int[]{2, 3, 4, 4, 2, 2};
            case 47:
            case 54:
            case 200:
            case 206:
            case 208:
                return new int[]{4, 3, 4, 4, 2, 2};
            case 48:
                return new int[]{2, 1, 0, 0, 2, 2};
            case 51:
            case 115:
                return new int[]{1, 0, 0, 0, 0, 2};
            case 52:
            case 158:
                return new int[]{0, 0, 2, 0, 1, 2};
            case 53:
                return new int[]{0, 1, 2, 2, 2, 3};
            case 55:
                return new int[]{0, 0, 3, 2, 0, 2};
            case 57:
                return new int[]{3, 4, 4, 4, 4, 2};
            case 59:
                return new int[]{2, 3, 2, 1, 2, 2};
            case 60:
            case 101:
            case 127:
            case 174:
            case 186:
            case AD_RESPONSE_EMPTY_VALUE:
                return new int[]{0, 0, 0, 0, 0, 2};
            case 63:
            case 94:
                return new int[]{0, 1, 1, 1, 2, 2};
            case 64:
                return new int[]{4, 3, 3, 1, 2, 2};
            case 65:
                return new int[]{0, 0, 0, 3, 0, 2};
            case 66:
                return new int[]{3, 1, 2, 2, 2, 2};
            case 67:
            case 107:
            case 113:
                return new int[]{3, 2, 2, 2, 2, 2};
            case 68:
                return new int[]{4, 2, 4, 1, 2, 2};
            case 70:
                return new int[]{1, 2, 3, 1, 0, 2};
            case 71:
            case 204:
                return new int[]{3, 4, 1, 0, 2, 2};
            case 72:
                return new int[]{0, 0, 1, 1, 1, 1};
            case 74:
                return new int[]{1, 1, 1, 2, 2, 2};
            case 76:
            case PRIVACY_ICON_FALLBACK_ERROR_VALUE:
                return new int[]{0, 2, 0, 1, 2, 2};
            case 77:
            case 152:
            case 228:
                return new int[]{3, 3, 3, 2, 2, 2};
            case 81:
                return new int[]{4, 3, 4, 2, 2, 2};
            case 82:
            case 142:
                return new int[]{2, 1, 2, 3, 2, 2};
            case 83:
                return new int[]{4, 2, 1, 4, 2, 2};
            case 84:
            case 90:
            case 189:
                return new int[]{1, 0, 0, 0, 1, 2};
            case 85:
                return new int[]{2, 3, 2, 2, 2, 2};
            case 86:
            case 165:
                return new int[]{1, 2, 4, 4, 4, 2};
            case 88:
                return new int[]{3, 2, 2, 1, 2, 2};
            case 89:
                return new int[]{0, 1, 2, 3, 2, 0};
            case 92:
                return new int[]{0, 0, 0, 1, 3, 2};
            case 93:
                return new int[]{3, 1, 2, 2, 3, 2};
            case 96:
            case AD_RESPONSE_TIMED_OUT_VALUE:
                return new int[]{0, 2, 1, 1, 2, 2};
            case 97:
                return new int[]{1, 1, 3, 2, 3, 3};
            case 98:
            case 135:
            case INVALID_GZIP_BID_PAYLOAD_VALUE:
            case 229:
                return new int[]{4, 2, 2, 4, 2, 2};
            case 99:
                return new int[]{3, 2, 2, 3, 2, 2};
            case 100:
                return new int[]{3, 0, 1, 1, 4, 1};
            case 102:
                return new int[]{0, 0, 0, 1, 1, 2};
            case 103:
            case 233:
                return new int[]{4, 2, 2, 3, 2, 2};
            case 104:
                return new int[]{2, 4, 3, 2, 2, 2};
            case 105:
                return new int[]{2, 1, 1, 2, 2, 2};
            case 106:
                return new int[]{0, 1, 1, 2, 2, 4};
            case 109:
                return new int[]{2, 1, 4, 2, 2, 2};
            case 114:
                return new int[]{0, 1, 1, 3, 4, 4};
            case 117:
                return new int[]{2, 1, 2, 2, 2, 2};
            case 118:
                return new int[]{1, 2, 1, 3, 2, 2};
            case 119:
                return new int[]{3, 3, 2, 4, 2, 2};
            case 122:
                return new int[]{3, 1, 3, 3, 4, 2};
            case 124:
                return new int[]{3, 3, 2, 2, 2, 2};
            case 125:
                return new int[]{0, 0, 0, 0, 2, 2};
            case 126:
                return new int[]{1, 0, 3, 2, 1, 4};
            case 129:
                return new int[]{3, 3, 1, 1, 2, 2};
            case 130:
                return new int[]{0, 2, 2, 0, 2, 2};
            case MRAID_JS_WRITE_FAILED_VALUE:
            case 179:
                return new int[]{1, 0, 0, 0, 2, 2};
            case OMSDK_DOWNLOAD_JS_ERROR_VALUE:
                return new int[]{2, 0, 0, 1, 2, 2};
            case OMSDK_JS_WRITE_FAILED_VALUE:
            case 177:
                return new int[]{1, 2, 1, 2, 2, 2};
            case 136:
                return new int[]{1, 0, 0, 1, 3, 2};
            case TPAT_RETRY_FAILED_VALUE:
            case 167:
                return new int[]{4, 3, 3, 2, 2, 2};
            case 138:
                return new int[]{2, 4, 2, 3, 2, 2};
            case 139:
                return new int[]{2, 0, 1, 2, 2, 2};
            case 140:
            case 141:
                return new int[]{0, 2, 4, 4, 2, 2};
            case 143:
            case 236:
                return new int[]{4, 2, 4, 4, 2, 2};
            case 146:
                return new int[]{3, 1, 1, 2, 2, 2};
            case 147:
                return new int[]{3, 4, 1, 4, 2, 2};
            case 148:
                return new int[]{4, 2, 3, 3, 2, 2};
            case 149:
                return new int[]{2, 4, 3, 4, 2, 2};
            case 150:
                return new int[]{1, 0, 3, 1, 3, 2};
            case 151:
                return new int[]{3, 1, 2, 1, 2, 2};
            case 153:
                return new int[]{3, 3, 4, 4, 2, 2};
            case 155:
                return new int[]{3, 4, 2, 1, 2, 2};
            case 156:
            case 164:
            case 198:
                return new int[]{2, 3, 3, 3, 2, 2};
            case 157:
                return new int[]{0, 2, 2, 3, 0, 3};
            case 159:
                return new int[]{2, 2, 4, 3, 2, 2};
            case 160:
            case 161:
                return new int[]{4, 2, 2, 1, 2, 2};
            case 162:
            case 170:
                return new int[]{1, 1, 2, 2, 4, 2};
            case 163:
                return new int[]{2, 3, 1, 3, 4, 2};
            case 168:
                return new int[]{2, 1, 3, 3, 3, 0};
            case 172:
                return new int[]{2, 0, 2, 1, 2, 1};
            case TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173 /* 173 */:
                return new int[]{3, 4, 1, 2, 2, 2};
            case HideBottomViewOnScrollBehavior.EXIT_ANIMATION_DURATION /* 175 */:
                return new int[]{2, 2, 4, 1, 2, 2};
            case 176:
                return new int[]{2, 4, 4, 4, 4, 2};
            case 178:
                return new int[]{0, 0, 1, 2, 1, 2};
            case BaseTransientBottomBar.ANIMATION_FADE_DURATION /* 180 */:
                return new int[]{1, 0, 0, 0, 4, 3};
            case 181:
                return new int[]{3, 4, 2, 0, 2, 2};
            case 182:
                return new int[]{3, 1, 1, 1, 2, 2};
            case 183:
                return new int[]{4, 2, 4, 3, 2, 2};
            case 184:
            case 209:
                return new int[]{4, 2, 1, 1, 2, 2};
            case 187:
                return new int[]{1, 1, 2, 2, 2, 1};
            case 191:
            case MRAID_JS_DOES_NOT_EXIST_VALUE:
                return new int[]{3, 3, 4, 3, 2, 2};
            case 193:
                return new int[]{4, 4, 4, 3, 2, 2};
            case 195:
                return new int[]{2, 4, 3, 0, 2, 2};
            case 196:
                return new int[]{4, 3, 2, 3, 2, 2};
            case 197:
                return new int[]{2, 2, 1, 2, 2, 2};
            case 199:
            case 202:
                return new int[]{1, 2, 1, 0, 2, 2};
            case 201:
                return new int[]{3, 3, 3, 4, 2, 2};
            case 205:
                return new int[]{0, 2, 2, 3, 3, 4};
            case 207:
                return new int[]{2, 2, 2, 4, 2, 2};
            case 212:
                return new int[]{1, 1, 0, 0, 2, 2};
            case INVALID_ADUNIT_BID_PAYLOAD_VALUE:
                return new int[]{1, 4, 1, 3, 2, 2};
            case AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE:
                return new int[]{3, 4, 3, 2, 2, 2};
            case MRAID_JS_COPY_FAILED_VALUE:
                return new int[]{1, 0, 2, 2, 3, 1};
            case AD_LOAD_FAIL_RETRY_AFTER_VALUE:
                return new int[]{2, 2, 3, 4, 2, 2};
            case 225:
                return new int[]{2, 2, 1, 1, 2, 2};
            case 227:
                return new int[]{0, 3, 3, 4, 2, 2};
            case 230:
                return new int[]{3, 1, 3, 1, 2, 2};
            case 234:
                return new int[]{3, 2, 2, 1, 1, 2};
            case 235:
                return new int[]{3, 3, 4, 2, 2, 2};
            default:
                return new int[]{2, 2, 2, 2, 2, 2};
        }
    }

    public final long a(int i10) {
        Long l10 = (Long) this.f76618a.get(Integer.valueOf(i10));
        if (l10 == null) {
            l10 = (Long) this.f76618a.get(0);
        }
        if (l10 == null) {
            l10 = 1000000L;
        }
        return l10.longValue();
    }
}
