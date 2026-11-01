package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTextRangeBorderTemplate.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivTextRangeBorderTemplate implements JSONSerializable, JsonTemplate<DivTextRangeBorder> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f49633c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivTextRangeBorderTemplate> f49634d = new bk.p<ParsingEnvironment, JSONObject, DivTextRangeBorderTemplate>() { // from class: com.yandex.div2.DivTextRangeBorderTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivTextRangeBorderTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new DivTextRangeBorderTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<Expression<Long>> f49635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<DivStrokeTemplate> f49636b;

    /* JADX INFO: compiled from: DivTextRangeBorderTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivTextRangeBorderTemplate(Field<Expression<Long>> field, Field<DivStrokeTemplate> field2) {
        this.f49635a = field;
        this.f49636b = field2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().w8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivTextRangeBorderTemplate(ParsingEnvironment parsingEnvironment, DivTextRangeBorderTemplate divTextRangeBorderTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divTextRangeBorderTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivTextRangeBorderTemplate(ParsingEnvironment parsingEnvironment, DivTextRangeBorderTemplate divTextRangeBorderTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
