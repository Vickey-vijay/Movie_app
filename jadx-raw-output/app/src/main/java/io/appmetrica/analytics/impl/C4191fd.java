package io.appmetrica.analytics.impl;

import com.ironsource.C3426d4;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.fd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4191fd implements Uj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4603vl f56758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f56759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SystemTimeProvider f56760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f56761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f56762e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f56763f;

    public C4191fd(InterfaceC4603vl interfaceC4603vl, String str, SystemTimeProvider systemTimeProvider, List<C4114cd> list) {
        this.f56758a = interfaceC4603vl;
        this.f56759b = str;
        this.f56760c = systemTimeProvider;
        this.f56761d = list;
        this.f56762e = str.toUpperCase(Locale.ROOT) + "_STATUS";
        this.f56763f = TimeUnit.DAYS.toMillis(1L);
    }

    public final Tj a() {
        C4570ud c4570ud;
        C4114cd c4114cd;
        if (this.f56761d.isEmpty()) {
            return null;
        }
        List listH0 = nj.b0.H0(this.f56761d, new C4165ed());
        String strC = ((AbstractC4695zd) this.f56758a).c(this.f56762e, (String) null);
        if (strC != null) {
            try {
                JSONObject jSONObject = new JSONObject(strC);
                JSONArray jSONArray = jSONObject.getJSONArray("modulesStatus");
                ik.i iVarQ = ik.k.q(0, jSONArray.length());
                ArrayList arrayList = new ArrayList(nj.t.v(iVarQ, 10));
                Iterator<Integer> it = iVarQ.iterator();
                while (it.hasNext()) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(((nj.g0) it).nextInt());
                    try {
                        c4114cd = new C4114cd(jSONObject2.getString("moduleName"), jSONObject2.getBoolean(C3426d4.i.f28562r));
                    } catch (Throwable unused) {
                        c4114cd = new C4114cd("", false);
                    }
                    arrayList.add(c4114cd);
                }
                c4570ud = new C4570ud(arrayList, jSONObject.getLong("lastSendTime"));
            } catch (Throwable unused2) {
                c4570ud = new C4570ud(nj.s.k(), 0L);
            }
        } else {
            c4570ud = null;
        }
        long jCurrentTimeMillis = this.f56760c.currentTimeMillis();
        if (c4570ud != null && jCurrentTimeMillis - c4570ud.f57767b <= this.f56763f && ck.p.e(listH0, c4570ud.f57766a)) {
            return null;
        }
        C4570ud c4570ud2 = new C4570ud(listH0, jCurrentTimeMillis);
        InterfaceC4603vl interfaceC4603vl = this.f56758a;
        AbstractC4695zd abstractC4695zd = (AbstractC4695zd) interfaceC4603vl;
        return new Tj(this.f56759b + "_status", c4570ud2.a());
    }

    public /* synthetic */ C4191fd(InterfaceC4603vl interfaceC4603vl, String str, SystemTimeProvider systemTimeProvider, List list, int i10, ck.i iVar) {
        this(interfaceC4603vl, str, (i10 & 4) != 0 ? new SystemTimeProvider() : systemTimeProvider, list);
    }
}
