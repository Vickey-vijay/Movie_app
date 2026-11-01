package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivCollectionItemBuilder.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class DivCollectionItemBuilder implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f46619e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f46620f = "it";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivCollectionItemBuilder> f46621g = new bk.p<ParsingEnvironment, JSONObject, DivCollectionItemBuilder>() { // from class: com.yandex.div2.DivCollectionItemBuilder$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivCollectionItemBuilder mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivCollectionItemBuilder.f46619e.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<JSONArray> f46622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<Prototype> f46624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f46625d;

    /* JADX INFO: compiled from: DivCollectionItemBuilder.kt */
    public static final class Prototype implements JSONSerializable, Hashable {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f46626e = new a(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final Expression<Boolean> f46627f = Expression.Companion.constant$default(Expression.Companion, Boolean.TRUE, null, 2, null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final bk.p<ParsingEnvironment, JSONObject, Prototype> f46628g = new bk.p<ParsingEnvironment, JSONObject, Prototype>() { // from class: com.yandex.div2.DivCollectionItemBuilder$Prototype$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivCollectionItemBuilder.Prototype mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return DivCollectionItemBuilder.Prototype.f46626e.a(parsingEnvironment, jSONObject);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Div f46629a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Expression<String> f46630b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Expression<Boolean> f46631c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f46632d;

        public final boolean a(Prototype prototype, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
            if (prototype == null || !this.f46629a.a(prototype.f46629a, expressionResolver, expressionResolver2)) {
                return false;
            }
            Expression<String> expression = this.f46630b;
            String strEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
            Expression<String> expression2 = prototype.f46630b;
            return ck.p.e(strEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null) && this.f46631c.evaluate(expressionResolver).booleanValue() == prototype.f46631c.evaluate(expressionResolver2).booleanValue();
        }

        /* JADX INFO: compiled from: DivCollectionItemBuilder.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }

            public final Prototype a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return BuiltInParserKt.getBuiltInParserComponent().g2().getValue().deserialize(parsingEnvironment, jSONObject);
            }
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f46632d;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = ck.s.b(Prototype.class).hashCode() + this.f46629a.hash();
            Expression<String> expression = this.f46630b;
            int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0) + this.f46631c.hashCode();
            this.f46632d = Integer.valueOf(iHashCode2);
            return iHashCode2;
        }

        public Prototype(Div div, Expression<String> expression, Expression<Boolean> expression2) {
            this.f46629a = div;
            this.f46630b = expression;
            this.f46631c = expression2;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().g2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    public final boolean a(DivCollectionItemBuilder divCollectionItemBuilder, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        boolean z10;
        if (divCollectionItemBuilder == null || !ck.p.e(this.f46622a.evaluate(expressionResolver), divCollectionItemBuilder.f46622a.evaluate(expressionResolver2)) || !ck.p.e(this.f46623b, divCollectionItemBuilder.f46623b)) {
            return false;
        }
        List<Prototype> list = this.f46624c;
        List<Prototype> list2 = divCollectionItemBuilder.f46624c;
        if (list.size() != list2.size()) {
            z10 = false;
        } else {
            Iterator<T> it = list.iterator();
            int i10 = 0;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        nj.s.u();
                    }
                    if (!((Prototype) next).a(list2.get(i10), expressionResolver, expressionResolver2)) {
                        break;
                    }
                    i10 = i11;
                } else {
                    z10 = true;
                }
            }
            z10 = false;
        }
        return z10;
    }

    /* JADX INFO: compiled from: DivCollectionItemBuilder.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivCollectionItemBuilder a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().d2().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f46625d;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivCollectionItemBuilder.class).hashCode() + this.f46622a.hashCode() + this.f46623b.hashCode();
        int iHash = 0;
        Iterator<T> it = this.f46624c.iterator();
        while (it.hasNext()) {
            iHash += ((Prototype) it.next()).hash();
        }
        int i10 = iHashCode + iHash;
        this.f46625d = Integer.valueOf(i10);
        return i10;
    }

    public DivCollectionItemBuilder(Expression<JSONArray> expression, String str, List<Prototype> list) {
        this.f46622a = expression;
        this.f46623b = str;
        this.f46624c = list;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().d2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
