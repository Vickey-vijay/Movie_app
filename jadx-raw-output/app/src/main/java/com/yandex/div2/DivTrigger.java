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

/* JADX INFO: compiled from: DivTrigger.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DivTrigger implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f49912e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Expression<Mode> f49913f = Expression.Companion.constant$default(Expression.Companion, Mode.ON_CONDITION, null, 2, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivTrigger> f49914g = new bk.p<ParsingEnvironment, JSONObject, DivTrigger>() { // from class: com.yandex.div2.DivTrigger$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivTrigger mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivTrigger.f49912e.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<DivAction> f49915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression<Boolean> f49916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression<Mode> f49917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f49918d;

    /* JADX INFO: compiled from: DivTrigger.kt */
    public enum Mode {
        ON_CONDITION("on_condition"),
        ON_VARIABLE("on_variable");

        private final String value;
        public static final a Converter = new a(null);
        public static final bk.l<Mode, String> TO_STRING = new bk.l<Mode, String>() { // from class: com.yandex.div2.DivTrigger$Mode$Converter$TO_STRING$1
            @Override // bk.l
            public final String invoke(DivTrigger.Mode mode) {
                return DivTrigger.Mode.Converter.b(mode);
            }
        };
        public static final bk.l<String, Mode> FROM_STRING = new bk.l<String, Mode>() { // from class: com.yandex.div2.DivTrigger$Mode$Converter$FROM_STRING$1
            @Override // bk.l
            public final DivTrigger.Mode invoke(String str) {
                return DivTrigger.Mode.Converter.a(str);
            }
        };

        /* JADX INFO: compiled from: DivTrigger.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }

            public final Mode a(String str) {
                Mode mode = Mode.ON_CONDITION;
                if (ck.p.e(str, mode.value)) {
                    return mode;
                }
                Mode mode2 = Mode.ON_VARIABLE;
                if (ck.p.e(str, mode2.value)) {
                    return mode2;
                }
                return null;
            }

            public final String b(Mode mode) {
                return mode.value;
            }
        }

        Mode(String str) {
            this.value = str;
        }
    }

    public final boolean a(DivTrigger divTrigger, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        boolean z10;
        if (divTrigger == null) {
            return false;
        }
        List<DivAction> list = this.f49915a;
        List<DivAction> list2 = divTrigger.f49915a;
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
                if (!((DivAction) next).a(list2.get(i10), expressionResolver, expressionResolver2)) {
                    z10 = false;
                    break;
                }
                i10 = i11;
            }
        } else {
            z10 = false;
            break;
        }
        return z10 && this.f49916b.evaluate(expressionResolver).booleanValue() == divTrigger.f49916b.evaluate(expressionResolver2).booleanValue() && this.f49917c.evaluate(expressionResolver) == divTrigger.f49917c.evaluate(expressionResolver2);
    }

    /* JADX INFO: compiled from: DivTrigger.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivTrigger a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().e9().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f49918d;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivTrigger.class).hashCode();
        int iHash = 0;
        Iterator<T> it = this.f49915a.iterator();
        while (it.hasNext()) {
            iHash += ((DivAction) it.next()).hash();
        }
        int iHashCode2 = iHashCode + iHash + this.f49916b.hashCode() + this.f49917c.hashCode();
        this.f49918d = Integer.valueOf(iHashCode2);
        return iHashCode2;
    }

    public DivTrigger(List<DivAction> list, Expression<Boolean> expression, Expression<Mode> expression2) {
        this.f49915a = list;
        this.f49916b = expression;
        this.f49917c = expression2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().e9().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
