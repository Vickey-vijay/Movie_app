package com.iab.omid.library.mmadbridge.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.mmadbridge.internal.c;
import com.iab.omid.library.mmadbridge.internal.e;
import com.iab.omid.library.mmadbridge.internal.f;
import com.iab.omid.library.mmadbridge.internal.i;
import com.iab.omid.library.mmadbridge.publisher.AdSessionStatePublisher;
import com.iab.omid.library.mmadbridge.publisher.b;
import com.iab.omid.library.mmadbridge.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class a extends AdSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdSessionContext f21869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f21870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f21871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.mmadbridge.weakreference.a f21872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f21873e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f21874f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f21875g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f21876h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f21877i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f21878j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f21879k;

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f21871c = new f();
        this.f21874f = false;
        this.f21875g = false;
        this.f21870b = adSessionConfiguration;
        this.f21869a = adSessionContext;
        this.f21876h = str;
        b(null);
        this.f21873e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.mmadbridge.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f21873e.i();
        c.c().a(this);
        this.f21873e.a(adSessionConfiguration);
    }

    private void a() {
        if (this.f21877i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void a(View view) {
        Collection<a> collectionB = c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.c() == view) {
                aVar.f21872d.clear();
            }
        }
    }

    private void b() {
        if (this.f21878j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    private void b(View view) {
        this.f21872d = new com.iab.omid.library.mmadbridge.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.mmadbridge.weakreference.a> list) {
        if (e()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.mmadbridge.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f21879k.onPossibleObstructionsDetected(this.f21876h, arrayList);
        }
    }

    public void a(@NonNull JSONObject jSONObject) {
        b();
        getAdSessionStatePublisher().a(jSONObject);
        this.f21878j = true;
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f21875g) {
            return;
        }
        this.f21871c.a(view, friendlyObstructionPurpose, str);
    }

    public View c() {
        return this.f21872d.get();
    }

    public List<e> d() {
        return this.f21871c.a();
    }

    public boolean e() {
        return this.f21879k != null;
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f21875g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        getAdSessionStatePublisher().a(errorType, str);
    }

    public boolean f() {
        return this.f21874f && !this.f21875g;
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void finish() {
        if (this.f21875g) {
            return;
        }
        this.f21872d.clear();
        removeAllFriendlyObstructions();
        this.f21875g = true;
        getAdSessionStatePublisher().f();
        c.c().b(this);
        getAdSessionStatePublisher().b();
        this.f21873e = null;
        this.f21879k = null;
    }

    public boolean g() {
        return this.f21875g;
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public String getAdSessionId() {
        return this.f21876h;
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f21873e;
    }

    public boolean h() {
        return this.f21870b.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.f21870b.isNativeMediaEventsOwner();
    }

    public boolean j() {
        return this.f21874f;
    }

    public void k() {
        a();
        getAdSessionStatePublisher().g();
        this.f21877i = true;
    }

    public void l() {
        b();
        getAdSessionStatePublisher().h();
        this.f21878j = true;
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f21875g) {
            return;
        }
        g.a(view, "AdView is null");
        if (c() == view) {
            return;
        }
        b(view);
        getAdSessionStatePublisher().a();
        a(view);
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f21875g) {
            return;
        }
        this.f21871c.b();
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f21875g) {
            return;
        }
        this.f21871c.c(view);
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f21879k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void start() {
        if (this.f21874f) {
            return;
        }
        this.f21874f = true;
        c.c().c(this);
        this.f21873e.a(i.c().b());
        this.f21873e.a(com.iab.omid.library.mmadbridge.internal.a.a().b());
        this.f21873e.a(this, this.f21869a);
    }
}
