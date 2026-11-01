package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionHideTooltipTemplate.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivActionHideTooltipTemplate implements JSONSerializable, JsonTemplate<DivActionHideTooltip> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f46170b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivActionHideTooltipTemplate> f46171c = new bk.p<ParsingEnvironment, JSONObject, DivActionHideTooltipTemplate>() { // from class: com.yandex.div2.DivActionHideTooltipTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionHideTooltipTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new DivActionHideTooltipTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<Expression<String>> f46172a;

    /* JADX INFO: compiled from: DivActionHideTooltipTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivActionHideTooltipTemplate(Field<Expression<String>> field) {
        this.f46172a = field;
    }

    public /* synthetic */ DivActionHideTooltipTemplate(ParsingEnvironment parsingEnvironment, DivActionHideTooltipTemplate divActionHideTooltipTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divActionHideTooltipTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().s0().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public DivActionHideTooltipTemplate(ParsingEnvironment parsingEnvironment, DivActionHideTooltipTemplate divActionHideTooltipTemplate, boolean z10, JSONObject jSONObject) {
        this(Field.Companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
