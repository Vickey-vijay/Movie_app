package com.iab.omid.library.appodeal.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.appodeal.internal.c;
import com.iab.omid.library.appodeal.internal.e;
import com.iab.omid.library.appodeal.internal.f;
import com.iab.omid.library.appodeal.internal.i;
import com.iab.omid.library.appodeal.publisher.AdSessionStatePublisher;
import com.iab.omid.library.appodeal.publisher.b;
import com.iab.omid.library.appodeal.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class a extends AdSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdSessionContext f21072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f21073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f21074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.appodeal.weakreference.a f21075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f21076e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f21077f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f21078g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f21079h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f21080i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f21081j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f21082k;

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f21074c = new f();
        this.f21077f = false;
        this.f21078g = false;
        this.f21073b = adSessionConfiguration;
        this.f21072a = adSessionContext;
        this.f21079h = str;
        b(null);
        this.f21076e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.appodeal.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f21076e.i();
        c.c().a(this);
        this.f21076e.a(adSessionConfiguration);
    }

    private void a() {
        if (this.f21080i) {
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
                aVar.f21075d.clear();
            }
        }
    }

    private void b() {
        if (this.f21081j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    private void b(@Nullable View view) {
        this.f21075d = new com.iab.omid.library.appodeal.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.appodeal.weakreference.a> list) {
        if (g()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.appodeal.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f21082k.onPossibleObstructionsDetected(this.f21079h, arrayList);
        }
    }

    public void a(@NonNull JSONObject jSONObject) {
        b();
        d().a(jSONObject);
        this.f21081j = true;
    }

    @Override // com.iab.omid.library.appodeal.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f21078g) {
            return;
        }
        this.f21074c.a(view, friendlyObstructionPurpose, str);
    }

    public String c() {
        return this.f21079h;
    }

    public AdSessionStatePublisher d() {
        return this.f21076e;
    }

    public View e() {
        return this.f21075d.get();
    }

    @Override // com.iab.omid.library.appodeal.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f21078g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        d().a(errorType, str);
    }

    public List<e> f() {
        return this.f21074c.a();
    }

    @Override // com.iab.omid.library.appodeal.adsession.AdSession
    public void finish() {
        if (this.f21078g) {
            return;
        }
        this.f21075d.clear();
        removeAllFriendlyObstructions();
        this.f21078g = true;
        d().f();
        c.c().b(this);
        d().b();
        this.f21076e = null;
        this.f21082k = null;
    }

    public boolean g() {
        return this.f21082k != null;
    }

    public boolean h() {
        return this.f21077f && !this.f21078g;
    }

    public boolean i() {
        return this.f21078g;
    }

    public boolean j() {
        return this.f21073b.isNativeImpressionOwner();
    }

    public boolean k() {
        return this.f21073b.isNativeMediaEventsOwner();
    }

    public boolean l() {
        return this.f21077f;
    }

    public void m() {
        a();
        d().g();
        this.f21080i = true;
    }

    public void n() {
        b();
        d().h();
        this.f21081j = true;
    }

    @Override // com.iab.omid.library.appodeal.adsession.AdSession
    public void registerAdView(@Nullable View view) {
        if (this.f21078g || e() == view) {
            return;
        }
        b(view);
        d().a();
        a(view);
    }

    @Override // com.iab.omid.library.appodeal.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f21078g) {
            return;
        }
        this.f21074c.b();
    }

    @Override // com.iab.omid.library.appodeal.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f21078g) {
            return;
        }
        this.f21074c.c(view);
    }

    @Override // com.iab.omid.library.appodeal.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f21082k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.appodeal.adsession.AdSession
    public void start() {
        if (this.f21077f || this.f21076e == null) {
            return;
        }
        this.f21077f = true;
        c.c().c(this);
        this.f21076e.a(i.c().b());
        this.f21076e.a(com.iab.omid.library.appodeal.internal.a.a().b());
        this.f21076e.a(this, this.f21072a);
    }
}
