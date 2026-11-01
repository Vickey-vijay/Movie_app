package sg.bigo.ads.controller.a.a;

import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.URLUtil;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.common.n;
import sg.bigo.ads.common.utils.r;
import sg.bigo.ads.controller.a.i;
import sg.bigo.ads.controller.a.k;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends g implements sg.bigo.ads.common.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f70389a = r.f70032c.a(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f70392e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<a> f70391d = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f70390b = f70389a;

    public static class a extends sg.bigo.ads.controller.a.a.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final sg.bigo.ads.common.f.a<a> f70399e = new sg.bigo.ads.common.f.a<a>() { // from class: sg.bigo.ads.controller.a.a.f.a.1
            @Override // sg.bigo.ads.common.f.a
            public final /* synthetic */ sg.bigo.ads.common.f a() {
                return new a();
            }
        };

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f70400f;

        public a() {
        }

        public a(String str, String str2, boolean z10, String str3) {
            super(str, str2, z10);
            this.f70400f = str3;
        }

        @Override // sg.bigo.ads.controller.a.k, sg.bigo.ads.common.f
        public final void a(@NonNull Parcel parcel) {
            super.a(parcel);
            parcel.writeString(this.f70400f);
        }

        @Override // sg.bigo.ads.controller.a.k, sg.bigo.ads.common.f
        public final void b(@NonNull Parcel parcel) {
            super.b(parcel);
            this.f70400f = n.a(parcel, "");
        }
    }

    @Nullable
    private k b(final String str) {
        synchronized (this) {
            if (sg.bigo.ads.common.utils.k.a((Collection) this.f70391d)) {
                return null;
            }
            a aVar = (a) g.a(sg.bigo.ads.common.utils.k.a(this.f70391d, new Comparable<a>() { // from class: sg.bigo.ads.controller.a.a.f.1
                @Override // java.lang.Comparable
                public final /* synthetic */ int compareTo(a aVar2) {
                    a aVar3 = aVar2;
                    return (aVar3 == null || !aVar3.f70346d || aVar3.f70506b || !TextUtils.equals(aVar3.f70400f, str)) ? 0 : 1;
                }
            }));
            if (aVar != null) {
                return aVar;
            }
            List listA = sg.bigo.ads.common.utils.k.a(this.f70391d, new Comparable<a>() { // from class: sg.bigo.ads.controller.a.a.f.2
                @Override // java.lang.Comparable
                public final /* synthetic */ int compareTo(a aVar2) {
                    a aVar3 = aVar2;
                    return (aVar3 != null && aVar3.f70346d && aVar3.f70506b && TextUtils.equals(aVar3.f70400f, str)) ? 1 : 0;
                }
            });
            if (!sg.bigo.ads.common.utils.k.a((Collection) listA)) {
                return g.a(listA);
            }
            List listA2 = sg.bigo.ads.common.utils.k.a(this.f70391d, new Comparable<a>() { // from class: sg.bigo.ads.controller.a.a.f.3
                @Override // java.lang.Comparable
                public final /* bridge */ /* synthetic */ int compareTo(a aVar2) {
                    a aVar3 = aVar2;
                    return (aVar3 == null || !aVar3.f70346d || aVar3.f70506b) ? 0 : 1;
                }
            });
            if (!sg.bigo.ads.common.utils.k.a((Collection) listA2)) {
                return g.a(listA2);
            }
            a aVar2 = (a) g.a(sg.bigo.ads.common.utils.k.a(this.f70391d, new Comparable<a>() { // from class: sg.bigo.ads.controller.a.a.f.4
                @Override // java.lang.Comparable
                public final /* bridge */ /* synthetic */ int compareTo(a aVar3) {
                    a aVar4 = aVar3;
                    return (aVar4 != null && aVar4.f70346d && aVar4.f70506b) ? 1 : 0;
                }
            }));
            if (aVar2 != null) {
                return aVar2;
            }
            return null;
        }
    }

    private static List<a> c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a("AWS", "https://ad-host-backup-asia.oss-ap-southeast-1.aliyuncs.com/uni/v2/au.pj", true, "asia"));
        arrayList.add(new a("AWS", "https://ad-host-backup-europe.oss-eu-central-1.aliyuncs.com/uni/v2/au.pj", true, "europe"));
        arrayList.add(new a("AWS", "https://ad-host-backup-america.oss-us-west-1.aliyuncs.com/uni/v2/au.pj", true, "america"));
        return arrayList;
    }

    @Override // sg.bigo.ads.controller.a.a.g
    @Nullable
    public final k a(String str) {
        if (sg.bigo.ads.common.utils.k.a((Collection) this.f70391d)) {
            return null;
        }
        return b(i.a(str));
    }

    @Override // sg.bigo.ads.common.f
    public final void a(@NonNull Parcel parcel) {
        synchronized (this) {
            parcel.writeLong(this.f70390b);
            n.a(parcel, this.f70391d);
            parcel.writeLong(this.f70392e);
        }
    }

    public final void a(@NonNull JSONObject jSONObject) {
        synchronized (this) {
            long jMax = Math.max(jSONObject.optLong("interval", f70389a / 1000) * 1000, g.f70401c);
            List<a> listC = c();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("urls");
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                    String strOptString = jSONObjectOptJSONObject.optString("name", "");
                    String strOptString2 = jSONObjectOptJSONObject.optString("url", "");
                    String strOptString3 = jSONObjectOptJSONObject.optString("region", "");
                    if (URLUtil.isNetworkUrl(strOptString2)) {
                        listC.add(new a(strOptString, strOptString2, false, strOptString3));
                    }
                }
            }
            this.f70390b = jMax;
            this.f70391d = listC;
        }
    }

    public final boolean a() {
        return Math.abs(System.currentTimeMillis() - this.f70392e) > this.f70390b;
    }

    public final void b() {
        this.f70392e = System.currentTimeMillis();
        synchronized (this) {
            if (sg.bigo.ads.common.utils.k.a((Collection) this.f70391d)) {
                return;
            }
            Iterator<a> it = this.f70391d.iterator();
            while (it.hasNext()) {
                it.next().f70346d = true;
            }
        }
    }

    @Override // sg.bigo.ads.common.f
    public final void b(@NonNull Parcel parcel) {
        synchronized (this) {
            this.f70390b = n.a(parcel, f70389a);
            List<a> listA = n.a(parcel, a.f70399e);
            this.f70391d = listA;
            if (sg.bigo.ads.common.utils.k.a((Collection) listA)) {
                this.f70391d = c();
            }
            this.f70392e = n.a(parcel, 0L);
        }
    }
}
