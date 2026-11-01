package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTextRangeMaskParticlesTemplate.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivTextRangeMaskParticlesTemplate implements JSONSerializable, JsonTemplate<DivTextRangeMaskParticles> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f49681f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Expression<Double> f49682g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Expression<Boolean> f49683h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Expression<Boolean> f49684i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final DivFixedSize f49685j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivTextRangeMaskParticlesTemplate> f49686k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<Expression<Integer>> f49687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<Expression<Double>> f49688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<Expression<Boolean>> f49689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field<Expression<Boolean>> f49690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field<DivFixedSizeTemplate> f49691e;

    /* JADX INFO: compiled from: DivTextRangeMaskParticlesTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivTextRangeMaskParticlesTemplate(Field<Expression<Integer>> field, Field<Expression<Double>> field2, Field<Expression<Boolean>> field3, Field<Expression<Boolean>> field4, Field<DivFixedSizeTemplate> field5) {
        this.f49687a = field;
        this.f49688b = field2;
        this.f49689c = field3;
        this.f49690d = field4;
        this.f49691e = field5;
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f49682g = Expression.Companion.constant$default(companion, Double.valueOf(0.8d), null, 2, null);
        f49683h = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        f49684i = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f49685j = new DivFixedSize(null, Expression.Companion.constant$default(companion, 1L, null, 2, null), 1, null);
        f49686k = new bk.p<ParsingEnvironment, JSONObject, DivTextRangeMaskParticlesTemplate>() { // from class: com.yandex.div2.DivTextRangeMaskParticlesTemplate$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivTextRangeMaskParticlesTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return new DivTextRangeMaskParticlesTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().H8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivTextRangeMaskParticlesTemplate(ParsingEnvironment parsingEnvironment, DivTextRangeMaskParticlesTemplate divTextRangeMaskParticlesTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divTextRangeMaskParticlesTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivTextRangeMaskParticlesTemplate(ParsingEnvironment parsingEnvironment, DivTextRangeMaskParticlesTemplate divTextRangeMaskParticlesTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
