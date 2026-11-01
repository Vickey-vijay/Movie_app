package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPatchJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class v2 implements TemplateResolver<JSONObject, DivPatchTemplate.ChangeTemplate, DivPatch.Change> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50881a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivPatch.Change resolve(ParsingContext parsingContext, DivPatchTemplate.ChangeTemplate changeTemplate, JSONObject jSONObject) throws ParsingException {
        return new DivPatch.Change((String) JsonFieldResolver.resolve(parsingContext, changeTemplate.f48367a, jSONObject, "id"), JsonFieldResolver.resolveOptionalList(parsingContext, changeTemplate.f48368b, jSONObject, "items", this.f50881a.O4(), this.f50881a.M4()));
    }

    public v2(JsonParserComponent jsonParserComponent) {
        this.f50881a = jsonParserComponent;
    }
}
