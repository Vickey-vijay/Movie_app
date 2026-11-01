package sg.bigo.ads.core.player;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import sg.bigo.ads.common.u.a.e;
import sg.bigo.ads.common.u.g;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.core.f.a.n;
import sg.bigo.ads.core.f.a.p;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f71888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f71889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f71890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f71891d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final sg.bigo.ads.core.e.a.b f71892e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public sg.bigo.ads.core.c.b f71893f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f71894g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f71895h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<Integer> f71897j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List<Integer> f71898k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f71899l = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f71896i = false;

    public c(Context context, @NonNull p pVar, @NonNull sg.bigo.ads.core.e.a.b bVar) {
        ArrayList arrayList = new ArrayList(4);
        this.f71897j = arrayList;
        ArrayList arrayList2 = new ArrayList(5);
        this.f71898k = arrayList2;
        this.f71895h = context;
        this.f71888a = pVar;
        this.f71892e = bVar;
        arrayList.add(0);
        arrayList.add(25);
        arrayList.add(50);
        arrayList.add(75);
        arrayList2.add(2000);
        arrayList2.add(3000);
        arrayList2.add(5000);
        arrayList2.add(8000);
        arrayList2.add(10000);
    }

    public static String a(String str) {
        if (q.a((CharSequence) str)) {
            return "";
        }
        String strA = q.a(str, "[TIMESTAMP]", new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.getDefault()).format(new Date()), true);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(((int) (Math.random() * 9.0E7d)) + 10000000);
        return q.a(strA, "[CACHEBUSTING]", sb2.toString(), true);
    }

    private static String a(String str, int i10) {
        if (q.a((CharSequence) str)) {
            return "";
        }
        try {
            return q.a(str, "ad_imp_indx=__ad_imp_indx__", "ad_imp_indx=".concat(String.valueOf(i10)), true);
        } catch (Throwable unused) {
            return str;
        }
    }

    public static void a(Context context, List<n> list) {
        if (list != null) {
            for (n nVar : list) {
                if (nVar != null) {
                    String str = nVar.f71455b;
                    if (q.a((CharSequence) str) || (nVar.f71456c && !nVar.f71457d)) {
                        sg.bigo.ads.common.t.a.a(0, "VASTController", "invalidate tracking url or is tracked");
                    } else {
                        sg.bigo.ads.common.u.b.a aVar = new sg.bigo.ads.common.u.b.a(new sg.bigo.ads.common.u.b.d(str), context);
                        aVar.f69951l = e.g();
                        g.a(aVar, null);
                    }
                }
            }
        }
    }

    public static void a(sg.bigo.ads.core.a.a aVar, int i10) {
        sg.bigo.ads.core.d.b.a(aVar, i10, aVar.aK(), aVar.aM());
    }

    private boolean a(sg.bigo.ads.api.core.b bVar, @NonNull List<? extends n> list, String str) {
        Iterator<? extends n> it = list.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (str.equals("va_cpn_cli")) {
                this.f71899l = true;
            }
            a(it.next(), str, bVar);
            it.remove();
            z10 = true;
        }
        return z10;
    }

    private static String b(String str, int i10) {
        if (q.a((CharSequence) str)) {
            return "";
        }
        try {
            return q.a(str, "ad_click_indx=__ad_click_indx__", "ad_click_indx=".concat(String.valueOf(i10)), true);
        } catch (Throwable unused) {
            return str;
        }
    }

    public final void a() {
        a(this.f71888a.f71484y, "va_cpn_imp");
    }

    public final void a(sg.bigo.ads.api.core.b bVar) {
        if (this.f71899l) {
            return;
        }
        a(bVar, this.f71888a.f71469j, "va_cli");
    }

    public final void a(@NonNull n nVar, String str) {
        String str2 = nVar.f71455b;
        if (q.a((CharSequence) str2) || (nVar.f71456c && !nVar.f71457d)) {
            sg.bigo.ads.common.t.a.a(0, "VASTController", "invalidate tracking url or is tracked");
            return;
        }
        String strA = a(str2);
        nVar.f71456c = true;
        if (q.a((CharSequence) strA)) {
            return;
        }
        this.f71892e.a(this.f71895h, str, strA, "bigoad");
        sg.bigo.ads.common.t.a.a(0, 3, "VASTController", "Send track info, action: " + str + ", url: " + strA);
    }

    public final void a(@NonNull n nVar, String str, sg.bigo.ads.api.core.b bVar) {
        String str2 = nVar.f71455b;
        if (q.a((CharSequence) str2) || (nVar.f71456c && !nVar.f71457d)) {
            sg.bigo.ads.common.t.a.a(0, "VASTController", "invalidate tracking url or is tracked");
            return;
        }
        String strA = a(str2);
        if ("va_show".equals(str) && (bVar instanceof sg.bigo.ads.core.a.a) && strA.contains("ad_imp_indx=__ad_imp_indx__")) {
            strA = a(strA, ((sg.bigo.ads.core.a.a) bVar).bn());
        }
        if (("va_cli".equals(str) || "va_cpn_cli".equals(str)) && (bVar instanceof sg.bigo.ads.core.a.a) && strA.contains("ad_click_indx=__ad_click_indx__")) {
            sg.bigo.ads.core.a.a aVar = (sg.bigo.ads.core.a.a) bVar;
            strA = b(strA, aVar.bo());
            if (strA.contains("ad_imp_indx=__ad_imp_indx__")) {
                strA = a(strA, aVar.bn());
            }
        }
        nVar.f71456c = true;
        if (q.a((CharSequence) strA)) {
            return;
        }
        this.f71892e.a(this.f71895h, str, strA, "bigoad");
        sg.bigo.ads.common.t.a.a(0, 3, "VASTController", "Send track info, action: " + str + ", url: " + strA);
    }

    public final boolean a(@NonNull List<? extends n> list, String str) {
        Iterator<? extends n> it = list.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (str.equals("va_cpn_cli")) {
                this.f71899l = true;
            }
            a(it.next(), str);
            it.remove();
            z10 = true;
        }
        return z10;
    }

    public final boolean b(sg.bigo.ads.api.core.b bVar) {
        return a(bVar, this.f71888a.f71485z, "va_cpn_cli");
    }
}
