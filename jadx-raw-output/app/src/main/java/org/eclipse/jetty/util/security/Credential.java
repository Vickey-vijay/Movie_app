package org.eclipse.jetty.util.security;

import com.mbridge.msdk.foundation.tools.SameMD5;
import java.io.Serializable;
import java.security.MessageDigest;
import xm.p;
import zm.b;
import zm.c;

/* JADX INFO: loaded from: classes8.dex */
public abstract class Credential implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f65746b = b.a(Credential.class);
    private static final long serialVersionUID = -7760551052768181572L;

    public static class Crypt extends Credential {
        public static final String __TYPE = "CRYPT:";
        private static final long serialVersionUID = -2027792997664744210L;
        private final String _cooked;

        public static String crypt(String str, String str2) {
            return __TYPE + bn.c.a(str2, str);
        }

        @Override // org.eclipse.jetty.util.security.Credential
        public boolean check(Object obj) {
            if (obj instanceof char[]) {
                obj = new String((char[]) obj);
            }
            if (!(obj instanceof String) && !(obj instanceof Password)) {
                Credential.f65746b.g("Can't check " + obj.getClass() + " against CRYPT", new Object[0]);
            }
            String string = obj.toString();
            String str = this._cooked;
            return str.equals(bn.c.a(string, str));
        }

        public Crypt(String str) {
            this._cooked = str.startsWith(__TYPE) ? str.substring(6) : str;
        }
    }

    public static class MD5 extends Credential {
        public static final String __TYPE = "MD5:";
        public static final Object __md5Lock = new Object();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static MessageDigest f65747c = null;
        private static final long serialVersionUID = 5533846540822684240L;
        private final byte[] _digest;

        public static String digest(String str) {
            byte[] bArrDigest;
            try {
                synchronized (__md5Lock) {
                    if (f65747c == null) {
                        try {
                            f65747c = MessageDigest.getInstance(SameMD5.TAG);
                        } catch (Exception e10) {
                            Credential.f65746b.e(e10);
                            return null;
                        }
                    }
                    f65747c.reset();
                    f65747c.update(str.getBytes("ISO-8859-1"));
                    bArrDigest = f65747c.digest();
                }
                return __TYPE + p.j(bArrDigest, 16);
            } catch (Exception e11) {
                Credential.f65746b.e(e11);
                return null;
            }
        }

        @Override // org.eclipse.jetty.util.security.Credential
        public boolean check(Object obj) {
            byte[] bArrDigest;
            try {
                if (obj instanceof char[]) {
                    obj = new String((char[]) obj);
                }
                if (!(obj instanceof Password) && !(obj instanceof String)) {
                    if (!(obj instanceof MD5)) {
                        if (obj instanceof Credential) {
                            return ((Credential) obj).check(this);
                        }
                        Credential.f65746b.g("Can't check " + obj.getClass() + " against MD5", new Object[0]);
                        return false;
                    }
                    MD5 md5 = (MD5) obj;
                    if (this._digest.length != md5._digest.length) {
                        return false;
                    }
                    int i10 = 0;
                    while (true) {
                        byte[] bArr = this._digest;
                        if (i10 >= bArr.length) {
                            return true;
                        }
                        if (bArr[i10] != md5._digest[i10]) {
                            return false;
                        }
                        i10++;
                    }
                }
                synchronized (__md5Lock) {
                    if (f65747c == null) {
                        f65747c = MessageDigest.getInstance(SameMD5.TAG);
                    }
                    f65747c.reset();
                    f65747c.update(obj.toString().getBytes("ISO-8859-1"));
                    bArrDigest = f65747c.digest();
                }
                if (bArrDigest != null && bArrDigest.length == this._digest.length) {
                    for (int i11 = 0; i11 < bArrDigest.length; i11++) {
                        if (bArrDigest[i11] != this._digest[i11]) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            } catch (Exception e10) {
                Credential.f65746b.e(e10);
                return false;
            }
        }

        public byte[] getDigest() {
            return this._digest;
        }

        public MD5(String str) {
            this._digest = p.d(str.startsWith(__TYPE) ? str.substring(4) : str, 16);
        }
    }

    public abstract boolean check(Object obj);

    public static Credential getCredential(String str) {
        if (str.startsWith(Crypt.__TYPE)) {
            return new Crypt(str);
        }
        return str.startsWith(MD5.__TYPE) ? new MD5(str) : new Password(str);
    }
}
