package com.facebook.login;

import android.os.Bundle;
import android.util.Base64;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.HttpMethod;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.random.Random;
import kotlin.text.Regex;
import nj.b0;
import q1.t;

/* JADX INFO: compiled from: PKCEUtil.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\b\u0010\u0006\u001a\u00020\u0002H\u0007J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0007J \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0010"}, d2 = {"Lcom/facebook/login/s;", "", "", "codeVerifier", "", "d", "c", "Lcom/facebook/login/CodeChallengeMethod;", "codeChallengeMethod", "b", "authorizationCode", "redirectUri", "Lcom/facebook/GraphRequest;", "a", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f14711a = new s();

    public static final boolean d(String codeVerifier) {
        if ((codeVerifier == null || codeVerifier.length() == 0) || codeVerifier.length() < 43 || codeVerifier.length() > 128) {
            return false;
        }
        return new Regex("^[-._~A-Za-z0-9]+$").matches(codeVerifier);
    }

    public static final GraphRequest a(String authorizationCode, String redirectUri, String codeVerifier) {
        ck.p.j(authorizationCode, "authorizationCode");
        ck.p.j(redirectUri, "redirectUri");
        ck.p.j(codeVerifier, "codeVerifier");
        Bundle bundle = new Bundle();
        bundle.putString("code", authorizationCode);
        bundle.putString("client_id", t.m());
        bundle.putString("redirect_uri", redirectUri);
        bundle.putString("code_verifier", codeVerifier);
        GraphRequest graphRequestX = GraphRequest.INSTANCE.x(null, "oauth/access_token", null);
        graphRequestX.F(HttpMethod.GET);
        graphRequestX.G(bundle);
        return graphRequestX;
    }

    public static final String b(String codeVerifier, CodeChallengeMethod codeChallengeMethod) throws FacebookException {
        ck.p.j(codeVerifier, "codeVerifier");
        ck.p.j(codeChallengeMethod, "codeChallengeMethod");
        if (!d(codeVerifier)) {
            throw new FacebookException("Invalid Code Verifier.");
        }
        if (codeChallengeMethod == CodeChallengeMethod.PLAIN) {
            return codeVerifier;
        }
        try {
            byte[] bytes = codeVerifier.getBytes(lk.c.f63595f);
            ck.p.i(bytes, "(this as java.lang.String).getBytes(charset)");
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bytes, 0, bytes.length);
            String strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
            ck.p.i(strEncodeToString, "{\n      // try to generate challenge with S256\n      val bytes: ByteArray = codeVerifier.toByteArray(Charsets.US_ASCII)\n      val messageDigest = MessageDigest.getInstance(\"SHA-256\")\n      messageDigest.update(bytes, 0, bytes.size)\n      val digest = messageDigest.digest()\n\n      Base64.encodeToString(digest, Base64.URL_SAFE or Base64.NO_PADDING or Base64.NO_WRAP)\n    }");
            return strEncodeToString;
        } catch (Exception e10) {
            throw new FacebookException(e10);
        }
    }

    public static final String c() {
        int iN = ik.k.n(new ik.i(43, 128), Random.Default);
        List listZ0 = b0.z0(b0.z0(b0.z0(b0.z0(b0.y0(b0.x0(new ik.c('a', 'z'), new ik.c('A', 'Z')), new ik.c('0', '9')), '-'), '.'), '_'), '~');
        ArrayList arrayList = new ArrayList(iN);
        for (int i10 = 0; i10 < iN; i10++) {
            arrayList.add(Character.valueOf(((Character) b0.A0(listZ0, Random.Default)).charValue()));
        }
        return b0.p0(arrayList, "", null, null, 0, null, null, 62, null);
    }
}
