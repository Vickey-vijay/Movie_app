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
/* JADX INFO: loaded from: classes9.dex */
public final class h2 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50669a;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Div deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        switch (string.hashCode()) {
            case -1349088399:
                if (string.equals("custom")) {
                    return new Div.c(this.f50669a.B2().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case -906021636:
                if (string.equals("select")) {
                    return new Div.k(this.f50669a.D6().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case -899647263:
                if (string.equals("slider")) {
                    return new Div.m(this.f50669a.h7().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case -889473228:
                if (string.equals("switch")) {
                    return new Div.o(this.f50669a.O7().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case -711999985:
                if (string.equals("indicator")) {
                    return new Div.h(this.f50669a.d4().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case -410956671:
                if (string.equals("container")) {
                    return new Div.b(this.f50669a.m2().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case -196315310:
                if (string.equals("gallery")) {
                    return new Div.d(this.f50669a.L3().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 102340:
                if (string.equals("gif")) {
                    return new Div.e(this.f50669a.O3().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 3181382:
                if (string.equals("grid")) {
                    return new Div.f(this.f50669a.R3().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 3552126:
                if (string.equals("tabs")) {
                    return new Div.p(this.f50669a.U7().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 3556653:
                if (string.equals("text")) {
                    return new Div.q(this.f50669a.p8().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 100313435:
                if (string.equals("image")) {
                    return new Div.g(this.f50669a.X3().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 100358090:
                if (string.equals("input")) {
                    return new Div.i(this.f50669a.s4().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 106426307:
                if (string.equals("pager")) {
                    return new Div.j(this.f50669a.z5().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 109757585:
                if (string.equals("state")) {
                    return new Div.n(this.f50669a.t7().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 112202875:
                if (string.equals("video")) {
                    return new Div.r(this.f50669a.n9().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 1732829925:
                if (string.equals("separator")) {
                    return new Div.l(this.f50669a.M6().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        DivTemplate divTemplate = orThrow instanceof DivTemplate ? (DivTemplate) orThrow : null;
        if (divTemplate != null) {
            return this.f50669a.O4().getValue().resolve(parsingContext, divTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, Div div) throws ParsingException {
        if (div instanceof Div.g) {
            return this.f50669a.X3().getValue().serialize(parsingContext, ((Div.g) div).c());
        }
        if (div instanceof Div.e) {
            return this.f50669a.O3().getValue().serialize(parsingContext, ((Div.e) div).c());
        }
        if (div instanceof Div.q) {
            return this.f50669a.p8().getValue().serialize(parsingContext, ((Div.q) div).c());
        }
        if (div instanceof Div.l) {
            return this.f50669a.M6().getValue().serialize(parsingContext, ((Div.l) div).c());
        }
        if (div instanceof Div.b) {
            return this.f50669a.m2().getValue().serialize(parsingContext, ((Div.b) div).c());
        }
        if (div instanceof Div.f) {
            return this.f50669a.R3().getValue().serialize(parsingContext, ((Div.f) div).c());
        }
        if (div instanceof Div.d) {
            return this.f50669a.L3().getValue().serialize(parsingContext, ((Div.d) div).c());
        }
        if (div instanceof Div.j) {
            return this.f50669a.z5().getValue().serialize(parsingContext, ((Div.j) div).c());
        }
        if (div instanceof Div.p) {
            return this.f50669a.U7().getValue().serialize(parsingContext, ((Div.p) div).c());
        }
        if (div instanceof Div.n) {
            return this.f50669a.t7().getValue().serialize(parsingContext, ((Div.n) div).c());
        }
        if (div instanceof Div.c) {
            return this.f50669a.B2().getValue().serialize(parsingContext, ((Div.c) div).c());
        }
        if (div instanceof Div.h) {
            return this.f50669a.d4().getValue().serialize(parsingContext, ((Div.h) div).c());
        }
        if (div instanceof Div.m) {
            return this.f50669a.h7().getValue().serialize(parsingContext, ((Div.m) div).c());
        }
        if (div instanceof Div.o) {
            return this.f50669a.O7().getValue().serialize(parsingContext, ((Div.o) div).c());
        }
        if (div instanceof Div.i) {
            return this.f50669a.s4().getValue().serialize(parsingContext, ((Div.i) div).c());
        }
        if (div instanceof Div.k) {
            return this.f50669a.D6().getValue().serialize(parsingContext, ((Div.k) div).c());
        }
        if (div instanceof Div.r) {
            return this.f50669a.n9().getValue().serialize(parsingContext, ((Div.r) div).c());
        }
        throw new NoWhenBranchMatchedException();
    }

    public h2(JsonParserComponent jsonParserComponent) {
        this.f50669a = jsonParserComponent;
    }
}
