package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivRadialGradientTemplate.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivRadialGradientTemplate implements JSONSerializable, JsonTemplate<DivRadialGradient> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f48496f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final DivRadialGradientCenter.c f48497g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final DivRadialGradientCenter.c f48498h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final DivRadialGradientRadius.c f48499i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivRadialGradientTemplate> f48500j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<DivRadialGradientCenterTemplate> f48501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<DivRadialGradientCenterTemplate> f48502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<List<ColorPointTemplate>> f48503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field<ExpressionList<Integer>> f48504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field<DivRadialGradientRadiusTemplate> f48505e;

    /* JADX INFO: compiled from: DivRadialGradientTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivRadialGradientTemplate(Field<DivRadialGradientCenterTemplate> field, Field<DivRadialGradientCenterTemplate> field2, Field<List<ColorPointTemplate>> field3, Field<ExpressionList<Integer>> field4, Field<DivRadialGradientRadiusTemplate> field5) {
        this.f48501a = field;
        this.f48502b = field2;
        this.f48503c = field3;
        this.f48504d = field4;
        this.f48505e = field5;
    }

    /* JADX INFO: compiled from: DivRadialGradientTemplate.kt */
    public static final class ColorPointTemplate implements JSONSerializable, JsonTemplate<DivRadialGradient.ColorPoint> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f48506c = new a(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final bk.p<ParsingEnvironment, JSONObject, ColorPointTemplate> f48507d = new bk.p<ParsingEnvironment, JSONObject, ColorPointTemplate>() { // from class: com.yandex.div2.DivRadialGradientTemplate$ColorPointTemplate$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivRadialGradientTemplate.ColorPointTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return new DivRadialGradientTemplate.ColorPointTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Field<Expression<Integer>> f48508a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Field<Expression<Double>> f48509b;

        /* JADX INFO: compiled from: DivRadialGradientTemplate.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }
        }

        public ColorPointTemplate(Field<Expression<Integer>> field, Field<Expression<Double>> field2) {
            this.f48508a = field;
            this.f48509b = field2;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().g6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        public /* synthetic */ ColorPointTemplate(ParsingEnvironment parsingEnvironment, ColorPointTemplate colorPointTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
            this(parsingEnvironment, (i10 & 2) != 0 ? null : colorPointTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public ColorPointTemplate(ParsingEnvironment parsingEnvironment, ColorPointTemplate colorPointTemplate, boolean z10, JSONObject jSONObject) {
            Field.Companion companion = Field.Companion;
            this(companion.nullField(false), companion.nullField(false));
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        Double dValueOf = Double.valueOf(0.5d);
        f48497g = new DivRadialGradientCenter.c(new DivRadialGradientRelativeCenter(Expression.Companion.constant$default(companion, dValueOf, null, 2, null)));
        f48498h = new DivRadialGradientCenter.c(new DivRadialGradientRelativeCenter(Expression.Companion.constant$default(companion, dValueOf, null, 2, null)));
        f48499i = new DivRadialGradientRadius.c(new DivRadialGradientRelativeRadius(Expression.Companion.constant$default(companion, DivRadialGradientRelativeRadius.Value.FARTHEST_CORNER, null, 2, null)));
        f48500j = new bk.p<ParsingEnvironment, JSONObject, DivRadialGradientTemplate>() { // from class: com.yandex.div2.DivRadialGradientTemplate$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivRadialGradientTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return new DivRadialGradientTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().m6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivRadialGradientTemplate(ParsingEnvironment parsingEnvironment, DivRadialGradientTemplate divRadialGradientTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divRadialGradientTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivRadialGradientTemplate(ParsingEnvironment parsingEnvironment, DivRadialGradientTemplate divRadialGradientTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
