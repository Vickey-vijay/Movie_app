package com.facebook.login;

import com.google.android.gms.common.Scopes;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;

/* JADX INFO: compiled from: LoginConfiguration.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u001e\n\u0002\b\u0005\u0018\u0000 \u00122\u00020\u0001:\u0001\u0004B#\b\u0017\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010B-\b\u0016\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0011R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\r\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u0004\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/facebook/login/k;", "", "", "", "a", "Ljava/util/Set;", "c", "()Ljava/util/Set;", "permissions", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "nonce", "codeVerifier", "", "<init>", "(Ljava/util/Collection;Ljava/lang/String;)V", "(Ljava/util/Collection;Ljava/lang/String;Ljava/lang/String;)V", "d", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final Set<String> permissions;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final String nonce;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final String codeVerifier;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ k(Collection collection, String str, int i10, ck.i iVar) {
        if ((i10 & 2) != 0) {
            str = UUID.randomUUID().toString();
            ck.p.i(str, "randomUUID().toString()");
        }
        this(collection, str);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCodeVerifier() {
        return this.codeVerifier;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getNonce() {
        return this.nonce;
    }

    public final Set<String> c() {
        return this.permissions;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(Collection<String> collection, String str) {
        this(collection, str, s.c());
        ck.p.j(str, "nonce");
    }

    public k(Collection<String> collection, String str, String str2) {
        ck.p.j(str, "nonce");
        ck.p.j(str2, "codeVerifier");
        if (r.a(str) && s.d(str2)) {
            HashSet hashSet = collection != null ? new HashSet(collection) : new HashSet();
            hashSet.add(Scopes.OPEN_ID);
            Set<String> setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
            ck.p.i(setUnmodifiableSet, "unmodifiableSet(permissions)");
            this.permissions = setUnmodifiableSet;
            this.nonce = str;
            this.codeVerifier = str2;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
