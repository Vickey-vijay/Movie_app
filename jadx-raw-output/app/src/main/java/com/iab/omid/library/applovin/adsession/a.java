package com.iab.omid.library.applovin.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.applovin.internal.c;
import com.iab.omid.library.applovin.internal.e;
import com.iab.omid.library.applovin.internal.f;
import com.iab.omid.library.applovin.internal.i;
import com.iab.omid.library.applovin.publisher.AdSessionStatePublisher;
import com.iab.omid.library.applovin.publisher.b;
import com.iab.omid.library.applovin.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class a extends AdSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdSessionContext f20937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f20938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f20939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.applovin.weakreference.a f20940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f20941e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f20942f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f20943g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f20944h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f20945i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f20946j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f20947k;

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f20939c = new f();
        this.f20942f = false;
        this.f20943g = false;
        this.f20938b = adSessionConfiguration;
        this.f20937a = adSessionContext;
        this.f20944h = str;
        b(null);
        this.f20941e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.applovin.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f20941e.i();
        c.c().a(this);
        this.f20941e.a(adSessionConfiguration);
    }

    private void a() {
        if (this.f20945i) {
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
                aVar.f20940d.clear();
            }
        }
    }

    private void b() {
        if (this.f20946j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    private void b(@Nullable View view) {
        this.f20940d = new com.iab.omid.library.applovin.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.applovin.weakreference.a> list) {
        if (g()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.applovin.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f20947k.onPossibleObstructionsDetected(this.f20944h, arrayList);
        }
    }

    public void a(@NonNull JSONObject jSONObject) {
        b();
        d().a(jSONObject);
        this.f20946j = true;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f20943g) {
            return;
        }
        this.f20939c.a(view, friendlyObstructionPurpose, str);
    }

    public String c() {
        return this.f20944h;
    }

    public AdSessionStatePublisher d() {
        return this.f20941e;
    }

    public View e() {
        return this.f20940d.get();
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f20943g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        d().a(errorType, str);
    }

    public List<e> f() {
        return this.f20939c.a();
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void finish() {
        if (this.f20943g) {
            return;
        }
        this.f20940d.clear();
        removeAllFriendlyObstructions();
        this.f20943g = true;
        d().f();
        c.c().b(this);
        d().b();
        this.f20941e = null;
        this.f20947k = null;
    }

    public boolean g() {
        return this.f20947k != null;
    }

    public boolean h() {
        return this.f20942f && !this.f20943g;
    }

    public boolean i() {
        return this.f20943g;
    }

    public boolean j() {
        return this.f20938b.isNativeImpressionOwner();
    }

    public boolean k() {
        return this.f20938b.isNativeMediaEventsOwner();
    }

    public boolean l() {
        return this.f20942f;
    }

    public void m() {
        a();
        d().g();
        this.f20945i = true;
    }

    public void n() {
        b();
        d().h();
        this.f20946j = true;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void registerAdView(@Nullable View view) {
        if (this.f20943g || e() == view) {
            return;
        }
        b(view);
        d().a();
        a(view);
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f20943g) {
            return;
        }
        this.f20939c.b();
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f20943g) {
            return;
        }
        this.f20939c.c(view);
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f20947k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void start() {
        if (this.f20942f || this.f20941e == null) {
            return;
        }
        this.f20942f = true;
        c.c().c(this);
        this.f20941e.a(i.c().b());
        this.f20941e.a(com.iab.omid.library.applovin.internal.a.a().b());
        this.f20941e.a(this, this.f20937a);
    }
}
