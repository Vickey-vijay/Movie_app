package com.facebook.internal;

import android.net.Uri;
import android.os.Bundle;
import kotlin.Metadata;

/* JADX INFO: compiled from: InstagramCustomTab.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/facebook/internal/v;", "Lcom/facebook/internal/d;", "", "action", "Landroid/os/Bundle;", "parameters", "<init>", "(Ljava/lang/String;Landroid/os/Bundle;)V", "c", "a", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public final class v extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.facebook.internal.v$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: InstagramCustomTab.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¨\u0006\n"}, d2 = {"Lcom/facebook/internal/v$a;", "", "", "action", "Landroid/os/Bundle;", "parameters", "Landroid/net/Uri;", "a", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(ck.i iVar) {
            this();
        }

        public final Uri a(String action, Bundle parameters) {
            ck.p.j(action, "action");
            if (ck.p.e(action, "oauth")) {
                j0 j0Var = j0.f14425a;
                return j0.g(g0.k(), "oauth/authorize", parameters);
            }
            j0 j0Var2 = j0.f14425a;
            return j0.g(g0.k(), q1.t.w() + "/dialog/" + action, parameters);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(String str, Bundle bundle) {
        super(str, bundle);
        ck.p.j(str, "action");
        b(INSTANCE.a(str, bundle == null ? new Bundle() : bundle));
    }
}
