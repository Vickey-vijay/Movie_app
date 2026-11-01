package com.yandex.div2;

import com.ironsource.C3426d4;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTooltip.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivTooltip implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f49833m = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Expression<Boolean> f49834n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Expression<Long> f49835o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final DivTooltipMode.b f49836p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivTooltip> f49837q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DivAnimation f49838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DivAnimation f49839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression<String> f49840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Expression<Boolean> f49841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Div f49842e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Expression<Long> f49843f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f49844g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final DivTooltipMode f49845h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final DivPoint f49846i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Expression<Position> f49847j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List<DivAction> f49848k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Integer f49849l;

    /* JADX INFO: compiled from: DivTooltip.kt */
    public enum Position {
        LEFT("left"),
        TOP_LEFT(C3426d4.e.f28477c),
        TOP("top"),
        TOP_RIGHT(C3426d4.e.f28476b),
        RIGHT("right"),
        BOTTOM_RIGHT(C3426d4.e.f28478d),
        BOTTOM("bottom"),
        BOTTOM_LEFT(C3426d4.e.f28479e),
        CENTER("center");

        private final String value;
        public static final a Converter = new a(null);
        public static final bk.l<Position, String> TO_STRING = new bk.l<Position, String>() { // from class: com.yandex.div2.DivTooltip$Position$Converter$TO_STRING$1
            @Override // bk.l
            public final String invoke(DivTooltip.Position position) {
                return DivTooltip.Position.Converter.b(position);
            }
        };
        public static final bk.l<String, Position> FROM_STRING = new bk.l<String, Position>() { // from class: com.yandex.div2.DivTooltip$Position$Converter$FROM_STRING$1
            @Override // bk.l
            public final DivTooltip.Position invoke(String str) {
                return DivTooltip.Position.Converter.a(str);
            }
        };

        /* JADX INFO: compiled from: DivTooltip.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }

            public final Position a(String str) {
                Position position = Position.LEFT;
                if (ck.p.e(str, position.value)) {
                    return position;
                }
                Position position2 = Position.TOP_LEFT;
                if (ck.p.e(str, position2.value)) {
                    return position2;
                }
                Position position3 = Position.TOP;
                if (ck.p.e(str, position3.value)) {
                    return position3;
                }
                Position position4 = Position.TOP_RIGHT;
                if (ck.p.e(str, position4.value)) {
                    return position4;
                }
                Position position5 = Position.RIGHT;
                if (ck.p.e(str, position5.value)) {
                    return position5;
                }
                Position position6 = Position.BOTTOM_RIGHT;
                if (ck.p.e(str, position6.value)) {
                    return position6;
                }
                Position position7 = Position.BOTTOM;
                if (ck.p.e(str, position7.value)) {
                    return position7;
                }
                Position position8 = Position.BOTTOM_LEFT;
                if (ck.p.e(str, position8.value)) {
                    return position8;
                }
                Position position9 = Position.CENTER;
                if (ck.p.e(str, position9.value)) {
                    return position9;
                }
                return null;
            }

            public final String b(Position position) {
                return position.value;
            }
        }

        Position(String str) {
            this.value = str;
        }
    }

    public final boolean a(DivTooltip divTooltip, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        boolean zA;
        boolean zA2;
        boolean zA3;
        boolean z10;
        if (divTooltip == null) {
            return false;
        }
        DivAnimation divAnimation = this.f49838a;
        if (divAnimation != null) {
            zA = divAnimation.a(divTooltip.f49838a, expressionResolver, expressionResolver2);
        } else {
            zA = divTooltip.f49838a == null;
        }
        if (!zA) {
            return false;
        }
        DivAnimation divAnimation2 = this.f49839b;
        if (divAnimation2 != null) {
            zA2 = divAnimation2.a(divTooltip.f49839b, expressionResolver, expressionResolver2);
        } else {
            zA2 = divTooltip.f49839b == null;
        }
        if (!zA2) {
            return false;
        }
        Expression<String> expression = this.f49840c;
        String strEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<String> expression2 = divTooltip.f49840c;
        if (!ck.p.e(strEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null) || this.f49841d.evaluate(expressionResolver).booleanValue() != divTooltip.f49841d.evaluate(expressionResolver2).booleanValue() || !this.f49842e.a(divTooltip.f49842e, expressionResolver, expressionResolver2) || this.f49843f.evaluate(expressionResolver).longValue() != divTooltip.f49843f.evaluate(expressionResolver2).longValue() || !ck.p.e(this.f49844g, divTooltip.f49844g) || !this.f49845h.a(divTooltip.f49845h, expressionResolver, expressionResolver2)) {
            return false;
        }
        DivPoint divPoint = this.f49846i;
        if (divPoint != null) {
            zA3 = divPoint.a(divTooltip.f49846i, expressionResolver, expressionResolver2);
        } else {
            zA3 = divTooltip.f49846i == null;
        }
        if (!zA3 || this.f49847j.evaluate(expressionResolver) != divTooltip.f49847j.evaluate(expressionResolver2)) {
            return false;
        }
        List<DivAction> list = this.f49848k;
        List<DivAction> list2 = divTooltip.f49848k;
        if (list == null) {
            z10 = list2 == null;
        } else {
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
        }
        return z10;
    }

    /* JADX INFO: compiled from: DivTooltip.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivTooltip a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().P8().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f49834n = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f49835o = Expression.Companion.constant$default(companion, 5000L, null, 2, null);
        f49836p = new DivTooltipMode.b(new DivTooltipModeModal());
        f49837q = new bk.p<ParsingEnvironment, JSONObject, DivTooltip>() { // from class: com.yandex.div2.DivTooltip$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivTooltip mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return DivTooltip.f49833m.a(parsingEnvironment, jSONObject);
            }
        };
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f49849l;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivTooltip.class).hashCode();
        DivAnimation divAnimation = this.f49838a;
        int iHash = 0;
        int iHash2 = iHashCode + (divAnimation != null ? divAnimation.hash() : 0);
        DivAnimation divAnimation2 = this.f49839b;
        int iHash3 = iHash2 + (divAnimation2 != null ? divAnimation2.hash() : 0);
        Expression<String> expression = this.f49840c;
        int iHashCode2 = iHash3 + (expression != null ? expression.hashCode() : 0) + this.f49841d.hashCode() + this.f49842e.hash() + this.f49843f.hashCode() + this.f49844g.hashCode() + this.f49845h.hash();
        DivPoint divPoint = this.f49846i;
        int iHash4 = iHashCode2 + (divPoint != null ? divPoint.hash() : 0) + this.f49847j.hashCode();
        List<DivAction> list = this.f49848k;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                iHash += ((DivAction) it.next()).hash();
            }
        }
        int i10 = iHash4 + iHash;
        this.f49849l = Integer.valueOf(i10);
        return i10;
    }

    public DivTooltip(DivAnimation divAnimation, DivAnimation divAnimation2, Expression<String> expression, Expression<Boolean> expression2, Div div, Expression<Long> expression3, String str, DivTooltipMode divTooltipMode, DivPoint divPoint, Expression<Position> expression4, List<DivAction> list) {
        this.f49838a = divAnimation;
        this.f49839b = divAnimation2;
        this.f49840c = expression;
        this.f49841d = expression2;
        this.f49842e = div;
        this.f49843f = expression3;
        this.f49844g = str;
        this.f49845h = divTooltipMode;
        this.f49846i = divPoint;
        this.f49847j = expression4;
        this.f49848k = list;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().P8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
