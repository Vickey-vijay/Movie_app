package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: UrlValueTemplate.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class UrlValueTemplate implements JSONSerializable, JsonTemplate<UrlValue> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f50538b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, UrlValueTemplate> f50539c = new bk.p<ParsingEnvironment, JSONObject, UrlValueTemplate>() { // from class: com.yandex.div2.UrlValueTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final UrlValueTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new UrlValueTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<Expression<Uri>> f50540a;

    /* JADX INFO: compiled from: UrlValueTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public UrlValueTemplate(Field<Expression<Uri>> field) {
        this.f50540a = field;
    }

    public /* synthetic */ UrlValueTemplate(ParsingEnvironment parsingEnvironment, UrlValueTemplate urlValueTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : urlValueTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().ka().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public UrlValueTemplate(ParsingEnvironment parsingEnvironment, UrlValueTemplate urlValueTemplate, boolean z10, JSONObject jSONObject) {
        this(Field.Companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
