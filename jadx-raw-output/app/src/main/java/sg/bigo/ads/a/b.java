package sg.bigo.ads.a;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsSession;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import sg.bigo.ads.common.n.d;

/* JADX INFO: loaded from: classes11.dex */
final class b implements sg.bigo.ads.a.a.a.InterfaceC0647a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final b f67289c = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sg.bigo.ads.a.a.a f67290a = new sg.bigo.ads.a.a.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f67292d = 300000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f67293e = 200;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<String> f67291b = new LinkedHashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashMap<String, Long> f67294f = new HashMap<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f67295g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f67296h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f67297i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f67298j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f67299k = false;

    public static /* synthetic */ String a(int i10) {
        switch (i10) {
            case 1:
                return "Navigation Started";
            case 2:
                return "Navigation Finished";
            case 3:
                return "Navigation Failed";
            case 4:
                return "Navigation Aborted";
            case 5:
                return "Tab Shown";
            case 6:
                return "Tab Hidden";
            default:
                return "Unknown Event";
        }
    }

    public static b a() {
        return f67289c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    public void e() {
        if (!this.f67297i) {
            this.f67299k = false;
            return;
        }
        if (!this.f67299k) {
            sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabsStatic", "The task of preload start.");
        }
        String str = null;
        try {
            Iterator<String> it = this.f67291b.iterator();
            if (!it.hasNext()) {
                sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabsStatic", "The task of preload stop.");
                this.f67299k = false;
                return;
            }
            this.f67299k = true;
            final String next = it.next();
            try {
                this.f67291b.remove(next);
            } catch (Exception unused) {
                str = next;
                next = str;
            }
            if (TextUtils.isEmpty(next)) {
                return;
            }
            d.a(1, new Runnable() { // from class: sg.bigo.ads.a.b.3
                @Override // java.lang.Runnable
                public final void run() {
                    CustomTabsSession customTabsSessionA;
                    Long l10 = (Long) b.this.f67294f.get(next);
                    if (l10 == null || SystemClock.elapsedRealtime() - l10.longValue() > 300000) {
                        Uri uri = Uri.parse(next);
                        sg.bigo.ads.a.a.a aVar = b.this.f67290a;
                        boolean zMayLaunchUrl = (aVar.f67275a == null || (customTabsSessionA = aVar.a()) == null) ? false : customTabsSessionA.mayLaunchUrl(uri, null, null);
                        sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabsStatic", "Preload url state: " + zMayLaunchUrl + ", url: " + next);
                        if (!zMayLaunchUrl) {
                            sg.bigo.ads.core.d.b.a(3002, 10115, String.valueOf(next));
                        }
                        b.this.f67294f.put(next, Long.valueOf(SystemClock.elapsedRealtime()));
                    } else {
                        sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabsStatic", "The url that wait for preload has been preloaded before: " + next);
                    }
                    d.a(2, new Runnable() { // from class: sg.bigo.ads.a.b.3.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            b.this.e();
                        }
                    }, 200L);
                }
            });
        } catch (Exception unused2) {
        }
    }

    public final boolean a(Context context) {
        String str;
        if (!this.f67298j) {
            sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabsStatic", "Chrome service is unavailable.");
            return false;
        }
        boolean zBindCustomTabsService = true;
        if (this.f67297i) {
            str = "Chrome service connected";
        } else {
            if (!this.f67296h) {
                this.f67296h = true;
                sg.bigo.ads.a.a.a aVar = this.f67290a;
                aVar.f67277c = this;
                if (aVar.f67275a == null) {
                    sg.bigo.ads.a.a.b.a aVarA = sg.bigo.ads.a.a.b.a(context);
                    if (aVarA == null || !aVarA.f67283a) {
                        zBindCustomTabsService = false;
                    } else {
                        sg.bigo.ads.a.a.c cVar = new sg.bigo.ads.a.a.c(aVar);
                        aVar.f67276b = cVar;
                        zBindCustomTabsService = CustomTabsClient.bindCustomTabsService(context, aVarA.f67287e, cVar);
                    }
                }
                if (!zBindCustomTabsService) {
                    this.f67296h = false;
                    int i10 = this.f67295g;
                    this.f67295g = i10 + 1;
                    if (i10 < 3) {
                        this.f67298j = false;
                    }
                }
                return zBindCustomTabsService;
            }
            str = "Chrome service connect trying.";
        }
        sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabsStatic", str);
        return true;
    }

    @MainThread
    public final void b() {
        if (this.f67299k) {
            return;
        }
        e();
    }

    @Override // sg.bigo.ads.a.a.a.InterfaceC0647a
    public final void c() {
        sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabsStatic", "Chrome tabs service connected.");
        this.f67297i = true;
        this.f67296h = false;
        b();
    }

    @Override // sg.bigo.ads.a.a.a.InterfaceC0647a
    public final void d() {
        sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabsStatic", "Chrome tabs service disconnected.");
        this.f67297i = false;
        this.f67296h = false;
    }
}
