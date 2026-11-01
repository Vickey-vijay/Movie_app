package com.fyber.inneractive.sdk.flow.nativead;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.network.u0;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements c, s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CountDownLatch f15502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f15503b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f15505d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f15504c = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f15506e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f15507f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f15508g = b.UNINITIALIZED;

    @Override // com.fyber.inneractive.sdk.flow.nativead.c
    public final boolean a() {
        return this.f15508g == b.LOADING;
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.s
    public final void a(g gVar, Exception exc, com.fyber.inneractive.sdk.response.nativead.f fVar) throws Throwable {
        if (gVar != null) {
            this.f15507f.add(gVar);
        } else {
            this.f15506e.add(fVar);
        }
        CountDownLatch countDownLatch = this.f15502a;
        if (countDownLatch == null) {
            return;
        }
        countDownLatch.countDown();
        if (this.f15502a.getCount() == 0) {
            this.f15508g = b.LOADED;
            c();
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.c
    public final void b() throws Throwable {
        com.fyber.inneractive.sdk.response.nativead.c cVar;
        String str;
        if (this.f15505d.isEmpty()) {
            this.f15508g = b.FAILED;
            c();
            return;
        }
        for (com.fyber.inneractive.sdk.response.nativead.f fVar : this.f15505d) {
            if (fVar != null && (cVar = fVar.f18469d) != null && (str = cVar.f18463a) != null && !str.trim().isEmpty()) {
                ArrayList arrayList = this.f15504c;
                if (arrayList == null) {
                    break;
                }
                arrayList.add(new u0(new t(fVar, this), IAConfigManager.O.f15027v.f15118a, new com.fyber.inneractive.sdk.cache.d(fVar.f18469d.f18463a)));
                break;
            }
            IAlog.f("%sImage asset not downloadable. imageAssetId: %s, imageObject: %s", IAlog.a(this), Integer.valueOf(fVar.f18466a), fVar.f18469d);
            this.f15506e.add(fVar);
        }
        ArrayList arrayList2 = this.f15504c;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            this.f15508g = b.FAILED;
            c();
            return;
        }
        this.f15508g = b.LOADING;
        this.f15502a = new CountDownLatch(this.f15504c.size());
        Iterator it = this.f15504c.iterator();
        while (it.hasNext()) {
            IAConfigManager.O.f15024s.a((u0) it.next());
        }
    }

    public final void c() throws Throwable {
        e eVar = this.f15503b;
        if (eVar != null) {
            ArrayList arrayList = this.f15507f;
            ArrayList<com.fyber.inneractive.sdk.response.nativead.f> arrayList2 = this.f15506e;
            if (!arrayList.isEmpty()) {
                eVar.f15485a.f15491d.addAll(arrayList);
            }
            if (!arrayList2.isEmpty()) {
                for (com.fyber.inneractive.sdk.response.nativead.f fVar : arrayList2) {
                    IAlog.f("%sFailed to load image asset. id: %s, imageObj: %s", f.f15486m, Integer.valueOf(fVar.f18466a), fVar.f18469d);
                }
            }
            eVar.f15485a.a();
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.c
    public final void destroy() {
        ArrayList arrayList = this.f15504c;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = this.f15504c.iterator();
            while (it.hasNext()) {
                ((u0) it.next()).f16085a = true;
            }
            this.f15504c.clear();
        }
        this.f15504c = null;
        this.f15508g = b.DESTROYED;
    }

    public h(ArrayList arrayList, e eVar) {
        this.f15505d = arrayList;
        this.f15503b = eVar;
    }
}
