package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class i2 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50686a;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivTemplate deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        String type;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        DivTemplate divTemplate = entityTemplate instanceof DivTemplate ? (DivTemplate) entityTemplate : null;
        if (divTemplate != null && (type = divTemplate.getType()) != null) {
            string = type;
        }
        switch (string.hashCode()) {
            case -1349088399:
                if (string.equals("custom")) {
                    return new DivTemplate.c(this.f50686a.C2().getValue().deserialize(parsingContext, (DivCustomTemplate) (divTemplate != null ? divTemplate.a() : null), jSONObject));
                }
                break;
            case -906021636:
                if (string.equals("select")) {
                    return new DivTemplate.k(this.f50686a.E6().getValue().deserialize(parsingContext, (DivSelectTemplate) (divTemplate != null ? divTemplate.a() : null), jSONObject));
                }
                break;
            case -899647263:
                if (string.equals("slider")) {
                    return new DivTemplate.m(this.f50686a.i7().getValue().deserialize(parsingContext, (DivSliderTemplate) (divTemplate != null ? divTemplate.a() : null), jSONObject));
                }
                break;
            case -889473228:
                if (string.equals("switch")) {
                    return new DivTemplate.o(this.f50686a.P7().getValue().deserialize(parsingContext, (DivSwitchTemplate) (divTemplate != null ? divTemplate.a() : null), jSONObject));
                }
                break;
            case -711999985:
                if (string.equals("indicator")) {
                    return new DivTemplate.h(this.f50686a.e4().getValue().deserialize(parsingContext, (DivIndicatorTemplate) (divTemplate != null ? divTemplate.a() : null), jSONObject));
                }
                break;
            case -410956671:
                if (string.equals("container")) {
                    return new DivTemplate.b(this.f50686a.n2().getValue().deserialize(parsingContext, (DivContainerTemplate) (divTemplate != null ? divTemplate.a() : null), jSONObject));
                }
                break;
            case -196315310:
                if (string.equals("gallery")) {
                    return new DivTemplate.d(this.f50686a.M3().getValue().deserialize(parsingContext, (DivGalleryTemplate) (divTemplate != null ? divTemplate.a() : null), jSONObject));
                }
                break;
            case 102340:
                if (string.equals("gif")) {
                    return new DivTemplate.e(this.f50686a.P3().getValue().deserialize(parsingContext, (DivGifImageTemplate) (divTemplate != null ? divTemplate.a() : null), jSONObject));
                }
                break;
            case 3181382:
                if (string.equals("grid")) {
                    return new DivTemplate.f(this.f50686a.S3().getValue().deserialize(parsingContext, (DivGridTemplate) (divTemplate != null ? divTemplate.a() : null), jSONObject));
                }
                break;
            case 3552126:
                if (string.equals("tabs")) {
                    return new DivTemplate.p(this.f50686a.V7().getValue().deserialize(parsingContext, (DivTabsTemplate) (divTemplate != null ? divTemplate.a() : null), jSONObject));
                }
                break;
            case 3556653:
                if (string.equals("text")) {
                    return new DivTemplate.q(this.f50686a.q8().getValue().deserialize(parsingContext, (DivTextTemplate) (divTemplate != null ? divTemplate.a() : null), jSONObject));
                }
                break;
            case 100313435:
                if (string.equals("image")) {
                    return new DivTemplate.g(this.f50686a.Y3().getValue().deserialize(parsingContext, (DivImageTemplate) (divTemplate != null ? divTemplate.a() : null), jSONObject));
                }
                break;
            case 100358090:
                if (string.equals("input")) {
                    return new DivTemplate.i(this.f50686a.t4().getValue().deserialize(parsingContext, (DivInputTemplate) (divTemplate != null ? divTemplate.a() : null), jSONObject));
                }
                break;
            case 106426307:
                if (string.equals("pager")) {
                    return new DivTemplate.j(this.f50686a.A5().getValue().deserialize(parsingContext, (DivPagerTemplate) (divTemplate != null ? divTemplate.a() : null), jSONObject));
                }
                break;
            case 109757585:
                if (string.equals("state")) {
                    return new DivTemplate.n(this.f50686a.u7().getValue().deserialize(parsingContext, (DivStateTemplate) (divTemplate != null ? divTemplate.a() : null), jSONObject));
                }
                break;
            case 112202875:
                if (string.equals("video")) {
                    return new DivTemplate.r(this.f50686a.o9().getValue().deserialize(parsingContext, (DivVideoTemplate) (divTemplate != null ? divTemplate.a() : null), jSONObject));
                }
                break;
            case 1732829925:
                if (string.equals("separator")) {
                    return new DivTemplate.l(this.f50686a.N6().getValue().deserialize(parsingContext, (DivSeparatorTemplate) (divTemplate != null ? divTemplate.a() : null), jSONObject));
                }
                break;
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivTemplate divTemplate) throws ParsingException {
        if (divTemplate instanceof DivTemplate.g) {
            return this.f50686a.Y3().getValue().serialize(parsingContext, ((DivTemplate.g) divTemplate).b());
        }
        if (divTemplate instanceof DivTemplate.e) {
            return this.f50686a.P3().getValue().serialize(parsingContext, ((DivTemplate.e) divTemplate).b());
        }
        if (divTemplate instanceof DivTemplate.q) {
            return this.f50686a.q8().getValue().serialize(parsingContext, ((DivTemplate.q) divTemplate).b());
        }
        if (divTemplate instanceof DivTemplate.l) {
            return this.f50686a.N6().getValue().serialize(parsingContext, ((DivTemplate.l) divTemplate).b());
        }
        if (divTemplate instanceof DivTemplate.b) {
            return this.f50686a.n2().getValue().serialize(parsingContext, ((DivTemplate.b) divTemplate).b());
        }
        if (divTemplate instanceof DivTemplate.f) {
            return this.f50686a.S3().getValue().serialize(parsingContext, ((DivTemplate.f) divTemplate).b());
        }
        if (divTemplate instanceof DivTemplate.d) {
            return this.f50686a.M3().getValue().serialize(parsingContext, ((DivTemplate.d) divTemplate).b());
        }
        if (divTemplate instanceof DivTemplate.j) {
            return this.f50686a.A5().getValue().serialize(parsingContext, ((DivTemplate.j) divTemplate).b());
        }
        if (divTemplate instanceof DivTemplate.p) {
            return this.f50686a.V7().getValue().serialize(parsingContext, ((DivTemplate.p) divTemplate).b());
        }
        if (divTemplate instanceof DivTemplate.n) {
            return this.f50686a.u7().getValue().serialize(parsingContext, ((DivTemplate.n) divTemplate).b());
        }
        if (divTemplate instanceof DivTemplate.c) {
            return this.f50686a.C2().getValue().serialize(parsingContext, ((DivTemplate.c) divTemplate).b());
        }
        if (divTemplate instanceof DivTemplate.h) {
            return this.f50686a.e4().getValue().serialize(parsingContext, ((DivTemplate.h) divTemplate).b());
        }
        if (divTemplate instanceof DivTemplate.m) {
            return this.f50686a.i7().getValue().serialize(parsingContext, ((DivTemplate.m) divTemplate).b());
        }
        if (divTemplate instanceof DivTemplate.o) {
            return this.f50686a.P7().getValue().serialize(parsingContext, ((DivTemplate.o) divTemplate).b());
        }
        if (divTemplate instanceof DivTemplate.i) {
            return this.f50686a.t4().getValue().serialize(parsingContext, ((DivTemplate.i) divTemplate).b());
        }
        if (divTemplate instanceof DivTemplate.k) {
            return this.f50686a.E6().getValue().serialize(parsingContext, ((DivTemplate.k) divTemplate).b());
        }
        if (divTemplate instanceof DivTemplate.r) {
            return this.f50686a.o9().getValue().serialize(parsingContext, ((DivTemplate.r) divTemplate).b());
        }
        throw new NoWhenBranchMatchedException();
    }

    public i2(JsonParserComponent jsonParserComponent) {
        this.f50686a = jsonParserComponent;
    }
}
