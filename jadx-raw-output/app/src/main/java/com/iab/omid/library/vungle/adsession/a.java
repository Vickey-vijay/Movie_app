package com.iab.omid.library.vungle.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.vungle.internal.c;
import com.iab.omid.library.vungle.internal.e;
import com.iab.omid.library.vungle.internal.f;
import com.iab.omid.library.vungle.internal.i;
import com.iab.omid.library.vungle.publisher.AdSessionStatePublisher;
import com.iab.omid.library.vungle.publisher.b;
import com.iab.omid.library.vungle.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class a extends AdSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdSessionContext f22132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f22133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f22134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.vungle.weakreference.a f22135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f22136e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f22137f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f22138g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f22139h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f22140i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f22141j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f22142k;

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f22134c = new f();
        this.f22137f = false;
        this.f22138g = false;
        this.f22133b = adSessionConfiguration;
        this.f22132a = adSessionContext;
        this.f22139h = str;
        b(null);
        this.f22136e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.vungle.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f22136e.i();
        c.c().a(this);
        this.f22136e.a(adSessionConfiguration);
    }

    private void a() {
        if (this.f22140i) {
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
                aVar.f22135d.clear();
            }
        }
    }

    private void b() {
        if (this.f22141j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    private void b(@Nullable View view) {
        this.f22135d = new com.iab.omid.library.vungle.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.vungle.weakreference.a> list) {
        if (g()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.vungle.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f22142k.onPossibleObstructionsDetected(this.f22139h, arrayList);
        }
    }

    public void a(@NonNull JSONObject jSONObject) {
        b();
        d().a(jSONObject);
        this.f22141j = true;
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f22138g) {
            return;
        }
        this.f22134c.a(view, friendlyObstructionPurpose, str);
    }

    public String c() {
        return this.f22139h;
    }

    public AdSessionStatePublisher d() {
        return this.f22136e;
    }

    public View e() {
        return this.f22135d.get();
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f22138g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        d().a(errorType, str);
    }

    public List<e> f() {
        return this.f22134c.a();
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void finish() {
        if (this.f22138g) {
            return;
        }
        this.f22135d.clear();
        removeAllFriendlyObstructions();
        this.f22138g = true;
        d().f();
        c.c().b(this);
        d().b();
        this.f22136e = null;
        this.f22142k = null;
    }

    public boolean g() {
        return this.f22142k != null;
    }

    public boolean h() {
        return this.f22137f && !this.f22138g;
    }

    public boolean i() {
        return this.f22138g;
    }

    public boolean j() {
        return this.f22133b.isNativeImpressionOwner();
    }

    public boolean k() {
        return this.f22133b.isNativeMediaEventsOwner();
    }

    public boolean l() {
        return this.f22137f;
    }

    public void m() {
        a();
        d().g();
        this.f22140i = true;
    }

    public void n() {
        b();
        d().h();
        this.f22141j = true;
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void registerAdView(@Nullable View view) {
        if (this.f22138g || e() == view) {
            return;
        }
        b(view);
        d().a();
        a(view);
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f22138g) {
            return;
        }
        this.f22134c.b();
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f22138g) {
            return;
        }
        this.f22134c.c(view);
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f22142k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void start() {
        if (this.f22137f || this.f22136e == null) {
            return;
        }
        this.f22137f = true;
        c.c().c(this);
        this.f22136e.a(i.c().b());
        this.f22136e.a(com.iab.omid.library.vungle.internal.a.a().b());
        this.f22136e.a(this, this.f22132a);
    }
}
