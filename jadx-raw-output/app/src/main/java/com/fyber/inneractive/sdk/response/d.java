package com.fyber.inneractive.sdk.response;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.model.vast.a0;
import com.fyber.inneractive.sdk.model.vast.r;
import com.fyber.inneractive.sdk.model.vast.u;
import com.fyber.inneractive.sdk.model.vast.y;
import com.fyber.inneractive.sdk.model.vast.z;
import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.h0;
import com.fyber.inneractive.sdk.util.s;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import javax.xml.parsers.DocumentBuilderFactory;
import org.json.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

/* JADX INFO: loaded from: classes.dex */
public final class d extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g f18425e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public r0 f18426f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.fyber.inneractive.sdk.model.vast.f f18427g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f18428h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18429i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public z f18430j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f18431k;

    public d() {
        this.f18431k = true;
        this.f18428h = new ArrayList();
    }

    @Override // com.fyber.inneractive.sdk.response.b
    public final e a() {
        g gVar = new g();
        this.f18421a = gVar;
        this.f18425e = gVar;
        return gVar;
    }

    @Override // com.fyber.inneractive.sdk.response.b
    public final boolean c() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.response.b
    public final void a(String str, r0 r0Var) {
        this.f18426f = r0Var;
        if (r0Var != null && r0Var.f15149f != null) {
            this.f18425e.N = System.currentTimeMillis();
            this.f18425e.C = this.f18426f.f15145b;
            this.f18429i = IAConfigManager.O.f15014i.f15123b;
            try {
                a(str, 0);
                a(this.f18427g, this.f18428h);
                return;
            } catch (com.fyber.inneractive.sdk.flow.vast.h e10) {
                this.f18425e.f18440i = e10.getMessage();
                this.f18425e.f18441j = e10.getCause().getMessage();
                return;
            } catch (InterruptedException e11) {
                throw e11;
            } catch (Exception e12) {
                this.f18425e.f18441j = e12.getMessage();
                g gVar = this.f18425e;
                gVar.f18440i = "VastErrorInvalidFile";
                gVar.f18457z = e12;
                if (IAlog.f18551a == 2) {
                    e12.printStackTrace();
                    return;
                }
                return;
            }
        }
        this.f18421a.f18440i = "ErrorConfigurationMismatch";
    }

    public d(boolean z10) {
        this();
        this.f18431k = z10;
    }

    public final void a(String str, int i10) throws Exception {
        u uVarA;
        try {
            String strReplaceFirst = str.replaceFirst("<\\?.*\\?>", "");
            DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
            documentBuilderFactoryNewInstance.setCoalescing(true);
            Document document = documentBuilderFactoryNewInstance.newDocumentBuilder().parse(new InputSource(new StringReader(strReplaceFirst)));
            if (document != null) {
                Node firstChild = document.getFirstChild();
                if (firstChild.getNodeName().equalsIgnoreCase(VastTagName.VAST)) {
                    uVarA = u.a(firstChild);
                } else {
                    IAlog.a("XML does not contain a VAST tag as its first child!", new Object[0]);
                    throw new Exception("XML does not contain a VAST tag as its first child!");
                }
            } else {
                uVarA = null;
            }
            try {
                if (this.f18430j == null) {
                    this.f18430j = new z(uVarA.f15944a);
                } else {
                    z zVar = new z(uVarA.f15944a);
                    if (zVar.compareTo(this.f18430j) >= 0) {
                        this.f18430j = zVar;
                    }
                }
            } catch (y unused) {
            }
            ArrayList arrayList = uVarA.f15945b;
            if (arrayList != null && !arrayList.isEmpty()) {
                com.fyber.inneractive.sdk.model.vast.f fVar = (com.fyber.inneractive.sdk.model.vast.f) arrayList.get(0);
                a0 a0Var = fVar.f15902b;
                if (a0Var != null) {
                    IAlog.a("Vast response parser: found VAST wrapper #%d", Integer.valueOf(this.f18428h.size()));
                    int size = this.f18428h.size();
                    int i11 = this.f18429i;
                    if (size < i11) {
                        this.f18428h.add(fVar);
                        String str2 = a0Var.f15871i;
                        if (!TextUtils.isEmpty(str2)) {
                            if (h0.e(str2)) {
                                String strA = s.a(str2, 3000, 5000);
                                if (!TextUtils.isEmpty(strA)) {
                                    int i12 = this.f18429i - i10;
                                    if (i12 > 0) {
                                        a0Var.f15909f = i12;
                                        this.f18425e.S.put(str2, strA);
                                        a(strA, i10 + 1);
                                        return;
                                    }
                                    throw new com.fyber.inneractive.sdk.flow.vast.h("VastErrorInvalidFile", "Invalid level for wrapper");
                                }
                                throw new com.fyber.inneractive.sdk.flow.vast.h("VastErrorInvalidFile", "Failed getting data from ad tag URI");
                            }
                            IAlog.a("Vast response parser: Unsecure Wrapper URL. Aborting! url: %s", str2);
                            throw new com.fyber.inneractive.sdk.flow.vast.h("VastErrorUnsecure", "Unsecure ad tag URI for wrapper");
                        }
                        IAlog.a("Vast response parser: found an empty tag uri in wrapper! aborting!", new Object[0]);
                        throw new com.fyber.inneractive.sdk.flow.vast.h("VastErrorInvalidFile", "No ad tag URI for wrapper");
                    }
                    IAlog.a("Vast response parser: too many vast wrappers! Only %d allowed. stopping", Integer.valueOf(i11));
                    throw new com.fyber.inneractive.sdk.flow.vast.h("VastErrorTooManyWrappers", "More than " + this.f18429i + " found");
                }
                if (fVar.f15903c != null) {
                    this.f18427g = fVar;
                    return;
                }
                throw new com.fyber.inneractive.sdk.flow.vast.h("VastErrorInvalidFile", "A top level ad with no wrapper on inline found!");
            }
            IAlog.a("Vast response parser: no ads found in model. aborting", new Object[0]);
            throw new com.fyber.inneractive.sdk.flow.vast.h("ErrorNoMediaFiles", "No ads found in model. Empty Vast?");
        } catch (Exception e10) {
            IAlog.a("Failed parsing Vast file! parsing error = %s", e10.getMessage());
            throw new com.fyber.inneractive.sdk.flow.vast.h("VastErrorInvalidFile", e10.getMessage());
        }
    }

    public final void a(com.fyber.inneractive.sdk.model.vast.f fVar, List list) {
        com.fyber.inneractive.sdk.flow.vast.c cVar = new com.fyber.inneractive.sdk.flow.vast.c(this.f18431k);
        int iIntValue = this.f18426f.f15149f.f15202c.intValue();
        int iIntValue2 = this.f18426f.f15149f.f15201b.intValue();
        int iIntValue3 = this.f18426f.f15149f.f15206g.intValue();
        cVar.f15709b = iIntValue;
        cVar.f15710c = iIntValue2;
        cVar.f15711d = iIntValue3;
        if (UnitDisplayType.VERTICAL.equals(this.f18426f.f15149f.f15209j)) {
            cVar.f15712e = true;
        }
        if (this.f18426f.f15149f.f15210k.contains(2)) {
            cVar.f15713f = true;
        }
        try {
            z zVar = this.f18430j;
            this.f18425e.O = cVar.a(fVar, list, zVar != null ? zVar.f15959b : "");
        } catch (com.fyber.inneractive.sdk.flow.vast.h e10) {
            g gVar = this.f18425e;
            gVar.getClass();
            gVar.f18440i = e10.getMessage();
        }
        com.fyber.inneractive.sdk.model.vast.b bVar = this.f18425e.O;
        if (bVar != null) {
            String str = bVar.f15885n;
            if (!TextUtils.isEmpty(str) && h0.e(str)) {
                w wVar = new w(com.fyber.inneractive.sdk.network.u.VAST_EVENT_DVC_DETECTED, (InneractiveAdRequest) null, this.f18421a);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("templateURL", str);
                } catch (Exception unused) {
                    IAlog.f("Got exception adding param to json object: %s, %s", "templateURL", str);
                }
                wVar.f16132f.put(jSONObject);
                wVar.a((String) null);
            } else if (!TextUtils.isEmpty(str)) {
                this.f18425e.O.f15885n = "";
                com.fyber.inneractive.sdk.network.events.a.a(t.VAST_ERROR_DVC_FAILURE, com.fyber.inneractive.sdk.network.events.b.SSL_ERROR, (InneractiveAdRequest) null, this.f18421a, "Unsecured URL", str, Boolean.FALSE);
            }
        }
        g gVar2 = this.f18425e;
        LinkedHashMap linkedHashMap = cVar.f15714g;
        if (linkedHashMap != null) {
            gVar2.P.putAll(linkedHashMap);
        } else {
            gVar2.getClass();
        }
        g gVar3 = this.f18425e;
        ArrayList arrayList = cVar.f15715h;
        if (arrayList != null) {
            gVar3.Q.addAll(arrayList);
        } else {
            gVar3.getClass();
        }
        g gVar4 = this.f18425e;
        ArrayList arrayList2 = cVar.f15718k;
        if (arrayList2 != null) {
            gVar4.R.addAll(arrayList2);
        } else {
            gVar4.getClass();
        }
        if (IAlog.f18551a == 2) {
            LinkedHashMap linkedHashMap2 = cVar.f15714g;
            if (linkedHashMap2.size() > 0) {
                IAlog.e(" VParser: Unsupported media files:", new Object[0]);
                for (r rVar : linkedHashMap2.keySet()) {
                    IAlog.e("VParser: %s", rVar);
                    IAlog.e("VParser: reason = %s", linkedHashMap2.get(rVar));
                }
                return;
            }
            IAlog.e("VParser: Unsupported media files: none", new Object[0]);
        }
    }
}
