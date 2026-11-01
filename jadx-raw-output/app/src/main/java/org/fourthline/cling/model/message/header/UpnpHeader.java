package org.fourthline.cling.model.message.header;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import tn.a;
import tn.a0;
import tn.b;
import tn.b0;
import tn.c;
import tn.c0;
import tn.d;
import tn.d0;
import tn.e;
import tn.e0;
import tn.f;
import tn.g;
import tn.h;
import tn.i;
import tn.j;
import tn.k;
import tn.l;
import tn.m;
import tn.n;
import tn.o;
import tn.p;
import tn.q;
import tn.r;
import tn.s;
import tn.t;
import tn.u;
import tn.v;
import tn.w;
import tn.x;
import tn.y;
import tn.z;

/* JADX INFO: loaded from: classes8.dex */
public abstract class UpnpHeader<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f65775b = Logger.getLogger(UpnpHeader.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T f65776a;

    public enum Type {
        USN("USN", d0.class, f.class, w.class, c0.class),
        NT("NT", s.class, a0.class, b0.class, e.class, v.class, c0.class, o.class),
        NTS("NTS", p.class),
        HOST("HOST", i.class),
        SERVER("SERVER", u.class),
        LOCATION("LOCATION", k.class),
        MAX_AGE("CACHE-CONTROL", n.class),
        USER_AGENT("USER-AGENT", e0.class),
        CONTENT_TYPE("CONTENT-TYPE", d.class),
        MAN("MAN", l.class),
        MX("MX", m.class),
        ST("ST", t.class, s.class, a0.class, b0.class, e.class, v.class, c0.class),
        EXT("EXT", g.class),
        SOAPACTION("SOAPACTION", x.class),
        TIMEOUT("TIMEOUT", z.class),
        CALLBACK("CALLBACK", b.class),
        SID("SID", y.class),
        SEQ("SEQ", h.class),
        RANGE("RANGE", r.class),
        CONTENT_RANGE("CONTENT-RANGE", c.class),
        PRAGMA("PRAGMA", q.class),
        EXT_IFACE_MAC("X-CLING-IFACE-MAC", j.class),
        EXT_AV_CLIENT_INFO("X-AV-CLIENT-INFO", a.class);


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static Map<String, Type> f65777b = new HashMap<String, Type>() { // from class: org.fourthline.cling.model.message.header.UpnpHeader.Type.1
            {
                for (Type type : Type.values()) {
                    put(type.getHttpName(), type);
                }
            }
        };
        private Class<? extends UpnpHeader>[] headerTypes;
        private String httpName;

        public static Type getByHttpName(String str) {
            if (str == null) {
                return null;
            }
            return f65777b.get(str.toUpperCase(Locale.ROOT));
        }

        public Class<? extends UpnpHeader>[] getHeaderTypes() {
            return this.headerTypes;
        }

        public String getHttpName() {
            return this.httpName;
        }

        @SafeVarargs
        Type(String str, Class... clsArr) {
            this.httpName = str;
            this.headerTypes = clsArr;
        }

        public boolean isValidHeaderType(Class<? extends UpnpHeader> cls) {
            for (Class<? extends UpnpHeader> cls2 : getHeaderTypes()) {
                if (cls2.isAssignableFrom(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static UpnpHeader c(Type type, String str) {
        UpnpHeader upnpHeaderNewInstance;
        Exception e10;
        UpnpHeader upnpHeader = null;
        for (int i10 = 0; i10 < type.getHeaderTypes().length && upnpHeader == null; i10++) {
            Class<? extends UpnpHeader> cls = type.getHeaderTypes()[i10];
            try {
                try {
                    f65775b.finest("Trying to parse '" + type + "' with class: " + cls.getSimpleName());
                    upnpHeaderNewInstance = cls.newInstance();
                    if (str != null) {
                        try {
                            upnpHeaderNewInstance.d(str);
                        } catch (Exception e11) {
                            e10 = e11;
                            Logger logger = f65775b;
                            logger.severe("Error instantiating header of type '" + type + "' with value: " + str);
                            logger.log(Level.SEVERE, "Exception root cause: ", so.a.a(e10));
                        }
                    }
                } catch (InvalidHeaderException e12) {
                    f65775b.finest("Invalid header value for tested type: " + cls.getSimpleName() + " - " + e12.getMessage());
                    upnpHeader = null;
                }
            } catch (Exception e13) {
                upnpHeaderNewInstance = upnpHeader;
                e10 = e13;
            }
            upnpHeader = upnpHeaderNewInstance;
        }
        return upnpHeader;
    }

    public abstract String a();

    public abstract void d(String str) throws InvalidHeaderException;

    public T b() {
        return this.f65776a;
    }

    public void e(T t10) {
        this.f65776a = t10;
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ") '" + b() + "'";
    }
}
