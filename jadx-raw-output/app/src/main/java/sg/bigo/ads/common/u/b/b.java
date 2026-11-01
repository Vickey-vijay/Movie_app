package sg.bigo.ads.common.u.b;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.G5;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.common.u.a;
import sg.bigo.ads.common.u.f;
import sg.bigo.ads.common.utils.k;

/* JADX INFO: loaded from: classes10.dex */
public class b<T extends sg.bigo.ads.common.u.a> extends c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f69939a = f.a("text/plain;charset=utf-8");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public JSONObject f69940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f69941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f f69942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f69943e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f69944f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f69945g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f69946h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f69947i;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f69948p;

    public b(int i10, @NonNull T t10, Context context) {
        super(i10, t10, true, context);
        this.f69947i = -1;
    }

    @Override // sg.bigo.ads.common.u.b.c
    @NonNull
    public final String a() {
        return "POST";
    }

    public final void a(Map<String, Object> map) {
        if (this.f69940b == null || k.a(map)) {
            return;
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            try {
                this.f69940b.putOpt(entry.getKey(), entry.getValue());
            } catch (JSONException unused) {
            }
        }
        this.f69941c = null;
    }

    @Override // sg.bigo.ads.common.u.b.c
    @Nullable
    public final f b() {
        f fVar = this.f69942d;
        return fVar != null ? fVar : f69939a;
    }

    @Override // sg.bigo.ads.common.u.b.c
    @Nullable
    public final byte[] c() {
        JSONObject jSONObject;
        if (this.f69941c == null && (jSONObject = this.f69940b) != null) {
            String string = jSONObject.toString();
            this.f69948p = string;
            try {
                if (this.f69943e) {
                    String strA = sg.bigo.ads.common.j.a.a(string, "FEFFFFFFFFFAFFFDCBFFFFFFFFFFFF4F");
                    if (TextUtils.isEmpty(strA)) {
                        this.f69944f = false;
                    } else {
                        this.f69944f = true;
                        this.f69948p = strA;
                        a("enc", "1");
                    }
                }
            } catch (Exception unused) {
                this.f69944f = false;
            }
            try {
                this.f69941c = this.f69948p.getBytes(G5.N);
            } catch (UnsupportedEncodingException unused2) {
            }
        }
        return this.f69941c;
    }

    @Override // sg.bigo.ads.common.u.b.c
    @Nullable
    public final String d() {
        return e() >= 0 ? this.f69948p : "content is null.";
    }

    @Override // sg.bigo.ads.common.u.b.c
    public final int e() {
        int i10 = this.f69947i;
        if (i10 > 0) {
            return i10;
        }
        byte[] bArrC = c();
        return bArrC != null ? bArrC.length : super.e();
    }

    @Override // sg.bigo.ads.common.u.b.c
    public final boolean f() {
        return this.f69944f;
    }
}
