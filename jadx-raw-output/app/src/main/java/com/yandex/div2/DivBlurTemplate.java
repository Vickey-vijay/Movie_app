package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivBlurTemplate.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivBlurTemplate implements JSONSerializable, JsonTemplate<DivBlur> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f46531b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivBlurTemplate> f46532c = new bk.p<ParsingEnvironment, JSONObject, DivBlurTemplate>() { // from class: com.yandex.div2.DivBlurTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivBlurTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new DivBlurTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<Expression<Long>> f46533a;

    /* JADX INFO: compiled from: DivBlurTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivBlurTemplate(Field<Expression<Long>> field) {
        this.f46533a = field;
    }

    public /* synthetic */ DivBlurTemplate(ParsingEnvironment parsingEnvironment, DivBlurTemplate divBlurTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divBlurTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().J1().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public DivBlurTemplate(ParsingEnvironment parsingEnvironment, DivBlurTemplate divBlurTemplate, boolean z10, JSONObject jSONObject) {
        this(Field.Companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
