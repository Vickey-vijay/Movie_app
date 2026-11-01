package com.iab.omid.library.bigosg.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.bigosg.b.c;
import com.iab.omid.library.bigosg.b.f;
import com.iab.omid.library.bigosg.d.e;
import com.iab.omid.library.bigosg.publisher.AdSessionStatePublisher;
import com.iab.omid.library.bigosg.publisher.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class a extends AdSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f21212a = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdSessionContext f21213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AdSessionConfiguration f21214c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.bigosg.e.a f21216e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AdSessionStatePublisher f21217f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f21221j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f21222k;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<c> f21215d = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f21218g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f21219h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f21220i = UUID.randomUUID().toString();

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f21214c = adSessionConfiguration;
        this.f21213b = adSessionContext;
        c(null);
        this.f21217f = adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML ? new com.iab.omid.library.bigosg.publisher.a(adSessionContext.getWebView()) : new b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f21217f.a();
        com.iab.omid.library.bigosg.b.a.a().a(this);
        this.f21217f.a(adSessionConfiguration);
    }

    private c a(View view) {
        for (c cVar : this.f21215d) {
            if (cVar.a().get() == view) {
                return cVar;
            }
        }
        return null;
    }

    private void a(String str) {
        if (str != null) {
            if (str.length() > 50 || !f21212a.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has improperly formatted detailed reason");
            }
        }
    }

    private void b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    private void c(View view) {
        this.f21216e = new com.iab.omid.library.bigosg.e.a(view);
    }

    private void d(View view) {
        Collection<a> collectionB = com.iab.omid.library.bigosg.b.a.a().b();
        if (collectionB == null || collectionB.size() <= 0) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.d() == view) {
                aVar.f21216e.clear();
            }
        }
    }

    private void j() {
        if (this.f21221j) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void k() {
        if (this.f21222k) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    public List<c> a() {
        return this.f21215d;
    }

    public void a(@NonNull JSONObject jSONObject) {
        k();
        getAdSessionStatePublisher().a(jSONObject);
        this.f21222k = true;
    }

    @Override // com.iab.omid.library.bigosg.adsession.AdSession
    public void addFriendlyObstruction(View view) {
        addFriendlyObstruction(view, FriendlyObstructionPurpose.OTHER, null);
    }

    @Override // com.iab.omid.library.bigosg.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f21219h) {
            return;
        }
        b(view);
        a(str);
        if (a(view) == null) {
            this.f21215d.add(new c(view, friendlyObstructionPurpose, str));
        }
    }

    public void b() {
        j();
        getAdSessionStatePublisher().g();
        this.f21221j = true;
    }

    public void c() {
        k();
        getAdSessionStatePublisher().h();
        this.f21222k = true;
    }

    public View d() {
        return this.f21216e.get();
    }

    public boolean e() {
        return this.f21218g && !this.f21219h;
    }

    @Override // com.iab.omid.library.bigosg.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f21219h) {
            throw new IllegalStateException("AdSession is finished");
        }
        e.a(errorType, "Error type is null");
        e.a(str, "Message is null");
        getAdSessionStatePublisher().a(errorType, str);
    }

    public boolean f() {
        return this.f21218g;
    }

    @Override // com.iab.omid.library.bigosg.adsession.AdSession
    public void finish() {
        if (this.f21219h) {
            return;
        }
        this.f21216e.clear();
        removeAllFriendlyObstructions();
        this.f21219h = true;
        getAdSessionStatePublisher().f();
        com.iab.omid.library.bigosg.b.a.a().c(this);
        getAdSessionStatePublisher().b();
        this.f21217f = null;
    }

    public boolean g() {
        return this.f21219h;
    }

    @Override // com.iab.omid.library.bigosg.adsession.AdSession
    public String getAdSessionId() {
        return this.f21220i;
    }

    @Override // com.iab.omid.library.bigosg.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f21217f;
    }

    public boolean h() {
        return this.f21214c.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.f21214c.isNativeMediaEventsOwner();
    }

    @Override // com.iab.omid.library.bigosg.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f21219h) {
            return;
        }
        e.a(view, "AdView is null");
        if (d() == view) {
            return;
        }
        c(view);
        getAdSessionStatePublisher().i();
        d(view);
    }

    @Override // com.iab.omid.library.bigosg.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f21219h) {
            return;
        }
        this.f21215d.clear();
    }

    @Override // com.iab.omid.library.bigosg.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f21219h) {
            return;
        }
        b(view);
        c cVarA = a(view);
        if (cVarA != null) {
            this.f21215d.remove(cVarA);
        }
    }

    @Override // com.iab.omid.library.bigosg.adsession.AdSession
    public void start() {
        if (this.f21218g) {
            return;
        }
        this.f21218g = true;
        com.iab.omid.library.bigosg.b.a.a().b(this);
        this.f21217f.a(f.a().d());
        this.f21217f.a(this, this.f21213b);
    }
}
