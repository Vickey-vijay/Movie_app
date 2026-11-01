package q1;

import android.content.SharedPreferences;
import com.facebook.AuthenticationToken;
import kotlin.Metadata;
import org.json.JSONException;

/* JADX INFO: compiled from: AuthenticationTokenCache.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bB\t\b\u0016¢\u0006\u0004\b\n\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\b¨\u0006\r"}, d2 = {"Lq1/g;", "", "Lcom/facebook/AuthenticationToken;", "authenticationToken", "Lmj/r;", "b", "a", "Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences;", "sharedPreferences", "<init>", "(Landroid/content/SharedPreferences;)V", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final SharedPreferences sharedPreferences;

    public g(SharedPreferences sharedPreferences) {
        ck.p.j(sharedPreferences, "sharedPreferences");
        this.sharedPreferences = sharedPreferences;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public g() {
        SharedPreferences sharedPreferences = t.l().getSharedPreferences("com.facebook.AuthenticationTokenManager.SharedPreferences", 0);
        ck.p.i(sharedPreferences, "FacebookSdk.getApplicationContext()\n              .getSharedPreferences(\n                  AuthenticationTokenManager.SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)");
        this(sharedPreferences);
    }

    public final void a() {
        this.sharedPreferences.edit().remove("com.facebook.AuthenticationManager.CachedAuthenticationToken").apply();
    }

    public final void b(AuthenticationToken authenticationToken) {
        ck.p.j(authenticationToken, "authenticationToken");
        try {
            this.sharedPreferences.edit().putString("com.facebook.AuthenticationManager.CachedAuthenticationToken", authenticationToken.c().toString()).apply();
        } catch (JSONException unused) {
        }
    }
}
