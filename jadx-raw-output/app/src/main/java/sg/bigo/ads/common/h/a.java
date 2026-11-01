package sg.bigo.ads.common.h;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.common.utils.f;

/* JADX INFO: loaded from: classes8.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f69659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f69660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f69661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f69662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f69663e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f69664f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f69665g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f69666h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f69667i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f69671m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f69674p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f69675q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private c f69677s;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f69668j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f69669k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f69670l = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f69672n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f69673o = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private C0707a f69676r = new C0707a();

    /* JADX INFO: renamed from: sg.bigo.ads.common.h.a$a, reason: collision with other inner class name */
    public static class C0707a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f69678a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f69679b = false;

        public final String a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("support_pd_flag", Integer.valueOf(this.f69678a));
            } catch (JSONException unused) {
            }
            return jSONObject.toString();
        }
    }

    public a(@NonNull String str, @NonNull String str2, @NonNull String str3, boolean z10, boolean z11, boolean z12, @Nullable c cVar) {
        this.f69660b = str;
        this.f69661c = str2;
        this.f69662d = str3;
        this.f69663e = z10 ? 1 : 0;
        this.f69664f = z12;
        this.f69675q = z11;
        String strA = a();
        long jA = f.a(strA, 1);
        this.f69665g = jA <= 0 ? f.a(f.d(strA), 1) : jA;
        String strValueOf = String.valueOf(str.hashCode());
        this.f69659a = strValueOf;
        this.f69677s = cVar;
        sg.bigo.ads.common.t.a.a(0, 3, "DownloadInfo", "newInstance mId = " + strValueOf + ", savedSize = " + this.f69665g + ", mIsSupportFillTime = " + c());
    }

    public final String a() {
        return this.f69661c + File.separator + this.f69662d;
    }

    public final boolean b() {
        return this.f69668j == 3;
    }

    public final boolean c() {
        c cVar = this.f69677s;
        return cVar != null && cVar.f69726a;
    }

    public final boolean d() {
        c cVar = this.f69677s;
        return cVar != null && cVar.f69727b;
    }

    public final int e() {
        c cVar = this.f69677s;
        if (cVar != null) {
            return cVar.f69728c;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != a.class) {
            return false;
        }
        a aVar = (a) obj;
        return this.f69660b.equals(aVar.f69660b) && this.f69662d.equals(aVar.f69662d) && this.f69661c.equals(aVar.f69661c);
    }

    public final int f() {
        c cVar = this.f69677s;
        if (cVar != null) {
            return cVar.f69729d;
        }
        return 5;
    }

    public final int g() {
        c cVar = this.f69677s;
        if (cVar != null) {
            return cVar.f69730e;
        }
        return 20;
    }

    public final boolean h() {
        if (this.f69660b.endsWith(".mp4") && this.f69676r.f69678a == -1) {
            if (f.a(f.d(a()))) {
                this.f69676r.f69678a = 1;
            } else {
                this.f69676r.f69678a = 0;
            }
        }
        return this.f69676r.f69678a == 1;
    }

    @NonNull
    public String toString() {
        return " url = " + this.f69660b + StringUtils.COMMA + " fileName = " + this.f69662d + StringUtils.COMMA + " filePath = " + this.f69661c + StringUtils.COMMA + " downloadCount = " + this.f69669k + StringUtils.COMMA + " totalSize = " + this.f69667i + StringUtils.COMMA + " loadedSize = " + this.f69665g + StringUtils.COMMA + " mState = " + this.f69668j + StringUtils.COMMA + " mLastDownloadEndTime = " + this.f69670l + StringUtils.COMMA + " mExt = " + this.f69676r.a() + StringUtils.COMMA + " contentType = " + this.f69674p + " isSupportFillTime = " + c() + " adFillTime = " + e() + " adCheckProcessTime = " + f() + " adCheckMinProcess = " + g();
    }
}
