package q1;

import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.facebook.Profile;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C3605n2;
import kotlin.Metadata;

/* JADX INFO: compiled from: ProfileManager.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u00032\u00020\u0001:\u0001\fB\u0019\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u001a\u0010\u001bJ\u0006\u0010\u0003\u001a\u00020\u0002J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u001c\u0010\n\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R(\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lq1/c0;", "", "", "d", "Lcom/facebook/Profile;", "currentProfile", "writeToCache", "Lmj/r;", "g", "oldProfile", "e", "Landroidx/localbroadcastmanager/content/LocalBroadcastManager;", "a", "Landroidx/localbroadcastmanager/content/LocalBroadcastManager;", "localBroadcastManager", "Lq1/b0;", "b", "Lq1/b0;", "profileCache", "c", "Lcom/facebook/Profile;", "currentProfileField", "value", "()Lcom/facebook/Profile;", InneractiveMediationDefs.GENDER_FEMALE, "(Lcom/facebook/Profile;)V", "<init>", "(Landroidx/localbroadcastmanager/content/LocalBroadcastManager;Lq1/b0;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class c0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile c0 f66267e;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final LocalBroadcastManager localBroadcastManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final b0 profileCache;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public Profile currentProfileField;

    /* JADX INFO: renamed from: q1.c0$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: ProfileManager.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lq1/c0$a;", "", "Lq1/c0;", "a", "", "ACTION_CURRENT_PROFILE_CHANGED", "Ljava/lang/String;", "EXTRA_NEW_PROFILE", "EXTRA_OLD_PROFILE", C3605n2.f30210p, "Lq1/c0;", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(ck.i iVar) {
            this();
        }

        public final synchronized c0 a() {
            c0 c0Var;
            if (c0.f66267e == null) {
                LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(t.l());
                ck.p.i(localBroadcastManager, "getInstance(applicationContext)");
                c0.f66267e = new c0(localBroadcastManager, new b0());
            }
            c0Var = c0.f66267e;
            if (c0Var == null) {
                ck.p.B(C3605n2.f30210p);
                throw null;
            }
            return c0Var;
        }
    }

    public final void f(Profile profile) {
        g(profile, true);
    }

    public c0(LocalBroadcastManager localBroadcastManager, b0 b0Var) {
        ck.p.j(localBroadcastManager, "localBroadcastManager");
        ck.p.j(b0Var, "profileCache");
        this.localBroadcastManager = localBroadcastManager;
        this.profileCache = b0Var;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Profile getCurrentProfileField() {
        return this.currentProfileField;
    }

    public final boolean d() {
        Profile profileB = this.profileCache.b();
        if (profileB == null) {
            return false;
        }
        g(profileB, false);
        return true;
    }

    public final void e(Profile profile, Profile profile2) {
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", profile);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", profile2);
        this.localBroadcastManager.sendBroadcast(intent);
    }

    public final void g(Profile profile, boolean z10) {
        Profile profile2 = this.currentProfileField;
        this.currentProfileField = profile;
        if (z10) {
            if (profile != null) {
                this.profileCache.c(profile);
            } else {
                this.profileCache.a();
            }
        }
        if (com.facebook.internal.j0.e(profile2, profile)) {
            return;
        }
        e(profile2, profile);
    }
}
