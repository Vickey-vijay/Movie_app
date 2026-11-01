package yads;

import android.util.Log;
import com.ironsource.Z7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class nb3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f80621a = nj.s.n("The integrated version of the Yandex Mobile Ads SDK is outdated.", "Please update com.yandex.android:mobileads to the latest version.");

    public static String a(int i10, String str) {
        return "* " + str + lk.x.J(Z7.f27998r, i10 - str.length()) + " *";
    }

    public static void b() {
        Integer numValueOf;
        List listY0 = nj.b0.y0(nj.b0.y0(f80621a, nj.s.n("Learn more about the latest version of the SDK here:", "https://yandex.ru/dev/mobile-ads/doc/android/quick-start/android-ads-component.html")), a());
        Iterator it = listY0.iterator();
        String strP0 = null;
        if (it.hasNext()) {
            numValueOf = Integer.valueOf(((String) it.next()).length());
            while (it.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(((String) it.next()).length());
                if (numValueOf.compareTo(numValueOf2) < 0) {
                    numValueOf = numValueOf2;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            String strJ = lk.x.J("*", iIntValue + 4);
            ArrayList arrayList = new ArrayList(nj.t.v(listY0, 10));
            Iterator it2 = listY0.iterator();
            while (it2.hasNext()) {
                arrayList.add(a(iIntValue, (String) it2.next()));
            }
            strP0 = nj.b0.p0(nj.b0.z0(nj.b0.y0(nj.r.e(strJ), arrayList), strJ), "\n", null, null, 0, null, null, 62, null);
        }
        Log.e("Yandex Mobile Ads", "Yandex Mobile Ads version validation\n" + strP0 + "\n");
    }

    public static List a() {
        if (tq.a() != null) {
            return nj.r.e("Changelog: " + tq.a());
        }
        return nj.s.k();
    }
}
