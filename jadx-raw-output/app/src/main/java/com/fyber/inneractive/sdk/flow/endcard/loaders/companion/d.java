package com.fyber.inneractive.sdk.flow.endcard.loaders.companion;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.endcard.v;
import com.fyber.inneractive.sdk.flow.endcard.w;
import com.fyber.inneractive.sdk.flow.x0;
import com.fyber.inneractive.sdk.model.vast.k;
import com.fyber.inneractive.sdk.network.d1;
import com.fyber.inneractive.sdk.network.f0;
import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.response.g;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f15397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a f15398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f15399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f15400d;

    public d(e eVar, v vVar, com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a aVar) {
        this.f15400d = eVar;
        this.f15399c = vVar;
        this.f15397a = (w) vVar.f();
        this.f15398b = aVar;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z10) {
        Bitmap bitmap;
        d1 d1Var = (d1) obj;
        boolean zEqualsIgnoreCase = false;
        if (exc == null && d1Var != null && d1Var.f16008b == null && (bitmap = d1Var.f16007a) != null) {
            w wVar = this.f15397a;
            Bitmap bitmap2 = wVar.f15435c;
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            wVar.f15435c = bitmap;
            wVar.f15436d.setImageBitmap(bitmap);
            e eVar = this.f15400d;
            v vVar = this.f15399c;
            eVar.getClass();
            JSONObject jSONObject = new JSONObject();
            String string = vVar.f15363g.a().toString();
            try {
                jSONObject.put("companion_data", string);
            } catch (Exception unused) {
                IAlog.f("Got exception adding param to json object: %s, %s", "companion_data", string);
            }
            x0 x0Var = vVar.f15359c;
            u uVar = u.VAST_COMPANION_LOADED;
            InneractiveAdRequest inneractiveAdRequest = x0Var.f15754c;
            g gVar = x0Var.f15755d;
            JSONArray jSONArray = x0Var.f15757f;
            com.fyber.inneractive.sdk.network.w wVar2 = new com.fyber.inneractive.sdk.network.w(gVar);
            wVar2.f16129c = uVar;
            wVar2.f16127a = inneractiveAdRequest;
            wVar2.f16130d = jSONArray;
            wVar2.f16132f.put(jSONObject);
            wVar2.a((String) null);
            this.f15398b.a();
            return;
        }
        String str = d1Var != null ? d1Var.f16008b : null;
        e eVar2 = this.f15400d;
        v vVar2 = this.f15399c;
        eVar2.getClass();
        IAlog.a("%s sending VAST_COMPANION_FAILED_LOADING event", "StaticCompanionEndCardLoader");
        JSONObject jSONObject2 = new JSONObject();
        String strA = TextUtils.isEmpty(str) ? com.fyber.inneractive.sdk.util.v.a(exc) : str;
        if (!TextUtils.isEmpty(strA)) {
            try {
                jSONObject2.put("reason", strA);
            } catch (Exception unused2) {
                IAlog.f("Got exception adding param to json object: %s, %s", "reason", strA);
            }
        }
        JSONObject jSONObjectA = vVar2.f15363g.a();
        try {
            jSONObject2.put("companion_data", jSONObjectA);
        } catch (Exception unused3) {
            IAlog.f("Got exception adding param to json object: %s, %s", "companion_data", jSONObjectA);
        }
        x0 x0Var2 = vVar2.f15359c;
        t tVar = t.VAST_COMPANION_FAILED_LOADING;
        InneractiveAdRequest inneractiveAdRequest2 = x0Var2.f15754c;
        g gVar2 = x0Var2.f15755d;
        JSONArray jSONArray2 = x0Var2.f15757f;
        com.fyber.inneractive.sdk.network.w wVar3 = new com.fyber.inneractive.sdk.network.w(gVar2);
        wVar3.f16128b = tVar;
        wVar3.f16127a = inneractiveAdRequest2;
        wVar3.f16130d = jSONArray2;
        wVar3.f16132f.put(jSONObject2);
        wVar3.a((String) null);
        this.f15398b.a(str);
        v vVar3 = this.f15399c;
        String str2 = vVar3.f15363g.f15893f;
        k kVar = vVar3.f15434h;
        if (!TextUtils.isEmpty(str2)) {
            String strSubstring = str2.substring(str2.lastIndexOf(46) + 1);
            if (kVar.extension.equalsIgnoreCase(strSubstring)) {
                zEqualsIgnoreCase = true;
            } else {
                k kVar2 = k.Jpeg;
                if (kVar == kVar2) {
                    zEqualsIgnoreCase = k.Jpg.extension.equalsIgnoreCase(strSubstring);
                } else if (kVar == k.Jpg) {
                    zEqualsIgnoreCase = kVar2.extension.equalsIgnoreCase(strSubstring);
                }
            }
        }
        if (zEqualsIgnoreCase) {
            return;
        }
        x0 x0Var3 = this.f15399c.f15359c;
        t tVar2 = t.VAST_COMPANION_INCOMPATIBLE_MIMETYPE;
        InneractiveAdRequest inneractiveAdRequest3 = x0Var3.f15754c;
        g gVar3 = x0Var3.f15755d;
        JSONArray jSONArray3 = x0Var3.f15757f;
        com.fyber.inneractive.sdk.network.w wVar4 = new com.fyber.inneractive.sdk.network.w(gVar3);
        wVar4.f16128b = tVar2;
        wVar4.f16127a = inneractiveAdRequest3;
        wVar4.f16130d = jSONArray3;
        wVar4.a((String) null);
    }
}
