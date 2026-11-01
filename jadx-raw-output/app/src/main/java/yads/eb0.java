package yads;

import android.content.Context;
import android.os.SystemClock;
import android.webkit.URLUtil;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes7.dex */
public final class eb0 implements o53 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f77001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9 f77002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z9 f77003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2 f77004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lm0 f77005e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final WeakReference f77006f;

    /* JADX WARN: Code duplicated, block: B:46:0x00be  */
    /* JADX WARN: Code duplicated, block: B:57:0x0135  */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    @Override // yads.o53
    public final void a(lv lvVar, String str) {
        dv dvVar;
        boolean z10;
        zu zuVar;
        boolean zA;
        String str2;
        this.f77005e.f79849a.getClass();
        boolean z11 = ck.p.e(null, Boolean.TRUE) || this.f77002b.C;
        p2 p2Var = this.f77004d;
        Context context = (Context) this.f77006f.get();
        d4 d4Var = this.f77001a;
        v9 v9Var = this.f77002b;
        z9 z9Var = this.f77003c;
        p2Var.getClass();
        if (context != null) {
            AtomicLong atomicLong = o2.f80901a;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long andSet = jElapsedRealtime - o2.f80901a.getAndSet(jElapsedRealtime);
            if (!(0 <= andSet && andSet < 1001)) {
                Object obj = dw2.f76819j;
                nt2 nt2VarA = cw2.a().a(context);
                if (nt2VarA != null && (str2 = nt2VarA.S) != null) {
                    dv.f76807c.getClass();
                    dv[] dvVarArrValues = dv.values();
                    int length = dvVarArrValues.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length) {
                            dvVar = null;
                            break;
                        }
                        dvVar = dvVarArrValues[i10];
                        if (ck.p.e(dvVar.f76810b, str2)) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                } else {
                    dvVar = null;
                    break;
                }
                if ((z11 && dvVar == null) || dv.f76808d == dvVar) {
                    if (str.length() == 0) {
                        z10 = false;
                        if (URLUtil.isNetworkUrl(str)) {
                            zuVar = zu.f85586c;
                            zA = p2Var.f81205a.a(context, v9Var, z9Var, d4Var, str);
                        }
                    } else {
                        String strReplaceFirst = new Regex("http(s?)://").replaceFirst(str, "");
                        ab3[] ab3VarArrValues = ab3.values();
                        int length2 = ab3VarArrValues.length;
                        int i11 = 0;
                        while (true) {
                            if (i11 < length2) {
                                z10 = false;
                                if (!lk.x.R(strReplaceFirst, ab3VarArrValues[i11].f75462b, false, 2, null)) {
                                    i11++;
                                }
                            } else {
                                z10 = false;
                                if (URLUtil.isNetworkUrl(str)) {
                                    zuVar = zu.f85586c;
                                    zA = p2Var.f81205a.a(context, v9Var, z9Var, d4Var, str);
                                }
                            }
                        }
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("click_type", "default");
                    linkedHashMap.put("click_handled", Boolean.valueOf(zA));
                    linkedHashMap.put("click_url", xa3.a(str));
                    linkedHashMap.put("click_destination", zuVar.f85589b);
                    co2 co2Var = co2.f76369t;
                    eo2 eo2VarA = lvVar.a(co2Var, linkedHashMap);
                    lvVar.f79937d.a(eo2VarA);
                    lvVar.f79939f.a(co2Var, eo2VarA.f77159b, bo2.f75924a, null);
                    if (z9Var != null) {
                        z9Var.a(9, null);
                    }
                }
                z10 = false;
                zuVar = zu.f85587d;
                if (new db3(new cb3()).a(context, str)) {
                    z9Var.a(7, null);
                    zA = true;
                } else {
                    zA = URLUtil.isNetworkUrl(str) ? p2Var.f81205a.a(context, v9Var, z9Var, d4Var, str) : z10;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("click_type", "default");
                linkedHashMap2.put("click_handled", Boolean.valueOf(zA));
                linkedHashMap2.put("click_url", xa3.a(str));
                linkedHashMap2.put("click_destination", zuVar.f85589b);
                co2 co2Var2 = co2.f76369t;
                eo2 eo2VarA2 = lvVar.a(co2Var2, linkedHashMap2);
                lvVar.f79937d.a(eo2VarA2);
                lvVar.f79939f.a(co2Var2, eo2VarA2.f77159b, bo2.f75924a, null);
                if (z9Var != null) {
                    z9Var.a(9, null);
                }
            }
        }
    }

    public eb0(Context context, d4 d4Var, v9 v9Var, z9 z9Var, p2 p2Var, lm0 lm0Var) {
        this.f77001a = d4Var;
        this.f77002b = v9Var;
        this.f77003c = z9Var;
        this.f77004d = p2Var;
        this.f77005e = lm0Var;
        this.f77006f = new WeakReference(context);
    }
}
