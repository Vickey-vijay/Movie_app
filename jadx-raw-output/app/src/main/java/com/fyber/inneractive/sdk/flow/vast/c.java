package com.fyber.inneractive.sdk.flow.vast;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.model.vast.a0;
import com.fyber.inneractive.sdk.model.vast.k;
import com.fyber.inneractive.sdk.model.vast.l;
import com.fyber.inneractive.sdk.model.vast.m;
import com.fyber.inneractive.sdk.model.vast.q;
import com.fyber.inneractive.sdk.model.vast.r;
import com.fyber.inneractive.sdk.model.vast.s;
import com.fyber.inneractive.sdk.model.vast.t;
import com.fyber.inneractive.sdk.model.vast.v;
import com.fyber.inneractive.sdk.model.vast.w;
import com.fyber.inneractive.sdk.model.vast.x;
import com.fyber.inneractive.sdk.player.n;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.h0;
import com.fyber.inneractive.sdk.util.o;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15709b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15710c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15711d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15712e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15713f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f15714g = new LinkedHashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f15715h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f15716i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f15717j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f15718k = new ArrayList();

    public final void a(com.fyber.inneractive.sdk.model.vast.b bVar, com.fyber.inneractive.sdk.model.vast.h hVar, int i10) throws b {
        List list;
        ArrayList<String> arrayList = hVar.f15919h;
        if (arrayList.size() > 0) {
            for (String str : arrayList) {
                if (!h0.e(str)) {
                    throw new b("Found non-secure click tracking url for companion. url: " + str, 0);
                }
            }
            if (i10 > 0) {
                this.f15716i.add(hVar);
            }
        }
        String str2 = hVar.f15918g;
        if (!h0.e(str2)) {
            throw new b("Found non-secure click through url: " + str2, 0);
        }
        if (!hVar.a()) {
            if (this.f15717j.contains(hVar)) {
                return;
            }
            this.f15717j.add(hVar);
            return;
        }
        Integer num = hVar.f15912a;
        Integer num2 = hVar.f15913b;
        if (num == null || num2 == null || num.intValue() < 100 || num2.intValue() < 100) {
            throw new b("Incompatible size: " + num + StringUtils.COMMA + num2, 16);
        }
        ArrayList<w> arrayList2 = hVar.f15921j;
        for (w wVar : arrayList2) {
            if (!h0.e(wVar.f15956b)) {
                throw new b("Found non-secure tracking event: " + wVar, 0);
            }
        }
        String str3 = hVar.f15914c;
        l lVar = hVar.f15915d;
        if (lVar != null) {
            k kVarA = k.a(lVar.f15923a);
            if (kVarA == null) {
                throw new b("Found invalid creative type: " + lVar.f15923a, 32);
            }
            list = arrayList2;
            a(bVar, com.fyber.inneractive.sdk.model.vast.i.Static, i10, num.intValue(), num2.intValue(), str3, str2, arrayList, list, lVar.f15924b, kVarA);
        } else {
            list = arrayList2;
        }
        String str4 = hVar.f15916e;
        if (!TextUtils.isEmpty(str4)) {
            if (!h0.e(str4)) {
                throw new b("Found non-secure iframe url: " + str4, 0);
            }
            a(bVar, com.fyber.inneractive.sdk.model.vast.i.Iframe, i10, num.intValue(), num2.intValue(), str3, str2, arrayList, list, str4, null);
        }
        String str5 = hVar.f15917f;
        if (!TextUtils.isEmpty(str5)) {
            a(bVar, com.fyber.inneractive.sdk.model.vast.i.Html, i10, num.intValue(), num2.intValue(), str3, str2, arrayList, list, str5, null);
        }
        bVar.f15878g.size();
    }

    public c(boolean z10) {
        this.f15708a = true;
        this.f15708a = z10;
    }

    public final com.fyber.inneractive.sdk.model.vast.b a(com.fyber.inneractive.sdk.model.vast.f fVar, List list, String str) {
        List list2;
        ArrayList arrayList;
        int iE = o.e();
        int iD = o.d();
        IAlog.a("%sprocess started", "VastProcessor: ");
        if (fVar != null && fVar.f15903c != null) {
            com.fyber.inneractive.sdk.model.vast.b bVar = new com.fyber.inneractive.sdk.model.vast.b(new g(this.f15711d, iE, iD), new d(iE, iD));
            bVar.f15872a = str;
            ArrayList arrayList2 = fVar.f15903c.f15906c;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                if (list == null) {
                    list2 = list;
                    if (fVar.f15902b != null) {
                        arrayList = new ArrayList();
                        arrayList.add(fVar);
                    }
                }
                if (list2 != null) {
                    list2 = arrayList;
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        a0 a0Var = ((com.fyber.inneractive.sdk.model.vast.f) it.next()).f15902b;
                        if (a0Var != null) {
                            a(bVar, a0Var);
                        }
                    }
                }
                list2 = arrayList;
                a(bVar, fVar.f15903c);
                if (bVar.f15875d.size() == 0) {
                    if (this.f15714g.isEmpty()) {
                        throw new h("ErrorNoMediaFiles", "No media files exist after merge");
                    }
                    throw new h("ErrorNoCompatibleMediaFile", "No compatible media files after filtering");
                }
                ArrayList<com.fyber.inneractive.sdk.model.vast.c> arrayList3 = new ArrayList(bVar.f15878g);
                Collections.sort(arrayList3, bVar.f15879h);
                if (!arrayList3.isEmpty()) {
                    for (com.fyber.inneractive.sdk.model.vast.h hVar : this.f15717j) {
                        if (!hVar.a()) {
                            for (com.fyber.inneractive.sdk.model.vast.c cVar : arrayList3) {
                                ArrayList arrayList4 = hVar.f15919h;
                                if (arrayList4 != null) {
                                    Iterator it2 = arrayList4.iterator();
                                    while (it2.hasNext()) {
                                        cVar.a(x.EVENT_CLICK, (String) it2.next());
                                    }
                                }
                                String str2 = hVar.f15918g;
                                if (TextUtils.isEmpty(cVar.f15894g)) {
                                    cVar.f15894g = str2;
                                }
                                ArrayList<w> arrayList5 = hVar.f15921j;
                                if (arrayList5 != null) {
                                    for (w wVar : arrayList5) {
                                        x xVarA = x.a(wVar.f15955a);
                                        String str3 = wVar.f15956b;
                                        if (xVarA != null && str3 != null) {
                                            cVar.a(xVarA, str3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (IAlog.f18551a == 2) {
                    IAlog.e("%sLogging merged model media files: ", "VastProcessor: ");
                    Iterator it3 = new ArrayList(bVar.f15875d).iterator();
                    int i10 = 0;
                    while (it3.hasNext()) {
                        IAlog.e("%s(%d) %s", "VastProcessor: ", Integer.valueOf(i10), (r) it3.next());
                        i10++;
                    }
                }
                if (IAlog.f18551a == 2) {
                    IAlog.e("%sLogging merged model companion ads: ", "VastProcessor: ");
                    ArrayList arrayList6 = new ArrayList(bVar.f15878g);
                    Collections.sort(arrayList6, bVar.f15879h);
                    if (arrayList6.size() > 0) {
                        Iterator it4 = arrayList6.iterator();
                        int i11 = 0;
                        while (it4.hasNext()) {
                            IAlog.e("%s(%d) %s", "VastProcessor: ", Integer.valueOf(i11), ((com.fyber.inneractive.sdk.model.vast.c) it4.next()).a());
                            i11++;
                        }
                    } else {
                        IAlog.e("%sNo companion ads found!", "VastProcessor: ");
                    }
                }
                return bVar;
            }
            list2 = list;
            throw new h("ErrorNoMediaFiles", "Empty inline with no creatives");
        }
        IAlog.a("%sno inline found", "VastProcessor: ");
        throw new h("ErrorNoMediaFiles", "Empty inline ad found");
    }

    /* JADX WARN: Code duplicated, block: B:68:0x015d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0167  */
    /* JADX WARN: Code duplicated, block: B:75:0x0181  */
    /* JADX WARN: Code duplicated, block: B:77:0x0185  */
    /* JADX WARN: Code duplicated, block: B:82:0x0199  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:87:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:88:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:89:0x01bb  */
    public final void a(com.fyber.inneractive.sdk.model.vast.b bVar, com.fyber.inneractive.sdk.model.vast.g gVar) {
        String[] strArrSplit;
        f fVar;
        String str;
        Integer num;
        f fVar2;
        HashMap map;
        List list;
        IAlog.a("%sprocessing ad element: %s", "VastProcessor: ", gVar);
        ArrayList<String> arrayList = gVar.f15905b;
        if (arrayList != null) {
            for (String str2 : arrayList) {
                IAlog.a("%sadding impression url: %s", "VastProcessor: ", str2);
                x xVar = x.EVENT_IMPRESSION;
                if (h0.e(str2)) {
                    bVar.a(xVar, str2);
                } else {
                    throw new h("VastErrorUnsecure", "found unsecure tracking event: " + xVar.a());
                }
            }
        }
        String str3 = gVar.f15904a;
        if (!TextUtils.isEmpty(str3)) {
            IAlog.a("%sadding error url: %s", "VastProcessor: ", str3);
            bVar.a(x.EVENT_ERROR, str3);
        }
        if (IAConfigManager.O.K != null) {
            for (com.fyber.inneractive.sdk.measurement.h hVar : gVar.f15907d) {
                if (hVar.b()) {
                    bVar.f15876e.add(hVar);
                } else {
                    x xVar2 = x.EVENT_VERIFICATION_NOT_EXECUTED;
                    if (((xVar2 == null || (map = hVar.f15825c) == null || (list = (List) map.get(xVar2)) == null) ? 0 : list.size()) > 0) {
                        n.a(new com.fyber.inneractive.sdk.measurement.g(hVar.a(xVar2), com.fyber.inneractive.sdk.measurement.i.VERIFICATION_NOT_SUPPORTED), xVar2);
                    }
                    this.f15718k.add(hVar);
                }
            }
        }
        com.fyber.inneractive.sdk.model.vast.o oVar = gVar.f15908e;
        if (oVar != null) {
            bVar.f15877f = oVar;
        }
        v vVar = gVar.f15910g;
        if (vVar != null) {
            bVar.f15887p = vVar;
        }
        for (m mVar : gVar.f15906c) {
            q qVar = mVar.f15925a;
            if (qVar != null) {
                ArrayList<r> arrayList2 = qVar.f15932a;
                if (arrayList2 != null) {
                    bVar.f15881j = arrayList2.size();
                    for (r rVar : arrayList2) {
                        String str4 = rVar.f15937a;
                        s sVar = s.progressive;
                        if (!str4.equals(sVar.a())) {
                            fVar = new f(e.UNSUPPORTED_DELIVERY, sVar.a());
                        } else if (this.f15710c > -1 && (num = rVar.f15941e) != null && num.intValue() != 0) {
                            int iIntValue = rVar.f15941e.intValue();
                            int i10 = this.f15709b;
                            if (iIntValue < i10) {
                                fVar2 = new f(e.BITRATE_NOT_IN_RANGE, Integer.valueOf(i10));
                            } else {
                                int iIntValue2 = rVar.f15941e.intValue();
                                int i11 = this.f15710c;
                                if (iIntValue2 > i11) {
                                    fVar2 = new f(e.BITRATE_NOT_IN_RANGE, Integer.valueOf(i11));
                                } else if (t.a(rVar.f15940d) != t.UNKNOWN) {
                                    if (!this.f15712e) {
                                        str = rVar.f15942f;
                                        if (str == null) {
                                            if (TextUtils.isEmpty(rVar.f15943g)) {
                                                fVar = new f(e.NO_CONTENT);
                                            } else if (h0.e(rVar.f15943g)) {
                                                fVar = null;
                                            } else {
                                                fVar = new f(e.UNSECURED_VIDEO_URL);
                                            }
                                        } else if (TextUtils.isEmpty(rVar.f15943g)) {
                                            fVar = new f(e.NO_CONTENT);
                                        } else if (h0.e(rVar.f15943g)) {
                                            fVar = new f(e.UNSECURED_VIDEO_URL);
                                        } else {
                                            fVar = null;
                                        }
                                    } else {
                                        str = rVar.f15942f;
                                        if (str == null) {
                                            if (TextUtils.isEmpty(rVar.f15943g)) {
                                                fVar = new f(e.NO_CONTENT);
                                            } else if (h0.e(rVar.f15943g)) {
                                                fVar = new f(e.UNSECURED_VIDEO_URL);
                                            } else {
                                                fVar = null;
                                            }
                                        } else if (TextUtils.isEmpty(rVar.f15943g)) {
                                            fVar = new f(e.NO_CONTENT);
                                        } else if (h0.e(rVar.f15943g)) {
                                            fVar = new f(e.UNSECURED_VIDEO_URL);
                                        } else {
                                            fVar = null;
                                        }
                                    }
                                } else {
                                    fVar = new f(e.UNSUPPORTED_MIME_TYPE);
                                }
                            }
                            fVar = fVar2;
                        } else if (t.a(rVar.f15940d) != t.UNKNOWN) {
                            if (!this.f15712e && rVar.f15938b.intValue() >= rVar.f15939c.intValue()) {
                                fVar = new f(e.VERTICAL_VIDEO_EXPECTED);
                            } else {
                                str = rVar.f15942f;
                                if (str == null && this.f15713f && str.equalsIgnoreCase("VPAID")) {
                                    fVar = new f(e.FILTERED_BY_APP_OR_UNIT);
                                } else if (TextUtils.isEmpty(rVar.f15943g)) {
                                    fVar = new f(e.NO_CONTENT);
                                } else if (h0.e(rVar.f15943g)) {
                                    fVar = new f(e.UNSECURED_VIDEO_URL);
                                } else {
                                    fVar = null;
                                }
                            }
                        } else {
                            fVar = new f(e.UNSUPPORTED_MIME_TYPE);
                        }
                        if (fVar != null) {
                            IAlog.a("%smedia file filtered!: %s", "VastProcessor: ", rVar);
                            IAlog.a("%s-- %s", "VastProcessor: ", rVar);
                            IAlog.a("%s-- %s", "VastProcessor: ", fVar);
                            this.f15714g.put(rVar, fVar);
                        } else {
                            IAlog.a("%sadding media file: %s", "VastProcessor: ", rVar);
                            bVar.f15875d.add(rVar);
                            bVar.f15882k.add(rVar);
                            bVar.f15880i++;
                        }
                    }
                }
                ArrayList<String> arrayList3 = qVar.f15935d;
                if (arrayList3 != null) {
                    for (String str5 : arrayList3) {
                        x xVar3 = x.EVENT_CLICK;
                        if (h0.e(str5)) {
                            bVar.a(xVar3, str5);
                        } else {
                            throw new h("VastErrorUnsecure", "found unsecure tracking event: " + xVar3.a());
                        }
                    }
                }
                ArrayList<w> arrayList4 = qVar.f15933b;
                if (arrayList4 != null) {
                    for (w wVar : arrayList4) {
                        x xVarA = x.a(wVar.f15955a);
                        if (xVarA != x.UNKNOWN) {
                            bVar.a(xVarA, wVar.f15956b);
                        }
                        if (xVarA == x.EVENT_PROGRESS) {
                            String str6 = wVar.f15956b;
                            String str7 = wVar.f15957c;
                            com.fyber.inneractive.sdk.model.vast.e eVar = new com.fyber.inneractive.sdk.model.vast.e(str6, str7);
                            if (!TextUtils.isEmpty(str6) && !TextUtils.isEmpty(str7) && eVar.f15900d != 0) {
                                bVar.f15884m.add(eVar);
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(qVar.f15934c)) {
                    bVar.f15873b = qVar.f15934c;
                }
                String str8 = qVar.f15936e;
                if (!TextUtils.isEmpty(str8) && (strArrSplit = str8.split(StringUtils.PROCESS_POSTFIX_DELIMITER)) != null && strArrSplit.length <= 3) {
                    if (strArrSplit.length == 1) {
                        try {
                            Integer.parseInt(str8);
                        } catch (NumberFormatException unused) {
                        }
                    } else if (strArrSplit.length == 2) {
                        Integer.parseInt(strArrSplit[1]);
                        Integer.parseInt(strArrSplit[0]);
                    } else {
                        Integer.parseInt(strArrSplit[2]);
                        Integer.parseInt(strArrSplit[1]);
                        Integer.parseInt(strArrSplit[0]);
                    }
                }
            }
            if (this.f15708a) {
                com.fyber.inneractive.sdk.model.vast.j jVar = mVar.f15926b;
                ArrayList<com.fyber.inneractive.sdk.model.vast.h> arrayList5 = jVar == null ? null : jVar.f15922a;
                if (arrayList5 != null) {
                    for (com.fyber.inneractive.sdk.model.vast.h hVar2 : arrayList5) {
                        try {
                            a(bVar, hVar2, gVar.f15909f);
                        } catch (b e10) {
                            IAlog.a("Failed processing companion ad: %s error = %s", hVar2, e10.getMessage());
                            hVar2.f15920i = e10;
                            this.f15715h.add(hVar2);
                        }
                    }
                }
            }
        }
        ArrayList arrayList6 = gVar.f15911h;
        String str9 = !arrayList6.isEmpty() ? ((com.fyber.inneractive.sdk.model.vast.n) arrayList6.get(0)).f15927a : null;
        if (TextUtils.isEmpty(str9)) {
            return;
        }
        bVar.f15885n = str9;
    }

    public final void a(com.fyber.inneractive.sdk.model.vast.b bVar, com.fyber.inneractive.sdk.model.vast.i iVar, int i10, int i11, int i12, String str, String str2, List list, List list2, String str3, k kVar) {
        Integer num;
        Integer num2;
        com.fyber.inneractive.sdk.model.vast.c cVar = new com.fyber.inneractive.sdk.model.vast.c(iVar, i11, i12, str, i10);
        cVar.f15894g = str2;
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                w wVar = (w) it.next();
                cVar.a(x.a(wVar.f15955a), wVar.f15956b);
            }
        }
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                cVar.a(x.EVENT_CLICK, (String) it2.next());
            }
        }
        if (!this.f15716i.isEmpty()) {
            com.fyber.inneractive.sdk.model.vast.h hVar = null;
            if (cVar.f15895h > 0) {
                ArrayList arrayList = this.f15716i;
                hVar = (com.fyber.inneractive.sdk.model.vast.h) arrayList.remove(arrayList.size() - 1);
            }
            String str4 = cVar.f15892e;
            for (com.fyber.inneractive.sdk.model.vast.h hVar2 : this.f15716i) {
                String str5 = hVar2.f15914c;
                if ((str4 != null && str4.equals(str5)) || ((str5 == null && (num = hVar2.f15912a) != null && cVar.f15890c == num.intValue() && (num2 = hVar2.f15913b) != null && cVar.f15891d == num2.intValue()) || !hVar2.a())) {
                    ArrayList<String> arrayList2 = hVar2.f15919h;
                    if (arrayList2.size() > 0) {
                        for (String str6 : arrayList2) {
                            if (h0.e(str6)) {
                                cVar.a(x.EVENT_CLICK, str6);
                            }
                        }
                    }
                }
            }
            if (hVar != null) {
                this.f15716i.add(hVar);
            }
        }
        cVar.f15893f = str3;
        cVar.f15889b = kVar;
        bVar.f15878g.add(cVar);
        bVar.f15883l.add(cVar);
    }
}
