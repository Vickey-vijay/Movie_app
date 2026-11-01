package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import oe.f6;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivFixedLengthInputMask.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class DivFixedLengthInputMask implements JSONSerializable, Hashable, f6 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f47156f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Expression<Boolean> f47157g = Expression.Companion.constant$default(Expression.Companion, Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivFixedLengthInputMask> f47158h = new bk.p<ParsingEnvironment, JSONObject, DivFixedLengthInputMask>() { // from class: com.yandex.div2.DivFixedLengthInputMask$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivFixedLengthInputMask mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivFixedLengthInputMask.f47156f.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<Boolean> f47159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression<String> f47160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<PatternElement> f47161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f47162d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Integer f47163e;

    /* JADX INFO: compiled from: DivFixedLengthInputMask.kt */
    public static final class PatternElement implements JSONSerializable, Hashable {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f47164e = new a(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final Expression<String> f47165f = Expression.Companion.constant$default(Expression.Companion, "_", null, 2, null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final bk.p<ParsingEnvironment, JSONObject, PatternElement> f47166g = new bk.p<ParsingEnvironment, JSONObject, PatternElement>() { // from class: com.yandex.div2.DivFixedLengthInputMask$PatternElement$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivFixedLengthInputMask.PatternElement mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return DivFixedLengthInputMask.PatternElement.f47164e.a(parsingEnvironment, jSONObject);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Expression<String> f47167a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Expression<String> f47168b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Expression<String> f47169c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f47170d;

        public final boolean a(PatternElement patternElement, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
            if (patternElement == null || !ck.p.e(this.f47167a.evaluate(expressionResolver), patternElement.f47167a.evaluate(expressionResolver2)) || !ck.p.e(this.f47168b.evaluate(expressionResolver), patternElement.f47168b.evaluate(expressionResolver2))) {
                return false;
            }
            Expression<String> expression = this.f47169c;
            String strEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
            Expression<String> expression2 = patternElement.f47169c;
            return ck.p.e(strEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null);
        }

        /* JADX INFO: compiled from: DivFixedLengthInputMask.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }

            public final PatternElement a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return BuiltInParserKt.getBuiltInParserComponent().t3().getValue().deserialize(parsingEnvironment, jSONObject);
            }
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f47170d;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = ck.s.b(PatternElement.class).hashCode() + this.f47167a.hashCode() + this.f47168b.hashCode();
            Expression<String> expression = this.f47169c;
            int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0);
            this.f47170d = Integer.valueOf(iHashCode2);
            return iHashCode2;
        }

        public PatternElement(Expression<String> expression, Expression<String> expression2, Expression<String> expression3) {
            this.f47167a = expression;
            this.f47168b = expression2;
            this.f47169c = expression3;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().t3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    public final boolean b(DivFixedLengthInputMask divFixedLengthInputMask, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        boolean z10;
        if (divFixedLengthInputMask == null || this.f47159a.evaluate(expressionResolver).booleanValue() != divFixedLengthInputMask.f47159a.evaluate(expressionResolver2).booleanValue() || !ck.p.e(this.f47160b.evaluate(expressionResolver), divFixedLengthInputMask.f47160b.evaluate(expressionResolver2))) {
            return false;
        }
        List<PatternElement> list = this.f47161c;
        List<PatternElement> list2 = divFixedLengthInputMask.f47161c;
        if (list.size() == list2.size()) {
            Iterator<T> it = list.iterator();
            int i10 = 0;
            while (true) {
                if (!it.hasNext()) {
                    z10 = true;
                    break;
                }
                Object next = it.next();
                int i11 = i10 + 1;
                if (i10 < 0) {
                    nj.s.u();
                }
                if (!((PatternElement) next).a(list2.get(i10), expressionResolver, expressionResolver2)) {
                    z10 = false;
                    break;
                }
                i10 = i11;
            }
        } else {
            z10 = false;
            break;
        }
        return z10 && ck.p.e(a(), divFixedLengthInputMask.a());
    }

    /* JADX INFO: compiled from: DivFixedLengthInputMask.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivFixedLengthInputMask a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().q3().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // oe.f6
    public String a() {
        return this.f47162d;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f47163e;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivFixedLengthInputMask.class).hashCode() + this.f47159a.hashCode() + this.f47160b.hashCode();
        int iHash = 0;
        Iterator<T> it = this.f47161c.iterator();
        while (it.hasNext()) {
            iHash += ((PatternElement) it.next()).hash();
        }
        int iHashCode2 = iHashCode + iHash + a().hashCode();
        this.f47163e = Integer.valueOf(iHashCode2);
        return iHashCode2;
    }

    public DivFixedLengthInputMask(Expression<Boolean> expression, Expression<String> expression2, List<PatternElement> list, String str) {
        this.f47159a = expression;
        this.f47160b = expression2;
        this.f47161c = list;
        this.f47162d = str;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().q3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
