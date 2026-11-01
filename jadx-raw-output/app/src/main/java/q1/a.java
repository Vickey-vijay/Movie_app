package q1;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: AccessTokenCache.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0002\u0007\u000fB\u0017\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u001dB\t\b\u0016¢\u0006\u0004\b\u001c\u0010\u001eJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0005J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\bH\u0002R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00128CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0019R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001f"}, d2 = {"Lq1/a;", "", "Lcom/facebook/AccessToken;", InneractiveMediationDefs.GENDER_FEMALE, "accessToken", "Lmj/r;", "g", "a", "", "e", "h", "Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences;", "sharedPreferences", "Lq1/a$b;", "b", "Lq1/a$b;", "tokenCachingStrategyFactory", "Lq1/a0;", "c", "Lq1/a0;", "tokenCachingStrategyField", "d", "()Lq1/a0;", "tokenCachingStrategy", "()Lcom/facebook/AccessToken;", "cachedAccessToken", "legacyAccessToken", "<init>", "(Landroid/content/SharedPreferences;Lq1/a$b;)V", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final SharedPreferences sharedPreferences;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final b tokenCachingStrategyFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public a0 tokenCachingStrategyField;

    /* JADX INFO: compiled from: AccessTokenCache.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lq1/a$b;", "", "Lq1/a0;", "a", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class b {
        public final a0 a() {
            return new a0(t.l(), null, 2, null);
        }
    }

    public a(SharedPreferences sharedPreferences, b bVar) {
        ck.p.j(sharedPreferences, "sharedPreferences");
        ck.p.j(bVar, "tokenCachingStrategyFactory");
        this.sharedPreferences = sharedPreferences;
        this.tokenCachingStrategyFactory = bVar;
    }

    public final void a() {
        this.sharedPreferences.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
        if (h()) {
            d().a();
        }
    }

    public final AccessToken b() {
        String string = this.sharedPreferences.getString("com.facebook.AccessTokenManager.CachedAccessToken", null);
        if (string == null) {
            return null;
        }
        try {
            return AccessToken.INSTANCE.b(new JSONObject(string));
        } catch (JSONException unused) {
            return null;
        }
    }

    public final boolean e() {
        return this.sharedPreferences.contains("com.facebook.AccessTokenManager.CachedAccessToken");
    }

    public final void g(AccessToken accessToken) {
        ck.p.j(accessToken, "accessToken");
        try {
            this.sharedPreferences.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", accessToken.o().toString()).apply();
        } catch (JSONException unused) {
        }
    }

    public final AccessToken c() {
        Bundle bundleC = d().c();
        if (bundleC != null && a0.INSTANCE.g(bundleC)) {
            return AccessToken.INSTANCE.c(bundleC);
        }
        return null;
    }

    public final a0 d() {
        if (i2.a.d(this)) {
            return null;
        }
        try {
            if (this.tokenCachingStrategyField == null) {
                synchronized (this) {
                    if (this.tokenCachingStrategyField == null) {
                        this.tokenCachingStrategyField = this.tokenCachingStrategyFactory.a();
                    }
                    mj.r rVar = mj.r.f64562a;
                }
            }
            a0 a0Var = this.tokenCachingStrategyField;
            if (a0Var != null) {
                return a0Var;
            }
            throw new IllegalStateException("Required value was null.".toString());
        } catch (Throwable th2) {
            i2.a.b(th2, this);
            return null;
        }
    }

    public final AccessToken f() {
        if (e()) {
            return b();
        }
        if (h()) {
            AccessToken accessTokenC = c();
            if (accessTokenC != null) {
                g(accessTokenC);
                d().a();
                return accessTokenC;
            }
            return accessTokenC;
        }
        return null;
    }

    public final boolean h() {
        return t.G();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a() {
        SharedPreferences sharedPreferences = t.l().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        ck.p.i(sharedPreferences, "FacebookSdk.getApplicationContext()\n              .getSharedPreferences(\n                  AccessTokenManager.SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)");
        this(sharedPreferences, new b());
    }
}
