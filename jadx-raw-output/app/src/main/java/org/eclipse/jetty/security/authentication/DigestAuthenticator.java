package org.eclipse.jetty.security.authentication;

import androidx.core.app.NotificationCompat;
import com.applovin.sdk.AppLovinEventParameters;
import com.mbridge.msdk.foundation.download.download.ResourceManager;
import com.mbridge.msdk.foundation.tools.SameMD5;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.BitSet;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import kj.t;
import org.eclipse.jetty.security.ServerAuthException;
import org.eclipse.jetty.util.security.Constraint;
import org.eclipse.jetty.util.security.Credential;
import pm.l;
import qm.e;
import rm.d;
import rm.n;
import rm.v;
import xm.m;
import xm.p;
import zm.b;
import zm.c;

/* JADX INFO: loaded from: classes6.dex */
public class DigestAuthenticator extends e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f65664i = b.a(DigestAuthenticator.class);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SecureRandom f65665d = new SecureRandom();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f65666e = 60000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f65667f = 1024;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ConcurrentMap<String, a> f65668g = new ConcurrentHashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Queue<a> f65669h = new ConcurrentLinkedQueue();

    public static class Digest extends Credential {
        private static final long serialVersionUID = -2484639019549527724L;
        public final String method;
        public String username = "";
        public String realm = "";
        public String nonce = "";

        /* JADX INFO: renamed from: nc, reason: collision with root package name */
        public String f65670nc = "";
        public String cnonce = "";
        public String qop = "";
        public String uri = "";
        public String response = "";

        @Override // org.eclipse.jetty.util.security.Credential
        public boolean check(Object obj) {
            byte[] bArrDigest;
            if (obj instanceof char[]) {
                obj = new String((char[]) obj);
            }
            String string = obj instanceof String ? (String) obj : obj.toString();
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
                if (obj instanceof Credential.MD5) {
                    bArrDigest = ((Credential.MD5) obj).getDigest();
                } else {
                    messageDigest.update(this.username.getBytes("ISO-8859-1"));
                    messageDigest.update((byte) 58);
                    messageDigest.update(this.realm.getBytes("ISO-8859-1"));
                    messageDigest.update((byte) 58);
                    messageDigest.update(string.getBytes("ISO-8859-1"));
                    bArrDigest = messageDigest.digest();
                }
                messageDigest.reset();
                messageDigest.update(this.method.getBytes("ISO-8859-1"));
                messageDigest.update((byte) 58);
                messageDigest.update(this.uri.getBytes("ISO-8859-1"));
                byte[] bArrDigest2 = messageDigest.digest();
                messageDigest.update(p.j(bArrDigest, 16).getBytes("ISO-8859-1"));
                messageDigest.update((byte) 58);
                messageDigest.update(this.nonce.getBytes("ISO-8859-1"));
                messageDigest.update((byte) 58);
                messageDigest.update(this.f65670nc.getBytes("ISO-8859-1"));
                messageDigest.update((byte) 58);
                messageDigest.update(this.cnonce.getBytes("ISO-8859-1"));
                messageDigest.update((byte) 58);
                messageDigest.update(this.qop.getBytes("ISO-8859-1"));
                messageDigest.update((byte) 58);
                messageDigest.update(p.j(bArrDigest2, 16).getBytes("ISO-8859-1"));
                return p.j(messageDigest.digest(), 16).equalsIgnoreCase(this.response);
            } catch (Exception e10) {
                DigestAuthenticator.f65664i.e(e10);
                return false;
            }
        }

        public String toString() {
            return this.username + StringUtils.COMMA + this.response;
        }

        public Digest(String str) {
            this.method = str;
        }
    }

    @Override // pm.a
    public boolean a(kj.p pVar, t tVar, boolean z10, d.h hVar) throws ServerAuthException {
        return true;
    }

    @Override // pm.a
    public String getAuthMethod() {
        return Constraint.__DIGEST_AUTH;
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f65671a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f65672b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final BitSet f65673c;

        public boolean a(int i10) {
            synchronized (this) {
                if (i10 >= this.f65673c.size()) {
                    return true;
                }
                boolean z10 = this.f65673c.get(i10);
                this.f65673c.set(i10);
                return z10;
            }
        }

        public a(String str, long j10, int i10) {
            this.f65671a = str;
            this.f65672b = j10;
            this.f65673c = new BitSet(i10);
        }
    }

    @Override // pm.a
    public d b(kj.p pVar, t tVar, boolean z10) throws ServerAuthException {
        if (!z10) {
            return new qm.c(this);
        }
        lj.a aVar = (lj.a) pVar;
        lj.c cVar = (lj.c) tVar;
        String strM = aVar.m("Authorization");
        boolean z11 = true;
        if (strM != null) {
            try {
                c cVar2 = f65664i;
                if (cVar2.f()) {
                    cVar2.i("Credentials: " + strM, new Object[0]);
                }
                m mVar = new m(strM, "=, ", true, false);
                Digest digest = new Digest(aVar.getMethod());
                String str = null;
                String str2 = null;
                while (mVar.hasMoreTokens()) {
                    String strNextToken = mVar.nextToken();
                    char cCharAt = strNextToken.length() == 1 ? strNextToken.charAt(0) : (char) 0;
                    if (cCharAt != ' ') {
                        if (cCharAt != ',') {
                            if (cCharAt == '=') {
                                str2 = str;
                            } else if (str2 != null) {
                                if (AppLovinEventParameters.USER_ACCOUNT_IDENTIFIER.equalsIgnoreCase(str2)) {
                                    digest.username = strNextToken;
                                } else if ("realm".equalsIgnoreCase(str2)) {
                                    digest.realm = strNextToken;
                                } else if ("nonce".equalsIgnoreCase(str2)) {
                                    digest.nonce = strNextToken;
                                } else if (ResourceManager.KEY_MD5CHECK.equalsIgnoreCase(str2)) {
                                    digest.f65670nc = strNextToken;
                                } else if ("cnonce".equalsIgnoreCase(str2)) {
                                    digest.cnonce = strNextToken;
                                } else if ("qop".equalsIgnoreCase(str2)) {
                                    digest.qop = strNextToken;
                                } else if (NotificationCompat.MessagingStyle.Message.KEY_DATA_URI.equalsIgnoreCase(str2)) {
                                    digest.uri = strNextToken;
                                } else if ("response".equalsIgnoreCase(str2)) {
                                    digest.response = strNextToken;
                                }
                                str2 = null;
                            }
                            str = strNextToken;
                        } else {
                            str2 = null;
                        }
                    }
                }
                int iH = h(digest, (n) aVar);
                if (iH > 0) {
                    v vVarE = e(digest.username, digest, pVar);
                    if (vVarE != null) {
                        return new l(getAuthMethod(), vVarE);
                    }
                } else if (iH == 0) {
                }
                z11 = false;
            } catch (IOException e10) {
                throw new ServerAuthException(e10);
            }
        } else {
            z11 = false;
        }
        if (qm.c.d(cVar)) {
            return d.H8;
        }
        String strF = aVar.f();
        if (strF == null) {
            strF = "/";
        }
        cVar.j("WWW-Authenticate", "Digest realm=\"" + this.f66625a.getName() + "\", domain=\"" + strF + "\", nonce=\"" + i((n) aVar) + "\", algorithm=MD5, qop=\"auth\", stale=" + z11);
        cVar.o(401);
        return d.J8;
    }

    public String i(n nVar) {
        a aVar;
        do {
            byte[] bArr = new byte[24];
            this.f65665d.nextBytes(bArr);
            aVar = new a(new String(xm.d.e(bArr)), nVar.T(), this.f65667f);
        } while (this.f65668g.putIfAbsent(aVar.f65671a, aVar) != null);
        this.f65669h.add(aVar);
        return aVar.f65671a;
    }

    @Override // qm.e, pm.a
    public void c(pm.a.InterfaceC0617a interfaceC0617a) {
        super.c(interfaceC0617a);
        String initParameter = interfaceC0617a.getInitParameter("maxNonceAge");
        if (initParameter != null) {
            this.f65666e = Long.valueOf(initParameter).longValue();
        }
    }

    public final int h(Digest digest, n nVar) {
        long jT = nVar.T() - this.f65666e;
        a aVarPeek = this.f65669h.peek();
        while (aVarPeek != null && aVarPeek.f65672b < jT) {
            this.f65669h.remove(aVarPeek);
            this.f65668g.remove(aVarPeek.f65671a);
            aVarPeek = this.f65669h.peek();
        }
        try {
            a aVar = this.f65668g.get(digest.nonce);
            if (aVar == null) {
                return 0;
            }
            long j10 = Long.parseLong(digest.f65670nc, 16);
            if (j10 >= this.f65667f) {
                return 0;
            }
            if (aVar.a((int) j10)) {
                return -1;
            }
            return 1;
        } catch (Exception e10) {
            f65664i.h(e10);
            return -1;
        }
    }
}
