package com.iab.omid.library.ironsrc.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.ironsrc.internal.c;
import com.iab.omid.library.ironsrc.internal.e;
import com.iab.omid.library.ironsrc.internal.f;
import com.iab.omid.library.ironsrc.internal.i;
import com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher;
import com.iab.omid.library.ironsrc.publisher.b;
import com.iab.omid.library.ironsrc.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class a extends AdSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdSessionContext f21734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f21735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f21736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.ironsrc.weakreference.a f21737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f21738e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f21739f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f21740g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f21741h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f21742i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f21743j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f21744k;

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f21736c = new f();
        this.f21739f = false;
        this.f21740g = false;
        this.f21735b = adSessionConfiguration;
        this.f21734a = adSessionContext;
        this.f21741h = str;
        b(null);
        this.f21738e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.ironsrc.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f21738e.i();
        c.c().a(this);
        this.f21738e.a(adSessionConfiguration);
    }

    private void a() {
        if (this.f21742i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void a(@Nullable View view) {
        Collection<a> collectionB = c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.c() == view) {
                aVar.f21737d.clear();
            }
        }
    }

    private void b() {
        if (this.f21743j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    private void b(@Nullable View view) {
        this.f21737d = new com.iab.omid.library.ironsrc.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.ironsrc.weakreference.a> list) {
        if (e()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.ironsrc.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f21744k.onPossibleObstructionsDetected(this.f21741h, arrayList);
        }
    }

    public void a(@NonNull JSONObject jSONObject) {
        b();
        getAdSessionStatePublisher().a(jSONObject);
        this.f21743j = true;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f21740g) {
            return;
        }
        this.f21736c.a(view, friendlyObstructionPurpose, str);
    }

    public View c() {
        return this.f21737d.get();
    }

    public List<e> d() {
        return this.f21736c.a();
    }

    public boolean e() {
        return this.f21744k != null;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f21740g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        getAdSessionStatePublisher().a(errorType, str);
    }

    public boolean f() {
        return this.f21739f && !this.f21740g;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void finish() {
        if (this.f21740g) {
            return;
        }
        this.f21737d.clear();
        removeAllFriendlyObstructions();
        this.f21740g = true;
        getAdSessionStatePublisher().f();
        c.c().b(this);
        getAdSessionStatePublisher().b();
        this.f21738e = null;
        this.f21744k = null;
    }

    public boolean g() {
        return this.f21740g;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public String getAdSessionId() {
        return this.f21741h;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f21738e;
    }

    public boolean h() {
        return this.f21735b.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.f21735b.isNativeMediaEventsOwner();
    }

    public boolean j() {
        return this.f21739f;
    }

    public void k() {
        a();
        getAdSessionStatePublisher().g();
        this.f21742i = true;
    }

    public void l() {
        b();
        getAdSessionStatePublisher().h();
        this.f21743j = true;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void registerAdView(@Nullable View view) {
        if (this.f21740g || c() == view) {
            return;
        }
        b(view);
        getAdSessionStatePublisher().a();
        a(view);
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f21740g) {
            return;
        }
        this.f21736c.b();
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f21740g) {
            return;
        }
        this.f21736c.c(view);
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f21744k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void start() {
        if (this.f21739f || this.f21738e == null) {
            return;
        }
        this.f21739f = true;
        c.c().c(this);
        this.f21738e.a(i.c().b());
        this.f21738e.a(com.iab.omid.library.ironsrc.internal.a.a().b());
        this.f21738e.a(this, this.f21734a);
    }
}
