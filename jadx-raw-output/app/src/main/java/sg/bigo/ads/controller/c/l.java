package sg.bigo.ads.controller.c;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.MimeTypeMap;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C3426d4;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.api.core.t;

/* JADX INFO: loaded from: classes8.dex */
public final class l extends b implements sg.bigo.ads.core.a.a {
    private static final AtomicInteger K = new AtomicInteger();
    public String A;

    @Nullable
    public sg.bigo.ads.api.core.n.a B;

    @Nullable
    public sg.bigo.ads.api.core.n.a[] C;

    @Nullable
    public sg.bigo.ads.api.core.n.c D;
    public int E;
    public int F;

    @Nullable
    public sg.bigo.ads.api.core.n.b G;

    @Nullable
    public sg.bigo.ads.api.core.n.d H;
    public int I;

    @Nullable
    public sg.bigo.ads.api.core.h.b J;

    @Nullable
    private sg.bigo.ads.core.f.a.p L;

    @Nullable
    private sg.bigo.ads.api.core.m M;
    private boolean N;
    private String O;

    @NonNull
    private int P;
    private int Q;

    @NonNull
    private long R;
    private sg.bigo.ads.core.f.a.a.C0736a S;
    private sg.bigo.ads.core.f.a.a.C0736a T;
    private boolean U;
    private boolean V;
    private int W;
    private int X;
    private int Y;
    private int Z;

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    private Pair<Bitmap, String> f70676aa;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private boolean f70677ab;

    /* JADX INFO: renamed from: ac, reason: collision with root package name */
    private final String f70678ac;

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    private String f70679ad;

    /* JADX INFO: renamed from: ae, reason: collision with root package name */
    private boolean f70680ae;

    /* JADX INFO: renamed from: af, reason: collision with root package name */
    private t f70681af;

    /* JADX INFO: renamed from: ag, reason: collision with root package name */
    private int f70682ag;

    /* JADX INFO: renamed from: ah, reason: collision with root package name */
    private AtomicInteger f70683ah;

    /* JADX INFO: renamed from: ai, reason: collision with root package name */
    private AtomicInteger f70684ai;

    /* JADX INFO: renamed from: aj, reason: collision with root package name */
    private int f70685aj;

