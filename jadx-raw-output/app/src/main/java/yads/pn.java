package yads;

import android.content.Context;
import android.net.Uri;
import com.ironsource.C3426d4;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Result;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public abstract class pn extends v73 {
    public final d4 C;
    public final String D;
    public final u02 E;
    public final ey2 F;
    public final ay2 G;
    public final b5 H;
    public final o9 I;
    public final Context J;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ pn(Context context, d4 d4Var, at1 at1Var, String str, String str2, u02 u02Var, uo2 uo2Var, oo ooVar, fp2 fp2Var, ey2 ey2Var, int i10) {
        ey2 ey2VarA;
        if ((i10 & 512) != 0) {
            ey2.f77227a.getClass();
            ey2VarA = dy2.a(context);
        } else {
            ey2VarA = ey2Var;
        }
        this(context, d4Var, at1Var, str, str2, u02Var, uo2Var, ooVar, fp2Var, ey2VarA, new ay2(ey2VarA), new b5(), new o9());
    }

    @Override // yads.v73, yads.po, yads.po2
    public final im3 a(im3 im3Var) {
        boolean z10 = ad1.f75480a;
        int i10 = h4.f78053d;
        return super.a((im3) g4.a(im3Var.f78724b));
    }

    @Override // yads.po2
    public final byte[] b() {
        if (1 == e()) {
            try {
                String str = this.D;
                Charset charsetForName = Charset.forName("UTF-8");
                ck.p.i(charsetForName, "forName(...)");
                byte[] bytes = str.getBytes(charsetForName);
                ck.p.i(bytes, "getBytes(...)");
                return bytes;
            } catch (UnsupportedEncodingException unused) {
                boolean z10 = ad1.f75480a;
            }
        }
        return null;
    }

    @Override // yads.po2
    public final String g() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f81489c == 0) {
            sb2.append(this.D);
        }
        List list = this.C.f76560b.f82016a.f79097b;
        if (sb2.length() > 0 && (!list.isEmpty())) {
            sb2.append(C3426d4.j.f28584c);
        }
        sb2.append(nj.b0.p0(list, C3426d4.j.f28584c, null, null, 0, null, on.f81109b, 30, null));
        return Uri.parse(this.f81490d).buildUpon().encodedQuery(sb2.toString()).build().toString();
    }

    @Override // yads.v73, yads.po2
    public Map d() {
        Map mapD = nj.l0.d();
        String strA = ((fy2) this.F).a();
        if (strA != null) {
            boolean z10 = ad1.f75480a;
        }
        mapD.put(u11.F.a(), this.H.b(this.J));
        mapD.put(u11.G.a(), this.H.a(this.J));
        mapD.putAll(this.C.c().a());
        return nj.l0.c(mapD);
    }

    @Override // yads.v73
    public final vp2 a(e82 e82Var, int i10) {
        Object objM3458constructorimpl;
        Map map;
        Integer numValueOf;
        Integer numValueOf2;
        Locale locale;
        Object objA;
        Integer numValueOf3;
        String strA;
        if (b(e82Var, i10)) {
            Map mapJ = e82Var.f76978c;
            if (mapJ == null) {
                mapJ = kotlin.collections.a.j();
            }
            Map map2 = mapJ;
            String strC = t01.c(map2, u11.R);
            if (strC != null) {
                tx2 tx2Var = ux2.f83685a;
                Context context = this.f81479s;
                tx2Var.getClass();
                ((tg1) ((vx2) tx2.a(context)).f84040b).a("ServerSideClientIP", strC);
            }
            if (204 != i10) {
                String strC2 = t01.c(map2, u11.f83302e);
                if (strC2 == null) {
                    strC2 = "";
                }
                e00.f76858c.getClass();
                e00 e00VarA = d00.a(strC2);
                d4 d4Var = this.C;
                if (e00VarA == d4Var.f76559a) {
                    i82 i82Var = new i82(d4Var, new yp2(this.E.f83286a), new iq1(), new rq2(), new tz(), new g11(), new xg1(), new bf(), new w9());
                    this.G.a(map2);
                    int i11 = e82Var.f76976a;
                    xp2 xp2Var = new xp2(e82Var.f76977b);
                    Map mapJ2 = e82Var.f76978c;
                    if (mapJ2 == null) {
                        mapJ2 = kotlin.collections.a.j();
                    }
                    wp2 wp2Var = new wp2(i11, xp2Var, mapJ2);
                    int iD = t01.d(map2, u11.f83300c);
                    int iD2 = t01.d(map2, u11.f83301d);
                    String strC3 = t01.c(map2, u11.I);
                    String strC4 = t01.c(map2, u11.J);
                    String strC5 = t01.c(map2, u11.f83303f);
                    String strC6 = t01.c(map2, u11.L);
                    if (strC6 != null) {
                        try {
                            Result.a aVar = Result.Companion;
                            JSONObject jSONObject = new JSONObject(strC6);
                            kk.i iVarG = kk.r.g(jSONObject.keys());
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (Object obj : iVarG) {
                                linkedHashMap.put(obj, jSONObject.get((String) obj));
                            }
                            objM3458constructorimpl = Result.m3458constructorimpl(linkedHashMap);
                        } catch (Throwable th2) {
                            Result.a aVar2 = Result.Companion;
                            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
                        }
                        if (Result.m3463isFailureimpl(objM3458constructorimpl)) {
                            objM3458constructorimpl = null;
                        }
                        Map mapJ3 = (Map) objM3458constructorimpl;
                        if (mapJ3 == null) {
                            mapJ3 = kotlin.collections.a.j();
                        }
                        map = mapJ3;
                    } else {
                        map = null;
                    }
                    a03 a03Var = i82Var.f78523a.f76562d.f75685a;
                    zz2 zz2VarB = a03Var != null ? a03Var.b() : null;
                    String strC7 = t01.c(map2, u11.f83304g);
                    int i12 = tb.f82950b;
                    if (strC7 != null) {
                        try {
                            numValueOf = Integer.valueOf(strC7);
                        } catch (NumberFormatException unused) {
                            numValueOf = null;
                        }
                    } else {
                        numValueOf = null;
                    }
                    Long lValueOf = numValueOf != null ? Long.valueOf(((long) numValueOf.intValue()) * i82.f78522i) : null;
                    String strC8 = t01.c(map2, u11.f83319v);
                    int i13 = tb.f82950b;
                    if (strC8 != null) {
                        try {
                            numValueOf2 = Integer.valueOf(strC8);
                        } catch (NumberFormatException unused2) {
                            numValueOf2 = null;
                        }
                    } else {
                        numValueOf2 = null;
                    }
                    Long lValueOf2 = numValueOf2 != null ? Long.valueOf(((long) numValueOf2.intValue()) * i82.f78522i) : null;
                    i82Var.f78529g.getClass();
                    String strC9 = t01.c(map2, u11.f83309l);
                    Locale[] availableLocales = Locale.getAvailableLocales();
                    int length = availableLocales.length;
                    int i14 = 0;
                    while (true) {
                        if (i14 >= length) {
                            locale = null;
                            break;
                        }
                        if (ck.p.e(availableLocales[i14].getLanguage(), strC9)) {
                            locale = new Locale(strC9);
                            break;
                        }
                        i14++;
                    }
                    String strC10 = t01.c(map2, u11.A);
                    boolean z10 = strC10 == null ? false : Boolean.parseBoolean(strC10);
                    String strC11 = t01.c(map2, u11.H);
                    boolean z11 = strC11 == null ? false : Boolean.parseBoolean(strC11);
                    boolean zB = t01.b(map2, u11.f83312o);
                    if (zB) {
                        objA = null;
                    } else {
                        yp2 yp2Var = i82Var.f78524b;
                        yp2Var.f85087b.getClass();
                        int i15 = wp2Var.f84289a;
                        byte[] bArr = wp2Var.f84290b.f84671a;
                        Map map3 = wp2Var.f84291c;
                        objA = yp2Var.f85086a.a(new e82(i15, bArr, map3, e82.a(map3), true));
                    }
                    hq1 hq1VarB = zB ? i82Var.f78525c.a(wp2Var) : null;
                    String str = i82Var.f78523a.f76561c.f78158a;
                    ArrayList arrayListE = t01.e(map2, u11.f83310m);
                    i82Var.f78530h.getClass();
                    c cVarA = w9.a(map2);
                    String strC12 = t01.c(map2, u11.f83308k);
                    int iD3 = t01.d(map2, u11.f83315r);
                    int iD4 = t01.d(map2, u11.f83316s);
                    int iD5 = t01.d(map2, u11.f83317t);
                    int iD6 = t01.d(map2, u11.f83322y);
                    String strC13 = t01.c(map2, u11.f83314q);
                    boolean zB2 = t01.b(map2, u11.f83306i);
                    String strC14 = t01.c(map2, u11.O);
                    String strC15 = t01.c(map2, u11.P);
                    String strC16 = t01.c(map2, u11.Q);
                    String strC17 = t01.c(map2, u11.f83323z);
                    i82Var.f78527e.getClass();
                    sz szVar = (sz) tz.f83254a.get(t01.c(map2, u11.f83313p));
                    rq2 rq2Var = i82Var.f78526d;
                    rq2Var.getClass();
                    Map map4 = wp2Var.f84291c;
                    String strC18 = t01.c(map4, u11.f83318u);
                    int i16 = tb.f82950b;
                    if (strC18 != null) {
                        try {
                            numValueOf3 = Integer.valueOf(strC18);
                        } catch (NumberFormatException unused3) {
                            numValueOf3 = null;
                        }
                    } else {
                        numValueOf3 = null;
                    }
                    String strC19 = t01.c(map4, u11.f83320w);
                    if (strC19 != null) {
                        rq2Var.f82393a.getClass();
                        strA = hn.a(strC19);
                    } else {
                        strA = null;
                    }
                    rv rvVar = (numValueOf3 == null || strA == null || strA.length() <= 0) ? null : new rv(numValueOf3.intValue(), strA);
                    String str2 = (String) nj.b0.h0(t01.e(map4, u11.f83321x));
                    qq2 qq2Var = new qq2(t01.b(map4, u11.C), rvVar, (str2 == null || str2.length() <= 0) ? null : new yx2(str2));
                    i82Var.f78528f.getClass();
                    String strC20 = t01.c(map2, u11.f83305h);
                    j5 j5Var = (strC20 == null || strC20.length() <= 0) ? null : new j5(strC20);
                    String strC21 = t01.c(map2, u11.K);
                    boolean zB3 = t01.b(map2, u11.M);
                    String strC22 = t01.c(map2, u11.E);
                    wt0 wt0Var = strC22 != null ? new wt0(strC22) : null;
                    String strC23 = t01.c(map2, u11.f83307j);
                    boolean z12 = strC23 == null ? true : Boolean.parseBoolean(strC23);
                    String strC24 = t01.c(map2, u11.S);
                    boolean z13 = strC24 == null ? false : Boolean.parseBoolean(strC24);
                    String strC25 = t01.c(map2, u11.T);
                    boolean z14 = strC25 == null ? true : Boolean.parseBoolean(strC25);
                    String strC26 = t01.c(map2, u11.U);
                    boolean z15 = strC26 == null ? true : Boolean.parseBoolean(strC26);
                    String strC27 = t01.c(map2, u11.V);
                    boolean z16 = strC27 == null ? true : Boolean.parseBoolean(strC27);
                    String strC28 = t01.c(map2, u11.W);
                    boolean z17 = strC28 == null ? true : Boolean.parseBoolean(strC28);
                    String strC29 = t01.c(map2, u11.X);
                    boolean z18 = strC29 == null ? false : Boolean.parseBoolean(strC29);
                    String strC30 = t01.c(map2, u11.Y);
                    boolean z19 = strC30 == null ? false : Boolean.parseBoolean(strC30);
                    String strC31 = t01.c(map2, u11.Z);
                    String strC32 = t01.c(map2, u11.f83298a0);
                    return new vp2(new v9(e00VarA, strC3, strC5, strC4, str, iD, iD2, arrayListE, cVarA, lValueOf, strC12, locale, j5Var, strC21, strC17, szVar, zz2VarB, strC13, strC14, hq1VarB, qq2Var, lValueOf2, objA, map, strC15, strC16, zB2, zB, z10, z11, iD3, iD4, iD5, iD6, zB3, wt0Var, z12, z13, z14, z15, z16, z17, z18, z19, strC31, strC32 == null ? false : Boolean.parseBoolean(strC32), 4096, 0), v11.a(e82Var));
                }
                return new vp2(new h4(m4.f80068k, e82Var));
            }
        }
        int i17 = h4.f78053d;
        return new vp2(g4.a(e82Var));
    }

    public boolean b(e82 e82Var, int i10) {
        byte[] bArr;
        if (200 != i10 || (bArr = e82Var.f76977b) == null) {
            return false;
        }
        return (bArr.length == 0) ^ true;
    }

    public final void b(Context context) {
        int iIntValue;
        Integer num;
        Integer num2;
        Object obj = dw2.f76819j;
        nt2 nt2VarA = cw2.a().a(context);
        if (nt2VarA != null && (num2 = nt2VarA.f80794t0) != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = this.C.f76573o;
        }
        this.I.f80974a.getClass();
        nt2 nt2VarA2 = cw2.a().a(context);
        this.f81501o = new qe0(1.0f, iIntValue, (nt2VarA2 == null || (num = nt2VarA2.J) == null) ? 0 : num.intValue());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pn(Context context, d4 d4Var, at1 at1Var, String str, String str2, u02 u02Var, uo2 uo2Var, oo ooVar, fp2 fp2Var, ey2 ey2Var, ay2 ay2Var, b5 b5Var, o9 o9Var) {
        super(context, d4Var, 1, str, ooVar, d4Var, fp2Var, uo2Var, at1Var, 1536);
        d4Var.c().getClass();
        this.C = d4Var;
        this.D = str2;
        this.E = u02Var;
        this.F = ey2Var;
        this.G = ay2Var;
        this.H = b5Var;
        this.I = o9Var;
        this.J = context.getApplicationContext();
        boolean z10 = ad1.f75480a;
        b(context);
    }
}
