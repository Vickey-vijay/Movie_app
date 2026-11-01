package yads;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class a5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sh1 f75401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tl f75402b;

    public /* synthetic */ a5() {
        this(new sh1(), new tl());
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006f  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cc  */
    public final String a(Context context) {
        List listK;
        String str;
        String str2;
        List list;
        List listN0;
        this.f75401a.getClass();
        String str3 = (String) sh1.a(context, th1.f83039f.f83045b);
        if (str3 == null) {
            tl tlVar = this.f75402b;
            e11 e11Var = tlVar.f83076a;
            nt2 nt2VarA = e11Var.f76880a.a(context);
            Object obj = null;
            if (nt2VarA == null || (str2 = nt2VarA.U) == null) {
                listK = nj.s.k();
            } else {
                e11Var.f76881b.getClass();
                String str4 = (String) sh1.a(context, th1.f83040g.f83045b);
                if (str4 == null || (listN0 = lk.a0.N0(str4, new String[]{StringUtils.COMMA}, false, 0, 6, null)) == null) {
                    list = null;
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : listN0) {
                        if (!lk.a0.n0((String) obj2)) {
                            arrayList.add(obj2);
                        }
                    }
                    boolean z10 = !arrayList.isEmpty();
                    list = arrayList;
                    if (!z10) {
                        list = null;
                    }
                }
                if (list == null) {
                    list = nt2VarA.f80802x0;
                }
                listK = nj.b0.y0(nj.r.e(str2), list);
            }
            if (listK.size() > 1) {
                for (Object obj3 : nj.b0.Y(listK, 1)) {
                    String strA = ya3.a((String) obj3);
                    if (strA != null && (!lk.a0.n0(strA))) {
                        d11 d11Var = tlVar.f83077b;
                        ConcurrentHashMap concurrentHashMap = d11.f76507b;
                        if (d11Var.a(1000, strA)) {
                            obj = obj3;
                            break;
                        }
                    }
                }
                String str5 = (String) obj;
                if (str5 == null) {
                    str = (String) nj.b0.r0(listK);
                } else {
                    str3 = str5;
                }
                if (str3 == null) {
                    str3 = "yandex.com/ads";
                }
            } else {
                str = (String) nj.b0.h0(listK);
            }
            str3 = str;
            if (str3 == null) {
                str3 = "yandex.com/ads";
            }
        }
        return a(str3);
    }

    public a5(sh1 sh1Var, tl tlVar) {
        this.f75401a = sh1Var;
        this.f75402b = tlVar;
    }

    public static String a(String str) {
        return "https://" + str;
    }
}
