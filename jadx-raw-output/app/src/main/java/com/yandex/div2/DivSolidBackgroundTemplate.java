package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivSolidBackgroundTemplate.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivSolidBackgroundTemplate implements JSONSerializable, JsonTemplate<DivSolidBackground> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f49008b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivSolidBackgroundTemplate> f49009c = new bk.p<ParsingEnvironment, JSONObject, DivSolidBackgroundTemplate>() { // from class: com.yandex.div2.DivSolidBackgroundTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivSolidBackgroundTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new DivSolidBackgroundTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<Expression<Integer>> f49010a;

    /* JADX INFO: compiled from: DivSolidBackgroundTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivSolidBackgroundTemplate(Field<Expression<Integer>> field) {
        this.f49010a = field;
    }

    public /* synthetic */ DivSolidBackgroundTemplate(ParsingEnvironment parsingEnvironment, DivSolidBackgroundTemplate divSolidBackgroundTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divSolidBackgroundTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().r7().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public DivSolidBackgroundTemplate(ParsingEnvironment parsingEnvironment, DivSolidBackgroundTemplate divSolidBackgroundTemplate, boolean z10, JSONObject jSONObject) {
        this(Field.Companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
