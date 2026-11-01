package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivDefaultIndicatorItemPlacementJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f50917a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final DivFixedSize f50918b = new DivFixedSize(null, Expression.Companion.constant$default(Expression.Companion, 15L, null, 2, null), 1, null);

    /* JADX INFO: compiled from: DivDefaultIndicatorItemPlacementJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivDefaultIndicatorItemPlacementJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50919a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivDefaultIndicatorItemPlacement deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            DivFixedSize divFixedSize = (DivFixedSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "space_between_centers", this.f50919a.w3());
            if (divFixedSize == null) {
                divFixedSize = y0.f50918b;
            }
            return new DivDefaultIndicatorItemPlacement(divFixedSize);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivDefaultIndicatorItemPlacement divDefaultIndicatorItemPlacement) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "space_between_centers", divDefaultIndicatorItemPlacement.f46973a, this.f50919a.w3());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "default");
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f50919a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivDefaultIndicatorItemPlacementJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50920a;

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivDefaultIndicatorItemPlacementTemplate divDefaultIndicatorItemPlacementTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "space_between_centers", divDefaultIndicatorItemPlacementTemplate.f46978a, this.f50920a.x3());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "default");
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f50920a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivDefaultIndicatorItemPlacementTemplate deserialize(ParsingContext parsingContext, DivDefaultIndicatorItemPlacementTemplate divDefaultIndicatorItemPlacementTemplate, JSONObject jSONObject) throws ParsingException {
            Field<DivFixedSizeTemplate> field;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            if (divDefaultIndicatorItemPlacementTemplate != null) {
                field = divDefaultIndicatorItemPlacementTemplate.f46978a;
            } else {
                field = null;
            }
            return new DivDefaultIndicatorItemPlacementTemplate(JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "space_between_centers", allowPropertyOverride, field, this.f50920a.x3()));
        }
    }

    /* JADX INFO: compiled from: DivDefaultIndicatorItemPlacementJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivDefaultIndicatorItemPlacementTemplate, DivDefaultIndicatorItemPlacement> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50921a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivDefaultIndicatorItemPlacement resolve(ParsingContext parsingContext, DivDefaultIndicatorItemPlacementTemplate divDefaultIndicatorItemPlacementTemplate, JSONObject jSONObject) throws ParsingException {
            DivFixedSize divFixedSize = (DivFixedSize) JsonFieldResolver.resolveOptional(parsingContext, divDefaultIndicatorItemPlacementTemplate.f46978a, jSONObject, "space_between_centers", this.f50921a.y3(), this.f50921a.w3());
            if (divFixedSize == null) {
                divFixedSize = y0.f50918b;
            }
            return new DivDefaultIndicatorItemPlacement(divFixedSize);
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f50921a = jsonParserComponent;
        }
    }
}
