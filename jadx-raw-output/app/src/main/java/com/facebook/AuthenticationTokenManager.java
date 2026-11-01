package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import ck.i;
import ck.p;
import com.facebook.internal.j0;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.Metadata;
import q1.g;
import q1.t;

/* JADX INFO: compiled from: AuthenticationTokenManager.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \t2\u00020\u0001:\u0002\u000b\u001bB\u0019\b\u0000\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001c\u0010\t\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R(\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/facebook/AuthenticationTokenManager;", "", "Lcom/facebook/AuthenticationToken;", "currentAuthenticationToken", "", "saveToCache", "Lmj/r;", InneractiveMediationDefs.GENDER_FEMALE, "oldAuthenticationToken", "d", "Landroidx/localbroadcastmanager/content/LocalBroadcastManager;", "a", "Landroidx/localbroadcastmanager/content/LocalBroadcastManager;", "localBroadcastManager", "Lq1/g;", "b", "Lq1/g;", "authenticationTokenCache", "c", "Lcom/facebook/AuthenticationToken;", "currentAuthenticationTokenField", "value", "()Lcom/facebook/AuthenticationToken;", "e", "(Lcom/facebook/AuthenticationToken;)V", "<init>", "(Landroidx/localbroadcastmanager/content/LocalBroadcastManager;Lq1/g;)V", "CurrentAuthenticationTokenChangedBroadcastReceiver", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class AuthenticationTokenManager {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static AuthenticationTokenManager f14058e;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final LocalBroadcastManager localBroadcastManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final g authenticationTokenCache;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public AuthenticationToken currentAuthenticationTokenField;

    /* JADX INFO: compiled from: AuthenticationTokenManager.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/facebook/AuthenticationTokenManager$CurrentAuthenticationTokenChangedBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Landroid/content/Intent;", "intent", "Lmj/r;", "onReceive", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class CurrentAuthenticationTokenChangedBroadcastReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            p.j(context, GAMConfig.KEY_CONTEXT);
            p.j(intent, "intent");
        }
    }

    public final void e(AuthenticationToken authenticationToken) {
        f(authenticationToken, true);
    }

    /* JADX INFO: renamed from: com.facebook.AuthenticationTokenManager$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: AuthenticationTokenManager.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/facebook/AuthenticationTokenManager$a;", "", "Lcom/facebook/AuthenticationTokenManager;", "a", "", "ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED", "Ljava/lang/String;", "EXTRA_NEW_AUTHENTICATION_TOKEN", "EXTRA_OLD_AUTHENTICATION_TOKEN", "SHARED_PREFERENCES_NAME", "TAG", "instanceField", "Lcom/facebook/AuthenticationTokenManager;", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final AuthenticationTokenManager a() {
            AuthenticationTokenManager authenticationTokenManager;
            AuthenticationTokenManager authenticationTokenManager2 = AuthenticationTokenManager.f14058e;
            if (authenticationTokenManager2 == null) {
                synchronized (this) {
                    authenticationTokenManager = AuthenticationTokenManager.f14058e;
                    if (authenticationTokenManager == null) {
                        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(t.l());
                        p.i(localBroadcastManager, "getInstance(applicationContext)");
                        AuthenticationTokenManager authenticationTokenManager3 = new AuthenticationTokenManager(localBroadcastManager, new g());
                        AuthenticationTokenManager.f14058e = authenticationTokenManager3;
                        authenticationTokenManager = authenticationTokenManager3;
                    }
                }
                return authenticationTokenManager;
            }
            return authenticationTokenManager2;
        }
    }

    public AuthenticationTokenManager(LocalBroadcastManager localBroadcastManager, g gVar) {
        p.j(localBroadcastManager, "localBroadcastManager");
        p.j(gVar, "authenticationTokenCache");
        this.localBroadcastManager = localBroadcastManager;
        this.authenticationTokenCache = gVar;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AuthenticationToken getCurrentAuthenticationTokenField() {
        return this.currentAuthenticationTokenField;
    }

    public final void d(AuthenticationToken authenticationToken, AuthenticationToken authenticationToken2) {
        Intent intent = new Intent(t.l(), (Class<?>) CurrentAuthenticationTokenChangedBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_AUTHENTICATION_TOKEN", authenticationToken);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_AUTHENTICATION_TOKEN", authenticationToken2);
        this.localBroadcastManager.sendBroadcast(intent);
    }

    public final void f(AuthenticationToken authenticationToken, boolean z10) {
        AuthenticationToken currentAuthenticationTokenField = getCurrentAuthenticationTokenField();
        this.currentAuthenticationTokenField = authenticationToken;
        if (z10) {
            if (authenticationToken != null) {
                this.authenticationTokenCache.b(authenticationToken);
            } else {
                this.authenticationTokenCache.a();
                j0 j0Var = j0.f14425a;
                j0.i(t.l());
            }
        }
        if (!j0.e(currentAuthenticationTokenField, authenticationToken)) {
            d(currentAuthenticationTokenField, authenticationToken);
        }
    }
}
