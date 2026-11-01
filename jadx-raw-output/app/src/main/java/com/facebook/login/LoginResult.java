package com.facebook.login;

import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: renamed from: com.facebook.login.p, reason: from toString */
/* JADX INFO: compiled from: LoginResult.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\n\u0010\u0018R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0018¨\u0006\u001f"}, d2 = {"Lcom/facebook/login/p;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/facebook/AccessToken;", "a", "Lcom/facebook/AccessToken;", "getAccessToken", "()Lcom/facebook/AccessToken;", "accessToken", "Lcom/facebook/AuthenticationToken;", "b", "Lcom/facebook/AuthenticationToken;", "getAuthenticationToken", "()Lcom/facebook/AuthenticationToken;", "authenticationToken", "", "c", "Ljava/util/Set;", "()Ljava/util/Set;", "recentlyGrantedPermissions", "d", "getRecentlyDeniedPermissions", "recentlyDeniedPermissions", "<init>", "(Lcom/facebook/AccessToken;Lcom/facebook/AuthenticationToken;Ljava/util/Set;Ljava/util/Set;)V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class LoginResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final AccessToken accessToken;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    public final AuthenticationToken authenticationToken;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final Set<String> recentlyGrantedPermissions;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    public final Set<String> recentlyDeniedPermissions;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoginResult)) {
            return false;
        }
        LoginResult loginResult = (LoginResult) other;
        return ck.p.e(this.accessToken, loginResult.accessToken) && ck.p.e(this.authenticationToken, loginResult.authenticationToken) && ck.p.e(this.recentlyGrantedPermissions, loginResult.recentlyGrantedPermissions) && ck.p.e(this.recentlyDeniedPermissions, loginResult.recentlyDeniedPermissions);
    }

    public int hashCode() {
        int iHashCode = this.accessToken.hashCode() * 31;
        AuthenticationToken authenticationToken = this.authenticationToken;
        return ((((iHashCode + (authenticationToken == null ? 0 : authenticationToken.hashCode())) * 31) + this.recentlyGrantedPermissions.hashCode()) * 31) + this.recentlyDeniedPermissions.hashCode();
    }

    public String toString() {
        return "LoginResult(accessToken=" + this.accessToken + ", authenticationToken=" + this.authenticationToken + ", recentlyGrantedPermissions=" + this.recentlyGrantedPermissions + ", recentlyDeniedPermissions=" + this.recentlyDeniedPermissions + ')';
    }

    public LoginResult(AccessToken accessToken, AuthenticationToken authenticationToken, Set<String> set, Set<String> set2) {
        ck.p.j(accessToken, "accessToken");
        ck.p.j(set, "recentlyGrantedPermissions");
        ck.p.j(set2, "recentlyDeniedPermissions");
        this.accessToken = accessToken;
        this.authenticationToken = authenticationToken;
        this.recentlyGrantedPermissions = set;
        this.recentlyDeniedPermissions = set2;
    }

    public final Set<String> a() {
        return this.recentlyGrantedPermissions;
    }
}
