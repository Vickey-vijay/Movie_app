package com.fyber.inneractive.sdk.flow.endcard.loaders.companion;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.endcard.j;
import com.fyber.inneractive.sdk.flow.endcard.p;
import com.fyber.inneractive.sdk.flow.endcard.r;
import com.fyber.inneractive.sdk.flow.endcard.t;
import com.fyber.inneractive.sdk.flow.endcard.v;
import com.fyber.inneractive.sdk.flow.endcard.x;
import com.fyber.inneractive.sdk.flow.vast.h;
import com.fyber.inneractive.sdk.flow.x0;
import com.fyber.inneractive.sdk.model.vast.i;
import com.fyber.inneractive.sdk.model.vast.k;
import com.fyber.inneractive.sdk.network.e1;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.response.g;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.o;
import com.fyber.inneractive.sdk.web.i1;
import java.util.Iterator;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f15388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f15389b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f15390c = new e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f15391d = new f();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x0 f15392e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Iterator f15393f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.endcard.c f15394g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.endcard.loaders.b f15395h;

    @Override // com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a
    public final void a() {
        com.fyber.inneractive.sdk.flow.endcard.loaders.b bVar = this.f15395h;
        com.fyber.inneractive.sdk.flow.endcard.c cVar = this.f15394g;
        bVar.getClass();
        if (cVar != null) {
            IAlog.a("%s : onCompanionLoadSuccess: endcard type: %s", "EndCardLoader", cVar.i());
            bVar.f15387d.a(cVar);
        }
    }

    public final void b() {
        Iterator it = this.f15393f;
        if (it == null || !it.hasNext()) {
            return;
        }
        com.fyber.inneractive.sdk.flow.endcard.c cVar = (com.fyber.inneractive.sdk.flow.endcard.c) this.f15393f.next();
        this.f15394g = cVar;
        String str = null;
        if (cVar instanceof r) {
            r rVar = (r) cVar;
            this.f15389b.getClass();
            String str2 = rVar.f15363g.f15893f;
            x0 x0Var = rVar.f15359c;
            u uVar = u.VAST_COMPANION_LOAD_ATTEMPT;
            InneractiveAdRequest inneractiveAdRequest = x0Var.f15754c;
            g gVar = x0Var.f15755d;
            JSONArray jSONArray = x0Var.f15757f;
            w wVar = new w(gVar);
            wVar.f16129c = uVar;
            wVar.f16127a = inneractiveAdRequest;
            wVar.f16130d = jSONArray;
            wVar.a((String) null);
            com.fyber.inneractive.sdk.flow.endcard.u uVar2 = (com.fyber.inneractive.sdk.flow.endcard.u) rVar.f();
            uVar2.f15429e = str2;
            uVar2.a(this);
            return;
        }
        if (cVar instanceof v) {
            e eVar = this.f15390c;
            v vVar = (v) cVar;
            eVar.getClass();
            k kVar = vVar.f15434h;
            int i10 = c.f15396a[kVar.ordinal()];
            if (i10 != 1 && i10 != 2 && i10 != 3) {
                IAlog.f("%s Invalid static type: %s", "StaticCompanionEndCardLoader", kVar);
                return;
            }
            String str3 = vVar.f15363g.f15893f;
            if (TextUtils.isEmpty(str3)) {
                return;
            }
            IAlog.c("%s load Static End-Card image %s", "StaticCompanionEndCardLoader", str3);
            x0 x0Var2 = vVar.f15359c;
            u uVar3 = u.VAST_COMPANION_LOAD_ATTEMPT;
            InneractiveAdRequest inneractiveAdRequest2 = x0Var2.f15754c;
            g gVar2 = x0Var2.f15755d;
            JSONArray jSONArray2 = x0Var2.f15757f;
            w wVar2 = new w(gVar2);
            wVar2.f16129c = uVar3;
            wVar2.f16127a = inneractiveAdRequest2;
            wVar2.f16130d = jSONArray2;
            wVar2.a((String) null);
            IAConfigManager.O.f15024s.a(new e1(new d(eVar, vVar, this), vVar.f15363g.f15893f, vVar.f15359c.f15753b.f15748c));
            return;
        }
        if (cVar instanceof x) {
            x xVar = (x) cVar;
            this.f15391d.getClass();
            if (xVar.f15363g.f15888a != i.Static) {
                x0 x0Var3 = xVar.f15359c;
                u uVar4 = u.VAST_COMPANION_LOAD_ATTEMPT;
                InneractiveAdRequest inneractiveAdRequest3 = x0Var3.f15754c;
                g gVar3 = x0Var3.f15755d;
                JSONArray jSONArray3 = x0Var3.f15757f;
                w wVar3 = new w(gVar3);
                wVar3.f16129c = uVar4;
                wVar3.f16127a = inneractiveAdRequest3;
                wVar3.f16130d = jSONArray3;
                wVar3.a((String) null);
                String str4 = xVar.f15363g.f15893f;
                String strB = o.b("fyb_iframe_endcard_tmpl.html");
                if (!TextUtils.isEmpty(strB)) {
                    strB = strB.replace("$__SrcIframeUrl__$", str4);
                }
                com.fyber.inneractive.sdk.flow.endcard.u uVar5 = (com.fyber.inneractive.sdk.flow.endcard.u) xVar.f();
                uVar5.f15429e = strB;
                uVar5.a(this);
                return;
            }
            x0 x0Var4 = xVar.f15359c;
            u uVar6 = u.VAST_COMPANION_LOAD_ATTEMPT;
            InneractiveAdRequest inneractiveAdRequest4 = x0Var4.f15754c;
            g gVar4 = x0Var4.f15755d;
            JSONArray jSONArray4 = x0Var4.f15757f;
            w wVar4 = new w(gVar4);
            wVar4.f16129c = uVar6;
            wVar4.f16127a = inneractiveAdRequest4;
            wVar4.f16130d = jSONArray4;
            wVar4.a((String) null);
            com.fyber.inneractive.sdk.model.vast.c cVar2 = xVar.f15363g;
            String str5 = cVar2.f15893f;
            String str6 = cVar2.f15894g;
            if (TextUtils.isEmpty(str6)) {
                com.fyber.inneractive.sdk.model.vast.b bVar = xVar.f15359c.f15755d.O;
                if (bVar != null) {
                    str = bVar.f15873b;
                }
            } else {
                str = str6;
            }
            String strB2 = o.b("fyb_static_endcard_tmpl.html");
            if (!TextUtils.isEmpty(strB2)) {
                strB2 = strB2.replace("$__IMGSRC__$", str5);
                if (str != null) {
                    strB2 = strB2.replace("$__IMGHREF__$", str.replace("\"", "\\\""));
                }
            }
            com.fyber.inneractive.sdk.flow.endcard.u uVar7 = (com.fyber.inneractive.sdk.flow.endcard.u) xVar.f();
            uVar7.f15429e = strB2;
            if (TextUtils.isEmpty(strB2)) {
                throw new h("End-Card HTML not loaded", "No template");
            }
            com.fyber.inneractive.sdk.player.controller.d dVarE = uVar7.e();
            dVarE.a();
            i1 i1Var = dVarE.f16200a;
            if (i1Var != null) {
                i1Var.F = false;
            }
            dVarE.a(strB2, new t(uVar7, this), !(uVar7 instanceof p));
        }
    }

    public a(j jVar, x0 x0Var, com.fyber.inneractive.sdk.flow.endcard.loaders.b bVar) {
        this.f15388a = jVar;
        this.f15392e = x0Var;
        this.f15395h = bVar;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a
    public final void a(String str) {
        this.f15395h.getClass();
        IAlog.a("%s : onCompanionLoadFailure: error: %s", "EndCardLoader", str);
        b();
    }
}
