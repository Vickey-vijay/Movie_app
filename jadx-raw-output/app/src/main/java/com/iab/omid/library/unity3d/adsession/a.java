package com.iab.omid.library.unity3d.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.unity3d.internal.c;
import com.iab.omid.library.unity3d.internal.e;
import com.iab.omid.library.unity3d.internal.h;
import com.iab.omid.library.unity3d.publisher.AdSessionStatePublisher;
import com.iab.omid.library.unity3d.publisher.b;
import com.iab.omid.library.unity3d.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class a extends AdSession {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Pattern f22004l = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdSessionContext f22005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f22006b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.unity3d.weakreference.a f22008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f22009e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f22012h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f22013i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f22014j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f22015k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<e> f22007c = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f22010f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f22011g = false;

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f22006b = adSessionConfiguration;
        this.f22005a = adSessionContext;
        String string = UUID.randomUUID().toString();
        this.f22012h = string;
        d(null);
        this.f22009e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.unity3d.publisher.a(string, adSessionContext.getWebView()) : new b(string, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f22009e.i();
        c.c().a(this);
        this.f22009e.a(adSessionConfiguration);
    }

    private void a() {
        if (this.f22013i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private static void a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    private void a(String str) {
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!f22004l.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
    }

    private e b(View view) {
        for (e eVar : this.f22007c) {
            if (eVar.c().get() == view) {
                return eVar;
            }
        }
        return null;
    }

    private void b() {
        if (this.f22014j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    private void c(View view) {
        Collection<a> collectionB = c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.c() == view) {
                aVar.f22008d.clear();
            }
        }
    }

    private void d(View view) {
        this.f22008d = new com.iab.omid.library.unity3d.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.unity3d.weakreference.a> list) {
        if (e()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.unity3d.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f22015k.onPossibleObstructionsDetected(this.f22012h, arrayList);
        }
    }

    public void a(@NonNull JSONObject jSONObject) {
        b();
        getAdSessionStatePublisher().a(jSONObject);
        this.f22014j = true;
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f22011g) {
            return;
        }
        a(view);
        a(str);
        if (b(view) == null) {
            this.f22007c.add(new e(view, friendlyObstructionPurpose, str));
        }
    }

    public View c() {
        return this.f22008d.get();
    }

    public List<e> d() {
        return this.f22007c;
    }

    public boolean e() {
        return this.f22015k != null;
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f22011g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        getAdSessionStatePublisher().a(errorType, str);
    }

    public boolean f() {
        return this.f22010f && !this.f22011g;
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void finish() {
        if (this.f22011g) {
            return;
        }
        this.f22008d.clear();
        removeAllFriendlyObstructions();
        this.f22011g = true;
        getAdSessionStatePublisher().f();
        c.c().b(this);
        getAdSessionStatePublisher().b();
        this.f22009e = null;
        this.f22015k = null;
    }

    public boolean g() {
        return this.f22011g;
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public String getAdSessionId() {
        return this.f22012h;
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f22009e;
    }

    public boolean h() {
        return this.f22006b.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.f22006b.isNativeMediaEventsOwner();
    }

    public boolean j() {
        return this.f22010f;
    }

    public void k() {
        a();
        getAdSessionStatePublisher().g();
        this.f22013i = true;
    }

    public void l() {
        b();
        getAdSessionStatePublisher().h();
        this.f22014j = true;
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f22011g) {
            return;
        }
        g.a(view, "AdView is null");
        if (c() == view) {
            return;
        }
        d(view);
        getAdSessionStatePublisher().a();
        c(view);
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f22011g) {
            return;
        }
        this.f22007c.clear();
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f22011g) {
            return;
        }
        a(view);
        e eVarB = b(view);
        if (eVarB != null) {
            this.f22007c.remove(eVarB);
        }
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f22015k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void start() {
        if (this.f22010f) {
            return;
        }
        this.f22010f = true;
        c.c().c(this);
        this.f22009e.a(h.c().b());
        this.f22009e.a(com.iab.omid.library.unity3d.internal.a.a().b());
        this.f22009e.a(this, this.f22005a);
    }
}
