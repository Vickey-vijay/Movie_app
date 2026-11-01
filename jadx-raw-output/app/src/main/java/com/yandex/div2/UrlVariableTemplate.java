package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: UrlVariableTemplate.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class UrlVariableTemplate implements JSONSerializable, JsonTemplate<UrlVariable> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f50546c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, UrlVariableTemplate> f50547d = new bk.p<ParsingEnvironment, JSONObject, UrlVariableTemplate>() { // from class: com.yandex.div2.UrlVariableTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final UrlVariableTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new UrlVariableTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<String> f50548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<Expression<Uri>> f50549b;

    /* JADX INFO: compiled from: UrlVariableTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public UrlVariableTemplate(Field<String> field, Field<Expression<Uri>> field2) {
        this.f50548a = field;
        this.f50549b = field2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().na().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ UrlVariableTemplate(ParsingEnvironment parsingEnvironment, UrlVariableTemplate urlVariableTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : urlVariableTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public UrlVariableTemplate(ParsingEnvironment parsingEnvironment, UrlVariableTemplate urlVariableTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
