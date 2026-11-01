package com.iab.omid.library.fyber.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.fyber.internal.c;
import com.iab.omid.library.fyber.internal.e;
import com.iab.omid.library.fyber.internal.f;
import com.iab.omid.library.fyber.internal.i;
import com.iab.omid.library.fyber.publisher.AdSessionStatePublisher;
import com.iab.omid.library.fyber.publisher.b;
import com.iab.omid.library.fyber.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class a extends AdSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdSessionContext f21458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f21459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f21460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.fyber.weakreference.a f21461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f21462e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f21463f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f21464g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f21465h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f21466i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f21467j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f21468k;

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f21460c = new f();
        this.f21463f = false;
        this.f21464g = false;
        this.f21459b = adSessionConfiguration;
        this.f21458a = adSessionContext;
        this.f21465h = str;
        b(null);
        this.f21462e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.fyber.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f21462e.i();
        c.c().a(this);
        this.f21462e.a(adSessionConfiguration);
    }

    private void a() {
        if (this.f21466i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void a(@Nullable View view) {
        Collection<a> collectionB = c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.e() == view) {
                aVar.f21461d.clear();
            }
        }
    }

    private void b() {
        if (this.f21467j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    private void b(@Nullable View view) {
        this.f21461d = new com.iab.omid.library.fyber.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.fyber.weakreference.a> list) {
        if (g()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.fyber.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f21468k.onPossibleObstructionsDetected(this.f21465h, arrayList);
        }
    }

    public void a(@NonNull JSONObject jSONObject) {
        b();
        d().a(jSONObject);
        this.f21467j = true;
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f21464g) {
            return;
        }
        this.f21460c.a(view, friendlyObstructionPurpose, str);
    }

    public String c() {
        return this.f21465h;
    }

    public AdSessionStatePublisher d() {
        return this.f21462e;
    }

    public View e() {
        return this.f21461d.get();
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f21464g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        d().a(errorType, str);
    }

    public List<e> f() {
        return this.f21460c.a();
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void finish() {
        if (this.f21464g) {
            return;
        }
        this.f21461d.clear();
        removeAllFriendlyObstructions();
        this.f21464g = true;
        d().f();
        c.c().b(this);
        d().b();
        this.f21462e = null;
        this.f21468k = null;
    }

    public boolean g() {
        return this.f21468k != null;
    }

    public boolean h() {
        return this.f21463f && !this.f21464g;
    }

    public boolean i() {
        return this.f21464g;
    }

    public boolean j() {
        return this.f21459b.isNativeImpressionOwner();
    }

    public boolean k() {
        return this.f21459b.isNativeMediaEventsOwner();
    }

    public boolean l() {
        return this.f21463f;
    }

    public void m() {
        a();
        d().g();
        this.f21466i = true;
    }

    public void n() {
        b();
        d().h();
        this.f21467j = true;
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void registerAdView(@Nullable View view) {
        if (this.f21464g || e() == view) {
            return;
        }
        b(view);
        d().a();
        a(view);
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f21464g) {
            return;
        }
        this.f21460c.b();
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f21464g) {
            return;
        }
        this.f21460c.c(view);
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f21468k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void start() {
        if (this.f21463f || this.f21462e == null) {
            return;
        }
        this.f21463f = true;
        c.c().c(this);
        this.f21462e.a(i.c().b());
        this.f21462e.a(com.iab.omid.library.fyber.internal.a.a().b());
        this.f21462e.a(this, this.f21458a);
    }
}
