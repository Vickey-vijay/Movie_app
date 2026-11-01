package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: ContentUrlTemplate.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class ContentUrlTemplate implements JSONSerializable, JsonTemplate<ContentUrl> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f45931b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, ContentUrlTemplate> f45932c = new bk.p<ParsingEnvironment, JSONObject, ContentUrlTemplate>() { // from class: com.yandex.div2.ContentUrlTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final ContentUrlTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new ContentUrlTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<Expression<Uri>> f45933a;

    /* JADX INFO: compiled from: ContentUrlTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public ContentUrlTemplate(Field<Expression<Uri>> field) {
        this.f45933a = field;
    }

    public /* synthetic */ ContentUrlTemplate(ParsingEnvironment parsingEnvironment, ContentUrlTemplate contentUrlTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : contentUrlTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().w().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public ContentUrlTemplate(ParsingEnvironment parsingEnvironment, ContentUrlTemplate contentUrlTemplate, boolean z10, JSONObject jSONObject) {
        this(Field.Companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
