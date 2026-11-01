package jm;

import com.ironsource.Z7;
import im.h;
import im.i;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import org.eclipse.jetty.client.HttpDestination;
import xm.o;

/* JADX INFO: compiled from: SecurityListener.java */
/* JADX INFO: loaded from: classes9.dex */
public class f extends h {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final zm.c f61940n = zm.b.a(f.class);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public HttpDestination f61941h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public i f61942i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f61943j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f61944k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f61945l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f61946m;

    @Override // im.h, im.g
    public void j() throws IOException {
        this.f61944k = true;
        if (!this.f61945l) {
            zm.c cVar = f61940n;
            if (cVar.f()) {
                cVar.i("OnResponseComplete, delegating to super with Request complete=" + this.f61943j + ", response complete=" + this.f61944k + Z7.f27998r + this.f61942i, new Object[0]);
            }
            super.j();
            return;
        }
        if (!this.f61943j) {
            zm.c cVar2 = f61940n;
            if (cVar2.f()) {
                cVar2.i("onResponseComplete, Request not yet complete from onResponseComplete,  calling super " + this.f61942i, new Object[0]);
            }
            super.j();
            return;
        }
        zm.c cVar3 = f61940n;
        if (cVar3.f()) {
            cVar3.i("onResponseComplete, Both complete: Resending from onResponseComplete" + this.f61942i, new Object[0]);
        }
        this.f61944k = false;
        this.f61943j = false;
        m(true);
        l(true);
        this.f61941h.r(this.f61942i);
    }

    @Override // im.h, im.g
    public void onRequestComplete() throws IOException {
        this.f61943j = true;
        if (!this.f61945l) {
            zm.c cVar = f61940n;
            if (cVar.f()) {
                cVar.i("onRequestComplete, delegating to super with Request complete=" + this.f61943j + ", response complete=" + this.f61944k + Z7.f27998r + this.f61942i, new Object[0]);
            }
            super.onRequestComplete();
            return;
        }
        if (!this.f61944k) {
            zm.c cVar2 = f61940n;
            if (cVar2.f()) {
                cVar2.i("onRequestComplete, Response not yet complete onRequestComplete, calling super for " + this.f61942i, new Object[0]);
            }
            super.onRequestComplete();
            return;
        }
        zm.c cVar3 = f61940n;
        if (cVar3.f()) {
            cVar3.i("onRequestComplete, Both complete: Resending from onResponseComplete " + this.f61942i, new Object[0]);
        }
        this.f61944k = false;
        this.f61943j = false;
        l(true);
        m(true);
        this.f61941h.r(this.f61942i);
    }

    @Override // im.h, im.g
    public void b() {
        this.f61946m++;
        l(true);
        m(true);
        this.f61943j = false;
        this.f61944k = false;
        this.f61945l = false;
        super.b();
    }

    @Override // im.h, im.g
    public void d(mm.d dVar, int i10, mm.d dVar2) throws IOException {
        zm.c cVar = f61940n;
        if (cVar.f()) {
            cVar.i("SecurityListener:Response Status: " + i10, new Object[0]);
        }
        if (i10 != 401 || this.f61946m >= this.f61941h.h().O0()) {
            m(true);
            l(true);
            this.f61945l = false;
        } else {
            m(false);
            this.f61945l = true;
        }
        super.d(dVar, i10, dVar2);
    }

    @Override // im.h, im.g
    public void e(mm.d dVar, mm.d dVar2) throws IOException {
        zm.c cVar = f61940n;
        if (cVar.f()) {
            cVar.i("SecurityListener:Header: " + dVar.toString() + " / " + dVar2.toString(), new Object[0]);
        }
        if (!k() && lm.i.f63776d.f(dVar) == 51) {
            String string = dVar2.toString();
            String strO = o(string);
            Map<String, String> mapN = n(string);
            e eVarG0 = this.f61941h.h().G0();
            if (eVarG0 != null) {
                d dVarA = eVarG0.a(mapN.get("realm"), this.f61941h, "/");
                if (dVarA == null) {
                    cVar.g("Unknown Security Realm: " + mapN.get("realm"), new Object[0]);
                } else if ("digest".equalsIgnoreCase(strO)) {
                    this.f61941h.b("/", new c(dVarA, mapN));
                } else if ("basic".equalsIgnoreCase(strO)) {
                    this.f61941h.b("/", new b(dVarA));
                }
            }
        }
        super.e(dVar, dVar2);
    }

    public Map<String, String> n(String str) {
        HashMap map = new HashMap();
        StringTokenizer stringTokenizer = new StringTokenizer(str.substring(str.indexOf(Z7.f27998r) + 1, str.length()), StringUtils.COMMA);
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            String[] strArrSplit = strNextToken.split("=");
            if (strArrSplit.length == 2) {
                map.put(strArrSplit[0].trim(), o.i(strArrSplit[1].trim()));
            } else {
                f61940n.i("SecurityListener: missed scraping authentication details - " + strNextToken, new Object[0]);
            }
        }
        return map;
    }

    public String o(String str) {
        return str.indexOf(Z7.f27998r) == -1 ? str.trim() : str.substring(0, str.indexOf(Z7.f27998r)).trim();
    }

    public f(HttpDestination httpDestination, i iVar) {
        super(iVar.k(), true);
        this.f61946m = 0;
        this.f61941h = httpDestination;
        this.f61942i = iVar;
    }
}
