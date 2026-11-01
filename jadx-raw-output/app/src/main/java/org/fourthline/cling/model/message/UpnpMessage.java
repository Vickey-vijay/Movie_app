package org.fourthline.cling.model.message;

import com.ironsource.G5;
import java.io.UnsupportedEncodingException;
import org.fourthline.cling.model.message.header.UpnpHeader;
import pn.d;

/* JADX INFO: loaded from: classes9.dex */
public abstract class UpnpMessage<O extends d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f65757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f65758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public O f65759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public pn.c f65760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f65761e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public BodyType f65762f;

    public enum BodyType {
        STRING,
        BYTES
    }

    public UpnpMessage(UpnpMessage<O> upnpMessage) {
        this.f65757a = 1;
        this.f65758b = 0;
        this.f65760d = new pn.c();
        this.f65762f = BodyType.STRING;
        this.f65759c = (O) upnpMessage.k();
        this.f65760d = upnpMessage.j();
        this.f65761e = upnpMessage.e();
        this.f65762f = upnpMessage.g();
        this.f65757a = upnpMessage.l();
        this.f65758b = upnpMessage.m();
    }

    public void b(String str) {
        this.f65762f = BodyType.STRING;
        this.f65761e = str;
    }

    public Object e() {
        return this.f65761e;
    }

    public BodyType g() {
        return this.f65762f;
    }

    public pn.c j() {
        return this.f65760d;
    }

    public O k() {
        return this.f65759c;
    }

    public int l() {
        return this.f65757a;
    }

    public int m() {
        return this.f65758b;
    }

    public void r(BodyType bodyType, Object obj) {
        this.f65762f = bodyType;
        this.f65761e = obj;
    }

    public void s(byte[] bArr) throws UnsupportedEncodingException {
        r(BodyType.STRING, new String(bArr, h() != null ? h() : "UTF-8"));
    }

    public void t(pn.c cVar) {
        this.f65760d = cVar;
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ") " + k().toString();
    }

    public boolean c() {
        if (n() && g().equals(BodyType.STRING) && d().length() > 0) {
            return true;
        }
        return false;
    }

    public String d() {
        try {
            if (!n()) {
                return null;
            }
            if (g().equals(BodyType.STRING)) {
                String str = (String) e();
                if (str.charAt(0) == 65279) {
                    return str.substring(1);
                }
                return str;
            }
            return new String((byte[]) e(), "UTF-8");
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public byte[] f() {
        try {
            if (!n()) {
                return null;
            }
            if (g().equals(BodyType.STRING)) {
                return d().getBytes();
            }
            return (byte[]) e();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public String h() {
        tn.d dVarI = i();
        if (dVarI != null) {
            return dVarI.b().b().get(G5.M);
        }
        return null;
    }

    public tn.d i() {
        return (tn.d) j().s(UpnpHeader.Type.CONTENT_TYPE, tn.d.class);
    }

    public boolean n() {
        if (e() != null) {
            return true;
        }
        return false;
    }

    public boolean o() {
        if (j().r(UpnpHeader.Type.HOST) != null) {
            return true;
        }
        return false;
    }

    public boolean p() {
        tn.d dVarI = i();
        if (dVarI == null || dVarI.f()) {
            return true;
        }
        return false;
    }

    public boolean q() {
        tn.d dVarI = i();
        if (dVarI != null && dVarI.g()) {
            return true;
        }
        return false;
    }

    public UpnpMessage(O o10) {
        this.f65757a = 1;
        this.f65758b = 0;
        this.f65760d = new pn.c();
        this.f65762f = BodyType.STRING;
        this.f65759c = o10;
    }

    public UpnpMessage(O o10, BodyType bodyType, Object obj) {
        this.f65757a = 1;
        this.f65758b = 0;
        this.f65760d = new pn.c();
        BodyType bodyType2 = BodyType.STRING;
        this.f65759c = o10;
        this.f65762f = bodyType;
        this.f65761e = obj;
    }
}
