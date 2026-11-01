package com.apm.insight.l;

import com.ironsource.C3426d4;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: JSONWriter.java */
/* JADX INFO: loaded from: classes7.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Writer f6587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<a> f6588b = new ArrayList();

    private h a() throws JSONException, IOException {
        return a(a.f6589a, C3426d4.j.f28586d);
    }

    private h b() throws JSONException, IOException {
        a aVar = a.f6589a;
        return a(C3426d4.j.f28588e);
    }

    private h c() throws JSONException, IOException {
        return a(a.f6591c, com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44171d);
    }

    public final String toString() {
        return "";
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: compiled from: JSONWriter.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f6589a = new a("EMPTY_ARRAY", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f6590b = new a("NONEMPTY_ARRAY", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f6591c = new a("EMPTY_OBJECT", 2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f6592d = new a("DANGLING_KEY", 3);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f6593e = new a("NONEMPTY_OBJECT", 4);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f6594f = new a("NULL", 5);

        private a(String str, int i10) {
            super(str, i10);
        }
    }

    private h a(a aVar, String str) throws JSONException, IOException {
        f();
        this.f6588b.add(aVar);
        this.f6587a.write(str);
        return this;
    }

    private void b(String str) throws IOException {
        this.f6587a.write("\"");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '\f') {
                this.f6587a.write("\\f");
            } else if (cCharAt != '\r') {
                if (cCharAt != '\"' && cCharAt != '/' && cCharAt != '\\') {
                    switch (cCharAt) {
                        case '\b':
                            this.f6587a.write("\\b");
                            continue;
                        case '\t':
                            this.f6587a.write("\\t");
                            continue;
                        case '\n':
                            this.f6587a.write("\\n");
                            continue;
                        default:
                            if (cCharAt <= 31) {
                                this.f6587a.write(String.format("\\u%04x", Integer.valueOf(cCharAt)));
                            }
                            break;
                    }
                } else {
                    this.f6587a.write(92);
                }
                this.f6587a.write(cCharAt);
            } else {
                this.f6587a.write("\\r");
            }
        }
        this.f6587a.write("\"");
    }

    private h c(String str) throws JSONException, IOException {
        a aVarE = e();
        if (aVarE == a.f6593e) {
            this.f6587a.write(44);
        } else if (aVarE != a.f6591c) {
            throw new JSONException("Nesting problem");
        }
        a(a.f6592d);
        b(str);
        return this;
    }

    private h d() throws JSONException, IOException {
        a aVar = a.f6589a;
        return a(com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44172e);
    }

    private a e() throws JSONException {
        List<a> list = this.f6588b;
        return list.get(list.size() - 1);
    }

    private void f() throws JSONException, IOException {
        if (this.f6588b.isEmpty()) {
            return;
        }
        a aVarE = e();
        if (aVarE == a.f6589a) {
            a(a.f6590b);
            return;
        }
        if (aVarE == a.f6590b) {
            this.f6587a.write(44);
        } else if (aVarE == a.f6592d) {
            this.f6587a.write(StringUtils.PROCESS_POSTFIX_DELIMITER);
            a(a.f6593e);
        } else if (aVarE != a.f6594f) {
            throw new JSONException("Nesting problem");
        }
    }

    private h(Writer writer) {
        this.f6587a = writer;
    }

    private h a(String str) throws JSONException, IOException {
        e();
        List<a> list = this.f6588b;
        list.remove(list.size() - 1);
        this.f6587a.write(str);
        return this;
    }

    private void a(a aVar) {
        List<a> list = this.f6588b;
        list.set(list.size() - 1, aVar);
    }

    private h a(Object obj) throws JSONException, IOException {
        if (obj instanceof JSONArray) {
            a((JSONArray) obj);
            return this;
        }
        if (obj instanceof JSONObject) {
            a((JSONObject) obj);
            return this;
        }
        f();
        if (obj != null && obj != JSONObject.NULL) {
            if (obj instanceof Boolean) {
                this.f6587a.write(String.valueOf(obj));
            } else if (obj instanceof Number) {
                this.f6587a.write(JSONObject.numberToString((Number) obj));
            } else {
                b(obj.toString());
            }
        } else {
            this.f6587a.write("null");
        }
        return this;
    }

    public static void a(JSONObject jSONObject, Writer writer) throws Throwable {
        new h(writer).a(jSONObject);
        writer.flush();
    }

    public static void a(JSONArray jSONArray, Writer writer) throws Throwable {
        new h(writer).a(jSONArray);
        writer.flush();
    }

    private void a(JSONObject jSONObject) throws JSONException, IOException {
        c();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            c(next).a(jSONObject.get(next));
        }
        d();
    }

    private void a(JSONArray jSONArray) throws JSONException, IOException {
        a();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            a(jSONArray.get(i10));
        }
        b();
    }
}
