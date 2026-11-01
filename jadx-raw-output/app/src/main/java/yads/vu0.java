package yads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import android.net.Uri;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import android.telephony.gsm.GsmCellLocation;
import androidx.exifinterface.media.ExifInterface;
import com.applovin.sdk.AppLovinEventTypes;
import com.ironsource.C3426d4;
import com.ironsource.Z7;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class vu0 {
    /* JADX WARN: Code duplicated, block: B:102:0x0235  */
    /* JADX WARN: Code duplicated, block: B:105:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:106:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:109:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:110:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:113:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:114:0x0301  */
    /* JADX WARN: Code duplicated, block: B:121:0x0372  */
    /* JADX WARN: Code duplicated, block: B:124:0x0380  */
    /* JADX WARN: Code duplicated, block: B:125:0x0383  */
    /* JADX WARN: Code duplicated, block: B:127:0x0386  */
    /* JADX WARN: Code duplicated, block: B:130:0x039e  */
    /* JADX WARN: Code duplicated, block: B:134:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:142:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:148:0x0403  */
    /* JADX WARN: Code duplicated, block: B:154:0x042e A[LOOP:3: B:152:0x0428->B:154:0x042e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:175:0x0359 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x03f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:? A[LOOP:1: B:140:0x03e0->B:191:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x0415 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x03fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:89:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ce  */
    public static uu0 a(Context context, ox2 ox2Var, qx qxVar, sp2 sp2Var, pa2 pa2Var) {
        String libraryVersion;
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        String string;
        bh1 bh1VarA;
        Location locationA;
        Integer numR;
        Integer numR2;
        String networkOperatorName;
        uu0 uu0VarA;
        List list;
        String strP0;
        String str;
        String str2;
        zw zwVar;
        nt2 nt2VarA;
        nt2 nt2VarA2;
        Map map;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Iterator it;
        List list2;
        Iterator it2;
        jm0 jm0Var = qxVar.f82016a;
        rd rdVar = qxVar.f82017b;
        uu0 uu0Var = new uu0(ox2Var.b(context));
        uu0Var.f83642n0 = context.getPackageName();
        uu0Var.f83644o0 = og.a(context);
        uu0Var.f83646p0 = og.b(context);
        uu0Var.f83619c.getClass();
        pg.a(context);
        try {
            libraryVersion = AppMetrica.getLibraryVersion();
        } catch (Throwable unused) {
            boolean z10 = ad1.f75480a;
            libraryVersion = null;
        }
        uu0Var.C0 = libraryVersion;
        td tdVar = rdVar.f82195a;
        boolean z11 = rdVar.f82197c;
        if (tdVar != null) {
            uu0Var.N = Boolean.valueOf(tdVar.f82967b);
            uu0Var.O = Boolean.valueOf(z11);
            String str3 = tdVar.f82966a;
            uu0Var.f83623e.getClass();
            boolean z12 = (str3 == null || str3.length() == 0 || ck.p.e("00000000-0000-0000-0000-000000000000", str3)) ? false : true;
            if (!uu0Var.f83615a && ck.p.e(uu0Var.N, Boolean.FALSE) && z12) {
                uu0Var.P = str3;
            }
        }
        String str4 = rdVar.f82198d;
        if (str4 != null && !lk.a0.n0(str4)) {
            uu0Var.f83637l = str4;
        }
        td tdVar2 = rdVar.f82196b;
        if (tdVar2 != null) {
            uu0Var.Q = Boolean.valueOf(tdVar2.f82967b);
            String str5 = tdVar2.f82966a;
            uu0Var.f83623e.getClass();
            boolean z13 = (str5 == null || str5.length() == 0 || ck.p.e("00000000-0000-0000-0000-000000000000", str5)) ? false : true;
            if (!uu0Var.f83615a && ck.p.e(uu0Var.Q, Boolean.FALSE) && z13) {
                uu0Var.R = str5;
            }
        }
        try {
            Intent intentRegisterReceiver = context.getApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                int intExtra = intentRegisterReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
                int intExtra2 = intentRegisterReceiver.getIntExtra("scale", -1);
                if (intExtra <= -1 || intExtra2 <= 0) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(ek.b.c((intExtra / intExtra2) * 100));
                }
            } else {
                numValueOf = null;
            }
        } catch (Exception unused2) {
            boolean z14 = ad1.f75480a;
        }
        uu0Var.S = numValueOf;
        uu0Var.Z = "UTF-8";
        try {
            Object systemService = context.getSystemService("phone");
            ck.p.h(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            CellLocation cellLocation = ((TelephonyManager) systemService).getCellLocation();
            ck.p.h(cellLocation, "null cannot be cast to non-null type android.telephony.gsm.GsmCellLocation");
            int cid = ((GsmCellLocation) cellLocation).getCid();
            numValueOf2 = -1 != cid ? Integer.valueOf(cid & 65535) : null;
        } catch (Exception unused3) {
        }
        uu0Var.K = numValueOf2;
        try {
            Object systemService2 = context.getSystemService("phone");
            ck.p.h(systemService2, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            CellLocation cellLocation2 = ((TelephonyManager) systemService2).getCellLocation();
            ck.p.h(cellLocation2, "null cannot be cast to non-null type android.telephony.gsm.GsmCellLocation");
            int lac = ((GsmCellLocation) cellLocation2).getLac();
            numValueOf3 = -1 != lac ? Integer.valueOf(lac & 65535) : null;
        } catch (Exception unused4) {
        }
        uu0Var.L = numValueOf3;
        try {
            Object systemService3 = context.getApplicationContext().getSystemService("wifi");
            ck.p.h(systemService3, "null cannot be cast to non-null type android.net.wifi.WifiManager");
            WifiManager wifiManager = (WifiManager) systemService3;
            try {
                try {
                    try {
                        if (wifiManager.isWifiEnabled()) {
                            List<ScanResult> scanResults = wifiManager.getScanResults();
                            if (scanResults == null) {
                                scanResults = nj.s.k();
                            }
                            List listH0 = nj.b0.H0(scanResults, new xc2());
                            if (!listH0.isEmpty()) {
                                StringBuilder sb2 = new StringBuilder();
                                int iMin = Math.min(3, listH0.size());
                                int i10 = 0;
                                while (i10 < iMin) {
                                    sb2.append(((ScanResult) listH0.get(i10)).BSSID);
                                    sb2.append(StringUtils.COMMA);
                                    sb2.append(((ScanResult) listH0.get(i10)).level);
                                    i10++;
                                    sb2.append(i10 < iMin ? ";" : "");
                                }
                                string = sb2.toString();
                            }
                            uu0Var.M = string;
                            Object obj = bh1.f75822f;
                            bh1VarA = ah1.a(context);
                            if (uu0Var.f83615a) {
                                locationA = null;
                            } else {
                                locationA = bh1VarA.a();
                            }
                            uu0Var.B = locationA;
                            Object systemService4 = context.getSystemService("phone");
                            ck.p.h(systemService4, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                            String strSubstring = ((TelephonyManager) systemService4).getNetworkOperator().substring(0, 3);
                            ck.p.i(strSubstring, "substring(...)");
                            numR = lk.w.r(strSubstring);
                            uu0Var.F = numR;
                            Object systemService5 = context.getSystemService("phone");
                            ck.p.h(systemService5, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                            String strSubstring2 = ((TelephonyManager) systemService5).getNetworkOperator().substring(3);
                            ck.p.i(strSubstring2, "substring(...)");
                            numR2 = lk.w.r(strSubstring2);
                            uu0Var.G = numR2;
                            uu0Var.H = yc2.a(context);
                            Object systemService6 = context.getSystemService("phone");
                            ck.p.h(systemService6, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                            networkOperatorName = ((TelephonyManager) systemService6).getNetworkOperatorName();
                            if (networkOperatorName.length() == 0) {
                                networkOperatorName = null;
                            }
                            uu0Var.I = networkOperatorName;
                            uu0Var.C = Integer.valueOf(kl3.d(context));
                            uu0Var.D = Integer.valueOf(kl3.b(context));
                            uu0Var.E = Float.valueOf(context.getResources().getDisplayMetrics().density);
                            uu0Var.f83650r0 = kl3.a(context);
                            vg0 vg0VarB = vo3.b(context);
                            uu0Var.f83652s0 = vg0VarB.f83904a;
                            uu0Var.f83654t0 = vg0VarB.f83905b;
                            uu0Var.f83656u0 = vg0VarB.f83906c;
                            uu0Var.f83658v0 = vg0VarB.f83907d;
                            uu0Var.f83660w0 = vg0VarB.f83908e;
                            uu0Var.f83662x0 = vg0VarB.f83909f;
                            uu0Var.A0 = uu0Var.f83621d.a("%d.%d%d");
                            uu0Var.B0 = uu0Var.f83621d.a("%d.%d.%d");
                            uu0Var.f83627g = ox2.a(context);
                            uu0Var.Y = Long.valueOf(tb.f82949a);
                            jm0Var.getClass();
                            uu0Var.f83616a0 = null;
                            uu0VarA = uu0Var.a(context, jm0Var.f79096a);
                            uu0VarA.f83655u = jm0Var.b();
                            uu0VarA.f83639m = jm0Var.f79099d;
                            list = qxVar.f82018c;
                            if (list != null) {
                                strP0 = nj.b0.p0(list, StringUtils.COMMA, null, null, 0, null, null, 62, null);
                            } else {
                                strP0 = null;
                            }
                            uu0VarA.W = strP0;
                            if (new z20(context).a()) {
                                gp2 gp2Var = gp2.f77901c;
                                str = "dark";
                            } else {
                                gp2 gp2Var2 = gp2.f77901c;
                                str = "light";
                            }
                            uu0VarA.E0 = str;
                            Object obj2 = dw2.f76819j;
                            uu0VarA.f83633j = cw2.a().d();
                            sp2Var.getClass();
                            if (1 == context.getResources().getConfiguration().orientation) {
                                str2 = C3426d4.i.D;
                            } else {
                                str2 = C3426d4.i.C;
                            }
                            uu0VarA.A = str2;
                            uu0VarA.f83635k = cw2.a().b();
                            xw.f84720a.getClass();
                            uu0VarA.f83645p = ((zw) ww.a(context)).c();
                            uu0VarA.f83647q = ((zw) ww.a(context)).b();
                            uu0VarA.f83643o = ((zw) ww.a(context)).a();
                            uu0VarA.f83649r = ((zw) ww.a(context)).d();
                            uu0VarA.f83651s = ((zw) ww.a(context)).e();
                            zwVar = (zw) ww.a(context);
                            synchronized (zw.f85621j) {
                                String str6 = zwVar.f85629i;
                            }
                            uu0VarA.f83653t = str6;
                            uu0VarA.G0 = Boolean.valueOf(tb.a(context));
                            nt2VarA = cw2.a().a(context);
                            if (nt2VarA != null) {
                                uu0VarA.H0 = nt2VarA.f80758b0;
                            }
                            nt2VarA2 = cw2.a().a(context);
                            if (nt2VarA2 != null) {
                                map = nt2VarA2.f80760c0;
                            } else {
                                map = null;
                            }
                            if (map != null) {
                                uu0VarA.I0 = map;
                            }
                            uu0VarA.O0 = Boolean.valueOf(jm0Var.f79101f);
                            boolean zA = ((tg1) pa2Var.f81331a).a("OPT_OUT_ENABLED", false);
                            uu0VarA.P0 = zA ? Boolean.valueOf(zA) : null;
                            uu0VarA.Q0 = yc2.c(context);
                            or1 or1Var = new or1();
                            String str7 = pq1.f81538d;
                            ArrayList arrayListA = or1Var.a(mq1.a());
                            arrayList = new ArrayList();
                            for (Object obj3 : arrayListA) {
                                list2 = ((br1) obj3).f75937d;
                                if ((list2 instanceof Collection) || !list2.isEmpty()) {
                                    it2 = list2.iterator();
                                    while (it2.hasNext()) {
                                        if (((ar1) it2.next()).f75610c) {
                                            arrayList.add(obj3);
                                            break;
                                        }
                                    }
                                }
                            }
                            arrayList2 = new ArrayList();
                            for (Object obj4 : arrayList) {
                                if (!ck.p.e(((br1) obj4).f75935b, "undefined")) {
                                    arrayList2.add(obj4);
                                }
                            }
                            arrayList3 = new ArrayList(nj.t.v(arrayList2, 10));
                            it = arrayList2.iterator();
                            while (it.hasNext()) {
                                arrayList3.add(((br1) it.next()).f75935b);
                            }
                            cl.a.C0024a c0024a = cl.a.f6073d;
                            c0024a.a();
                            uu0VarA.f83624e0 = c0024a.c(new bl.f(bl.d2.f5397a), arrayList3);
                            return uu0VarA;
                        }
                        Object systemService7 = context.getSystemService("phone");
                        ck.p.h(systemService7, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                        String strSubstring3 = ((TelephonyManager) systemService7).getNetworkOperator().substring(0, 3);
                        ck.p.i(strSubstring3, "substring(...)");
                        numR = lk.w.r(strSubstring3);
                    } catch (Exception unused5) {
                        numR = null;
                    }
                    Object systemService8 = context.getSystemService("phone");
                    ck.p.h(systemService8, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                    String strSubstring4 = ((TelephonyManager) systemService8).getNetworkOperator().substring(3);
                    ck.p.i(strSubstring4, "substring(...)");
                    numR2 = lk.w.r(strSubstring4);
                } catch (Exception unused6) {
                    numR2 = null;
                }
                Object systemService9 = context.getSystemService("phone");
                ck.p.h(systemService9, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                networkOperatorName = ((TelephonyManager) systemService9).getNetworkOperatorName();
                if (networkOperatorName.length() == 0) {
                    networkOperatorName = null;
                }
            } catch (Exception unused7) {
            }
        } catch (Exception unused8) {
        }
        string = null;
        uu0Var.M = string;
        Object obj5 = bh1.f75822f;
        bh1VarA = ah1.a(context);
        if (uu0Var.f83615a) {
            locationA = null;
        } else {
            locationA = bh1VarA.a();
        }
        uu0Var.B = locationA;
        uu0Var.F = numR;
        uu0Var.G = numR2;
        uu0Var.H = yc2.a(context);
        uu0Var.I = networkOperatorName;
        uu0Var.C = Integer.valueOf(kl3.d(context));
        uu0Var.D = Integer.valueOf(kl3.b(context));
        uu0Var.E = Float.valueOf(context.getResources().getDisplayMetrics().density);
        uu0Var.f83650r0 = kl3.a(context);
        vg0 vg0VarB2 = vo3.b(context);
        uu0Var.f83652s0 = vg0VarB2.f83904a;
        uu0Var.f83654t0 = vg0VarB2.f83905b;
        uu0Var.f83656u0 = vg0VarB2.f83906c;
        uu0Var.f83658v0 = vg0VarB2.f83907d;
        uu0Var.f83660w0 = vg0VarB2.f83908e;
        uu0Var.f83662x0 = vg0VarB2.f83909f;
        uu0Var.A0 = uu0Var.f83621d.a("%d.%d%d");
        uu0Var.B0 = uu0Var.f83621d.a("%d.%d.%d");
        uu0Var.f83627g = ox2.a(context);
        uu0Var.Y = Long.valueOf(tb.f82949a);
        jm0Var.getClass();
        uu0Var.f83616a0 = null;
        uu0VarA = uu0Var.a(context, jm0Var.f79096a);
        uu0VarA.f83655u = jm0Var.b();
        uu0VarA.f83639m = jm0Var.f79099d;
        list = qxVar.f82018c;
        if (list != null) {
            strP0 = nj.b0.p0(list, StringUtils.COMMA, null, null, 0, null, null, 62, null);
        } else {
            strP0 = null;
        }
        uu0VarA.W = strP0;
        if (new z20(context).a()) {
            gp2 gp2Var3 = gp2.f77901c;
            str = "dark";
        } else {
            gp2 gp2Var4 = gp2.f77901c;
            str = "light";
        }
        uu0VarA.E0 = str;
        Object obj6 = dw2.f76819j;
        uu0VarA.f83633j = cw2.a().d();
        sp2Var.getClass();
        if (1 == context.getResources().getConfiguration().orientation) {
            str2 = C3426d4.i.D;
        } else {
            str2 = C3426d4.i.C;
        }
        uu0VarA.A = str2;
        uu0VarA.f83635k = cw2.a().b();
        xw.f84720a.getClass();
        uu0VarA.f83645p = ((zw) ww.a(context)).c();
        uu0VarA.f83647q = ((zw) ww.a(context)).b();
        uu0VarA.f83643o = ((zw) ww.a(context)).a();
        uu0VarA.f83649r = ((zw) ww.a(context)).d();
        uu0VarA.f83651s = ((zw) ww.a(context)).e();
        zwVar = (zw) ww.a(context);
        synchronized (zw.f85621j) {
            String str8 = zwVar.f85629i;
            uu0VarA.f83653t = str8;
            uu0VarA.G0 = Boolean.valueOf(tb.a(context));
            nt2VarA = cw2.a().a(context);
            if (nt2VarA != null) {
                uu0VarA.H0 = nt2VarA.f80758b0;
            }
            nt2VarA2 = cw2.a().a(context);
            if (nt2VarA2 != null) {
                map = nt2VarA2.f80760c0;
            } else {
                map = null;
            }
            if (map != null) {
                uu0VarA.I0 = map;
            }
            uu0VarA.O0 = Boolean.valueOf(jm0Var.f79101f);
            boolean zA2 = ((tg1) pa2Var.f81331a).a("OPT_OUT_ENABLED", false);
            uu0VarA.P0 = zA2 ? Boolean.valueOf(zA2) : null;
            uu0VarA.Q0 = yc2.c(context);
            or1 or1Var2 = new or1();
            String str9 = pq1.f81538d;
            ArrayList arrayListA2 = or1Var2.a(mq1.a());
            arrayList = new ArrayList();
            while (r0.hasNext()) {
                list2 = ((br1) obj3).f75937d;
                if (list2 instanceof Collection) {
                }
                it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (((ar1) it2.next()).f75610c) {
                        arrayList.add(obj3);
                        break;
                        break;
                    }
                }
            }
            arrayList2 = new ArrayList();
            while (r1.hasNext()) {
                if (!ck.p.e(((br1) obj4).f75935b, "undefined")) {
                    arrayList2.add(obj4);
                }
            }
            arrayList3 = new ArrayList(nj.t.v(arrayList2, 10));
            it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((br1) it.next()).f75935b);
            }
            cl.a.C0024a c0024a2 = cl.a.f6073d;
            c0024a2.a();
            uu0VarA.f83624e0 = c0024a2.c(new bl.f(bl.d2.f5397a), arrayList3);
            return uu0VarA;
        }
    }

    public static uu0 a(Context context, d4 d4Var, ox2 ox2Var) {
        String string;
        String strDecode;
        String strDecode2;
        uu0 uu0VarA = a(context, ox2Var, d4Var.f76560b, new sp2(), new pa2(ug1.a(context)));
        g9 g9Var = d4Var.f76563e;
        if (g9Var != null) {
            uu0VarA.J = uu0VarA.f83615a ? null : g9Var;
            String str = g9Var.f77699d;
            if (str == null || str.length() == 0) {
                strDecode = null;
            } else {
                String strEncode = Uri.encode(str);
                if (strEncode != null && strEncode.length() > 1024) {
                    bv1 bv1Var = fl2.f77435a;
                    fl2.a("Exceeded the length of the parameter! The maximum size of the parameter is %s bytes. First %s bytes of the parameter will be used", 1024, 1024);
                    String strEncode2 = Uri.encode(Z7.f27998r);
                    String strSubstring = strEncode.substring(0, 1024);
                    ck.p.i(strSubstring, "substring(...)");
                    boolean zQ = lk.x.Q(strEncode, strEncode2, 1024, false, 4, null);
                    int iR0 = lk.a0.r0(strSubstring, strEncode2, 0, false, 6, null);
                    if (zQ || iR0 < 0) {
                        strEncode = strSubstring;
                    } else {
                        strEncode = strSubstring.substring(0, iR0);
                        ck.p.i(strEncode, "substring(...)");
                    }
                }
                strDecode = Uri.decode(strEncode);
            }
            uu0VarA.U = strDecode;
            List<String> list = g9Var.f77700e;
            String string2 = "";
            if (list != null) {
                StringBuilder sb2 = new StringBuilder();
                for (String str2 : list) {
                    sb2.append(string2);
                    sb2.append(str2);
                    sb2.append("\n");
                    string2 = ExifInterface.GPS_MEASUREMENT_3D;
                }
                string2 = sb2.toString();
                ck.p.i(string2, "toString(...)");
            }
            if (string2.length() == 0) {
                strDecode2 = null;
            } else {
                String strEncode3 = Uri.encode(string2);
                if (strEncode3 != null && strEncode3.length() > 2048) {
                    bv1 bv1Var2 = fl2.f77435a;
                    fl2.a("Exceeded the length of the parameter! The maximum size of the parameter is %s bytes. First %s bytes of the parameter will be used", 2048, 2048);
                    String strEncode4 = Uri.encode("\n");
                    strEncode3 = strEncode3.substring(0, 2048);
                    ck.p.i(strEncode3, "substring(...)");
                    int iR1 = lk.a0.r0(strEncode3, strEncode4, 0, false, 6, null);
                    if (!lk.x.D(strEncode3, strEncode4, false, 2, null) && iR1 >= 0) {
                        strEncode3 = strEncode3.substring(0, iR1);
                        ck.p.i(strEncode3, "substring(...)");
                    }
                }
                strDecode2 = Uri.decode(strEncode3);
            }
            uu0VarA.V = strDecode2;
            uu0VarA.f83664y0 = m9.a(g9Var.f77697b);
            uu0VarA.f83666z0 = m9.a(g9Var.f77698c);
            uu0VarA.f83618b0 = g9Var.f77703h;
            gp2 gp2Var = g9Var.f77705j;
            if (gp2Var != null) {
                uu0VarA.D0 = m9.a(gp2Var.f77904b);
            }
            HashMap mapA = m9.a(g9Var.f77702g);
            if (mapA != null) {
                uu0VarA.f83629h.putAll(mapA);
            }
        }
        e00 e00Var = d4Var.f76559a;
        if (e00Var != null) {
            uu0VarA.f83659w = e00Var.f76868b;
        }
        uu0VarA.f83641n = d4Var.f76568j;
        uu0VarA.f83657v = d4Var.f76561c.f78158a;
        v42 v42Var = d4Var.f76564f;
        if (v42Var != null) {
            uu0VarA.X = v42Var.f83741b;
        }
        a03 a03Var = d4Var.f76562d.f75685a;
        if (a03Var != null) {
            uu0VarA.f83665z = a03Var.b().f85668b;
            uu0VarA.f83661x = Integer.valueOf(a03Var.c(context));
            uu0VarA.f83663y = Integer.valueOf(a03Var.a(context));
        }
        uu0VarA.f83620c0 = d4Var.f76566h;
        uu0VarA.f83622d0 = d4Var.f76567i;
        int i10 = d4Var.f76572n;
        uu0VarA.A = 1 == i10 ? C3426d4.i.D : C3426d4.i.C;
        String str3 = d4Var.f76561c.f78158a;
        if (str3 != null && (string = oy2.a(new oy2(), context, "ViewSizeInfoStorage").getString(el3.a(new fl3(i10, str3)), null)) != null) {
            uu0VarA.F0 = string;
        }
        return uu0VarA;
    }
}
