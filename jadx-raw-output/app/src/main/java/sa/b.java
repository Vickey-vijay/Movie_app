package sa;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.mgs.carparking.db.AdNumShowDao;
import com.mgs.carparking.netbean.AdInfoDetailEntry;
import com.mgs.carparking.ui.MainActivity;
import com.mgs.carparking.ui.login.splash.SplashActivity;
import com.mgs.carparking.ui.login.splash.SplashWxActivity;
import com.mgs.carparking.widgets.BannerView;
import com.safedk.android.utils.Logger;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: AdShowUtil.java */
/* JADX INFO: loaded from: classes11.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ta.g f67124a;

    public static void c(AdInfoDetailEntry adInfoDetailEntry, Activity activity) {
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        p10.startActivity(p11);
    }

    public static void A(Activity activity, FrameLayout frameLayout, AdInfoDetailEntry adInfoDetailEntry) {
        new ta.j(activity).a(frameLayout, adInfoDetailEntry, 22);
        AdNumShowDao.getInstance().updateWxSearchBannerAdNum(AdNumShowDao.getInstance().getNum(107) + 1);
    }

    public static void D(MainActivity mainActivity, AdInfoDetailEntry adInfoDetailEntry) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("adInfoDetailEntry", adInfoDetailEntry);
        bundle.putBoolean("flag", true);
        mainActivity.startActivity(SplashWxActivity.class, bundle);
        mainActivity.overridePendingTransition(0, 0);
    }

    public static void E(SplashActivity splashActivity, AdInfoDetailEntry adInfoDetailEntry) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("adInfoDetailEntry", adInfoDetailEntry);
        Intent intent = new Intent(splashActivity, (Class<?>) SplashWxActivity.class);
        intent.putExtras(bundle);
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(splashActivity, intent);
        splashActivity.overridePendingTransition(0, 0);
        splashActivity.finish();
    }

    public static void d(AdInfoDetailEntry adInfoDetailEntry, Activity activity) {
        new ta.f(activity).b(adInfoDetailEntry);
    }

    public static void u(Activity activity, FrameLayout frameLayout, AdInfoDetailEntry adInfoDetailEntry) {
        new ta.e(activity).a(frameLayout, adInfoDetailEntry, 15);
        AdNumShowDao.getInstance().updateHome3Num(AdNumShowDao.getInstance().getNum(91) + 1);
    }

    public static void v(Activity activity, FrameLayout frameLayout, AdInfoDetailEntry adInfoDetailEntry) {
        new ta.j(activity).a(frameLayout, adInfoDetailEntry, 25);
        AdNumShowDao.getInstance().updateBannerMoreNum(AdNumShowDao.getInstance().getNum(101) + 1);
    }

    public static void w(Activity activity, RelativeLayout relativeLayout, AdInfoDetailEntry adInfoDetailEntry) {
        ta.g gVar = new ta.g(activity);
        f67124a = gVar;
        gVar.b(adInfoDetailEntry, 16);
        AdNumShowDao.getInstance().updateWxBannerVideoPauseNum(AdNumShowDao.getInstance().getNum(96) + 1);
    }

    public static void x(Activity activity, FrameLayout frameLayout, AdInfoDetailEntry adInfoDetailEntry) {
        new ta.j(activity).a(frameLayout, adInfoDetailEntry, 24);
        AdNumShowDao.getInstance().updateWxRankBannerAdNum(AdNumShowDao.getInstance().getNum(105) + 1);
    }

    public static void y(Activity activity, FrameLayout frameLayout, ArrayList<BannerView.Banner> arrayList, AdInfoDetailEntry adInfoDetailEntry) {
        ta.b bVar = new ta.b(activity);
        if (!t9.e.a(arrayList)) {
            arrayList.add(new BannerView.Banner(adInfoDetailEntry, bVar, "", "", "", true, true));
        }
        AdNumShowDao.getInstance().updateRotationTdNum(AdNumShowDao.getInstance().getNum(4) + 1);
    }

    public static void z(Activity activity, FrameLayout frameLayout, AdInfoDetailEntry adInfoDetailEntry) {
        new ta.j(activity).a(frameLayout, adInfoDetailEntry, 23);
        AdNumShowDao.getInstance().updateRotationTdNum(AdNumShowDao.getInstance().getNum(17) + 1);
    }

    public static void B(MainActivity mainActivity, List<AdInfoDetailEntry> list) {
        int num = AdNumShowDao.getInstance().getNum(21);
        if (num >= list.size() - 1) {
            a(mainActivity, list, 0);
        } else {
            a(mainActivity, list, num + 1);
        }
    }

    public static void C(SplashActivity splashActivity, List<AdInfoDetailEntry> list) {
        int num = AdNumShowDao.getInstance().getNum(21);
        if (num >= list.size() - 1) {
            f(splashActivity, list, 0);
        } else {
            f(splashActivity, list, num + 1);
        }
    }

    public static void a(MainActivity mainActivity, List<AdInfoDetailEntry> list, int i10) {
        AdInfoDetailEntry adInfoDetailEntry = list.get(i10);
        if (adInfoDetailEntry.getAd_source_id() == 2) {
            if (adInfoDetailEntry.getNum() > 0) {
                if (adInfoDetailEntry.getNum() > AdNumShowDao.getInstance().getNum(2)) {
                    AdNumShowDao.getInstance().updateSplashIndex(i10);
                    D(mainActivity, adInfoDetailEntry);
                    return;
                } else {
                    int i11 = i10 + 1;
                    if (i11 == list.size()) {
                        i11 = 0;
                    }
                    a(mainActivity, list, i11);
                    return;
                }
            }
            AdNumShowDao.getInstance().updateSplashIndex(i10);
            D(mainActivity, adInfoDetailEntry);
        }
    }

    public static void b(Activity activity, List<AdInfoDetailEntry> list) {
        int num = AdNumShowDao.getInstance().getNum(70);
        if (num >= list.size() - 1) {
            e(activity, list, 0);
        } else {
            e(activity, list, num + 1);
        }
    }

    public static void e(Activity activity, List<AdInfoDetailEntry> list, int i10) {
        AdInfoDetailEntry adInfoDetailEntry = list.get(i10);
        int i11 = 0;
        if (adInfoDetailEntry.getAd_source_id() == 1) {
            if (adInfoDetailEntry.getNum() > 0) {
                if (adInfoDetailEntry.getNum() > AdNumShowDao.getInstance().getNum(71)) {
                    AdNumShowDao.getInstance().updateInterstitialHomeIndex(i10);
                    c(adInfoDetailEntry, activity);
                    return;
                } else {
                    int i12 = i10 + 1;
                    if (i12 != list.size()) {
                        i11 = i12;
                    }
                    e(activity, list, i11);
                    return;
                }
            }
            AdNumShowDao.getInstance().updateInterstitialHomeIndex(i10);
            c(adInfoDetailEntry, activity);
            return;
        }
        if (adInfoDetailEntry.getAd_source_id() == 2) {
            if (adInfoDetailEntry.getNum() > 0) {
                if (adInfoDetailEntry.getNum() > AdNumShowDao.getInstance().getNum(72)) {
                    AdNumShowDao.getInstance().updateInterstitialHomeIndex(i10);
                    d(adInfoDetailEntry, activity);
                    return;
                } else {
                    int i13 = i10 + 1;
                    if (i13 != list.size()) {
                        i11 = i13;
                    }
                    e(activity, list, i11);
                    return;
                }
            }
            AdNumShowDao.getInstance().updateInterstitialHomeIndex(i10);
            d(adInfoDetailEntry, activity);
            return;
        }
        AdNumShowDao.getInstance().updateInterstitialHomeIndex(i10);
    }

    public static void f(SplashActivity splashActivity, List<AdInfoDetailEntry> list, int i10) {
        AdInfoDetailEntry adInfoDetailEntry = list.get(i10);
        if (adInfoDetailEntry.getAd_source_id() == 2) {
            if (adInfoDetailEntry.getNum() > 0) {
                if (adInfoDetailEntry.getNum() > AdNumShowDao.getInstance().getNum(2)) {
                    AdNumShowDao.getInstance().updateSplashIndex(i10);
                    E(splashActivity, adInfoDetailEntry);
                    return;
                } else {
                    int i11 = i10 + 1;
                    if (i11 == list.size()) {
                        i11 = 0;
                    }
                    f(splashActivity, list, i11);
                    return;
                }
            }
            AdNumShowDao.getInstance().updateSplashIndex(i10);
            E(splashActivity, adInfoDetailEntry);
            return;
        }
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(splashActivity, new Intent(splashActivity, (Class<?>) MainActivity.class));
        splashActivity.finish();
    }

    public static void g(Activity activity, FrameLayout frameLayout, ArrayList<BannerView.Banner> arrayList, List<AdInfoDetailEntry> list) {
        int num = AdNumShowDao.getInstance().getNum(22);
        if (num >= list.size() - 1) {
            h(activity, frameLayout, arrayList, list, 0);
        } else {
            h(activity, frameLayout, arrayList, list, num + 1);
        }
    }

    public static void h(Activity activity, FrameLayout frameLayout, ArrayList<BannerView.Banner> arrayList, List<AdInfoDetailEntry> list, int i10) {
        AdInfoDetailEntry adInfoDetailEntry = list.get(i10);
        if (adInfoDetailEntry.getAd_source_id() == 2) {
            if (adInfoDetailEntry.getNum() > 0) {
                if (adInfoDetailEntry.getNum() > AdNumShowDao.getInstance().getNum(4)) {
                    AdNumShowDao.getInstance().updateRotationIndex(i10);
                    y(activity, frameLayout, arrayList, adInfoDetailEntry);
                    return;
                } else {
                    int i11 = i10 + 1;
                    if (i11 == list.size()) {
                        i11 = 0;
                    }
                    h(activity, frameLayout, arrayList, list, i11);
                    return;
                }
            }
            AdNumShowDao.getInstance().updateRotationIndex(i10);
            y(activity, frameLayout, arrayList, adInfoDetailEntry);
        }
    }

    public static void i(Activity activity, FrameLayout frameLayout, List<AdInfoDetailEntry> list) {
        int num = AdNumShowDao.getInstance().getNum(27);
        if (num >= list.size() - 1) {
            j(activity, frameLayout, list, 0);
        } else {
            j(activity, frameLayout, list, num + 1);
        }
    }

    public static void j(Activity activity, FrameLayout frameLayout, List<AdInfoDetailEntry> list, int i10) {
        AdInfoDetailEntry adInfoDetailEntry = list.get(i10);
        if (adInfoDetailEntry.getAd_source_id() == 2) {
            if (adInfoDetailEntry.getNum() > 0) {
                if (adInfoDetailEntry.getNum() > AdNumShowDao.getInstance().getNum(17)) {
                    AdNumShowDao.getInstance().updateSearchIndex(i10);
                    z(activity, frameLayout, adInfoDetailEntry);
                    return;
                } else {
                    int i11 = i10 + 1;
                    if (i11 == list.size()) {
                        i11 = 0;
                    }
                    j(activity, frameLayout, list, i11);
                    return;
                }
            }
            AdNumShowDao.getInstance().updateSearchIndex(i10);
            z(activity, frameLayout, adInfoDetailEntry);
        }
    }

    public static void k(Activity activity, RelativeLayout relativeLayout, List<AdInfoDetailEntry> list) {
        int num = AdNumShowDao.getInstance().getNum(95);
        if (num >= list.size() - 1) {
            l(activity, relativeLayout, list, 0);
        } else {
            l(activity, relativeLayout, list, num + 1);
        }
    }

    public static void l(Activity activity, RelativeLayout relativeLayout, List<AdInfoDetailEntry> list, int i10) {
        AdInfoDetailEntry adInfoDetailEntry = list.get(i10);
        if (adInfoDetailEntry.getAd_source_id() == 2) {
            if (adInfoDetailEntry.getNum() > 0) {
                if (adInfoDetailEntry.getNum() > AdNumShowDao.getInstance().getNum(96)) {
                    AdNumShowDao.getInstance().updateBannerVideoPauseIndexNum(i10);
                    w(activity, relativeLayout, adInfoDetailEntry);
                    return;
                } else {
                    int i11 = i10 + 1;
                    if (i11 == list.size()) {
                        i11 = 0;
                    }
                    l(activity, relativeLayout, list, i11);
                    return;
                }
            }
            AdNumShowDao.getInstance().updateBannerVideoPauseIndexNum(i10);
            w(activity, relativeLayout, adInfoDetailEntry);
        }
    }

    public static void m(Activity activity, FrameLayout frameLayout, List<AdInfoDetailEntry> list) {
        int num = AdNumShowDao.getInstance().getNum(90);
        if (num >= list.size() - 1) {
            n(activity, frameLayout, list, 0);
        } else {
            n(activity, frameLayout, list, num + 1);
        }
    }

    public static void n(Activity activity, FrameLayout frameLayout, List<AdInfoDetailEntry> list, int i10) {
        AdInfoDetailEntry adInfoDetailEntry = list.get(i10);
        if (adInfoDetailEntry.getAd_source_id() == 2) {
            if (adInfoDetailEntry.getNum() > 0) {
                if (adInfoDetailEntry.getNum() > AdNumShowDao.getInstance().getNum(91)) {
                    AdNumShowDao.getInstance().updateHome3Index(i10);
                    u(activity, frameLayout, adInfoDetailEntry);
                    return;
                } else {
                    int i11 = i10 + 1;
                    if (i11 == list.size()) {
                        i11 = 0;
                    }
                    j(activity, frameLayout, list, i11);
                    return;
                }
            }
            AdNumShowDao.getInstance().updateHome3Index(i10);
            u(activity, frameLayout, adInfoDetailEntry);
        }
    }

    public static void o(Activity activity, FrameLayout frameLayout, List<AdInfoDetailEntry> list, int i10) {
        AdInfoDetailEntry adInfoDetailEntry = list.get(i10);
        if (adInfoDetailEntry.getAd_source_id() == 2) {
            if (adInfoDetailEntry.getNum() > 0) {
                if (adInfoDetailEntry.getNum() > AdNumShowDao.getInstance().getNum(101)) {
                    AdNumShowDao.getInstance().updateBannerModeIndex(i10);
                    v(activity, frameLayout, adInfoDetailEntry);
                    return;
                } else {
                    int i11 = i10 + 1;
                    if (i11 == list.size()) {
                        i11 = 0;
                    }
                    o(activity, frameLayout, list, i11);
                    return;
                }
            }
            AdNumShowDao.getInstance().updateBannerModeIndex(i10);
            v(activity, frameLayout, adInfoDetailEntry);
        }
    }

    public static void p(Activity activity, FrameLayout frameLayout, List<AdInfoDetailEntry> list) {
        int num = AdNumShowDao.getInstance().getNum(100);
        if (num >= list.size() - 1) {
            o(activity, frameLayout, list, 0);
        } else {
            o(activity, frameLayout, list, num + 1);
        }
    }

    public static void q(Activity activity, FrameLayout frameLayout, List<AdInfoDetailEntry> list, int i10) {
        AdInfoDetailEntry adInfoDetailEntry = list.get(i10);
        if (adInfoDetailEntry.getAd_source_id() == 2) {
            if (adInfoDetailEntry.getNum() > 0) {
                if (adInfoDetailEntry.getNum() > AdNumShowDao.getInstance().getNum(105)) {
                    AdNumShowDao.getInstance().updateRankBannerAdIndexNum(i10);
                    x(activity, frameLayout, adInfoDetailEntry);
                    return;
                } else {
                    int i11 = i10 + 1;
                    if (i11 == list.size()) {
                        i11 = 0;
                    }
                    q(activity, frameLayout, list, i11);
                    return;
                }
            }
            AdNumShowDao.getInstance().updateRankBannerAdIndexNum(i10);
            x(activity, frameLayout, adInfoDetailEntry);
        }
    }

    public static void r(Activity activity, FrameLayout frameLayout, List<AdInfoDetailEntry> list) {
        int num = AdNumShowDao.getInstance().getNum(104);
        if (num >= list.size() - 1) {
            q(activity, frameLayout, list, 0);
        } else {
            q(activity, frameLayout, list, num + 1);
        }
    }

    public static void s(Activity activity, FrameLayout frameLayout, List<AdInfoDetailEntry> list, int i10) {
        AdInfoDetailEntry adInfoDetailEntry = list.get(i10);
        if (adInfoDetailEntry.getAd_source_id() == 2) {
            if (adInfoDetailEntry.getNum() > 0) {
                if (adInfoDetailEntry.getNum() > AdNumShowDao.getInstance().getNum(107)) {
                    AdNumShowDao.getInstance().updateSearchBannerAdIndexNum(i10);
                    A(activity, frameLayout, adInfoDetailEntry);
                    return;
                } else {
                    int i11 = i10 + 1;
                    if (i11 == list.size()) {
                        i11 = 0;
                    }
                    s(activity, frameLayout, list, i11);
                    return;
                }
            }
            AdNumShowDao.getInstance().updateSearchBannerAdIndexNum(i10);
            A(activity, frameLayout, adInfoDetailEntry);
        }
    }

    public static void t(Activity activity, FrameLayout frameLayout, List<AdInfoDetailEntry> list) {
        int num = AdNumShowDao.getInstance().getNum(106);
        if (num >= list.size() - 1) {
            s(activity, frameLayout, list, 0);
        } else {
            s(activity, frameLayout, list, num + 1);
        }
    }
}
