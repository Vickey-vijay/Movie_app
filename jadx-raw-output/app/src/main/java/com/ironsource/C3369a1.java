package com.ironsource;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.a1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@Deprecated
public class C3369a1 implements Parcelable {
    public static final Parcelable.Creator<C3369a1> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f28066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f28067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f28068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f28069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f28070e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ArrayList<String> f28071f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ArrayList<String> f28072g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ArrayList<String> f28073h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList<String> f28074i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f28075j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f28076k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Map<String, String> f28077l;

    /* JADX INFO: renamed from: com.ironsource.a1$a */
    public class a implements Parcelable.Creator<C3369a1> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C3369a1 createFromParcel(Parcel parcel) {
            return new C3369a1(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C3369a1[] newArray(int i10) {
            return new C3369a1[i10];
        }
    }

    public C3369a1() {
        i();
    }

    private void i() {
        this.f28069d = false;
        this.f28070e = -1;
        this.f28071f = new ArrayList<>();
        this.f28072g = new ArrayList<>();
        this.f28073h = new ArrayList<>();
        this.f28074i = new ArrayList<>();
        this.f28076k = "";
        this.f28075j = "";
        this.f28077l = new HashMap();
    }

    public void a(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!z10) {
            this.f28072g.remove(str);
        } else if (this.f28072g.indexOf(str) == -1) {
            this.f28072g.add(str);
        }
    }

    public boolean b(String str) {
        return !TextUtils.isEmpty(str) && this.f28072g.indexOf(str) > -1;
    }

    public boolean c(String str) {
        return !TextUtils.isEmpty(str) && this.f28074i.indexOf(str) > -1;
    }

    public String d() {
        return this.f28075j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Map<String, String> e() {
        return this.f28077l;
    }

    public String f() {
        return this.f28076k;
    }

    public void g(String str) {
        this.f28075j = str;
    }

    public void h(String str) {
        this.f28076k = str;
    }

    public boolean j() {
        return this.f28069d;
    }

    public boolean d(String str) {
        return !TextUtils.isEmpty(str) && this.f28071f.indexOf(str) > -1;
    }

    public boolean e(String str) {
        return !TextUtils.isEmpty(str) && this.f28073h.indexOf(str) > -1;
    }

    public void f(String str) {
        this.f28068c = str;
    }

    public String g() {
        return this.f28066a;
    }

    public String h() {
        return this.f28067b;
    }

    public void j(String str) {
        this.f28067b = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        try {
            sb2.append("shouldRestore:");
            sb2.append(this.f28069d);
            sb2.append(", ");
            sb2.append("displayedProduct:");
            sb2.append(this.f28070e);
            sb2.append(", ");
            sb2.append("ISReportInit:");
            sb2.append(this.f28071f);
            sb2.append(", ");
            sb2.append("ISInitSuccess:");
            sb2.append(this.f28072g);
            sb2.append(", ");
            sb2.append("ISAppKey");
            sb2.append(this.f28075j);
            sb2.append(", ");
            sb2.append("ISUserId");
            sb2.append(this.f28076k);
            sb2.append(", ");
            sb2.append("ISExtraParams");
            sb2.append(this.f28077l);
            sb2.append(", ");
        } catch (Throwable th2) {
            C3676r4.d().a(th2);
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        try {
            parcel.writeByte(this.f28069d ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.f28070e);
            parcel.writeString(this.f28066a);
            parcel.writeString(this.f28067b);
            parcel.writeString(this.f28068c);
            parcel.writeString(this.f28075j);
            parcel.writeString(this.f28076k);
            parcel.writeString(new JSONObject(this.f28077l).toString());
        } catch (Throwable th2) {
            C3676r4.d().a(th2);
        }
    }

    private C3369a1(Parcel parcel) {
        i();
        try {
            this.f28069d = parcel.readByte() != 0;
            this.f28070e = parcel.readInt();
            this.f28066a = parcel.readString();
            this.f28067b = parcel.readString();
            this.f28068c = parcel.readString();
            this.f28075j = parcel.readString();
            this.f28076k = parcel.readString();
            this.f28077l = a(parcel.readString());
        } catch (Throwable th2) {
            C3676r4.d().a(th2);
            i();
        }
    }

    public String b() {
        return this.f28068c;
    }

    public int c() {
        return this.f28070e;
    }

    public void b(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (z10) {
            if (this.f28074i.indexOf(str) == -1) {
                this.f28074i.add(str);
                return;
            }
            return;
        }
        this.f28074i.remove(str);
    }

    public void c(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (z10) {
            if (this.f28071f.indexOf(str) == -1) {
                this.f28071f.add(str);
                return;
            }
            return;
        }
        this.f28071f.remove(str);
    }

    public void d(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (z10) {
            if (this.f28073h.indexOf(str) == -1) {
                this.f28073h.add(str);
                return;
            }
            return;
        }
        this.f28073h.remove(str);
    }

    public void a(Map<String, String> map) {
        this.f28077l = map;
    }

    public void a(boolean z10) {
        this.f28069d = z10;
    }

    public void a(int i10) {
        this.f28070e = i10;
    }

    public void a() {
        this.f28070e = -1;
    }

    private Map<String, String> a(String str) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit(str);
            Iterator<String> itKeys = jSONObjectJsonObjectInit.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObjectJsonObjectInit.getString(next));
            }
        } catch (JSONException e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        } catch (Throwable th2) {
            C3676r4.d().a(th2);
            IronLog.INTERNAL.error(th2.toString());
        }
        return map;
    }

    public void i(String str) {
        this.f28066a = str;
    }
}
