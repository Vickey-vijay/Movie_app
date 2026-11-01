package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivDefaultIndicatorItemPlacementTemplate.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivDefaultIndicatorItemPlacementTemplate implements JSONSerializable, JsonTemplate<DivDefaultIndicatorItemPlacement> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f46975b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final DivFixedSize f46976c = new DivFixedSize(null, Expression.Companion.constant$default(Expression.Companion, 15L, null, 2, null), 1, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivDefaultIndicatorItemPlacementTemplate> f46977d = new bk.p<ParsingEnvironment, JSONObject, DivDefaultIndicatorItemPlacementTemplate>() { // from class: com.yandex.div2.DivDefaultIndicatorItemPlacementTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivDefaultIndicatorItemPlacementTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new DivDefaultIndicatorItemPlacementTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<DivFixedSizeTemplate> f46978a;

    /* JADX INFO: compiled from: DivDefaultIndicatorItemPlacementTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivDefaultIndicatorItemPlacementTemplate(Field<DivFixedSizeTemplate> field) {
        this.f46978a = field;
    }

    public /* synthetic */ DivDefaultIndicatorItemPlacementTemplate(ParsingEnvironment parsingEnvironment, DivDefaultIndicatorItemPlacementTemplate divDefaultIndicatorItemPlacementTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divDefaultIndicatorItemPlacementTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().K2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public DivDefaultIndicatorItemPlacementTemplate(ParsingEnvironment parsingEnvironment, DivDefaultIndicatorItemPlacementTemplate divDefaultIndicatorItemPlacementTemplate, boolean z10, JSONObject jSONObject) {
        this(Field.Companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
