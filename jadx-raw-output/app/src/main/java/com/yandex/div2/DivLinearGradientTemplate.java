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

/* JADX INFO: compiled from: DivLinearGradientTemplate.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivLinearGradientTemplate implements JSONSerializable, JsonTemplate<DivLinearGradient> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f48047d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Expression<Long> f48048e = Expression.Companion.constant$default(Expression.Companion, 0L, null, 2, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivLinearGradientTemplate> f48049f = new bk.p<ParsingEnvironment, JSONObject, DivLinearGradientTemplate>() { // from class: com.yandex.div2.DivLinearGradientTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivLinearGradientTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new DivLinearGradientTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<Expression<Long>> f48050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<List<ColorPointTemplate>> f48051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<ExpressionList<Integer>> f48052c;

    /* JADX INFO: compiled from: DivLinearGradientTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivLinearGradientTemplate(Field<Expression<Long>> field, Field<List<ColorPointTemplate>> field2, Field<ExpressionList<Integer>> field3) {
        this.f48050a = field;
        this.f48051b = field2;
        this.f48052c = field3;
    }

    /* JADX INFO: compiled from: DivLinearGradientTemplate.kt */
    public static final class ColorPointTemplate implements JSONSerializable, JsonTemplate<DivLinearGradient.ColorPoint> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f48053c = new a(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final bk.p<ParsingEnvironment, JSONObject, ColorPointTemplate> f48054d = new bk.p<ParsingEnvironment, JSONObject, ColorPointTemplate>() { // from class: com.yandex.div2.DivLinearGradientTemplate$ColorPointTemplate$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivLinearGradientTemplate.ColorPointTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return new DivLinearGradientTemplate.ColorPointTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Field<Expression<Integer>> f48055a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Field<Expression<Double>> f48056b;

        /* JADX INFO: compiled from: DivLinearGradientTemplate.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }
        }

        public ColorPointTemplate(Field<Expression<Integer>> field, Field<Expression<Double>> field2) {
            this.f48055a = field;
            this.f48056b = field2;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().T4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
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

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().W4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivLinearGradientTemplate(ParsingEnvironment parsingEnvironment, DivLinearGradientTemplate divLinearGradientTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divLinearGradientTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivLinearGradientTemplate(ParsingEnvironment parsingEnvironment, DivLinearGradientTemplate divLinearGradientTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
