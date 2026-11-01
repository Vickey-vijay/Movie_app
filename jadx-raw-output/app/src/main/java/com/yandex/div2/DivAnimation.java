package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivAnimation.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivAnimation implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f46429k = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Expression<Long> f46430l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Expression<DivAnimationInterpolator> f46431m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final DivCount.c f46432n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Expression<Long> f46433o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivAnimation> f46434p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<Long> f46435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression<Double> f46436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression<DivAnimationInterpolator> f46437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<DivAnimation> f46438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Expression<Name> f46439e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final DivCount f46440f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Expression<Long> f46441g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Expression<Double> f46442h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Integer f46443i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Integer f46444j;

    /* JADX INFO: compiled from: DivAnimation.kt */
    public enum Name {
        FADE("fade"),
        TRANSLATE("translate"),
        SCALE("scale"),
        NATIVE("native"),
        SET("set"),
        NO_ANIMATION("no_animation");

        private final String value;
        public static final a Converter = new a(null);
        public static final bk.l<Name, String> TO_STRING = new bk.l<Name, String>() { // from class: com.yandex.div2.DivAnimation$Name$Converter$TO_STRING$1
            @Override // bk.l
            public final String invoke(DivAnimation.Name name) {
                return DivAnimation.Name.Converter.b(name);
            }
        };
        public static final bk.l<String, Name> FROM_STRING = new bk.l<String, Name>() { // from class: com.yandex.div2.DivAnimation$Name$Converter$FROM_STRING$1
            @Override // bk.l
            public final DivAnimation.Name invoke(String str) {
                return DivAnimation.Name.Converter.a(str);
            }
        };

        /* JADX INFO: compiled from: DivAnimation.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }

            public final Name a(String str) {
                Name name = Name.FADE;
                if (ck.p.e(str, name.value)) {
                    return name;
                }
                Name name2 = Name.TRANSLATE;
                if (ck.p.e(str, name2.value)) {
                    return name2;
                }
                Name name3 = Name.SCALE;
                if (ck.p.e(str, name3.value)) {
                    return name3;
                }
                Name name4 = Name.NATIVE;
                if (ck.p.e(str, name4.value)) {
                    return name4;
                }
                Name name5 = Name.SET;
                if (ck.p.e(str, name5.value)) {
                    return name5;
                }
                Name name6 = Name.NO_ANIMATION;
                if (ck.p.e(str, name6.value)) {
                    return name6;
                }
                return null;
            }

            public final String b(Name name) {
                return name.value;
            }
        }

        Name(String str) {
            this.value = str;
        }
    }

    public DivAnimation(Expression<Long> expression, Expression<Double> expression2, Expression<DivAnimationInterpolator> expression3, List<DivAnimation> list, Expression<Name> expression4, DivCount divCount, Expression<Long> expression5, Expression<Double> expression6) {
        this.f46435a = expression;
        this.f46436b = expression2;
        this.f46437c = expression3;
        this.f46438d = list;
        this.f46439e = expression4;
        this.f46440f = divCount;
        this.f46441g = expression5;
        this.f46442h = expression6;
    }

    public final boolean a(DivAnimation divAnimation, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        boolean z10;
        if (divAnimation == null || this.f46435a.evaluate(expressionResolver).longValue() != divAnimation.f46435a.evaluate(expressionResolver2).longValue()) {
            return false;
        }
        Expression<Double> expression = this.f46436b;
        Double dEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<Double> expression2 = divAnimation.f46436b;
        if (!ck.p.b(dEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null) || this.f46437c.evaluate(expressionResolver) != divAnimation.f46437c.evaluate(expressionResolver2)) {
            return false;
        }
        List<DivAnimation> list = this.f46438d;
        if (list != null) {
            List<DivAnimation> list2 = divAnimation.f46438d;
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
                        if (((DivAnimation) next).a(list2.get(i10), expressionResolver, expressionResolver2)) {
                            i10 = i11;
                        }
                    }
                }
            }
        } else {
            z10 = divAnimation.f46438d == null;
        }
        if (!z10 || this.f46439e.evaluate(expressionResolver) != divAnimation.f46439e.evaluate(expressionResolver2) || !this.f46440f.a(divAnimation.f46440f, expressionResolver, expressionResolver2) || this.f46441g.evaluate(expressionResolver).longValue() != divAnimation.f46441g.evaluate(expressionResolver2).longValue()) {
            return false;
        }
        Expression<Double> expression3 = this.f46442h;
        Double dEvaluate2 = expression3 != null ? expression3.evaluate(expressionResolver) : null;
        Expression<Double> expression4 = divAnimation.f46442h;
        return ck.p.b(dEvaluate2, expression4 != null ? expression4.evaluate(expressionResolver2) : null);
    }

    /* JADX INFO: compiled from: DivAnimation.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivAnimation a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().q1().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f46430l = Expression.Companion.constant$default(companion, 300L, null, 2, null);
        f46431m = Expression.Companion.constant$default(companion, DivAnimationInterpolator.SPRING, null, 2, null);
        f46432n = new DivCount.c(new DivInfinityCount());
        f46433o = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f46434p = new bk.p<ParsingEnvironment, JSONObject, DivAnimation>() { // from class: com.yandex.div2.DivAnimation$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivAnimation mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return DivAnimation.f46429k.a(parsingEnvironment, jSONObject);
            }
        };
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f46444j;
        if (num != null) {
            return num.intValue();
        }
        int iPropertiesHash = propertiesHash();
        List<DivAnimation> list = this.f46438d;
        int iHash = 0;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                iHash += ((DivAnimation) it.next()).hash();
            }
        }
        int i10 = iPropertiesHash + iHash;
        this.f46444j = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.data.Hashable
    public int propertiesHash() {
        Integer num = this.f46443i;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivAnimation.class).hashCode() + this.f46435a.hashCode();
        Expression<Double> expression = this.f46436b;
        int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0) + this.f46437c.hashCode() + this.f46439e.hashCode() + this.f46440f.hash() + this.f46441g.hashCode();
        Expression<Double> expression2 = this.f46442h;
        int iHashCode3 = iHashCode2 + (expression2 != null ? expression2.hashCode() : 0);
        this.f46443i = Integer.valueOf(iHashCode3);
        return iHashCode3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().q1().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivAnimation(Expression expression, Expression expression2, Expression expression3, List list, Expression expression4, DivCount divCount, Expression expression5, Expression expression6, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? f46430l : expression, (i10 & 2) != 0 ? null : expression2, (i10 & 4) != 0 ? f46431m : expression3, (i10 & 8) != 0 ? null : list, expression4, (i10 & 32) != 0 ? f46432n : divCount, (i10 & 64) != 0 ? f46433o : expression5, (i10 & 128) != 0 ? null : expression6);
    }
}
