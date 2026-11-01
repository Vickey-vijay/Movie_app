package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivAccessibility.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivAccessibility implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f45992i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Expression<Mode> f45993j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Expression<Boolean> f45994k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Type f45995l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivAccessibility> f45996m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<String> f45997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression<String> f45998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression<Boolean> f45999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Expression<Mode> f46000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Expression<Boolean> f46001e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Expression<String> f46002f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Type f46003g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f46004h;

    /* JADX INFO: compiled from: DivAccessibility.kt */
    public enum Mode {
        DEFAULT("default"),
        MERGE("merge"),
        EXCLUDE("exclude");

        private final String value;
        public static final a Converter = new a(null);
        public static final bk.l<Mode, String> TO_STRING = new bk.l<Mode, String>() { // from class: com.yandex.div2.DivAccessibility$Mode$Converter$TO_STRING$1
            @Override // bk.l
            public final String invoke(DivAccessibility.Mode mode) {
                return DivAccessibility.Mode.Converter.b(mode);
            }
        };
        public static final bk.l<String, Mode> FROM_STRING = new bk.l<String, Mode>() { // from class: com.yandex.div2.DivAccessibility$Mode$Converter$FROM_STRING$1
            @Override // bk.l
            public final DivAccessibility.Mode invoke(String str) {
                return DivAccessibility.Mode.Converter.a(str);
            }
        };

        /* JADX INFO: compiled from: DivAccessibility.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }

            public final Mode a(String str) {
                Mode mode = Mode.DEFAULT;
                if (ck.p.e(str, mode.value)) {
                    return mode;
                }
                Mode mode2 = Mode.MERGE;
                if (ck.p.e(str, mode2.value)) {
                    return mode2;
                }
                Mode mode3 = Mode.EXCLUDE;
                if (ck.p.e(str, mode3.value)) {
                    return mode3;
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

    /* JADX INFO: compiled from: DivAccessibility.kt */
    public enum Type {
        NONE("none"),
        BUTTON("button"),
        IMAGE("image"),
        TEXT("text"),
        EDIT_TEXT("edit_text"),
        HEADER("header"),
        TAB_BAR("tab_bar"),
        LIST("list"),
        SELECT("select"),
        CHECKBOX("checkbox"),
        RADIO("radio"),
        AUTO("auto");

        private final String value;
        public static final a Converter = new a(null);
        public static final bk.l<Type, String> TO_STRING = new bk.l<Type, String>() { // from class: com.yandex.div2.DivAccessibility$Type$Converter$TO_STRING$1
            @Override // bk.l
            public final String invoke(DivAccessibility.Type type) {
                return DivAccessibility.Type.Converter.b(type);
            }
        };
        public static final bk.l<String, Type> FROM_STRING = new bk.l<String, Type>() { // from class: com.yandex.div2.DivAccessibility$Type$Converter$FROM_STRING$1
            @Override // bk.l
            public final DivAccessibility.Type invoke(String str) {
                return DivAccessibility.Type.Converter.a(str);
            }
        };

        /* JADX INFO: compiled from: DivAccessibility.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }

            public final Type a(String str) {
                Type type = Type.NONE;
                if (ck.p.e(str, type.value)) {
                    return type;
                }
                Type type2 = Type.BUTTON;
                if (ck.p.e(str, type2.value)) {
                    return type2;
                }
                Type type3 = Type.IMAGE;
                if (ck.p.e(str, type3.value)) {
                    return type3;
                }
                Type type4 = Type.TEXT;
                if (ck.p.e(str, type4.value)) {
                    return type4;
                }
                Type type5 = Type.EDIT_TEXT;
                if (ck.p.e(str, type5.value)) {
                    return type5;
                }
                Type type6 = Type.HEADER;
                if (ck.p.e(str, type6.value)) {
                    return type6;
                }
                Type type7 = Type.TAB_BAR;
                if (ck.p.e(str, type7.value)) {
                    return type7;
                }
                Type type8 = Type.LIST;
                if (ck.p.e(str, type8.value)) {
                    return type8;
                }
                Type type9 = Type.SELECT;
                if (ck.p.e(str, type9.value)) {
                    return type9;
                }
                Type type10 = Type.CHECKBOX;
                if (ck.p.e(str, type10.value)) {
                    return type10;
                }
                Type type11 = Type.RADIO;
                if (ck.p.e(str, type11.value)) {
                    return type11;
                }
                Type type12 = Type.AUTO;
                if (ck.p.e(str, type12.value)) {
                    return type12;
                }
                return null;
            }

            public final String b(Type type) {
                return type.value;
            }
        }

        Type(String str) {
            this.value = str;
        }
    }

    public DivAccessibility() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public DivAccessibility(Expression<String> expression, Expression<String> expression2, Expression<Boolean> expression3, Expression<Mode> expression4, Expression<Boolean> expression5, Expression<String> expression6, Type type) {
        this.f45997a = expression;
        this.f45998b = expression2;
        this.f45999c = expression3;
        this.f46000d = expression4;
        this.f46001e = expression5;
        this.f46002f = expression6;
        this.f46003g = type;
    }

    public final boolean a(DivAccessibility divAccessibility, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divAccessibility == null) {
            return false;
        }
        Expression<String> expression = this.f45997a;
        String strEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<String> expression2 = divAccessibility.f45997a;
        if (!ck.p.e(strEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<String> expression3 = this.f45998b;
        String strEvaluate2 = expression3 != null ? expression3.evaluate(expressionResolver) : null;
        Expression<String> expression4 = divAccessibility.f45998b;
        if (!ck.p.e(strEvaluate2, expression4 != null ? expression4.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Boolean> expression5 = this.f45999c;
        Boolean boolEvaluate = expression5 != null ? expression5.evaluate(expressionResolver) : null;
        Expression<Boolean> expression6 = divAccessibility.f45999c;
        if (!ck.p.e(boolEvaluate, expression6 != null ? expression6.evaluate(expressionResolver2) : null) || this.f46000d.evaluate(expressionResolver) != divAccessibility.f46000d.evaluate(expressionResolver2) || this.f46001e.evaluate(expressionResolver).booleanValue() != divAccessibility.f46001e.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        Expression<String> expression7 = this.f46002f;
        String strEvaluate3 = expression7 != null ? expression7.evaluate(expressionResolver) : null;
        Expression<String> expression8 = divAccessibility.f46002f;
        return ck.p.e(strEvaluate3, expression8 != null ? expression8.evaluate(expressionResolver2) : null) && this.f46003g == divAccessibility.f46003g;
    }

    /* JADX INFO: compiled from: DivAccessibility.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivAccessibility a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().H().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f45993j = Expression.Companion.constant$default(companion, Mode.DEFAULT, null, 2, null);
        f45994k = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        f45995l = Type.AUTO;
        f45996m = new bk.p<ParsingEnvironment, JSONObject, DivAccessibility>() { // from class: com.yandex.div2.DivAccessibility$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivAccessibility mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return DivAccessibility.f45992i.a(parsingEnvironment, jSONObject);
            }
        };
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f46004h;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivAccessibility.class).hashCode();
        Expression<String> expression = this.f45997a;
        int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0);
        Expression<String> expression2 = this.f45998b;
        int iHashCode3 = iHashCode2 + (expression2 != null ? expression2.hashCode() : 0);
        Expression<Boolean> expression3 = this.f45999c;
        int iHashCode4 = iHashCode3 + (expression3 != null ? expression3.hashCode() : 0) + this.f46000d.hashCode() + this.f46001e.hashCode();
        Expression<String> expression4 = this.f46002f;
        int iHashCode5 = iHashCode4 + (expression4 != null ? expression4.hashCode() : 0) + this.f46003g.hashCode();
        this.f46004h = Integer.valueOf(iHashCode5);
        return iHashCode5;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().H().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivAccessibility(Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5, Expression expression6, Type type, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? null : expression, (i10 & 2) != 0 ? null : expression2, (i10 & 4) != 0 ? null : expression3, (i10 & 8) != 0 ? f45993j : expression4, (i10 & 16) != 0 ? f45994k : expression5, (i10 & 32) == 0 ? expression6 : null, (i10 & 64) != 0 ? f45995l : type);
    }
}
