package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivStretchIndicatorItemPlacementTemplate.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class DivStretchIndicatorItemPlacementTemplate implements JSONSerializable, JsonTemplate<DivStretchIndicatorItemPlacement> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f49120c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final DivFixedSize f49121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Expression<Long> f49122e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivStretchIndicatorItemPlacementTemplate> f49123f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<DivFixedSizeTemplate> f49124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<Expression<Long>> f49125b;

    /* JADX INFO: compiled from: DivStretchIndicatorItemPlacementTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivStretchIndicatorItemPlacementTemplate(Field<DivFixedSizeTemplate> field, Field<Expression<Long>> field2) {
        this.f49124a = field;
        this.f49125b = field2;
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f49121d = new DivFixedSize(null, Expression.Companion.constant$default(companion, 5L, null, 2, null), 1, null);
        f49122e = Expression.Companion.constant$default(companion, 10L, null, 2, null);
        f49123f = new bk.p<ParsingEnvironment, JSONObject, DivStretchIndicatorItemPlacementTemplate>() { // from class: com.yandex.div2.DivStretchIndicatorItemPlacementTemplate$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivStretchIndicatorItemPlacementTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return new DivStretchIndicatorItemPlacementTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().A7().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivStretchIndicatorItemPlacementTemplate(ParsingEnvironment parsingEnvironment, DivStretchIndicatorItemPlacementTemplate divStretchIndicatorItemPlacementTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divStretchIndicatorItemPlacementTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivStretchIndicatorItemPlacementTemplate(ParsingEnvironment parsingEnvironment, DivStretchIndicatorItemPlacementTemplate divStretchIndicatorItemPlacementTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
