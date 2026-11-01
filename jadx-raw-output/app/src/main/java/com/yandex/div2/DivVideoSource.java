package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivVideoSource.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class DivVideoSource implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f50033f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivVideoSource> f50034g = new bk.p<ParsingEnvironment, JSONObject, DivVideoSource>() { // from class: com.yandex.div2.DivVideoSource$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivVideoSource mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivVideoSource.f50033f.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<Long> f50035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression<String> f50036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Resolution f50037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Expression<Uri> f50038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Integer f50039e;

    /* JADX INFO: compiled from: DivVideoSource.kt */
    public static final class Resolution implements JSONSerializable, Hashable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f50040d = new a(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final bk.p<ParsingEnvironment, JSONObject, Resolution> f50041e = new bk.p<ParsingEnvironment, JSONObject, Resolution>() { // from class: com.yandex.div2.DivVideoSource$Resolution$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivVideoSource.Resolution mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return DivVideoSource.Resolution.f50040d.a(parsingEnvironment, jSONObject);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Expression<Long> f50042a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Expression<Long> f50043b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f50044c;

        public final boolean a(Resolution resolution, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
            return resolution != null && this.f50042a.evaluate(expressionResolver).longValue() == resolution.f50042a.evaluate(expressionResolver2).longValue() && this.f50043b.evaluate(expressionResolver).longValue() == resolution.f50043b.evaluate(expressionResolver2).longValue();
        }

        /* JADX INFO: compiled from: DivVideoSource.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }

            public final Resolution a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return BuiltInParserKt.getBuiltInParserComponent().t9().getValue().deserialize(parsingEnvironment, jSONObject);
            }
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f50044c;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = ck.s.b(Resolution.class).hashCode() + this.f50042a.hashCode() + this.f50043b.hashCode();
            this.f50044c = Integer.valueOf(iHashCode);
            return iHashCode;
        }

        public Resolution(Expression<Long> expression, Expression<Long> expression2) {
            this.f50042a = expression;
            this.f50043b = expression2;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().t9().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    public final boolean a(DivVideoSource divVideoSource, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        boolean zA;
        if (divVideoSource == null) {
            return false;
        }
        Expression<Long> expression = this.f50035a;
        Long lEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<Long> expression2 = divVideoSource.f50035a;
        if (!ck.p.e(lEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null) || !ck.p.e(this.f50036b.evaluate(expressionResolver), divVideoSource.f50036b.evaluate(expressionResolver2))) {
            return false;
        }
        Resolution resolution = this.f50037c;
        if (resolution != null) {
            zA = resolution.a(divVideoSource.f50037c, expressionResolver, expressionResolver2);
        } else {
            zA = divVideoSource.f50037c == null;
        }
        return zA && ck.p.e(this.f50038d.evaluate(expressionResolver), divVideoSource.f50038d.evaluate(expressionResolver2));
    }

    /* JADX INFO: compiled from: DivVideoSource.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivVideoSource a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().q9().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f50039e;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivVideoSource.class).hashCode();
        Expression<Long> expression = this.f50035a;
        int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0) + this.f50036b.hashCode();
        Resolution resolution = this.f50037c;
        int iHash = iHashCode2 + (resolution != null ? resolution.hash() : 0) + this.f50038d.hashCode();
        this.f50039e = Integer.valueOf(iHash);
        return iHash;
    }

    public DivVideoSource(Expression<Long> expression, Expression<String> expression2, Resolution resolution, Expression<Uri> expression3) {
        this.f50035a = expression;
        this.f50036b = expression2;
        this.f50037c = resolution;
        this.f50038d = expression3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().q9().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
