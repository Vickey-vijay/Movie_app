package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionSubmit.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DivActionSubmit implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f46278f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivActionSubmit> f46279g = new bk.p<ParsingEnvironment, JSONObject, DivActionSubmit>() { // from class: com.yandex.div2.DivActionSubmit$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionSubmit mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivActionSubmit.f46278f.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<String> f46280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<DivAction> f46281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<DivAction> f46282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Request f46283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Integer f46284e;

    /* JADX INFO: compiled from: DivActionSubmit.kt */
    public static final class Request implements JSONSerializable, Hashable {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f46285e = new a(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final Expression<Method> f46286f = Expression.Companion.constant$default(Expression.Companion, Method.POST, null, 2, null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final bk.p<ParsingEnvironment, JSONObject, Request> f46287g = new bk.p<ParsingEnvironment, JSONObject, Request>() { // from class: com.yandex.div2.DivActionSubmit$Request$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivActionSubmit.Request mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return DivActionSubmit.Request.f46285e.a(parsingEnvironment, jSONObject);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<Header> f46288a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Expression<Method> f46289b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Expression<Uri> f46290c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f46291d;

        /* JADX INFO: compiled from: DivActionSubmit.kt */
        public static final class Header implements JSONSerializable, Hashable {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final a f46292d = new a(null);

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final bk.p<ParsingEnvironment, JSONObject, Header> f46293e = new bk.p<ParsingEnvironment, JSONObject, Header>() { // from class: com.yandex.div2.DivActionSubmit$Request$Header$Companion$CREATOR$1
                @Override // bk.p
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public final DivActionSubmit.Request.Header mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                    return DivActionSubmit.Request.Header.f46292d.a(parsingEnvironment, jSONObject);
                }
            };

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Expression<String> f46294a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Expression<String> f46295b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public Integer f46296c;

            public final boolean a(Header header, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
                return header != null && ck.p.e(this.f46294a.evaluate(expressionResolver), header.f46294a.evaluate(expressionResolver2)) && ck.p.e(this.f46295b.evaluate(expressionResolver), header.f46295b.evaluate(expressionResolver2));
            }

            /* JADX INFO: compiled from: DivActionSubmit.kt */
            public static final class a {
                public a() {
                }

                public /* synthetic */ a(ck.i iVar) {
                    this();
                }

                public final Header a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                    return BuiltInParserKt.getBuiltInParserComponent().Y0().getValue().deserialize(parsingEnvironment, jSONObject);
                }
            }

            @Override // com.yandex.div.data.Hashable
            public int hash() {
                Integer num = this.f46296c;
                if (num != null) {
                    return num.intValue();
                }
                int iHashCode = ck.s.b(Header.class).hashCode() + this.f46294a.hashCode() + this.f46295b.hashCode();
                this.f46296c = Integer.valueOf(iHashCode);
                return iHashCode;
            }

            public Header(Expression<String> expression, Expression<String> expression2) {
                this.f46294a = expression;
                this.f46295b = expression2;
            }

            @Override // com.yandex.div.json.JSONSerializable
            public JSONObject writeToJSON() {
                return BuiltInParserKt.getBuiltInParserComponent().Y0().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
            }
        }

        /* JADX INFO: compiled from: DivActionSubmit.kt */
        public enum Method {
            GET("get"),
            POST("post"),
            PUT("put"),
            PATCH("patch"),
            DELETE("delete"),
            HEAD("head"),
            OPTIONS("options");

            private final String value;
            public static final a Converter = new a(null);
            public static final bk.l<Method, String> TO_STRING = new bk.l<Method, String>() { // from class: com.yandex.div2.DivActionSubmit$Request$Method$Converter$TO_STRING$1
                @Override // bk.l
                public final String invoke(DivActionSubmit.Request.Method method) {
                    return DivActionSubmit.Request.Method.Converter.b(method);
                }
            };
            public static final bk.l<String, Method> FROM_STRING = new bk.l<String, Method>() { // from class: com.yandex.div2.DivActionSubmit$Request$Method$Converter$FROM_STRING$1
                @Override // bk.l
                public final DivActionSubmit.Request.Method invoke(String str) {
                    return DivActionSubmit.Request.Method.Converter.a(str);
                }
            };

            /* JADX INFO: compiled from: DivActionSubmit.kt */
            public static final class a {
                public a() {
                }

                public /* synthetic */ a(ck.i iVar) {
                    this();
                }

                public final Method a(String str) {
                    Method method = Method.GET;
                    if (ck.p.e(str, method.value)) {
                        return method;
                    }
                    Method method2 = Method.POST;
                    if (ck.p.e(str, method2.value)) {
                        return method2;
                    }
                    Method method3 = Method.PUT;
                    if (ck.p.e(str, method3.value)) {
                        return method3;
                    }
                    Method method4 = Method.PATCH;
                    if (ck.p.e(str, method4.value)) {
                        return method4;
                    }
                    Method method5 = Method.DELETE;
                    if (ck.p.e(str, method5.value)) {
                        return method5;
                    }
                    Method method6 = Method.HEAD;
                    if (ck.p.e(str, method6.value)) {
                        return method6;
                    }
                    Method method7 = Method.OPTIONS;
                    if (ck.p.e(str, method7.value)) {
                        return method7;
                    }
                    return null;
                }

                public final String b(Method method) {
                    return method.value;
                }
            }

            Method(String str) {
                this.value = str;
            }
        }

        public final boolean a(Request request, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
            boolean z10;
            if (request == null) {
                return false;
            }
            List<Header> list = this.f46288a;
            if (list != null) {
                List<Header> list2 = request.f46288a;
                if (list2 == null) {
                    return false;
                }
                if (list.size() == list2.size()) {
                    Iterator<T> it = list.iterator();
                    int i10 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            int i11 = i10 + 1;
                            if (i10 < 0) {
                                nj.s.u();
                            }
                            if (((Header) next).a(list2.get(i10), expressionResolver, expressionResolver2)) {
                                i10 = i11;
                            }
                        }
                    }
                }
            } else {
                z10 = request.f46288a == null;
            }
            return z10 && this.f46289b.evaluate(expressionResolver) == request.f46289b.evaluate(expressionResolver2) && ck.p.e(this.f46290c.evaluate(expressionResolver), request.f46290c.evaluate(expressionResolver2));
        }

        /* JADX INFO: compiled from: DivActionSubmit.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }

            public final Request a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return BuiltInParserKt.getBuiltInParserComponent().b1().getValue().deserialize(parsingEnvironment, jSONObject);
            }
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f46291d;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = ck.s.b(Request.class).hashCode();
            List<Header> list = this.f46288a;
            int iHash = 0;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    iHash += ((Header) it.next()).hash();
                }
            }
            int iHashCode2 = iHashCode + iHash + this.f46289b.hashCode() + this.f46290c.hashCode();
            this.f46291d = Integer.valueOf(iHashCode2);
            return iHashCode2;
        }

        public Request(List<Header> list, Expression<Method> expression, Expression<Uri> expression2) {
            this.f46288a = list;
            this.f46289b = expression;
            this.f46290c = expression2;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().b1().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    public final boolean a(DivActionSubmit divActionSubmit, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        boolean z10;
        boolean z11;
        if (divActionSubmit == null || !ck.p.e(this.f46280a.evaluate(expressionResolver), divActionSubmit.f46280a.evaluate(expressionResolver2))) {
            return false;
        }
        List<DivAction> list = this.f46281b;
        if (list != null) {
            List<DivAction> list2 = divActionSubmit.f46281b;
            if (list2 == null) {
                return false;
            }
            if (list.size() == list2.size()) {
                Iterator<T> it = list.iterator();
                int i10 = 0;
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            nj.s.u();
                        }
                        if (((DivAction) next).a(list2.get(i10), expressionResolver, expressionResolver2)) {
                            i10 = i11;
                        }
                    }
                }
            }
        } else {
            z10 = divActionSubmit.f46281b == null;
        }
        if (!z10) {
            return false;
        }
        List<DivAction> list3 = this.f46282c;
        if (list3 != null) {
            List<DivAction> list4 = divActionSubmit.f46282c;
            if (list4 == null) {
                return false;
            }
            if (list3.size() == list4.size()) {
                Iterator<T> it2 = list3.iterator();
                int i12 = 0;
                while (true) {
                    if (it2.hasNext()) {
                        Object next2 = it2.next();
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            nj.s.u();
                        }
                        if (((DivAction) next2).a(list4.get(i12), expressionResolver, expressionResolver2)) {
                            i12 = i13;
                        }
                    }
                }
            }
        } else {
            z11 = divActionSubmit.f46282c == null;
        }
        return z11 && this.f46283d.a(divActionSubmit.f46283d, expressionResolver, expressionResolver2);
    }

    /* JADX INFO: compiled from: DivActionSubmit.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivActionSubmit a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().V0().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f46284e;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivActionSubmit.class).hashCode() + this.f46280a.hashCode();
        List<DivAction> list = this.f46281b;
        int iHash2 = 0;
        if (list != null) {
            Iterator<T> it = list.iterator();
            iHash = 0;
            while (it.hasNext()) {
                iHash += ((DivAction) it.next()).hash();
            }
        } else {
            iHash = 0;
        }
        int i10 = iHashCode + iHash;
        List<DivAction> list2 = this.f46282c;
        if (list2 != null) {
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                iHash2 += ((DivAction) it2.next()).hash();
            }
        }
        int iHash3 = i10 + iHash2 + this.f46283d.hash();
        this.f46284e = Integer.valueOf(iHash3);
        return iHash3;
    }

    public DivActionSubmit(Expression<String> expression, List<DivAction> list, List<DivAction> list2, Request request) {
        this.f46280a = expression;
        this.f46281b = list;
        this.f46282c = list2;
        this.f46283d = request;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().V0().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