    public l(long j10, @NonNull sg.bigo.ads.api.core.g gVar, @NonNull sg.bigo.ads.api.a.l lVar, @NonNull JSONObject jSONObject) {
        super(j10, gVar, lVar, jSONObject);
        this.F = 0;
        this.I = 0;
        this.N = false;
        this.P = 0;
        this.Q = 0;
        this.U = false;
        this.V = false;
        this.W = 4;
        this.X = 6;
        this.Y = 4;
        this.Z = 0;
        this.f70677ab = false;
        this.f70683ah = new AtomicInteger(0);
        this.f70684ai = new AtomicInteger(0);
        this.A = jSONObject.optString("iurl");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("icon");
        if (jSONObjectOptJSONObject != null) {
            this.B = new i(jSONObjectOptJSONObject);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("images");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject2 != null) {
                    arrayList.add(new i(jSONObjectOptJSONObject2));
                }
            }
            i[] iVarArr = new i[arrayList.size()];
            this.C = iVarArr;
            this.C = (sg.bigo.ads.api.core.n.a[]) arrayList.toArray(iVarArr);
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("video");
        if (jSONObjectOptJSONObject3 != null) {
            this.D = new r(jSONObjectOptJSONObject3);
        }
        this.G = new j(jSONObject);
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("ad_play_cfg");
        if (jSONObjectOptJSONObject4 != null) {
            this.H = new s(jSONObjectOptJSONObject4);
        }
        this.E = jSONObject.optInt("immersive_ad_type", 0);
        JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("display");
        if (jSONObjectOptJSONObject5 != null) {
            this.J = new h(jSONObjectOptJSONObject5);
        }
        this.f70678ac = this.f70631k + "_" + this.f70622b + "_" + K.addAndGet(1);
    }

    @Nullable
    private sg.bigo.ads.core.f.a.b bu() {
        sg.bigo.ads.core.f.a.p pVar = this.L;
        if (pVar != null) {
            return pVar.f71473n;
        }
        return null;
    }

    @Override // sg.bigo.ads.api.core.n
    @NonNull
    public final String a(Context context) {
        return aS() ? sg.bigo.ads.common.o.c(context) : sg.bigo.ads.common.o.b(context);
    }

    @Override // sg.bigo.ads.api.core.n
    public final void a(Pair<Bitmap, String> pair) {
        this.f70676aa = pair;
    }

    @Override // sg.bigo.ads.api.core.n
    public final void a(sg.bigo.ads.api.core.m mVar) {
        sg.bigo.ads.api.core.m mVar2 = this.M;
        if (mVar2 == null || mVar2.f69411c <= 0 || mVar.f69411c != 0) {
            this.M = mVar;
        }
    }

    @Override // sg.bigo.ads.core.a.a
    public final void a(sg.bigo.ads.core.f.a.a.C0736a c0736a) {
        this.S = c0736a;
    }

    @Override // sg.bigo.ads.core.a.a
    public final void a(sg.bigo.ads.core.f.a.p pVar) {
        this.L = pVar;
        if (pVar != null && sg.bigo.ads.common.utils.q.b((CharSequence) pVar.f71472m)) {
            N().a(this.L.f71472m);
        }
        sg.bigo.ads.api.core.n.d dVar = this.H;
        if (dVar != null) {
            dVar.a(aU());
        }
    }

    @Override // sg.bigo.ads.api.core.n
    @Nullable
    public final sg.bigo.ads.api.core.n.b aA() {
        return this.G;
    }

    @Override // sg.bigo.ads.api.core.n
    @Nullable
    public final sg.bigo.ads.api.core.n.d aB() {
        return this.H;
    }

    @Override // sg.bigo.ads.api.core.n
    public final int aC() {
        return this.P;
    }

    @Override // sg.bigo.ads.api.core.n
    public final int aD() {
        return this.Q;
    }

    @Override // sg.bigo.ads.api.core.n
    public final long aE() {
        return this.R;
    }

    @Override // sg.bigo.ads.api.core.n
    public final boolean aF() {
        sg.bigo.ads.core.f.a.a.C0736a c0736a = this.T;
        return c0736a != null && c0736a.a();
    }

    @Override // sg.bigo.ads.api.core.n
    public final boolean aG() {
        sg.bigo.ads.core.f.a.a.C0736a c0736a = this.S;
        return c0736a != null && c0736a.a();
    }

    @Override // sg.bigo.ads.api.core.n
    public final int aH() {
        return this.F;
    }

    @Override // sg.bigo.ads.api.core.n
    public final String aI() {
        return this.f70679ad;
    }

    @Override // sg.bigo.ads.api.core.n
    public final String aJ() {
        return !TextUtils.isEmpty(this.f70678ac) ? this.f70678ac : String.valueOf(this.f70629i);
    }

    @Override // sg.bigo.ads.api.core.n
    @Nullable
    public final String aK() {
        sg.bigo.ads.core.f.a.b bVarBu = bu();
        if (bVarBu != null) {
            return bVarBu.f71416c;
        }
        return null;
    }

    @Override // sg.bigo.ads.api.core.n
    public final long aL() {
        sg.bigo.ads.api.core.n.d dVar = this.H;
        if (dVar != null) {
            return dVar.a();
        }
        return 0L;
    }

    @Override // sg.bigo.ads.api.core.n
    public final int aM() {
        return this.I;
    }

    @Override // sg.bigo.ads.api.core.n
    public final String aN() {
        sg.bigo.ads.core.f.a.b bVarBu = bu();
        String str = bVarBu != null ? bVarBu.f71418e : null;
        if (sg.bigo.ads.common.utils.q.b((CharSequence) str)) {
            return str;
        }
        sg.bigo.ads.core.f.a.p pVar = this.L;
        if (pVar != null) {
            return pVar.f71474o;
        }
        return null;
    }

    @Override // sg.bigo.ads.api.core.n
    public final boolean aO() {
        sg.bigo.ads.api.core.n.d dVar;
        if (!aS() && (dVar = this.H) != null && dVar.b() && dVar.c() < 100) {
            sg.bigo.ads.core.f.a.b bVarBu = bu();
            if (bVarBu != null ? "video/mp4".equals(bVarBu.f71417d) : false) {
                return true;
            }
        }
        return false;
    }

    @Override // sg.bigo.ads.api.core.n
    @Nullable
    public final String aP() {
        return aK();
    }

    @Override // sg.bigo.ads.api.core.n
    @Nullable
    public final String aQ() {
        String strAN = aN();
        if (!sg.bigo.ads.common.utils.q.a((CharSequence) strAN)) {
            return strAN;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(hashCode());
        return sb2.toString();
    }

    @Override // sg.bigo.ads.api.core.n
    public final boolean aR() {
        return this.f70627g == 2;
    }

    @Override // sg.bigo.ads.api.core.n
    public final boolean aS() {
        sg.bigo.ads.core.f.a.b bVarBu = bu();
        return bVarBu != null && bVarBu.a();
    }

    @Override // sg.bigo.ads.api.core.n
    public final String aT() {
        sg.bigo.ads.api.core.n.a aVar;
        sg.bigo.ads.api.core.n.a[] aVarArr = this.C;
        if (aVarArr == null || aVarArr.length <= 0 || (aVar = aVarArr[0]) == null) {
            return null;
        }
        return aVar.c();
    }

    @Override // sg.bigo.ads.api.core.n
    public final long aU() {
        sg.bigo.ads.core.f.a.p pVar = this.L;
        if (pVar != null) {
            return pVar.f71478s;
        }
        return 0L;
    }

    @Override // sg.bigo.ads.api.core.n
    @Nullable
    public final sg.bigo.ads.api.core.m aV() {
        return this.M;
    }

    @Override // sg.bigo.ads.api.core.n
    public final boolean aW() {
        return this.N;
    }

    @Override // sg.bigo.ads.api.core.n
    public final void aX() {
        this.N = true;
    }

    @Override // sg.bigo.ads.api.core.n
    public final String aY() {
        String strAT;
        if (!sg.bigo.ads.common.utils.q.a((CharSequence) this.O)) {
            return this.O;
        }
        if (aR()) {
            sg.bigo.ads.core.f.a.b bVarBu = bu();
            if (bVarBu != null) {
                this.O = bVarBu.f71417d;
            }
            if (!sg.bigo.ads.common.utils.q.a((CharSequence) this.O)) {
                return this.O;
            }
            strAT = aK();
        } else {
            strAT = aT();
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(strAT));
        this.O = mimeTypeFromExtension;
        return mimeTypeFromExtension;
    }

    @Override // sg.bigo.ads.api.core.n
    public final boolean aZ() {
        return this.f70677ab;
    }

    @Override // sg.bigo.ads.api.core.n
    @Nullable
    public final sg.bigo.ads.api.core.n.a av() {
        return this.B;
    }

    @Override // sg.bigo.ads.api.core.n
    @Nullable
    public final sg.bigo.ads.api.core.h.b aw() {
        return this.J;
    }

    @Override // sg.bigo.ads.api.core.n
    @Nullable
    public final sg.bigo.ads.api.core.n.a[] ax() {
        return this.C;
    }

    @Override // sg.bigo.ads.api.core.n
    @Nullable
    public final sg.bigo.ads.api.core.n.c ay() {
        return this.D;
    }

    @Override // sg.bigo.ads.api.core.n
    @Nullable
    public final String az() {
        return this.A;
    }

    @Override // sg.bigo.ads.api.core.n
    @NonNull
    public final String b(Context context) {
        return a(context) + File.separator + aQ();
    }

    @Override // sg.bigo.ads.api.core.n
    public final void b(long j10) {
        this.R = j10;
    }

    @Override // sg.bigo.ads.core.a.a
    public final void b(sg.bigo.ads.core.f.a.a.C0736a c0736a) {
        this.T = c0736a;
    }

    @Override // sg.bigo.ads.api.core.n
    public final void ba() {
        this.f70677ab = true;
    }

    @Override // sg.bigo.ads.api.core.n
    public final boolean bb() {
        return this.U;
    }

    @Override // sg.bigo.ads.api.core.n
    public final void bc() {
        this.U = true;
    }

    @Override // sg.bigo.ads.api.core.n
    public final int bd() {
        return this.W;
    }

    @Override // sg.bigo.ads.api.core.n
    public final int be() {
        return this.X;
    }

    @Override // sg.bigo.ads.api.core.n
    public final int bf() {
        return this.Y;
    }

    @Override // sg.bigo.ads.api.core.n
    public final int bg() {
        return this.Z;
    }

    @Override // sg.bigo.ads.api.core.n
    public final Pair<Bitmap, String> bh() {
        return this.f70676aa;
    }

    @Override // sg.bigo.ads.api.core.n
    public final boolean bi() {
        return this.V;
    }

    @Override // sg.bigo.ads.api.core.n
    public final void bj() {
        this.V = true;
    }

    @Override // sg.bigo.ads.api.core.n
    public final void bk() {
        this.f70680ae = true;
    }

    @Override // sg.bigo.ads.api.core.n
    public final boolean bl() {
        return this.f70680ae;
    }

    @Override // sg.bigo.ads.api.core.n
    public final int bm() {
        return this.f70682ag;
    }

    @Override // sg.bigo.ads.api.core.n
    public final int bn() {
        return this.f70683ah.get();
    }

    @Override // sg.bigo.ads.api.core.n
    public final int bo() {
        return this.f70684ai.get();
    }

    @Override // sg.bigo.ads.api.core.n
    public final int bp() {
        return this.f70685aj;
    }

    @Override // sg.bigo.ads.core.a.a
    public final sg.bigo.ads.core.f.a.a.C0736a bq() {
        return this.S;
    }

    @Override // sg.bigo.ads.core.a.a
    public final sg.bigo.ads.core.f.a.a.C0736a br() {
        return this.T;
    }

    @Override // sg.bigo.ads.core.a.a
    @NonNull
    public final t bs() {
        if (this.f70681af == null) {
            this.f70681af = new t(this.f70646z);
        }
        return this.f70681af;
    }

    @Override // sg.bigo.ads.core.a.a
    public final sg.bigo.ads.core.f.a.p bt() {
        return this.L;
    }

    @Override // sg.bigo.ads.api.core.n
    public final String c(Context context) {
        Pair pair;
        if (!aO()) {
            this.I = 0;
            return b(context);
        }
        sg.bigo.ads.core.player.a.d dVarB = sg.bigo.ads.core.player.b.a().b();
        String strAK = aK();
        String strA = a(context);
        String strAQ = aQ();
        File file = new File(strA, strAQ);
        if (file.exists()) {
            pair = new Pair(Uri.fromFile(file).toString(), 1);
        } else if (dVarB.a()) {
            StringBuilder sb2 = new StringBuilder(strAK);
            if (strAK.contains("?")) {
                sb2.append(C3426d4.j.f28584c);
            } else {
                sb2.append("?");
            }
            sb2.append("path=");
            sb2.append(strA);
            sb2.append(C3426d4.j.f28584c);
            sb2.append("name=");
            sb2.append(strAQ);
            pair = new Pair(String.format(Locale.US, "http://%s:%d/%s", "127.0.0.1", Integer.valueOf(dVarB.f71764c), sg.bigo.ads.common.utils.q.e(sb2.toString())), 2);
        } else {
            pair = new Pair(strAK, 3);
        }
        this.I = ((Integer) pair.second).intValue();
        return (String) pair.first;
    }

    @Override // sg.bigo.ads.api.core.n
    public final void c(String str) {
        if ("video/mp4".equals(this.O) || sg.bigo.ads.common.utils.q.a((CharSequence) str)) {
            return;
        }
        this.O = str;
    }

    @Override // sg.bigo.ads.api.core.n
    public final boolean c(@IntRange(from = 1, to = 100) long j10) {
        sg.bigo.ads.api.core.n.d dVar = this.H;
        return j10 >= ((long) (dVar != null ? dVar.c() : 50));
    }

    @Override // sg.bigo.ads.api.core.n
    public final void f(int i10) {
        this.P = i10;
    }

    @Override // sg.bigo.ads.api.core.n
    public final void g(int i10) {
        this.Q = i10;
    }

    @Override // sg.bigo.ads.api.core.n
    public final void h(int i10) {
        this.W = i10;
    }

    @Override // sg.bigo.ads.api.core.n
    public final void i(int i10) {
        this.X = i10;
    }

    @Override // sg.bigo.ads.api.core.n
    public final void j(int i10) {
        this.Y = i10;
    }

    @Override // sg.bigo.ads.api.core.n
    public final void k(int i10) {
        this.Z = i10;
    }

    @Override // sg.bigo.ads.api.core.n
    public final void l(int i10) {
        this.f70682ag = i10;
    }

    @Override // sg.bigo.ads.api.core.n
    public final void m(int i10) {
        this.f70683ah.set(i10);
    }

    @Override // sg.bigo.ads.api.core.n
    public final void n(int i10) {
        this.f70684ai.set(i10);
    }

    @Override // sg.bigo.ads.api.core.n
    public final void o(int i10) {
        this.f70685aj = i10;
    }

    @Override // sg.bigo.ads.controller.c.b, sg.bigo.ads.api.core.b
    public final String s() {
        sg.bigo.ads.core.f.a.p pVar = this.L;
        return (pVar == null || !sg.bigo.ads.common.utils.q.b((CharSequence) pVar.f71475p)) ? super.s() : this.L.f71475p;
    }

    @Override // sg.bigo.ads.controller.c.b, sg.bigo.ads.api.core.b
    public final String t() {
        sg.bigo.ads.core.f.a.p pVar = this.L;
        return (pVar == null || !sg.bigo.ads.common.utils.q.b((CharSequence) pVar.f71476q)) ? super.t() : this.L.f71476q;
    }
}
