package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivRoundedRectangleShapeTemplate.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivRoundedRectangleShapeTemplate implements JSONSerializable, JsonTemplate<DivRoundedRectangleShape> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f48521f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final DivFixedSize f48522g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final DivFixedSize f48523h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final DivFixedSize f48524i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivRoundedRectangleShapeTemplate> f48525j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<Expression<Integer>> f48526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<DivFixedSizeTemplate> f48527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<DivFixedSizeTemplate> f48528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field<DivFixedSizeTemplate> f48529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field<DivStrokeTemplate> f48530e;

    /* JADX INFO: compiled from: DivRoundedRectangleShapeTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivRoundedRectangleShapeTemplate(Field<Expression<Integer>> field, Field<DivFixedSizeTemplate> field2, Field<DivFixedSizeTemplate> field3, Field<DivFixedSizeTemplate> field4, Field<DivStrokeTemplate> field5) {
        this.f48526a = field;
        this.f48527b = field2;
        this.f48528c = field3;
        this.f48529d = field4;
        this.f48530e = field5;
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f48522g = new DivFixedSize(null, Expression.Companion.constant$default(companion, 5L, null, 2, null), 1, null);
        f48523h = new DivFixedSize(null, Expression.Companion.constant$default(companion, 10L, null, 2, null), 1, null);
        f48524i = new DivFixedSize(null, Expression.Companion.constant$default(companion, 10L, null, 2, null), 1, null);
        f48525j = new bk.p<ParsingEnvironment, JSONObject, DivRoundedRectangleShapeTemplate>() { // from class: com.yandex.div2.DivRoundedRectangleShapeTemplate$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivRoundedRectangleShapeTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return new DivRoundedRectangleShapeTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().y6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivRoundedRectangleShapeTemplate(ParsingEnvironment parsingEnvironment, DivRoundedRectangleShapeTemplate divRoundedRectangleShapeTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divRoundedRectangleShapeTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivRoundedRectangleShapeTemplate(ParsingEnvironment parsingEnvironment, DivRoundedRectangleShapeTemplate divRoundedRectangleShapeTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
