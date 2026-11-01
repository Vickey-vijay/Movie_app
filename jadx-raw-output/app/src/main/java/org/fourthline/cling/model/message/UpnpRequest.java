package org.fourthline.cling.model.message;

import com.ironsource.Z7;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import pn.d;

/* JADX INFO: loaded from: classes6.dex */
public class UpnpRequest extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Method f65764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public URI f65765c;

    public enum Method {
        GET("GET"),
        POST("POST"),
        NOTIFY("NOTIFY"),
        MSEARCH("M-SEARCH"),
        SUBSCRIBE("SUBSCRIBE"),
        UNSUBSCRIBE("UNSUBSCRIBE"),
        UNKNOWN("UNKNOWN");


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static Map<String, Method> f65766b = new HashMap<String, Method>() { // from class: org.fourthline.cling.model.message.UpnpRequest.Method.1
            {
                for (Method method : Method.values()) {
                    put(method.getHttpName(), method);
                }
            }
        };
        private String httpName;

        public static Method getByHttpName(String str) {
            if (str == null) {
                return UNKNOWN;
            }
            Method method = f65766b.get(str.toUpperCase(Locale.ROOT));
            return method != null ? method : UNKNOWN;
        }

        public String getHttpName() {
            return this.httpName;
        }

        Method(String str) {
            this.httpName = str;
        }
    }

    public UpnpRequest(Method method) {
        this.f65764b = method;
    }

    public String c() {
        return this.f65764b.getHttpName();
    }

    public Method d() {
        return this.f65764b;
    }

    public URI e() {
        return this.f65765c;
    }

    public void f(URI uri) {
        this.f65765c = uri;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c());
        if (e() != null) {
            str = Z7.f27998r + e();
        } else {
            str = "";
        }
        sb2.append(str);
        return sb2.toString();
    }

    public UpnpRequest(Method method, URI uri) {
        this.f65764b = method;
        this.f65765c = uri;
    }

    public UpnpRequest(Method method, URL url) {
        this.f65764b = method;
        if (url != null) {
            try {
                this.f65765c = url.toURI();
            } catch (URISyntaxException e10) {
                throw new IllegalArgumentException(e10);
            }
        }
    }
}
