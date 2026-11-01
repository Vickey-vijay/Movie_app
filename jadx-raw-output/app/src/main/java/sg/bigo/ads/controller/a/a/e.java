package sg.bigo.ads.controller.a.a;

import android.os.Parcel;
import android.webkit.URLUtil;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.common.n;
import sg.bigo.ads.common.utils.r;
import sg.bigo.ads.controller.a.k;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends g implements sg.bigo.ads.common.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f70380a = r.f70033d.a(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f70381b = r.f70031b.a(30);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f70385g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f70386h;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<a> f70384f = c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f70382d = f70380a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f70383e = f70381b;

    private static List<a> c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a(AndroidStaticDeviceInfoDataSource.STORE_GOOGLE, "https://drive.google.com/uc?export=download&id=1ms4F7Cn_aInE9oFMMaZEiwMIuMKt1DZc", true));
        return arrayList;
    }

    @Override // sg.bigo.ads.controller.a.a.g
    @Nullable
    public final k a(String str) {
        synchronized (this) {
            if (sg.bigo.ads.common.utils.k.a((Collection) this.f70384f)) {
                return null;
            }
            a aVarA = g.a((List<a>) sg.bigo.ads.common.utils.k.a(this.f70384f, new Comparable<a>() { // from class: sg.bigo.ads.controller.a.a.e.1
                @Override // java.lang.Comparable
                public final /* bridge */ /* synthetic */ int compareTo(a aVar) {
                    a aVar2 = aVar;
                    return (aVar2 == null || !aVar2.f70346d || aVar2.f70506b) ? 0 : 1;
                }
            }));
            if (aVarA != null) {
                return aVarA;
            }
            a aVarA2 = g.a((List<a>) sg.bigo.ads.common.utils.k.a(this.f70384f, new Comparable<a>() { // from class: sg.bigo.ads.controller.a.a.e.2
                @Override // java.lang.Comparable
                public final /* bridge */ /* synthetic */ int compareTo(a aVar) {
                    a aVar2 = aVar;
                    return (aVar2 != null && aVar2.f70346d && aVar2.f70506b) ? 1 : 0;
                }
            }));
            if (aVarA2 != null) {
                return aVarA2;
            }
            return null;
        }
    }

    @Override // sg.bigo.ads.common.f
    public final void a(@NonNull Parcel parcel) {
        synchronized (this) {
            parcel.writeLong(this.f70382d);
            parcel.writeLong(this.f70383e);
            n.a(parcel, this.f70384f);
            parcel.writeLong(this.f70385g);
            parcel.writeLong(this.f70386h);
        }
    }

    public final void a(@NonNull JSONObject jSONObject) {
        synchronized (this) {
            long jOptLong = jSONObject.optLong("suc_interval", f70380a / 1000) * 1000;
            long j10 = g.f70401c;
            long jMax = Math.max(jOptLong, j10);
            long jMax2 = Math.max(jSONObject.optLong("fail_interval", f70381b / 1000) * 1000, j10);
            List<a> listC = c();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("urls");
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                    String strOptString = jSONObjectOptJSONObject.optString("name", "");
                    String strOptString2 = jSONObjectOptJSONObject.optString("url", "");
                    if (URLUtil.isNetworkUrl(strOptString2)) {
                        listC.add(new a(strOptString, strOptString2, false));
                    }
                }
            }
            this.f70382d = jMax;
            this.f70383e = jMax2;
            this.f70384f = listC;
        }
    }

    @Override // sg.bigo.ads.controller.a.a.g
    public final void a(boolean z10) {
        super.a(z10);
        if (z10) {
            this.f70386h = System.currentTimeMillis();
        }
    }

    public final boolean a() {
        long j10 = this.f70385g;
        long j11 = this.f70386h;
        if (j10 == j11) {
            return true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (j10 > j11) {
            return Math.abs(jCurrentTimeMillis - this.f70385g) > this.f70383e;
        }
        return Math.abs(jCurrentTimeMillis - this.f70386h) > this.f70382d;
    }

    public final void b() {
        this.f70385g = System.currentTimeMillis();
        synchronized (this) {
            if (sg.bigo.ads.common.utils.k.a((Collection) this.f70384f)) {
                return;
            }
            Iterator<a> it = this.f70384f.iterator();
            while (it.hasNext()) {
                it.next().f70346d = true;
            }
        }
    }

    @Override // sg.bigo.ads.common.f
    public final void b(@NonNull Parcel parcel) {
        synchronized (this) {
            this.f70382d = n.a(parcel, f70380a);
            this.f70383e = n.a(parcel, f70381b);
            List<a> listA = n.a(parcel, a.f70345c);
            this.f70384f = listA;
            if (sg.bigo.ads.common.utils.k.a((Collection) listA)) {
                this.f70384f = c();
            }
            this.f70385g = n.a(parcel, 0L);
            this.f70386h = n.a(parcel, 0L);
        }
    }
}
