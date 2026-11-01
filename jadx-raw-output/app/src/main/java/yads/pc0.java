package yads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.C3426d4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class pc0 implements p30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f81360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f81361b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p30 f81362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public cv0 f81363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public zi f81364e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public pz f81365f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p30 f81366g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public aa3 f81367h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public m30 f81368i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public bm2 f81369j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p30 f81370k;

    public final void a(p30 p30Var) {
        for (int i10 = 0; i10 < this.f81361b.size(); i10++) {
            p30Var.a((r83) this.f81361b.get(i10));
        }
    }

    @Override // yads.p30
    public final void close() {
        p30 p30Var = this.f81370k;
        if (p30Var != null) {
            try {
                p30Var.close();
            } finally {
                this.f81370k = null;
            }
        }
    }

    @Override // yads.p30
    public final Map getResponseHeaders() {
        p30 p30Var = this.f81370k;
        return p30Var == null ? Collections.emptyMap() : p30Var.getResponseHeaders();
    }

    @Override // yads.p30
    public final Uri getUri() {
        p30 p30Var = this.f81370k;
        if (p30Var == null) {
            return null;
        }
        return p30Var.getUri();
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i10, int i11) {
        p30 p30Var = this.f81370k;
        p30Var.getClass();
        return p30Var.read(bArr, i10, i11);
    }

    public pc0(Context context, p30 p30Var) {
        this.f81360a = context.getApplicationContext();
        this.f81362c = (p30) ni.a(p30Var);
    }

    @Override // yads.p30
    public final void a(r83 r83Var) {
        r83Var.getClass();
        this.f81362c.a(r83Var);
        this.f81361b.add(r83Var);
        cv0 cv0Var = this.f81363d;
        if (cv0Var != null) {
            cv0Var.a(r83Var);
        }
        zi ziVar = this.f81364e;
        if (ziVar != null) {
            ziVar.a(r83Var);
        }
        pz pzVar = this.f81365f;
        if (pzVar != null) {
            pzVar.a(r83Var);
        }
        p30 p30Var = this.f81366g;
        if (p30Var != null) {
            p30Var.a(r83Var);
        }
        aa3 aa3Var = this.f81367h;
        if (aa3Var != null) {
            aa3Var.a(r83Var);
        }
        m30 m30Var = this.f81368i;
        if (m30Var != null) {
            m30Var.a(r83Var);
        }
        bm2 bm2Var = this.f81369j;
        if (bm2Var != null) {
            bm2Var.a(r83Var);
        }
    }

    @Override // yads.p30
    public final long a(u30 u30Var) {
        if (this.f81370k == null) {
            String scheme = u30Var.f83341a.getScheme();
            Uri uri = u30Var.f83341a;
            int i10 = ib3.f78556a;
            String scheme2 = uri.getScheme();
            if (!TextUtils.isEmpty(scheme2) && !C3426d4.i.f28530b.equals(scheme2)) {
                if ("asset".equals(scheme)) {
                    if (this.f81364e == null) {
                        zi ziVar = new zi(this.f81360a);
                        this.f81364e = ziVar;
                        a(ziVar);
                    }
                    this.f81370k = this.f81364e;
                } else if ("content".equals(scheme)) {
                    if (this.f81365f == null) {
                        pz pzVar = new pz(this.f81360a);
                        this.f81365f = pzVar;
                        a(pzVar);
                    }
                    this.f81370k = this.f81365f;
                } else if ("rtmp".equals(scheme)) {
                    if (this.f81366g == null) {
                        try {
                            p30 p30Var = (p30) Class.forName("com.monetization.ads.exo.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                            this.f81366g = p30Var;
                            a(p30Var);
                        } catch (ClassNotFoundException unused) {
                            ih1.d("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                        } catch (Exception e10) {
                            throw new RuntimeException("Error instantiating RTMP extension", e10);
                        }
                        if (this.f81366g == null) {
                            this.f81366g = this.f81362c;
                        }
                    }
                    this.f81370k = this.f81366g;
                } else if ("udp".equals(scheme)) {
                    if (this.f81367h == null) {
                        aa3 aa3Var = new aa3(0);
                        this.f81367h = aa3Var;
                        a(aa3Var);
                    }
                    this.f81370k = this.f81367h;
                } else if ("data".equals(scheme)) {
                    if (this.f81368i == null) {
                        m30 m30Var = new m30();
                        this.f81368i = m30Var;
                        a(m30Var);
                    }
                    this.f81370k = this.f81368i;
                } else if (!"rawresource".equals(scheme) && !"android.resource".equals(scheme)) {
                    this.f81370k = this.f81362c;
                } else {
                    if (this.f81369j == null) {
                        bm2 bm2Var = new bm2(this.f81360a);
                        this.f81369j = bm2Var;
                        a(bm2Var);
                    }
                    this.f81370k = this.f81369j;
                }
            } else {
                String path = u30Var.f83341a.getPath();
                if (path != null && path.startsWith("/android_asset/")) {
                    if (this.f81364e == null) {
                        zi ziVar2 = new zi(this.f81360a);
                        this.f81364e = ziVar2;
                        a(ziVar2);
                    }
                    this.f81370k = this.f81364e;
                } else {
                    if (this.f81363d == null) {
                        cv0 cv0Var = new cv0();
                        this.f81363d = cv0Var;
                        a(cv0Var);
                    }
                    this.f81370k = this.f81363d;
                }
            }
            return this.f81370k.a(u30Var);
        }
        throw new IllegalStateException();
    }
}
