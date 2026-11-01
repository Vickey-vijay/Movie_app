package sg.bigo.ads.controller.a.a;

import android.os.Parcel;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C3426d4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.common.n;
import sg.bigo.ads.common.utils.k;
import sg.bigo.ads.controller.a.j;

/* JADX INFO: loaded from: classes6.dex */
public class b implements sg.bigo.ads.common.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0724b f70347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0724b f70348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f70349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f70350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f70351e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<a, C0724b> f70352f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map<a, List<C0724b>> f70353g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f70354h = 3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map<a, C0724b> f70355i = b();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map<a, List<C0724b>> f70356j;

    public static class a implements sg.bigo.ads.common.f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final sg.bigo.ads.common.f.a<a> f70358c = new sg.bigo.ads.common.f.a<a>() { // from class: sg.bigo.ads.controller.a.a.b.a.1
            @Override // sg.bigo.ads.common.f.a
            public final /* synthetic */ sg.bigo.ads.common.f a() {
                return new a("", 0);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f70359a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f70360b;

        public a(String str, int i10) {
            this.f70359a = TextUtils.isEmpty(str) ? "all" : str.toLowerCase();
            this.f70360b = i10;
        }

        @Override // sg.bigo.ads.common.f
        public final void a(@NonNull Parcel parcel) {
            parcel.writeString(this.f70359a);
            parcel.writeInt(this.f70360b);
        }

        @Override // sg.bigo.ads.common.f
        public final void b(@NonNull Parcel parcel) {
            this.f70359a = n.a(parcel, "");
            this.f70360b = n.a(parcel, 0);
        }

        public final boolean equals(@Nullable Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (TextUtils.equals(this.f70359a, aVar.f70359a) && this.f70360b == aVar.f70360b) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return (this.f70359a + "_" + this.f70360b).hashCode();
        }

        @NonNull
        public final String toString() {
            return super.toString();
        }
    }

    /* JADX INFO: renamed from: sg.bigo.ads.controller.a.a.b$b, reason: collision with other inner class name */
    public static class C0724b extends j implements sg.bigo.ads.common.f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final sg.bigo.ads.common.f.a<C0724b> f70361e = new sg.bigo.ads.common.f.a<C0724b>() { // from class: sg.bigo.ads.controller.a.a.b.b.1
            @Override // sg.bigo.ads.common.f.a
            public final /* synthetic */ sg.bigo.ads.common.f a() {
                return new C0724b("", "", 0);
            }
        };

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f70362d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f70363f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f70364g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f70365h;

        public C0724b(String str, String str2, int i10) {
            super(str, str2, i10);
            this.f70362d = true;
            this.f70363f = 0;
            this.f70364g = 0L;
            this.f70365h = 0;
        }

        public static /* synthetic */ int c(C0724b c0724b) {
            c0724b.f70365h = 0;
            return 0;
        }

        public static /* synthetic */ int e(C0724b c0724b) {
            int i10 = c0724b.f70363f;
            c0724b.f70363f = i10 + 1;
            return i10;
        }

        public static /* synthetic */ int f(C0724b c0724b) {
            c0724b.f70363f = 0;
            return 0;
        }

        public static /* synthetic */ int g(C0724b c0724b) {
            int i10 = c0724b.f70365h;
            c0724b.f70365h = i10 + 1;
            return i10;
        }

        @Override // sg.bigo.ads.common.f
        public final void a(@NonNull Parcel parcel) {
            parcel.writeString(this.f70502a);
            parcel.writeInt(this.f70504c);
            n.a(parcel, this.f70362d);
            parcel.writeString(this.f70503b);
            parcel.writeInt(this.f70363f);
            parcel.writeLong(this.f70364g);
            parcel.writeInt(this.f70365h);
        }

        public final void a(String str) {
            this.f70503b = str;
        }

        @Override // sg.bigo.ads.common.f
        public final void b(@NonNull Parcel parcel) {
            this.f70502a = n.a(parcel, "");
            this.f70504c = n.a(parcel, 1);
            this.f70362d = n.b(parcel, true);
            this.f70503b = n.a(parcel, "");
            this.f70363f = n.a(parcel, 0);
            this.f70364g = n.a(parcel, 0L);
            this.f70365h = n.a(parcel, 0);
        }

        public final boolean equals(@Nullable Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof j) {
                return TextUtils.equals(this.f70502a, ((j) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            String str = this.f70502a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }
    }

    public b(@NonNull String str, @Nullable String str2) {
        this.f70350d = str;
        this.f70351e = str2;
    }

    @NonNull
    private static List<a> a(@NonNull a aVar) {
        ArrayList arrayList = new ArrayList();
        a aVar2 = new a("all", 0);
        if (aVar2.equals(aVar)) {
            arrayList.add(0, aVar);
            return arrayList;
        }
        arrayList.add(0, aVar2);
        a aVar3 = new a("all", aVar.f70360b);
        if (aVar3.equals(aVar)) {
            arrayList.add(0, aVar);
            return arrayList;
        }
        arrayList.add(0, aVar3);
        a aVar4 = new a(aVar.f70359a, 0);
        if (aVar4.equals(aVar)) {
            arrayList.add(0, aVar);
            return arrayList;
        }
        arrayList.add(0, aVar4);
        arrayList.add(0, aVar);
        return arrayList;
    }

    @Nullable
    private static C0724b a(Map<a, C0724b> map, a aVar) {
        if (!k.a(map) && aVar != null) {
            Iterator<a> it = a(aVar).iterator();
            while (it.hasNext()) {
                C0724b c0724b = map.get(it.next());
                if (a(c0724b)) {
                    return c0724b;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0034 A[PHI: r0
  0x0034: PHI (r0v2 sg.bigo.ads.controller.a.a.b$b) = 
  (r0v1 sg.bigo.ads.controller.a.a.b$b)
  (r0v5 sg.bigo.ads.controller.a.a.b$b)
  (r0v7 sg.bigo.ads.controller.a.a.b$b)
  (r0v9 sg.bigo.ads.controller.a.a.b$b)
 binds: [B:3:0x000b, B:5:0x0017, B:7:0x0023, B:9:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    @Nullable
    private C0724b a(a aVar, boolean z10) {
        boolean z11;
        C0724b c0724bA = a(this.f70352f, aVar);
        if (a(c0724bA)) {
            z11 = true;
        } else {
            c0724bA = b(this.f70353g, aVar);
            if (a(c0724bA)) {
                z11 = true;
            } else {
                c0724bA = a(this.f70355i, aVar);
                if (a(c0724bA)) {
                    z11 = true;
                } else {
                    c0724bA = b(this.f70356j, aVar);
                    if (a(c0724bA)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
            }
        }
        StringBuilder sb2 = new StringBuilder("getBestHost ");
        sb2.append(z11 ? "success" : C3426d4.g.f28496e);
        sb2.append(z10 ? " after reset" : "");
        sb2.append(", countryKey=");
        sb2.append(aVar);
        sb2.append(", currentHost=");
        sb2.append(this.f70348b);
        sg.bigo.ads.common.t.a.a(0, 3, "AntiBanHost", sb2.toString());
        if (a(c0724bA)) {
            return c0724bA;
        }
        return null;
    }

    private void a(Map<a, C0724b> map, Map<a, List<C0724b>> map2, String str, int i10) {
        C0724b value;
        C0724b c0724b;
        synchronized (this) {
            if (!k.a(this.f70352f) && !k.a(map)) {
                for (Map.Entry<a, C0724b> entry : this.f70352f.entrySet()) {
                    a key = entry.getKey();
                    if (key != null && (value = entry.getValue()) != null && (c0724b = map.get(key)) != null && value.equals(c0724b)) {
                        value.a(c0724b.b());
                    }
                }
            }
            if (!k.a(this.f70353g) && !k.a(map2)) {
                for (Map.Entry<a, List<C0724b>> entry2 : this.f70353g.entrySet()) {
                    a key2 = entry2.getKey();
                    if (key2 != null) {
                        List<C0724b> value2 = entry2.getValue();
                        if (!k.a((Collection) value2)) {
                            List<C0724b> list = map2.get(key2);
                            if (!k.a((Collection) list)) {
                                for (C0724b c0724b2 : value2) {
                                    if (c0724b2 != null) {
                                        for (C0724b c0724b3 : list) {
                                            if (c0724b2.equals(c0724b3)) {
                                                c0724b2.a(c0724b3.b());
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            C0724b c0724b4 = this.f70348b;
            if (c0724b4 != null) {
                if (c0724b4.d() != 1) {
                    if (this.f70348b.d() == 2) {
                        List<C0724b> list2 = this.f70353g.get(new a(str, i10));
                        if (!k.a((Collection) list2)) {
                            for (C0724b c0724b5 : list2) {
                                if (this.f70348b.equals(c0724b5)) {
                                    this.f70348b.a(c0724b5.b());
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    C0724b c0724b6 = this.f70352f.get(new a(str, i10));
                    if (this.f70348b.equals(c0724b6)) {
                        this.f70348b.a(c0724b6.b());
                    }
                }
            }
        }
    }

    private static boolean a(C0724b c0724b) {
        return c0724b != null && c0724b.f70362d;
    }

    @NonNull
    private Map<a, C0724b> b() {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(this.f70350d)) {
            map.put(new a("all", 0), new C0724b(this.f70350d, "", 0));
        }
        if (!TextUtils.isEmpty(this.f70351e)) {
            map.put(new a("ru", 0), new C0724b(this.f70351e, "", 0));
        }
        return map;
    }

    @Nullable
    private C0724b b(Map<a, List<C0724b>> map, a aVar) {
        if (!k.a(map) && aVar != null) {
            Iterator<a> it = a(aVar).iterator();
            while (it.hasNext()) {
                C0724b c0724b = (C0724b) k.a(k.a(map.get(it.next()), new Comparable<C0724b>() { // from class: sg.bigo.ads.controller.a.a.b.1
                    @Override // java.lang.Comparable
                    public final /* bridge */ /* synthetic */ int compareTo(C0724b c0724b2) {
                        C0724b c0724b3 = c0724b2;
                        return (c0724b3 == null || !c0724b3.f70362d) ? 0 : 1;
                    }
                }));
                if (a(c0724b)) {
                    return c0724b;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0081  */
    public final Pair<String, Integer> a(sg.bigo.ads.api.a.h hVar) {
        synchronized (this) {
            if (k.a(this.f70352f)) {
                return null;
            }
            if (hVar == null) {
                return null;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator<Map.Entry<a, C0724b>> it = this.f70352f.entrySet().iterator();
            while (it.hasNext()) {
                C0724b value = it.next().getValue();
                if (!value.f70362d) {
                    if (value.f70363f % hVar.y() == 0) {
                        C0724b.c(value);
                        if (value.f70364g != 0 && Math.round(Math.abs(jCurrentTimeMillis - value.f70364g) / 8.64E7f) <= hVar.A()) {
                            value = null;
                        }
                    } else if (Math.round(Math.abs(jCurrentTimeMillis - value.f70364g) / 60000.0f) <= hVar.z()) {
                        value = null;
                    }
                    if (value != null) {
                        value.f70364g = jCurrentTimeMillis;
                        C0724b.e(value);
                        return new Pair<>(value.a(), Integer.valueOf(value.f70363f));
                    }
                }
            }
            return null;
        }
    }

    @NonNull
    public final sg.bigo.ads.controller.a.e a(String str, int i10) {
        boolean z10;
        synchronized (this) {
            C0724b c0724b = this.f70348b;
            if (c0724b != null && this.f70349c < this.f70354h) {
                return new sg.bigo.ads.controller.a.e(c0724b, false, false);
            }
            a aVar = new a(str, i10);
            C0724b c0724bA = a(aVar, false);
            if (a(c0724bA)) {
                z10 = false;
            } else {
                a();
                c0724bA = a(aVar, true);
                z10 = true;
            }
            if (a(c0724bA)) {
                c0724bA.f70362d = false;
                this.f70347a = this.f70348b;
                this.f70348b = new C0724b(c0724bA.a(), c0724bA.b(), c0724bA.d());
                this.f70349c = 0;
            }
            if (this.f70348b == null) {
                this.f70348b = new C0724b(this.f70350d, "", 0);
            }
            return new sg.bigo.ads.controller.a.e(this.f70348b, z10, true);
        }
    }

    public final void a() {
        Map<a, C0724b> map = this.f70352f;
        if (map != null) {
            Iterator<Map.Entry<a, C0724b>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                C0724b value = it.next().getValue();
                if (value != null) {
                    value.f70362d = true;
                }
            }
        }
        Map<a, List<C0724b>> map2 = this.f70353g;
        if (map2 != null) {
            Iterator<Map.Entry<a, List<C0724b>>> it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                List<C0724b> value2 = it2.next().getValue();
                if (!k.a((Collection) value2)) {
                    Iterator<C0724b> it3 = value2.iterator();
                    while (it3.hasNext()) {
                        it3.next().f70362d = true;
                    }
                }
            }
        }
        Map<a, List<C0724b>> map3 = this.f70356j;
        if (map3 != null) {
            Iterator<Map.Entry<a, List<C0724b>>> it4 = map3.entrySet().iterator();
            while (it4.hasNext()) {
                List<C0724b> value3 = it4.next().getValue();
                if (!k.a((Collection) value3)) {
                    Iterator<C0724b> it5 = value3.iterator();
                    while (it5.hasNext()) {
                        it5.next().f70362d = true;
                    }
                }
            }
        }
        Map<a, C0724b> map4 = this.f70355i;
        if (map4 != null) {
            Iterator<Map.Entry<a, C0724b>> it6 = map4.entrySet().iterator();
            while (it6.hasNext()) {
                C0724b value4 = it6.next().getValue();
                if (value4 != null) {
                    value4.f70362d = true;
                }
            }
        }
        this.f70347a = this.f70348b;
        this.f70348b = null;
        this.f70349c = 0;
    }

    @Override // sg.bigo.ads.common.f
    @CallSuper
    public void a(@NonNull Parcel parcel) {
        synchronized (this) {
            n.a(parcel, this.f70352f);
            n.b(parcel, this.f70353g);
            parcel.writeInt(this.f70354h);
            n.a(parcel, this.f70355i);
            n.b(parcel, this.f70356j);
            n.a(parcel, this.f70347a);
            n.a(parcel, this.f70348b);
            parcel.writeInt(this.f70349c);
        }
    }

    public void a(@NonNull JSONObject jSONObject, boolean z10, String str, int i10) {
        synchronized (this) {
            HashMap map = new HashMap();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("country_hosts");
            if (jSONArrayOptJSONArray != null) {
                for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i11);
                    if (jSONObjectOptJSONObject != null) {
                        String strOptString = jSONObjectOptJSONObject.optString("host", "");
                        if (sg.bigo.ads.controller.a.d.a(strOptString)) {
                            map.put(new a(jSONObjectOptJSONObject.optString("country", "all"), jSONObjectOptJSONObject.optInt("app_flag", 0)), new C0724b(strOptString, jSONObjectOptJSONObject.optString("domain_front", ""), 1));
                        }
                    }
                }
            }
            HashMap map2 = new HashMap();
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("backup_hosts");
            if (jSONArrayOptJSONArray2 != null) {
                for (int i12 = 0; i12 < jSONArrayOptJSONArray2.length(); i12++) {
                    JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(i12);
                    if (jSONObjectOptJSONObject2 != null) {
                        a aVar = new a(jSONObjectOptJSONObject2.optString("country", "all"), jSONObjectOptJSONObject2.optInt("app_flag", 0));
                        List<C0724b> arrayList = map2.get(aVar);
                        if (arrayList == null) {
                            arrayList = new ArrayList<>();
                            map2.put(aVar, arrayList);
                        }
                        String strOptString2 = jSONObjectOptJSONObject2.optString("domain_front", "");
                        JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject2.optJSONArray("hosts");
                        if (jSONArrayOptJSONArray3 != null) {
                            for (int i13 = 0; i13 < jSONArrayOptJSONArray3.length(); i13++) {
                                String strOptString3 = jSONArrayOptJSONArray3.optString(i13, "");
                                if (sg.bigo.ads.controller.a.d.a(strOptString3)) {
                                    C0724b c0724b = new C0724b(strOptString3, strOptString2, 2);
                                    if (!arrayList.contains(c0724b)) {
                                        arrayList.add(c0724b);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (z10) {
                a(map, map2, str, i10);
            } else {
                int iOptInt = jSONObject.optInt("threshold", 3);
                this.f70352f = map;
                this.f70353g = map2;
                this.f70354h = iOptInt;
                this.f70356j = new HashMap();
                this.f70355i = b();
                this.f70347a = this.f70348b;
                this.f70348b = null;
                this.f70349c = 0;
            }
        }
    }

    public final boolean a(String str, String str2) {
        synchronized (this) {
            if (!sg.bigo.ads.controller.a.d.a(str2)) {
                return false;
            }
            a aVar = new a(str, 0);
            if (this.f70356j == null) {
                this.f70356j = new HashMap();
            }
            List<C0724b> arrayList = this.f70356j.get(aVar);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f70356j.put(aVar, arrayList);
            }
            C0724b c0724b = new C0724b(str2, "", 3);
            if (arrayList.contains(c0724b)) {
                return false;
            }
            arrayList.add(c0724b);
            return true;
        }
    }

    public final boolean a(String str, String str2, int i10, sg.bigo.ads.api.a.h hVar, boolean z10) {
        Map<a, C0724b> map;
        Map<a, List<C0724b>> map2;
        boolean z11;
        synchronized (this) {
            if (!TextUtils.isEmpty(str) && (map = this.f70352f) != null && hVar != null) {
                C0724b c0724b = null;
                Iterator<Map.Entry<a, C0724b>> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    C0724b value = it.next().getValue();
                    if (!TextUtils.equals(value.a(), str)) {
                        z11 = false;
                    } else {
                        if (z10) {
                            C0724b.c(value);
                            C0724b.f(value);
                            break;
                        }
                        C0724b.g(value);
                        z11 = true;
                    }
                    if (z11 && value.f70365h != 0 && value.f70365h % hVar.y() == 0) {
                        c0724b = value;
                        break;
                    }
                }
                if (c0724b == null) {
                    return false;
                }
                C0724b.c(c0724b);
                C0724b.f(c0724b);
                C0724b c0724bA = a(this.f70352f, new a(str2, i10));
                if (c0724bA != null) {
                    c0724b = c0724bA;
                }
                C0724b c0724b2 = this.f70348b;
                if (c0724b2 != null) {
                    synchronized (this) {
                        ArrayList arrayList = new ArrayList();
                        int iD = c0724b2.d();
                        if (iD == 0) {
                            Map<a, C0724b> map3 = this.f70355i;
                            if (map3 != null) {
                                for (C0724b c0724b3 : map3.values()) {
                                    if (c0724b3 != null && TextUtils.equals(c0724b3.a(), c0724b2.a())) {
                                        arrayList.add(c0724b3);
                                    }
                                }
                            }
                        } else if (iD == 1) {
                            Map<a, C0724b> map4 = this.f70352f;
                            if (map4 != null) {
                                for (C0724b c0724b4 : map4.values()) {
                                    if (c0724b4 != null && TextUtils.equals(c0724b4.a(), c0724b2.a())) {
                                        arrayList.add(c0724b4);
                                    }
                                }
                            }
                        } else if (iD == 2) {
                            Map<a, List<C0724b>> map5 = this.f70353g;
                            if (map5 != null) {
                                Iterator<List<C0724b>> it2 = map5.values().iterator();
                                while (it2.hasNext()) {
                                    for (C0724b c0724b5 : it2.next()) {
                                        if (c0724b5 != null && TextUtils.equals(c0724b5.a(), c0724b2.a())) {
                                            arrayList.add(c0724b5);
                                        }
                                    }
                                }
                            }
                        } else if (iD == 3 && (map2 = this.f70356j) != null) {
                            Iterator<List<C0724b>> it3 = map2.values().iterator();
                            while (it3.hasNext()) {
                                for (C0724b c0724b6 : it3.next()) {
                                    if (c0724b6 != null && TextUtils.equals(c0724b6.a(), c0724b2.a())) {
                                        arrayList.add(c0724b6);
                                    }
                                }
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it4 = arrayList.iterator();
                            while (it4.hasNext()) {
                                ((C0724b) it4.next()).f70362d = true;
                            }
                        }
                    }
                }
                this.f70347a = this.f70348b;
                this.f70348b = c0724b;
                this.f70349c = 0;
                return true;
            }
            return false;
        }
    }

    @Override // sg.bigo.ads.common.f
    @CallSuper
    public void b(@NonNull Parcel parcel) {
        synchronized (this) {
            this.f70352f = n.a(parcel, a.f70358c, C0724b.f70361e);
            this.f70353g = n.b(parcel, a.f70358c, C0724b.f70361e);
            this.f70354h = n.a(parcel, 3);
            Map mapA = n.a(parcel, a.f70358c, C0724b.f70361e);
            this.f70356j = n.b(parcel, a.f70358c, C0724b.f70361e);
            this.f70347a = (C0724b) n.b(parcel, C0724b.f70361e);
            this.f70348b = (C0724b) n.b(parcel, C0724b.f70361e);
            this.f70349c = n.a(parcel, 0);
            this.f70355i = b();
            HashSet hashSet = new HashSet();
            for (C0724b c0724b : this.f70355i.values()) {
                hashSet.add(c0724b.a());
                if (!k.a(mapA)) {
                    for (C0724b c0724b2 : mapA.values()) {
                        if (TextUtils.equals(c0724b.a(), c0724b2.a())) {
                            c0724b.f70362d = c0724b2.f70362d;
                        }
                    }
                }
            }
            C0724b c0724b3 = this.f70348b;
            if (c0724b3 != null && c0724b3.d() == 0 && !hashSet.contains(this.f70348b.a())) {
                this.f70347a = this.f70348b;
                this.f70348b = null;
                this.f70349c = 0;
            }
        }
    }

    @NonNull
    public String toString() {
        return super.toString();
    }
}
