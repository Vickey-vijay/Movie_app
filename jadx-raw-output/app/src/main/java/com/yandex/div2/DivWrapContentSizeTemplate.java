package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivWrapContentSizeTemplate.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivWrapContentSizeTemplate implements JSONSerializable, JsonTemplate<DivWrapContentSize> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f50129d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivWrapContentSizeTemplate> f50130e = new bk.p<ParsingEnvironment, JSONObject, DivWrapContentSizeTemplate>() { // from class: com.yandex.div2.DivWrapContentSizeTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivWrapContentSizeTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new DivWrapContentSizeTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<Expression<Boolean>> f50131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<DivSizeUnitValueTemplate> f50132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<DivSizeUnitValueTemplate> f50133c;

    /* JADX INFO: compiled from: DivWrapContentSizeTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivWrapContentSizeTemplate(Field<Expression<Boolean>> field, Field<DivSizeUnitValueTemplate> field2, Field<DivSizeUnitValueTemplate> field3) {
        this.f50131a = field;
        this.f50132b = field2;
        this.f50133c = field3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().A9().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivWrapContentSizeTemplate(ParsingEnvironment parsingEnvironment, DivWrapContentSizeTemplate divWrapContentSizeTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divWrapContentSizeTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivWrapContentSizeTemplate(ParsingEnvironment parsingEnvironment, DivWrapContentSizeTemplate divWrapContentSizeTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
