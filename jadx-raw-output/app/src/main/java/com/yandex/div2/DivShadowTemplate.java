package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivShadowTemplate.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivShadowTemplate implements JSONSerializable, JsonTemplate<DivShadow> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f48772e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Expression<Double> f48773f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Expression<Long> f48774g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Expression<Integer> f48775h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivShadowTemplate> f48776i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<Expression<Double>> f48777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<Expression<Long>> f48778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<Expression<Integer>> f48779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field<DivPointTemplate> f48780d;

    /* JADX INFO: compiled from: DivShadowTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivShadowTemplate(Field<Expression<Double>> field, Field<Expression<Long>> field2, Field<Expression<Integer>> field3, Field<DivPointTemplate> field4) {
        this.f48777a = field;
        this.f48778b = field2;
        this.f48779c = field3;
        this.f48780d = field4;
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f48773f = Expression.Companion.constant$default(companion, Double.valueOf(0.19d), null, 2, null);
        f48774g = Expression.Companion.constant$default(companion, 2L, null, 2, null);
        f48775h = Expression.Companion.constant$default(companion, 0, null, 2, null);
        f48776i = new bk.p<ParsingEnvironment, JSONObject, DivShadowTemplate>() { // from class: com.yandex.div2.DivShadowTemplate$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivShadowTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return new DivShadowTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().Q6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivShadowTemplate(ParsingEnvironment parsingEnvironment, DivShadowTemplate divShadowTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divShadowTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivShadowTemplate(ParsingEnvironment parsingEnvironment, DivShadowTemplate divShadowTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this((Field<Expression<Double>>) companion.nullField(false), (Field<Expression<Long>>) companion.nullField(false), (Field<Expression<Integer>>) companion.nullField(false), (Field<DivPointTemplate>) companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
