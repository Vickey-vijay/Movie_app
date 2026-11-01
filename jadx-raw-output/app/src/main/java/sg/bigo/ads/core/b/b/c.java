package sg.bigo.ads.core.b.b;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f71153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f71154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f71155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f71156d;

    public static c a() {
        c cVar = new c();
        for (boolean z10 = true; z10; z10 = false) {
            String strK = sg.bigo.ads.common.x.a.k();
            if (q.a((CharSequence) strK)) {
                break;
            }
            String[] strArrSplit = strK.split(StringUtils.COMMA);
            if (strArrSplit.length != 4) {
                break;
            }
            try {
                cVar.f71153a = Integer.parseInt(strArrSplit[0]);
                cVar.f71154b = Integer.parseInt(strArrSplit[1]);
                cVar.f71155c = Integer.parseInt(strArrSplit[2]);
                cVar.f71156d = Integer.parseInt(strArrSplit[3]);
            } catch (NumberFormatException unused) {
            }
        }
        return cVar;
    }

    public final void a(String str) {
        str.hashCode();
        switch (str) {
            case "filled":
                this.f71154b++;
                break;
            case "load":
                this.f71153a++;
                break;
            case "impression":
                this.f71155c++;
                break;
            case "clicked":
                this.f71156d++;
                break;
        }
        sg.bigo.ads.common.x.a.d(toString());
    }

    public final boolean b() {
        return ((this.f71153a + this.f71154b) + this.f71155c) + this.f71156d == 0;
    }

    public final void c() {
        this.f71153a = 0;
        this.f71154b = 0;
        this.f71155c = 0;
        this.f71156d = 0;
        sg.bigo.ads.common.x.a.d(toString());
    }

    @NonNull
    public final String toString() {
        return this.f71153a + StringUtils.COMMA + this.f71154b + StringUtils.COMMA + this.f71155c + StringUtils.COMMA + this.f71156d;
    }
}
