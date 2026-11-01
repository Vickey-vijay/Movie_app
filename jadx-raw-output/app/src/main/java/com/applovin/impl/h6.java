package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public abstract class h6 extends i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AppLovinAdLoadListener f7621g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final a f7622h;

    public static final class a extends s7 {
        public void a(p8 p8Var) {
            if (p8Var == null) {
                throw new IllegalArgumentException("No aggregated vast response specified");
            }
            this.f9040b.add(p8Var);
        }

        public a(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
            super(jSONObject, jSONObject2, kVar);
        }
    }

    public static final class b extends h6 {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final String f7623i;

        @Override // java.lang.Runnable
        public void run() {
            p8 p8VarB = b(this.f7623i);
            if (p8VarB != null) {
                a(p8VarB);
                return;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f7707c.b(this.f7706b, "Unable to process XML: " + this.f7623i);
            }
            c(this.f7623i);
            a(t7.XML_PARSING);
        }

        public b(String str, s7 s7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
            super(s7Var, appLovinAdLoadListener, kVar);
            this.f7623i = str;
        }
    }

    public static h6 a(JSONObject jSONObject, JSONObject jSONObject2, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        return new c(new a(jSONObject, jSONObject2, kVar), appLovinAdLoadListener, kVar);
    }

    public static final class c extends h6 {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final JSONObject f7624i;

        public c(s7 s7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
            super(s7Var, appLovinAdLoadListener, kVar);
            this.f7624i = s7Var.b();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7707c.a(this.f7706b, "Processing SDK JSON response...");
            }
            String string = JsonUtils.getString(this.f7624i, "xml", null);
            if (StringUtils.isValidString(string)) {
                if (string.length() < ((Integer) this.f7705a.a(x4.P4)).intValue()) {
                    p8 p8VarB = b(string);
                    if (p8VarB != null) {
                        a(p8VarB);
                        return;
                    }
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f7707c.b(this.f7706b, "Unable to process XML: " + string);
                    }
                    c(string);
                    a(t7.XML_PARSING);
                    return;
                }
                if (com.applovin.impl.sdk.o.a()) {
                    this.f7707c.b(this.f7706b, "VAST response is over max length");
                }
                a(t7.XML_PARSING);
                return;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f7707c.b(this.f7706b, "No VAST response received.");
            }
            a(t7.NO_WRAPPER_RESPONSE);
        }
    }

    public static final class d extends h6 {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final p8 f7625i;

        public d(p8 p8Var, s7 s7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
            super(s7Var, appLovinAdLoadListener, kVar);
            if (p8Var != null) {
                if (s7Var != null) {
                    if (appLovinAdLoadListener != null) {
                        this.f7625i = p8Var;
                        return;
                    }
                    throw new IllegalArgumentException("No callback specified.");
                }
                throw new IllegalArgumentException("No context specified.");
            }
            throw new IllegalArgumentException("No response specified.");
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7707c.a(this.f7706b, "Processing VAST Wrapper response...");
            }
            a(this.f7625i);
        }
    }

    public h6(s7 s7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskProcessVastResponse", kVar);
        if (s7Var == null) {
            throw new IllegalArgumentException("No context specified.");
        }
        this.f7621g = appLovinAdLoadListener;
        this.f7622h = (a) s7Var;
    }

    public p8 b(String str) {
        try {
            return q8.a(str, this.f7705a);
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7707c.a(this.f7706b, "Failed to process VAST response", th2);
            }
            a(t7.XML_PARSING);
            this.f7705a.D().a(this.f7706b, th2);
            return null;
        }
    }

    public void c(String str) {
        if (str == null) {
            return;
        }
        Iterator<String> it = StringUtils.getRegexMatches(StringUtils.match(str, (String) this.f7705a.a(x4.f9951i5)), 1).iterator();
        while (it.hasNext()) {
            p8 p8VarB = b("<VAST>" + it.next() + "</VAST>");
            if (p8VarB != null) {
                this.f7622h.a(p8VarB);
            }
        }
    }

    public static h6 a(String str, JSONObject jSONObject, JSONObject jSONObject2, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        return new b(str, new a(jSONObject, jSONObject2, kVar), appLovinAdLoadListener, kVar);
    }

    public static h6 a(p8 p8Var, s7 s7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        return new d(p8Var, s7Var, appLovinAdLoadListener, kVar);
    }

    public void a(p8 p8Var) {
        int iD = this.f7622h.d();
        if (com.applovin.impl.sdk.o.a()) {
            this.f7707c.a(this.f7706b, "Finished parsing XML at depth " + iD);
        }
        this.f7622h.a(p8Var);
        if (a8.b(p8Var)) {
            int iIntValue = ((Integer) this.f7705a.a(x4.Q4)).intValue();
            if (iD < iIntValue) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f7707c.a(this.f7706b, "VAST response is wrapper. Resolving...");
                }
                this.f7705a.q0().a(new p6(this.f7622h, this.f7621g, this.f7705a));
                return;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f7707c.b(this.f7706b, "Reached beyond max wrapper depth of " + iIntValue);
            }
            a(t7.WRAPPER_LIMIT_REACHED);
            return;
        }
        if (a8.a(p8Var)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7707c.a(this.f7706b, "VAST response is inline. Rendering ad...");
            }
            this.f7705a.q0().a(new k6(this.f7622h, this.f7621g, this.f7705a));
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f7707c.b(this.f7706b, "VAST response is an error");
        }
        a(t7.NO_WRAPPER_RESPONSE);
    }

    public void a(t7 t7Var) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f7707c.b(this.f7706b, "Failed to process VAST response due to VAST error code " + t7Var);
        }
        a8.a(this.f7622h, this.f7621g, t7Var, -6, this.f7705a);
    }
}
